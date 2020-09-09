package ufs_tb_22;

import org.testng.annotations.Test;

import underlaymenu.General;

public class NP037 {

	//public static void main (String args []) throws Exception  {
	@Test
	public void NP037Test() throws Exception {
		
	General obj = new General() ;
	
	obj.openApplication();
	obj.hoverUnderlay();
	obj.carpetUnderlay ();
	obj.addtowishlist ();
	Thread.sleep(5000);
	obj.closebrowser();
			
	}
	}


