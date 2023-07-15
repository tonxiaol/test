
package kidsactivitymanager;

/**
 *
 * @author tongx
 */
public class KidsActivityManager {

    public static void main(String[] args) {
        List<Record> recordList = readRecordsFromCSV("../kidsActivities.csv");

        for (Record r : recordList) {
            System.out.println(r);
        }
        
    }
    
}
