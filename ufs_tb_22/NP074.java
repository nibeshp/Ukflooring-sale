package ufs_tb_22;

import org.testng.annotations.Test;

import underlaymenu.General;

public class NP074 {

	//public static void main (String args []) throws Exception  {
	@Test
	public void NP074Test() throws Exception {
		
	General obj = new General() ;
	
	obj.openApplication();
	obj.hoverUnderlay();
	obj.woodUnderlay ();
	Thread.sleep(4000);

			
	}
	}


