package com.dhruv;
import java.util.*;

public class Main{

    public static void main(String[] args) {

        Main firstGo = new Main();
        firstGo.theAlgorithm();

    }

    private Map<Integer, String> theFirstMap = new HashMap<>();

    public Main(){
        initialise();
    }
    private void initialise(){

        List<FirstList> trialList = Arrays.asList(new FirstList(1, "Corporate and Investment Banking"),
                new FirstList(2, "Asset Management"), new FirstList(3, "Retail Banking"), new FirstList(4, "Wealth Management"),
                new FirstList(5, "Operations"), new FirstList(6, "Technology"), new FirstList(7, "Human Resources"));

    }

    private void theAlgorithm(){

        int x;
        System.out.println("Enter a number to find out the corresponding division: ");
        Scanner in;
        in = new Scanner(System.in);
        x = in.nextInt();
        for (Map.Entry m: theFirstMap.entrySet()){
            System.out.println(x + " : " + Main.FirstList.getValue());
        }

    }

    private static class FirstList{

        private Integer key;
        private String value;


        public FirstList(Integer key, String value) {
            this.key=key;
            this.value=value;

        }

        public Integer getKey() {
            return key;
        }

        public String getValue() {
            return value;
        }
    }



}
