package Patterns.Builder;

public class Main {
    public static void main(String[] args){
        Marketing marketing = new Marketing();
        marketing.marketingDetails();
        Technology technology = new Technology();
        technology.technologyDetails();
        Financial financial = new Financial();
        financial.financialDetails();
    }
}
