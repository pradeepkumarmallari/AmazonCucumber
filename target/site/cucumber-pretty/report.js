$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("cart.feature");
formatter.feature({
  "line": 1,
  "name": "Cart Functionality",
  "description": "",
  "id": "cart-functionality",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Finding Amazon firestick using search bar",
  "description": "",
  "id": "cart-functionality;finding-amazon-firestick-using-search-bar",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User has account account in Amazon site",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User opens Amazon URL using the \"https://www.amazon.in/\" in \"chrome\" browser",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Searches with \"Fire stick\" in the search bar",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Click on search button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User is able to find \"Fire TV Stick with all-new Alexa Voice Remote\" in the seach results",
  "keyword": "Then "
});
formatter.match({
  "location": "Cart.user_has_account_account_in_Amazon_site()"
});
formatter.result({
  "duration": 175651666,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.amazon.in/",
      "offset": 33
    },
    {
      "val": "chrome",
      "offset": 61
    }
  ],
  "location": "Cart.user_opens_Amazon_URL_using_the_in_browser(String,String)"
});
formatter.result({
  "duration": 14850473786,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Fire stick",
      "offset": 15
    }
  ],
  "location": "Cart.searches_with_in_the_search_bar(String)"
});
formatter.result({
  "duration": 273591717,
  "status": "passed"
});
formatter.match({
  "location": "Cart.click_on_search_button()"
});
formatter.result({
  "duration": 538247316,
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: Element \u003cspan id\u003d\"nav-search-submit-text\" class\u003d\"nav-search-submit-text nav-sprite\"\u003e...\u003c/span\u003e is not clickable at point (901, 28). Other element would receive the click: \u003cinput type\u003d\"submit\" class\u003d\"nav-input\" value\u003d\"Go\" tabindex\u003d\"10\"\u003e\n  (Session info: chrome\u003d75.0.3770.142)\n  (Driver info: chromedriver\u003d72.0.3626.7 (efcef9a3ecda02b2132af215116a03852d08b9cb),platform\u003dWindows NT 10.0.17134 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027MYLAPTOP\u0027, ip: \u0027192.168.1.4\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00279.0.1\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 72.0.3626.7 (efcef9a3ecda02..., userDataDir: C:\\Users\\MYLAPT~1\\AppData\\L...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:59250}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, proxy: Proxy(), rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unexpectedAlertBehaviour: ignore, unhandledPromptBehavior: ignore, version: 75.0.3770.142, webStorageEnabled: true}\nSession ID: 977f0ac53cb5388204d8441bd364cffb\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:488)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:84)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:564)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\r\n\tat com.sun.proxy.$Proxy22.click(Unknown Source)\r\n\tat locators.HomePage.clickOnSearchbutton(HomePage.java:63)\r\n\tat stepDefinations.Cart.click_on_search_button(Cart.java:54)\r\n\tat ✽.And Click on search button(cart.feature:7)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "Fire TV Stick with all-new Alexa Voice Remote",
      "offset": 22
    }
  ],
  "location": "Cart.user_is_able_to_find_in_the_seach_results(String)"
});
formatter.result({
  "status": "skipped"
});
});