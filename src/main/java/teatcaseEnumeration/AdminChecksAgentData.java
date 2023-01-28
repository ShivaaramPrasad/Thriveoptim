package teatcaseEnumeration;

import java.net.InetAddress;

import javax.xml.parsers.ParserConfigurationException;

import org.junit.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class AdminChecksAgentData {
	public String ipnumber1;
	public String ipnumber2;
	@Test(priority=1)
	public void agent1()  {
		/*
		loginAppication();
		getiUserInformation();
	    System.out.println(InetAddress.getLocalHost());
	    InetAddress localHost = InetAddress.getLocalHost();
	    ipnumber1 = localHost.toString();
	    */
	}
	
	@Test(priority=2)
	public void agent2()  {
		/*
		loginAppication();
		getiUserInformation();
	    System.out.println(InetAddress.getLocalHost());
	    InetAddress localHost = InetAddress.getLocalHost();
	    ipnumber2 = localHost.toString();
	    */
	}
	
	@Test(dependsOnMethods = "agent2")
	public void admins()  {	
		/*
		loginAppication();
		dshoradbord();
		checkAllIp(ipnumber1,ipnumber2);
		*/
	}
	

}
