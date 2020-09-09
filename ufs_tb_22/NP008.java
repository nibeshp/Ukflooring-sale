package ufs_tb_22;

import org.testng.annotations.Test;

import underlaymenu.General;

public class NP008 {
	//public static void main (String args []) throws Exception {
	@Test
	public void NP008test () throws Exception {
		General obj = new General ();
		obj.openApplication();
		obj.hoverUnderlay();
		obj.carpetUnderlay();
		obj.show60();
		Thread.sleep(3000);
		obj.downarrow();
		Thread.sleep(4000);
		obj.closebrowser();

		}
		}


