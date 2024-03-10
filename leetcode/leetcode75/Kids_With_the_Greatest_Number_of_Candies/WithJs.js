

function kidsWithCandies(candies, extraCandies) {
    let max = Math.max(...candies);
    let result = candies.map((candy) => {
        return candy + extraCandies >= max;
    });
}


let candies = [2, 3, 5, 1, 3];
let extraCandies = 3;
console.log(kidsWithCandies(candies, extraCandies));