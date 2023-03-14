package com.rentcar.frontcontroller;


import java.util.HashMap;

import com.rentcar.controller.Controller;
import com.rentcar.controller.MainController;



public class HandlerMapping {
	private HashMap<String, Controller> mappings;
	public HandlerMapping() {
		mappings = new HashMap<String, Controller>();
		mappings.put("/main.do", new MainController());
//		mappings.put("/memberLogin.do", new MemberLoginController());
//		mappings.put("/memberLogout.do", new MemberLogoutController());
//		mappings.put("/carMain.do", new CarMainController());
//		mappings.put("/carReserveInfo.do", new CarReserveInfoController());
//		mappings.put("/carCategory.do", new CarCategoryController());
//		mappings.put("/carAllList.do", new CarAllListController());
//		mappings.put("/carOptionSelect.do", new CarOptionSelectController());
//		mappings.put("/carReserveResult.do", new CarReserveResultController());
//		mappings.put("/carReserveAllList.do", new CarReserveAllListController());
	}
	public com.rentcar.controller.Controller getController(String key) {
		return mappings.get(key);
	}
}