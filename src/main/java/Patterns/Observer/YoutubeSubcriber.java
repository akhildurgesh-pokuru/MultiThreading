package Patterns.Observer;

public class YoutubeSubcriber {
    int id;
    String name;

    YoutubeSubcriber(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void notifySubscribers(YoutubeSubcriber subcriber){
        System.out.println(subcriber.name+ " :A video has released by curious");
    }
}
