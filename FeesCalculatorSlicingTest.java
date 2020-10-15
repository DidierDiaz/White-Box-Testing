package bank;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
 
import org.junit.Test;
import org.junit.Before;

import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;

import bank.FeesCalculator;

import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class FeesCalculatorSlicingTest {

	@Parameter(0)
	public int amount;
	@Parameter(1)
	public int accountBalance;
	@Parameter(2)
	public boolean student;
	@Parameter(3)
	public int dayOfWeek;
	@Parameter(4)
	public float feePercentage; //expected
	public FeesCalculator feeCalculator;
	
	
	@Before
	public void initialize() {
		feeCalculator = new FeesCalculator();
	}
	
	@Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] { 
        	{1000, 10000, true, Calendar.SATURDAY, 1000 * 0.0f},
        	{1000, 10000, true, Calendar.SUNDAY, 1000 * 0.0f},
            {1000, 10000, true, Calendar.WEDNESDAY, 1000 * 0.001f},
            {1000, 900, false, Calendar.SATURDAY, 1000 * 0.002f},
            {1000, 9000, false, Calendar.SATURDAY, 1000 * 0.001f},
            {1000, 90000, false, Calendar.SATURDAY, 1000 * 0.0f},
        });
    }
    
	@Test
    public void test() {
    	assertEquals(feePercentage, feeCalculator.calculateWithdrawalFee(amount, accountBalance, student, dayOfWeek), 0.5);
    }
	

}