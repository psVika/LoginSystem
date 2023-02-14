import java.util.HashMap;

public class IDandPasswords {
    HashMap<String, String> loginfo = new HashMap<String,String>();
    IDandPasswords(){
        loginfo.put("Bro","pizza");
        loginfo.put("Maria","1258");
        loginfo.put("Alex", "abc123");
    }
    protected HashMap getLoginInfo(){
        return loginfo;
    }
}
