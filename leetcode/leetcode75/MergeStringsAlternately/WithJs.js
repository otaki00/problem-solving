// this is another way to solve the same problem in {WithJava.java} File,
// but this time using js 


// this way basically, we get first the biggest length from the words, then loop based on it and add the latters to the result string 
let mergeAlternately = (word1, word2) => {
    let result = ""
    let len = word1.length > word2.length ? word1.length:word2.length
    for (let i = 0 ; i < len; i++){
        result += (word1[i] || "") + (word2[i] || "")
    }

    return result
}


let word1 = "abc"
let word2 = "pqr"
console.log(mergeAlternately(word1, word2))
