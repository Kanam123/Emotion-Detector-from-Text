import java.util.*;

public class EmotionDetectorFromText {
    public static void main(String[] args) {
        Map<String, List<String>> keywords = new HashMap<>();
        keywords.put("happy", Arrays.asList("happy", "joy", "cheerful", "glad", "delighted", "excited"));
        keywords.put("sad", Arrays.asList("sad", "unhappy", "gloomy", "cry", "depressed"));
        keywords.put("angry", Arrays.asList("angry", "mad", "furious", "irritated", "annoyed"));
        keywords.put("tired", Arrays.asList("tired", "sleepy", "exhausted", "weary"));
        keywords.put("excited", Arrays.asList("excited", "thrilled", "amazed", "overjoyed"));

        Map<String, String> emoji = new HashMap<>();
        emoji.put("happy", "\uD83D\uDE04");
        emoji.put("sad", "\uD83E\uDD17");
        emoji.put("angry", "\uD83D\uDE24");
        emoji.put("tired", "\uD83D\uDE34");
        emoji.put("excited", "\uD83C\uDF89");

        Scanner sc = new Scanner(System.in);
        while (true) {
            String input = sc.nextLine().toLowerCase().trim();
            if (input.equals("exit")) break;
            String cleaned = input.replaceAll("[^a-z\\s]", "");
            String[] words = cleaned.split("\\s+");
            String detected = null; int max = 0;
            Map<String,Integer> count = new HashMap<>();
            for (String e : keywords.keySet()) count.put(e, 0);
            for (String w : words)
                for (String e : keywords.keySet())
                    if (keywords.get(e).contains(w)) count.put(e, count.get(e)+1);
            for (String e : count.keySet())
                if (count.get(e) > max) { detected = e; max = count.get(e); }
            System.out.println(detected != null ? detected + " " + emoji.get(detected) : "No emotion detected");
        }
        sc.close();
    }
}




