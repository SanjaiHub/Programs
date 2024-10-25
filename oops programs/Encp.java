class Employee{
    // int EmpId;//not safe
    private int EmpId;
    public void setEmpId(int eid){
        EmpId=eid;  
    }
    public int getEmpId(){
        return EmpId;
    }
    
}class Company{
    public static void main(String[] args) {
        Employee e=new Employee();
        // e.EmpId=11;//not safe
        e.setEmpId(10);
        System.out.println(e.getEmpId());//view
    }
}
