package seleniumSessions;

public class AmazonTest {

	public static void main(String[] args) {

		String browser = "chrome";
		BrowserUtil br = new BrowserUtil();
		br.launchBrowser(browser);
		br.enterUrl("www.amazon.in/");

		String pageTitle = br.getPageTitle();
		if (pageTitle.contains("Amazon")) {
			System.out.println("title is correct..");
		}
		if (br.getPageUrl().contains("amazon")) {
			System.out.println("url is correct..");
		}

		br.quitBrowser();

	}

}
