package proj.view;

import java.util.Calendar;
import java.util.Scanner;

import proj.controller.GameController;
import proj.model.vo.Player;

public class GameMenu {
	private Scanner sc = new Scanner(System.in);
	private GameController gc = new GameController();
	private Player[] players;
	private int round = 1;

	public GameMenu() {
		// 아래와 같이 출력하는 코드 작성
		// === 게임 시작 : xxxx년 xx월 xx일 오전/오후 xx시 xx분 xx초 ===
		Calendar c = Calendar.getInstance();

		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH);
		int date = c.get(Calendar.DATE);
		int amPm = c.get(Calendar.AM_PM);
		String sAmPm = amPm == 0 ? "오전" : "오후";
		int hour = c.get(Calendar.HOUR);
		int min = c.get(Calendar.MINUTE);
		int sec = c.get(Calendar.SECOND);

		System.out.printf("=== 게임 시작 : %d년 %d월 %d일 %s %d시 %d분 %d초 ===%n", year, month + 1, date, sAmPm, hour, min, sec);
	}

	public void mainMenu() {
		System.out.println("본 게임은 사용자와 컴퓨터가 플레이어가 되어 1vs1로 싸우는 게임입니다.\n" + "첫 시작은 각 플레이어의 HP가 100으로 동일하게 시작합니다.\n"
				+ "상대의 HP를 0 이하로 만들면 해당 플레이어의 승으로 게임은 끝납니다.\n" + "플레이어는 한 라운드에 '어택(Attack)' 또는 '큐어(Cure)'를 선택할 수 있으며\n"
				+ "어택 또는 큐어의 크기는 랜덤(0~10)하게 결정됩니다.");

		// 게임을 시작할 것인지 묻는 안내문 출력

		while (true) {
			System.out.print("게임을 시작하시겠습니까?(Y/N) : ");
			char ch = sc.nextLine().charAt(0);
			if (ch == 'y' || ch == 'Y') {
				System.out.print("사용자의 이름을 입력해주세요 : ");
				String name = sc.nextLine();
				System.out.println("반갑습니다 " + name + "님.");
				players = gc.createPlayer(name); // 배열은 주소 값이 저장되어 있어서 얕은 복사
				play();
				break;
			} else if (ch == 'n' || ch == 'N') {
				System.out.println("종료합니다.");
				break;
			} else {
				System.out.println("잘못 입력하셨습니다. Y 또는 N만 입력해주세요.");
			}
		}

		// 게임을 시작하겠다고 한 경우, 사용자의 이름을 입력받은 후 "반갑습니다, xxx님." 출력
		// GameController(이하 gc)의 createPlayer()로 입력받은 이름 전달하고 반환 받은 값을 players에 저장
		// 값을 반환 받은 후 play() 실행
		//
		// 게임을 시작하지 않겠다고 한 경우, "종료합니다." 출력 후 종료
		//
		// 잘못 입력한 경우 "잘못 입력하셨습니다. Y 또는 N만 입력해주세요." 출력 후 제대로 된 대답을 받을 때까지 반복
	}

	public void play() {
		System.out.println();
		System.out.println("게임을 시작합니다.");

		boolean rpsFirst = chooseFirst();
		fight(rpsFirst);
//		★★
		// 사용자 플레이어와 컴퓨터 플레이어 중 선을 정하기 위해 chooseFirst() 실행 및 boolean 값을 반환 받음
		// 전달 받은 boolean 값을 fight()로 전달

		System.out.println();

		// 최종 결과 발표 출력
		// 사용자 플레이어의 체력이 컴퓨터 플레이어의 체력보다 크면 "xxx님의 승리입니다. 축하합니다!" 출력
		// 사용자 플레이어의 체력이 컴퓨터 플레이어의 체력보다 적으면 "Computer님의 승리입니다. (패배자는 아무 말도 하지 못합니다.)" 출력
		// 사용자 플레이어의 체력과 컴퓨터 플레이어의 체력이 같으면 "접전 끝에 무승부로 판정되었습니다." 출력
		
		System.out.println("===--- 총 " + (round-1) + "round 결과 발표 ---===");
		if(players[0].getHp() > players[1].getHp()) {
			System.out.println(players[0].toString() + "의 승리입니다. 축하합니다!");
		} else if (players[0].getHp() == players[1].getHp()) {
			System.out.println("접전 끝에 무승부로 판정되었습니다.");
		} else {
			System.out.println("Computer님의 승리입니다. (패배자는 아무 말도 하지 못합니다.)");
		}
		
	}

	public boolean chooseFirst() {
		// 게임의 선을 정하기 위한 가위바위보 게임을 구현한 메소드
		// 사용자 플레이어에게 가위/바위/보 중 하나를 입력 받고 컴퓨터 플레이어의 랜덤한 가위/바위/보 값과 비교
		// 만일 사용자 플레이어가 가위/바위/보 중 하나를 입력하지 않고 잘못 입력하면 잘못 입력했다는 안내와 함께 제대로 입력할 때까지 반복
		// 만일 사용자 플레이어의 가위/바위/보와 컴퓨터 플레이어의 가위/바위/보 게임 결과 비겼으면 비겼다는 안내문과 함께 다시 가위바위보 진행
		// 두 플레이어의 가위바위보 승부가 결정났을 경우, 각 플레이어가 낸 가위/바위/보를 출력
		// 이 때, 사용자 플레이어가 이겼을 경우 true반환, 졌을 경우 false반환

		String[] rockPaperScissors = {"가위", "바위", "보"};
		String[] rockPaperScissorsWin = {"바위", "보", "가위"};
		while(true) {
			System.out.println("선(先)을 정합니다. 가위/바위/보 중 아무거나 입력해주세요.");
			System.out.print("가위/바위/보 : ");
			String choose = sc.nextLine();
			
			if(choose.equals("가위") || choose.equals("바위") || choose.equals("보")) {
				int random = (int) (Math.random() * 3);
				System.out.println(players[0].toString() + " : " + choose); 
				System.out.println(players[1].toString() + " : " + rockPaperScissors[random]);
				if(!choose.equals(rockPaperScissors[random])) {
					if(choose.equals(rockPaperScissorsWin[random])) {
						return true;
					} else {
						return false;
					}
				}
				System.out.println("비겼습니다. 가위바위보를 다시 진행하겠습니다.");
			} else {
				
				System.out.println("잘못 입력하셨습니다. 가위/바위/보 중 하나만 입력해주세요.");
			}
		}
	}

	public void fight(boolean userWin) {
		// 전달 받은 boolean 값으로 사용자 플레이어와 컴퓨터 플레이어의 선을 구분 짓는 메소드
		// 매개변수 값이 true이면 사용자 플레이어 먼저, false이면 컴퓨터 플레이어 먼저 진행
		// 한 라운드가 끝날 때마다 해당 라운드의 결과를 출력해주는 print1RoundResult() 실행
		// print1RoundResult()는 사용자 플레이어와 컴퓨터 플레이어가 한 라운드를 진행하고 반환한 값을 인자로 받음
		// 두 플레이어의 싸움은 두 플레이어의 체력 중 한 플레이어의 체력이 0이하가 될 때까지 반복

		while (players[0].getHp() > 0 && players[1].getHp() > 0) {
			if (userWin) { // == true
//				String[] user1 = doUser();
//				String[] com1 = doComp();
				print1RoundResult(doUser(), doComp()); // 매개 변수로 전달
			} else {
				String[] com1 = doComp(); // 졌을 때는 무조건 컴퓨터가 먼저 해야 하니까!
				String[] user1 = doUser();
				print1RoundResult(user1, com1);
			}
			round++;
		}
	}

	public void print1RoundResult(String[] nRoundUser, String[] nRoundComp) {
		// 한 라운드가 끝날 때마다 해당 라운드의 결과와 각 플레이어의 체력을 출력하는 메소드
		// 한 라운드에서 사용자 플레이어와 컴퓨터 플레이어가 선택한 액션(어택/큐어)과 에너지를 출력하고
		// players 배열에 저장된 사용자 플레이어와 컴퓨터 플레이어의 체력을 가지고 남은 체력을 그림으로 표현
		// ex. 체력 90인 경우 : ●●●●●●●●●○
		// ex. 체력 87인 경우 : ●●●●●●●●◐○
		// ex. 체력 82인 경우 : ●●●●●●●●○○
		// 이 때, 큐어에 의해서 체력 100이 넘을 경우가 발생한다면 이에 대한 처리 안내문도 함께 출력

		System.out.println("--- " + round + " round 결과 ---");
		System.out.println(nRoundUser[1]);
		System.out.println(nRoundComp[1]);

		int hp1 = players[0].getHp() % 10; // 반만 빈 원
		int hp2 = players[0].getHp() / 10; // 다 채워진 원
		System.out.print(players[0].toString() + " : ");
		
		if (hp1 >= 5 && hp1 <= 9) {
			for (int i = 0; i < hp2; i++) {
				System.out.print("●");
			}
			System.out.print("◐"); // 반원은 차피 끝에 한 번만 나옴
			for (int i = 0; i < 10 - hp2 - 1; i++) { // 텅 빈 원의 개수
				System.out.print("○");
			}
		} else {
			for (int i = 0; i < hp2; i++) {
				System.out.print("●");
			}
			for (int i = 0; i < 10 - hp2; i++) {
				System.out.print("○");
			}
		}
		System.out.print(" (" + players[0].getHp() + ")");     // 여기까지 사용자
		System.out.println();
		if(nRoundUser[0] != null) {
			System.out.println(nRoundUser[0]);
		}
		
		int com1 = players[1].getHp() % 10; // 반만 빈 원 (나머지 이용)
		int com2 = players[1].getHp() / 10; // 다 채워진 원 개수
		System.out.print(players[1].getName() + " : ");
		
		if (com1 >= 5 && com1 <= 9) {
			for (int i = 0; i < com2; i++) {
				System.out.print("●");
			}
			System.out.print("◐");
			for (int i = 0; i < 10 - com2 - 1; i++) {
				System.out.print("○");
			}
		} else {
			for(int i = 0; i < com2; i++) {
				System.out.print("●");
			}
			for(int i = 0; i < 10 - com2; i++) {
				System.out.print("○");
			}
		}
		System.out.print(" (" + players[1].getHp() + ")");	// 여기까지 컴퓨터
		System.out.println();
		if(nRoundComp[0] != null) {
			System.out.println(nRoundComp[0]);
		}
		
		System.out.println();
		
	}

	public String[] doUser() {
		// 한 라운드에서 사용자 플레이어가 취할 액션(어택/큐어)에 대해 선택하는 메소드
		// 해당 라운드의 결과가 담겨있는 문자열 배열 두 칸짜리 생성
		// 사용자 플레이어가 어택 또는 큐어 중 하나를 입력하게 함
		// 0부터 10까지의 랜덤한 에너지 값을 하나 생성하고
		// 어택을 선택했을 경우, gc의 doUserAttack()에 생성한 에너지를 인자로 넘김
		// 큐어를 선택했을 경우, gc의 doUserCure()에 생성한 에너지를 인자로 넘기고 문자열을 반환 받아 문자열 배열에 저장
		// 이 때, 어택 또는 큐어 중 하나를 입력하지 않으면 잘못 입력했다는 안내문과 함께 제대로 입력 할 때까지 반복
		// 선택을 마치면 "[ n round xxx님 선택 종료 ]" 출력과 함께
		// 해당 라운드에서 사용자 플레이어가 했던 액션과 에너지에 대한 정보를 담은 문자열을 문자열 배열에 저장
		// 현 라운드의 결과를 담은 문자열 배열 반환

		String[] userResult = new String[2];
		while(true) {
			System.out.print("어택 또는 큐어 중에 선택해주세요 : ");
			String action = sc.nextLine();
			
			if(!action.equals("어택") && !action.equals("큐어")) {
				System.out.println("잘못 입력하셨습니다. 어택 또는 큐어만 입력해주세요.");
			} else {
				int energy = (int)(Math.random() * 11);
				if(action.equals("어택")) {
					gc.doUserAttack(energy);
				} else if(action.equals("큐어")) {
					userResult[0] = gc.doUserCure(energy);
				}
				System.out.println("[ " + round + " round " + players[0].toString() +  " 선택 종료 ]");
				// 해당 라운드에서 사용자 플레이어가 했던 액션과 에너지에 대한 정보를 담은 문자열을 문자열 배열에 저장
				userResult[1] = players[0].getName() + "님) " + action + " : " + energy;
				return userResult;
			}
		}
	}

	public String[] doComp() {
		// 한 라운드에서 컴퓨터 플레이어가 취할 액션(어택/큐어)을 랜덤으로 정하는 메소드

		// 해당 라운드의 결과가 담겨있는 문자열 배열 두 칸짜리 생성
		// 컴퓨터 플레이어가 이번 라운드에서 취할 액션(어택/큐어)과 에너지(0~10)를 랜덤하게 정함
		// 어택일 경우, gc의 doCompAttack()에 생성한 에너지를 인자로 넘김
		// 큐어일 경우, gc의 doCompCure()에 생성한 에너지를 인자로 넘기고 문자열을 반환 받아 문자열 배열에 저장
		// 모두 정하고 수행을 완료하면 "[ n round Computer님 선택 종료 ]" 출력과 함께
		// 해당 라운드에서 컴퓨터 플레이어가 했던 액션과 에너지에 대한 정보를 담은 문자열을 문자열 배열에 저장

		String[] compAction = {"어택", "큐어"};
		String[] compResult = new String[2];
		
		int random = (int)(Math.random() * 2);
		int energy = (int)(Math.random() * 11);
		if(compAction[random].equals("어택")) {
			gc.doCompAttack(energy);
		} else {
			compResult[0] = gc.doCompCure(energy);
		}
		System.out.println("[ " + round + " round " + players[1].toString() +  " 선택 종료 ]");
		compResult[1] = players[1].getName() + "님) " + compAction[random] + " : " + energy;
		return compResult;

	}
}
