//1
// import java.util.*;
// public class Main
// {
//     public static class TreeNode{
//         int data;
//         TreeNode left,right;
//         TreeNode(int value){
//             data=value;
//             left=right=null;
//         }
//     }
//     public static int height(TreeNode root){
//         if(root==null)return 0;
//         int leftheight=height(root.left);
//         int rightheight=height(root.right);
//         return Math.max(leftheight,rightheight)+1;
//     }
// 	public static void main(String[] args) {
// 		TreeNode root=new TreeNode(10);
// 		root.left=new TreeNode(20);
// 		root.right=new TreeNode(30);
// 		root.left.left=new TreeNode(40);
// 		root.left.right=new TreeNode(50);
// 		System.out.print("height is:"+height(root));
// 	}
// }
// 2-------count nodes-----//
// import java.util.*;
// public class Main
// {
//     public static class TreeNode{
//         int data;
//         TreeNode left,right;
//         TreeNode(int value){
//             data=value;
//             left=right=null;
//         }
//     }
//     // public static int count(TreeNode root){
//     //     if(root==null)return 0;
//     //     return 1+count(root.left)+count(root.right);
//     // }
//     public static int count(TreeNode root){
//         int count=0;
//         if(root==null){
//             return count;
//         }
//         Stack<TreeNode>st=new Stack<>();
//         st.push(root);
//         while(!st.isEmpty()){
//             TreeNode temp=st.peek();
//             count++;
//             st.pop();
//             if(temp.left!=null)st.push(temp.left);
//             if(temp.right!=null)st.push(temp.right);
//         }
//         return count;
//     }
// 	public static void main(String[] args) {
// 		TreeNode root=new TreeNode(10);
// 		root.left=new TreeNode(20);
// 		root.right=new TreeNode(30);
// 		root.left.left=new TreeNode(40);
// 		root.left.right=new TreeNode(50);
// 	System.out.print(count(root));
// 	}
// }
//3 searching 
// import java.util.*;
// public class Main
// {
//     public static class TreeNode{
//         int data;
//         TreeNode left,right;
//         TreeNode(int value){
//             data=value;
//             left=right=null;
//         }
//     }
//   public static boolean check(TreeNode root,int target){
//       if(root==null)return false;
//       if(root.data==target)return true;
//       return check(root.left,target)||check(root.right,target);
//   }
   
// 	public static void main(String[] args) {
// 		TreeNode root=new TreeNode(10);
// 		root.left=new TreeNode(20);
// 		root.right=new TreeNode(30);
// 		root.left.left=new TreeNode(40);
// 		root.left.right=new TreeNode(50);
// 		Scanner sc=new Scanner(System.in);
// 		int target=sc.nextInt();
//         System.out.print(check(root,target));
// 	}
// }
//4
// import java.util.*;
// public class Main
// {
//     public static class TreeNode{
//         int data;
//         TreeNode left,right;
//         TreeNode(int value){
//             data=value;
//             left=right=null;
//         }
//     }
// 	public static void main(String[] args) {
// 		TreeNode root=new TreeNode(10);
// 		root.left=new TreeNode(20);
// 		root.right=new TreeNode(30);
// 		root.left.left=new TreeNode(40);
// 		root.left.right=new TreeNode(50);
// 		Scanner sc=new Scanner(System.in);
		
// 	}
// }
//5
// import java.util.*;
// public class Main
// {
//     public static class TreeNode{
//         int data;
//         TreeNode left,right;
//         TreeNode(int value){
//             data=value;
//             left=right=null;
//         }
//     }
//     // public static int count(TreeNode root){
//     //     if(root==null)return 0;
//     //     return 1+count(root.left)+count(root.right);
//     // }
//     public static int count(TreeNode root){
//         int count=0;
//         if(root==null){
//             return count;
//         }
//         Stack<TreeNode>st=new Stack<>();
//         st.push(root);
//         while(!st.isEmpty()){
//             TreeNode temp=st.peek();
//             count++;
//             st.pop();
//             if(temp.left!=null)st.push(temp.left);
//             if(temp.right!=null)st.push(temp.right);
//         }
//         return count;
//     }
// 	public static void main(String[] args) {
// 		TreeNode root=new TreeNode(10);
// 		root.left=new TreeNode(20);
// 		root.right=new TreeNode(30);
// 		root.left.left=new TreeNode(40);
// 		root.left.right=new TreeNode(50);
// 	System.out.print(count(root));
// 	}
// }
//6
// import java.util.*;
// public class Main
// {
//     public static class TreeNode{
//         int data;
//         TreeNode left,right;
//         TreeNode(int value){
//             data=value;
//             left=right=null;
//         }
//     }
//     public static int count(TreeNode root){
//         int count=0;
//         if(root==null)return 0;
//         if(root.left==null&&root.right==null)return 1;
//         return count(root.left)+count(root.right);
//     }
   
