package TstNg;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestRetryXmlTestCases {

    @Test()
    public void firstTestMethod() {
        System.out.println("First test method11");
        Assert.assertTrue(true);
    }

    @Test()
    public void secondTestMethod() {
        System.out.println("Second test method22");
        Assert.assertTrue(false);
    }
}