package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class LoopPlaylist extends Utils {

    @Test
    public void verifyUserHasPlayed3Songs() {
        System.out.println("user has played 3 songs "+ playThreeSongs());
        Assert.assertEquals(playThreeSongs().size(),3);
    }

    @Test
    public void verifyPlaylistSequenceWhen_S4_S2_S1_PlayedOneAfterOther() {

        //When S4 Played after 3 songs
        ArrayList<String> s4 = songList("S4",playThreeSongs() );
        String[] expectedLists4 = {"S2", "S3", "S4"};
        Assert.assertEquals(s4.toArray(),expectedLists4);

        //When S2 played after S4
        String[] expectedLists2 = {"S3", "S4", "S2"};
        ArrayList<String> s2 = songList("S2",s4 );
        Assert.assertEquals(s2.toArray(),expectedLists2);

        //When S1 played after S2
        String[] expectedLists1 = {"S4", "S2", "S1"};
        ArrayList<String> s1 = songList("S1",s2 );
        Assert.assertEquals(s1.toArray(),expectedLists1);
    }

}