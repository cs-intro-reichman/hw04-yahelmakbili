public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean[] isPrime = new boolean[n + 1];

        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }
        for (int p = 2; p <= Math.sqrt(n); p++) {
            if (isPrime[p]) {
                for (int multi = p * p; multi <= n; multi += p) {
                    isPrime[multi] = false;
                }
            }
        }
        int count = 0;
        System.out.println("Prime numbers up to " + n + ":");
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.println(i);
                count++;
            }
        }
        int percentage = (count * 100) / n;

        System.out.println("There are " + count + " primes between 2 and " + n + " (" + percentage + "% are primes)");

    }
}
