@echo off
title push
echo.
set /p comment=ÇëÊäÈë±¸×¢:
git commit -m %comment%
git push soa master
pause;