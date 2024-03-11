/**
 * @param {number[]} nums
 * @param {Function} fn
 * @param {number} init
 * @return {number}
 */
var reduce = function (nums, fn, init) {
    return nums.reduce(fn, init)
};

// manual way
var reduce2 = function (nums, fn, init) {

    for (let i = 0; i < nums.length; i++) {
        init = fn(acc, nums[i]);
    }

    return init;
};