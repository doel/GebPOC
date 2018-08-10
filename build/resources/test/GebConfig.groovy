/*
	This is the Geb configuration file.
	
	See: http://www.gebish.org/manual/current/#configuration
*/


import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.firefox.FirefoxDriver

waiting {
	timeout = 2
}

environments {
	
	// run via â€œ./gradlew chromeTestâ€�
	// See: http://code.google.com/p/selenium/wiki/ChromeDriver
	chrome {
		driver = { new ChromeDriver() }
	}

	// run via â€œ./gradlew chromeHeadlessTestâ€�
	// See: http://code.google.com/p/selenium/wiki/ChromeDriver
	/*chromeHeadless {
		driver = {
			ChromeOptions o = new ChromeOptions()
			o.addArguments('headless')
			new ChromeDriver(o)
		}
	}*/
	
	// run via â€œ./gradlew firefoxTestâ€�
	// See: http://code.google.com/p/selenium/wiki/FirefoxDriver
	firefox {
		atCheckWaiting = 1

		driver = { new FirefoxDriver() }
	}

}

// To run the tests with all browsers just run â€œ./gradlew testâ€�
baseUrl = "https://southwest.com"
reportsDir = new File("target/geb-reports")
reportOnTestFailureOnly = true

