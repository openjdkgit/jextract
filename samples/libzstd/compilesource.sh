jextract --source -t libzstd \
  -I "$(brew --prefix zstd)/include" \
  -l zstd \
  --header-class-name Libzstd \
  "$(brew --prefix zstd)/include/zstd.h"

javac --enable-preview --source=21 libzstd/*.java
