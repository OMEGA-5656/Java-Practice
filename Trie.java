class Node{
    Node children[];
    boolean isEnd;

    Node(){
        children = new Node[26];
        isEnd = false;
    }
}

class Trie{
    Node root;
    Trie(){
        root = new Node();
    }

    void insert(String word){
        Node curr = root;
        for(int i = 0; i < word.length(); i++){
            int idx = word.charAt(i) - 'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }   
            curr = curr.children[idx];
        }
        curr.isEnd = true;
    }

    boolean search(String word){
        Node curr = root;
        for(int i = 0; i < word.length(); i++){
            int idx = word.charAt(i) - 'a';
            if(curr.children[idx] == null){
                return false;
            }
            curr = curr.children[idx];
        }
        return curr.isEnd;
    }

    boolean startsWith(String prefix){
        Node curr = root;
        for(int i = 0; i < prefix.length(); i++){
            int idx = prefix.charAt(i) - 'a';
            if(curr.children[idx] == null){
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }

    public static void main(String[] args){
        Trie trie = new Trie();
        trie.insert("apple");
        trie.insert("app");
        trie.insert("bat");

        System.out.println("search(apple) = " + trie.search("apple"));   // true
        System.out.println("search(app) = " + trie.search("app"));       // true
        System.out.println("search(ap) = " + trie.search("ap"));         // false
        System.out.println("startsWith(ap) = " + trie.startsWith("ap")); // true
        System.out.println("startsWith(ba) = " + trie.startsWith("ba")); // true
        System.out.println("search(bat) = " + trie.search("bat"));       // true
        System.out.println("search(ball) = " + trie.search("ball"));     // false
    }
}