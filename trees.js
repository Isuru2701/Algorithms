export class Node {
    constructor(val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }



}

const a = new Node(1);
const b = new Node(2);
const c = new Node(1);
const d = new Node(45);
const e = new Node(13);
const f = new Node(4);


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

