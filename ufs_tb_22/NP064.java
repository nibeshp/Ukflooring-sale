package ufs_tb_22;

import org.testng.annotations.Test;

import underlaymenu.General;

public class NP064 {

	//public static void main (String args []) throws Exception  {
	@Test
	public void NP064Test() throws Exception {
		
	General obj = new General() ;
	
	obj.openApplication();
	obj.hoverUnderlay();
	obj.woodUnderlay ();
	Thread.sleep(4000);
	obj.price1();
 	Thread.sleep(4000);
 	obj.arrowup1();
 	Thread.sleep(4000);
	obj.closebrowser();
			
	}
	}


