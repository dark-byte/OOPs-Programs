class Staff {
    protected String id;
    protected String name;
    protected String phno;

    Staff(String id, String name, String phno) {
        this.id = id;
        this.name = name;
        this.phno = phno;
    }
}

class technical extends Staff {
    protected String skill;

    technical(String id, String name, String phno, String skill) {
        super(id, name, phno);
        this.skill = skill;
    }

    @Override
    public String toString() {
        return "technical{ " +
                " id = " + id +
                ", name = " + name +
                ", phno = " + phno +
                ", skill = " + skill +
                " }";
    }
}

class teaching extends Staff {
    protected String dept;

    teaching(String id, String name, String phno, String dept) {
        super(id, name, phno);
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "teaching{ " +
                " id = " + id +
                ", name = " + name +
                ", phno = " + phno +
                ", dept = " + dept +
                " }";
    }
}

class contractar extends Staff {
    protected String period;

    contractar(String id, String name, String phno, String period) {
        super(id, name, phno);
        this.period = period;
    }

    @Override
    public String toString() {
        return "contracter{" +
                " id = " + id +
                ", name = " + name +
                ", phno = " + phno +
                ", period = " + period +
                " }";
    }
}

public class no4 {
    public static void main(String[] args) {
        Staff p = new teaching("AA", "Prashanth", "89898989", "CSE");
        Staff q = new technical("BB", "Pradeep", "89898989", "Electrician");
        Staff r = new contractar("CC", "Praveen", "89898989", "1Year");
        System.out.println(p.toString());
        System.out.println(q.toString());
        System.out.println(r.toString());
    }
}
