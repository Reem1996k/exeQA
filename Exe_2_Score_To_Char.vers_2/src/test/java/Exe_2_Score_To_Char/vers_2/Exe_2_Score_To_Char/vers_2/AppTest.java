package Exe_2_Score_To_Char.vers_2.Exe_2_Score_To_Char.vers_2;

import org.junit.Test;
import static org.junit.Assert.assertEquals;;
/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
	@Test
	public void exe_2_Partition_C_min() {
		
		String result = App.NumberToChar(70);
		String expected_result="C";
		org.junit.Assert.assertEquals(expected_result,result,result);
	}
	@Test
	public void exe_2_Partition_C_min_plus1() {
		
		String result = App.NumberToChar(71);
		String expected_result="C";
		org.junit.Assert.assertEquals(expected_result,result,result);
	}
	@Test
public void exe_2_Partition_C_nominal() {
		
		String result = App.NumberToChar(75);
		String expected_result="C";
		org.junit.Assert.assertEquals(expected_result,result,result);
	} 
	@Test
public void exe_2_Partition_C_max_minus1() {
		
		String result = App.NumberToChar(78);
		String expected_result="C";
		org.junit.Assert.assertEquals(expected_result,result,result);
	}
	@Test
public void exe_2_Partition_C_max() {
		
		String result = App.NumberToChar(79);
		String expected_result="C";
		org.junit.Assert.assertEquals(expected_result,result,result);
	}
	
}
