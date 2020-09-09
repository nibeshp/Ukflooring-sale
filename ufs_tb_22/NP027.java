package ufs_tb_22;

import org.testng.annotations.Test;

import underlaymenu.General;

public class NP027 {

	//public static void main (String args []) throws Exception  {
	@Test
	public void NP027Test() throws Exception {
		
	General obj = new General() ;
	
	obj.openApplication();
	obj.hoverUnderlay();
	obj.carpetUnderlay ();
	obj.price();
	Thread.sleep(3000);
	Thread.sleep(4000);
	obj.arrowdown();
	System.out.println ("High to low");
	obj.closebrowser();
	
			
	}
	}


