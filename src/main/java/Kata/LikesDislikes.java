package Kata;

public class LikesDislikes {

    public Action likeOrDislike(String[] input) {
        int count = 0;
        for (String action : input) {
            if (action.equals("DISLIKE"))
                count--;
            else if (action.equals("LIKE"))
                count++;
        }
        if (count == -1)
            return Action.DISLIKE;
        else if (count == 1)
            return Action.LIKE;
        return Action.NEUTRAL;
    }
}
