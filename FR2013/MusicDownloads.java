
class DownloadInfo{
    public DownloadInfo(String title){
        //
    }
    public String getTitle(){
        //
    }
    public void incrementTimesDownloaded(){
        //
    }
}

public class MusicDownloads{
    private List<DownloadInfo> downloadList;
    public MusicDownloads() {downloadList=new ArrayList<DownloadInfo>();}
    public DownloadInfo getDownloadInfo(String title){
        for (DownloadInfo d: downloadList){
            if (d.getTitle().equals(title)) {return d;}
        }
        return null;
    }
    public void updateDownloads(List<String> arr){
        for (String s: arr){
            DownloadInfo d=getDownloadInfo(s);
            if (d==null) {downloadList.add(new DownloadInfo(s));}
            else {d.incrementTimesDownloaded();}
        }
    }
}