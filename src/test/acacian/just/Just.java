package test.acacian.just;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Just {

	class RankInfo {

		int getDateTime() {
			return 0;
		}

	}

	private static boolean canIGo(List<RankInfo> t) {
		int now = Integer.parseInt(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyMMddHH")));
		if (t.size() > 0) { // ���� ��� �ִµ�
			if (now > t.get(0).getDateTime()) {
				// üũ�� ����ð��� info�� ����ִ� �ð��� ������ -> O
				return true;
			} else if (now == t.get(0).getDateTime()) {
				return false; // üũ�� ����ð��� info�� ����ִ� �ð��� ���� -> X
			} else {
				return false; // üũ�� ����ð��� info�� ����ִ� �ð� �� ���̴�. -> �̷� ���� ����.
			}
		} else {
			return true; // ���� �� �� �����Ͱ� null�̸�? ������ ��������.
		}
	}

	//������
	private static boolean canIGo2(List<RankInfo> t) {
		int now = Integer.parseInt(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyMMddHH")));

		if (t.isEmpty()) {
			return true;
		} else if (now > t.get(0).getDateTime()) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {

	}
}
