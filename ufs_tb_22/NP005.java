package ufs_tb_22;

import org.testng.annotations.Test;

import underlaymenu.General;

public class NP005 {

	//public static void main (String args[]) throws Exception {
	@Test
	public void NP005test () throws Exception {
		 
		General obj = new General ();
		obj.openApplication();
		obj.hoverUnderlay();
		obj.carpetUnderlay ();
		obj.lastpage();
		obj. previous(); 
		Thread.sleep(3000);
		obj.closebrowser();

}
}

