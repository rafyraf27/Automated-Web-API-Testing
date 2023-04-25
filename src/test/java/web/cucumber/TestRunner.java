
package web.cucumber;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

     //   features = {"src/test/resources/features"},
        //features = {"src\\test\\resources\\features\\SearchProduct.feature"},
        //features = {"src\\test\\resources\\features\\AddProductToCart.feature"},APC
//    features = {"src\\test\\resources\\features\\SignUp.feature"},
//        features = {"src\\test\\resources\\features\\DeleteItemFromCart.feature"},
//        features = {"src\\test\\resources\\features\\VerifyCheckoutAddress.feature"},
//        features = {"src\\test\\resources\\features\\DownloadInvoiceAfterPurchase.feature"},
        //features = {"src\\test\\resources\\features\\WriteReviewTest.feature"},
        features = {"src/test/resources/features/VerifyNumberOfProductsInCart.feature"},
        plugin = {"pretty", "html:target/testReport.html", "json:target/jsonReport.json", "rerun:target/rerun.txt"},
        //dryRun = false,
        monochrome = true,
        //tags = "@sanity" //APC
        //tags = "@sb" // search bar
        //tags = "@jr"
//        tags = "@kh"
        //tags = "@va" // verify address
        //tags = "di" // download invoice
        tags = "@cart_quantity"
       // tags = "@jr or @sanity or @sb or @kh or @va or @di or @webNav or @writereview or @rl "

)
public class TestRunner {
}