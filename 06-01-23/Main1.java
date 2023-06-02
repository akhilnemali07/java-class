abstract class Department{
    int DepartmentSize;
    public abstract int getDepartmentSize();
    public abstract int setDepartmentSize(int DepartmentSize);
}
class section extends Department{
    public int getDepartmentSize(){
        return DepartmentSize;
    }
    public int setDepartmentSize(int departmentSize){
        this.DepartmentSize = departmentSize;
        return departmentSize;
    }

}
class Main1{
    public static void main (String[] args){
        section obj = new section();
        obj.setDepartmentSize(14);
        System.out.print(obj.getDepartmentSize());
    }

}