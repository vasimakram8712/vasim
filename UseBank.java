package Collection3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UseBank {

	public static void main(String[] args) {
		ArrayList<Bank> b=new ArrayList<>();
		b.add(new Bank("vasi",1234,50000,"male"));
		b.add(new Bank("main",1222,87677,"male"));
		b.add(new Bank("amjath",5454,87666,"male"));
        b.add(new Bank("naven",67676,987666,"male"));
        b.add(new Bank("selvi",98787,98976,"female"));
	
        List<String> a=b.stream().filter(c->c.getGender().equalsIgnoreCase("male")).map(m->m.getName()).collect(Collectors.toList());      
     	
	   a.forEach(e->System.out.println(e));
	
	Map<Integer,Bank> l=b.stream().filter(k->k.getAccNo()>5500).collect(Collectors.toMap(o->o.getAccNo(),y->y));

//	System.out.println(l);

	l.keySet().forEach(o->System.out.println(l.get(o)));
//	m.keySet().forEach(l->System.out.println(m.get(l)));	
	
//	Long m=b.stream().filter(p->p.getGender().startsWith("m")).count();
//	System.out.println(m);
	}

}
