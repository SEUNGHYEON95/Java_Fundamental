package java_20210524;

import java.io.IOException;
import java.net.ServerSocket;

public class ServerSocketScan {
	public static void main(String[] args) {
		ServerSocket serverSoceket = null;
		for (int port = 1; port < 65536; port++) {

			try {
				// ServerSocket 클래서는 해당 서버의 port번호를 사용 할 수있으면 ServerSOcket 인스턴스를 생성할 수 있고,
				// 그렇지 않으면 예외를 발생한다 즉, 예외가 발생했다는 얘기는 해당 port를 사용하고 있다는 것임
				serverSoceket = new ServerSocket(port);

			} catch (IOException e) {
				System.out.println(port + "번호가 사용중이다.");
			}
		}
	}
}
