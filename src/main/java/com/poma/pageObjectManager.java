package com.poma;

import com.Base.Bass_class;
import com.pom.Home_Page;
import com.pom.Select_Kids;

public class pageObjectManager extends Bass_class {

	private Home_Page hp;
	private Select_Kids sk;
	public Home_Page getHp() {
		if (hp == null) {
			hp = new Home_Page(driver);
		}
		return hp;
	}
	
	public Select_Kids getsk() {
		if (sk == null) {
			sk = new Select_Kids(driver);
		}
		return sk;
	}
}
