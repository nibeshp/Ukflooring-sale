package ufs_tb_22;

import org.testng.annotations.Test;

import underlaymenu.General;

public class NP023 {

	//public static void main (String args []) throws Exception  {
	@Test
	public void NP023Test() throws Exception {
		
	General obj = new General() ;
	
	obj.openApplication();
	obj.hoverUnderlay();
	obj.carpetUnderlay ();
	obj.name();
	Thread.sleep(3000);
	obj.arrowup();
	Thread.sleep(3000);
	obj.arrowdown();
    obj.closebrowser();
	
	
		
	}
	}


