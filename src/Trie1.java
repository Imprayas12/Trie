class Node1 {
    Node links[];
    int cntEndWith;
    int cntPrefix;
    Node1(){
        links = new Node[26];
        cntEndWith =0;
        cntPrefix =0;
    }
    boolean containsKey(char ch){
        return (links[ch-'a'])!=null;
    }
    Node get(char ch){
        return links[ch-'a'];
    }
    void put(char ch,Node node){
        links[ch - 'a']= node;
    }
    void increaseEnd()
}


public class Trie1 {
}
