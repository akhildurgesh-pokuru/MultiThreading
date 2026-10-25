package Patterns.Observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class CuriousCoder {
    List<YoutubeSubcriber> subscribers = new ArrayList<>();

    public void addSubscriber(YoutubeSubcriber youtubeSubcriber){
        subscribers.add(youtubeSubcriber);
    }

    public void addedVideo(){
        for(YoutubeSubcriber subcriber : subscribers){
            subcriber.notifySubscribers(subcriber);
        }
    }

    public void added(){
        addedVideo();
    }
}
