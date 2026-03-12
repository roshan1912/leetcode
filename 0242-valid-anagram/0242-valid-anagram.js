var isAnagram = function (s, t) {
    if (s.length !== t.length) return false;

    const map = new Map();

    for (const c of s) {
        map.set(c, (map.get(c) || 0) + 1);
    }

    for (const c of t) {
        if (!map.has(c)) return false;

        map.set(c, map.get(c) - 1);

        if (map.get(c) === 0) {
            map.delete(c);
        }
    }

    return true;
};