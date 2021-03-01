# NAV-630
    1.1 Project  Summary
The NAV 630. is an AR-based Indoor / Outdoor (Limited) Navigation And Direction based application for Android devices, With some extra features like Department & Faculty Information, AR based Single and multiplayer games, Mark attendance, Live Location sharing with your friends / colleagues.
 Here we use IPS (Indoor Positioning System) Technique which is a network of devices used to locate people and guide them towards the destination where GPS and other satellite technologies fail entirely, such as inside multistory buildings, airports, college/office campus and ETC.

    1.2 PURPOSE
1.2.1 GOAL
		Our vision is to create an Indoor Navigation application with the help of  RSSI to locate people with the accuracy of upto 2cm & AR to provide an interactive experience of a real-world environment with computer-generated perceptual information to enhance  user experience.


    1.3 SCOPE
Indoor Navigation
Department and Faculty Information
AR Visualization
Location Sharing

Future Scope
AR Based Games
Class/Group Attendance 
Quick Feedback/AR Notes
News Feed

    1.4 Technology and Literature Review

Augmented Reality: 
  Augmented reality (AR) is a type of interactive, reality-based display environment that takes the capabilities of computer generated display, sound, text and effects to enhance the user's real-world experience. Augmented reality combines real and computer-based scenes and images to deliver a unified but enhanced view of the world.

Received Signal Strength Indicator:
  RSSI stands for Received Signal Strength Indicator. It is an estimated measure of power level that an RF client device is receiving from an access point or router.
At larger distances, the signal gets weaker and the wireless data rates get slower, leading to a lower overall data throughput. Signal is measured by the receive signal strength indicator (RSSI), which in most cases indicates how well a particular radio can hear the remote connected client radios.

Flutter:
	Flutter is Google's SDK for crafting beautiful, fast user experiences for mobile, web, and desktop from a single codebase. Flutter works with existing code, is used by developers and organizations around the world, and is free and open source.
It is popular because of its huge features like:
Same UI and Business Logic in All Platforms
Reduced Code Development Time
Increased Time-to-Market Speed
Similar to Native App Performance
Custom, Animated UI of Any Complexity Available
Own Rendering Engine
Simple Platform-Specific Logic Implementation
The Potential Ability to Go Beyond Mobile

Android Platform:
  Android is an open source and Linux-based operating system for mobile devices such as smartphones and tablet computers. Android was developed by the Open Handset Alliance, led by Google, and other companies. This tutorial will teach you basic Android programming and will also take you through some advanced concepts related to Android application development.

Dart:
  Dart is an open-source, general-purpose, object-oriented programming language with C-style syntax developed by Google in 2011. The purpose of Dart programming is to create a frontend user interfaces for the web and mobile apps. It is under active development, compiled to native machine code for building mobile apps, inspired by other programming languages such as Java, JavaScript, C#, and is Strongly Typed. Since Dart is a compiled language so you cannot execute your code directly; instead, the compiler parses it and transfer it into machine code.

Firebase:
       Firebase is a Backend-as-a-Service (Baas). It provides developers with a variety of tools and services to help them develop quality apps, grow their user base, and earn profit. It is built on Google's infrastructure. Firebase is categorized as a NoSQL database program, which stores data in JSON-like documents.


    2.1 User Characteristics 
 
We have 3 types of user
Admin
Registered User
Non-registered User

Admin:  
  Update: Can Update/Modify object information which is visible to the user.
  Data-Base Control: Can manage and modify the Data-Base.

Registered Users: 
  There are two types of registered user-

Faculty: 
  Attendance: Can take and view attendance of the students.
  Navigation: Can Search (Set Destination , Current location) or share current Location to friend/colleague.
  Department Info: Can view the department as well as faculty information.
  Games: Can play AR based single or multiplayer games situated on campus.
 
Student:
  Attendance: Can view their attendance.
  Navigation: Can Search (Set Destination , Current location) or share current Location to friend/colleague.
  Department Info: Can view the department as well as faculty information.
  Games: Can play AR based single or multiplayer games situated on campus.
  Non-registered User: This user can use features which not required registration i.e. Search Location, Quick Feedback, Department and Faculty Information, AR Based Games etc.

    2.2 Hardware and Software Requirements 
