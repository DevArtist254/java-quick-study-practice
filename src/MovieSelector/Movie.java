package MovieSelector;

public class Movie {

    private String title;

    public Movie(String title){
        this.title = title;
    }

    public void watchMovie(){

        String instanceType = this.getClass().getSimpleName();
        System.out.println(title +  " is a " + instanceType + "film");
    }

    public static Movie getTheMovie(String type, String name){

        return switch (type.toUpperCase().charAt(0)){
            case 'A' -> new Adventure(name);
            case 'C' -> new Comedy(name);
            case 'H' -> new Horror(name);
            default -> new Movie(name);
        };
    }
}

class Adventure extends Movie {

    public Adventure(String title){ super(title); }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("... %s%n".repeat(3),
                "Something mystic happens",
                "Music for the rush",
                "People are chased");
    }
}

class Comedy extends Movie {

    public Comedy(String title){ super(title); }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("... %s%n".repeat(3),
                "Something funny happens",
                "Something heart warming happens",
                "Something funny happens");
    }
}

class Horror extends Movie {

    public Horror(String title){ super(title); }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("... %s%n".repeat(3),
                "Guy is alone",
                "Music starts to pay",
                "Horror scene happens");
    }
}
