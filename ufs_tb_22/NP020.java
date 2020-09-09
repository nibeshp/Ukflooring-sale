package ufs_tb_22;

import org.testng.annotations.Test;

import underlaymenu.General;

public class NP020 {
	//public static void main (String args []) throws Exception {
	@Test
	public void NP020Test() throws Exception {
	    General obj = new General ();
	    obj.openApplication();
	    obj.hoverUnderlay();
	    obj.carpetUnderlay();
	    obj.price();
	    obj.arrowdown();
	    Thread.sleep(4000);
	    obj.closebrowser();
}
}