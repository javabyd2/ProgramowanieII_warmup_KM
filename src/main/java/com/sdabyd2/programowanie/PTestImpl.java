package com.sdabyd2.programowanie;

import java.util.List;

public class PTestImpl {

    public static String last(List<String> lista){


        String lastElement = lista.get(lista.size()-1);
        return lastElement;
    }
}
