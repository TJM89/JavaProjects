package methodAndClassCommunications;

public class MainCHospital {

	public static void main(String[] args) {

		
		PatientRecord patientNameobj = new PatientRecord();
		
		String patientName = "";
		
		patientName = patientNameobj.getpatientName();

		System.out.println("Patient name is " + patientName);
		
		patientName = "";
		patientNameobj.setpatientName ("Melvin");
		
		patientName = patientNameobj.getpatientName();
		System.out.println("Updated patient name to " + patientName);
		
	}

}
