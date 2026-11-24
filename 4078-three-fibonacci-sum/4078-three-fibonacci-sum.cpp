class Solution {
public:
    bool threeFibonacciSum(int n) {
        if(n == 1){
            return false;
        }
        if(n == 2){
            return true;
        }
        long long n1 = 1;
        long long n2 = 1;
        for(int i = 0; i<n; i++){
            long long n3 = n1+n2;
            if(n1+n2+n3 == n){
                return true;
            }
            if(n1+n2+n3 > n){
                return false;
            }
            n1 = n2;
            n2 = n3;
        }

        return false;
    }
};