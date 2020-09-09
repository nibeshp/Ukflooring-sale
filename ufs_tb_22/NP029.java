package ufs_tb_22;

import org.testng.annotations.Test;

import underlaymenu.General;

public class NP029 {

	//public static void main (String args []) throws Exception  {
	@Test
	public void NP029Test() throws Exception {
		
	General obj = new General() ;
	
	obj.openApplication();
	obj.hoverUnderlay();
	obj.carpetUnderlay ();
	obj.brand();
	Thread.sleep(3000);
	obj.closebrowser();
	
			
	}
	}


