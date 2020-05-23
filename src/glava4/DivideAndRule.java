package glava4;
//САМ НАПИСАЛ!
public class DivideAndRule {
    private static Integer divide(int l, int h){
        if (l == h) return l; //Базовый случай
        else {
            int x = Math.max(l,h);
            int y = Math.min(l,h);
            x = x - y;
            return divide(x, y);//Рекурсивный случай
        }
    }

    public static void main(String[] args) {
        int l = 1680;
        int h = 640;
        int max = divide(l, h);
        System.out.println("Максимально возможные равные квадратные участки для надела = " + max + "x" + max);
    }
}
