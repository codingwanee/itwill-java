package example;

public class OperatorExampleApp {
	public static void main(String[] args) {
		//245678초를 일시분초 형식으로 변환하여 출력하세요.
		int cho=245678;
		System.out.print(cho+"초 = ");
		
		//초단위 시간을 일(몫)로 변환
		int day=cho/(24*60*60);//24*60*60 = 86400
		cho%=86400;//몫을 뺀 나머지 시간을 다시 저장 >> 시분초
		
		//초단위 시간을 시(몫)로 변환
		int hour=cho/(60*60);
		cho%=3600;//몫을 뺀 나머지 시간을 다시 저장 >> 분초
		
		//초단위 시간을 분(몫)로 변환
		int min=cho/60;
		int sec=cho%60;//몫을 뺀 나머지 저장 >> 초
		
		System.out.println(day+"일 "+hour+"시 "+min+"분 "+sec+"초");
		
		//한대의 가격이 1억 5천만인 비행기를 20대 구매할 경우 지불해야될 금액을 계산하여 출력하세요.
		//단, 15대 이상 구매할 경우 1대당 25% 할인율을 적용하여 계산하세요.
		int dan=150000000, su=20;
		long kum=(long)(su>=15?dan*0.75:dan)*su;
		System.out.println("비행기 구매 대금 = "+kum);
	}
}