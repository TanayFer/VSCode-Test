class e {
    public static void main(String[] args) {
        System.out.println("Initial count: " + Student.getStudentCount());

        Student alpha = new Student();
        Student beta = new Student();

        System.out.println("Count after 2 students: " + Student.getStudentCount());
        
        new Student(); 
        
        System.out.println("Final count: " + Student.getStudentCount());
    }
}