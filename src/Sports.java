class Sports {
    void stu() {
        System.out.println("Sourabi has secured 1st place in cricket");
    }
    class Cricket extends Sports {
        void stu1() {
            System.out.println("Nithu has secured 1st place in running");
        }
    }
    class Tennis extends Sports {
        void stu2() {
            System.out.println("Prizz has secured 1st place in tennis");
        }
    }
    public static void main(String[] args) {
        Sports s1 = new Sports();
        Tennis t1 = s1.new Tennis();
        t1.stu();
        t1.stu2();
        Cricket c1 = s1.new Cricket();
        c1.stu();
        c1.stu1();
    }
}