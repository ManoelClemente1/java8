
@FunctionalInterface
interface A{
    void show();
}

class B implements A{
    @Override
    public void show() {
        System.out.println("hi");
    }
}

public class DemoFunctionalInterface {

    public static void main(String[] args) {

            A obj = () -> {
                System.out.println("hi in show");
            };


            obj.show();

    }
}
