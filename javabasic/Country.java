package javabasic;

import java.io.*;

public class Country implements Serializable {
    private Integer code;// Wrapper class
    private String name;
    private transient String securityId;
    Country(Integer code,String name,String securityId){
        this.code = code;
        this.name = name;
        this.securityId = securityId;
    }

    @Override
    public String toString() {
        return "Country code="+code+" name="+name+" security="+securityId;
    }
}

class Main{
    public static void  main(String...a) throws IOException, ClassNotFoundException {
        Country india= new Country(1,"India","IND");
        String fileName = "countryData.txt";
        FileOutputStream fileOutputStream =new FileOutputStream(fileName);
        ObjectOutputStream objectOutputStream= new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(india);

        FileInputStream fileInputStream = new FileInputStream(fileName);
        ObjectInputStream  objectInputStream = new ObjectInputStream(fileInputStream);
        Country country=(Country) objectInputStream.readObject();
        System.out.println(country);
    }
}