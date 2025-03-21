package cookcloud.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cookcloud.entity.RecipeTag;
import cookcloud.entity.RecipetagId;
import cookcloud.service.RecipeTagService;

@RestController
@RequestMapping("/cookcloud")
public class RecipetagController {
	
	@Autowired
	private RecipeTagService recipeTagService;
	
//	public ResponseEntity<Map<RecipetagId, RecipeTag>> getAllRecipetag() {
//		Map<RecipetagId, RecipeTag> recipetagData = recipeTagService.getAllRecipetag();
//		
//		
//		
//	}
	
}
