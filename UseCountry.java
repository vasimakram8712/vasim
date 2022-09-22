package Collection3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UseCountry {

	public static void main(String[] args) {
	
		
		ArrayList<Country> con = new ArrayList<>();
          con.add(new Country("india",323413211,"delhi","hindi",12342387));
          con.add(new Country("china",7637637,"thavin","chininish",8274647));
          con.add(new Country("america",873670,"newyark","english",9847565));
          con.add(new Country("engalnd",7464658,"harima","englisg",8784740));
          con.add(new Country("srilanka",876765,"kolumpu","tamil",876455));
          con.add(new Country("thailand",765565,"thai","thaiman",876767));
          con.add(new Country("australiya",987899,"havai","yhaikao",98786));
          con.add(new Country("bakistan",987899,"bakikam","bakistani",98900));
          con.add(new Country("westIndies",89879,"english","west",987876));
          con.add(new Country("southi",98989,"arabic","thamam",98786));
          con.add(new Country("jaban",987877,"jabanish","tokiyo",98758));
          con.add(new Country("dubai",876987,"english","makai",9878788));
          
          List<String> uStartCountrys=con.stream().filter(a->!a.getName().startsWith("s")).map(x-> x.getCapital()).collect(Collectors.toList());
          con.stream().filter(x->!x.getCapital().startsWith("s"));
           
              System.out.println(uStartCountrys);
        
	}

}
