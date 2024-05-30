public class Main {
    public static void main(String[] args) {
        String name1;
        String name2;
        String name3 = "Sidorova";
        int phone1;
        int phone2;
        int phone3 = 232323;
        
            name1 = "Ivanov";
            name2 = "Petrov";

            phone1 = 123456;
            phone2 = 654321;
            
        
        PhoneBook myPhoneBook = new PhoneBook();
        myPhoneBook.add(name1, phone1);
        myPhoneBook.add(name1, phone2);
        myPhoneBook.add(name2, phone2);
        myPhoneBook.add(name1, phone3);
        myPhoneBook.add(name2, phone3);
        myPhoneBook.add(name3, phone3);

        // Collections.sort(myPhoneBook,new MyComporator());

        
        System.out.println(myPhoneBook.find(name1));
        System.out.println(PhoneBook.getPhoneBook());
        System.out.println(PhoneBook.getPhoneBook().entrySet());

        PhoneBook.printOuted();

        

    }
}