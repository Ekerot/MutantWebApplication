package com.MutantGenerator.web;

import com.MutantGenerator.npc.NPC;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SlpController {

	@RequestMapping("/")
	public String index() {

		return "index";

	}

	@RequestMapping(value = "/npc/{roleDesc}")
	public String randomizeSlp(@PathVariable("roleDesc") String roleDesc, Model model) {
		
		NPC npc = NpcResolver.resolve(roleDesc);
		model.addAttribute("npc", npc);
		return "npc";
	}
	
}
