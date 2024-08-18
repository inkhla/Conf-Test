package objects;

import java.util.ArrayList;

public class AboutLang {
    private String aboutConfFooter;
    private String aboutConfHeader;
    private String confName;
    private String confDescription;
    private String confTitle;
    private String confFromToDate;
    private String confLocation;
    private String confFromTime;
    private String confToTime;
    private String confRegisterButtonText;
    private ArrayList<String> confStatistics;

    public AboutLang() {
    }

    public void setAboutConfHeader(String aboutConfHeader) {
        this.aboutConfHeader = aboutConfHeader;
    }

    public void setAboutConfFooter(String aboutConfFooter) {
        this.aboutConfFooter = aboutConfFooter;
    }

    public void setConfName(String confName) {
        this.confName = confName;
    }

    public void setConfDescription(String confDescription) {
        this.confDescription = confDescription;
    }

    public void setConfTitle(String confTitle) {
        this.confTitle = confTitle;
    }

    public void setConfFromToDate(String confFromToDate) {
        this.confFromToDate = confFromToDate;
    }

    public void setConfLocation(String confLocation) {
        this.confLocation = confLocation;
    }

    public void setConfFromTime(String confFromTime) {
        this.confFromTime = confFromTime;
    }

    public void setConfToTime(String confToTime) {
        this.confToTime = confToTime;
    }

    public void setConfRegisterButtonText(String confRegisterButtonText) {
        this.confRegisterButtonText = confRegisterButtonText;
    }

    public void setConfStatistics(ArrayList<String> confStatistics) {
        this.confStatistics = confStatistics;
    }

    public String getAboutConfHeader() {
        return aboutConfHeader;
    }

    public String getAboutConfFooter() {
        return aboutConfFooter;
    }

    public String getConfName() {
        return confName;
    }

    public String getConfDescription() {
        return confDescription;
    }

    public String getConfTitle() {
        return confTitle;
    }

    public String getConfFromToDate() {
        return confFromToDate;
    }

    public String getConfLocation() {
        return confLocation;
    }

    public String getConfFromTime() {
        return confFromTime;
    }

    public String getConfToTime() {
        return confToTime;
    }

    public String getConfRegisterButtonText() {
        return confRegisterButtonText;
    }

    public ArrayList<String> getConfStatistics() {
        return confStatistics;
    }

    @Override
    public String toString() {
        return "About{" +
                "aboutConfHeader='" + aboutConfHeader + '\'' +
                ", aboutConfFooter='" + aboutConfFooter + '\'' +
                ", confName='" + confName + '\'' +
                ", confDescription='" + confDescription + '\'' +
                ", confTitle='" + confTitle + '\'' +
                ", confFromToDate='" + confFromToDate + '\'' +
                ", confLocalization='" + confLocation + '\'' +
                ", confFromTime='" + confFromTime + '\'' +
                ", confToTime='" + confToTime + '\'' +
                ", confRegisterButtonText='" + confRegisterButtonText + '\'' +
                ", confStatistics=" + confStatistics +
                '}';
    }

}
