public class Phone {

    int number;
    String model;
    int weight;

    //конструктор для класса phone
    public Phone(int number, String model, int weight) {

    }

    String name = "Вован"; // имя звонящего

    void receiveCall  () {
        System.out.println("Звонит " + name);
    }
    void getNumber() {
        System.out.println(number);
    }
    public static void main(String[] args) {

        Phone Phone1= new Phone(911,"Iphone",45);
        Phone1.receiveCall();
        Phone1.getNumber();

        Phone Xiaomi = new Phone(921, "Xiaomi",250);
        // Phone Huawei = new Phone();


    }
}

