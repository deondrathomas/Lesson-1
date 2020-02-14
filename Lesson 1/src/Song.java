public class Song {

   private String title;
   private int rating;
   private double price;
   private boolean favorite;
   private static int numSongs;

   public Song()
   {
       // initialise instance variables
       title = "Twist and Shout";
       rating = 0;
       price = 0.0;

   }
   public String getTitle(){
       return title;
   }
   public Song(String t, double p) {
       this.title = t;
       this.price = p;

       numSongs = numSongs + 1;

   }
   public Song(String t, double p, int r){
       this.title = t;
       this.price = p;
       this.rating = r;
       numSongs = numSongs + 1;
   }
   public double getPrice() {
       return price;
   }

    public double getNumSong() {
        return numSongs;
    }

    public void setTitle(String t) {
       title = t;
   }
   public int getRating(){

       return rating;
   }
   public void setRating(int r)
   {
       rating = r;
   }
   public int getSongs(){
       return numSongs;
   }
}
