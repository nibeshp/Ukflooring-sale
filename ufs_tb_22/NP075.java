package ufs_tb_22;

import org.testng.annotations.Test;

import underlaymenu.General;

public class NP075 {

	//public static void main (String args []) throws Exception  {
	@Test
	public void NP075Test() throws Exception {
		
	General obj = new General() ;
	
	obj.openApplication();
	obj.hoverUnderlay();
	obj.woodUnderlay ();
	Thread.sleep(4000);
 	obj.closebrowser();
			
	}
	}


