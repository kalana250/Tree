import java.util.ArrayList;
import java.util.List;

public class MultywayTree1<T> {

    T data;

    List<MultiwayTree <T>> child;

    public MultywayTree1(T data) {
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
        MultiwayTree<String> root = new MultiwayTree<>("Root Gawesh");
        root.addChild(root);
        MultiwayTree<String> c1 = new MultiwayTree<>("Child Umesha");
        MultiwayTree<String> c2 = new MultiwayTree<>("Child Kalana");
        MultiwayTree<String> c3 = new MultiwayTree<>("Child Rasanjali");
        root.addChild(c1);
        root.addChild(c2);
        root.addChild(c3);
        MultiwayTree<String> c11 = new MultiwayTree<>("Child UmeshaSasa");
        MultiwayTree<String> c21 = new MultiwayTree<>("Child KalanaPunchumalith");
        MultiwayTree<String> c22 = new MultiwayTree<>("Child KalanaUnknown");
        MultiwayTree<String> c31 = new MultiwayTree<>("Child RasanjaliRasa");
        root.addChild(c11);
        root.addChild(c21);
        root.addChild(c31);
        root.addChild(c22);
        List<MultiwayTree<String>> rootchild = root.getChild();
        for(MultiwayTree<String> child : rootchild){
            System.out.println(child.getData());
        }

    }

}
