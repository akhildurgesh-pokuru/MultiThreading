package Patterns.Observer;

public class Main {
    public static void main(String[] args){
        YoutubeSubcriber subcriber = new YoutubeSubcriber(122, "akhil");
        YoutubeSubcriber subcriber1 = new YoutubeSubcriber(423,"charan");

        CuriousCoder coder = new CuriousCoder();
        coder.addSubscriber(subcriber);
        coder.addSubscriber(subcriber1);

        coder.added();
    }
}
