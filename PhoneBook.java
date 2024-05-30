import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class PhoneBook {
    protected static HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();
    
    public void add(String name, Integer phoneNum) {
       if (phoneBook.get(name) == null) {
         ArrayList<Integer> arr = new ArrayList<>();
         arr.add(phoneNum);
         phoneBook.put(name, arr);
       } else phoneBook.get(name).add(phoneNum);
}




    public ArrayList<Integer> find(String name) {
      ArrayList<Integer> arr = new ArrayList<>();
      if (phoneBook.get(name) != null) {
        arr = phoneBook.get(name);
      } return arr;

}

    public static HashMap<String, ArrayList<Integer>> getPhoneBook() {
      return phoneBook;
      
    }



    public static void printOuted () {
        List<Contact> outBook = new ArrayList<>(); 
        for (Map.Entry<String , ArrayList<Integer>> cont : phoneBook.entrySet()) {
            Contact x = new Contact(cont.getKey(), cont.getValue());
            outBook.add(x);
        } Collections.sort(outBook);
        System.out.println(outBook);
        
    
    
    }

}
  

   

