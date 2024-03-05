package org.pavel.enumLec;

public class Pair<K, V>{

    private K key;
    public V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public static void main(String[] args) {

    Pair<Day, Integer>[] scheduler = new Pair[4];
        scheduler[0] = new Pair<>(Day.MONDAY, 4);
        scheduler[1] = new Pair<>(Day.TUESDAY, Day.TUESDAY.getWorkingHours());
        scheduler[2] = new Pair<>(Day.FRIDAY, 4);
        scheduler[3] = new Pair<>(Day.SUNDAY, 4);

        for (Pair p : scheduler) {
            System.out.println(p.key + " Отработано фактически " + p.value + " норма часов " + ((Day) p.key).getWorkingHours()); ;
        }

    }
}
