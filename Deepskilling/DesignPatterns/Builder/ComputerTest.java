public class ComputerTest {
    public static void main(String[] args) {
        Computer c= new Computer.Builder()
                    .setCPU("cpu i5 processor")
                    .setRam("5gb")
                    .setStorage("516MB")
                    .Build();
        c.display();
    }
}
