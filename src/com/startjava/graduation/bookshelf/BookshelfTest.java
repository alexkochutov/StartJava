/**
 * Список книг для тестирования приложения
 * 1. "Джоан Кэтлин Роулинг", "Гарри Поттер и философский камень", 1997
 * 2. "Джоан Кэтлин Роулинг", "Гарри Поттер и Тайная комната", 1998
 * 3. "Джоан Кэтлин Роулинг", "Гарри Поттер и узник Азкабана", 1999
 * 4. "Джоан Кэтлин Роулинг", "Гарри Поттер и Кубок огня", 2000
 * 5. "Джоан Кэтлин Роулинг", "Гарри Поттер и Орден Феникса", 2003
 * 6. "Джоан Кэтлин Роулинг", "Гарри Поттер и Принц-полукровка", 2005
 * 7. "Джоан Кэтлин Роулинг", "Гарри Поттер и Дары Смерти", 2007
 * 8. "Джордж Оруэлл", "Скотный двор", 1945
 * 9. "Джордж Оруэлл", "1984", 1949
 * 10. "Ирвинг Стоун", "Жажда жизни", 1973
 * 11. "Рэй Брэдбери", "451 градус по Фаренгейту", 1980
 * 12. "Александр Дюма", "Граф Монте-Кристо", 1844
 * 13. "Александр Дюма", "Три мушкетёра", 1844
 * 14. "Михаил Салтыков", "Дикий помещик", 1869
 * 15. "Михаил Салтыков", "Повесть о том, как один мужик двух генералов прокормил", 1869
 */

package com.startjava.graduation.bookshelf;

import java.util.Scanner;

public class BookshelfTest {
    private final static Bookshelf bookshelf = new Bookshelf();
    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean isRun = true;
        do {
            showShelves();
            showMenu();
            switch (readMenuItem()) {
                case 1 -> addBook();
                case 2 -> findBook();
                case 3 -> removeBook();
                case 4 -> clearBookShelf();
                case 5 -> isRun = false;
            }
            waitForEnter();
        } while(isRun);
    }

    private static void showShelves() {
        int countBooks = bookshelf.getCountBooks();
        if (countBooks == 0) {
            System.out.println("Шкаф пуст. Вы можете добавить в него первую книгу.");
        } else {
            Book[] books = bookshelf.getAllBooks();
            int shelfLength = bookshelf.getMaxLength() + 2;
            String dash = "-".repeat(shelfLength);
            System.out.println("|" + dash + "|");
            for (int i = 0; i < countBooks; i++) {
                String space = " ".repeat(shelfLength - books[i].getLength() - 2);
                System.out.println("| " + books[i] + space + " |");
                if (i != countBooks - 1) {
                    System.out.println("|" + dash + "|");
                }
            }
            System.out.println("|" + dash + "|");
            if (countBooks != Bookshelf.CAPACITY) {
                System.out.println("|" + " ".repeat(shelfLength) + "|");
                System.out.println("|" + dash + "|");
            }
            System.out.println("В шкафу " + bookshelf.getCountBooks() + " книг и " +
                    bookshelf.getEmptyShelves() + " свободных полок.");
        }
    }

    private static void showMenu() {
        System.out.println("""
                1. Сохранить <автор> <название> <год издания>
                2. Найти <название>
                3. Удалить <название>
                4. Очистить шкаф
                5. Выйти
                """);
    }

    private static int readMenuItem() {
        do {
            System.out.println("Введите номер действия [1..5]:");
            try {
                int menuItem = Integer.parseInt(scanner.nextLine());
                if ((menuItem >= 1) && (menuItem <= 5)) {
                    return menuItem;
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Введен недопустимый номер действия! Попробуйте еще раз...");
            }
        } while(true);
    }

    private static void addBook() {
        if (bookshelf.getCountBooks() == Bookshelf.CAPACITY) {
            System.out.println("Невозможно сохранить книгу! Шкаф заполнен!");
        } else {
            String author;
            String title;
            int publishYear;
            do {
                System.out.println("Введите описание книги в формате: \"автор\", \"название\", год издания");
                String[] description = scanner.nextLine().split("\", ");
                try {
                    author = description[0].replaceAll("\"", "");
                    title = description[1].replaceAll("\"", "");
                    publishYear = Integer.parseInt(description[2]);
                    break;
                } catch(RuntimeException e) {
                    System.out.println("Описание книги введено с нарушением формата!  Попробуйте еще раз...");
                }
            } while(true);
            System.out.println((bookshelf.add(new Book(author, title, publishYear))) ?
                    "Книга успешно сохранена!":
                    "Сохранить книгу не удалось! Шкаф заполнен!");
        }
    }

    private static void findBook() {
        if (bookshelf.getCountBooks() == 0) {
            System.out.println("В шкафу нет ни одной книги!");
        } else {
            System.out.println("Введите название искомой книги в формате: \"название\"");
            String title = scanner.nextLine().replaceAll("\"", "");
            Book book = bookshelf.find(title);
            System.out.println(book == null ?
                    "Книга с таким названием не найдена!":
                    "Найдена книга: " + book);
        }
    }

    private static void removeBook() {
        if (bookshelf.getCountBooks() == 0) {
            System.out.println("В шкафу нет ни одной книги!");
        } else {
            System.out.println("Введите название книги в формате: \"название\"");
            String title = scanner.nextLine().replaceAll("\"", "");
            System.out.println(bookshelf.remove(title) ?
                    "Книга успешно удалена!":
                    "Книга с таким названием отсутствует!");
        }
    }

    private static void clearBookShelf() {
        System.out.println(bookshelf.clearShelves() ?
                "Шкаф успешно очищен!":
                "Шкаф и так пустой!");
    }

    private static void waitForEnter() {
        do {
            System.out.println("Для продолжения работы нажмите Enter");
            if (scanner.nextLine().isEmpty()) break;
        } while(true);
    }
}