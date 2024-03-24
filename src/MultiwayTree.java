import java.util.ArrayList;
import java.util.List;

public class MultiwayTree<T> {

    T data;

    List<MultiwayTree <T>> child;

    public MultiwayTree(T data) {
        this.data = data;
        this.child = new ArrayList<>();
    }

    public void addChild(MultiwayTree<T> child) {
        this.child.add(child);
    }

    public T getData() {
        return data;
    }

    public List<MultiwayTree<T>> getChild() {
        return  child;
    }

    public static void main(String[] args) {
        MultiwayTree<String> root = new MultiwayTree<>("Root");
        root.addChild(root);
        MultiwayTree<String> c1 = new MultiwayTree<>("Child1");
        MultiwayTree<String> c2 = new MultiwayTree<>("Child2");
        MultiwayTree<String> c3 = new MultiwayTree<>("Child3");
        root.addChild(c1);
        root.addChild(c2);
        root.addChild(c3);
        MultiwayTree<String> c11 = new MultiwayTree<>("Child11");
        MultiwayTree<String> c21 = new MultiwayTree<>("Child21");
        root.addChild(c11);
        root.addChild(c21);
        List<MultiwayTree<String>> rootchild = root.getChild();
        for(MultiwayTree<String> child : rootchild){
            System.out.println(child.getData());
        }

    }

}
