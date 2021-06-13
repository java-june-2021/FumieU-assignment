public class ProjectTest{
    public static void main(String[] args){
        Project p = new Project();
        String pitch = p.elevetorPitch("Fumie ", "beginner of coding");
        System.out.println(pitch);

        Project nameAndDes = new Project();
        String whatName = nameAndDes.getName();
        System.out.println(whatName);
        nameAndDes.setName("Yoko");
        System.out.println(whatName);

        String whatDes = nameAndDes.getDesctiption();
        System.out.println(whatDes);
        nameAndDes.setDesctiprion("Scientist");
        System.out.println(whatDes);
    }
}