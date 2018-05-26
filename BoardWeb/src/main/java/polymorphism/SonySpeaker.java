package polymorphism;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component("sony")
public class SonySpeaker implements Speaker {
	
	public SonySpeaker(){
		System.out.println("SonySpeaker 按眉 积己");
	}
	
	/* (non-Javadoc)
	 * @see polymorphism.Speaker#volumnUp()
	 */
	public void volumnUp(){
		System.out.println("SonySpeaker 家府 棵赴促");
	}
	
	/* (non-Javadoc)
	 * @see polymorphism.Speaker#volumnDown()
	 */
	public void volumnDown(){
		System.out.println("SonySpeaker 家府 郴赴促");		
	}
	
}

