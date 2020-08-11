package varargs;

public class VariableLengthArguments {

    //Typical way overriding methods (Downside is that you have to keep on overriding to accept different number of inputs or input types)

    public static void printList(String item1, String item2) {
        System.out.println("List");
        System.out.println("1. + " + item1);
        System.out.println("2. + " + item2);
        System.out.println();
    }

    public static void printList(String item1, String item2, String item3) {
        System.out.println("List");
        System.out.println("1. " + item1);
        System.out.println("2. " + item2);
        System.out.println("3. " + item3);
        System.out.println();
    }

    public static void printList(String[] items) {
        System.out.println("List");
        for(int i=0; i<items.length; i++) {
            System.out.println(i+1 + ". " + items[i]);
        }
        System.out.println();
    }

    //This can accept different number of items as individual strings or as a collective array
    //Varargs creates an array of items automatically
    public static void betterPrintListMethod(String... items) {
        System.out.println("List");
        for(int i=0; i<items.length; i++) {
            System.out.println(i+1 + ". " + items[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String item1 = "Banana";
        String item2 = "Orange";
        String item3 = "Apple";
        String item4 = "Coconut";
        String[] items = {"Flour", "Milk", "Potato", "Carrot"};
        printList(item1, item2, item3);
        printList(items);

        //No need to override anymore
        betterPrintListMethod(item1, item2, item3, item4);
        betterPrintListMethod("Ball", "Boots", "Shirt");
        betterPrintListMethod(items);
    }

}
