package JavaBasics.by.epam.library.view.print;

import JavaBasics.by.epam.library.entity.PrintedEdition;

import java.util.ArrayList;

/**
 * Created by Andrei_Sakharuk on 4/11/2018.
 */
public interface Printable {

    public void print(ArrayList<PrintedEdition> list);

}
