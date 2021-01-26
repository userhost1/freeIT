package homework12;

//  Сеарилизовать объект Автомобиль(Марка, скорость, цена).
//  После сериализации произвести обратный процесс (Десеарилизацию).

import java.io.*;

public class AdditionalTask_4 {
    public static void main(String[] args) {

        Car car1 = new Car("Honda", 260, 35000);
        Car car2 = new Car("Acura", 280, 40000);

        System.out.println("before Serializable: " + car1.toString());
        System.out.println("before Serializable: " + car2.toString());

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        try (ObjectOutputStream oos = new ObjectOutputStream(byteArrayOutputStream)) {

            oos.writeObject(car1);
            oos.writeObject(car2);

        } catch (IOException e) {
            e.printStackTrace();
        }

        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());

//        Car load1 = null;
//        Car load2 = null;

        try (ObjectInputStream ois = new ObjectInputStream(byteArrayInputStream)) {

            Car load1 = (Car) ois.readObject();
            Car load2 = (Car) ois.readObject();

            System.out.println("after deserializable; " + load1.toString());
            System.out.println("after deserializable; " + load2.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
