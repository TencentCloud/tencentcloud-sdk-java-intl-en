/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VulFixedItem extends AbstractModel {

    /**
    * <p>Vulnerability ID</p>
    */
    @SerializedName("VulId")
    @Expose
    private Long VulId;

    /**
    * <p>Vulnerability name</p>
    */
    @SerializedName("VulName")
    @Expose
    private String VulName;

    /**
    * <p>Vulnerability level<br>Enumeration values:<br>LOW: Low risk<br>MEDIUM: Medium risk<br>HIGH: High risk<br>CRITICAL: Critical</p>
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * <p>VPR rating information (including rating result, description, and staged score), consistent with DescribeHostVulRiskList</p>
    */
    @SerializedName("VRPRatingInfo")
    @Expose
    private VPRRatingInfo VRPRatingInfo;

    /**
    * <p>Vulnerability type<br>Enumeration values:<br>LINUX: Linux software vulnerability<br>WINDOWS: Windows system patch vulnerability<br>WEB_CMS: Web-CMS vulnerability<br>APPLICATION: Application vulnerability<br>EMERGENCY: Urgent vulnerability</p>
    */
    @SerializedName("VulCategory")
    @Expose
    private String VulCategory;

    /**
    * <p>CVE id</p>
    */
    @SerializedName("CveId")
    @Expose
    private String CveId;

    /**
    * <p>Repair host name</p>
    */
    @SerializedName("MachineName")
    @Expose
    private String MachineName;

    /**
    * <p>Repair host instance ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Associated component &amp; number of paths</p>
    */
    @SerializedName("ComponentCount")
    @Expose
    private Long ComponentCount;

    /**
    * <p>Associated component &amp; path list</p>
    */
    @SerializedName("Components")
    @Expose
    private String [] Components;

    /**
    * <p>Last repair time<br>Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format)</p>
    */
    @SerializedName("LatestFixTime")
    @Expose
    private String LatestFixTime;

    /**
    * <p>VPR rating basis</p>
    */
    @SerializedName("VPRExplainInfo")
    @Expose
    private VPRExplainInfo VPRExplainInfo;

    /**
     * Get <p>Vulnerability ID</p> 
     * @return VulId <p>Vulnerability ID</p>
     */
    public Long getVulId() {
        return this.VulId;
    }

    /**
     * Set <p>Vulnerability ID</p>
     * @param VulId <p>Vulnerability ID</p>
     */
    public void setVulId(Long VulId) {
        this.VulId = VulId;
    }

    /**
     * Get <p>Vulnerability name</p> 
     * @return VulName <p>Vulnerability name</p>
     */
    public String getVulName() {
        return this.VulName;
    }

    /**
     * Set <p>Vulnerability name</p>
     * @param VulName <p>Vulnerability name</p>
     */
    public void setVulName(String VulName) {
        this.VulName = VulName;
    }

    /**
     * Get <p>Vulnerability level<br>Enumeration values:<br>LOW: Low risk<br>MEDIUM: Medium risk<br>HIGH: High risk<br>CRITICAL: Critical</p> 
     * @return Level <p>Vulnerability level<br>Enumeration values:<br>LOW: Low risk<br>MEDIUM: Medium risk<br>HIGH: High risk<br>CRITICAL: Critical</p>
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set <p>Vulnerability level<br>Enumeration values:<br>LOW: Low risk<br>MEDIUM: Medium risk<br>HIGH: High risk<br>CRITICAL: Critical</p>
     * @param Level <p>Vulnerability level<br>Enumeration values:<br>LOW: Low risk<br>MEDIUM: Medium risk<br>HIGH: High risk<br>CRITICAL: Critical</p>
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get <p>VPR rating information (including rating result, description, and staged score), consistent with DescribeHostVulRiskList</p> 
     * @return VRPRatingInfo <p>VPR rating information (including rating result, description, and staged score), consistent with DescribeHostVulRiskList</p>
     */
    public VPRRatingInfo getVRPRatingInfo() {
        return this.VRPRatingInfo;
    }

    /**
     * Set <p>VPR rating information (including rating result, description, and staged score), consistent with DescribeHostVulRiskList</p>
     * @param VRPRatingInfo <p>VPR rating information (including rating result, description, and staged score), consistent with DescribeHostVulRiskList</p>
     */
    public void setVRPRatingInfo(VPRRatingInfo VRPRatingInfo) {
        this.VRPRatingInfo = VRPRatingInfo;
    }

    /**
     * Get <p>Vulnerability type<br>Enumeration values:<br>LINUX: Linux software vulnerability<br>WINDOWS: Windows system patch vulnerability<br>WEB_CMS: Web-CMS vulnerability<br>APPLICATION: Application vulnerability<br>EMERGENCY: Urgent vulnerability</p> 
     * @return VulCategory <p>Vulnerability type<br>Enumeration values:<br>LINUX: Linux software vulnerability<br>WINDOWS: Windows system patch vulnerability<br>WEB_CMS: Web-CMS vulnerability<br>APPLICATION: Application vulnerability<br>EMERGENCY: Urgent vulnerability</p>
     */
    public String getVulCategory() {
        return this.VulCategory;
    }

    /**
     * Set <p>Vulnerability type<br>Enumeration values:<br>LINUX: Linux software vulnerability<br>WINDOWS: Windows system patch vulnerability<br>WEB_CMS: Web-CMS vulnerability<br>APPLICATION: Application vulnerability<br>EMERGENCY: Urgent vulnerability</p>
     * @param VulCategory <p>Vulnerability type<br>Enumeration values:<br>LINUX: Linux software vulnerability<br>WINDOWS: Windows system patch vulnerability<br>WEB_CMS: Web-CMS vulnerability<br>APPLICATION: Application vulnerability<br>EMERGENCY: Urgent vulnerability</p>
     */
    public void setVulCategory(String VulCategory) {
        this.VulCategory = VulCategory;
    }

    /**
     * Get <p>CVE id</p> 
     * @return CveId <p>CVE id</p>
     */
    public String getCveId() {
        return this.CveId;
    }

    /**
     * Set <p>CVE id</p>
     * @param CveId <p>CVE id</p>
     */
    public void setCveId(String CveId) {
        this.CveId = CveId;
    }

    /**
     * Get <p>Repair host name</p> 
     * @return MachineName <p>Repair host name</p>
     */
    public String getMachineName() {
        return this.MachineName;
    }

    /**
     * Set <p>Repair host name</p>
     * @param MachineName <p>Repair host name</p>
     */
    public void setMachineName(String MachineName) {
        this.MachineName = MachineName;
    }

    /**
     * Get <p>Repair host instance ID</p> 
     * @return InstanceId <p>Repair host instance ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Repair host instance ID</p>
     * @param InstanceId <p>Repair host instance ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Associated component &amp; number of paths</p> 
     * @return ComponentCount <p>Associated component &amp; number of paths</p>
     */
    public Long getComponentCount() {
        return this.ComponentCount;
    }

    /**
     * Set <p>Associated component &amp; number of paths</p>
     * @param ComponentCount <p>Associated component &amp; number of paths</p>
     */
    public void setComponentCount(Long ComponentCount) {
        this.ComponentCount = ComponentCount;
    }

    /**
     * Get <p>Associated component &amp; path list</p> 
     * @return Components <p>Associated component &amp; path list</p>
     */
    public String [] getComponents() {
        return this.Components;
    }

    /**
     * Set <p>Associated component &amp; path list</p>
     * @param Components <p>Associated component &amp; path list</p>
     */
    public void setComponents(String [] Components) {
        this.Components = Components;
    }

    /**
     * Get <p>Last repair time<br>Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format)</p> 
     * @return LatestFixTime <p>Last repair time<br>Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format)</p>
     */
    public String getLatestFixTime() {
        return this.LatestFixTime;
    }

    /**
     * Set <p>Last repair time<br>Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format)</p>
     * @param LatestFixTime <p>Last repair time<br>Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format)</p>
     */
    public void setLatestFixTime(String LatestFixTime) {
        this.LatestFixTime = LatestFixTime;
    }

    /**
     * Get <p>VPR rating basis</p> 
     * @return VPRExplainInfo <p>VPR rating basis</p>
     */
    public VPRExplainInfo getVPRExplainInfo() {
        return this.VPRExplainInfo;
    }

    /**
     * Set <p>VPR rating basis</p>
     * @param VPRExplainInfo <p>VPR rating basis</p>
     */
    public void setVPRExplainInfo(VPRExplainInfo VPRExplainInfo) {
        this.VPRExplainInfo = VPRExplainInfo;
    }

    public VulFixedItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VulFixedItem(VulFixedItem source) {
        if (source.VulId != null) {
            this.VulId = new Long(source.VulId);
        }
        if (source.VulName != null) {
            this.VulName = new String(source.VulName);
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.VRPRatingInfo != null) {
            this.VRPRatingInfo = new VPRRatingInfo(source.VRPRatingInfo);
        }
        if (source.VulCategory != null) {
            this.VulCategory = new String(source.VulCategory);
        }
        if (source.CveId != null) {
            this.CveId = new String(source.CveId);
        }
        if (source.MachineName != null) {
            this.MachineName = new String(source.MachineName);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ComponentCount != null) {
            this.ComponentCount = new Long(source.ComponentCount);
        }
        if (source.Components != null) {
            this.Components = new String[source.Components.length];
            for (int i = 0; i < source.Components.length; i++) {
                this.Components[i] = new String(source.Components[i]);
            }
        }
        if (source.LatestFixTime != null) {
            this.LatestFixTime = new String(source.LatestFixTime);
        }
        if (source.VPRExplainInfo != null) {
            this.VPRExplainInfo = new VPRExplainInfo(source.VPRExplainInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VulId", this.VulId);
        this.setParamSimple(map, prefix + "VulName", this.VulName);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamObj(map, prefix + "VRPRatingInfo.", this.VRPRatingInfo);
        this.setParamSimple(map, prefix + "VulCategory", this.VulCategory);
        this.setParamSimple(map, prefix + "CveId", this.CveId);
        this.setParamSimple(map, prefix + "MachineName", this.MachineName);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ComponentCount", this.ComponentCount);
        this.setParamArraySimple(map, prefix + "Components.", this.Components);
        this.setParamSimple(map, prefix + "LatestFixTime", this.LatestFixTime);
        this.setParamObj(map, prefix + "VPRExplainInfo.", this.VPRExplainInfo);

    }
}

