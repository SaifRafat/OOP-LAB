public class Main {
    public static void main(String[] args) {
        WebPage basicPage = new BasicWebPage();

        WebPage authenticaedPage = new AuthenticatedWebDecorator(basicPage);
        WebPage paginatedPage = new PaginatedWebDecorator(authenticaedPage, 10);

        paginatedPage.display();
    }
}
