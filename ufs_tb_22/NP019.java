package ufs_tb_22;

import org.testng.annotations.Test;

import underlaymenu.General;

public class NP019 {
	//public static void main(String args []) throws Exception{
	@Test
	public void NP019Test() throws Exception {
		General obj = new General ();
		obj.openApplication();
		obj.hoverUnderlay();
		obj.carpetUnderlay();
		obj.position();
	    Thread.sleep(3000);
	    obj.arrowdown();
	    
}
}