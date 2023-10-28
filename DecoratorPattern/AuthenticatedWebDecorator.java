/**
 * AuthenticatedWebDecorator
 */
public class AuthenticatedWebDecorator implements WebPage{
    private WebPage webPage;

    public AuthenticatedWebDecorator(WebPage webPage){
        this.webPage = webPage;
    }

    public void display(){
        authenticateUser();
        webPage.display();
    }
    private void authenticateUser(){
        System.out.println("User Authenticate Check");
    }
    
}