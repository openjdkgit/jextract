jextract --source -t libffmpeg \
  -I /usr/local/Cellar/ffmpeg@4/4.4.4/include \
  -l avcodec \
  -l avformat \
  -l avutil \
  -l swscale \
  --header-class-name Libffmpeg \
  libffmpeg.h

javac --enable-preview --source=22 libffmpeg/*.java
