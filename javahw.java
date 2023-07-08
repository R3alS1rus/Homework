public class javahw {

    public static void main(String[] args) {

        daysInAMonth(pickAMonth.август);
    }
    public enum pickAMonth{
        январь, февраль, март, апрель, май, июнь, июль, август, сентябрь, октябрь, ноябрь, декабрь;
    }

    static void daysInAMonth(pickAMonth Month){
        switch (Month){
            case январь -> System.out.println("количество дней в этом месяце: 31");
            case февраль -> System.out.println("количество дней в этом месяце: 28");
            case март -> System.out.println("количество дней в этом месяце: 31");
            case апрель -> System.out.println("количество дней в этом месяце: 30");
            case май -> System.out.println("количество дней в этом месяце: 31");
            case июнь -> System.out.println("количество дней в этом месяце: 30");
            case июль -> System.out.println("количество дней в этом месяце: 31");
            case август -> System.out.println("количество дней в этом месяце: 31");
            case сентябрь -> System.out.println("количество дней в этом месяце: 30");
            case октябрь -> System.out.println("количество дней в этом месяце: 31");
            case ноябрь -> System.out.println("количество дней в этом месяце: 30");
            case декабрь -> System.out.println("количество дней в этом месяце: 31");
        }
    }
}
