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
    * Vulnerability ID
    */
    @SerializedName("VulId")
    @Expose
    private Long VulId;

    /**
    * Vulnerability name
    */
    @SerializedName("VulName")
    @Expose
    private String VulName;

    /**
    * Vulnerability level
Enumeration values:
LOW: low-risk
MEDIUM: Medium risk
HIGH: High risk
CRITICAL
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * VPR rating information (including rating result, description, and phased score), consistent with DescribeHostVulRiskList
    */
    @SerializedName("VRPRatingInfo")
    @Expose
    private VPRRatingInfo VRPRatingInfo;

    /**
    * Vulnerability Type
Enumeration values:
LINUX: Linux software vulnerability
WINDOWS: Windows system patch vulnerability
WEB_CMS: Web-CMS vulnerabilities
APPLICATION: Application vulnerability
EMERGENCY: Urgent vulnerability
    */
    @SerializedName("VulCategory")
    @Expose
    private String VulCategory;

    /**
    * CVE id
    */
    @SerializedName("CveId")
    @Expose
    private String CveId;

    /**
    * Repair the host name
    */
    @SerializedName("MachineName")
    @Expose
    private String MachineName;

    /**
    * Repair the host instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Associated component & number of paths
    */
    @SerializedName("ComponentCount")
    @Expose
    private Long ComponentCount;

    /**
    * Associated component & path list
    */
    @SerializedName("Components")
    @Expose
    private String [] Components;

    /**
    * Last repair time
Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format).
    */
    @SerializedName("LatestFixTime")
    @Expose
    private String LatestFixTime;

    /**
     * Get Vulnerability ID 
     * @return VulId Vulnerability ID
     */
    public Long getVulId() {
        return this.VulId;
    }

    /**
     * Set Vulnerability ID
     * @param VulId Vulnerability ID
     */
    public void setVulId(Long VulId) {
        this.VulId = VulId;
    }

    /**
     * Get Vulnerability name 
     * @return VulName Vulnerability name
     */
    public String getVulName() {
        return this.VulName;
    }

    /**
     * Set Vulnerability name
     * @param VulName Vulnerability name
     */
    public void setVulName(String VulName) {
        this.VulName = VulName;
    }

    /**
     * Get Vulnerability level
Enumeration values:
LOW: low-risk
MEDIUM: Medium risk
HIGH: High risk
CRITICAL 
     * @return Level Vulnerability level
Enumeration values:
LOW: low-risk
MEDIUM: Medium risk
HIGH: High risk
CRITICAL
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set Vulnerability level
Enumeration values:
LOW: low-risk
MEDIUM: Medium risk
HIGH: High risk
CRITICAL
     * @param Level Vulnerability level
Enumeration values:
LOW: low-risk
MEDIUM: Medium risk
HIGH: High risk
CRITICAL
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get VPR rating information (including rating result, description, and phased score), consistent with DescribeHostVulRiskList 
     * @return VRPRatingInfo VPR rating information (including rating result, description, and phased score), consistent with DescribeHostVulRiskList
     */
    public VPRRatingInfo getVRPRatingInfo() {
        return this.VRPRatingInfo;
    }

    /**
     * Set VPR rating information (including rating result, description, and phased score), consistent with DescribeHostVulRiskList
     * @param VRPRatingInfo VPR rating information (including rating result, description, and phased score), consistent with DescribeHostVulRiskList
     */
    public void setVRPRatingInfo(VPRRatingInfo VRPRatingInfo) {
        this.VRPRatingInfo = VRPRatingInfo;
    }

    /**
     * Get Vulnerability Type
Enumeration values:
LINUX: Linux software vulnerability
WINDOWS: Windows system patch vulnerability
WEB_CMS: Web-CMS vulnerabilities
APPLICATION: Application vulnerability
EMERGENCY: Urgent vulnerability 
     * @return VulCategory Vulnerability Type
Enumeration values:
LINUX: Linux software vulnerability
WINDOWS: Windows system patch vulnerability
WEB_CMS: Web-CMS vulnerabilities
APPLICATION: Application vulnerability
EMERGENCY: Urgent vulnerability
     */
    public String getVulCategory() {
        return this.VulCategory;
    }

    /**
     * Set Vulnerability Type
Enumeration values:
LINUX: Linux software vulnerability
WINDOWS: Windows system patch vulnerability
WEB_CMS: Web-CMS vulnerabilities
APPLICATION: Application vulnerability
EMERGENCY: Urgent vulnerability
     * @param VulCategory Vulnerability Type
Enumeration values:
LINUX: Linux software vulnerability
WINDOWS: Windows system patch vulnerability
WEB_CMS: Web-CMS vulnerabilities
APPLICATION: Application vulnerability
EMERGENCY: Urgent vulnerability
     */
    public void setVulCategory(String VulCategory) {
        this.VulCategory = VulCategory;
    }

    /**
     * Get CVE id 
     * @return CveId CVE id
     */
    public String getCveId() {
        return this.CveId;
    }

    /**
     * Set CVE id
     * @param CveId CVE id
     */
    public void setCveId(String CveId) {
        this.CveId = CveId;
    }

    /**
     * Get Repair the host name 
     * @return MachineName Repair the host name
     */
    public String getMachineName() {
        return this.MachineName;
    }

    /**
     * Set Repair the host name
     * @param MachineName Repair the host name
     */
    public void setMachineName(String MachineName) {
        this.MachineName = MachineName;
    }

    /**
     * Get Repair the host instance ID 
     * @return InstanceId Repair the host instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Repair the host instance ID
     * @param InstanceId Repair the host instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Associated component & number of paths 
     * @return ComponentCount Associated component & number of paths
     */
    public Long getComponentCount() {
        return this.ComponentCount;
    }

    /**
     * Set Associated component & number of paths
     * @param ComponentCount Associated component & number of paths
     */
    public void setComponentCount(Long ComponentCount) {
        this.ComponentCount = ComponentCount;
    }

    /**
     * Get Associated component & path list 
     * @return Components Associated component & path list
     */
    public String [] getComponents() {
        return this.Components;
    }

    /**
     * Set Associated component & path list
     * @param Components Associated component & path list
     */
    public void setComponents(String [] Components) {
        this.Components = Components;
    }

    /**
     * Get Last repair time
Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format). 
     * @return LatestFixTime Last repair time
Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format).
     */
    public String getLatestFixTime() {
        return this.LatestFixTime;
    }

    /**
     * Set Last repair time
Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format).
     * @param LatestFixTime Last repair time
Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format).
     */
    public void setLatestFixTime(String LatestFixTime) {
        this.LatestFixTime = LatestFixTime;
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

    }
}

