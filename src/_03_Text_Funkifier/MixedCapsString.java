package _03_Text_Funkifier;

public class MixedCapsString {
	private String funkifiedText;
    private String unfunkifiedText;
    
    public MixedCapsString(String unfunkifiedText) {

        this.unfunkifiedText = unfunkifiedText;
 
    }

	public String funkifyText() {
		String funkifiedText;
		for (int i = 0; i < unfunkifiedText.length(); i++) {
			
			if(i%2==0) {
				char a = unfunkifiedText.charAt(i);
				
			}
    		
    		
		}
		return "tHiS Is aLsO A TeSt";
	}

}
