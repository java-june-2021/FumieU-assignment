import java.util.HashMap;
import java.util.Set;

public class HashMatique{
    public static void main(String[] args){

    HashMap<String, String> trackList = new HashMap<String, String>();
    trackList.put("Top of the world", "Such a feelin's comin' over me");
    trackList.put("Yesterday once more", "When I was young I listend the radio");
    trackList.put("Jambalaya", "Goodbye, Joe, he gotta go, me oh my oh");
    trackList.put("Goodbye to Love", "I'll say goodbye to loveh");

    String song = trackList.get("Yesterday once more");
        for(String key : trackList.keySet()) {
            System.out.println("Track: " + key + " Lyric: " + trackList.get(key));
        }
    }
}