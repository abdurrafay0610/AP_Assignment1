import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class Array_Insertion_Test 
{
	
	int []array = {0,1,2,3,4,5,6,7,8,9};

	@Test
	public void test()
	{
		array=ArrayInsertion.insert(array, 0, 1);
		Assert.assertEquals(0,array[1]);
		
	}

}
