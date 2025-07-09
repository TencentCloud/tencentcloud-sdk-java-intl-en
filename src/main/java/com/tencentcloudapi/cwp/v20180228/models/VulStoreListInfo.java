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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VulStoreListInfo extends AbstractModel {

    /**
    * Vulnerability ID
    */
    @SerializedName("VulId")
    @Expose
    private Long VulId;

    /**
    * Vulnerability level
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * Vulnerability name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * CVE ID
    */
    @SerializedName("CveId")
    @Expose
    private String CveId;

    /**
    * 1: web-cms vulnerabilities; 2: application vulnerabilities; 4: Linux software vulnerabilities; 5: Windows system vulnerabilities; 0: emergency vulnerabilities.
    */
    @SerializedName("VulCategory")
    @Expose
    private Long VulCategory;

    /**
    * Release time
    */
    @SerializedName("PublishDate")
    @Expose
    private String PublishDate;

    /**
    * Vulnerability Detection Method: 0 - Version Comparison, 1 - POC Verification
    */
    @SerializedName("Method")
    @Expose
    private Long Method;

    /**
    * Vulnerability attack level
    */
    @SerializedName("AttackLevel")
    @Expose
    private Long AttackLevel;

    /**
    * Whether automatic vulnerability fixing is supported
0: not supported on Windows/Linux; 1: supported on Windows/Linux; 2: supported on Linux only; 3: supported on Windows only.
    */
    @SerializedName("FixSwitch")
    @Expose
    private Long FixSwitch;

    /**
    * Whether defense against vulnerabilities is supported
0: not supported; 1: supported.
    */
    @SerializedName("SupportDefense")
    @Expose
    private Long SupportDefense;

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
     * Get Vulnerability level 
     * @return Level Vulnerability level
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set Vulnerability level
     * @param Level Vulnerability level
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get Vulnerability name 
     * @return Name Vulnerability name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Vulnerability name
     * @param Name Vulnerability name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get CVE ID 
     * @return CveId CVE ID
     */
    public String getCveId() {
        return this.CveId;
    }

    /**
     * Set CVE ID
     * @param CveId CVE ID
     */
    public void setCveId(String CveId) {
        this.CveId = CveId;
    }

    /**
     * Get 1: web-cms vulnerabilities; 2: application vulnerabilities; 4: Linux software vulnerabilities; 5: Windows system vulnerabilities; 0: emergency vulnerabilities. 
     * @return VulCategory 1: web-cms vulnerabilities; 2: application vulnerabilities; 4: Linux software vulnerabilities; 5: Windows system vulnerabilities; 0: emergency vulnerabilities.
     */
    public Long getVulCategory() {
        return this.VulCategory;
    }

    /**
     * Set 1: web-cms vulnerabilities; 2: application vulnerabilities; 4: Linux software vulnerabilities; 5: Windows system vulnerabilities; 0: emergency vulnerabilities.
     * @param VulCategory 1: web-cms vulnerabilities; 2: application vulnerabilities; 4: Linux software vulnerabilities; 5: Windows system vulnerabilities; 0: emergency vulnerabilities.
     */
    public void setVulCategory(Long VulCategory) {
        this.VulCategory = VulCategory;
    }

    /**
     * Get Release time 
     * @return PublishDate Release time
     */
    public String getPublishDate() {
        return this.PublishDate;
    }

    /**
     * Set Release time
     * @param PublishDate Release time
     */
    public void setPublishDate(String PublishDate) {
        this.PublishDate = PublishDate;
    }

    /**
     * Get Vulnerability Detection Method: 0 - Version Comparison, 1 - POC Verification 
     * @return Method Vulnerability Detection Method: 0 - Version Comparison, 1 - POC Verification
     */
    public Long getMethod() {
        return this.Method;
    }

    /**
     * Set Vulnerability Detection Method: 0 - Version Comparison, 1 - POC Verification
     * @param Method Vulnerability Detection Method: 0 - Version Comparison, 1 - POC Verification
     */
    public void setMethod(Long Method) {
        this.Method = Method;
    }

    /**
     * Get Vulnerability attack level 
     * @return AttackLevel Vulnerability attack level
     */
    public Long getAttackLevel() {
        return this.AttackLevel;
    }

    /**
     * Set Vulnerability attack level
     * @param AttackLevel Vulnerability attack level
     */
    public void setAttackLevel(Long AttackLevel) {
        this.AttackLevel = AttackLevel;
    }

    /**
     * Get Whether automatic vulnerability fixing is supported
0: not supported on Windows/Linux; 1: supported on Windows/Linux; 2: supported on Linux only; 3: supported on Windows only. 
     * @return FixSwitch Whether automatic vulnerability fixing is supported
0: not supported on Windows/Linux; 1: supported on Windows/Linux; 2: supported on Linux only; 3: supported on Windows only.
     */
    public Long getFixSwitch() {
        return this.FixSwitch;
    }

    /**
     * Set Whether automatic vulnerability fixing is supported
0: not supported on Windows/Linux; 1: supported on Windows/Linux; 2: supported on Linux only; 3: supported on Windows only.
     * @param FixSwitch Whether automatic vulnerability fixing is supported
0: not supported on Windows/Linux; 1: supported on Windows/Linux; 2: supported on Linux only; 3: supported on Windows only.
     */
    public void setFixSwitch(Long FixSwitch) {
        this.FixSwitch = FixSwitch;
    }

    /**
     * Get Whether defense against vulnerabilities is supported
0: not supported; 1: supported. 
     * @return SupportDefense Whether defense against vulnerabilities is supported
0: not supported; 1: supported.
     */
    public Long getSupportDefense() {
        return this.SupportDefense;
    }

    /**
     * Set Whether defense against vulnerabilities is supported
0: not supported; 1: supported.
     * @param SupportDefense Whether defense against vulnerabilities is supported
0: not supported; 1: supported.
     */
    public void setSupportDefense(Long SupportDefense) {
        this.SupportDefense = SupportDefense;
    }

    public VulStoreListInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VulStoreListInfo(VulStoreListInfo source) {
        if (source.VulId != null) {
            this.VulId = new Long(source.VulId);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.CveId != null) {
            this.CveId = new String(source.CveId);
        }
        if (source.VulCategory != null) {
            this.VulCategory = new Long(source.VulCategory);
        }
        if (source.PublishDate != null) {
            this.PublishDate = new String(source.PublishDate);
        }
        if (source.Method != null) {
            this.Method = new Long(source.Method);
        }
        if (source.AttackLevel != null) {
            this.AttackLevel = new Long(source.AttackLevel);
        }
        if (source.FixSwitch != null) {
            this.FixSwitch = new Long(source.FixSwitch);
        }
        if (source.SupportDefense != null) {
            this.SupportDefense = new Long(source.SupportDefense);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VulId", this.VulId);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "CveId", this.CveId);
        this.setParamSimple(map, prefix + "VulCategory", this.VulCategory);
        this.setParamSimple(map, prefix + "PublishDate", this.PublishDate);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamSimple(map, prefix + "AttackLevel", this.AttackLevel);
        this.setParamSimple(map, prefix + "FixSwitch", this.FixSwitch);
        this.setParamSimple(map, prefix + "SupportDefense", this.SupportDefense);

    }
}

