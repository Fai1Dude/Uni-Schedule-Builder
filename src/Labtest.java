import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Labtest {
    public static void main(String[] args){
        TreeMap<String,TreeSet<Integer>> gr1realDiffernce = new TreeMap<>();
        TreeMap<String,TreeSet<Integer>> gr1points = new TreeMap<>();
        TreeMap<String,TreeSet<Integer>> gr2realDiffernce = new TreeMap<>();
        TreeMap<String,TreeSet<Integer>> gr2points = new TreeMap<>();
        try{
            Scanner input = new Scanner(new File("C:/Users/Faisal/Downloads/NEWNEW/worldcup.txt"));
            while (input.hasNext()){
            int a = input.nextInt();  
            if (a==1){
                String name1 = input.next();
                String name2 = input.next();
                int goals1 = input.nextInt();
                int goals2 = input.nextInt();
                int realDiff = goals1 - goals2 ;
                if (realDiff>0){
                    if (gr1points.containsKey(name1)&&gr1points.containsKey(name2)){
                        gr1points.get(name1).add(3);
                        gr1points.get(name2).add(0);}
                    else{
                        if(gr1points.containsKey(name1)){
                            gr1points.get(name1).add(3);
                            TreeSet<Integer> name2set = new TreeSet<>();
                            name2set.add(0);
                            gr1points.put(name2,name2set);}
                        else if(gr1points.containsKey(name2)){
                            gr1points.get(name2).add(0);
                            TreeSet<Integer> name1set = new TreeSet<>();
                            name1set.add(3);
                            gr1points.put(name1,name1set);}

                        else{TreeSet<Integer> name1set = new TreeSet<>();
                        TreeSet<Integer> name2set = new TreeSet<>();
                        name1set.add(3);
                        gr1points.put(name1,name1set);
                        name2set.add(0);
                        gr1points.put(name2,name2set);}}
                    if (gr1realDiffernce.containsKey(name1)&&gr1realDiffernce.containsKey(name2)){
                        gr1realDiffernce.get(name1).add(realDiff);
                        gr1realDiffernce.get(name2).add(-1*realDiff);}
                    else{
                        if(gr1realDiffernce.containsKey(name1)){
                            gr1realDiffernce.get(name1).add(realDiff);
                            TreeSet<Integer> name2diff = new TreeSet<>();
                            name2diff.add(-1*realDiff);
                            gr1realDiffernce.put(name2,name2diff);
                        }
                        else if (gr1realDiffernce.containsKey(name2)){
                            gr1realDiffernce.get(name2).add(-1*realDiff);
                            TreeSet<Integer> name1diff = new TreeSet<>();
                            name1diff.add(realDiff);
                            gr1realDiffernce.put(name1,name1diff);
                        }
                        else{
                        TreeSet<Integer> name1diff = new TreeSet<>();
                        TreeSet<Integer> name2diff = new TreeSet<>();
                        name1diff.add(realDiff);
                        gr1realDiffernce.put(name1,name1diff);
                        name2diff.add(-1*realDiff);
                        gr1realDiffernce.put(name2,name2diff);}}
                }
                else if (realDiff<0){
                    if (gr1points.containsKey(name1)&&gr1points.containsKey(name2)){
                        gr1points.get(name1).add(0);
                        gr1points.get(name2).add(3);}
                    else{
                        if(gr1points.containsKey(name1)){
                            gr1points.get(name1).add(0);
                            TreeSet<Integer> name2set = new TreeSet<>();
                            name2set.add(3);
                            gr1points.put(name2,name2set);}
                        else if(gr1points.containsKey(name2)){
                            gr1points.get(name2).add(3);
                            TreeSet<Integer> name1set = new TreeSet<>();
                            name1set.add(0);
                            gr1points.put(name1,name1set);}

                        else{TreeSet<Integer> name1set = new TreeSet<>();
                        TreeSet<Integer> name2set = new TreeSet<>();
                        name1set.add(0);
                        gr1points.put(name1,name1set);
                        name2set.add(3);
                        gr1points.put(name2,name2set);}}
                    if (gr1realDiffernce.containsKey(name1)&&gr1realDiffernce.containsKey(name2)){
                        gr1realDiffernce.get(name1).add(realDiff);
                        gr1realDiffernce.get(name2).add(-1*realDiff);}
                    else{
                        if(gr1realDiffernce.containsKey(name1)){
                            gr1realDiffernce.get(name1).add(realDiff);
                            TreeSet<Integer> name2diff = new TreeSet<>();
                            name2diff.add(-1*realDiff);
                            gr1realDiffernce.put(name2,name2diff);
                        }
                        else if (gr1realDiffernce.containsKey(name2)){
                            gr1realDiffernce.get(name2).add(-1*realDiff);
                            TreeSet<Integer> name1diff = new TreeSet<>();
                            name1diff.add(realDiff);
                            gr1realDiffernce.put(name1,name1diff);
                        }
                        else{
                        TreeSet<Integer> name1diff = new TreeSet<>();
                        TreeSet<Integer> name2diff = new TreeSet<>();
                        name1diff.add(realDiff);
                        gr1realDiffernce.put(name1,name1diff);
                        name2diff.add(-1*realDiff);
                        gr1realDiffernce.put(name2,name2diff);}}
                }
                else {if (gr1points.containsKey(name1)&&gr1points.containsKey(name2)){
                    gr1points.get(name1).add(1);
                    gr1points.get(name2).add(1);}
                else{
                    if(gr1points.containsKey(name1)){
                        gr1points.get(name1).add(1);
                        TreeSet<Integer> name2set = new TreeSet<>();
                        name2set.add(1);
                        gr1points.put(name2,name2set);}
                    else if(gr1points.containsKey(name2)){
                        gr1points.get(name2).add(1);
                        TreeSet<Integer> name1set = new TreeSet<>();
                        name1set.add(1);
                        gr1points.put(name1,name1set);}

                    else{TreeSet<Integer> name1set = new TreeSet<>();
                    TreeSet<Integer> name2set = new TreeSet<>();
                    name1set.add(1);
                    gr1points.put(name1,name1set);
                    name2set.add(1);
                    gr1points.put(name2,name2set);}}
            }}
            else {String name1 = input.next();
                String name2 = input.next();
                int goals1 = input.nextInt();
                int goals2 = input.nextInt();
                int realDiff = goals1 - goals2 ;
                if (realDiff>0){
                    if (gr2points.containsKey(name1)&&gr2points.containsKey(name2)){
                        gr2points.get(name1).add(3);
                        gr2points.get(name2).add(0);}
                    else{
                        if(gr2points.containsKey(name1)){
                            gr2points.get(name1).add(3);
                            TreeSet<Integer> name2set = new TreeSet<>();
                            name2set.add(0);
                            gr2points.put(name2,name2set);}
                        else if(gr2points.containsKey(name2)){
                            gr2points.get(name2).add(0);
                            TreeSet<Integer> name1set = new TreeSet<>();
                            name1set.add(3);
                            gr2points.put(name1,name1set);}

                        else{TreeSet<Integer> name1set = new TreeSet<>();
                        TreeSet<Integer> name2set = new TreeSet<>();
                        name1set.add(3);
                        gr2points.put(name1,name1set);
                        name2set.add(0);
                        gr2points.put(name2,name2set);}}
                    if (gr2realDiffernce.containsKey(name1)&&gr2realDiffernce.containsKey(name2)){
                        gr2realDiffernce.get(name1).add(realDiff);
                        gr2realDiffernce.get(name2).add(-1*realDiff);}
                    else{
                        if(gr2realDiffernce.containsKey(name1)){
                            gr2realDiffernce.get(name1).add(realDiff);
                            TreeSet<Integer> name2diff = new TreeSet<>();
                            name2diff.add(-1*realDiff);
                            gr2realDiffernce.put(name2,name2diff);
                        }
                        else if (gr2realDiffernce.containsKey(name2)){
                            gr2realDiffernce.get(name2).add(-1*realDiff);
                            TreeSet<Integer> name1diff = new TreeSet<>();
                            name1diff.add(realDiff);
                            gr2realDiffernce.put(name1,name1diff);
                        }
                        else{
                        TreeSet<Integer> name1diff = new TreeSet<>();
                        TreeSet<Integer> name2diff = new TreeSet<>();
                        name1diff.add(realDiff);
                        gr2realDiffernce.put(name1,name1diff);
                        name2diff.add(-1*realDiff);
                        gr2realDiffernce.put(name2,name2diff);}}
                }
                else if (realDiff<0){
                    if (gr2points.containsKey(name1)&&gr2points.containsKey(name2)){
                        gr2points.get(name1).add(0);
                        gr2points.get(name2).add(3);}
                    else{
                        if(gr2points.containsKey(name1)){
                            gr2points.get(name1).add(0);
                            TreeSet<Integer> name2set = new TreeSet<>();
                            name2set.add(3);
                            gr2points.put(name2,name2set);}
                        else if(gr2points.containsKey(name2)){
                            gr2points.get(name2).add(3);
                            TreeSet<Integer> name1set = new TreeSet<>();
                            name1set.add(0);
                            gr2points.put(name1,name1set);}

                        else{TreeSet<Integer> name1set = new TreeSet<>();
                        TreeSet<Integer> name2set = new TreeSet<>();
                        name1set.add(0);
                        gr2points.put(name1,name1set);
                        name2set.add(3);
                        gr2points.put(name2,name2set);}}
                    if (gr2realDiffernce.containsKey(name1)&&gr2realDiffernce.containsKey(name2)){
                        gr2realDiffernce.get(name1).add(realDiff);
                        gr2realDiffernce.get(name2).add(-1*realDiff);}
                    else{
                        if(gr2realDiffernce.containsKey(name1)){
                            gr2realDiffernce.get(name1).add(realDiff);
                            TreeSet<Integer> name2diff = new TreeSet<>();
                            name2diff.add(-1*realDiff);
                            gr2realDiffernce.put(name2,name2diff);
                        }
                        else if (gr2realDiffernce.containsKey(name2)){
                            gr2realDiffernce.get(name2).add(-1*realDiff);
                            TreeSet<Integer> name1diff = new TreeSet<>();
                            name1diff.add(realDiff);
                            gr2realDiffernce.put(name1,name1diff);
                        }
                        else{
                        TreeSet<Integer> name1diff = new TreeSet<>();
                        TreeSet<Integer> name2diff = new TreeSet<>();
                        name1diff.add(realDiff);
                        gr2realDiffernce.put(name1,name1diff);
                        name2diff.add(-1*realDiff);
                        gr2realDiffernce.put(name2,name2diff);}}
                }
                else {if (gr2points.containsKey(name1)&&gr2points.containsKey(name2)){
                    gr2points.get(name1).add(1);
                    gr2points.get(name2).add(1);}
                else{
                    if(gr2points.containsKey(name1)){
                        gr2points.get(name1).add(1);
                        TreeSet<Integer> name2set = new TreeSet<>();
                        name2set.add(1);
                        gr2points.put(name2,name2set);}
                    else if(gr2points.containsKey(name2)){
                        gr2points.get(name2).add(1);
                        TreeSet<Integer> name1set = new TreeSet<>();
                        name1set.add(1);
                        gr2points.put(name1,name1set);}

                    else{TreeSet<Integer> name1set = new TreeSet<>();
                    TreeSet<Integer> name2set = new TreeSet<>();
                    name1set.add(1);
                    gr2points.put(name1,name1set);
                    name2set.add(1);
                    gr2points.put(name2,name2set);}}
            }
    }} 
    } catch(FileNotFoundException e){e.printStackTrace();}
    System.out.println(gr1realDiffernce+"   "+gr1points);
    
    System.out.println(gr2realDiffernce+"    "+gr2points); 
}}
