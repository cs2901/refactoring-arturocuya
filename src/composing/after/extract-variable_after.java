void renderBanner() {
  final boolean isPlatformMac = platform.toUpperCase().indexOf("MAC") > -1;
  final boolean isBrowserIE = browser.toUpperCase().indexOf("IE") > -1;
  if (isPlatformMac && isBrowserIE && wasInitialized() && resize > 0 )
  {
    // do something
  }
}