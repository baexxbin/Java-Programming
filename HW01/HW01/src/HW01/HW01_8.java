package HW01;

public class HW01_8 {

	public static void main(String[] args) {
		double distance = 15000;	// 지구에서 태양까지의 거리 (단위: km)
		double light_speed = 30;	// 빛의 속도 (단위: km/s) 
		double time;	// 도착하는 시간
		
		time = distance / light_speed;	// 빛이 지구에 도착하는 시간 계산
		System.out.println("지구에서 태양까지의 거리: " + distance + "만 km");
		System.out.println("빛의 속도: " + light_speed + "만 km");
		System.out.println("빛이 태양에서 출발하여 지구에 도착하는 시간: " + time + "초");

	}

}
