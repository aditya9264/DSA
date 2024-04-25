import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Streamapis {
    public static void main(String[] args) {
        ArrayList <Integer> marks = new ArrayList();
        marks.add(20);
        marks.add(30);
        marks.add(40);
        marks.add(50);
        marks.add(60);
        marks.add(70);

        for(int i=0;i<marks.size();i++){
            if(marks.get(i)>35){
  System.out.println(marks.get(i));
            }
        }
//In the above code there is so much logics we have to write thats why stream Api's introduced

//Predicate <Integer> p = (i) ->i>35;
       List passedMarks =  marks.stream().filter((i)->i>35).collect(Collectors.toList());
      List revisedMarks =  marks.stream().map((i) -> i+5).collect(Collectors.toList());
       System.out.println(passedMarks);
       System.out.println(revisedMarks);

       marks.forEach((mark -> System.out.println(mark)));
    }
}
