package JavaBasics.by.epam.library.main;

import JavaBasics.by.epam.library.entity.Library;
import JavaBasics.by.epam.library.entity.NewsPaper;
import JavaBasics.by.epam.library.entity.PrintedEdition;
import JavaBasics.by.epam.library.service.find.FindByAuthor;
import JavaBasics.by.epam.library.service.find.FindByPrice;
import JavaBasics.by.epam.library.service.sort.PrintedEditionNameComparator;
import JavaBasics.by.epam.library.service.sort.PrintedEditionPriceComparator;
import JavaBasics.by.epam.library.service.sort.Sortable;
import JavaBasics.by.epam.library.view.print.PrintAsList;
import JavaBasics.by.epam.library.view.ViewAction;
import JavaBasics.by.epam.library.entity.Dictionary;
import JavaBasics.by.epam.library.service.find.FindAction;
import JavaBasics.by.epam.library.entity.Poster;
import JavaBasics.by.epam.library.view.print.PrintAsTable;

import java.util.ArrayList;

public class Runner {

    public static void main(String args[]) {

        Library library = new Library();
        library.addPrintEdition(new Poster("Полирафия 1", "ЛСП", 100, "Концерт"));
        library.addPrintEdition(new Poster("Полирафия 2", "ЛСП", 120, "Концерт"));
        library.addPrintEdition(new NewsPaper("Редактор 1", "РБК", 120, "новость 1"));
        library.addPrintEdition(new NewsPaper("Редактор 2", "РБК", 120, "новость 2"));
        library.addPrintEdition(new Dictionary("Даль", "Толковый словарь 1", 140, "термин1", "термин2"));
        library.addPrintEdition(new Dictionary("Даль", "Толковый словарь 3", 110, "термин1", "термин2"));
        library.addPrintEdition(new Dictionary("Даль", "Толковый словарь 2", 130, "термин1", "термин2"));
        ArrayList<PrintedEdition> listOfEditionsDefault = library.getLibrary();

        FindAction findAction = new FindAction();
        ArrayList<PrintedEdition> listOfEditionsFoundByAuthor = findAction.find(listOfEditionsDefault, new FindByAuthor("Даль"));
        ArrayList<PrintedEdition> listOfEditionsFoundByPrice = findAction.find(listOfEditionsDefault, new FindByPrice(120));

        ViewAction viewAction = new ViewAction();
        System.out.println("--------- Список всех книг в виде таблицы -----------------------------------------------");
        viewAction.print(listOfEditionsDefault, new PrintAsTable());
        System.out.println("--------- Список книг с ценой '120' в виде списка ---------------------------------------");
        viewAction.print(listOfEditionsFoundByPrice, new PrintAsList());
        System.out.println("--------- Список книг с автором 'Даль' в виде таблицы -----------------------------------");
        viewAction.print(listOfEditionsFoundByAuthor, new PrintAsTable());

        PrintedEditionNameComparator comparatorName = new PrintedEditionNameComparator();
        Sortable sortable = new Sortable();
        ArrayList<PrintedEdition> listOfEditionsFoundByAuthorSorted = sortable.sort(listOfEditionsFoundByAuthor, comparatorName);
        System.out.println("--------- Список книг с автором 'Даль' отсортированных по 'Названию' в виде таблицы -----");
        viewAction.print(listOfEditionsFoundByAuthorSorted, new PrintAsTable());

        PrintedEditionPriceComparator comparatorPrice = new PrintedEditionPriceComparator();
        System.out.println("--------- Список книг с автором 'Даль' отсортированных по 'Цене' в виде таблицы ---------");
        ArrayList<PrintedEdition> listOfEditionsFoundByPriceSorted = sortable.sort(listOfEditionsFoundByAuthor, comparatorPrice);
        viewAction.print(listOfEditionsFoundByPriceSorted, new PrintAsTable());
    }
}



