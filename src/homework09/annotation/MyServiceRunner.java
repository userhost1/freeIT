package homework09.annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MyServiceRunner {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        MyService service1 = new MyService("chocolate", "Nuts");
        MyService service2 = new MyService("chocolate", "Mars");
        MyService service3 = new MyService("chocolate", "Mars");

        System.out.println(service1.equals(service2));
        System.out.println(service1.hashCode() == service2.hashCode());

        System.out.println(service2.equals(service3));
        System.out.println(service2.hashCode() == service3.hashCode());

        inspectService(MyService.class);

    }

    public static void inspectService(Class<?> clazz) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        if (clazz.isAnnotationPresent(Version.class)) {
            MyService service = new MyService("Snickers", "Snickers");
            Method privateMethod = service.getClass().getDeclaredMethod("thisClassInfo");
            privateMethod.setAccessible(true);
            privateMethod.invoke(service);
        }
    }
}



