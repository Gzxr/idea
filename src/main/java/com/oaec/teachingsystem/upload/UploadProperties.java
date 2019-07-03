package com.oaec.teachingsystem.upload;

import java.util.Map;

public class UploadProperties {

    // 获取存放位置
    private Map<String, String> location;

    public Map<String, String> getLocation() {
        return location;
    }

    public void setLocation(Map<String, String> location) {
        this.location = location;
    }

    /**
     * 获取保存路径，自动判断当前系统类型，然后获取对应的保存路径
     * @return
     */
    public String getBasePath() {
        String location = "";
        String os = System.getProperty("os.name");
        if(os.toLowerCase().startsWith("win")) {
            location = this.getLocation().get("windows");
        } else {
            location = this.getLocation().get("linux");
        }
        return location;
    }
}
