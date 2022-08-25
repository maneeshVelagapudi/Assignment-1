
public static void main (String[] args) {
    Scanner s = new Scanner(System.in); 
    System.out.println( "Fermat's Last Theorem: an + bn != zn,for all(n>2)"); 
    int a, b, z, n; 
    double nearest_miss;
    System.out.print("Enter value for a:"); 
    a = s.nextInt(); 
    System.out.print("Enter value for b:"); 
    b = s.nextInt(); 
    System.out.print("Enter value for z:"); 
    z = s.nextInt();
    while(true){
      System.out.print("Enter value for n or exponent:"); 
      n = s.nextInt();
      if(n == 2){
        System.out.println("Enter value greater than 2");
        break;
           }else{ 
int pow_sum = (int)(Math.pow(a, n) + Math.pow(b, n)); // pow_sum has the value an + bn.
double z = Math.pow(pow_sum, 1.0 / n);
int z_pow = (int)Math.pow((int)z, n);  // z_pow has the value zn.
int z_ext_pow = (int)Math.pow((int)(z+1), n); // z_ext_pow has the value (z+1)n.
}
int diff_pow_sum_z_pow; //variable for difference between an + bn andzn.
int diff_z_ext_pow_sum; // variable for difference between (z+1)nandan + bn.
void compute() {
diff_pow_sum_z_pow = (pow_sum - z_pow);
diff_z_ext_pow_sum = (z_ext_pow - pow_sum);
if( diff_pow_sum_z_pow > diff_z_ext_pow_sum) // Comparison to find the nearest miss.
{
nearest_miss = diff_pow_sum_z_pow; 
} // Closing of IF
else{
nearest_miss = diff_z_ext_pow_sum; 
} // Closing of else
System.out.println("Nearest Miss="+nearest_miss);
} //Closing of function
compute(); //Calling of function to get nearest miss.
}

