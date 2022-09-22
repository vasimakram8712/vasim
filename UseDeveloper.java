package Collection3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UseDeveloper {

	public static void main(String[] args) {
	
		ArrayList<Developer> developers=new ArrayList<>();
		developers.add(new Developer("vasim",21,30000,822,"male",3,636913190));
		developers.add(new Developer("kumar",22,40000,833,"male",4,63691311));
		developers.add(new Developer("kavi",23,35000,834,"female",5,64567322));
		developers.add(new Developer("sasi",23,34000,835,"male",3,656789000));
		developers.add(new Developer("mani",21,28000,101,"male",4,897890098));
		developers.add(new Developer("selvi",25,40000,142,"female",6,909064733));
		developers.add(new Developer("sarathi",34,50000,876,"male",8,787890790));
		developers.add(new Developer("balaji",32,40000,873,"male",5,878907690));
		developers.add(new Developer("saravanan",34,50000,765,"male",8,987656780));
		developers.add(new Developer("thiru",36,70000,768,"male",7,987898760));
		developers.add(new Developer("ramu",43,80000,545,"male",8,898789090));
		
		List<Developer> maleDevelopers=developers.stream().filter(a->a.getGender().equalsIgnoreCase("male")).collect(Collectors.toList());
		
//		System.out.println(maleDevelopers);
		
		long maledeveConut=developers.stream().filter(a->a.getGender().equalsIgnoreCase("male")).count();
		
	//	System.out.println( maledeveConut);
	    
		List<Developer> maleDevelopers1=developers.stream().filter(a->a.getSalary()>30000 && a.getSalary()<45000 ).collect(Collectors.toList());
		  
	//	System.out.println(maleDevelopers1);
	
		List<Integer> yearOfExpSenior =developers.stream().filter(a->a.getAge()>23 && a.getAge()>40).map(x-> x.getNoOfexperince()).collect(Collectors.toList());
       
//		System.out.println(yearOfExpSenior);
        Map<Integer,Developer> m=developers.stream().filter(x->x.getGender().equalsIgnoreCase("female") && x.getAge()>20).collect(Collectors.toMap(x->x.getId(),y->y));
//        System.out.println(m);
//	m.values().forEach(l->System.out.println(l));
//	m.keySet().forEach(w->System.out.println(m.get(w)));
	m.keySet().forEach(l->System.out.println(m.get(l)));
    
	}

}
