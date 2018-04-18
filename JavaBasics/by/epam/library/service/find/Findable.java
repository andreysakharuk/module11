package JavaBasics.by.epam.library.service.find;

import JavaBasics.by.epam.library.entity.PrintedEdition;

import java.util.ArrayList;

public interface Findable {

    public ArrayList<PrintedEdition> find(ArrayList<PrintedEdition> list);

}
