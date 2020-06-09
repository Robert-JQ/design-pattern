package creation.singleton.singleton_deserialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

/**
 * @author jqq
 * @version 1.0
 * @description
 * @date 2020/6/9 17:42
 **/
public class SerializationTest {

    public static void main(String[] args) {
        Singleton instanceOne = Singleton.getInstance();
        try {
            // 对象序列化到文件
            ObjectOutput out = new ObjectOutputStream(new FileOutputStream("filename.ser"));
            out.writeObject(instanceOne);
            out.close();

            ObjectInput in = new ObjectInputStream(new FileInputStream("filename.ser"));
            Singleton instanceTwo = (Singleton) in.readObject();
            in.close();
            System.out.println(instanceOne.hashCode());
            System.out.println(instanceTwo.hashCode());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
