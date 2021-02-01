
public class ArrayTest {
 private int[][] checkerBoard = new int [8][8];
 
 public void initialiseArray() {
	 for(int i = 0; i<8; i++) {
		 for(int j=0;j<8;j++) {
			 checkerBoard[i][j] = 0;
		 }
	 }
 }
 private void setUpGame() {
	 for(int i = 0; i<8; i++) {
		 for(int j=0;j<8;j++) {
			 if((i<3) && (i%2==0) && ((i+j)%2==1)) {
				 checkerBoard[i][j] = 1;
			 }
			 else if((i>4) && (i%2==0) && ((i+j)%2==1)) {
				 checkerBoard[i][j] = 2;
			 }
			 
		 }
	 }
 }
 
 private void printGame() {
	 for(int i = 0; i<8; i++) {
		 StringBuffer buffer = new StringBuffer();
		 for(int j=0;j<8;j++) {
			 buffer.append(checkerBoard[i][j] + " ");
		 }
		 System.out.println(buffer);
	 }
 }
}
