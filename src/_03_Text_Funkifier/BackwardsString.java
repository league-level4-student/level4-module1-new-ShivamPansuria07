package _03_Text_Funkifier;

public class BackwardsString implements TextFunkifier {
	String unfunkifiedText = "";
	String funkifiedText = "";
    
    private char ch;
    public BackwardsString(String unfunkifiedText) {

        this.unfunkifiedText = unfunkifiedText;
        
    }

    @Override
    public String funkifyText() {
  
    	
    	for (int i = 0; i < unfunkifiedText.length(); i++) {
    		
    		ch = unfunkifiedText.charAt(i);
    		funkifiedText = ch + funkifiedText;
		}
        return funkifiedText;

    }
}
