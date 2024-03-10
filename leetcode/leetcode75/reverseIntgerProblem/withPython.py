# Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

# Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

# this is problem could be simple, lets see the how we can solve it

def reverse(x):
        """
        :type x: int
        :rtype: int
        """
        #  after anythin check if the value is less than 0, 
        
        isNegative = False
        if x < 0 : 
            isNegative = True
            x = x * -1
        
        
        # fisrt we can reverse it, be loop thought the number digits on it
        # and divide by 10 => get us the last digit, then store it in variable (integer)
        result = 0
        i = 0
        # but before we start we need to find to the number of digits
        n = x
        
        while (n > 0):
            i += 1
            n = n // 10
        # min by one 
        i = i -1
        
        while (x > 0):
            # we used the number of digits here, to multi the the last digit from n by the decimal value of fisrt digit 
            result += (x % 10) * pow(10, i)
            # remove the digit that we already add
            x = int(x // 10)
            # sub one from i, because the number of digits decreased
            i -= 1
        
        result = -result if isNegative else result
        
        
        # check if result in range of 32-bit
        if result >= pow(2, 31)-1 or result < pow(-2, 31):
            return 0
        
        return result

    

print(reverse(-12345))