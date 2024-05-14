package Movie;

public class Movies {
    private String title;

    public Movies(String title){
        this.title = title;
    }

    public void watchMovie(){
        String type = this.getClass().getSimpleName();
        System.out.println(title + " is an " + type);
    }

    public static Movies getMovieType(String title, String type){

        return switch (type.toUpperCase().charAt(0)){
          case 'A' -> new Action(title);
          case 'C' -> new Comedy(title);
          case 'H' -> new Horror(title);
          case 'L' -> new LoveStory(title);
          case 'S' -> new ScienceFiction(title);
          default -> new Movies(title);
        };
    }
}

class ScienceFiction extends Movies {
    public ScienceFiction(String title){
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.println("Scene of large landscapes with a orange sun");
        System.out.println("Your are watching a movie from another world");
    }
}

class Horror extends Movies {
    public Horror(String title){
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.println("Mood music starts");
        System.out.println("Sounds from the background");
    }
}

class Action extends Movies {
    public Action(String title){
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.println("Things blow up");
        System.out.println("Things blow up more");
        System.out.println("Things blow up with music in the background");
    }
}

class Comedy extends Movies {
    public Comedy(String title){
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.println("People laugh");
        System.out.println("People laugh");
    }
}

class LoveStory extends Movies {
    public LoveStory(String title){
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.println("People love each other");
    }
}