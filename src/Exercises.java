public class Exercises {

	public boolean commonEnd(int[] a, int[] b) {
		if (a == null || a.length == 0 || b == null || b.length == 0) {
			return false;
		}

		if (a[0] == b[0] || a[a.length - 1] == b[b.length - 1]) {
			return true;
		}

		return false;
	}

	public String[] endsMeet(String[] values, int n) {
		if (values == null || values.length < n || n <= 0) {
			return new String[0];
		}

		String[] combined = new String[n * 2];
		for (int i = 0; i < n; i++) {
			combined[i] = values[i];
		}

		int j = n;
		for (int i = values.length - n; i < values.length; i++) {
			combined[j] = values[i];
			j++;
		}

		return combined;
	}

	public int difference(int[] numbers) {
		if (numbers == null || numbers.length < 1) {
			return -1;
		}

		int min = 0;
		int max = 0;

		for (int i = 0; i < numbers.length; i++) {
			if (i == 0) {
				min = numbers[i];
				max = numbers[i];
			}

			if (max < numbers[i]) {
				max = numbers[i];
			}

			if (min > numbers[i]) {
				min = numbers[i];
			}
		}

		int differnce = max-min;

		return differnce;
	}

	public double biggest(double[] numbers) {
		if (numbers == null || numbers.length < 3 || numbers.length % 2 == 0) {
			return -1;
		}

		int middle = (int)(Math.ceil(numbers.length / 2));
		double max = -1;

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < 0) {
					return -1;
				}

				if ((i == 0 || i == numbers.length - 1 || i == middle) && numbers[i] > max) {
					max = numbers[i];
				}
			}

		return max;
	}

	public String[] middle(String[] values) {
		if (values == null || values.length < 3 || values.length % 2 == 0) {
			return new String[0];
		}

		for (int i = 0; i < values.length; i++) {
			if (values[i] == null) {
				return new String[0];
			}
		}

		int middle = (int)(Math.ceil(values.length / 2));
		String[] middles = {values[middle - 1], values[middle], values[middle + 1]};

		return middles;
	}

	public boolean increasing(int[] numbers) {
		if (numbers == null || numbers.length < 3) {
		return false;
	}

	for (int i = 1; i < numbers.length-1; i++) {
			if (numbers[i-1] < numbers[i] && numbers[i] < numbers [i+1]) {
				return true;
			}
	}

		return false;
	}

	public boolean everywhere(int[] numbers, int x) {
		if (numbers == null || numbers.length < 1) {
			return false;
		}

		boolean lastPlace = false;
		int gap = 0;

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == x) {
				lastPlace = true;
				gap = 0;
			} else {
				if (i == 1 && lastPlace == false) {
					return false;
				} else if (lastPlace == false) {
					gap++;
				}
				lastPlace = false;
			}

			if (gap == 2) {
				return false;
			}
		}

		return true;
	}

	public boolean consecutive(int[] numbers) {
		if (numbers == null || numbers.length < 3) {
			return false;
		}

		for (int i = 1; i < numbers.length-1; i++) {
			if (numbers[i-1] % 2 == 0 && numbers[i] % 2 == 0 && numbers[i+1] % 2 == 0) {
				return true;
			}else if (numbers[i-1] % 2 == 1 && numbers[i] % 2 == 1 && numbers[i+1] % 2 == 1) {
				return true;
			}
		}

		return false;
	}

	public boolean balance(int[] numbers) {
		if (numbers == null || numbers.length < 2) {
			return false;
		}

		for (int i = 0; i < numbers.length - 1; i++) {
			int sum1 = 0;
			int sum2 = 0;

			for (int j = i; j >= 0; j--) {
				sum1 += numbers[j];
			}

			for (int b = i + 1; b < numbers.length; b++) {
				sum2 += numbers[b];
			}

			if (sum1 == sum2) {
				return true;
			}
		}
		return false;
	}

	public int clumps(String[] values) {
		if (values == null) {
			return -1;
		}

		for (int i = 0; i < values.length; i++) {
			if (values[i] == null) {
				return -1;
			}
		}

		boolean same = false;
		boolean lastSame = false;
		String last = "";
		int clumps = 0;

		for (int i = 0; i < values.length; i++) {
			if (last.equals(values[i])) {
				same = true;
				if (lastSame != true) {
					clumps++;
				}
			} else {
				same = false;
			}
			last = values[i];
			lastSame = same;
		}

		return clumps;
	}
}
