/**
 * @param {string} s
 * @return {string}
 */
var reverseWords = function (s) {
    return s.split(' ').filter((el) => el !== '').reverse().join(' ');
};