Software Requirement :
  Requires Android 8.1 (API 27) or later / IOS 11
  IP Address
  WiFi Permissions
  
Hardware Requirement:
  The rear-facing (world) camera is emulated with a virtual scene.
  Depth Sensor: Calculates depth and distance.
  MagnetoMeter: Essentially a compass that can always tell where north is.
  Gyroscope: Detects the angle and position of your phone.
  Proximity Sensor: Measures how close and far something is.
  Accelerometer: Detects change in velocity, movement, and rotation
  The device display must be touchscreen and have a minimum resolution of 480x800.
  Minimum required space 500MB and RAM 2GB or more.


    3.1 Study of Current System
  In the past few years Firstly wherever we have to go we have to ask people around for the route, they would suggest “go to the right then left “ it was so confusing & sometimes we ended up at some different location , When the Internet became more mainstream (and before portable devices became ubiquitous) we had online services like Yahoo Maps and Mapquest. We searched for directions and got detailed step by step instructions then the navigation system were developed very much over the time which give you the barely accurate positioning/location, this is the standard system which uses your device's GPS (Global Positioning System) which locate/guide you towards your destination in real time using satellites, a receiver and algorithms to synchronize location, velocity and time data for air, sea and land travel with the fastest route possible.

    3.2 Problem and Weaknesses of Current System
	
 Ask People Around :
  In this method people ask other people around for direction / location.
	
 Disadvantages :
  This technique fails in Uncrowded/Empty places.
  People also  face language problems.
  Reach to a different/Wrong place due to Mis-Communicate.
 
 GPS : 
  In this method people use online services like ‘Yahoo Maps’ and ‘Mapquest’ to get direction towards their Location/Destination.

Disadvantages :
  Lack of Local Knowledge.
  Accuracy upto >= 7.8 m (25.5 ft) Horizontal axes 
  Privacy Issues
  Commercial Exploitation
  Driving Distraction

    3.3 Proposed system and it’s Advantages
  
  IPS :
      An indoor positioning system (IPS) is a network of devices used to locate people or objects where GPS and other satellite technologies fail entirely, such as inside multistory buildings, airports, college/office campus and ETC.

  Advantages :
    Accuracy >=2 cm
    Real Time Mapping
    Indoor Wayfinding
    Low in cost
    Easily available

  Functional requirements:
    Wifi-Access Point
    Wifi Access Point will take the coordinates of the user to locate and Visualize the information placed on that location/coordinates.
    Real Time Image
    It requires a real time image to give visualisation of the information & other details placed in the campus.

  Non-Functional requirements
    Simplify : This system simplifies the process of finding a  place bounded inside a campus.
    Security : The user data and other sensitive information were secured from unauthorised access as much as possible.
    Availability: Provider system will meet the agreed availability targets.

    3.4 Feasibility Study
  Feasibility study of GPD augmented info. are as under
  Technical Feasibility: GPD Augmented Info. is a complete mobile(android) based. The main technologies and tools are associated with GPD Augmented Info. are
  IDE : Android Studio 
  Framework : Flutter, ARCore
  Frontend : Flutter
  Backend : Core Java
  Database : Firebase
  Diagram Drawing Tools: Google Docs, Microsoft Project/G Suite
  
Each of the technologies are freely available and the technical skills required are manageable. Time limitations of the product development and the use of implementing these technologies are synchronized.
Initially the application will be published  freely on the web. For Indoor positioning system (IPS) Local area WiFi is used with quite good Bandwidth, since it's required for multimedia file transfer. The application needs smartphones/tablets with  android OS to work. In future it will be available to other smartphones/tablets based on OS such as IOS ,Windows Etc.
From these it's dear that the Application is technically feasible.

Behavioral feasibility: In GPD augmented Info. We use Flutter Framework to implement a simple and user-friendly GUI as possible with all working features. The feature of         navigation will navigate the user towards his/her destination with AR based Perceptual information at the shortest route possible.
The Feeds feature will let you share unforgettable moments as well as force the NEWS so it can reach everyone out there.
 
Implementation Feasibility: All the technologies required to implement GPD Augmented Info. were freely available and are capable of delivering a user friendly interface.
