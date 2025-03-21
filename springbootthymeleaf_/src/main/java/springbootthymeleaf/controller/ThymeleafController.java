package springbootthymeleaf.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import springbootthymeleaf.model.Person;

@Controller
@RequestMapping("/thymeleaf")
public class ThymeleafController {

	@GetMapping("/thymeleaftags")
	public String thymeleaftags(Model model) {
		model.addAttribute("name", "홍길동");
		model.addAttribute("content", "<b>content</b>");
		model.addAttribute("userId", "hong");
		List<Person> persons = new ArrayList<Person>();
		persons.add(new Person("강감찬", 30));
		persons.add(new Person("이순신", 40));
		model.addAttribute("persons", persons);
		model.addAttribute("isLoggedIn", true);
		model.addAttribute("role", "admin");
		model.addAttribute("isActive", false);
		return "thymeleaftags";
	}
	
}


















