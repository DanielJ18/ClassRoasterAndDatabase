package ssa;


public class Student1_delete {

    private String id;
    private String firstName;
    private String lastName;
    private String eyeColor; 
//    = { "blue", "brown", "other" };
    private String monthsEmployed;

    public Student1_delete()
    {
	
    }

    public Student1_delete(String id, String firstName, String lastName, String eyeColor, String monthsEmployed) {
	setId(id);
        setFirstName(firstName);
        setLastName(lastName);
        setEyeColor(eyeColor);
        setMonthsEmployed(monthsEmployed);
	

    }
    
    
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }




    public String getMonthsEmployed() {
        return monthsEmployed;
    }

    public void setMonthsEmployed(String monthsEmployed) {
        this.monthsEmployed = monthsEmployed;
    }



  
    
    
    
    
    
    
    
}
