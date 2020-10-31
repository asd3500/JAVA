package by.itClass.comparators;

import by.itClass.interfaces.IMassable;

import java.util.Comparator;

public class MassableKindComparator implements Comparator<IMassable> {
    @Override
    public int compare(IMassable o1, IMassable o2) {
        return o1.getOrdinal() - o2.getOrdinal();
    }
}
