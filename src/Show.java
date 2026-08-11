import java.util.ArrayList;
import java.util.List;

public class Show {
    protected String title;
    protected int duration; // длительность в минутах
    protected Director director;
    protected List<Actor> listOfActors;

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public Director getDirector() {
        return director;
    }

    public List<Actor> getListOfActors() {
        return listOfActors;
    }

    // добавление актера
    public void addActor(Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println("Предупреждение: Актёр " + actor + " уже участвует в спектакле \"" + title + "\"");
        } else {
            listOfActors.add(actor);
            System.out.println("Актёр " + actor + " добавлен в спектакль \"" + title + "\"");
        }
    }

    // замена актёра
    public void replaceActor(Actor newActor, String surnameToReplace) {
        boolean found = false;
        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).getSurname().equals(surnameToReplace)) {
                listOfActors.set(i, newActor);
                found = true;
                System.out.println("Актёр с фамилией " + surnameToReplace + " заменён на " + newActor);
                break;
            }
        }
        if (!found) {
            System.out.println("Предупреждение: Актёр с фамилией \"" + surnameToReplace + "\" не найден в спектакле \"" + title + "\"");
        }
    }

    // вывод списка актеров
    public void printActors() {
        System.out.println("Список актёров в спектакле \"" + title + "\":");
        if (listOfActors.isEmpty()) {
            System.out.println("  (актёры отсутствуют)");
        } else {
            for (Actor actor : listOfActors) {
                System.out.println("  - " + actor);
            }
        }
        System.out.println();
    }

    // вывод информации о режиссере
    public void printDirectorInfo() {
        System.out.println("Режиссёр спектакля \"" + title + "\": " + director);
    }

    @Override
    public String toString() {
        return "Спектакль \"" + title + "\", длительность: " + duration + " мин., режиссёр: " + director;
    }
}