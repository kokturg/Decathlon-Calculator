public class Athlete {

    private String name;

    private int order;

    private double pointRunning100m;
    private double pointLongJump;
    private double pointShortPut;
    private double pointHighJump;
    private double pointRunning400m;
    private double pointHurdles;
    private double pointDiscusThrow;
    private double pointPoleVault;
    private double pointJavelinThrow;
    private double pointRunning1500m;

    private double resultRunning100m;
    private double resultLongJump;
    private double resultShortPut;
    private double resultHighJump;
    private double resultRunning400m;
    private double resultHurdles;
    private double resultDiscusThrow;
    private double resultPoleVault;
    private double resultJavelinThrow;
    private String resultRunning1500m;

    private int totalPoint;



    double[] a = new double[]{25.4347, 0.14354, 51.39, 0.8465, 1.53775, 5.74352, 12.91, 0.2797, 10.14, 0.03768};
    double[] b = new double[]{18, 220, 1.5, 75, 82, 28.5, 4, 100, 7, 480};
    double[] c = new double[]{1.81, 1.4, 1.05, 1.42, 1.81, 1.92, 1.1, 1.35, 1.08, 1.85};

    public Athlete() {
    }




    public int getTotalPoint() {
        totalPoint = (int) (getPointRunning100m() + getPointLongJump() + getPointShortPut() + getPointHighJump() + getPointRunning400m() +
                getPointHurdles() + getPointDiscusThrow() + getPointPoleVault() + getPointJavelinThrow() + getPointRunning1500m());

        return totalPoint;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRunning100m(String running100m) {
        this.resultRunning100m = Double.parseDouble(running100m);

        this.pointRunning100m = Double.parseDouble(running100m);
        this.pointRunning100m = Math.floor(a[0] * Math.pow(Math.abs(b[0] - getPointRunning100m()), c[0]));

    }

    public void setLongJump(String longJump) {

        this.resultLongJump = Double.parseDouble(longJump);

        this.pointLongJump = Double.parseDouble(longJump);
        this.pointLongJump = Math.floor(a[1] * Math.pow(Math.abs(getPointLongJump() - b[1]), c[1]));
    }

    public void setShortPut(String shortPut) {
        this.resultShortPut = Double.parseDouble(shortPut);

        this.pointShortPut = Double.parseDouble(shortPut);
        this.pointShortPut = Math.floor(a[2] * Math.pow(Math.abs(getPointShortPut() - b[2]) , c[2]));
    }

    public void setHighJump(String highJump) {
        this.resultHighJump = Double.parseDouble(highJump);

        this.pointHighJump = Double.parseDouble(highJump);
        this.pointHighJump = Math.floor(a[3] * Math.pow(Math.abs(getPointHighJump() - b[3]), c[3]));
    }


    public void setRunning400m(String running400m) {
        this.resultRunning400m = Double.parseDouble(running400m);

        this.pointRunning400m = Double.parseDouble(running400m);
        this.pointRunning400m = Math.floor(a[4] * Math.pow(Math.abs(b[4] - getPointRunning400m()), c[4]));
    }


    public void setHurdles(String hurdles) {
        this.resultHurdles = Double.parseDouble(hurdles);

        this.pointHurdles = Double.parseDouble(hurdles);
        this.pointHurdles = Math.floor(a[5] * Math.pow(Math.abs(b[5] - getPointHurdles()), c[5]));
    }


    public void setDiscusThrow(String discusThrow) {
        this.resultDiscusThrow = Double.parseDouble(discusThrow);

        this.pointDiscusThrow = Double.parseDouble(discusThrow);
        this.pointDiscusThrow = Math.floor(a[6] * Math.pow(Math.abs(getPointDiscusThrow() - b[6]) , c[6]));
    }

    public void setPoleVault(String poleVault) {
        this.resultPoleVault = Double.parseDouble(poleVault);

        this.pointPoleVault = Double.parseDouble(poleVault);
        this.pointPoleVault = Math.floor(a[7] * Math.pow(Math.abs(getPointPoleVault() - b[7]), c[7]));
    }


    public void setJavelinThrow(String javelinThrow) {
        this.resultJavelinThrow = Double.parseDouble(javelinThrow);

        this.pointJavelinThrow = Double.parseDouble(javelinThrow);
        this.pointJavelinThrow = Math.floor(a[8] * Math.pow(Math.abs(getPointJavelinThrow() - b[8]), c[8]));

    }

    public void setRunning1500m(String running1500m) {

         // Input format  xx.xx.xx, Converting to seconds

        this.resultRunning1500m = running1500m;

        String[] time = running1500m.split("\\.",2);

        double minutes = Double.parseDouble(time[0]);
        double secondsAndMiliseconds = Double.parseDouble(time[1]);
        double totalInSeconds = (minutes * 60) + secondsAndMiliseconds;

        this.pointRunning1500m = Math.floor(a[9] * Math.pow(Math.abs(b[9] - totalInSeconds), c[9]));
    }

    public double getPointRunning100m() {
        return pointRunning100m;
    }

    public double getPointLongJump() {
        return pointLongJump;
    }

    public double getPointShortPut() {
        return pointShortPut;
    }

    public double getPointHighJump() {
        return pointHighJump;
    }

    public double getPointRunning400m() {
        return pointRunning400m;
    }

    public double getPointHurdles() {
        return pointHurdles;
    }

    public double getPointDiscusThrow() {
        return pointDiscusThrow;
    }

    public double getPointPoleVault() {
        return pointPoleVault;
    }

    public double getPointJavelinThrow() {
        return pointJavelinThrow;
    }

    public double getPointRunning1500m() {
        return pointRunning1500m;
    }

    public double getResultRunning100m() {
        return resultRunning100m;
    }

    public double getResultLongJump() {
        return resultLongJump;
    }

    public double getResultShortPut() {
        return resultShortPut;
    }

    public double getResultHighJump() {
        return resultHighJump;
    }

    public double getResultRunning400m() {
        return resultRunning400m;
    }

    public double getResultHurdles() {
        return resultHurdles;
    }

    public double getResultDiscusThrow() {
        return resultDiscusThrow;
    }

    public double getResultPoleVault() {
        return resultPoleVault;
    }

    public double getResultJavelinThrow() {
        return resultJavelinThrow;
    }

    public String getResultRunning1500m() {
        return resultRunning1500m;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }
}