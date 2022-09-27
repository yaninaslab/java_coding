class Language {
    protected String name;
    protected int numSpeakers;
    protected String regionsSpoken;
    protected String wordOrder;

    Language(String langName, int speakers, String regions, String wdOrder) {
        this.name = langName;
        this.numSpeakers = speakers;
        this.regionsSpoken = regions;
        this.wordOrder = wdOrder;
    }

    public void getInfo() {
        System.out.println(
                this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken + ".");
        System.out.println("The language follows the word order: " + this.wordOrder);
    }

    public static void main(String[] args) {

        Language russian = new Language("Russsian", 200000000, "USSR", "arbitrary");
        russian.getInfo();

        Mayan akatek = new Mayan("Akatek", 5000);
        akatek.getInfo();

        SinoTibetan mandarin = new SinoTibetan("Mandarin", 2000000000);
        mandarin.getInfo();

        SinoTibetan burmese = new SinoTibetan("Burmese", 1000000000);
        burmese.getInfo();

    }

}