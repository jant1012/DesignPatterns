package com.janchondo.behavioralPatterns.observer;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VideoPublisherTest {
    @Test
    public void notifyUpdateTest(){
        MessageSuscriberOne suscriberOne = new MessageSuscriberOne();
        MessageSuscriberTwo suscriberTwo = new MessageSuscriberTwo();
        VideoPublisher videoPublisher = new VideoPublisher();

        videoPublisher.register(suscriberOne);
        videoPublisher.register(suscriberTwo);

        List<String> showList = new ArrayList<>();
        showList = videoPublisher.notifyUpdate(new Message("New Video Uploaded"));

        assertThat(showList, hasItems("Suscriber one: New Video Uploaded","Suscriber two: New Video Uploaded"));
    }
}
