package builder;

public class Computer 
{
    String CPU, RAM, screen;
    public Computer(Builder builder)//khoi tao
    {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.screen = builder.RAM;
    }
    //chi duoc su dung in ra man hinh khi o trong ham main
    @Override
    public String toString()
    {
        return "Computer{" + "CPU=" + CPU + " RAM=" + RAM + " screen=" + screen + "}";
    }


    public static class Builder 
    {
        String CPU, RAM, screen;
        public Builder()
        {

        }
        public Builder addCPU(String CPU)
        {
            this.CPU = CPU;
            return this;
        }
        public Builder addRAM(String RAM)
        {
            this.RAM = RAM;
            return this;
        }
        public Builder addScreen(String screen)
        {
            this.screen = screen;
            return this;
        }
        public Computer build()
        {
            //tra ve ham khoi tao cua no.
            return new Computer(this);
        }
    }

}