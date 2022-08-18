public class MadLibs {
    /*
     * This program generates a mad libbed story.
     * Author: Yanina
     * Date: 8/17/2022
     */
    public static void main(String[] args) {
        String name1 = "Yanina";
        String adjective1 = "nice";
        String adjective2 = "beautiful";
        String adjective3 = "kind";
        String verb1 = "meet";
        String noun1 = "gold";
        String noun2 = "silver";
        String noun3 = "laptop";
        String noun4 = "phone";
        String noun5 = "backpack";
        String noun6 = "car";
        String name2 = "Sergii";
        int number = 17;
        String place1 = "Toronto";

        // The template for the story
        String story = "This morning " + name1 + " woke up feeling " + adjective1 + ". 'It is going to be a "
                + adjective2 + " day!' Outside, a bunch of " + noun1 + "s were protesting to keep " + noun2
                + " in stores. They began to " + verb1 + " to the rhythm of the " + noun3 + ", which made all the "
                + noun4 + "s very " + adjective3 + ". Concerned, " + name1 + " texted " + name2 + ", who flew " + name1
                + " to " + place1 + " and dropped " + name1 + " in a puddle of frozen " + noun5 + ". " + name1
                + " woke up in the year " + number + ", in a world where " + noun6 + "s ruled the world.";
        System.out.println(story);
    }
}
