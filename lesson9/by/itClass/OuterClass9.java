package by.itClass;


import java.util.Objects;

//public, default
public class OuterClass9 {
    private int field1;
    public int field2;
    int field3;
    public static int staticField;
    private InnerClass innerClass;

    public OuterClass9() {}

    public OuterClass9(int field1, int field2, int field3) {
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
    }

    // вложенный внутренний класс
    // public, protected, private, default
    public class InnerClass {
        private int inField1;
        private int inField2;

        public InnerClass() {
        }

        public InnerClass(int inField1, int inField2) {
            this.inField1 = inField1;
            this.inField2 = inField2;
        }

        // доступны поля внешнего класса
        public void setFields(int p1, int p2, int p3, int p4) {
            this.inField1 = p1;
            field1 = p2;
            this.inField2 = this.inField1;
            field3 = p3;
            staticField = p4;
        }

        public void infoInner() {
            System.out.println(inField1 + ";" + inField2 + ";" + field1 + ";" + staticField + "...");
        }
    }

    public void setInnerClass(InnerClass innerClass) {
        this.innerClass = innerClass;
    }

    public void infoOuter() {
        System.out.println(field1 + ";" + field2 + ";" + field3 + ";" + staticField);
        if (Objects.nonNull(innerClass)) { // innerClass != null
            innerClass.infoInner();
        }
    }

    public void print(int param) {
        // локальный вложенный класс
        // default
        class Logger {
            private int localField;

            public Logger() {
            }

            public Logger(int localField) {
                this.localField = localField;
            }

            public int getLocalField() {
                return localField;
            }

            public void setLocalField(int localField) {
                this.localField = localField;
            }

            public void log() {
                System.out.println(localField + ";" + param + ";" + field1 + ";" +
                        field2 + ";" + field3);
            }
        }

        Logger logger = new Logger(999);
        logger.log();


    }

    // public, private, protected, default
    public static class StaticInnerClass {
        private int f1;

        public StaticInnerClass() {
        }

        public StaticInnerClass(int f1) {
            this.f1 = f1;
        }

        public int getF1() {
            return f1;
        }

        public void setF1(int f1) {
            this.f1 = f1;
        }

        public void infoStatic() {
            System.out.println(f1 + ";" + staticField);
        }
    }
}
