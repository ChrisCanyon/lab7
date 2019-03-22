import java.util.Iterator;

public class TableSTBased implements TableInterface 
{
   private SearchTreeInterface st;  // binary search tree that contains the table’s items
   private int size;                // number of items in the table

   public TableSTBased() 
   {  
      st = new AdaptableBinarySearchTree();  //duplicates not allowed with this constructor
      size = 0;
   } 
  
   public boolean tableIsEmpty() 
   {
     
   }  
   
   public int tableSize() 
   {
      
   }  

   public KeyedItem tableRetrieve(Comparable searchKey) 
   {
     
   } 
  
   public void tableInsert(KeyedItem item) throws TableException 
   { 
      
	  
	  
	  
	  
	  
	  
	  
   } 

   public boolean tableDelete(Comparable searchKey) 
   {
      
	  
	  
	  
	  
	  
	  
   } 

   public Iterator iterator()
   {
      TreeIterator iter = st.iterator();
      //do your specific iterator traversal call here
      //do your specific iterator traversal call here
	  
	  
	  
   }
} 