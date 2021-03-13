package com.drm;

import java.util.ArrayList;
import java.util.List;

//import java.util.concurrent.atomic.AtomicLong;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DrmController {
	static List<Country> countryList = null;
	static List<State> stateList = null;

	static {
		countryList = new ArrayList<Country>();
		countryList.add(new Country(1, "United States"));
		countryList.add(new Country(2, "Taiwan"));
		countryList.add(new Country(3, "South Korea"));
	}

	static {
		stateList = new ArrayList<State>();
		stateList.add(new State("AL","Alabama"));
		stateList.add(new State("AK","Alaska"));
		stateList.add(new State("AZ","Arizona"));
		stateList.add(new State("AR","Arkansas"));
		stateList.add(new State("CA","California"));
		stateList.add(new State("CO","Colorado"));
		stateList.add(new State("CT","Connecticut"));
		stateList.add(new State("DE","Delaware"));
		stateList.add(new State("DC","District Of Columbia"));
		stateList.add(new State("FL","Florida"));
		stateList.add(new State("GA","Georgia"));
		stateList.add(new State("HI","Hawaii"));
		stateList.add(new State("ID","Idaho"));
		stateList.add(new State("IL","Illinois"));
		stateList.add(new State("IN","Indiana"));
		stateList.add(new State("IA","Iowa"));
		stateList.add(new State("KS","Kansas"));
		stateList.add(new State("KY","Kentucky"));
		stateList.add(new State("LA","Louisiana"));
		stateList.add(new State("ME","Maine"));
		stateList.add(new State("MD","Maryland"));
		stateList.add(new State("MA","Massachusetts"));
		stateList.add(new State("MI","Michigan"));
		stateList.add(new State("MN","Minnesota"));
		stateList.add(new State("MS","Mississippi"));
		stateList.add(new State("MO","Missouri"));
		stateList.add(new State("MT","Montana"));
		stateList.add(new State("NE","Nebraska"));
		stateList.add(new State("NV","Nevada"));
		stateList.add(new State("NH","New Hampshire"));
		stateList.add(new State("NJ","New Jersey"));
		stateList.add(new State("NM","New Mexico"));
		stateList.add(new State("NY","New York"));
		stateList.add(new State("NC","North Carolina"));
		stateList.add(new State("ND","North Dakota"));
		stateList.add(new State("OH","Ohio"));
		stateList.add(new State("OK","Oklahoma"));
		stateList.add(new State("OR","Oregon"));
		stateList.add(new State("PA","Pennsylvania"));
		stateList.add(new State("RI","Rhode Island"));
		stateList.add(new State("SC","South Carolina"));
		stateList.add(new State("SD","South Dakota"));
		stateList.add(new State("TN","Tennessee"));
		stateList.add(new State("TX","Texas"));
		stateList.add(new State("UT","Utah"));
		stateList.add(new State("VT","Vermont"));
		stateList.add(new State("VA","Virginia"));
		stateList.add(new State("WA","Washington"));
		stateList.add(new State("WV","West Virginia"));
		stateList.add(new State("WI","Wisconsin"));
		stateList.add(new State("WY","Wyoming"));
	}
	/*
	 * private static final String template = "Hello, %s!"; private final AtomicLong
	 * counter = new AtomicLong();
	 * 
	 * 
	 * test json response
	 * 
	 * @GetMapping("/hello-world")
	 * 
	 * @ResponseBody public Greeting sayHello(@RequestParam(name = "name", required
	 * = false, defaultValue = "Stranger") String name) { return new
	 * Greeting(counter.incrementAndGet(), String.format(template, name)); }
	 * 
	 * test round trip
	 * 
	 * @GetMapping("/greeting") public String greetingForm(Model model) {
	 * model.addAttribute("greeting", new Greeting()); return "greeting"; }
	 * 
	 * @PostMapping("/greeting") public String greetingSubmit(@ModelAttribute
	 * Greeting greeting, Model model) { model.addAttribute("greeting", greeting);
	 * return "result"; }
	 * 
	 */

	@GetMapping("/index")
	public String indexForm(Model model) {
		model.addAttribute("index", new DRM());
		model.addAttribute("countryList", countryList);
		model.addAttribute("stateList", stateList);
		return "index";
	}

	@PostMapping("/index")
	public String indexSubmit(@ModelAttribute DRM drm, Model model) {
		model.addAttribute("index", drm);
		return "testResponse";
	}
}