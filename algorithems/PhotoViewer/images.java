public class images {
	public static void main (String[] args){
		PhotoViewer start = new PhotoViewer(
		"EulerSpiral.png","start"
		);
		
		PhotoViewer dark = new PhotoViewer(
		"EulerSpiral.png","dark"
		);
		int[][][] img =start.getImage();
		
		int[][][] darkImg=darken(img);
		
		dark.setImage(darkImg);
		
		System.out.println(img[1][2][1]);
		
		PhotoViewer grey = new PhotoViewer(
		"EulerSpiral.png","grey"
		);
		int[][][]greyImg=greyScale(img);
		grey.setImage(greyImg);
	}
	
	public static int[][][] darken(int[][][] a){
		
		int[][][] out=a.clone();
		//rows
		for(int r =0;r<out.length;r++){
			for(int c=0;c<out[0].length;c++){
				out[r][c][0]/=2;
				out[r][c][1]/=2;
				out[r][c][2]/=2;
			}
		}
	return out;
	}
	public static int[][][] greyScale(int[][][] a){
		
		int[][][] gout=a.clone();
		
		for(int r =0;r<gout.length;r++){
			for(int c=0;c<gout[0].length;c++){
				int avg = (gout[r][c][0] + gout[r][c][1] + gout[r][c][2]) / 3;
				gout[r][c][0]=avg;
				gout[r][c][1]=avg;
				gout[r][c][2]=avg;
				
			}
		}
		return gout;
	}
}