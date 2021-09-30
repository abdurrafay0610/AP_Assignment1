import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class ArrayDeletion_test {
	
	int []array= {0,1,2,3,4};
	int []array2 = {0,1,2,3,4};

	@Test
	public void Deletion_negative_test() 
	{
		ArrayDeletion.display(array);
		for(int i=0;i<5;i++)
		{
			array=ArrayDeletion.delete(array,i);
		}
		
		ArrayDeletion.display(array);
		
		for(int i=0;i<5;i++)
		{
			Assert.assertEquals(-1,array[i]);
		}
	}
	
	@Test
	public void Deletion_positive_test() 
	{
		ArrayDeletion.display(array2);
		for(int i=4;i>=0;i--)
		{
			array2=ArrayDeletion.delete(array2,i);
		}
		
		ArrayDeletion.display(array2);
		
		for(int i=0;i<5;i++)
		{
			Assert.assertEquals(-1,array2[i]);
		}	
	}
}
