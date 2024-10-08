public class Сonditions {

    public static double safeDiv(int x, int y) {
        if (y == 0) {
            return 0;
        }
        return (double) x / y;
    }

    public String makeDecision(int x, int y) {
        if (x < y) {
            return "<";
        } else if (x > y) {
            return ">";
        } else {
            return "=";
        }
    }

    public boolean sum3(int x, int y, int z) {
        if ((x + y == z) || (x + z == y) || (y + z == x)) {
            return true;
        } else {
            return false;
        }
    }

    public String age(int x) {
        if (x % 10 == 1 && x % 100 != 11) {
            return x + " год";
        } else if ((x % 10 == 2 || x % 10 == 3 || x % 10 == 4) && (x % 100 < 12 || x % 100 > 14)) {
            return x + " года";
        } else {
            return x + " лет";
        }
    }

    public static void printDays(String x) {
        switch (x.toLowerCase()) {
            case "понедельник":
                System.out.println("понедельник");
                System.out.println("вторник");
                System.out.println("среда");
                System.out.println("четверг");
                System.out.println("пятница");
                System.out.println("суббота");
                System.out.println("воскресенье");
                break;
            case "вторник":
                System.out.println("вторник");
                System.out.println("среда");
                System.out.println("четверг");
                System.out.println("пятница");
                System.out.println("суббота");
                System.out.println("воскресенье");
                break;
            case "среда":
                System.out.println("среда");
                System.out.println("четверг");
                System.out.println("пятница");
                System.out.println("суббота");
                System.out.println("воскресенье");
                break;
            case "четверг":
                System.out.println("четверг");
                System.out.println("пятница");
                System.out.println("суббота");
                System.out.println("воскресенье");
                break;
            case "пятница":
                System.out.println("пятница");
                System.out.println("суббота");
                System.out.println("воскресенье");
                break;
            case "суббота":
                System.out.println("суббота");
                System.out.println("воскресенье");
                break;
            case "воскресенье":
                System.out.println("воскресенье");
                break;
            default:
                System.out.println("Это не день недели");
        }
    }
}
