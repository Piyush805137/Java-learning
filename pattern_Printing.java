class pattern {
   public void pattern1() {
    int n = 5;
    for (int i = 1; i <= n; i++) {
        for (int j = n; j >= i; j--) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
  System.out.println();
   System.out.println();
}


   public void pattern2() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
		if(i==1 || i==n || j==1 || j==n)
		 {
                System.out.print("* ");
		 }
		 else{
		System.out.print("  ");
		  }  
            }
            System.out.println();
	}

  System.out.println();
   System.out.println();
    }




public void pattern3() {
    int n = 5;
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print((char)('A' + i - 1) + " ");
        }
        System.out.println();
    }

  System.out.println();
   System.out.println();
}


public void pattern4() {
    int n = 5;
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n; j++) {
            System.out.print(i	+ " ");
        }
        System.out.println();
    }
  System.out.println();
   System.out.println();
}	

 public void pattern5() {
    int n = 5;
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <=n-i+1; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
   System.out.println();
   System.out.println();
}



    public static void main(String[] args) {
        pattern p = new pattern();
        p.pattern1();
        p.pattern2();
	p.pattern3();
	p.pattern4();
	p.pattern5();
    }
}