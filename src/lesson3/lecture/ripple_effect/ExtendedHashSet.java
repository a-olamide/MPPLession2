package lesson3.lecture.ripple_effect;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class ExtendedHashSet<T> extends HashSet<T> {
    private int addedCount = 0;

    @Override
    public boolean add(T t) {
        addedCount++;
        return super.add(t);
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        addedCount += c.size();
        return super.addAll(c);
    }

    public static void main(String[] args){
        ExtendedHashSet<Integer> set = new ExtendedHashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        System.out.println("Added set: " + set.addedCount); //display 3
        set.addAll(Set.of(40,50,60));
        System.out.println("Added set: " + set.addedCount);
    }
}
