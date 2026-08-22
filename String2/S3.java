public class S3 {

    public String r(String s1) {

        String[] world = s1.split("\\.");

        StringBuilder ans = new StringBuilder();

        for (int i = world.length - 1; i >= 0; i--) {

            if (!world[i].isEmpty()) {
                if (ans.length() > 0) {
                    ans.append(".");
                }
                ans.append(world[i]);

            }
        }
        return ans.toString();

    }

    public static void main(String[] args) {
        S3 obj = new S3();
        System.out.println(obj.r("i.like...this.program.very.much"));

    }

}
