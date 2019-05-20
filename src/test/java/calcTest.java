import org.junit.Assert;
import org.junit.Test;

public class calcTest {

    @Test
    public void divisionTest1() {
        double result = calc.div(10, 0);
        Assert.assertEquals(0, result, 0);

    }

}
