package com.example.macaddtest;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import java.lang.*;
import java.util.concurrent.TimeUnit;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity<Public> extends AppCompatActivity {

    private int Condition =0;
    private int ACCESS_FINE_lOCATION = 2;

   // Thread T = new Thread(new GetValuesSLeep());


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("OnCreate");


        if (ContextCompat.checkSelfPermission(MainActivity.this,
                Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED) {
            Toast.makeText(MainActivity.this, "You have already granted this permission!",
                    Toast.LENGTH_SHORT).show();

            System.out.println("OnPermissionGrant");

            GetValues();

        } else {
            requestWifiStatePermission();
        }

        final Button btn1;

        btn1 = (Button) findViewById(R.id.Btn1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    System.out.println("BtnStop");
                    GetValues();
                }


        });



    }


    private void requestWifiStatePermission(){
            ActivityCompat.requestPermissions(this,
                    new String[] {Manifest.permission.ACCESS_FINE_LOCATION}, ACCESS_FINE_lOCATION);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        if (requestCode == ACCESS_FINE_lOCATION)  {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                Toast.makeText(this, "Permission GRANTED", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Permission DENIED", Toast.LENGTH_SHORT).show();
                ActivityCompat.requestPermissions(this,
                        new String[] {Manifest.permission.ACCESS_FINE_LOCATION}, ACCESS_FINE_lOCATION);
            }
        }

    }

    public void GetValues(){

        TextView TV1,TV2,TV3,TV8;
        TV1 = (TextView) findViewById(R.id.TV1);
        TV2 = (TextView) findViewById(R.id.TV2);
        TV3 = (TextView) findViewById(R.id.TV3);
        //TV8 = (TextView) findViewById(R.id.TV8);
        System.out.println("OnGetValuesIN");

        //while(Condition==0){
            System.out.println("ForTn ");

            WifiManager Wmanager = (WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE);
            WifiInfo Winfo = Wmanager.getConnectionInfo();
            String Bssid = Winfo.getBSSID();
            String Ssid = Winfo.getSSID();
            int Rssid = Winfo.getRssi();


          // T.start();


            TV1.setText(Ssid);
            TV2.setText(Bssid.toString());
            TV3.setText(String.valueOf(Rssid).toString());
            System.out.println("SSid :"+Ssid);
            System.out.println("Bssid :"+Bssid);
            System.out.println("Rssid :"+Rssid);
            System.out.println("ValuePrint,ForOut");

//            try {
//                System.out.println("SleepThreadON");
//                TimeUnit.SECONDS.sleep(2);
//                System.out.println("SleepThreadOFF");
//            } catch (InterruptedException e) {
//                TV8.setText("Exacption Occured");
//                System.out.println("ExceptionOccured");
//                e.printStackTrace();
//            }
        //}


    }



}
//
//class GetValuesSLeep extends Thread {
//
//    Thread T;
//    TextView TV8;
//
//
//    @Override
//    public void run(WifiInfo Winfo1) {
//
////        TV8 = (TextView) TV8.findViewById(R.id.TV8);
//        try {
//
//
//
//            WifiInfo Winfo = Winfo1;
//            String Bssid = Winfo.getBSSID();
//            String Ssid = Winfo.getSSID();
//            int Rssid = Winfo.getRssi();
//
//
//            System.out.println("SleepThreadON");
//            Thread.sleep(50);
//            System.out.println("SleepThreadOFF");
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//  //          TV8.setText("ExceptionOccured");
//            System.out.println("ExceptionOccured");
//        }
//
//    }
//
//}