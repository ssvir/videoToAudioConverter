package com.violence;

import ws.schild.jave.AudioAttributes;
import ws.schild.jave.Encoder;
import ws.schild.jave.EncodingAttributes;
import ws.schild.jave.MultimediaObject;

import java.io.File;

public class VideoConverter {

    public void convertVideoToAudio(File video){
        File audio = new File("G:\\project\\videoToAudioConverter\\audioM.mp3");
        AudioAttributes audioAttributes = new AudioAttributes();
        audioAttributes.setBitRate(128000);
        audioAttributes.setChannels(2);
        audioAttributes.setSamplingRate(44100);

        EncodingAttributes attributes = new EncodingAttributes();
        attributes.setFormat("mp4");
        attributes.setAudioAttributes(audioAttributes);

        Encoder encoder = new Encoder();
        try {
            encoder.encode(new MultimediaObject(video), audio, attributes);
        }catch (Exception e) {
            System.out.println("can't encode");
        }
    }

    public static void main(String [] args){
        new VideoConverter().convertVideoToAudio(new File("G:\\project\\videoToAudioConverter\\videoToAudi.mp4"));
    }

}
