import java.util.*;
public class HashMapTest {
    public static void main(String[] Args){
        HashMap<String, String> tracklist = new HashMap<>();

        tracklist.put("不能说的秘密", "最美的不是下雨天，是曾与你躲过雨的屋檐。");
        tracklist.put("珊瑚海", "转身离开，分手说不出来，海鸟跟鱼相爱，只是一场意外。");
        tracklist.put("轨迹", "我会发着呆然后忘记你，接着紧紧闭上眼，想着那一天会有人代替，让我不再想念你。");
        tracklist.put("蒲公英的约定", "而我已经分不清 你是友情 还是错过的爱情");

//        System.out.println(tracklist.get("轨迹"));

        for (String title: tracklist.keySet()){
            System.out.printf("Title: %s  Lyric: %s %n", title, tracklist.get(title));
        }

    }

}
