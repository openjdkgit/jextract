jextract --source -l tcl -t org.tcl \
   /Applications/Xcode.app/Contents/Developer/Platforms/MacOSX.platform/Developer/SDKs/MacOSX.sdk/usr/include/tcl.h

javac --enable-preview --source=22 org/tcl/*.java
