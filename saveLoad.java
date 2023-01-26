public class saveLoad {
    public static void save(String file, String str) {
        try {
            FileOutputStream fileOut = new FileOutputStream(savePath + "\\" + file + ".ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(str);
            out.close();
            fileOut.close();
        }
        catch (IOException i) {
            i.printStackTrace();
            System.out.println("error");
        }
    }
    public static String load(String file) {
        String str = null;
        try {
            FileInputStream fileIn = new FileInputStream(savePath + "\\" + file + ".ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            str = (String) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
            return "0";
        } catch (ClassNotFoundException c) {
            return "0";
        }
        return str;
    }
}