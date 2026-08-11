public abstract class MusicalShow extends Show {
    protected String musicAuthor; // автор музыки
    protected String librettoText; // текст либретто

    public MusicalShow(String title, int duration, Director director,
                       String musicAuthor, String librettoText) {
        super(title, duration, director);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public String getMusicAuthor() {
        return musicAuthor;
    }

    public String getLibrettoText() {
        return librettoText;
    }

    // Метод для печати либретто
    public void printLibretto() {
        System.out.println("--- Либретто спектакля \"" + title + "\" ---");
        System.out.println(librettoText);
        System.out.println("----------------------------------------------\n");
    }

    @Override
    public String toString() {
        return super.toString() + ", автор музыки: " + musicAuthor;
    }
}