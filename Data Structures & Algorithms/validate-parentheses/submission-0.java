class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
        for (char c : s.toCharArray()) {
            if (!stack.isEmpty()){
                char ch = stack.peek();
                if (map.containsKey(c) && ch == map.get(c))
                    stack.pop();
                else
                    stack.push(c);
            }
            else
                stack.push(c);
        }
        return stack.isEmpty();
    }
}
