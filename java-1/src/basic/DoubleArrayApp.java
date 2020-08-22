package basic;

public class DoubleArrayApp {
	public static void main(String[] args) {
		int[][] num=new int[2][3];
		
		System.out.println("num = "+num);
		System.out.println("num[0] = "+num[0]);
		System.out.println("num[1] = "+num[1]);
		System.out.println("============================================");
		System.out.println("num[0][0] = "+num[0][0]);
		System.out.println("num[0][1] = "+num[0][1]);
		System.out.println("num[0][2] = "+num[0][2]);
		System.out.println("num[1][0] = "+num[1][0]);
		System.out.println("num[1][1] = "+num[1][1]);
		System.out.println("num[1][2] = "+num[1][2]);
		System.out.println("============================================");
		System.out.println("num.length = "+num.length);
		System.out.println("num[0].length = "+num[0].length);
		System.out.println("num[1].length = "+num[1].length);
		System.out.println("============================================");
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num[i].length;j++) {
				System.out.println("num["+i+"]["+j+"] = "+num[i][j]);
			}
		}
		System.out.println("============================================");
		int[][] su={{10,20,30},{40,50,60},{70,80,90}};
		
		for(int[] array:su) {
			for(int temp:array) {
				System.out.print(temp+"  ");
			}
			System.out.println();
		}
		System.out.println("============================================");
		/*
		int[][] number=new int[3][];
		
		//1차원 배열이 존재하지 않으므로 2차원 배열의 참조요소에는 null 저장
		System.out.println("number[0] = "+number[0]);
		System.out.println("number[1] = "+number[1]);
		System.out.println("number[2] = "+number[2]);
		System.out.println("============================================");
		//1차원 배열을 생성하여 2차원 배열의 참조요소에 배열정보 저장
		//가변배열 - 다차원 배열에서 참조요소의 배열 요소 갯수를 다르게 설정하ㅇ
		number[0]=new int[3];
		number[1]=new int[2];
		number[2]=new int[4];
		
		System.out.println("number[0] = "+number[0]);
		System.out.println("number[1] = "+number[1]);
		System.out.println("number[2] = "+number[2]);
		System.out.println("============================================");
		for(int i=0;i<number.length;i++) {
			for(int j=0;j<number[i].length;j++) {
				System.out.print(number[i][j]+"  ");
			}
			System.out.println();
		}
		System.out.println("============================================");
		*/
		int[][] number={{10,20,30},{40,50},{60,70,80,90}};

		for(int[] array:number) {
			for(int temp:array) {
				System.out.print(temp+"  ");
			}
			System.out.println();
		}		
		System.out.println("============================================");
		//학생이름과 국어,영어,수학 점수를 입력받아 학생 점수합계와 과목
		//점수합계, 전체 점수합계를 계산하여 출력하세요.
		//ex) 홍길동  80   90   100  240
		//    ...
		//    장길산  88   92   90   270
		//    총합계  392  380  370  1142
		String[] name={"홍길동","임꺽정","전우치","일지매","장길산","총합계"};
		int[][] score= {{80,90,100,0},{76,89,77,0},{78,99,87,0}
			,{98,99,100,0},{88,92,90,0},{0,0,0,0}};
		
		
		//학생 점수합계와 과목 점수합계, 전체 점수합계 계산
		for(int i=0;i<score.length-1;i++) {
			for(int j=0;j<score[i].length-1;j++) {
				//score[i][j] : 학생의 과목별 개별 점수
				
				//학생 점수합계 계산 : 같은 행, 마지막 열 요소에 점수 누적
				score[i][score[i].length-1]+=score[i][j];

				//과목 점수합계 계산 : 마지막 행, 같은 열 요소에 점수 누적
				score[score.length-1][j]+=score[i][j];

				//전체 점수합계 계산 : 마지막 행, 마지작 열 요소에 점수 누적
				score[score.length-1][score[i].length-1]+=score[i][j];
			}
		}
		
		//학생이름, 국어, 영어, 수학 점수와 학생점수 합계, 과목 점수 합계, 전체 점수 합계 출력
		for(int i=0;i<score.length;i++) {
			System.out.print(name[i]+"\t");
			for(int j=0;j<score[i].length;j++) {
				System.out.print(score[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("============================================");
	}
}












