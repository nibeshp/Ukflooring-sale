package ufs_tb_22;

import org.testng.annotations.Test;

import underlaymenu.General;

public class NP018 {
	//public static void main (String args []) throws Exception {
	@Test
	public void NP018Test() throws Exception {
		General obj = new General ();
		obj.openApplication();
		obj.hoverUnderlay();
		obj.carpetUnderlay();
		obj.position1();
	    Thread.sleep(3000);
	    obj.arrowup();
	    Thread.sleep(4000);
	    obj.closebrowser();
		
	}

}
