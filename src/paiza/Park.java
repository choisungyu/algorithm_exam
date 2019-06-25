package paiza;

public class Park {
    private Gongsazang gongsazang;
    private Tree[] trees;

    public Park(Gongsazang gongsazang, Tree[] trees) {
        this.gongsazang = gongsazang;
        this.trees = trees;
    }

//    public void getSound(Tree trees) {
//        for (int i = 0; i < trees.length; i++) {
//            Tree tree = trees[i];
//
//            if ((tree.getX() - gongsazang.getX()) * (tree.getX() - gongsazang.getX())
//                    + (tree.getY() - gongsazang.getY()) * (tree.getY() - gongsazang.getY())
//                    >= gongsazang.getRadius() * gongsazang.getRadius()) {
//                System.out.println("silent");
//            } else {
//                System.out.println("noisy");
//            }
//
//        }
//    }
}
