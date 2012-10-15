public class ArrayCopier{
	public int[] copy(int[] src, int[] dst){
		if (src.length > dst.length || src.length==dst.length){
			for (int i=0;i<dst.length;i++){
				dst[i] = src[i];
			}
		}else{
			for (int i=0;i<src.length;i++){
				dst[i] = src[i];
			}
			for(int i = src.length;i<dst.length;i++)
			{
				dst[i] = 0;
			}
		}
	return dst;
	}
}