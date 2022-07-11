package main.project02;

interface WebDriver1 {
    void open();
    void close();
    String getTitle();
}

interface TakesScreenshot {
    void screenshot();
}

interface RemoteWebDriver extends WebDriver1, TakesScreenshot {
    void navigate();
}

class ChromeDriver1 implements RemoteWebDriver {

    @Override
    public void open() {
        System.out.println("Chrome browser is opened");
    }

    @Override
    public void close() {
        System.out.println("Chrome browser is closed");
    }

    @Override
    public String getTitle() {
        return "Chrome";
    }

    @Override
    public void screenshot() {
        System.out.println("Chrome takes screenshot");
    }

    @Override
    public void navigate() {
        System.out.println("Navigate to Chrome browser");
    }
}

class FireFoxDriver1 implements RemoteWebDriver {

    @Override
    public void open() {
        System.out.println("FireFox browser is opened");
    }

    @Override
    public void close() {
        System.out.println("FireFox browser is closed");
    }

    @Override
    public String getTitle() {
        return "FireFox";
    }

    @Override
    public void screenshot() {
        System.out.println("FireFox takes screenshot");
    }

    @Override
    public void navigate() {
        System.out.println("Navigate to FireFox browser");
    }
}

class SafariDriver implements RemoteWebDriver {

    @Override
    public void open() {
        System.out.println("Safari browser is opened");
    }

    @Override
    public void close() {
        System.out.println("Safari browser is closed");
    }

    @Override
    public String getTitle() {
        return "Safari";
    }

    @Override
    public void screenshot() {
        System.out.println("Safari takes screenshot");
    }

    @Override
    public void navigate() {
        System.out.println("Navigate to Safari browser");
    }
}

class Task5 {
    public static void main(String[] args) {
        RemoteWebDriver[] webDrivers = {new ChromeDriver1(), new FireFoxDriver1(), new SafariDriver()};
        for (RemoteWebDriver webDriver : webDrivers) {
            webDriver.open();
            webDriver.navigate();
            System.out.println(webDriver.getTitle());
            webDriver.screenshot();
            webDriver.close();
        }
    }

}
