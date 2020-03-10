package Synchronized;

class Table1 {

	synchronized void printtable(int n) {

		for (int i = 1; i <= 5; i++) {

			System.out.println(n*i);
		}

		try {

			Thread.sleep(400);
		} catch (Exception e) {

			System.out.println(e);
		}

	}
}
	public  class TestSynchronization1 {

		public static void main(String[] args) {

			final Table1 h = new Table1();

			Thread t1 = new Thread() {

				public void run() {
					h.printtable(5);

				}
			};

			Thread t2 = new Thread() {

				public void run() {
					h.printtable(100);

				}
			};

			t1.start();
			t2.start();

		}

	}


