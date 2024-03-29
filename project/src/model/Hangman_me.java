package model;

import java.util.Arrays;
import java.util.Scanner;

public class Hangman_me {
	
	private static final String[] WORDS = { "JAVA", "PYTHON", "PROGRAMMING", "COMPUTER", "DEVELOPMENT" };
	private static final int MAX_TRIES = 6;

	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(WORDS)); // WORDS 배열의 데이터 출력
		System.out.println(WORDS[0]);
		System.out.println(WORDS.length);

		Scanner scanner = new Scanner(System.in);

		String wordToGuess = getRandomWord();                   // 난수를 통한 랜덤의 WORDS의 인덱스를 가져온다.==스트링으로~
		char[] guessedLetters = new char[wordToGuess.length()]; // 단어의 길이가 배열번호
		System.out.println(wordToGuess.length());
		System.out.println(guessedLetters.length);
		int incorrectGuesses = 0;

		// Initialize guessedLetters array with underscores
		for (int i = 0; i < guessedLetters.length; i++) {
			guessedLetters[i] = '_';
		}

		while (incorrectGuesses < MAX_TRIES) {
			// Display current state of the word
			System.out.println("현재 단어: " + String.valueOf(guessedLetters));

			// Ask user for a guess
			System.out.print("문자를 입력하세요: ");
			char guess = scanner.next().toUpperCase().charAt(0);  //()안의 인덱스의 숫자만큼 문자갯수를 입력해야함.toUpperCase()== 소문자를 입력해도 대문자로 인식됨
                                                                  //()안의 숫자=인덱스에 해당하는 문자만 guess에 저장
			// Check if the guess is correct
			boolean isCorrectGuess = false;   //초기화
			for (int i = 0; i < wordToGuess.length(); i++) {
				if (wordToGuess.charAt(i) == guess) {
					guessedLetters[i] = guess;
					isCorrectGuess = true;
				}
			}

			// Check if the game is won
			if (String.valueOf(guessedLetters).equals(wordToGuess)) {
				System.out.println("Congratulations! You guessed the word: " + wordToGuess);
				break;
			}

			// Increment incorrectGuesses if the guess is incorrect
			if (!isCorrectGuess) {
				incorrectGuesses++;
				System.out.println("Incorrect guess. Remaining tries: " + (MAX_TRIES - incorrectGuesses));
			}
		}

		// Display the result of the game
		if (incorrectGuesses == MAX_TRIES) {
			System.out.println("Sorry, you ran out of tries. The correct word was: " + wordToGuess);
		}

		scanner.close();
	}

	private static String getRandomWord() {                                           // 난수생성코드
		return WORDS[(int) (Math.random() * WORDS.length)];

		
	}

}
