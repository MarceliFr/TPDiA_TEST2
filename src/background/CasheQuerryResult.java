package background;

import java.util.ArrayList;

public class CasheQuerryResult {
    private int lastRecentlyUsed;
    private int leastFrequentlyUsed;
    
    private final int size;
    private final ArrayList<ArrayList<Object>> resultList;
    private final String querry;
    
    public CasheQuerryResult(ArrayList<ArrayList<Object>> resultList, String querry) {
        this.resultList = resultList;
        this.querry = querry;
        this.size = resultList.size();
        this.lastRecentlyUsed = 0;
        this.lastRecentlyUsed = 0;
    }
    public ArrayList<ArrayList<Object>> getResultList(){
        return resultList;
    }
    public String getQuerry(){
        return querry;
    }
    public int getLeastFrequentlyUsed(){
        return leastFrequentlyUsed;
    }
    public int getLastRecentlyUsed(){
        return lastRecentlyUsed;
    }
    public int getSize(){
        return size;
    }
    public void increment(){
        lastRecentlyUsed++;
        leastFrequentlyUsed++;
    }
}