package ufs_tb_22;

import org.testng.annotations.Test;

import underlaymenu.General;

public class NP056 {

	//public static void main (String args []) throws Exception  {
	@Test
	public void NP056Test() throws Exception {
		
	General obj = new General() ;
	
	obj.openApplication();
	obj.hoverUnderlay();
	obj.woodUnderlay ();
	Thread.sleep(4000);
	obj.position1();
	obj.arrowup1();
	Thread.sleep(5000);
	obj.closebrowser();
			
	}
	}


