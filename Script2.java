public class Script2{
	public static void main(String[] args){

		int[] src = {20,15,8,3,1};
		int[] dst = new int[6];
		ArrayCopier copier = new ArrayCopier();
		dst = copier.copy(src,dst);
		for(int i=0;i<dst.length;i++){
			System.out.println (dst[i]);
		}

	}
}
