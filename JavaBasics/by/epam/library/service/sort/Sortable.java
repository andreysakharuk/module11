package JavaBasics.by.epam.library.service.sort;

import JavaBasics.by.epam.library.entity.PrintedEdition;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Sortable {

    public ArrayList<PrintedEdition> sort(ArrayList<PrintedEdition> list, Comparator<PrintedEdition> comp) {
        Set<PrintedEdition> foundList = new TreeSet<PrintedEdition>(comp);
        ArrayList<PrintedEdition> tr = new ArrayList<PrintedEdition>();
        for (PrintedEdition pe : list) {
            foundList.add(pe);
        }
        for (PrintedEdition pe : foundList) {
            tr.add(pe);
        }
        return tr;
    }
}
