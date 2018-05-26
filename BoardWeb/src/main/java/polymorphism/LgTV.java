
package polymorphism;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component("ltv")
public class LgTV implements TV{
		
	@Autowired
	@Qualifier("apple")
	private Speaker speaker;
	
	public LgTV(){System.out.println("LGTV ��ü ������");}
	
	public void powerOn(){System.out.println("LG TV ����Ű��");}
	public void powerOff(){System.out.println("LG TV ��������");}
	public void volumnUp(){speaker.volumnUp();}
	public void volumnDown(){speaker.volumnDown();}
	
}

