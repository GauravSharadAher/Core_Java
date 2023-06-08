
public class CommandLArgs {

	public static void main(String[] args) {
		for(int i=0; i<args.length;i++) {
			int n=Integer.parseInt(args[i]);
			int j;
			for(j=2; j<n/2; j++) {
				if(n%j==0) {
					break;
				}
			}
			if(j==n/2) {
				System.out.println("Non-prime number: "+n+" divided by 10 "+n/10);
				continue;
			}
			for(int k=1; k<11; k++) {
				System.out.println(n+" * "+k+" = "+n*k);
			}
		}

	}

}
