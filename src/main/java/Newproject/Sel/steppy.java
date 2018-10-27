package Newproject.Sel;

import org.testng.annotations.Test;

public class steppy {
	
@Test(priority=-333)

public void test1() {
	System.out.println("Bala1");
}
@Test(priority=-33)
public void test2() {
	System.out.println("Bala2");
}
@Test
public void test3() {
	System.out.println("Bala3");
}

}