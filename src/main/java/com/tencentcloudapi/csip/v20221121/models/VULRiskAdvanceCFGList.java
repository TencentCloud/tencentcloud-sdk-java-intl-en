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
    * Risk level, low - low risk, high - high risk, middle - medium risk, info - notification, extreme - critical.
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
    * Enable/Disable. 1-Enable; 0-Disable.
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
    * CVE
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
    * Repair method
    */
    @SerializedName("FixMethod")
    @Expose
    private String [] FixMethod;

    /**
    * Disclosure time
    */
    @SerializedName("ReleaseTime")
    @Expose
    private String ReleaseTime;

    /**
    * Emergency Vulnerability Type. 1-Emergency Vulnerability; 0-Non-emergency Vulnerability.
    */
    @SerializedName("EMGCVulType")
    @Expose
    private Long EMGCVulType;

    /**
    * Vulnerability description
    */
    @SerializedName("VULDescribe")
    @Expose
    private String VULDescribe;

    /**
    * Affected component
    */
    @SerializedName("ImpactComponent")
    @Expose
    private String ImpactComponent;

    /**
    * Vulnerability Payload
    */
    @SerializedName("Payload")
    @Expose
    private String Payload;

    /**
    * Technology reference
    */
    @SerializedName("References")
    @Expose
    private String References;

    /**
    * CVSS Score
    */
    @SerializedName("CVSS")
    @Expose
    private String CVSS;

    /**
    * Attack intensity
    */
    @SerializedName("AttackHeat")
    @Expose
    private String AttackHeat;

    /**
    * Security Product Support Status
    */
    @SerializedName("ServiceSupport")
    @Expose
    private ServiceSupport [] ServiceSupport;

    /**
    * Latest detection time
    */
    @SerializedName("RecentScanTime")
    @Expose
    private String RecentScanTime;

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
     * Get Risk level, low - low risk, high - high risk, middle - medium risk, info - notification, extreme - critical. 
     * @return RiskLevel Risk level, low - low risk, high - high risk, middle - medium risk, info - notification, extreme - critical.
     */
    public String getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set Risk level, low - low risk, high - high risk, middle - medium risk, info - notification, extreme - critical.
     * @param RiskLevel Risk level, low - low risk, high - high risk, middle - medium risk, info - notification, extreme - critical.
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
     * Get Enable/Disable. 1-Enable; 0-Disable. 
     * @return Enable Enable/Disable. 1-Enable; 0-Disable.
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set Enable/Disable. 1-Enable; 0-Disable.
     * @param Enable Enable/Disable. 1-Enable; 0-Disable.
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
     * Get CVE 
     * @return CVE CVE
     */
    public String getCVE() {
        return this.CVE;
    }

    /**
     * Set CVE
     * @param CVE CVE
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
     * Get Repair method 
     * @return FixMethod Repair method
     */
    public String [] getFixMethod() {
        return this.FixMethod;
    }

    /**
     * Set Repair method
     * @param FixMethod Repair method
     */
    public void setFixMethod(String [] FixMethod) {
        this.FixMethod = FixMethod;
    }

    /**
     * Get Disclosure time 
     * @return ReleaseTime Disclosure time
     */
    public String getReleaseTime() {
        return this.ReleaseTime;
    }

    /**
     * Set Disclosure time
     * @param ReleaseTime Disclosure time
     */
    public void setReleaseTime(String ReleaseTime) {
        this.ReleaseTime = ReleaseTime;
    }

    /**
     * Get Emergency Vulnerability Type. 1-Emergency Vulnerability; 0-Non-emergency Vulnerability. 
     * @return EMGCVulType Emergency Vulnerability Type. 1-Emergency Vulnerability; 0-Non-emergency Vulnerability.
     */
    public Long getEMGCVulType() {
        return this.EMGCVulType;
    }

    /**
     * Set Emergency Vulnerability Type. 1-Emergency Vulnerability; 0-Non-emergency Vulnerability.
     * @param EMGCVulType Emergency Vulnerability Type. 1-Emergency Vulnerability; 0-Non-emergency Vulnerability.
     */
    public void setEMGCVulType(Long EMGCVulType) {
        this.EMGCVulType = EMGCVulType;
    }

    /**
     * Get Vulnerability description 
     * @return VULDescribe Vulnerability description
     */
    public String getVULDescribe() {
        return this.VULDescribe;
    }

    /**
     * Set Vulnerability description
     * @param VULDescribe Vulnerability description
     */
    public void setVULDescribe(String VULDescribe) {
        this.VULDescribe = VULDescribe;
    }

    /**
     * Get Affected component 
     * @return ImpactComponent Affected component
     */
    public String getImpactComponent() {
        return this.ImpactComponent;
    }

    /**
     * Set Affected component
     * @param ImpactComponent Affected component
     */
    public void setImpactComponent(String ImpactComponent) {
        this.ImpactComponent = ImpactComponent;
    }

    /**
     * Get Vulnerability Payload 
     * @return Payload Vulnerability Payload
     */
    public String getPayload() {
        return this.Payload;
    }

    /**
     * Set Vulnerability Payload
     * @param Payload Vulnerability Payload
     */
    public void setPayload(String Payload) {
        this.Payload = Payload;
    }

    /**
     * Get Technology reference 
     * @return References Technology reference
     */
    public String getReferences() {
        return this.References;
    }

    /**
     * Set Technology reference
     * @param References Technology reference
     */
    public void setReferences(String References) {
        this.References = References;
    }

    /**
     * Get CVSS Score 
     * @return CVSS CVSS Score
     */
    public String getCVSS() {
        return this.CVSS;
    }

    /**
     * Set CVSS Score
     * @param CVSS CVSS Score
     */
    public void setCVSS(String CVSS) {
        this.CVSS = CVSS;
    }

    /**
     * Get Attack intensity 
     * @return AttackHeat Attack intensity
     */
    public String getAttackHeat() {
        return this.AttackHeat;
    }

    /**
     * Set Attack intensity
     * @param AttackHeat Attack intensity
     */
    public void setAttackHeat(String AttackHeat) {
        this.AttackHeat = AttackHeat;
    }

    /**
     * Get Security Product Support Status 
     * @return ServiceSupport Security Product Support Status
     */
    public ServiceSupport [] getServiceSupport() {
        return this.ServiceSupport;
    }

    /**
     * Set Security Product Support Status
     * @param ServiceSupport Security Product Support Status
     */
    public void setServiceSupport(ServiceSupport [] ServiceSupport) {
        this.ServiceSupport = ServiceSupport;
    }

    /**
     * Get Latest detection time 
     * @return RecentScanTime Latest detection time
     */
    public String getRecentScanTime() {
        return this.RecentScanTime;
    }

    /**
     * Set Latest detection time
     * @param RecentScanTime Latest detection time
     */
    public void setRecentScanTime(String RecentScanTime) {
        this.RecentScanTime = RecentScanTime;
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
        if (source.Payload != null) {
            this.Payload = new String(source.Payload);
        }
        if (source.References != null) {
            this.References = new String(source.References);
        }
        if (source.CVSS != null) {
            this.CVSS = new String(source.CVSS);
        }
        if (source.AttackHeat != null) {
            this.AttackHeat = new String(source.AttackHeat);
        }
        if (source.ServiceSupport != null) {
            this.ServiceSupport = new ServiceSupport[source.ServiceSupport.length];
            for (int i = 0; i < source.ServiceSupport.length; i++) {
                this.ServiceSupport[i] = new ServiceSupport(source.ServiceSupport[i]);
            }
        }
        if (source.RecentScanTime != null) {
            this.RecentScanTime = new String(source.RecentScanTime);
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
        this.setParamSimple(map, prefix + "Payload", this.Payload);
        this.setParamSimple(map, prefix + "References", this.References);
        this.setParamSimple(map, prefix + "CVSS", this.CVSS);
        this.setParamSimple(map, prefix + "AttackHeat", this.AttackHeat);
        this.setParamArrayObj(map, prefix + "ServiceSupport.", this.ServiceSupport);
        this.setParamSimple(map, prefix + "RecentScanTime", this.RecentScanTime);

    }
}

