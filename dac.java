import java.io.*;

import javax.swing.text.rtf.RTFEditorKit;
class dac
{
    static int dac_max(int a[],int index,int l) //finding out maximum from array using divide and conquer algorithm
    {
        int max;
        if(index>=l-2)
        {
if(a[index]>a[index+1])
{
    return a[index];

}
else{
return a[index+1];
}
}
 max=dac_max(a, index+1, l);
if(a[index]>max)
{
return a[index];
}
else
{
    return max;
}


        }


static int dac_min(int a[],int index,int l) //finding out minimum from array using divide and conquer algorithm
{
    int min;
if(index>=l-2)
{
    if(a[index]<a[index+1])
    {
        return a[index];
    }
    else{
        return a[index+1];
    }
}
min=dac_min(a, index+1, l);
if(a[index]<min)
{
    return a[index];
}
else{
    return min;
}
}
public static void main(String[]args) {
    int min,max;
    int a[]={23,14,56,47,78,96,45,36};
    max=dac_max(a, 0, 8);
    min=dac_min(a, 0, 8);
    System.out.println("minimum number containing in array :"+min);
    System.out.println("maximum nuber containing in array :"+max);
}




    
}