@echo off
title push
echo.
set /p comment=�����뱸ע:
git commit -m %comment%
git push soa master
pause;