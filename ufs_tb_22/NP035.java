package ufs_tb_22;

import org.testng.annotations.Test;

import underlaymenu.General;

public class NP035 {

	//public static void main (String args []) throws Exception  {
	@Test
	public void NP035Test() throws Exception {
		
	General obj = new General() ;
	
	obj.openApplication();
	obj.hoverUnderlay();
	obj.carpetUnderlay ();
	obj.magiccarpetunderlay();
	Thread.sleep(5000);
	obj.closebrowser();
			
	}
	}


