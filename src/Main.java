import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //Task 1
        checkIsYearLeap(2022);
        System.out.println();

        //Task 2
        suggestProductVersion(1, 2020);
        System.out.println();

        //Task 3
        int deliveryDays = getDeliveryDays(95);
        System.out.println("Потребуется дней " + deliveryDays);



}

    private static int getDeliveryDays(int deliveryDistance) {
        int dayCounter = 1;

        if (deliveryDistance > 20 && deliveryDistance <= 60) {
            dayCounter++;
        } else if(deliveryDistance > 60 && deliveryDistance <= 100) {
            dayCounter += 2;
        } else {
            dayCounter += 3;
        }
        return dayCounter;
    }

    private static void suggestProductVersion(int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientDeviceYear < currentYear && clientOS == 0) {
            clientOS = 2;
        }
        if (clientDeviceYear < currentYear && clientOS == 1) {
            clientOS = 3;
        }
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            case 2:
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                break;
            case 3:
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
                break;
            default:
                System.out.println("Ваша OS не поддерживается");
        }
    }

    private static void checkIsYearLeap(int year) {
        if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))){
            System.out.println(year + " - is leap");
        } else {
            System.out.println(year + " - is not leap");
        }
    }


}
