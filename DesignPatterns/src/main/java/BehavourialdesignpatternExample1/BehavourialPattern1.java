package BehavourialdesignpatternExample1;
public class BehavourialPattern1 {
	public static void main(String[] args)  
    { 
        Alert A = new Alert(); 
        A.alert(); 
        A.alert(); 
        A.set(new Silent()); 
        A.alert(); 
        A.alert(); 
    } 
}
