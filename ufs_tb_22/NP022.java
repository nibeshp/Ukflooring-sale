package ufs_tb_22;

import org.testng.annotations.Test;

import underlaymenu.General;

public class NP022 {

	//public static void main (String args []) throws Exception  {
	@Test
	public void NP022Test() throws Exception {
		
	General obj = new General() ;
	
	obj.openApplication();
	obj.hoverUnderlay();
	obj.carpetUnderlay ();
	obj.name();
	obj.arrowup();
	Thread.sleep(3000);
    obj.closebrowser();
	
	
		
	}
	}


