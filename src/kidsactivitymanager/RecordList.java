package kidsactivitymanager;

import java.util.ArrayList;

public class RecordList {

	private ArrayList<Record> records;

	public void addRecord(int recordId, String activityName, Participant participant) {
		Record newRecord = new Record(recordId, activityName, participant);
		records.add(newRecord);
	}

	public void removeRecord(Record record) {
		records.remove(record);
	}

	public ArrayList<Record> searchRecords(String activityName) {
		ArrayList<Record> matchingRecords = new ArrayList<>();
		for (Record record : records) {
			if (record.getActivityName().equalsIgnoreCase(activityName)){
				matchingRecords.add(record);
			}
		}
		return matchingRecords;
	}
    
    public void modifyRecord(int recordId, String newName, Address newAddress) {
//	public void modifyRecord(int recordId, String newName, int newAge, Address newAddress) {
		for (Record record : records) {
			if (record.getRecordId() == recordId) {
				record.setActivityName(newName);
//				record.setAge(newAge);
				record.setAddress(newAddress);
				break;
			}
		}
	}

	// public void saveRecord() {

	// }

	// public Record getCurrentRecord(String activityName, Partic) {

	// }

	
	public boolean hasNextRecord() {
		return true;
	}

	public boolean hasPreviousRecord() {
		// TODO - implement RecordList.hasPreviousRecord
		throw new UnsupportedOperationException();
	}

	public void moveToNextRecord() {

	}

	public void moveToPreviousRecord() {
		// TODO - implement RecordList.moveToPreviousRecord
		throw new UnsupportedOperationException();
	}


	public void moveToFirstRecord() {
		// TODO - implement RecordList.moveToFirstRecord
		throw new UnsupportedOperationException();
	}

	public void moveToLastRecord() {
		// TODO - implement RecordList.moveToLastRecord
		throw new UnsupportedOperationException();
	}

	public void sortByAcitivtyName() {
		// TODO - implement RecordList.sortByAcitivtyName
		throw new UnsupportedOperationException();
	}

	public void sortByStartingDate() {
		// TODO - implement RecordList.sortByStartingDate
		throw new UnsupportedOperationException();
	}

}