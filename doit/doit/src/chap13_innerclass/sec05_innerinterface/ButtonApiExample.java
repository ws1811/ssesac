package chap13_innerclass.sec05_innerinterface;

class Button {
	interface OnClickListener {
		public abstract void onClick();
	}
	OnClickListener ocl;
	public void setOcl(OnClickListener ocl) {
		this.ocl = ocl;
	}
	void onClick() {
		ocl.onClick();
	}
}

public class ButtonApiExample {
	public static void main(String[] args) {
		// 개발자1. 클릭하면 음악재생
		Button btn1 = new Button();
		btn1.setOcl(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("개발자 1 : 음악재생");
			}
		});
		btn1.onClick();
		// 개발자2. 클릭하면 네이버 접속
		Button btn2 = new Button();
		btn2.setOcl(new Button.OnClickListener() {

			@Override
			public void onClick() {
				System.out.println("개발자 2 : 네이버 접속");
			}
			
		});
		btn2.onClick();
		
	}
}
