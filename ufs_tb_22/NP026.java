package ufs_tb_22;

import org.testng.annotations.Test;

import underlaymenu.General;

public class NP026 {

	//public static void main (String args []) throws Exception  {
	@Test
	public void NP026Test() throws Exception {
		
	General obj = new General() ;
	
	obj.openApplication();
	obj.hoverUnderlay();
	obj.carpetUnderlay ();
	obj.price();
	Thread.sleep(3000);
	obj.arrowup();
	Thread.sleep(4000);
	System.out.println ("High to low");
	obj.closebrowser();
	
			
	}
	}


