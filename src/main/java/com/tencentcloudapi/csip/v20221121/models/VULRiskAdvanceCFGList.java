/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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

public class VULRiskAdvanceCFGList extends AbstractModel {

    /**
    * Risk ID
    */
    @SerializedName("RiskId")
    @Expose
    private String RiskId;

    /**
    * Vulnerability name
    */
    @SerializedName("VULName")
    @Expose
    private String VULName;

    /**
    * Risk level
    */
    @SerializedName("RiskLevel")
    @Expose
    private String RiskLevel;

    /**
    * Source of the check task
    */
    @SerializedName("CheckFrom")
    @Expose
    private String CheckFrom;

    /**
    * Whether it's enabled. `1`: Enable; `0`: Disabled
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * Risk type.
    */
    @SerializedName("VULType")
    @Expose
    private String VULType;

    /**
    * Affected versions
    */
    @SerializedName("ImpactVersion")
    @Expose
    private String ImpactVersion;

    /**
    * CVE number
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("CVE")
    @Expose
    private String CVE;

    /**
    * Vulnerability tag
    */
    @SerializedName("VULTag")
    @Expose
    private String [] VULTag;

    /**
    * Fix solution
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("FixMethod")
    @Expose
    private String [] FixMethod;

    /**
    * Disclosure time
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("ReleaseTime")
    @Expose
    private String ReleaseTime;

    /**
    * Whether it's an emergency vulnerability. Values: `1` (emergency vulnerability); `0` (non-emergency vulnerability
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("EMGCVulType")
    @Expose
    private Long EMGCVulType;

    /**
    * Vulnerability description
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("VULDescribe")
    @Expose
    private String VULDescribe;

    /**
    * Affected components
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("ImpactComponent")
    @Expose
    private String ImpactComponent;

    /**
     * Get Risk ID 
     * @return RiskId Risk ID
     */
    public String getRiskId() {
        return this.RiskId;
    }

    /**
     * Set Risk ID
     * @param RiskId Risk ID
     */
    public void setRiskId(String RiskId) {
        this.RiskId = RiskId;
    }

    /**
     * Get Vulnerability name 
     * @return VULName Vulnerability name
     */
    public String getVULName() {
        return this.VULName;
    }

    /**
     * Set Vulnerability name
     * @param VULName Vulnerability name
     */
    public void setVULName(String VULName) {
        this.VULName = VULName;
    }

