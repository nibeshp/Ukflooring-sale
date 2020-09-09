package ufs_tb_22;

import org.testng.annotations.Test;

import underlaymenu.General;

public class NP045 {

	//public static void main (String args []) throws Exception  {
	@Test
	public void NP045Test() throws Exception {
		
	General obj = new General() ;
	
	obj.openApplication();
	obj.hoverUnderlay();
	obj.woodUnderlay ();
	obj.show30a();
	Thread.sleep(5000);
	obj.closebrowser();
			
	}
}


