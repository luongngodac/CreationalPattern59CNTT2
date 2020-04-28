package creationalpattern59cntt2;

import singleton.Singleton;

public class CreationalPattern59CNTT2 
{
    public static void main(String[] args)
    {
        Singleton s1 = Singleton.createInstance();
        Singleton s2 = Singleton.createInstance();

        s1.setCount(1);
        System.out.println("Gia tri count: " + s1.getcount());

        s2.setCount(2);
        System.out.println("Gia tri count: " + s1.getcount());
        
        // vì 2 con trỏ trỏ đến 1 vùng nhớ được cấp cho biến 
        //sattic Singleton, vậy nên các thao tác đều thao tác trên đó
        //nên khi khởi tạo thì nó sẽ chỉ trả về Singleton đã gán cho s1 thôi.

    }

}