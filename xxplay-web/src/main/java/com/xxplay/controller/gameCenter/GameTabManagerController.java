package com.xxplay.controller.gameCenter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 游戏表标签管理controller
 * 
 * @Author:chenssy
 * @Copyright chenssy   2016 All Rights Reserved.
 * 
 * @date:2016年4月24日 下午9:05:16
 */
@Controller
@RequestMapping("/gameTab")
public class GameTabManagerController {
	
	/**
	 * 游戏标签管理
	 *
	 * @return
	 *
	 * @author:chenssy
	 * @date : 2016年4月24日 下午9:22:58
	 */
	@RequestMapping("/gameTabManagerIndex")
	public String gameTabManagerIndex(){
		return "/game/gameTabManager";
	}
}
