import java.lang.module.ModuleDescriptor.Builder;

public class Computer {
    private String cpu;
    private String ram;
    private String storage;
    public Computer(Builder b){
        this.cpu=b.cpu;
        this.ram=b.ram;
        this.storage=b.storage;
    }
    public void display(){
        System.out.println(this.cpu);
        System.out.println(this.ram);
        System.out.println(this.storage);
    }
    public static class Builder{
        private String cpu;
        private String ram;
        private String storage;
        public Builder setCPU(String cpu){
            this.cpu=cpu;
            return this;
        }
        public Builder setRam(String ram){
            this.ram=ram;
            return this;
        }
        public Builder setStorage(String storage){
            this.storage=storage;
            return this;
        }
        public Computer Build(){
            return new Computer(this);
        }
    }
}
