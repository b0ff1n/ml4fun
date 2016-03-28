#!/usr/bin/env bash

watchify -t [ babelify --presets [ react ] ] resources/public/js/index.js -o resources/public/js/index-out.js
