package ArraysList;

import java.util.ArrayList;

public class Aula12Loiane {

    public static void main(String[] args){

        ArrayList<String> arrayList = new ArrayList();
        arrayList.add("A");
        arrayList.add("C");
        System.out.println(arrayList);
        arrayList.add(1,"B");
        System.out.println(arrayList);
        boolean existe = arrayList.contains("A");
        if(existe){
            System.out.println("Elemento existe no array.");
        }else {
            System.out.println("Elemento não existe no array");
        }

        int pos = arrayList.indexOf("C");
        if(pos > -1){
            System.out.println("Elemento existe no array na posição "+pos);
        }else {
            System.out.println("Elemento não existe no array.");
        }
        //método get para buscar posições. ex
        System.out.println(arrayList.get(1));
        //método remove: podemos remover pelo índice ou pelo objeto
        arrayList.remove(0);
        System.out.println(arrayList);
        arrayList.remove("C");
        System.out.println(arrayList);
        System.out.println(arrayList.size());

    }


}
