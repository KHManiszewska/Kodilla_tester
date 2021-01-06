public class LeapYear {
    public static void main(String[] args) {
        int yearNumber = 2000;

        System.out.println("Rok: "+yearNumber);

        if (yearLeap(yearNumber)){
            System.out.println("Rok jest przestępny");
        } else {
            System.out.println("Rok nie jest przestępny");
        }
    }

    private static boolean yearLeap (int a) {
        boolean result = true;
        boolean resultTemp = true;
        int devFour = a%4;
        int devHund = a%100;
        int devFourHund = a%400;

        if (devFour > 0){
            System.out.println("nie dzieli się przez 4 więc nie przestępny");
            result = false;
        } else if (devHund > 0) {
            System.out.println("dzieli się przez cztery ale nie dzieli się przez 100 więc przestępny");
            resultTemp = false;
        } else {
            System.out.println("nic jeszcze nie wiadomo");
        }
        if (resultTemp && devFourHund > 0){
            result = false;
        }
        System.out.println("Ten rok jest przestępny? "+result);
        return result;
    }
}
