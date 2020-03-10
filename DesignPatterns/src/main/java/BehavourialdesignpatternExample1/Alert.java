package BehavourialdesignpatternExample1;
class Alert
	{ 
	    private MobileAlert currentState; 
	  
	    public Alert()  
	    { 
	        currentState = new Vibration(); 
	    } 
	  
	    public void set(MobileAlert ma)  
	    { 
	        currentState = ma; 
	    } 
	  
	    public void alert()  
	    { 
	        currentState.alert(this); 
	    } 
	} 
	