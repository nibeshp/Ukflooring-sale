package ufs_tb_22;

import org.testng.annotations.Test;

import underlaymenu.General;

public class NP004 {

		//public static void main (String args[]) throws Exception {
	    @Test
	    public void NP004test () throws Exception {
		 
			General obj = new General ();
			obj.openApplication();
			obj.hoverUnderlay();
			obj.carpetUnderlay ();
			obj.lastpage(); 
			Thread.sleep(3000);
			obj.closebrowser();
		   
			
		}
}


