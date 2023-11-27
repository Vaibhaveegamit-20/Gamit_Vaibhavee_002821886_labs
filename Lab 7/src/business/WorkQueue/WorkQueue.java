/*
 * 
 */
package business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author vaibhaveegamit
 */
public class WorkQueue {
    private ArrayList<WorkRequest> workRequestList;

    public WorkQueue() {
        workRequestList = new ArrayList<>();
    }

    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }
}
