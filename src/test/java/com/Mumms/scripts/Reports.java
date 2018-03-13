package com.Mumms.scripts;

import java.util.Hashtable;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.Mumms.libs.ReportsLib;
import com.automation.utilities.TestUtil;

public class Reports extends ReportsLib{
	
	@Parameters({"userrole"})
	@BeforeMethod
	public void login(String userrole) throws Throwable{
		loginAsUserRole(userrole);
	}

	@DataProvider
	public Object[][] getTestDataFor_CreateSalesandSupportTask() {
		return TestUtil.getData("CreateSalesandSupportTask", TestData, "Activity");
	}

	@Test(dataProvider = "getTestDataFor_CreateSalesandSupportTask")
	public void CreateSalesandSupportTask(Hashtable<String, String> data) throws Throwable {

		try {
			if (data.get("RunMode").equals("Y")){

				this.reporter.initTestCaseDescription( "TC1.2");	
				
			}


		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@AfterMethod
	public void logOut() throws Throwable {
		doLogout();
	}


}
