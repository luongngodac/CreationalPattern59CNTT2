package creationalpattern59cntt2;

import builder.Computer;
public class BuilderMain {
    public static void main(String args[])
    {
        Computer computer = new Computer.Builder()
            .addCPU("Core i7 8900")
            .addRAM("16GB 2400 MHz")
            .addScreen("Full HD 24 inch")
            .build();
        System.out.println(computer.toString());

    }

}