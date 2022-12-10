package collection;
import java.util.TreeMap;
import collection.Mobile;
public class HashMapEx2ToMobile {

	public static void main(String[] args) {
		TreeMap<Integer,Object> hm=new TreeMap<Integer,Object>();
		hm.put(1,new Mobile("mi",35000));
		hm.put(2,new Mobile("samsung", 145000));
		hm.put(3,new Mobile("redmi",28000));
		hm.put(4,new Mobile("vivo", 14000));
		hm.put(4,new Mobile(10000, "Poco"));
		System.out.println(hm.entrySet());
		System.out.println("only keys "+ hm.keySet());
		System.out.println("only value  "+hm.values());
		
	
		}
		
	}