// 	public static void main(String[] args) {
// 		TreeNode root=new TreeNode(10);
// 		root.left=new TreeNode(20);
// 		root.right=new TreeNode(30);
// 		root.left.left=new TreeNode(40);
// 		root.left.right=new TreeNode(50);
// 	System.out.print(count(root));
// 	}
// }
// import java.util.*;
// public class Main
// {
//     public static class TreeNode{
//         int data;
//         TreeNode left,right;
//         TreeNode(int data){
//           this.data=data;
//             left=right=null;
//         }
//     }
// public static void print(TreeNode root,int level){
//     if(root==null)return ;
//     if(level==1)System.out.print(root.data+" ");
//     else{
//         print(root.left,level-1);
//         print(root.right,level-1);
//     }
// }
// 	public static void main(String[] args) {
// 		TreeNode root=new TreeNode(10);
// 		root.left=new TreeNode(20);
// 		root.right=new TreeNode(30);
// 		root.left.left=new TreeNode(40);
// 		root.left.right=new TreeNode(50);
// 	root.right.left=new TreeNode(60);
// 	root.right.right=new TreeNode(70);
// 	print(root,3);
// 	}
// }
//7 sum
// import java.util.*;
// public class Main
// {
//     public static class TreeNode{
//         int data;
//         TreeNode left,right;
//         TreeNode(int data){
//           this.data=data;
//             left=right=null;
//         }
//     }
// public static int  sum(TreeNode root){
//   if(root==null)return 0;
//  return root.data+sum(root.left)+sum(root.right);
// }
// 	public static void main(String[] args) {
// 		TreeNode root=new TreeNode(10);
// 		root.left=new TreeNode(20);
// 		root.right=new TreeNode(30);
// 		root.left.left=new TreeNode(40);
// 		root.left.right=new TreeNode(50);
// 	root.right.left=new TreeNode(60);
// 	root.right.right=new TreeNode(70);
// int ans=sum(root);
// System.out.print(ans);
// 	}
// }
//8

// import java.util.*;
// public class Main
// {
//     public static class TreeNode{
//         int data;
//         TreeNode left,right;
//         TreeNode(int data){
//           this.data=data;
//             left=right=null;
//         }
//     }
// public static void insert(TreeNode root,TreeNode x){
//     if(root==null) return;
    
//     if(root.left!=null&&root.right==null){
//         root.right=x;
//         return;
//     }
//      if(root.left==null&&root.right!=null){
//         root.left=x;
//         return;
//     }
//     insert(root.left,x);
//     insert(root.right,x);
// }
// public static int height(TreeNode root){
//     if(root==null)return 0;
//     return 1+Math.max(height(root.left),height(root.right));
// }
// public static void print(TreeNode root,int level){
//     if(root==null)return ;
//     if(level==1)System.out.print(root.data+" ");
//     else{
//         print(root.left,level-1);
//         print(root.right,level-1);
//     }
// }
// 	public static void main(String[] args) {
// 		TreeNode root=new TreeNode(1);
// 		root.left=new TreeNode(2);
// 		root.right=new TreeNode(3);
// 		root.left.left=new TreeNode(4);
// 	root.right.left=new TreeNode(6);
// 	root.right.right=new TreeNode(7);
// 	int val=5;
// 	TreeNode x=new TreeNode(val);
// 	insert(root,x);
// 	int height=height(root);
// 	for(int i=1;i<=height;i++){
// 	    print(root,i);
// 	}
// 	}
// }

interface Secure {
    boolean authenticate(String credentials);
}
abstract class PaymentMethod implements Secure {
    protected String user;

    public PaymentMethod(String user) {
        this.user = user;
    }
    abstract void processPayment(double amount);
    void generateReceipt(double amount) {
        System.out.println("Receipt: ₹" + amount + " paid by " + user);
    }
}
class UPIPayment extends PaymentMethod {
    private String upiPin;
    public UPIPayment(String user, String upiPin) {
        super(user);
        this.upiPin = upiPin;
    }
    @Override
    public boolean authenticate(String enteredPin) {
        return upiPin.equals(enteredPin);
    }
    @Override
    void processPayment(double amount) {
        System.out.println("Processing UPI Payment of ₹" + amount);
        generateReceipt(amount);
    }
}
class CreditCardPayment extends PaymentMethod {
    private String cvv;

    public CreditCardPayment(String user, String cvv) {
        super(user);
        this.cvv = cvv;
    }
    @Override
    public boolean authenticate(String enteredCvv) {
        return cvv.equals(enteredCvv);
    }
    @Override
    void processPayment(double amount) {
        System.out.println("Processing Credit Card Payment of ₹" + amount);
        generateReceipt(amount);
    }
}
public class PaymentApp {
    public static void main(String[] args) {
        PaymentMethod upi = new UPIPayment("Sushobhit", "1234");
        if (upi.authenticate("1234")) {
            upi.processPayment(500.00);
        } else {
            System.out.println("UPI Authentication Failed!");
        }

        PaymentMethod card = new CreditCardPayment("Sushobhit", "999");
        if (card.authenticate("999")) {
            card.processPayment(1500.00);
        } else {
            System.out.println("Credit Card Authentication Failed!");
        }
    }
}

