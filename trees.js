class Node {
    constructor(val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }

    

}

const a = Node(1);
const b = Node(2);
const c = Node(1);
const d = Node(45);
const e = Node(13);
const f = Node(4);


/**
 * 
 *          a
 *         / \
 *        b   c
 *      /  \   \
 *     d   e    f
 */

a.left = b;
a.right = c;
b.left = d;
b.right = e;
c.right = f;

