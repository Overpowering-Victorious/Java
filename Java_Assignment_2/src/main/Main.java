package main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import entity.Candidate;
import methods.Implementation;

public class Main {

	public static void main(String[] args) {
		
		Implementation imp=new Implementation();
		
		List<Candidate>list=new ArrayList<Candidate>();
		
		list.add(new Candidate(1, "Alice Johnson", 29, "Female", "HR", 2020, 55000));
        list.add(new Candidate(2, "Bob Smith", 35, "Male", "Finance", 2015, 78000));
        list.add(new Candidate(3, "Charlie Lee", 28, "Male", "IT", 2019, 68000));
        list.add(new Candidate(4, "Diana Evans", 32, "Female", "Marketing", 2018, 72000));
        list.add(new Candidate(5, "Ethan Brown", 41, "Male", "IT", 2012, 95000));
        list.add(new Candidate(6, "Fiona White", 26, "Female", "Sales", 2021, 50000));
        list.add(new Candidate(7, "George King", 30, "Male", "Operations", 2017, 64000));
        list.add(new Candidate(8, "Hannah Scott", 27, "Female", "HR", 2022, 52000));
        list.add(new Candidate(9, "Ian Clark", 38, "Male", "Finance", 2010, 87000));
        list.add(new Candidate(10, "Julia Adams", 33, "Female", "IT", 2016, 80000));
        
        System.out.println(imp.getCount(list));
        System.out.println(imp.getAverageAge(list));
        System.out.println(imp.countCandidatesDepartmentWise(list));
        System.out.println(imp.getYoungestCandidateDetails(list));
        
        System.out.println();
        
        System.out.println(list.stream().collect(Collectors.toMap(c->c.getGender(), c->1, Integer::sum)));
        System.out.println(list.stream().collect(Collectors.groupingBy(c->c.getGender(),Collectors.averagingDouble(c->c.getAge()))));
        System.out.println(list.stream().collect(Collectors.toMap(c->c.getDepartment(), c->1, Integer::sum)));
        System.out.println(list.stream().collect(Collectors.minBy(Comparator.comparingInt(c->c.getAge()))));
	}

}
