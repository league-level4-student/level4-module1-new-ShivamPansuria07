package _00_Intro_to_Exceptions;

import javax.swing.JOptionPane;

public class NegativeException extends Exception {
	
	 public static void scaryPopup(){
	        JOptionPane.showMessageDialog(null, "You have triggered a critical error in  your computer!");
	 }
	 public static void testPositive(int x) throws NegativeException {
	        if (x < 0) {
	            throw new NegativeException();
	        }
	    }
	 public static void main(String[] args) {
		 try {
			 //change the value to below to call the scaryPopup method
	    		testPositive(-1);
			} catch (Exception e) {
				scaryPopup();
				
			} finally{
				JOptionPane.showMessageDialog(null, "Don't worry, your computer is fine");
			}
		}
}
