import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class MyStack_test 
{
	
	int exception_check;
	MyStack stack;
	
	@Before
	public void setup()
	{
		exception_check = 0;
		stack = new MyStack(10);
	}
	
	@Test
	public void top_test()
	{
		try
		{
			stack.top();
		}
		catch(Exception e)
		{
			exception_check = 1;
		}
		
		Assert.assertEquals(1, exception_check);	//exception thrown
		exception_check = 0;
		
		try
		{
			stack.push(5);
		}
		catch(Exception e)
		{
			exception_check=1;
		}
		
		Assert.assertEquals(0, exception_check);	//no exception thrown, push successful
		
		int top_num=0;
		try
		{
			top_num=stack.top();
		}
		catch(Exception e)
		{
			exception_check = 1;
		}
		
		Assert.assertEquals(0,exception_check); 		//no exception thrown
		
		Assert.assertEquals(5, top_num);
	}
	
	@Test
	public void pop_test()
	{
		try
		{
			stack.pop();
		}
		catch(Exception e)
		{
			exception_check = 1;
		}
		
		Assert.assertEquals(1, exception_check);	//exception thrown
		exception_check = 0;
		
		try
		{
			stack.push(5);
		}
		catch(Exception e)
		{
			exception_check=1;
		}
		
		Assert.assertEquals(0, exception_check);	//no exception thrown, push successful
		
		
		int size = stack.size();			//stack is 1
		Assert.assertEquals(1, size);
		
		int pop_num=0;
		try
		{
			pop_num=stack.pop();
		}
		catch(Exception e)
		{
			exception_check = 1;
		}
		
		Assert.assertEquals(0,exception_check); 		//no exception thrown
		
		Assert.assertEquals(5, pop_num);
		
		size = stack.size();				//stack is now 0
		Assert.assertEquals(0, size);
		
	}
	
	@Test 
	public void push_test()
	{
		for(int i=0;i<=10;i++)
		{
			try
			{
				stack.push(i);
			}
			catch(Exception e)
			{
				exception_check=1;
			}
		}
		
		Assert.assertEquals(1, exception_check);
		
		stack.displayStack(); //print from 0 to 9
	}
	
}
