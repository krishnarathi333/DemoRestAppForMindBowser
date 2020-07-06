package com.rest.demoRest;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class ManagerDAOService {
	
	public static List<managesrBean>  managerData= new ArrayList<>();

	
	static {
		managerData.add(new managesrBean("Krishna","rathi","12345","Amravati","conduent"));
		managerData.add(new managesrBean("Shubham","mishra","12345","Amravati","conduent"));
		managerData.add(new managesrBean("Raj","mehata","12345","Amravati","conduent"));
		managerData.add(new managesrBean("Preeti","joshi","12345","Amravati","conduent"));
	}
	
	public List toGetAllData() {
		return managerData;
	}
	
	public managesrBean toGetSingleRecord(String arg) {
		
		for(managesrBean data:managerData) {
			if(data.firstName == arg) {
				return data;
			}
		}
		return null ;
		
	}

	public managesrBean save(managesrBean mgrBean) {
		managerData.add(mgrBean);
		return mgrBean;
	}

public managesrBean toDeleteByName(String arg) {
	Iterator<managesrBean> user = managerData.iterator();
		
		while (user.hasNext()) {
			managesrBean data = user.next();
			if(data.firstName == arg) {
				user.remove();
				return data;
			}
		}
		return null ;
		
	}

}
