
public class AdaptableBinarySearchTree extends BinarySearchTree
{

   public AdaptableBinarySearchTree()
   {
     super();
   }

   public KeyedItem retrieve(Comparable searchKey)
   {
      try {
        if(root == null){
          // do something
        }


      } catch(TreeException e) {
        return null;
      }
   }

   protected TreeNode retrieveItemAdapt(TreeNode tNode, Comparable searchKey)
   {
      KeyedItem treeItem;
      TreeNode subtree;

      if (tNode == null)
      {


      }
      else
      {
         KeyedItem nodeItem = (KeyedItem) tNode.getItem();
         int comparison = searchKey.compareTo(nodeItem.getKey());

         if (comparison == 0)
         {
            //item is in the root of some subtree
            //this item will be moved up one level each time it is retrieved
            //the principal of temporal (spatial?) locality of data (retrieved once, likely to be retrieved again)


         }
         else if (comparison < 0)
         {
            //search the left subtree
            //make sure to set your new left subtree


         }
         else
         {
            //search the right subtree
            //make sure to set your new right subtree


         }
      }

      return tNode;
   }

}
