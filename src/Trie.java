
class Node {
    Node[] links;
    boolean flag;
    public Node(){
        flag = false;
        links = new Node[26];
    }
    public boolean containsKey(char ch){
        return links[ch - 'a']!=null;
    }
    public void put(char ch,Node node){
        links[ch-'a'] = node;

    }
    public Node get(char ch){
        return links[ch - 'a'];
    }
    public void setEnd(){
        flag = true;
    }
    boolean isEnd(){
        return flag;
    }
}


public class Trie {
    private static Node root;
    public Trie(){
        root = new Node();
    }
    static void insert(String word){
        Node node = root;
        for(int i=0;i<word.length();i++) {
            if (!node.containsKey(word.charAt(i)))
                node.put(word.charAt(i), new Node());
            node.get(word.charAt(i)); //Moves to reference trie
        }
        node.setEnd();
    }
    static boolean search(String word){
        Node node = root;
        for(int i=0;i<word.length();i++) {
            if (!node.containsKey(word.charAt(i)))
                return false;
            node = node.get(word.charAt(i));
        }
        return node.isEnd();
    }
    static boolean startsWith(String prefix){
        Node node = root;
        for(int i=0;i<prefix.length();i++){
            if(!node.containsKey(prefix.charAt(i)))
                return false;
            node = node.get(prefix.charAt(i));
        }
        return true;
    }
    static void display(Node root) {
        for(int i = 0; i < root.links.length; i++){
            if(root.links[i] != null){
                System.out.print((char)i);
                root = root.links[i];
                display(root);
                System.out.println();
            }
        }
    }
}
