package background;

import java.util.ArrayList;

public class CasheQuerryResult {
    private final ArrayList<ArrayList<Object>> resultList;
    
    public CasheQuerryResult(ArrayList<ArrayList<Object>> resultList) {
        this.resultList = resultList;
    }
    public ArrayList<ArrayList<Object>> getResultList(){
        return resultList;
    }
}