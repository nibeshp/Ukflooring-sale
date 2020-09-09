package ufs_tb_22;

import org.testng.annotations.Test;

import underlaymenu.General;

public class NP040 {

	//public static void main (String args []) throws Exception  {
	@Test
	public void NP040Test() throws Exception {
		
	General obj = new General() ;
	
	obj.openApplication();
	obj.hoverUnderlay();
	obj.carpetUnderlay ();
	obj.featuredproduct ();
	Thread.sleep(5000);
	obj.closebrowser();
			
	}
	}


