package ThreadOdev;

import java.util.ArrayList;
import java.util.List;

public class Counter  implements Runnable{


    public static void listeler(){
        List<Integer> sayilar = new ArrayList<>();
        List<Integer> ilk = new ArrayList<>();
        List<Integer> ikinici = new ArrayList<>();
        List<Integer> ucuncu = new ArrayList<>();
        List<Integer> son = new ArrayList<>();
        List<Integer> cift = new ArrayList<>();
        List<Integer> tek = new ArrayList<>();
        for (int i = 1; i<=10000;i++){
            sayilar.add(i);
            if (i<=2500){
                ilk.add(i);
            }else if (i>=2501 & i<5001) {
                ikinici.add(i);

            } else if (i>=5001 & i<7501) {
                ucuncu.add(i);
            }else if (i>=7501 & i<=10000)
                son.add(i);
        }

        for (Integer i: ilk){
            if (i % 2 ==0){
                cift.add(i);
            }else if (i % 2 ==1){
                tek.add(i);
            }
        }
        for (Integer i : ikinici){
            if (i % 2 ==0){
                cift.add(i);
            }else if (i % 2 ==1){
                tek.add(i);
            }
        }
        for (Integer i : ucuncu){
            if (i % 2 ==0){
                cift.add(i);
            }else if (i % 2 ==1){
                tek.add(i);
            }
        }
        for (Integer i : son){
            if (i % 2 ==0){
                cift.add(i);
            }else if (i % 2 ==1){
                tek.add(i);
            }
        }

            System.out.println(cift.size());
            System.out.println(tek.size());
    }



    @Override
    public void run() {
       listeler();
    }


}
