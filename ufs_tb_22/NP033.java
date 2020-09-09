package ufs_tb_22;

import org.testng.annotations.Test;

import underlaymenu.General;

public class NP033 {

	//public static void main (String args []) throws Exception  {
	@Test
	public void NP033Test() throws Exception {
		
	General obj = new General() ;
	
	obj.openApplication();
	obj.hoverUnderlay();
	obj.carpetUnderlay ();
	obj.listview();
	obj.gridview();
	obj.closebrowser();
			
	}
	}


