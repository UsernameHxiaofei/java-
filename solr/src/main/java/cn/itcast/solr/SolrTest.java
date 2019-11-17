package cn.itcast.solr;

import java.util.ArrayList;

public class SolrTest {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("1231");
        System.out.println("stringBuffer = " + stringBuffer);

        ArrayList<String> list = new ArrayList<String>();
        list.add("1231");
        list.add("45532");
        System.out.println("list = " + list);
    }
}
