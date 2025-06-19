package ar.edu.unlp.info.oo1;

import java.util.Collection;
import java.util.List;

public class DatabaseAccessProxy implements DatabaseAccess {
    private DatabaseRealAccess realDataBase;
    private boolean authenticated;


    public DatabaseAccessProxy(DatabaseRealAccess realDataBase) {
        this.realDataBase = realDataBase;
        this.authenticated = false;
    }

    public void authenticate() {
        authenticated = true;
    }


    public Collection<String> getSearchResults(String queryString){
        if (! this.authenticated) {
            throw new RuntimeException();
        } else {
            return realDataBase.getSearchResults(queryString);
        }
    }

    public int insertNewRow(List<String> rowData) {
        if (! this.authenticated) {
            throw new RuntimeException();
        } else {
            return insertNewRow(rowData);
        }
    }


}
