package ufs_tb_22;

import org.testng.annotations.Test;

import underlaymenu.General;

public class NP057 {

	//public static void main (String args []) throws Exception  {
	@Test
	public void NP057Test() throws Exception {
		
	General obj = new General() ;
	
	obj.openApplication();
	obj.hoverUnderlay();
	obj.woodUnderlay ();
	obj.position1();
	//obj.arrowdown();
	Thread.sleep(5000);
	obj.closebrowser();
			
	}
	}


