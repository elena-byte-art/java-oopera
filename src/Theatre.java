public class Theatre {
    public static void main(String[] args) {
        System.out.println("--- Добро пожаловать в театр! ---\n");

        // Создаём актёров
        Actor actor1 = new Actor("Иван", "Ишаков", Gender.MALE, 180);
        Actor actor2 = new Actor("Галина", "Иванова", Gender.FEMALE, 165);
        Actor actor3 = new Actor("Дмитрий", "Гроздин", Gender.MALE, 175);
        Actor actor4 = new Actor("Елена", "Смирнова", Gender.FEMALE, 170);
        Actor actor5 = new Actor("Николай", "Козлов", Gender.MALE, 185);

        System.out.println("Созданы актёры:");
        System.out.println(actor1);
        System.out.println(actor2);
        System.out.println(actor3);
        System.out.println(actor4);
        System.out.println(actor5 + "\n");

        // Создаём режиссёров
        Director director1 = new Director("Артём", "Чехов", Gender.MALE, 25);
        Director director2 = new Director("Ольга", "Некрасова", Gender.FEMALE, 18);

        System.out.println("Созданы режиссёры:");
        System.out.println(director1);
        System.out.println(director2 + "\n");

        // Создаём автора музыки и хореографа
        String musicAuthor = "Евгений Чайковский";
        String choreographer = "Мариус Петипа";

        // Создаём спектакли
        Show drama = new Show("Вишнёвый сад", 180, director1);
        Opera opera = new Opera("Евгений Онегин", 210, director2,
                musicAuthor,
                "Либретто оперы 'Евгений Онегин' по мотивам романа А.С. Пушкина.\n" +
                        "Татьяна пишет письмо Онегину...",
                20);
        Ballet ballet = new Ballet("Лебединое озеро", 150, director1,
                musicAuthor,
                "Либретто балета 'Лебединое озеро'.\n" +
                        "Принц Зигфрид встречает прекрасную Одетту...",
                choreographer);

        System.out.println("Созданы спектакли:");
        System.out.println(drama);
        System.out.println(opera);
        System.out.println(ballet + "\n");

        System.out.println("--- Распределение актёров по спектаклям ---\n");

        // Распределяем актёров по спектаклям
        // Вишнёвый сад
        drama.addActor(actor1);
        drama.addActor(actor2);
        drama.addActor(actor3);
        drama.addActor(actor1); // дубль

        // Евгений Онегин
        opera.addActor(actor2);
        opera.addActor(actor3);
        opera.addActor(actor4);

        //Лебединое озеро
        ballet.addActor(actor1);
        ballet.addActor(actor3);
        ballet.addActor(actor5);

        System.out.println("\n--- Списки актёров для каждого спектакля ---\n");

        //Выводим списки актеров
        drama.printActors();
        opera.printActors();
        ballet.printActors();

        System.out.println("--- Замена актёров ---\n");

        // Замена актера в спектакле
        System.out.println("Замена актёра в спектакле 'Вишнёвый сад':");
        drama.replaceActor(actor4, "Иванова");
        drama.printActors();

        // Замена несуществующего актера
        System.out.println("Попытка заменить несуществующего актёра в опере:");
        opera.replaceActor(actor5, "Пупкин");
        opera.printActors();

        System.out.println("--- Информация о режиссёрах ---\n");
        drama.printDirectorInfo();
        opera.printDirectorInfo();
        ballet.printDirectorInfo();
        System.out.println();

        // либретто
        System.out.println("--- Либретто музыкальных спектаклей ---\n");
        opera.printLibretto();
        ballet.printLibretto();

        System.out.println("--- Программа завершена ---");
    }
}