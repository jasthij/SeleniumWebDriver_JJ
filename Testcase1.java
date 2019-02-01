package Testcase;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Testcase1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jitja\\Downloads\\BrowserDrivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		String baseUrl = "http://www.tcm.com/tcmdb/";
		driver.get(baseUrl);

		// Clicking on MovieLink1:

		WebElement movielink1 = driver.findElement(By.xpath("//*[@id=\"movieSearchList\"]/div/a[1]"));
		movielink1.click();

		// MovieLink1 Title Verification:

		WebDriverWait wait1 = new WebDriverWait(driver, 5);
		WebElement movielink1title = driver.findElement(By.xpath("//*[@id=\"dbartimgtitle\"]/h1/span[1]"));
		WebElement e1;
		e1 = wait1.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"dbartimgtitle\"]/h1/span[1]")));
		String expectedmovielink1title = "TO HAVE AND HAVE NOT";
		String actualmovielink1title = movielink1title.getText();

		if (actualmovielink1title.contentEquals(expectedmovielink1title)) {

			System.out.println("Movielink1 title is" + " " + expectedmovielink1title);

		} else {

			System.out.println("Movielink1 title is incorrect");
		}

		// MovieLink1 Overview Verification:

		WebElement movielink1overview = driver.findElement(By.xpath("//*[@id=\"overViewbox\"]/div[3]/p[1]"));
		String expectedmovielink1overview = "A skipper-for-hire's romance with a beautiful drifter is complicated by his growing involvement with the French resistance.";
		String actualmovielink1overview = movielink1overview.getText();

		if (actualmovielink1overview.contentEquals(expectedmovielink1overview)) {

			System.out.println("Movielink1 overview is" + " " + expectedmovielink1overview);

		} else {

			System.out.println("Movielink1 overview is incorrect");
		}

		// MovieLink1 Actor1 Verification:

		WebElement movielink1actor1 = driver
				.findElement(By.xpath("//*[@id=\"overViewbox\"]/div[6]/div[2]/div[2]/strong/a"));
		String expectedmovielink1actor1 = "Walter Brennan";
		String actualmovielink1actor1 = movielink1actor1.getText();

		if (actualmovielink1actor1.contentEquals(expectedmovielink1actor1)) {

			System.out.println("Movielink1 actor1 is" + " " + expectedmovielink1actor1);

		} else {

			System.out.println("Movielink1 actor1 is incorrect");
		}

		// MovieLink1 Actor2 Verification:

		WebElement movielink1actor2 = driver.findElement(By.xpath("//*[@id=\"overViewbox\"]/div[6]/div[3]/div[3]/strong/a"));
		String expectedmovielink1actor2 = "Sheldon Leonard";
		String actualmovielink1actor2 = movielink1actor2.getText();

		if (actualmovielink1actor2.contentEquals(expectedmovielink1actor2)) {

			System.out.println("Movielink1 actor2 is" + " " + expectedmovielink1actor2);

		} else {

			System.out.println("Movielink1 actor2 is incorrect");
		}

		// MovieLink1 Release Date Verification:

		WebElement movielink1releasedate = driver.findElement(By.xpath("//*[@id=\"additional\"]/table/tbody/tr[2]/td[2]"));
		String expectedmovielink1releasedate = "1944";
		String actualmovielink1releasedate = movielink1releasedate.getText();

		if (actualmovielink1releasedate.contentEquals(expectedmovielink1releasedate)) {

			System.out.println("Movielink1 release date is" + " " + expectedmovielink1releasedate);

		} else {

			System.out.println("Movielink1 release date is incorrect");
		}

		
		driver.navigate().back();


		// Clicking on MovieLink2:

		WebElement movielink2 = driver.findElement(By.xpath("//*[@id=\"movieSearchList\"]/div/a[2]"));
		movielink2.click();

		// MovieLink2 Title Verification:
		
		WebDriverWait wait2 = new WebDriverWait(driver, 10);
		WebElement e2;
		e2 = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"dbartimgtitle\"]/h1/span[1]")));
		WebElement movielink2title = driver.findElement(By.xpath("//*[@id=\"dbartimgtitle\"]/h1/span[1]"));
		String expectedmovielink2title = "FALLEN ANGEL";
		String actualmovielink2title = movielink2title.getText();

		if (actualmovielink2title.contentEquals(expectedmovielink2title)) {

			System.out.println("Movielink2 title is" + " " + expectedmovielink2title);

		} else {

			System.out.println("Movielink2 title is incorrect");
		}

		// MovieLink2 Overview Verification:

		WebElement movielink2overview = driver.findElement(By.xpath("//*[@id=\"overViewbox\"]/div[3]/p[1]"));
		String expectedmovielink2overview = "A man is accused of killing a waitress he had tried to seduce with his wife''''s money.";
		String actualmovielink2overview = movielink2overview.getText();

		if (actualmovielink2overview.contentEquals(expectedmovielink2overview)) {

			System.out.println("Movielink2 overview is" + " " + expectedmovielink2overview);

		} else {

			System.out.println("Movielink2 overview is incorrect");
		}

		// MovieLink2 Actor1 Verification:

		WebElement movielink2actor1 = driver.findElement(By.xpath("//*[@id=\"overViewbox\"]/div[6]/div[2]/div[2]/strong/a"));
		String expectedmovielink2actor1 = "Dana Andrews";
		String actualmovielink2actor1 = movielink2actor1.getText();

		if (actualmovielink2actor1.contentEquals(expectedmovielink2actor1)) {

			System.out.println("Movielink2 actor1 is" + " " + expectedmovielink2actor1);

		} else {

			System.out.println("Movielink2 actor1 is incorrect");
		}

		// MovieLink2 Actor2 Verification:

		WebElement movielink2actor2 = driver.findElement(By.xpath("//*[@id=\"overViewbox\"]/div[6]/div[3]/div[3]/strong/a"));
		String expectedmovielink2actor2 = "Bruce Cabot";
		String actualmovielink2actor2 = movielink2actor2.getText();

		if (actualmovielink2actor2.contentEquals(expectedmovielink2actor2)) {

			System.out.println("Movielink2 actor2 is" + " " + expectedmovielink2actor2);

		} else {

			System.out.println("Movielink2 actor2 is incorrect");
		}

		// MovieLink2 Release Date Verification:

		WebElement movielink2releasedate = driver.findElement(By.xpath("//*[@id=\"additional\"]/table/tbody/tr[2]/td[2]"));
		String expectedmovielink2releasedate = "1945";
		String actualmovielink2releasedate = movielink2releasedate.getText();

		if (actualmovielink2releasedate.contentEquals(expectedmovielink2releasedate)) {

			System.out.println("Movielink2 release date is" + " " + expectedmovielink2releasedate);

		} else {

			System.out.println("Movielink2 release date is incorrect");
		}

		driver.navigate().back();
		 
		 
		// Clicking on MovieLink3:

		WebElement movielink3 = driver.findElement(By.xpath("//*[@id=\"movieSearchList\"]/div/a[3]"));
		movielink3.click();

		// MovieLink3 Title Verification:
		
		WebDriverWait wait3 = new WebDriverWait(driver, 10);
		WebElement e3;
		e3 = wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"dbartimgtitle\"]/h1/span[1]")));
		WebElement movielink3title = driver.findElement(By.xpath("//*[@id=\"dbartimgtitle\"]/h1/span[1]"));
		String expectedmovielink3title = "THOROUGHLY MODERN MILLIE";
		String actualmovielink3title = movielink3title.getText();

		if (actualmovielink3title.contentEquals(expectedmovielink3title)) {

			System.out.println("Movielink3 title is" + " " + expectedmovielink3title);

		} else {

			System.out.println("Movielink3 title is incorrect");
		}

		// MovieLink3 Overview Verification:

		WebElement movielink3overview = driver.findElement(By.xpath("//*[@id=\"overViewbox\"]/div[3]/p[1]"));
		String expectedmovielink3overview = "A small-town girl hits the big city in search of romance Roaring Twenties style.";
		String actualmovielink3overview = movielink3overview.getText();

		if (actualmovielink3overview.contentEquals(expectedmovielink3overview)) {

			System.out.println("Movielink3 overview is" + " " + expectedmovielink3overview);

		} else {

			System.out.println("Movielink3 overview is incorrect");
		}

		// MovieLink3 Actor1 Verification:

		WebElement movielink3actor1 = driver.findElement(By.xpath("//*[@id=\"overViewbox\"]/div[7]/div[2]/div[2]/strong/a"));
		String expectedmovielink3actor1 = "Mary Tyler Moore";
		String actualmovielink3actor1 = movielink3actor1.getText();

		if (actualmovielink3actor1.contentEquals(expectedmovielink3actor1)) {

			System.out.println("Movielink3 actor1 is" + " " + expectedmovielink3actor1);

		} else {

			System.out.println("Movielink3 actor1 is incorrect");
		}

		// MovieLink3 Actor2 Verification:

		WebElement movielink3actor2 = driver.findElement(By.xpath("//*[@id=\"overViewbox\"]/div[7]/div[3]/div[3]/strong/a"));
		String expectedmovielink3actor2 = "John Gavin";
		String actualmovielink3actor2 = movielink3actor2.getText();

		if (actualmovielink3actor2.contentEquals(expectedmovielink3actor2)) {

			System.out.println("Movielink3 actor2 is" + " " + expectedmovielink3actor2);

		} else {

			System.out.println("Movielink3 actor2 is incorrect");
		}

		// MovieLink3 Release Date Verification:

		WebElement movielink3releasedate = driver.findElement(By.xpath("//*[@id=\"additional\"]/table/tbody/tr[2]/td[2]"));
		String expectedmovielink3releasedate = "1967";
		String actualmovielink3releasedate = movielink3releasedate.getText();

		if (actualmovielink3releasedate.contentEquals(expectedmovielink3releasedate)) {

			System.out.println("Movielink3 release date is" + " " + expectedmovielink3releasedate);

		} else {

			System.out.println("Movielink3 release date is incorrect");
		}

		driver.navigate().back();
		 
		 

		// Clicking on MovieLink4:

		WebElement movielink4 = driver.findElement(By.xpath("//*[@id=\"movieSearchList\"]/div/a[4]"));
		movielink4.click();

		// MovieLink4 Title Verification:
		
		WebDriverWait wait4 = new WebDriverWait(driver, 10);
		WebElement e4;
		e4 = wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"dbartimgtitle\"]/h1/span[1]")));
		WebElement movielink4title = driver.findElement(By.xpath("//*[@id=\"dbartimgtitle\"]/h1/span[1]"));
		String expectedmovielink4title = "ROME ADVENTURE";
		String actualmovielink4title = movielink4title.getText();

		if (actualmovielink4title.contentEquals(expectedmovielink4title)) {

			System.out.println("Movielink4 title is" + " " + expectedmovielink4title);

		} else {

			System.out.println("Movielink4 title is incorrect");
		}

		// MovieLink4 Overview Verification:

		WebElement movielink4overview = driver.findElement(By.xpath("//*[@id=\"overViewbox\"]/div[3]/p[1]"));
		String expectedmovielink4overview = "A rebellious teacher moves to Rome and finds love.";
		String actualmovielink4overview = movielink4overview.getText();

		if (actualmovielink4overview.contentEquals(expectedmovielink4overview)) {

			System.out.println("Movielink4 overview is" + " " + expectedmovielink4overview);

		} else {

			System.out.println("Movielink4 overview is incorrect");
		}

		// MovieLink4 Actor1 Verification:

		WebElement movielink4actor1 = driver.findElement(By.xpath("//*[@id=\"overViewbox\"]/div[6]/div[2]/div[2]/strong/a"));
		String expectedmovielink4actor1 = "Angie Dickinson";
		String actualmovielink4actor1 = movielink4actor1.getText();

		if (actualmovielink4actor1.contentEquals(expectedmovielink4actor1)) {

			System.out.println("Movielink4 actor1 is" + " " + expectedmovielink4actor1);

		} else {

			System.out.println("Movielink4 actor1 is incorrect");
		}

		// MovieLink4 Actor2 Verification:

		WebElement movielink4actor2 = driver.findElement(By.xpath("//*[@id=\"overViewbox\"]/div[6]/div[3]/div[3]/strong/a"));
		String expectedmovielink4actor2 = "Al Hirt";
		String actualmovielink4actor2 = movielink4actor2.getText();

		if (actualmovielink4actor2.contentEquals(expectedmovielink4actor2)) {

			System.out.println("Movielink4 actor2 is" + " " + expectedmovielink4actor2);

		} else {

			System.out.println("Movielink4 actor2 is incorrect");
		}

		// MovieLink4 Release Date Verification:

		WebElement movielink4releasedate = driver.findElement(By.xpath("//*[@id=\"additional\"]/table/tbody/tr[2]/td[2]"));
		String expectedmovielink4releasedate = "1962";
		String actualmovielink4releasedate = movielink4releasedate.getText();

		if (actualmovielink4releasedate.contentEquals(expectedmovielink4releasedate)) {

			System.out.println("Movielink4 release date is" + " " + expectedmovielink4releasedate);

		} else {

			System.out.println("Movielink4 release date is incorrect");
		}

		driver.navigate().back();
		 

		
		// Clicking on MovieLink5:

		WebElement movielink5 = driver.findElement(By.xpath("//*[@id=\"movieSearchList\"]/div/a[5]"));
		movielink5.click();

		// MovieLink5 Title Verification:
		
		WebDriverWait wait5 = new WebDriverWait(driver, 10);
		WebElement e5;
		e5 = wait5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"dbartimgtitle\"]/h1/span[1]")));
		WebElement movielink5title = driver.findElement(By.xpath("//*[@id=\"dbartimgtitle\"]/h1/span[1]"));
		String expectedmovielink5title = "THE SECRET GARDEN";
		String actualmovielink5title = movielink5title.getText();

		if (actualmovielink5title.contentEquals(expectedmovielink5title)) {

			System.out.println("Movielink5 title is" + " " + expectedmovielink5title);

		} else {

			System.out.println("Movielink5 title is incorrect");
		}

		// MovieLink5 Overview Verification:

		WebElement movielink5overview = driver.findElement(By.xpath("//*[@id=\"overViewbox\"]/div[3]/p[1]"));
		String expectedmovielink5overview = "An orphaned girl changes the lives of those she encounters at a remote estate.";
		String actualmovielink5overview = movielink5overview.getText();

		if (actualmovielink5overview.contentEquals(expectedmovielink5overview)) {

			System.out.println("Movielink5 overview is" + " " + expectedmovielink5overview);

		} else {

			System.out.println("Movielink5 overview is incorrect");
		}

		// MovieLink5 Actor1 Verification:

		WebElement movielink5actor1 = driver.findElement(By.xpath("//*[@id=\"overViewbox\"]/div[6]/div[2]/div[2]/strong/a"));
		String expectedmovielink5actor1 = "Herbert Marshall";
		String actualmovielink5actor1 = movielink5actor1.getText();

		if (actualmovielink5actor1.contentEquals(expectedmovielink5actor1)) {

			System.out.println("Movielink5 actor1 is" + " " + expectedmovielink5actor1);

		} else {

			System.out.println("Movielink5 actor1 is incorrect");
		}

		// MovieLink5 Actor2 Verification:

		WebElement movielink5actor2 = driver.findElement(By.xpath("//*[@id=\"overViewbox\"]/div[6]/div[3]/div[3]/strong/a"));
		String expectedmovielink5actor2 = "Brian Roper";
		String actualmovielink5actor2 = movielink5actor2.getText();

		if (actualmovielink5actor2.contentEquals(expectedmovielink5actor2)) {

			System.out.println("Movielink5 actor2 is" + " " + expectedmovielink5actor2);

		} else {

			System.out.println("Movielink5 actor2 is incorrect");
		}

		// MovieLink4 Release Date Verification:

		WebElement movielink5releasedate = driver.findElement(By.xpath("//*[@id=\"additional\"]/table/tbody/tr[2]/td[2]"));
		String expectedmovielink5releasedate = "1949";
		String actualmovielink5releasedate = movielink5releasedate.getText();

		if (actualmovielink5releasedate.contentEquals(expectedmovielink5releasedate)) {

			System.out.println("Movielink5 release date is" + " " + expectedmovielink5releasedate);

		} else {

			System.out.println("Movielink5 release date is incorrect");
		}

		driver.navigate().back();
		 
		 
		driver.close();
	}

}
