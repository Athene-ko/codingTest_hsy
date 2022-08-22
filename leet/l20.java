public class l20 {
    public boolean solution(String s ) {
        Stack<Character> st = new Stack();
        for ( int i = 0 ; i < s.length() ; i++) {
            char c = s.charAt(i);
            char item= ' ';
            if (c=='(' || c=='[' || c=='{') st.push(c);
            else {
                if (st.isEmpty()) return false;
                item = st.pop();
            }
            if (c==')'&&item!='(' || c==']'&&item!='[' || c=='}'&&item!='{') return false;
        }
        return st.isEmpty();
    }
}
