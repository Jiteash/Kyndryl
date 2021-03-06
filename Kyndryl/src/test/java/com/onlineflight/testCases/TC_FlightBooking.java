package com.onlineflight.testCases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.onlineflight.pageObjects.MainDashboard;

public class TC_FlightBooking extends BaseClass{
	
	
	
	@Test (priority = 0)
	public void verifyTitle() throws InterruptedException{
		
		driver.get(baseURL);
		MainDashboard page = new MainDashboard(driver);
		driver.manage().window().maximize();
		if(driver.getTitle().equals("Southwest Airlines | Book Flights, Make Reservations & Plan a Trip"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		
	}
	
	@Test (priority = 1)
	public void Searchflight() throws InterruptedException {
		
		MainDashboard page = new MainDashboard(driver);
		page.tripType();
		page.setDeparture(Departurecity);
		page.setArrival(Arrivalcity);
		page.setJourneyStartDate(StartDate);
		page.clicksearch();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//select the first date of the table
		WebElement baseTable = driver.findElement(By.tagName("table"));
		WebElement tableRow = baseTable.findElement(By.xpath("//*[@id=\"air-booking-fares-0-1\"]/table/tbody/tr[1]"));
         //to get 3rd row's 2nd column data
	    tableRow.findElement(By.xpath("//*[@id=\"air-booking-fares-0-1\"]/table/tbody/tr[1]/td[2]")).click();
	    page.proceedtopay();
	    
	}

}
