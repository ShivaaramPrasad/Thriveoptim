package chromeExecution;

import static com.google.common.base.Preconditions.checkState;

import java.io.File;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriverService.Builder;
import org.openqa.selenium.internal.Require;
import org.openqa.selenium.manager.SeleniumManager;
import org.openqa.selenium.net.PortProber;
import org.openqa.selenium.os.ExecutableFinder;


public class chromeExecution {

	public static void main(String[] args) {

		/*
		 Selenium 4.5.0

		 Chrome driver calls the chaining constructor 
   public ChromeDriver() {
    this(ChromeDriverService.createDefaultService(), new ChromeOptions());
  }
  
  public static ChromeDriverService createDefaultService() {
    return new Builder().build();
  }
  
  public DS build() {
      if (port == 0) {
        port = PortProber.findFreePort();
      }

      if (exe == null) {
        exe = findDefaultExecutable();
      }
      
      
      public static int findFreePort() {
    for (int i = 0; i < 5; i++) {
      int seedPort = createAcceptablePort();
      int suggestedPort = checkPortIsFree(seedPort);
      if (suggestedPort != -1) {
        return suggestedPort;
      }
    }
    throw new RuntimeException("Unable to find a free port");
  }
  
  protected abstract File findDefaultExecutable();


 @Override
    protected File findDefaultExecutable() {
      return findExecutable(
          "chromedriver", CHROME_DRIVER_EXE_PROPERTY,
          "https://github.com/SeleniumHQ/selenium/wiki/ChromeDriver",
          "http://chromedriver.storage.googleapis.com/index.html");
    }
    
    
    Selenium 4.6.0

		 Chrome driver calls the chaining constructor 
    protected static File findExecutable(
      String exeName,
      String exeProperty,
      String exeDocs,
      String exeDownload) {
    String defaultPath = new ExecutableFinder().find(exeName);
    String exePath = System.getProperty(exeProperty, defaultPath);
    checkState(exePath != null,
        "The path to the driver executable must be set by the %s system property;"
            + " for more information, see %s. "
            + "The latest version can be downloaded from %s",
            exeProperty, exeDocs, exeDownload);

    File exe = new File(exePath);
    checkExecutable(exe);
    return exe;
  }


 protected static void checkExecutable(File exe) {
    checkState(exe.exists(),
        "The driver executable does not exist: %s", exe.getAbsolutePath());
    checkState(!exe.isDirectory(),
        "The driver executable is a directory: %s", exe.getAbsolutePath());
    checkState(exe.canExecute(),
        "The driver is not executable: %s", exe.getAbsolutePath());
  }


 protected static File findExecutable(
      String exeName,
      String exeProperty,
      String exeDocs,
      String exeDownload) {
    String defaultPath = new ExecutableFinder().find(exeName);
    String exePath = System.getProperty(exeProperty, defaultPath);

    if (exePath == null) {
      try {
        exePath = SeleniumManager.getInstance().getDriverPath(exeName);
        checkExecutable(new File(exePath));
      } catch (Exception e) {
        LOG.warning(String.format("Unable to obtain driver using Selenium Manager: %s", e.getMessage()));
      }
    }

    String validPath = Require.state("The path to the driver executable", exePath).nonNull(
        "The path to the driver executable must be set by the %s system property;"
            + " for more information, see %s. "
            + "The latest version can be downloaded from %s",
            exeProperty, exeDocs, exeDownload);

    File exe = new File(validPath);
    checkExecutable(exe);
    return exe;
  }


*/
		//System.setProperty("webdriver.chrome.driver","");
		//WebDriverManager.chromedriver().setup();
		//ChromeDriver driver = new ChromeDriver();

		ChromeDriver driver = new ChromeDriver();
	}

}
