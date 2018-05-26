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
		System.out.println("setSpeaker ȣ��");
		this.speaker = speaker;
	}

	public void setPrice(int price) {
		System.out.println("setPrice ȣ��");
		this.price = price;
	}
	
	public SamsungTV(){
		System.out.println("Samsung TV(1) ��ü ����");
	}
	
	public SamsungTV(Speaker speaker) {		
		System.out.println("Samsung TV(2) ��ü ����");
		this.speaker = speaker;		
	}
		
	public SamsungTV(Speaker speaker, int price) {
		System.out.println("Samsung TV(3) ��ü ����");
		this.speaker = speaker;
		this.price = price;
	}

	public void initMethod(){System.out.println("��ü �ʱ�ȭ �۾�...");}
	public void destroyMethod(){System.out.println("��ü ���� �۾�...");}
	
	public void powerOn(){System.out.println("Samsung TV ����Ű�� (����:" + price + ")");}
	public void powerOff(){System.out.println("Samsung TV ��������");}
	public void volumnUp(){System.out.println("Samsung TV �Ҹ��ø���");}
	public void volumnDown(){System.out.println("Samsung TV �Ҹ�������");}
	
}
