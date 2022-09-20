import java.util.ArrayList;

class Playlist {

    public static void main(String[] args) {

        ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
        desertIslandPlaylist.add("Desert Rose");
        desertIslandPlaylist.add("Show must go on");
        desertIslandPlaylist.add("Sorry seems to be the hardest word");
        desertIslandPlaylist.add("Hallelujah");
        desertIslandPlaylist.add("We don't talk anymore");
        desertIslandPlaylist.add("Supergirl");

        System.out.println(desertIslandPlaylist);
        System.out.println(desertIslandPlaylist.size());

        desertIslandPlaylist.remove(2);
        System.out.println(desertIslandPlaylist.size());

        String a = "Desert Rose";
        String b = "Show must go on";

        desertIslandPlaylist.set(0, b);
        desertIslandPlaylist.set(1, a);
        System.out.println(desertIslandPlaylist);

        int indexA = desertIslandPlaylist.indexOf("Desert Rose");
        int indexB = desertIslandPlaylist.indexOf("Show must go on");

        System.out.println(indexA);
        System.out.println(indexB);

        String tempA = "Desert Rose";
        desertIslandPlaylist.set(indexA, b);
        System.out.println(desertIslandPlaylist);

        desertIslandPlaylist.set(indexB, tempA);
        System.out.println(desertIslandPlaylist);

    }

}
