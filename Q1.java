public class Q2{

public static void main(String[] args){


int[] arr={3,9,18,3,28,6,17,9,3};

int n=arr.length;

HashMap<Integer,Integer> map=new HashMap<>();

for(int i=0;i<n;i++)
{
  if(map.containKey(arr[i])){

  map.put(arr[i],map.get(arr[i])+1);  
  
   }

   else{


    map.put(arr[i],value:1);
   }

}

for(Map.Entry<Integer,Integer>enty:map.entrySet()){


    if(enty.getValue()>1){

   System.out.print(enty.getkey()+" ");

    }
}



}


}