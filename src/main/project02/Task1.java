package main.project02;

interface WebDriver {
    void openBrowser();

    void closeBrowser();

    void maximizeWindow();

    void findElement();
}

class ChromeDriver implements WebDriver {

    @Override
    public void openBrowser() {
        System.out.println("Chrome browser is opened");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Chrome browser is closed");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Chrome browser's window is maximized");
    }

    @Override
    public void findElement() {
        System.out.println("Chrome browser's element is found");
    }
}

class FirefoxDriver implements WebDriver {

    @Override
    public void openBrowser() {
        System.out.println("Firefox browser is opened");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Firefox browser is closed");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Firefox browser's window is maximized");
    }

    @Override
    public void findElement() {
        System.out.println("Firefox browser's element is found");
    }
}

class Task1 {
    public static void main(String[] args) {
        WebDriver[] drivers = {new ChromeDriver(), new FirefoxDriver()};
        for (WebDriver driver : drivers) {
            driver.openBrowser();
            driver.maximizeWindow();
            driver.findElement();
            driver.closeBrowser();
        }
    }
}

