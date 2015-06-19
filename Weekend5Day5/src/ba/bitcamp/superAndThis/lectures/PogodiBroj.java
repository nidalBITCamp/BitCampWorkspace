package ba.bitcamp.superAndThis.lectures;

import java.util.Scanner;
import java.util.concurrent.BrokenBarrierException;

public class PogodiBroj {

	private static int randomBroj;
	private int counter = 0;

	private Integer maxBroj;
	private Integer maxBrojPokusaja;

	public PogodiBroj(Integer maxBroj, Integer maxBrojPokusaja) {
		super();
		this.maxBroj = maxBroj;
		this.maxBrojPokusaja = maxBrojPokusaja;
		this.randomBroj();
	}

	public PogodiBroj(Integer maxBroj) {
		this(maxBroj, maxBroj / 100 + 1);

	}

	public PogodiBroj() {
		this(1000, 10);

	}

	public void randomBroj() {
		randomBroj = (int) (Math.random() * this.maxBroj - 2 + 1);

	}

	public static int getRandomBroj() {
		return randomBroj;
	}

	public void igraj() {
		do {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi broj");
		int num = sc.nextInt();
			counter++;
				if (num == randomBroj) {
					System.out.println("Cestitam pogodili ste trazeni broj"
							+ this.counter);
					break;
				} else {
					System.out.println("Pokusajte ponovo");
				}

		} while (counter < maxBrojPokusaja);

	}
}
