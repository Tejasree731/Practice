public class FactoryTest {
    public static void main(String[] args) {
        WordDocFactory wdf=new WordDocFactory();
        wdf.createDocument().open();
        ExcelDocFactory edf=new ExcelDocFactory();
        edf.createDocument().open();
    }
}
