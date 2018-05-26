package polymorphism;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component("stv")
public class SamsungTV implements TV{
	
	@Autowired
	@Qualifier("sony")
	private Speaker speaker;
	private int price;
	
	public void setSpeaker(Speaker speaker) {
		System.out.println("setSpeaker 호출");
		this.speaker = speaker;
	}

	public void setPrice(int price) {
		System.out.println("setPrice 호출");
		this.price = price;
	}
	
	public SamsungTV(){
		System.out.println("Samsung TV(1) 객체 생성");
	}
	
	public SamsungTV(Speaker speaker) {		
		System.out.println("Samsung TV(2) 객체 생성");
		this.speaker = speaker;		
	}
		
	public SamsungTV(Speaker speaker, int price) {
		System.out.println("Samsung TV(3) 객체 생성");
		this.speaker = speaker;
		this.price = price;
	}

	public void initMethod(){System.out.println("객체 초기화 작업...");}
	public void destroyMethod(){System.out.println("객체 삭제 작업...");}
	
	public void powerOn(){System.out.println("Samsung TV 전원키기 (가격:" + price + ")");}
	public void powerOff(){System.out.println("Samsung TV 전원끄기");}
	public void volumnUp(){System.out.println("Samsung TV 소리올리기");}
	public void volumnDown(){System.out.println("Samsung TV 소리내리기");}
	
}
