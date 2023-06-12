package blood;

public class Donor {
	//Fields
	private String name;
    private String bloodType;
    private int age;
    private String mobileNumber;
    
    //Constructor
	public Donor(String name, String bloodType, int age, String mobileNumber) {
		
		this.name = name;
		this.bloodType = bloodType;
		this.age = age;
		this.mobileNumber = mobileNumber;
	}
	
	//Getter & Setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBloodType() {
		return bloodType;
	}

	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	//toString
	@Override
	public String toString() {
		return "Name: " + name + ", Blood Type: " + bloodType + ", Age: " + age + ", Mobile Number: " + mobileNumber;
	}
    
    
	
}
