import 'package:flutter/material.dart';
import 'package:flutter_auth/Screens/Login/login_screen.dart';
import 'package:flutter_auth/Screens/Signup/components/background.dart';
import 'package:flutter_auth/Screens/Signup/components/or_divider.dart';
import 'package:flutter_auth/Screens/Signup/components/social_icon.dart';
import 'package:flutter_auth/components/already_have_an_account_acheck.dart';
import 'package:flutter_auth/components/rounded_button.dart';
import 'package:flutter_auth/components/rounded_input_field.dart';
import 'package:flutter_auth/components/rounded_input_field2.dart';
import 'package:flutter_auth/components/rounded_password_field.dart';
import 'package:flutter_svg/svg.dart';
import 'package:flutter_auth/constants.dart';

class Body extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    Size size = MediaQuery.of(context).size;
    return Background(
      child: SingleChildScrollView(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: <Widget>[
            Text(
              " NAV630 ",
              style: TextStyle(fontWeight: FontWeight.bold, fontSize: 40),
            ),
            SizedBox(height: size.height * 0.03),
            Text(
              "SIGNUP",
              style: TextStyle(fontWeight: FontWeight.bold),
            ),
            SizedBox(height: size.height * 0.03),
            //SvgPicture.asset(
            // "assets/icons/signup.svg",
            //height: size.height * 0.35,
            //),
            RoundedInputField(
              hintText: "User Name : ",
              onChanged: (value) {},
            ),

            RoundedInputField2(
              hintText: "Enter Your Enroll.No  : ",
              onChanged: (value) {},
            ),
            RoundedInputField2(
              hintText: "Designation :",
              onChanged: (value) {},
            ),
            RoundedPasswordField(
              onChanged: (value) {},
            ),
            RoundedInputField2(
              hintText: "Confirm Password  :",
              onChanged: (value) {},
            ),
            RoundedButton(
              text: " - SIGNUP - ",
              press: () {},
            ),
            SizedBox(height: size.height * 0.03),
            AlreadyHaveAnAccountCheck(
              login: false,
              press: () {
                Navigator.push(
                  context,
                  MaterialPageRoute(
                    builder: (context) {
                      return LoginScreen();
                    },
                  ),
                );
              },
            ),
            OrDivider(),
            //Row(
            //mainAxisAlignment: MainAxisAlignment.center,
            // children: <Widget>[
            // SocalIcon(
            // iconSrc: "assets/icons/facebook.svg",
            // press: () {},
            // ),
            // SocalIcon(
            // iconSrc: "assets/icons/twitter.svg",
            //  press: () {},
            // ),
            // SocalIcon(
            //    iconSrc: "assets/icons/google-plus.svg",
            // press: () {},
            // ),
            //],
            // )
          ],
        ),
      ),
    );
  }
}
