public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }
    public void checkPrice() {
        if (this.price < 601){
            System.out.println("This notebook is very cheap.");
        } else if (this.price < 1001 && this.price > 600) {
            System.out.println("The price is good.");
        } else {
            System.out.println("This notebook is expensive.");
        }
    }
    public void checkWeight() {
        if (this.weight < 701){
            System.out.println("This notebook is light.");
        } else if (this.weight < 1201 && this.weight > 700) {
            System.out.println("The notebook is not very heavy.");
        } else {
            System.out.println("This notebook is very heavy.");
        }
    }
    public void checkYear() {
        if (this.year < 2010){
            System.out.println("This notebook is very old.");
        } else if (this.year < 2017 && this.year > 2009) {
            System.out.println("The notebook is not very old.");
        } else {
            System.out.println("This notebook is quite new.");
        }
    }
    public void checkValue() {
        if (this.year > 2017 && this.price < 1500){
            System.out.println("Buy it.");
        } else if (this.year < 2010 && this.price > 400) {
            System.out.println("Do not buy it.");
        } else {
            System.out.println("Think what you do");
        }
    }
}
