package week1.assignment;

public class MyMobile {
	String name = "call";
	float version = 8.0f;
	String status="Received message";
	
            public void makeCall() {
              System.out.println(name);
              System.out.println(version);
}
            public void sendMsg() {
				System.out.println(status);

			}
            private void payBills() {
				System.out.println("This is my bill statement");

			}
            public static void main(String[] args) {
            	MyMobile mm = new MyMobile();
            	mm.makeCall();
            	mm.sendMsg();
            	mm.payBills();
			}

}
