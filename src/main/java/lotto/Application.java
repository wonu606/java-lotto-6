package lotto;

import lotto.io.UserInput;
import lotto.io.UserOutput;

public class Application {

    public static void main(String[] args) {
        UserInput userInput = new UserInput();
        UserOutput userOutput = new UserOutput();
        LottoMachine lottoMachine = new LottoMachine(new RandomGenerator());
        LottoInputParser lottoInputParser = new LottoInputParser();

        LottoGame lottoGame = new LottoGame(
                userInput,
                userOutput,
                lottoMachine,
                lottoInputParser
        );

        try {
            lottoGame.play();
        } catch (RuntimeException runtimeException) {
            userOutput.print("[ERROR] " + runtimeException.getMessage());
        }
    }
}
