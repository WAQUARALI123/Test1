public class SecondMax{


public static int secondMax(int arr[]){

int max=0;
int smax=0;

for(int i=0;i<arr.length;i++){

 if(max<arr[i]){

  smax= max;
  max =arr[i];
}
else if(smax<arr[i]){

     smax=arr[i];

}


}

return smax;


}

public static void main(String[] args){

int arr[]={9,10,2,3,8,1,3,5,7};

int result= SecondMax.secondMax(arr);

System.out.println(result);
}


}