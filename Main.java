package Latihan1_modul5;

public class Main {
	
	public static void main(String[] args) {
		BinaryTree pohon = new BinaryTree();
		
		pohon.NewNode(20);
		/*
				20
		 */
		pohon.NewNode(2);
		/*       
		        20
			   /  
              2   

		 */
		pohon.NewNode(25);
		/*       
                20
	           /  \
              2   25

        */
		pohon.NewNode(37);
		/*       
                20
       		   /  \
              2   25
                    \
                    37 
        */
		pohon.NewNode(16);
		/*       
               20
		      /  \
             2   25
            /      \
           16      37 
        */
		System.out.print("\nPre Order  : ");
		pohon.preOrder(pohon.root);
		System.out.print("\nIn Order   : ");
		pohon.inOrder(pohon.root);
		System.out.print("\nPost Order : ");
		pohon.postOrder(pohon.root);
	}

}
