package kidsactivitymanager.test;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class RecordList {

	private ArrayList<Record> records;

	public void addRecord(int recordId, String activityName, Participant pariticipant) {
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

	public void sortRecordsByActivityName() {
        Collections.sort(records, Comparator.comparing(Record::getActivityName));
    }

	public void sortRecordByStartDate() {
        Collections.sort(records, Comparator.comparing(Record::getSchedule));
    }

	public void modifyRecord(int recordId, String newName, int newAge, Address newAddress) {
		for (Record record : records) {
			if (record.getRecordId() == recordId) {
				record.setName(newName);
				record.setAge(newAge);
				record.setAddress(newAddress);
				break;
			}
		}
	}

	// public void saveRecord() {

	// }

	// public Record getCurrentRecord(String activityName, Partic) {

	// }

	public void sortByAcitivtyName(String activityName) {


	}

	public void sortByStartingDate() {
		// TODO - implement RecordList.sortByStartingDate
		throw new UnsupportedOperationException();
	}

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



}