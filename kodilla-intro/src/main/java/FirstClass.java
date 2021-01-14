public class FirstClass {                           // [1]
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600, 1000, 2020);
        System.out.println("waga w gramach: "+notebook.weight+" cena: "+notebook.price+" rok produkcji: "+notebook.year);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYear();
        notebook.checkValue();

        Notebook heavyNotebook = new Notebook(2000, 1500, 2016);
        System.out.println("waga w gramach: "+heavyNotebook.weight+" cena: "+heavyNotebook.price+" rok produkcji: "+heavyNotebook.year);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkYear();
        heavyNotebook.checkValue();

        Notebook oldNotebook = new Notebook(1200, 500, 2009);
        System.out.println("waga w gramach: "+oldNotebook.weight+" cena: "+oldNotebook.price+" rok produkcji: "+oldNotebook.year);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkYear();
        oldNotebook.checkValue();
    }
}
