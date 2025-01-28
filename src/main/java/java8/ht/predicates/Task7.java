package java8.ht.predicates;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Task7 {

	public static void main(String[] args) {

		ArrayList<Response> responselist = new ArrayList<>();
		responselist.add(new Response("Error", 404, "text/plain"));
		responselist.add(new Response("Success", 200, "application/json"));
		responselist.add(new Response("Success", 400, "text/plain"));

		Predicate<Response> responsepredicate = r -> r.getResponseType()=="application/json";

		responselist.stream().filter(responsepredicate).forEach(s -> System.out.println(s));

	
	}

}
