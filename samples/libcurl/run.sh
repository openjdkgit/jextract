java --enable-native-access=ALL-UNNAMED \
    --enable-preview --source=19 \
    -Djava.library.path=/usr/lib CurlMain.java $*
