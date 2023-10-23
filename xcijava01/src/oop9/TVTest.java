package oop9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TVTest {
	public static void main(String[] args) {
		
		// properties 파일 읽어들이기
		Properties pr = new Properties();
		try {
			pr.load(new FileInputStream("src/oop9/product.properties"));
			String tvClass = pr.getProperty("tv");
			String speakerClass = pr.getProperty("speaker");
			Class tvClazz = Class.forName(tvClass);
			Class speakerClazz = Class.forName(speakerClass);
			TV tv = (TV) tvClazz.getConstructor(null).newInstance(); //인스턴스 생성
			Speaker sp = (Speaker) speakerClazz.getConstructor(null).newInstance(); //인스턴스 생성
			
			
//			TV tv = new HyundaiTV();
			tv.setSpeaker(sp);
			tv.powerOn();
			tv.channelUp();
			tv.channelUp();
			tv.soundUp();
			tv.soundUp();
			tv.powerOff();
		}  catch (Exception e) {
			e.printStackTrace();
		}
	
	}

}

// SamsungTV에 OrangeSpeaker 연결
