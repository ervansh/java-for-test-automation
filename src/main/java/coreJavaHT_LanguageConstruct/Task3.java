package coreJavaHT_LanguageConstruct;

public class Task3 {

	public static void main(String[] args) {
        int tea = 10;
        int candy = 20;
        
        int result = partyRating(tea, candy);
        System.out.println("Party outcome: " + result);
    }
    
    public static int partyRating(int tea, int candy) {
        if (tea < 5 || candy < 5) {
            return 0; 
        }
        
        if (tea >= 2 * candy || candy >= 2 * tea) {
            return 2; 
        }
        
        return 1; 
    }
}
