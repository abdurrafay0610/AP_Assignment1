import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class Queue_test 
{
	
	Queue queue;
	int exception_check;
	@Before
	public void setup()
	{
		queue = new Queue(10);
		exception_check = 0;
	}
	
	@Test
	public void enqueue_and_dequeu() 
	{
		Assert.assertEquals(true,queue.empty());
		
		try
		{
			queue.dequeue();
		}
		catch(Exception e)
		{
			exception_check = 1;
		}
		
		Assert.assertEquals(1, exception_check);
		exception_check = 0 ;
		
		try
		{
			queue.enqueue(5);
		}
		catch(Exception e)
		{
			exception_check = 1;
		}
		
		Assert.assertEquals(0, exception_check);
		Assert.assertEquals(1, queue.size());
		queue.display();
		
		
		int dequeue_value = 0;
		try
		{
			dequeue_value = queue.dequeue();
		}
		catch(Exception e)
		{
			exception_check = 1;
		}
		
		Assert.assertEquals(0, exception_check);
		Assert.assertEquals(5, dequeue_value);
	}

}
