public class PaginatedWebDecorator implements WebPage {
    private WebPage webPage;
    private int resultsPerPage;

    public PaginatedWebDecorator(WebPage webPage,int resultsPerPage){
        this.webPage = webPage;
        this.resultsPerPage = resultsPerPage;
    }

    public void display(){
        webPage.display();
        paginateResults();
    }

    private void paginateResults(){
        System.out.println("Paginating search results with "+ resultsPerPage +" results per page");
    }
}
