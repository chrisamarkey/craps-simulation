import static org.junit.Assert.*;				
import org.junit.Test;	

import edu.princeton.cs.introcs.StdOut;

public class PlayWithInheritanceTest
{

	@Test
	public void test()
	{
		Die die = new Die();
		StdOut.printf("The code is here.\n");
		String str1 = die.testStatic();
		StdOut.printf("String 1 is: ", str1);
        die = new CrookedDie1();
        String str2 = die.testStatic();
		StdOut.printf("String 2 is: ", str2);
        // If the following statement is true, it proves that the subclass's static method will not
        // override the parent class's static method.
		assertEquals(str1,str2);
	}

}