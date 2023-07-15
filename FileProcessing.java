public class FileProcessing {

    /*
     * 
    * Open CSV file using FileReader object
    * Create BufferedReader from FileReader
    * Read file line by line using readLine() method
    * Split each line on comma to get an array of attributes using String.split() method
    * Create an object of Book class from String array using new Book()
    * Add those object into ArrayList using add() method
    * Return the List of books to the caller

     */

     public static List<Record> readRecordsFromCSV(String fileName) {
        List<Record> recordList = new ArrayList<>();

        Path path = Paths.get(fileName);

        try(BufferedReader in = new BufferedReader(new FileReader("path"))){
            //read the first line
            String recordLine = in.readLine();

            // read all lines
            while (recordLine != null) {
                // split the fields by delimiter
                String[] fields = recordLine.split(",");

                Record newRecord = new Record();

                // recordId in the csv file will be discarded as the system will generate recordId automatically
                for (int i = 1; i < fields.length; i++) {
                    if (fields[i] != null) {
                        switch(i) {
                            case 1: 
                            newRecord.setActivityName(fields[i]);
                            break;
                            case 2:
                            newRecord.setAddress().setCity(fields[i]);
                            break;
                        }
                        recordList.add(newRecord);
                    }

                }
                recordLine = in.readLine();
            }
            return recordList;
        }
     }
    
}
