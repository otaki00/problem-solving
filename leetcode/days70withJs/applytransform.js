/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var map = function (arr, fn) {
    return arr.map(fn);
};


// another way 
var map2 = function (arr, fn) { 
    var newArr = []
    for (var i =0; i< arr.length; i++) {
        newArr.push(fn(arr[i]))
    }
    return newArr;
}

var addOne = function (num) {
    return num + 1;
}

var arr = [1, 2, 3];

console.log(map(arr, addOne)); // [2, 3, 4]

console.log(map2(arr, addOne)); // [2, 3, 4]

