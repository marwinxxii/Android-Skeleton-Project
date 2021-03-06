#!/bin/sh
# Converts the Inkscape icon file ic_launcher_web.svg to the launcher web & app png files.
# http://stackoverflow.com/a/22314757/905565

#PROJECT="My Project Name"
PROJECT="app"
#INPUT="source-assets/ic_launcher_web.svg"
INPUT="ic_launcher.svg"
MAIN="${PROJECT}/src/main"
DEV="${PROJECT}/src/dev"
RES="${MAIN}/res"
DRAWABLE="${RES}/drawable"

inkscape --shell <<COMMANDS
  --export-png "${MAIN}ic_launcher-web.png"         -w 512 "${INPUT}"
  --export-png "${DRAWABLE}-mdpi/ic_launcher.png"   -w  48 "${INPUT}"
  --export-png "${DRAWABLE}-hdpi/ic_launcher.png"   -w  72 "${INPUT}"
  --export-png "${DRAWABLE}-xhdpi/ic_launcher.png"  -w  96 "${INPUT}"
  --export-png "${DRAWABLE}-xxhdpi/ic_launcher.png" -w 144 "${INPUT}"
quit
COMMANDS
