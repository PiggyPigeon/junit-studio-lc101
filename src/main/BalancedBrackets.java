package main;



public class BalancedBrackets {
    /**
     * The function BalancedBrackets should return true if and only if
     * the input string has a set of "balanced" brackets.
     *
     * That is, whether it consists entirely of pairs of opening/closing
     * brackets (in that order), none of which mis-nest. We consider a bracket
     * to be square-brackets: [ or ].
     *
     * The string may contain non-bracket characters as well.
     *
     * These strings have balanced brackets:
     *  "[LaunchCode]", "Launch[Code]", "[]LaunchCode", "", "[]"
     *
     * While these do not:
     *   "[LaunchCode", "Launch]Code[", "[", "]["
     *
     * @param str - to be validated
     * @return true if balanced, false otherwise
     */
    public static boolean hasBalancedBrackets(String str) {
        int lastOpenBracket = str.lastIndexOf("[");
        int lastCloseBracket = str.lastIndexOf("]");
        int firstOpenBracket = str.indexOf("[");
        int firstCloseBracket = str.indexOf("]");
        int brackets = 0;

        if (lastOpenBracket>lastCloseBracket) {
            return false;
        } else if (firstCloseBracket<firstOpenBracket) {
            return false;
        }
        for (char ch : str.toCharArray()) {
            if (ch == '[') {
                brackets++;
            } else if (ch == ']') {
                brackets--;
            }
        }
        return brackets == 0;
    }

    //if no brackets are passed?
    //if brackets are out of order ex: "]["
    //if brackets
}
