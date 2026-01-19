
# BabylonianSqrt – Windows .exe build (jpackage)

## Lokálne (najrýchlejšie)
1. Windows + JDK 14+ (kvôli `jpackage`).
2. PowerShell v koreňovom priečinku:
   ```powershell
   .\make-exe.ps1 -AppName "BabylonianSqrt" -Vendor "Denis" -Version "1.0.0"
   ```
3. Výsledný inštalátor `.exe` nájdeš v `dist/`.

## GitHub Actions (ak nechceš nič inštalovať)
1. Nahraj tento projekt do GitHub repozitára.
2. V repozitári spusti workflow **Build Windows EXE (jpackage)** → **Run workflow**.
3. Po dobehnutí build-u stiahni artefakt `BabylonianSqrt-setup` → obsahuje `.exe`.
