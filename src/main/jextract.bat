@set ROOT=%~dp0..
@"%ROOT%\runtime\bin\java" %JEXTRACT_JAVA_OPTIONS% -m org.openjdk.jextract/org.openjdk.jextract.JextractTool %*
