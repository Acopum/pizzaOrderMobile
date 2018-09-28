# pizzaOrderMobile

Mobile app for ordering items through pizzaOrderServerside. Made for Android only.

## Purpose

To create a mobile application for general users that could receive product order notifications from the web application pizzaOrderServerside, and to observe Agile Development methodology.

## Repo Contents

* app
  * Contains files to build mobile application (Source files in 'src')
  * JAVA files contain code for mobile application
* gradle/wrapper
  * Wrapper files for having notifications appear when switching to the appropriate page on mobile
* Other files
  * Settings and gradle files needed for successful build in Android Studio

## Description

Agile Development methodology was deployed when developing the mobile application. The purpose of the mobile application was communication with a web backend in order to receive DB entries and data.

What was completed was a mobile application mockup that retrieved notification data for a specific user, to be displayed on an Android device (in the notification center).

The system was designed as follows:

![system](https://github.com/Acopum/pizzaOrderServerside/blob/master/reportImages/sysArch.PNG)

The mobile application made up the user component, which communicated with admin components for data retrieval only.

More information on the development of the mobile and web applications can be found with the following link:

![Further Documentation](https://github.com/Acopum/pizzaOrderServerside)
