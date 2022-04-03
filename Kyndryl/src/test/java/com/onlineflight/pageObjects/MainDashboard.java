package com.onlineflight.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainDashboard {
	WebDriver ldriver;
	public MainDashboard(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver,this);
	}

	@FindBy(xpath="//*[@id=\"TabbedArea_4-panel-0\"]/div/div/div/form/div[1]/div[1]/div/fieldset/ul/li[2]/label/input")
	WebElement tripmode;
	
	@FindBy(id="LandingAirBookingSearchForm_originationAirportCode")
	WebElement txtDeparture;
	
	@FindBy(id="LandingAirBookingSearchForm_destinationAirportCode")
	WebElement txtArrival;
	
	@FindBy(id="LandingAirBookingSearchForm_departureDate")
	WebElement txtSdate;
	
	@FindBy(id="LandingAirBookingSearchForm_returnDate")
	WebElement txtEdate;
	
	@FindBy(id="LandingAirBookingSearchForm_submit-button")
	WebElement searchbtn;
	
	@FindBy(id="air-booking-product-2")
	WebElement proceed;
	
	public void proceedtopay() {
		proceed.click();
	}
	
	public void tripType()
	{
		tripmode.click();
	}
	
	public void setDeparture(String Departurecity)
	{
		txtDeparture.clear();
		txtDeparture.sendKeys(Departurecity);
	}
	public void setArrival(String Arrivalcity)
	{
		txtArrival.clear();
		txtArrival.sendKeys(Arrivalcity);
	}
	public void setJourneyStartDate(String JourneySDate)
	{
		txtSdate.clear();
		txtSdate.sendKeys(JourneySDate);
	}
	
	public void setJourneyEndDate(String JourneyEDate)
	{
		txtEdate.clear();
		txtEdate.sendKeys(JourneyEDate);
	}
	public void clicksearch()
	{
		searchbtn.click();
	}
}
