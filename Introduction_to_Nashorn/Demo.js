function checkPrime() 
{            
    var n, i, flag = true; 
               
    n = 7;
    for(i = 2; i <= n - 1; i++) 
        if (n % i == 0) { 
            flag = false; 
            break; 
        } 
          
        // Check and display message 
    if (flag == true) 
        print(n + " is prime"); 
    else
        print(n + " is not prime"); 
} 