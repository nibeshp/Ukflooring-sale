package ufs_tb_22;

import org.testng.annotations.Test;

import underlaymenu.General;

public class NP039 {

	//public static void main (String args []) throws Exception  {
	@Test
	public void NP039Test() throws Exception {
		
	General obj = new General() ;
	
	obj.openApplication();
	obj.hoverUnderlay();
	obj.carpetUnderlay ();
	obj.featuredproduct ();
	Thread.sleep(5000);
	obj.closebrowser();
			
	}
	}


