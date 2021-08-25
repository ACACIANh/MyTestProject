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
		if (t.size() > 0) { // 값이 들어 있는데
			if (now > t.get(0).getDateTime()) {
				// 체크한 현재시간이 info에 들어있는 시간을 지났다 -> O
				return true;
			} else if (now == t.get(0).getDateTime()) {
				return false; // 체크한 현재시간이 info에 들어있는 시간과 같다 -> X
			} else {
				return false; // 체크한 현재시간이 info에 들어있는 시간 이 전이다. -> 이런 경우는 없다.
			}
		} else {
			return true; // 만약 이 전 데이터가 null이면? 무조건 돌려야지.
		}
	}

	//개선함
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
