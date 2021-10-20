import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class Array_test {
	
	Array array;
	@Before
	public void setup()
	{
		array = new Array();
	}
	
	@Test
	public void insertion_test_positive() 
	{
		//if we store values in ascending order it will store them correctly
		for(int i=0;i<100;i++)
		{
			array.insert(i, i);
		}
		for(int i=0;i<100;i++)
		{
			Assert.assertEquals(i,array.array[i]);
		}
		array.display();  		  //from 0 to 99
	}
	@Test
	public void insertion_test_negative()
	{
		//if we place values in this array in descending positions then it will not store values correctly
		for(int i=99;i>=0;i--)
		{
			array.insert(i, i);
		}
		array.display(); 		//incorrect insertion
		for(int i=0;i<100;i++)
		{
			Assert.assertEquals(i,array.array[i]);
		}
	}
	
	
	@Test
	public void deletion_test()
	{
		for(int i=0;i<100;i++)
		{
			array.insert(i, i);
		}
		for(int i=0;i<10;i++) 	//deleting elements from 50 to 59
		{
			array.delete(50);
		}
		for(int i=50;i<60;i++)
		{
			Assert.assertEquals(i+10, array.array[i]);
		}
	}
	
	@Test
	public void linear_search_test()
	{
		for(int i=0;i<100;i++)
		{
			array.insert(i, i);
		}
		for(int i=0;i<100;i++)
		{
			Assert.assertEquals(true, array.linearSearch(i));
		}
	}
	
	@Test
	public void Binary_search_test()
	{
		for(int i=0;i<100;i++)
		{
			array.insert(i, i);
		}
		for(int i=0;i<100;i++)
		{
			Assert.assertEquals(true, array.binarySearch(i,0,array.size));
		}
	}
	
	@Test
	public void bubble_test()
	{
		for(int i=0;i<100;i++)
		{
			array.insert(99-i, i);
		}
		
		array.bubbleSort();
		
		for(int i=0;i<100;i++)
		{
			Assert.assertEquals(i, array.array[i]);
		}
	}
	
	@After
	public void cleanup()
	{
		for(int i=0;i<100;i++)
		{
			array.array[i]=0;
		}
		array.size=0;
	}
}
