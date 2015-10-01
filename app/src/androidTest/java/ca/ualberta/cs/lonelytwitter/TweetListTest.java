package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

import junit.framework.TestCase;

import java.util.ArrayList;

/**
 * Created by dzhang4 on 9/30/15.
 */
public class TweetListTest extends ActivityInstrumentationTestCase2 {
    public TweetListTest() {
        super(LonelyTwitterActivity.class);
    }

    public void testDeleteTweet() {
        TweetList tweetList=new TweetList();
        Tweet tweet=new NormalTweet("hihihi");
        tweetList.addTweet(tweet);
        tweetList.removeTweet(tweet);
        assertFalse(tweetList.hasTweet(tweet));
    }

    public void testHasTweet() {
        TweetList tweetList=new TweetList();
        Tweet tweet=new NormalTweet("hihihi");
        assertFalse(tweetList.hasTweet(tweet));
        tweetList.addTweet(tweet);
        assertTrue(tweetList.hasTweet(tweet));

    }
    public void testAddTweet() {
        TweetList tweetList=new TweetList();
        Tweet tweet=new NormalTweet("hihihi");
        tweetList.addTweet(tweet);
        assertTrue(tweetList.hasTweet(tweet));

        //add same tweet
        boolean t=true;

        try {
            tweetList.addTweet(tweet);
        }catch (IllegalArgumentException e){
            t=false;
        }
        assertTrue(t == false);
    }

    public void testTweetCount() {
        TweetList tweetList=new TweetList();
        Tweet tweet=new NormalTweet("hihihi");
        tweetList.addTweet(tweet);
        assertTrue(tweetList.hasTweet(tweet));

        Tweet tweet1=new NormalTweet("hihihih");
        tweetList.addTweet(tweet1);
        assertTrue(tweetList.hasTweet(tweet1));

        assertTrue(tweetList.getCount()==2);

    }

    public void testGetTweets() {
        TweetList tweetList=new TweetList();
        Tweet tweet=new NormalTweet("hihihi");
        tweetList.addTweet(tweet);
        Tweet tweet1=new NormalTweet("hihihih");
        tweetList.addTweet(tweet1);

        ArrayList rt=new ArrayList();
        rt.add(tweet);
        rt.add(tweet1);
        ArrayList returnedTweet=tweetList.getTweets();
        int n=returnedTweet.size();
        for(int i=0;i<n;i++) {
            //assert elements are equal
            assertTrue((rt.equals(returnedTweet.get(i)) && (rt.equals(returnedTweet.get(i)))));
        }
    }

    public void testGetTweetType() {

    }
}