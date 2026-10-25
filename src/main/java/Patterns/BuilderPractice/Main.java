package Patterns.BuilderPractice;

public class Main {
    public static void main(String[] args){
        Technology tech = new Technology();
        tech.tech();

        Financial financial = new Financial();
        financial.finance();

        Marketing market = new Marketing();
        market.market();
    }
}