    /**
     * Get Risk level 
     * @return RiskLevel Risk level
     */
    public String getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set Risk level
     * @param RiskLevel Risk level
     */
    public void setRiskLevel(String RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get Source of the check task 
     * @return CheckFrom Source of the check task
     */
    public String getCheckFrom() {
        return this.CheckFrom;
    }

    /**
     * Set Source of the check task
     * @param CheckFrom Source of the check task
     */
    public void setCheckFrom(String CheckFrom) {
        this.CheckFrom = CheckFrom;
    }

    /**
     * Get Whether it's enabled. `1`: Enable; `0`: Disabled
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return Enable Whether it's enabled. `1`: Enable; `0`: Disabled
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set Whether it's enabled. `1`: Enable; `0`: Disabled
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param Enable Whether it's enabled. `1`: Enable; `0`: Disabled
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get Risk type. 
     * @return VULType Risk type.
     */
    public String getVULType() {
        return this.VULType;
    }

    /**
     * Set Risk type.
     * @param VULType Risk type.
     */
    public void setVULType(String VULType) {
        this.VULType = VULType;
    }

    /**
     * Get Affected versions 
     * @return ImpactVersion Affected versions
     */
    public String getImpactVersion() {
        return this.ImpactVersion;
    }

    /**
     * Set Affected versions
     * @param ImpactVersion Affected versions
     */
    public void setImpactVersion(String ImpactVersion) {
        this.ImpactVersion = ImpactVersion;
    }

    /**
     * Get CVE number
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return CVE CVE number
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getCVE() {
        return this.CVE;
    }

    /**
     * Set CVE number
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param CVE CVE number
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setCVE(String CVE) {
        this.CVE = CVE;
    }

    /**
     * Get Vulnerability tag 
     * @return VULTag Vulnerability tag
     */
    public String [] getVULTag() {
        return this.VULTag;
    }

    /**
     * Set Vulnerability tag
     * @param VULTag Vulnerability tag
     */
    public void setVULTag(String [] VULTag) {
        this.VULTag = VULTag;
    }

    /**
     * Get Fix solution
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return FixMethod Fix solution
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String [] getFixMethod() {
        return this.FixMethod;
    }

    /**
     * Set Fix solution
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param FixMethod Fix solution
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setFixMethod(String [] FixMethod) {
        this.FixMethod = FixMethod;
    }

    /**
     * Get Disclosure time
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return ReleaseTime Disclosure time
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getReleaseTime() {
        return this.ReleaseTime;
    }

    /**
     * Set Disclosure time
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param ReleaseTime Disclosure time
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setReleaseTime(String ReleaseTime) {
        this.ReleaseTime = ReleaseTime;
    }

    /**
     * Get Whether it's an emergency vulnerability. Values: `1` (emergency vulnerability); `0` (non-emergency vulnerability
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return EMGCVulType Whether it's an emergency vulnerability. Values: `1` (emergency vulnerability); `0` (non-emergency vulnerability
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Long getEMGCVulType() {
        return this.EMGCVulType;
    }

    /**
     * Set Whether it's an emergency vulnerability. Values: `1` (emergency vulnerability); `0` (non-emergency vulnerability
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param EMGCVulType Whether it's an emergency vulnerability. Values: `1` (emergency vulnerability); `0` (non-emergency vulnerability
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setEMGCVulType(Long EMGCVulType) {
        this.EMGCVulType = EMGCVulType;
    }

    /**
     * Get Vulnerability description
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return VULDescribe Vulnerability description
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getVULDescribe() {
        return this.VULDescribe;
    }

    /**
     * Set Vulnerability description
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param VULDescribe Vulnerability description
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setVULDescribe(String VULDescribe) {
        this.VULDescribe = VULDescribe;
    }

    /**
     * Get Affected components
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return ImpactComponent Affected components
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getImpactComponent() {
        return this.ImpactComponent;
    }

    /**
     * Set Affected components
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param ImpactComponent Affected components
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setImpactComponent(String ImpactComponent) {
        this.ImpactComponent = ImpactComponent;
    }

    public VULRiskAdvanceCFGList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VULRiskAdvanceCFGList(VULRiskAdvanceCFGList source) {
        if (source.RiskId != null) {
            this.RiskId = new String(source.RiskId);
        }
        if (source.VULName != null) {
            this.VULName = new String(source.VULName);
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new String(source.RiskLevel);
        }
        if (source.CheckFrom != null) {
            this.CheckFrom = new String(source.CheckFrom);
        }
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
        }
        if (source.VULType != null) {
            this.VULType = new String(source.VULType);
        }
        if (source.ImpactVersion != null) {
            this.ImpactVersion = new String(source.ImpactVersion);
        }
        if (source.CVE != null) {
            this.CVE = new String(source.CVE);
        }
        if (source.VULTag != null) {
            this.VULTag = new String[source.VULTag.length];
            for (int i = 0; i < source.VULTag.length; i++) {
                this.VULTag[i] = new String(source.VULTag[i]);
            }
        }
        if (source.FixMethod != null) {
            this.FixMethod = new String[source.FixMethod.length];
            for (int i = 0; i < source.FixMethod.length; i++) {
                this.FixMethod[i] = new String(source.FixMethod[i]);
            }
        }
        if (source.ReleaseTime != null) {
            this.ReleaseTime = new String(source.ReleaseTime);
        }
        if (source.EMGCVulType != null) {
            this.EMGCVulType = new Long(source.EMGCVulType);
        }
        if (source.VULDescribe != null) {
            this.VULDescribe = new String(source.VULDescribe);
        }
        if (source.ImpactComponent != null) {
            this.ImpactComponent = new String(source.ImpactComponent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RiskId", this.RiskId);
        this.setParamSimple(map, prefix + "VULName", this.VULName);
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);
        this.setParamSimple(map, prefix + "CheckFrom", this.CheckFrom);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "VULType", this.VULType);
        this.setParamSimple(map, prefix + "ImpactVersion", this.ImpactVersion);
        this.setParamSimple(map, prefix + "CVE", this.CVE);
        this.setParamArraySimple(map, prefix + "VULTag.", this.VULTag);
        this.setParamArraySimple(map, prefix + "FixMethod.", this.FixMethod);
        this.setParamSimple(map, prefix + "ReleaseTime", this.ReleaseTime);
        this.setParamSimple(map, prefix + "EMGCVulType", this.EMGCVulType);
        this.setParamSimple(map, prefix + "VULDescribe", this.VULDescribe);
        this.setParamSimple(map, prefix + "ImpactComponent", this.ImpactComponent);

    }
}

