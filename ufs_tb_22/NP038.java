package ufs_tb_22;

import org.testng.annotations.Test;

import underlaymenu.General;

public class NP038 {

	//public static void main (String args []) throws Exception  {
	@Test
	public void NP038Test() throws Exception {
		
	General obj = new General() ;
	
	obj.openApplication();
	obj.hoverUnderlay();
	obj.carpetUnderlay ();
	obj.addtocompare ();
	Thread.sleep(5000);
	obj.closebrowser();
			
	}
	}


