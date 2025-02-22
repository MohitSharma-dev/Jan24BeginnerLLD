package LambdasStreamsAndExceptions;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsClient {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(121);
        list.add(31);
        list.add(14);
        list.add(25);
        list.add(6);
        list.add(71);
        list.add(18);

//         task : filter odd elements from the list, finally you should have only even elements
         Stream<Integer> stream =
                 list.stream();
//         predicate : a method which tells me what to keep
        // original data source will not impacted
        // filter method returns back the stream object

        // Intermediate : returns the same stream object back
            // filter : filters out
            // map : transforms the elements basis the implementation
        // Terminal : helps you to close the stream and get the required data
            // collect

         List<Integer> ansList =
                 stream
                    .filter((data)->{ return data % 2 == 0; })
                    .collect(Collectors.toList());

        System.out.println(ansList);
        // filter even numbers and convert them to their squares
//      stream has already been operated upon or closed
        ansList =
                    list.stream()
                        .filter(data -> {
                            System.out.println("Filtering data : " + data) ;
                            return data % 2 == 0;
                        })
                        .map((data) -> {
                            System.out.println("Mapping data : " + data) ;
                            return data * data;
                        })
                        .collect(Collectors.toList());
        System.out.println(ansList);

        Optional<Integer> ansOptional =
                list.stream()
                .filter(data -> {
                    System.out.println("Filtering data : " + data) ;
                    return data % 2 == 0;
                })
                .map((data) -> {
                    System.out.println("Mapping data : " + data) ;
                    return data * data;
                })
                .findFirst();
        if(ansOptional.isPresent()) {
            System.out.println(ansOptional.get());
        }

        System.out.println(list
                .stream()
                .filter(data -> {
                    return data > 10;
                })
                .map((data) -> {
                    return data * 2;
                })
                .sorted()
                .collect(Collectors.toList())
        );

        System.out.println(list
                .stream()
                .filter(data -> data > 10)
                .map(data -> data * 2)
                .sorted()
                .collect(Collectors.toList())
        );


    }
}


// a lot of times null values can be returned from the function
// Object : null
// student.getName()

//Question:
//You are given a list of integers. Use Java Streams to:
//
//Filter out all the numbers that are greater than 10.
//Double each of the remaining numbers.