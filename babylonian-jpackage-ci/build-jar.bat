
@echo off
setlocal
if not defined JAVA_HOME (
  echo [INFO] JAVA_HOME nie je nastavene. Pokusim sa pouzit javac z PATH.
) else (
  set PATH=%JAVA_HOME%in;%PATH%
)
if exist out rmdir /S /Q out
mkdir out
javac -d out src\sk\denis\sqrt\*.java || goto :error
pushd out
jar --create --file ..\BabylonianSqrt.jar --manifest ..\META-INF\MANIFEST.MF sk\denis\sqrt\*.class
popd
echo [OK] BabylonianSqrt.jar vytvoreny.
exit /b 0
:error
echo [FAIL] Kompilacia zlyhala.
exit /b 1
