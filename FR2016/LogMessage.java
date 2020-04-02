

public class LogMessage{
    private String machineId,description;
    public LogMessage(String str){
        int i=str.indexOf(":");
        machineId=str.substring(0,i);
        description=str.substring(i+1);
    }
    public boolean containsWord(String w){
        int i=description.indexOf(w);
        return (i!=-1 && (i==0 || description.charAt(i-1)==" ") &&
                (i+w.length()==description.length() || description.charAt(i+w.length())==" ")); // check
    }
    public String getMachineId() {return machineId;}
    public String getDescription() {return description;}
}

class SystemLog{
    private List<LogMessage> messageList;

    public List<LogMessage> removedMessages(String w){
        List<LogMessage> arr=new ArrayList<LogMessage>();
        for (int i=0; i<messageList.size(); i++){
            LogMessage m=messageList.get(i);
            if (m.containsWord(w)) {arr.add(messageList.remove(i)); i--;}
        }
        return arr;
    }
}