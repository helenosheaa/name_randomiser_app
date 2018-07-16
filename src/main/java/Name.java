import java.util.ArrayList;
import java.util.Collections;


public class Name {

    private ArrayList<String> names;

    public Name() {
        names = new ArrayList<>();
        names.add("Helen");
        names.add("Iona");
        names.add("David");
        names.add("Gary");
        names.add("Lee");

    }

    public void shuffleNames(){
        Collections.shuffle(names);
    }

    public String randomName(){
        shuffleNames();
        return names.get(0);
    }

    public ArrayList<String> twoRandomNames(){
        ArrayList<String> twoNames = new ArrayList<>();
        shuffleNames();
        twoNames.add(names.get(0));
        twoNames.add(names.get(1));
        return twoNames;
    }

    public ArrayList<String> threeRandomNames(){
        ArrayList<String> threeNames = new ArrayList<>();
        shuffleNames();
        threeNames.add(names.get(0));
        threeNames.add(names.get(1));
        threeNames.add(names.get(2));

        return threeNames;
    }

    public ArrayList<String> getNames(){
        return names;
    }

}




