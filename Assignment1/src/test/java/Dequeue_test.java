import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Dequeue_test 
{
	Dequeue dequeue;
	Dequeue dequeue2;
	
	@Before
	public void setp()
	{
		dequeue = new Dequeue(10);
		dequeue2 =new Dequeue(0);
	}
	
	@Test
	public void addLeft_test() 
	{
		for(int i=0;i<20;i++)
		{
			dequeue.addLeft(i);
		}
		dequeue.display();
	}

	@Test 
	public void addRight_test()
	{
		for(int i=0;i<20;i++)
		{
			dequeue.addRight(i);
		}
		dequeue.display();
	}
}
