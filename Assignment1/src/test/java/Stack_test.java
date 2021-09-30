import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class Stack_test 
{
	Stack stack;
	@Before
	public void setup()
	{
		stack = new Stack();
	}
	
	@Test
	public void pop_test()
	{
		Assert.assertEquals(-1,stack.pop()); //pop failed as nothing in stack
		stack.push(5);
		stack.display();	//Stack : 5
		Assert.assertEquals(5,stack.pop());
		stack.display(); 	//Empty Stack
	}
}
