package javabasic;

public class City implements Comparable<City> {
    private int code;
    private String name;
    City(int code,String name){
        this.code = code;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "City [ code = "+code +" name ="+name+"]";
    }

    @Override
    public int compareTo(City city) {
        if(this.code<city.code){
            return -1;
        }else if(this.code> city.code){
            return 1;
        }
        return 0;
    }
}
