package c03.e03;

public abstract class Singer {

    private static int next = 1;
    private String name;
    private int number;




    public Singer(String name) {
        this.name = name;
        this.number = next++;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public abstract String sing();

    @Override
    public String toString() {
        return "(" +
                number +
                ")" +
                " " +
                name +
                ":";
    }

    public static String loudest(Singer[] singers) {
        String loudestSong = "";
        String loudestSinger = "";
        int loudestCount = 0;
        int loudestNumber = 0;

        for (Singer singer : singers) {
            String song = singer.sing();
            int counter = 0;
            for (int i = 0; i < song.length(); i++) {
                if (Character.isUpperCase(song.charAt(i))) {
                    counter++;
                }
            }
            if (counter > loudestCount) {
                loudestSong = song;
                loudestCount = counter;
                loudestNumber = singer.getNumber();
                loudestSinger = singer.getName();
            }
        }
        return "(" +
                String.valueOf(loudestNumber) +
                ")" +
                " " +
                loudestSinger +
                ": " +
                loudestSong;
    }

}
