
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


public class TestPrintText extends TestCase{
    
	public TestPrintText(String zestawMetod){
		
            super(zestawMetod);		
	}
	
	public static Test suite(){
		
            TestSuite zestawTestow = new TestSuite();
                
            zestawTestow.addTest(new TestPrintText("testPrint2Columns"));

            return zestawTestow;
	}
	
	public void testPrint2Columns(){
		
            String text = "tttttttttfs dfsdfsdfjah sjfdsvslfklds fkldsnfjnsd lfsdtttttttttt ttvfsdgfdsfsdfdsfs dfsdfgsdtttttt"
                + "tttttttttfs dfsdfsdfjah sjfdsvslfklds fkldsnfjnsd lfsdtttttttttt ttvfsdgfdsfsdfdsfs dfsdfgsdtttttt"
                + "tttttttttfs dfsdfsdfjah sjfdsvslfklds fkldsnfjnsd lfsdtttttttttt ttvfsdgfdsfsdfdsfs dfsdfgsdtttttt"
                + "tttttttttfs dfsdfsdfjah sjfdsvslfklds fkldsnfjnsd lfsdtttttttttt ttvfsdgfdsfsdfdsfs dfsdfgsdtttttt"
                + "tttttttttfs dfsdfsdfjah sjfdsvslfklds fkldsnfjnsd lfsdtttttttttt ttvfsdgfdsfsdfdsfs dfsdfgsdtttttt"
                + "tttttttttfs dfsdfsdfjah sjfdsvslfklds fkldsnfjnsd lfsdtttttttttt ttvfsdgfdsfsdfdsfs dfsdfgsdtttttt"
                + "tttttttttfs dfsdfsdfjah sjfdsvslfklds fkldsnfjnsd lfsdtttttttttt ttvfsdgfdsfsdfdsfs dfsdfgsdtttttt"
                + "tttttttttfs dfsdfsdfjah sjfdsvslfklds fkldsnfjnsd lfsdtttttttttt ttvfsdgfdsfsdfdsfs dfsdfgsdtttttt"
                + "tttttttttfs dfsdfsdfjah sjfdsvslfklds fkldsnfjnsd lfsdtttttttttt ttvfsdgfdsfsdfdsfs dfsdfgsdtttttt"
                + "tttttttttfs dfsdfsdfjah sjfdsvslfklds fkldsnfjnsd lfsdtttttttttt ttvfsdgfdsfsdfdsfs dfsdfgsdtttttt"
                + "tttttttttfs dfsdfsdfjah sjfdsvslfklds fkldsnfjnsd lfsdtttttttttt ttvfsdgfdsfsdfdsfs dfsdfgsdtttttt"
                + "tttttttttfs dfsdfsdfjah sjfdsvslfklds fkldsnfjnsd lfsdtttttttttt ttvfsdgfdsfsdfdsfs dfsdfgsdtttttt"
                + "tttttttttfsdfsdfsdfjahsjfdsvslfkldsfkldsnfjnsdlfsdttttttttttttvfsdgfdsfsdfdsfsdfsdfgsdtttttt"
                + "tttttttttfs dfsdfsdfjah sjfdsvslfklds fkldsnfjnsd lfsdtttttttttt ttvfsdgfdsfsdfdsfs dfsdfgsdtttttt"
                + "tttttttttfsdfsdfsdfjahsjfdsvslfkldsfkldsnfjnsdlfsdttttttttttttvfsdgfdsfsdfdsfsdfsdfgsdtttttt"
                + "tttttttttfsdfsdfsdfjahsjfdsvslfkldsfkldsnfjnsdlfsdttttttttttttvfsdgfdsfsdfdsfsdfsdfgsdtttttt"
                + "tttttttttfs dfsdfsdfjah sjfdsvslfklds fkldsnfjnsd lfsdtttttttttt ttvfsdgfdsfsdfdsfs dfsdfgsdtttttt"
                + "tttttttttfsdfsdfsdfjahsjfdsvslfkldsfkldsnfjnsdlfsdttttttttttttvfsdgfdsfsdfdsfsdfsdfgsdtttttt"
                + "tttttttttfsdfsdfsdfjahsjfdsvslfkldsfkldsnfjnsdlfsdttttttttttttvfsdgfdsfsdfdsfsdfsdfgsdtttttt"
                + "tttttttttfs dfsdfsdfjah sjfdsvslfklds fkldsnfjnsd lfsdtttttttttt ttvfsdgfdsfsdfdsfs dfsdfgsdtttttt"
                + "tttttttttfs dfsdfsdfjah sjfdsvslfklds fkldsnfjnsd lfsdtttttttttt ttvfsdgfdsfsdfdsfs dfsdfgsdtttttt"
                + "tttttttttfsdfsdfsdfjahsjfdsvslfkldsfkldsnfjnsdlfsdttttttttttttvfsdgfdsfsdfdsfsdfsdfgsdtttttt"
                + "tttttttttfsdfsdfsdfjahsjfdsvslfkldsfkldsnfjnsdlfsdttttttttttttvfsdgfdsfsdfdsfsdfsdfgsdtttttt"
                + "tttttttttfs dfsdfsdfjah sjfdsvslfklds fkldsnfjnsd lfsdtttttttttt ttvfsdgfdsfsdfdsfs dfsdfgsdtttttt"
                + "tttttttttfs dfsdfsdfjah sjfdsvslfklds fkldsnfjnsd lfsdtttttttttt ttvfsdgfdsfsdfdsfs dfsdfgsdtttttt"
                + "tttttttttfsdfsdfsdfjahsjfdsvslfkldsfkldsnfjnsdlfsdttttttttttttvfsdgfdsfsdfdsfsdfsdfgsdtttttt"
                + "tttttttttfs dfsdfsdfjah sjfdsvslfklds fkldsnfjnsd lfsdtttttttttt ttvfsdgfdsfsdfdsfs dfsdfgsdtttttt"
                + "tttttttttfs dfsdfsdfjah sjfdsvslfklds fkldsnfjnsd lfsdtttttttttt ttvfsdgfdsfsdfdsfs dfsdfgsdtttttt"
                + "tttttttttfs dfsdfsdfjah sjfdsvslfklds fkldsnfjnsd lfsdtttttttttt ttvfsdgfdsfsdfdsfs dfsdfgsdtttttt"
                + "tttttttttfsdfsdfsdfjahsjfdsvslfkldsfkldsnfjnsdlfsdttttttttttttvfsdgfdsfsdfdsfsdfsdfgsdtttttt"
                + "tttttttttfs dfsdfsdfjah sjfdsvslfklds fkldsnfjnsd lfsdtttttttttt ttvfsdgfdsfsdfdsfs dfsdfgsdtttttt"
                + "tttttttttfs dfsdfsdfjah sjfdsvslfklds fkldsnfjnsd lfsdtttttttttt ttvfsdgfdsfsdfdsfs dfsdfgsdtttttt"
                + "tttttttttfsdfsdfsdfjahsjfdsvslfkldsfkldsnfjnsdlfsdttttttttttttvfsdgfdsfsdfdsfsdfsdfgsdtttttt"
                + "tttttttttfs dfsdfsdfjah sjfdsvslfklds fkldsnfjnsd lfsdtttttttttt ttvfsdgfdsfsdfdsfs dfsdfgsdtttttt"
                + "tttttttttfs dfsdfsdfjah sjfdsvslfklds fkldsnfjnsd lfsdtttttttttt ttvfsdgfdsfsdfdsfs dfsdfgsdtttttt"
                + "tttttttttfsdfsdfsdfjahsjfdsvslfkldsfkldsnfjnsdlfsdttttttttttttvfsdgfdsfsdfdsfsdfsdfgsdtttttt"
                + "tttttttttfs dfsdfsdfjah sjfdsvslfklds fkldsnfjnsd lfsdtttttttttt ttvfsdgfdsfsdfdsfs dfsdfgsdtttttt"
                + "tttttttttfs dfsdfsdfjah sjfdsvslfklds fkldsnfjnsd lfsdtttttttttt ttvfsdgfdsfsdfdsfs dfsdfgsdtttttt"
                + "tttttttttfsdfsdfsdfjahsjfdsvslfkldsfkldsnfjnsdlfsdttttttttttttvfsdgfdsfsdfdsfsdfsdfgsdtttttt"
                + "tttttttttfs dfsdfsdfjah sjfdsvslfklds fkldsnfjnsd lfsdtttttttttt ttvfsdgfdsfsdfdsfs dfsdfgsdtttttt"
                + "tttttttttfs dfsdfsdfjah sjfdsvslfklds fkldsnfjnsd lfsdtttttttttt ttvfsdgfdsfsdfdsfs dfsdfgsdtttttt"
                + "tttttttttfsdfsdfsdfjahsjfdsvslfkldsfkldsnfjnsdlfsdttttttttttttvfsdgfdsfsdfdsfsdfsdfgsdtttttt"
                + "tttttttttfs dfsdfsdfjah sjfdsvslfklds fkldsnfjnsd lfsdtttttttttt ttvfsdgfdsfsdfdsfs dfsdfgsdtttttt"
                + "tttttttttfs dfsdfsdfjah sjfdsvslfklds fkldsnfjnsd lfsdtttttttttt ttvfsdgfdsfsdfdsfs dfsdfgsdtttttt";
        
        TextPrinter tp = new TextPrinter();
  
        tp.print2Columns(text, 1);
        
        tp.print2Columns(text, 10);
        
        tp.print2Columns(text, 20);
        
        tp.print2Columns(text, 30);
        
        tp.print2Columns(text, 50);
        
        tp.print2Columns(text, 100);

	}

}
