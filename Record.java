package kidsactivitymanager;


import kidsactivitymanager.ActivityContact;

public class Record {

	private static int nextRecordId = 1;
	private int recordId;
	private String activityName;
	private Address address;
	private double registrationFee;
	private ArrayList<String> paymentMethods;
	private boolean paymentStatus;
	private Schedule schedule;
	private Participant participant;
	private ActivityContact activityContact;


	public Record() {
		this.generateReordId();
	}

	public Record(String activityName, Participant pariticipant) {
		this.generateReordId();
		this.activityName = activityName;
		this.participant = pariticipant;
	}

	private void generateRecordId() {
		this.recordId = nextRecordId;
		nextRecordId++;
	}

	public int getRecordId() {
		return this.recordId;
	}

	public void setRecordId(int recordId) {
		this.recordId = recordId;
	}

	public String getActivityName() {
		return this.activityName;
	}

	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public Address getAddress() {
		return this.address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public double getRegistrationFee() {
		return this.registrationFee;
	}

	public void setRegistrationFee(double registrationFee) {
		this.registrationFee = registrationFee;
	}

	public ArrayList<String> getPaymentMethods() {
		return this.paymentMethods;
	}

	public void setPaymentMethods(ArrayList<String> paymentMethods) {
		this.paymentMethods = paymentMethods;
	}

	public boolean getPaymentStatus() {
		return this.paymentStatus;
	}

	public void setPaymentStatus(boolean paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public Schedule getSchedule() {
		return this.schedule;
	}

	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}

	public Participant getParticipant() {
		return this.participant;
	}

	public void setParticipant(Participant participant) {
		this.participant = participant;
	}

	public ActivityContact getActivityContact() {
		return this.activityContact;
	}


	public void setActivityContact(ActivityContact activityContact) {
		this.activityContact = activityContact;
	}

	public String ToString() {
		// TODO - implement Record.ToString
		throw new UnsupportedOperationException();
	}

	public int compareTo() {
		// TODO - implement Record.compareTo
		throw new UnsupportedOperationException();
	}

}