package polymorphism;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component("sony")
public class SonySpeaker implements Speaker {
	
	public SonySpeaker(){
		System.out.println("SonySpeaker ��ü ����");
	}
	
	/* (non-Javadoc)
	 * @see polymorphism.Speaker#volumnUp()
	 */
	public void volumnUp(){
		System.out.println("SonySpeaker �Ҹ� �ø���");
	}
	
	/* (non-Javadoc)
	 * @see polymorphism.Speaker#volumnDown()
	 */
	public void volumnDown(){
		System.out.println("SonySpeaker �Ҹ� ������");		
	}
	
}

