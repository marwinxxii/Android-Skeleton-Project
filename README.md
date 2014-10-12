# Android skeleton project

This repo contains basic skeleton project for Android app using Gradle (plugin 0.12) and IntellijIdea.
It has following features:

1. Three different flavors
 - `dev` - developers build for debugging (build it with `assembleDevDebug` command)
 - `testLocal` - build to be tested by Q&A team.
 Create local keystore for it and build it with `assembleTestLocalRelease`.
 - `prod` - build for production, uses keystore passed either as command line arguments
 (`-p"app.keystore"=`....) or in gradle.properties file.
2. Each flavor has different applicationId (result package name) so you can have all three app
types installed simultaneously on device.
3. Different icons for dev and release builds.
4. `gen_icons.sh` script to generate launcher icons from SVG image using inkscape
5. Stub class CrashLogger to be used with crash reporting services (like Crashlytics, etc).
`BuildConfig.REPORT_CRASHES` flag, determining whether log reports should be sent to service
(value set to `true` in `prod` flavor) or printed to Log (`false` in `dev`).
6. `LogHelper` - taken from [Google iosched](https://github.com/google/iosched) app.
7. `Application` class, initializing logger and setting
[strict mode](http://developer.android.com/reference/android/os/StrictMode.html) for dev build.
8. Proguard rule to keep your app classes and do not use obfuscation.

## Getting started

1. Clone this repo
2. Import project in IntellijIdea
3. Change value of `applicationId` in `app/build.gradle`
4. Change package in `AndroidManifest.xml`
5. Rename package in source code