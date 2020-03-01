package com.webcore.app.loan.main.service;

import com.webcore.app.loan.main.model.Branch;
import com.webcore.app.loan.main.model.BranchType;
import com.webcore.app.loan.main.model.City;
import com.webcore.app.loan.main.model.Status;
import com.webcore.app.loan.main.model.User;



public interface ServiceI {

	void saveBranch(Branch b);

	void saveaddress(City c);

	void saveUser(User u);

	void savebranchtype(BranchType bt);

	void savestatus(Status s);

	


}
