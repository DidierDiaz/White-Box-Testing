package bank;

import java.util.Arrays;
import java.util.Collection;
 
import org.junit.Test;
import org.junit.Before;

import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class FeesCalculatorDUPathTest {
	@Parameter(0)
	public int amount;
	@Parameter(1)
	public int accountBalance;
	@Parameter(2)
	public boolean student;
	@Parameter(3)
	public float interestPercentage; //expected
	public FeesCalculator feeCalculator;
	
	@Before
	public void initialize() {
		feeCalculator = new FeesCalculator();
	}
	
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] { 
            {11000, 110000, true, 11000 * 0.01f},
            {11000, 90000, true, 11000 * 0.005f},
            {9000, 510000, true, 9000 * 0.005f},
            {9000, 490000, true, 9000 * 0.0f},
            {51000, 510000, false, 51000 * 0.01f},
            {51000, 490000, false, 51000 * 0.005f},
            {49000, 1100000, false, 49000 * 0.005f},
            {49000, 900000, false, 49000 * 0.0f}
        });
    }
    
	@Test
    public void test() {
    	assertEquals(interestPercentage, feeCalculator.calculateDepositInterest(amount, accountBalance, student), 0.5);
    }
}
