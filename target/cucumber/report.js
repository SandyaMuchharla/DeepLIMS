$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 2,
  "name": "Login to gmail",
  "description": "",
  "id": "login-to-gmail",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@login"
    }
  ]
});
formatter.before({
  "duration": 2200131922,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Select an element randomly",
  "description": "",
  "id": "login-to-gmail;select-an-element-randomly",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@Smoke1"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "Navigate to \"https://edureka.co\" Site",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "User selects an element from link",
  "keyword": "When "
});
formatter.match({
  "arguments": [
    {
      "val": "https://edureka.co",
      "offset": 13
    }
  ],
  "location": "LoginStepDefs.navigateToSite(String)"
});
formatter.result({
  "duration": 4212605313,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefs.userSelectsAnElementFromLink()"
});
formatter.result({
  "duration": 30261129295,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"#c535\"}\n  (Session info: chrome\u003d80.0.3987.132)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.12.0\u0027, revision: \u00277c6e0b3\u0027, time: \u00272018-05-08T14:04:26.12Z\u0027\nSystem info: host: \u0027Raghus-MBP\u0027, ip: \u00272a02:c7f:be2f:1800:d1a:a5c:4fc3:fb63\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.12.6\u0027, java.version: \u00271.8.0_60\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: true, browserName: chrome, browserVersion: 80.0.3987.132, chrome: {chromedriverVersion: 80.0.3987.106 (f68069574609..., userDataDir: /var/folders/q3/fvjyxmln57j...}, goog:chromeOptions: {debuggerAddress: localhost:55867}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 0e54a61910b89c99df0de71bc2935265\n*** Element info: {Using\u003did, value\u003dc535}\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:422)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:543)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:317)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:363)\n\tat org.openqa.selenium.By$ById.findElement(By.java:188)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:309)\n\tat stepDefinitions.LoginStepDefs.userSelectsAnElementFromLink(LoginStepDefs.java:69)\n\tat ✽.When User selects an element from link(login.feature:14)\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.write("URL at failure  :https://www.edureka.co/");
formatter.after({
  "duration": 48267017706,
  "status": "passed"
});
