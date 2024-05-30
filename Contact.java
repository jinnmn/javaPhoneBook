import java.util.ArrayList;

public class Contact implements Comparable<Contact>{
    ArrayList<Integer> numbers = new ArrayList<>();
    String name;

    public Contact(String name, ArrayList<Integer> numbers) {
        this.numbers = numbers;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Integer> getNumbers() {
        return numbers;
    }
   
    @Override
    public int compareTo(Contact cont) {
        return -(numbers.size() - cont.getNumbers().size());
    }

    @Override
    public String toString() {
        return "Contact [name=" + name + ", numbers=" + numbers + "]";
    }
    
    }
    
    

