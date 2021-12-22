package browser;

public class FactoryBrowser {

    public static IBrowser make(String typoBrowser) {
        IBrowser browser;

        switch (typoBrowser) {
            case "chrome":
                browser = new Chrome();
            case "proxy":
                browser = new ChromeProxy();
                break;
            case "firefox":
                browser = new Firefox();
            default:
                browser = new Chrome();
                break;

        }

        return browser;
    }
}
