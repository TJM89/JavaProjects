package methodAndClassCommunications;

public class CustomerInformation {

	String firstName = "John";
	String email = "john@gmail.com";
	String address = "100 queen street";

	String getupdateName() {
		return firstName;
	}

	String getemail() {
		return email;
	}

	String getaddress() {
		return address;
	}

	void setfirstName(String updatedName) {
		firstName = updatedName;
	}

	void setemail(String emailUpdate) {
		email = emailUpdate;
	}

	void setaddress(String addressUpdate) {
		address = addressUpdate;
	}

}
