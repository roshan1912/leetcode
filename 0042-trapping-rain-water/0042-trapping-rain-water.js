/**
 * @param {number[]} height
 * @return {number}
 */
var trap = function (height) {
    const n = height.length;
    let left = [];
    let right = [];
    left[0] = height[0]
    right[n - 1] = height[n - 1]
    for (let i = 1; i < n; i++) {
        if (height[i] > left[i - 1]) {
            left[i] = height[i]
        } else {
            left[i] = left[i - 1]
        }
    }

    for (let i = n - 2; i >= 0; i--) {
        if (height[i] > right[i + 1]) {
            right[i] = height[i]
        } else {
            right[i] = right[i + 1]
        }
    }

    let ans = 0;

    for (let i = 0; i < n; i++) {
        ans += Math.min(left[i], right[i]) - height[i]
    }
    return ans;
};