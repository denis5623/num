
param(
  [string]$AppName = "BabylonianSqrt",
  [string]$Vendor = "Denis",
  [string]$Version = "1.0.0"
)
cmd /c build-jar.bat
if ($LASTEXITCODE -ne 0) { exit 1 }
$jpackage = "jpackage"
$outDir = "dist"
if (Test-Path $outDir) { Remove-Item $outDir -Recurse -Force }
New-Item -ItemType Directory -Path $outDir | Out-Null
& $jpackage `
  --type exe `
  --name $AppName `
  --app-version $Version `
  --vendor $Vendor `
  --input . `
  --main-jar BabylonianSqrt.jar `
  --main-class sk.denis.sqrt.Main `
  --dest $outDir `
  --win-console
