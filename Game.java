package dice_game;



class Game {
    private Dice dice;

    public Game() {
        this.dice = new Dice();
    }

    public void play() {
        dice.roll();
        int user1Result = dice.getNumber();
        dice.roll();
        int user2Result = dice.getNumber();

        System.out.println("사용자 1의 결과: " + user1Result);
        System.out.println("사용자 2의 결과: " + user2Result);

        if (user1Result == user2Result) {
            System.out.println("무승부입니다.");
        } else if (user1Result > user2Result) {
            System.out.println("사용자 1이 이겼습니다!");
        } else {
            System.out.println("사용자 2가 이겼습니다!");
        }
    }
}

