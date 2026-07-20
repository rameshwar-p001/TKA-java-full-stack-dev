package Day17;

public class p1 {

    private int empId;
    private String name;
    private int sal;


    public void setEmp(int emp){
        this.empId=emp;
    }

    public int getemp(){
        return empId;
    }

    public void setName(String empn){
        this.name=empn;
    }

    public String getName(){
        return name;
    }

    public void setSal(int salr){
        this.sal=salr;
    }

    public int getSal(){
        return sal;
    }

    public static void main(String[] args) {
        
        p1 p = new p1();

        p.setEmp(123);
        p.setName("Ram");
        p.setSal(12340000);
        

        System.out.println( p.getemp());
        System.out.println( p.getName());
        System.out.println( p.getSal());

    }
    
}