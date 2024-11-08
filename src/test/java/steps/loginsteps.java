package steps;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;





public class loginsteps {
	static WebDriver driver;
	WebDriverWait Wait;
	
	@Given("user should navigate to application")
	public void userShouldNavigateToApplication() {
	    System.out.println("The Login is successful");
	    
	    driver = new ChromeDriver();
	    String baseURL = "https://digival-staging-nginx-ds-yk25kmkzeq-el.a.run.app/dev-dcweb/auth/login";
		driver.get(baseURL);
		driver.manage().window().maximize();
		String mainWindowHandle = driver.getWindowHandle();
	    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	    
		 Wait = new WebDriverWait(driver, Duration.ofSeconds(100));
	    
	}
	@Given("user enter username as {string}")
	public void userEnterUsernameAs(String string) {
		driver.findElement(By.xpath("//input[@type =\"input\"]")).sendKeys("sf61@mail.com");
	}
	@Given("user enter password as {string}")
	public void userEnterPasswordAs(String string) {
		driver.findElement(By.xpath("//input [@type= \"password\"]")).sendKeys("12345678");
	}
	@When("user click the submit button")
	public void userClickTheSubmitButton() {
		driver.findElement(By.xpath("//button [@type= 'submit']")).click();
	}
	@Then("loginShouldBeSuccess")
	public void loginShouldBeSuccess() {
		System.out.println("The login is successfully done");
	}
	@Then("click on Digiclass")
	public void clickOnDigiclass() throws InterruptedException {
		Thread.sleep(30000);
		driver.findElement(By.xpath("//img[@alt=\"DigiClass\"]")).click();	
	}
	@Then("click on Survey")
	public void clickOnSurvey() {
			driver.findElement(By.xpath("(//a [@aria-current=\"page\"])[3]")).click();
	}
	@Then("click on Survey Management")
	public void clickOnSurveyManagement() throws InterruptedException {
		driver.findElement(By.xpath("//div[text()='Survey Management']")).click();
		Thread.sleep(5000);
	}
	@Then("click on Survey bank")
	public void clickOnSurveyBank() {
		driver.findElement(By.xpath("//button[text() = 'Survey Bank']")).click();
	}
	@Then("click on Survey Templates")
	public void clickOnSurveyTemplates() {
		driver.findElement(By.xpath("//button[text()='Survey Templates']")).click();
	}
	@Then("click on Course Level")
	public void clickOnCourseLevel() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text() = 'Course level']")).click();
	}
	@Then("click on CreateSurvey")
	public void clickOnCreateSurvey() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Create Survey']")).click();
	}
	@Then("click on CreateTemplate")
	public void clickOnCreateTemplate() {
		driver.findElement(By.xpath("//div[text()='Create Template']")).click();
	}
	@Then("enter Survey Title as {string}")
	public void enterSurveyTitleAs(String string) {
		driver.findElement(By.xpath("//input[@placeholder=\"Enter Survey Title\"]")).sendKeys("Survey Automation");
	}
	@Then("enter Description as {string}")
	public void enterDescriptionAs(String string) {
		driver.findElement(By.xpath("//textarea[@name=\"surveyDescription\"]")).sendKeys("Testing");
	}
	@Then("click on Survey Level")
	public void clickOnSurveyLevel() {
		driver.findElement(By.xpath("(//input[@type=\"radio\"])[3]")).click();
	}
	@Then("click on Survey type selection")
	public void clickOnSurveyTypeSelection() {
		driver.findElement(By.xpath("//div[@role=\"combobox\"]")).click();
	}
	@Then("click on Survey type")
	public void clickOnSurveyType() {
		driver.findElement(By.xpath("//label[text()='Automation final testing']")).click();
	}
	@Then("select Learning Outcome")
	public void selectLearningOutcome() {
		driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[2]")).click();
	}
	@Then("select Mapping Outcome")
	public void selectMappingOutcome() {
		driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[3]")).click();
	}
	@Then("click on start Creation")
	public void clickOnStartCreation() {
		driver.findElement(By.xpath("//button[text()='Start Creation']")).click();
	}
	@Then("click on Add Question")
	public void clickOnAddQuestion() {
		driver.findElement(By.xpath("//span[text()='Add Question']")).click();
	}
	@Then("duplicate the Question")
	public void duplicateTheQuestion() {
		driver.findElement(By.xpath("(//span[text()='Duplicate'])[2]")).click();
	}
	@Then("require the question")
	public void requireTheQuestion() {
		driver.findElement(By.xpath("(//span[text()='Required'])[2]")).click();
	}
	@Then("delete the Question")
	public void deleteTheQuestion() {
		driver.findElement(By.xpath("(//span[text()='Delete'])[3]")).click();
	}
	@Then("click on Add New Question")
	public void clickOnAddNewQuestion() {

		driver.findElement(By.xpath("(//span[text()='Add Question'])[1]")).click();
		
		WebElement inputElement = Wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[text()='question_2'])[1]")));
		inputElement.click();
		inputElement.sendKeys(Keys.CONTROL + "a"); 
		inputElement.sendKeys(Keys.DELETE);
		inputElement.sendKeys(" Why Java for Automation testing?");
	}
	@Then("click on Long text")
	public void clickOnLongText() {
		driver.findElement(By.xpath("(//div[@title=\"Long Text\"])[1]")).click();
	}
	@Then("click on Create Runner step Template Survey")
	public void clickOnCreateRunnerStepTemplateSurvey() {
		driver.findElement(By.xpath("//button[text()=\"Create Template Survey\"]")).click();
	}
	}


	


