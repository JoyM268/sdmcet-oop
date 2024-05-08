// With a example show how interface is used in abstraction
interface Bank{
    float getROI();
}

class sbi implements Bank{
    String branch;
    sbi(String branch){
        this.branch = branch;
    }

    String getBranch(){
        return this.branch;
    }

    public float getROI(){
        return 7.5f;
    }
}

class interfaceEx{
    public static void main(String[] args) {
        sbi s1 = new sbi("Dharwad");
        System.out.println("Branch: " + s1.getBranch());
        System.out.println("ROI: " + s1.getROI());
    }
}