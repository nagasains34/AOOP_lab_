package history;

public class Main {
    public static void main(String[] args) {
        BrowserHistory browserHistory = new BrowserHistory();
        browserHistory.visitPage("home.com");
        browserHistory.visitPage("about.com");
        browserHistory.visitPage("contact.com");
        browserHistory.displayCurrentPage();
        browserHistory.goBack();
        browserHistory.displayCurrentPage();
        browserHistory.goForward();
        browserHistory.displayCurrentPage();
    }
}
