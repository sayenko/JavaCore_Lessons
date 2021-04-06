package ua.lviv.lgs;

import java.util.*;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
        Cinema cinema = new Cinema(new Time(10, 00), new Time(23, 00));
//        Titanic 120 189
//        Home Alone 184
//        The Silence of the Lambs 197

        while (true) {
            System.out.println("������ ����� ����:");
            System.out.println("1. ������ ����� � ����������");
            System.out.println("2. ������ ����� ������ � �������");
            System.out.println("3. �������� ����� � ���������� � ��������");
            System.out.println("4. �������� ���������� ����� ������");
            System.out.println("5. �������� Cinema");
            System.out.println("6. ����� � ��������");
            try {
                menu(cinema);
            } catch (Exception e) {
                break;
            }
        }
    }

    public static void menu(Cinema cinema) {
        Scanner scanner = new Scanner(System.in);
        CinemaMenuInterface cm1 = Main::addMovie;
        CinemaMenuInterface cm2 = Main::addSeance;
        CinemaMenuInterface cm3 = Main::removeMovie;
        CinemaMenuInterface cm4 = Main::removeSeance;
        Consumer<Cinema> cm5 = Main::showCinema;
        Consumer<Scanner> cm6 = Main::exit;

        switch (scanner.nextLine()) {
            case "1" -> cm1.menu(cinema, scanner);
            case "2" -> cm2.menu(cinema, scanner);
            case "3" -> cm3.menu(cinema, scanner);
            case "4" -> cm4.menu(cinema, scanner);
            case "5" -> cm5.accept(cinema);
            case "6" -> cm6.accept(scanner);
        }
    }

    public static void showCinema(Cinema cinema) {
        System.out.println(cinema);
    }

    public static void addMovie(Cinema cinema, Scanner scanner) {
        System.out.println("������ ����� � ���������� moviesLibrary");
        System.out.println("������ ����� ������");
        String movieName = scanner.nextLine();
        int duration;
        while (true) {
            System.out.println("������ ��������� ������ � ��������");
            try {
                duration = scanner.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("������� �� �������� ��������� ������");
                scanner.next();
            }
        }
        cinema.addMovie(new Movie(movieName, new Time(duration)));
    }

    public static void addSeance(Cinema cinema, Scanner scanner) {
        System.out.println("������ ����� ������ � �������");
        String day = null;

        while (true) {
            System.out.println("������ ���� ������");
            try {
                day = scanner.nextLine();
                String dayStream = day.toUpperCase();                
                if(Arrays.stream(Days.values()).anyMatch(d -> d.toString().equals(dayStream))){
                    break;
                }
            } catch (Exception e) {
                System.out.println("�������� �� ���������� ���� �����");
                scanner.next();
            }
        }

        List<Movie> movies = cinema.getMoviesLibrary();
        System.out.println("������ ����� ������");
        String movieName = scanner.nextLine();
        while (movies.stream().noneMatch(movie -> movieName.equalsIgnoreCase(movie.getTitle()))) {
            System.out.println("����� ����� �� �� ����� � ����������. ������? (Yes/No)");
            String addMovieToLibrary = scanner.nextLine();
            if (addMovieToLibrary.equalsIgnoreCase("Yes")) {
                addMovie(cinema, scanner);
            } else return;
        }

        int hour;
        while (true) {
            System.out.println("������ ������ ������� ������");
            try {
                hour = scanner.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("������� �� �������� ������ ������� ������");
                scanner.next();
            }
        }

        int min;
        while (true) {
            System.out.println("������ ������� ������� ������");
            try {
                min = scanner.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("������ �� ������� ������� ������� ������");
                scanner.next();
            }
        }

        int hourStream = hour;
        int minStream = min;
        String dayStream = day;
        movies.stream().filter(movie -> movie.getTitle().equalsIgnoreCase(movieName))
                .findFirst()
                .ifPresent(movie -> cinema.addSeance(new Seance(movie, new Time(hourStream, minStream)), dayStream));
    }

    public static void removeMovie(Cinema cinema, Scanner scanner) {
        System.out.println("�������� ����� �� moviesLibrary");
        System.out.println("������ ����� ������");
        String movieName = scanner.nextLine();

        int duration;
        while (true) {
            System.out.println("������ ��������� ������ � ��������");
            try {
                duration = scanner.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("������� �� �������� ��������� ������");
                scanner.next();
            }
        }
        cinema.removeMovie(new Movie(movieName, new Time(duration)));
    }

    public static void removeSeance(Cinema cinema, Scanner scanner) {
        System.out.println("�������� ����� �� ������");
        String day = null;

        while (true) {
            System.out.println("������ ���� ������");
            try {
                day = scanner.nextLine();
                String dayStream = day.toUpperCase();
                if(Arrays.stream(Days.values()).anyMatch(d -> d.toString().equals(dayStream))){
                    break;
                }
            } catch (Exception e) {
                System.out.println("�������� �� ���������� ���� �����");
                scanner.next();
            }
        }

        List<Movie> movies = cinema.getMoviesLibrary();
        System.out.println("������ ����� ������");
        String movieName = scanner.nextLine();
        if(movies.stream().noneMatch(movie -> movie.getTitle().equalsIgnoreCase(movieName))) {
            System.out.println("Գ���� � ����� ������ �� ��������");
            return;
        }

        int hour;
        while (true) {
            System.out.println("������ ������ ������� ������");
            try {
                hour = scanner.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("������� �� �������� ������ ������� ������");
                scanner.next();
            }
        }

        int min;
        while (true) {
            System.out.println("������ ������� ������� ������");
            try {
                min = scanner.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("������ �� ������� ������� ������� ������");
                scanner.next();
            }
        }

        int hourStream = hour;
        int minStream = min;
        String dayStream = day;
        movies.stream().filter(movie -> movie.getTitle().equalsIgnoreCase(movieName))
                .findFirst()
                .ifPresent(movie -> cinema.removeSeance(new Seance(movie, new Time(hourStream, minStream)), dayStream));
    }

    public static void exit(Scanner scanner) {
        scanner.close();
        System.exit(0);
    }
}

interface CinemaMenuInterface {
    void menu(Cinema cinema, Scanner scanner);
}
