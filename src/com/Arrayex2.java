package com;

public class Arrayex2 {
        public static void main(String[] args) {
            int[] arrays={1,20,35,4,5};
            int max= arrays[0];
            int min=arrays[0];


            for(int i=0;i< arrays.length;i++){


                if(max< arrays[i])
                {
                    max=arrays[i];
                }
                if(min>=arrays[i]){
                    min=arrays[i];
                }
                //Big=max;
                //Small=min;

            }
            System.out.println("Biggest number is" + " "+ max);
            System.out.println("Smallest number is" + " "+min);
        }
    }

