package ufs_tb_22;

import org.testng.annotations.Test;

import underlaymenu.General;

public class NP006 {
	
	//public static void main (String args []) throws Exception {
	@Test
	public void NP006test () throws Exception {
	
		General obj = new General ();
		obj.openApplication();
		obj.hoverUnderlay();
		obj.carpetUnderlay ();
		obj.next ();
		obj.firstpage();
		obj.closebrowser();
		
}
	
	

}
