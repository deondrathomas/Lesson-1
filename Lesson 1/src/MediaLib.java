public class MediaLib {
    public static void main(String[] args){
        double totalCost=0;
        double aveRating = 0;
        System.out.println("Welcome to my MediaLibrary");
        Song getNumSong = new Song();
        Song song1 = new Song(  "Respect", 1.29,8);
        System.out.println(song1.getTitle() + " " + song1.getTitle() + " " + song1.getTitle() + " ");
        totalCost = song1.getPrice() + totalCost;
        aveRating = song1.getRating() + aveRating;

        Song song2 = new Song("Hello", 1.50, 7);
        System.out.println(song2.getTitle() + " " + song2.getTitle() + " " + song2.getTitle() + " ");
        totalCost = song2.getPrice() + totalCost;
        aveRating = (song2.getRating() + aveRating)/getNumSong.getNumSong();

        Song song3 = new Song("Bye", 1.29, 8);
        System.out.println(song3.getTitle() + " " + song3.getTitle() + " " + song3.getTitle() + " ");
        totalCost = song3.getPrice() + totalCost;
        aveRating = (song3.getRating() + aveRating)/getNumSong.getNumSong();

        Song song4 = new Song("Fantastic", 1.50, 7);
        System.out.println(song4.getTitle() + " " + song4.getTitle() + " " + song4.getTitle() + " ");
        totalCost = song4.getPrice() + totalCost;
        aveRating = (song4.getRating() + aveRating)/getNumSong.getNumSong();

        Song song5 = new Song("Okay", 1.29, 8);
        System.out.println(song5.getTitle() + " " + song5.getTitle() + " " + song5.getTitle() + " ");
        totalCost = song5.getPrice() + totalCost;
        aveRating = (song5.getRating() + aveRating)/getNumSong.getNumSong();

        Song song6 = new Song("LOL", 1.50, 7);
        System.out.println(song6.getTitle() + " " + song6.getTitle() + " " + song6.getTitle() + " ");
        totalCost = song6.getPrice() + totalCost;
        aveRating = (song6.getRating() + aveRating)/getNumSong.getNumSong();

        Song song7 = new Song("Thats Tuff", 1.29, 8);
        System.out.println(song7.getTitle() + " " + song7.getTitle() + " " + song7.getTitle() + " ");
        totalCost = song7.getPrice() + totalCost;
        aveRating = (song7.getRating() + aveRating)/getNumSong.getNumSong();

        System.out.println("Total cost: " + totalCost);
        System.out.println("Average Rating: " +aveRating);
    }
}
