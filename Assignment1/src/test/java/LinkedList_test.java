import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LinkedList_test 
{
	LinkedList list;
	@Before
	public void setup()
	{
		list = new LinkedList();
	}
	
	@Test
	public void test() 
	{
		list.popFront();
		list.popBack();
		
		list.pushBack(1);
		list.pushFront(2);
		list.pushFront(3);
		list.pushBack(0);

		list.popFront();
		list.popFront();
		list.popFront();
		list.popFront();
		
		list.pushFront(1);
		list.pushFront(2);
		list.pushFront(3);
		list.pushBack(0);
		
		list.popBack();
		list.popBack();
		list.popBack();
		list.popBack();
		
		list.pushFront(1);
		list.pushFront(2);
		list.pushFront(3);
		list.pushBack(0);
		
		for(int i=0;i<4;i++)
		{
			list.pop(i);
		}
		
		list.display();
	}
	
	@After
	public void cleanup()
	{
		int size = list.size;
		for(int i=0;i<size;i++)
		{
			list.pop(i);
		}
	}
}
