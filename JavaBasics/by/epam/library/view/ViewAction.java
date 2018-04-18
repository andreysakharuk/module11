package JavaBasics.by.epam.library.view;

import JavaBasics.by.epam.library.entity.PrintedEdition;
import JavaBasics.by.epam.library.view.print.Printable;

import java.util.ArrayList;

public class ViewAction {

    public void print(ArrayList<PrintedEdition> list, Printable matcher) {
        matcher.print(list);
    }
}
