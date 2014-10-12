# Android template project

This repo contains basic skeleton for Android app.
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
4. `gen_icons.sh` script to generate launcher icons from SVG using inkscape
5. Stub class CrashLogger to be used with crash reporting services (like Crashlytics, etc).
And `BuildConfig.REPORT_CRASHES` flag set for release and test local flavors.
6. `LogHelper` - taken from Google iosched app.
7. `Application` class, initializing logger and setting strict mode for dev build.
8. Proguard rule to keep your app classes and do not use obfuscation.