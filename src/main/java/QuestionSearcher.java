import java.util.HashMap;
import java.util.Map;

public class QuestionSearcher {
    private static final Map<String, Question> questionMap = new HashMap<String, Question>() {

        {
            put("4-1", new Question1());
            put("4-2", new Question2());
            put("4-3", new Question3());
            put("4-4", new Question4());
            put("4-5", new Question5());
            put("4-6", new Question6());
            put("4-7", new Question7());
            put("4-8", new Question8());
            put("4-9", new Question9());
            put("4-10", new Question10());
            put("4-11", new Question11());
            put("4-12", new Question12());
            put("4-13", new Question13());
            put("4-14", new Question14());
            put("4-15", new Question15());
            put("4-16", new Question16());
            put("4-17", new Question17());
            put("4-18", new Question18());
            put("4-19", new Question19());
            put("4-20", new Question20());
            put("4-21", new Question21());
            //put("4-22", new Question22());
            put("err", new OutOfQuestion());
        }

    };

    public static void selectQuestion(String s) {
        System.out.println(s);
        try {
            questionMap.get(s).run();
        } catch (NullPointerException e) {
            questionMap.get("err").run();
        }

    }
}
