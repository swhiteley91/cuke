import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);
        numbers.add(11);
        numbers.add(12);
        numbers.add(13);
        numbers.add(14);
        numbers.add(15);
        numbers.add(16);
        numbers.add(17);
        numbers.add(18);
        numbers.add(19);
        numbers.add(20);

        ArrayList<String> words = new ArrayList<String>();
        words.add("een");
        words.add("twee");
        words.add("drie");
        words.add("vier");
        words.add("vijf");
        words.add("zes");
        words.add("zeven");
        words.add("acht");
        words.add("negen");
        words.add("tien");
        words.add("elf");
        words.add("twaalf");
        words.add("dertien");
        words.add("veertien");
        words.add("vijftien");
        words.add("zestien");
        words.add("zeventien");
        words.add("achttien");
        words.add("negentien");
        words.add("twintig");

        int index = numbers.indexOf(Integer.parseInt(args[0]));
        if(index != -1) {
          System.out.print(words.get(index));
        }
    }
}
