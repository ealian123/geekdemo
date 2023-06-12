package demo.unjuanable.domain.orgmng.empnumcounter;


public class EmpNumCounter {
    private long tenantId;
    private int yearNum;
    private int maxEmpNum;

    public EmpNumCounter(long tenantId, int yearNum, int maxEmpNum) {
        this.tenantId = tenantId;
        this.yearNum = yearNum;
        this.maxEmpNum = maxEmpNum;
    }

    public long getTenantId() {
        return tenantId;
    }

    public int getYearNum() {
        return yearNum;
    }

    public int getMaxEmpNum() {
        return maxEmpNum;
    }

    public void setMaxEmpNum(int maxEmpNum) {
        this.maxEmpNum = maxEmpNum;
    }

}