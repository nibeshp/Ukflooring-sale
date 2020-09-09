package ufs_tb_22;

import org.testng.annotations.Test;

import underlaymenu.General;

public class NP009 {

	//public static void main (String args []) throws Exception {
	@Test
	public void NP009Test() throws Exception {
    General obj = new General ();
    obj.openApplication();
    obj.hoverUnderlay();
    obj.carpetUnderlay();
    obj.downarrow();
    obj.show60();
    Thread.sleep(3000);
    obj.closebrowser();
    
		
		
}
}
