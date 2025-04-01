/**
 * @param {string} val
 * @return {Object}
 */
var expect = function(val) {
    let object = {
        toBe: function(arg1) {
            if (arg1 === val) {
                return true;
            }
            throw new Error("Not Equal");
        },
        notToBe: function(arg2) {
            if (arg2 !== val) {
                return true;
            }
            throw new Error("Equal");
        }
    };
    return object
};

/**
 * expect(5).toBe(5); // true
 * expect(5).notToBe(5); // throws "Equal"
 */