import org.testng.annotations.*;

public class Q4 {



    @Test
    public void test(){
        System.out.println("Test");
    }

      @AfterGroups
      public void afterGroups(){
          System.out.println("after group");
      }

    @AfterClass
    public void afterClass()
    {
        System.out.println("After class");

    }
    @AfterGroups
    public void afterGroup(){
        System.out.println("before Group");
    }
    @AfterMethod
    public void afterMethod()
    {
        System.out.println("after Method");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println(" after suite");
    }
    @AfterTest
    public void afterTest()
    {
        System.out.println("after test");
    }


    @BeforeClass
    public void beforeClass()
    {
        System.out.println("Before class");

    }
    @BeforeGroups
    public void beforeGroup(){
        System.out.println("before Group");
    }
    @BeforeMethod
    public void beforeMethod()
    {
        System.out.println("before Method");
    }
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("before suite");
    }
    @BeforeTest
    public void beforeTest()
    {
        System.out.println("before test");
    }


}

/*
    TestNG Annotations
    @Test :  To mark a method as a test method
    @BeforeMethod: Executes before each test (@Test) method
    @AfterMethod: Executes after each test method
    @BeforeClass: Executes before the first test method in the current class
    @AfterClass: Executes after all the test methods in a current class
    @BeforeTest: Executes before any test methods of available classes which are inside the <test> tag in the testng.xml in this suite
    @AfterTest: Executes after all the test methods of available classes which are inside the <test> tag in the testng.xml in this suite
    @BeforeSuite: Executes before all the tests in this suite
    @AfterSuite: Executes after all tests executed in this current suite
    @BeforeGroup: Executes before the first test method run in that specified group
    @AfterGroup: Executes after the end of all the test methods executed in that specified group
    */








