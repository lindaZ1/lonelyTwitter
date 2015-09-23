package ca.ualberta.cs.lonelytwitter;

import java.io.IOException;
import java.util.Date;

/**
 * Created by dzhang4 on 9/16/15.
 */
public class NormalTweet extends Tweet {
    public NormalTweet(Date date, String tweet) throws IOException{
        super(date, tweet);
    }

    public NormalTweet(String tweet) {
        super(tweet);
    }

    public Boolean isImportant() {
        return Boolean.FALSE;
    }
}
