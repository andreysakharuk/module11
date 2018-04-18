package JavaBasics.by.epam.library.service.find;

import JavaBasics.by.epam.library.entity.PrintedEdition;

import java.util.ArrayList;

public class FindAction {

    public ArrayList<PrintedEdition> find(ArrayList<PrintedEdition> list, Findable matcher) {
        return matcher.find(list);
    }

}
