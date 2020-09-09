package ufs_tb_22;

import org.testng.annotations.Test;

import underlaymenu.General;

public class NP001 {
	
    //public static void main (String args []) throws Exception  {
	@Test 
	public void NP001test () throws Exception {
	
	General obj = new General() ;
	
	obj.openApplication();
	obj.hoverUnderlay();
	Thread.sleep(3000);
    obj.closebrowser();
	
	
	}	
	}
	 
