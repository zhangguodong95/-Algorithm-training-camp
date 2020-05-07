import java.util.HashSet;

/**
 * @author zgd
 * @version 1.0
 * @date 2020/5/6 20:40
 */

public class Template {
    //dfs

    HashSet<Node> visited = new HashSet<>();

    public void dfs(Node node, HashSet<Node> visited) {
        //terminator
        if (visited.contains(node)) {
            //already visited
            return;
        }

        visited.add(node);

        // process current node here

        if (visited.contains(node.left)) {
            dfs(node.left,visited);
        }
        if (visited.contains(node.right)) {
            dfs(node.right,visited);
        }
    }
}
