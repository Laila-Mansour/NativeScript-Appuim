import io.appium.java_client.MobileBy;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class launch {
    AndroidDriver driver;
    @BeforeMethod
    public void startPoint() throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "Lily");
        capabilities.setCapability("appPackage", "org.nativescript.examples");
        capabilities.setCapability("appActivity", "com.tns.NativeScriptActivity");
         driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

//Make New Reservation Test Case
    @Test
    public void Reservations() throws Exception{
        //Click on "GET STARTED" button
        driver.findElement(By.className("android.widget.Button")).click();
        //Put application in the Background
        driver.runAppInBackground(Duration.ofSeconds(1));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //	Scroll down “Reservations”
        driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Reservations\"))"));
        driver.findElement(MobileBy.AndroidUIAutomator("text(\"Reservations\")")).click();
        //Click on +
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ImageView")).click();

        //Insert Name
        driver.findElement(MobileBy.AndroidUIAutomator("text(\"Name\")")).sendKeys("Test5pm");
        //Insert Phone
        driver.findElement(MobileBy.AndroidUIAutomator("text(\"Phone\")")).sendKeys("01011222121");
        //	Add 2 guest
        driver.findElement(By.id("org.nativescript.examples:id/number_picker_plus")).click();
        //Select floor
        driver.findElement(MobileBy.AndroidUIAutomator("text(\"1st floor\")")).click();
        driver.findElement(MobileBy.AndroidUIAutomator("text(\"3rd floor\")")).click();
        //Select Table
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.FrameLayout[2]/android.widget.TableLayout/android.widget.TableRow/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.Spinner/android.widget.TextView")).click();
        driver.findElement(MobileBy.AndroidUIAutomator("text(\"4\")")).click();

        //Select Origin
        driver.findElement(MobileBy.AndroidUIAutomator("text(\"in-person\")")).click();
        driver.findElement(MobileBy.AndroidUIAutomator("text(\"online\")")).click();

        //Select  date
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.TableLayout/android.widget.TableRow/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.EditText")).click();
        driver.findElement(MobileBy.AndroidUIAutomator("text(\"06\")")).click();
        driver.findElement(MobileBy.AndroidUIAutomator("text(\"Apr\")")).click();
        driver.findElement(By.id("android:id/button1")).click();
        //Select Time
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.TableLayout/android.widget.TableRow/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.EditText")).click();
        driver.findElement(By.id("android:id/numberpicker_input")).click();
        driver.findElement(By.id("android:id/numberpicker_input")).sendKeys("5");
        driver.findElement(By.id("android:id/button1")).click();
      //Select Done
        driver.findElement(MobileBy.AndroidUIAutomator("text(\"DONE\")")).click();

    }

    //Select  old request Test Case
    @Test
    public void OldRequest() throws Exception {
        //Click on "GET STARTED" button
        driver.findElement(By.className("android.widget.Button")).click();
        //	Scroll down “Reservations”
        driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Reservations\"))"));
        driver.findElement(MobileBy.AndroidUIAutomator("text(\"Reservations\")")).click();
        //Select Old Reservation
        driver.findElement(MobileBy.AndroidUIAutomator("text(\"Rachel Nabors\")")).click();
        //-	Click on back Button
        driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"ActionBar\"]/android.widget.ImageButton")).click();
        driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"ActionBar\"]/android.widget.ImageButton")).click();
    }
    //click on Code Sample from Menu Test Case
    @Test
    public void CodeSample() throws Exception {
        //Click on "GET STARTED" button
        driver.findElement(By.className("android.widget.Button")).click();
        //click on Menu
        driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"ActionBar\"]/android.widget.ImageButton")).click();
        //select Code Sample
        driver.findElement(MobileBy.AndroidUIAutomator("text(\"Code samples\")")).click();
        Thread.sleep(8000);
        driver.launchApp();

    }
    //Put application in the Background ,Open Last Message in the Mobile
    @Test
    public void OpenMessage() throws Exception {

        //Click on "GET STARTED" button
        driver.findElement(By.className("android.widget.Button")).click();
        //Put application in the Background
        driver.runAppInBackground(Duration.ofSeconds(4));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Activity activity = new Activity("com.android.mms","com.android.mms.ui.ConversationList");
        driver.startActivity(activity);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.FrameLayout[1]/com.huawei.mms.ui.AvatarWidget/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.RelativeLayout\n")).click();
        Activity activity1 = new Activity("org.nativescript.examples","com.tns.NativeScriptActivity");
        driver.startActivity(activity1);




    }

    @AfterMethod
    public void closeapp() throws Exception {
        Thread.sleep(5000);
        driver.closeApp();
    }
}
