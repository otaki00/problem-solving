


# actully my solution is almost as all other solutions 
# but someothers used array instead of map 
# maybe in python the list is dynamic so use it will be more easy 
# but in languages like java you need to give size and will to largest numbers in the list (counting store)
# but i discovre a solution, that i think of, but i thought it will not work 

def findMajorNumber(numbers):
    count = 0
    num = numbers[0]
    
    for i in range(len(numbers)):
        print(num)
        if(count == 0): 
            num = numbers[i]
        if(numbers[i] == num ): count+=1
        else: count-=1 
    
    return num

numbers = [1,4,4,5,3,4]

print(findMajorNumber(numbers))