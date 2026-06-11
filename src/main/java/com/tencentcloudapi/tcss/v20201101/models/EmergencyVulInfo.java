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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EmergencyVulInfo extends AbstractModel {

    /**
    * Vulnerability name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * vulnerability tag
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * CVSS V3 score
    */
    @SerializedName("CVSSV3Score")
    @Expose
    private Float CVSSV3Score;

    /**
    * Risk level
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * CVE No.
    */
    @SerializedName("CVEID")
    @Expose
    private String CVEID;

    /**
    * Vulnerability type
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * Vulnerability disclosure time
    */
    @SerializedName("SubmitTime")
    @Expose
    private String SubmitTime;

    /**
    * Last discovery time
    */
    @SerializedName("LatestFoundTime")
    @Expose
    private String LatestFoundTime;

    /**
    * Emergency vulnerability risk information. Valid values: `NOT_SCAN` (not scanned); `SCANNING` (scanning); `SCANNED_NOT_RISK` (scanned and at no risk); `SCANNED_RISK` (scanned and at risk).
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Vulnerability ID
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * POC ID
    */
    @SerializedName("PocID")
    @Expose
    private String PocID;

    /**
    * Defense Status. NO_DEFENDED: Not Defended; DEFENDED: Defended
    */
    @SerializedName("DefenceStatus")
    @Expose
    private String DefenceStatus;

    /**
    * Vulnerability Defense Host Range. MANUAL: Selected Host Nodes; ALL: All
    */
    @SerializedName("DefenceScope")
    @Expose
    private String DefenceScope;

    /**
    * Number of Hosts Defended Against Vulnerabilities
    */
    @SerializedName("DefenceHostCount")
    @Expose
    private Long DefenceHostCount;

    /**
    * Number of Attacks Defended
    */
    @SerializedName("DefendedCount")
    @Expose
    private Long DefendedCount;

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
     * Get vulnerability tag 
     * @return Tags vulnerability tag
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set vulnerability tag
     * @param Tags vulnerability tag
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get CVSS V3 score 
     * @return CVSSV3Score CVSS V3 score
     */
    public Float getCVSSV3Score() {
        return this.CVSSV3Score;
    }

    /**
     * Set CVSS V3 score
     * @param CVSSV3Score CVSS V3 score
     */
    public void setCVSSV3Score(Float CVSSV3Score) {
        this.CVSSV3Score = CVSSV3Score;
    }

    /**
     * Get Risk level 
     * @return Level Risk level
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set Risk level
     * @param Level Risk level
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get CVE No. 
     * @return CVEID CVE No.
     */
    public String getCVEID() {
        return this.CVEID;
    }

    /**
     * Set CVE No.
     * @param CVEID CVE No.
     */
    public void setCVEID(String CVEID) {
        this.CVEID = CVEID;
    }

    /**
     * Get Vulnerability type 
     * @return Category Vulnerability type
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set Vulnerability type
     * @param Category Vulnerability type
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * Get Vulnerability disclosure time 
     * @return SubmitTime Vulnerability disclosure time
     */
    public String getSubmitTime() {
        return this.SubmitTime;
    }

    /**
     * Set Vulnerability disclosure time
     * @param SubmitTime Vulnerability disclosure time
     */
    public void setSubmitTime(String SubmitTime) {
        this.SubmitTime = SubmitTime;
    }

    /**
     * Get Last discovery time 
     * @return LatestFoundTime Last discovery time
     */
    public String getLatestFoundTime() {
        return this.LatestFoundTime;
    }

    /**
     * Set Last discovery time
     * @param LatestFoundTime Last discovery time
     */
    public void setLatestFoundTime(String LatestFoundTime) {
        this.LatestFoundTime = LatestFoundTime;
    }

    /**
     * Get Emergency vulnerability risk information. Valid values: `NOT_SCAN` (not scanned); `SCANNING` (scanning); `SCANNED_NOT_RISK` (scanned and at no risk); `SCANNED_RISK` (scanned and at risk). 
     * @return Status Emergency vulnerability risk information. Valid values: `NOT_SCAN` (not scanned); `SCANNING` (scanning); `SCANNED_NOT_RISK` (scanned and at no risk); `SCANNED_RISK` (scanned and at risk).
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Emergency vulnerability risk information. Valid values: `NOT_SCAN` (not scanned); `SCANNING` (scanning); `SCANNED_NOT_RISK` (scanned and at no risk); `SCANNED_RISK` (scanned and at risk).
     * @param Status Emergency vulnerability risk information. Valid values: `NOT_SCAN` (not scanned); `SCANNING` (scanning); `SCANNED_NOT_RISK` (scanned and at no risk); `SCANNED_RISK` (scanned and at risk).
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Vulnerability ID 
     * @return ID Vulnerability ID
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set Vulnerability ID
     * @param ID Vulnerability ID
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get POC ID 
     * @return PocID POC ID
     */
    public String getPocID() {
        return this.PocID;
    }

    /**
     * Set POC ID
     * @param PocID POC ID
     */
    public void setPocID(String PocID) {
        this.PocID = PocID;
    }

    /**
     * Get Defense Status. NO_DEFENDED: Not Defended; DEFENDED: Defended 
     * @return DefenceStatus Defense Status. NO_DEFENDED: Not Defended; DEFENDED: Defended
     */
    public String getDefenceStatus() {
        return this.DefenceStatus;
    }

    /**
     * Set Defense Status. NO_DEFENDED: Not Defended; DEFENDED: Defended
     * @param DefenceStatus Defense Status. NO_DEFENDED: Not Defended; DEFENDED: Defended
     */
    public void setDefenceStatus(String DefenceStatus) {
        this.DefenceStatus = DefenceStatus;
    }

    /**
     * Get Vulnerability Defense Host Range. MANUAL: Selected Host Nodes; ALL: All 
     * @return DefenceScope Vulnerability Defense Host Range. MANUAL: Selected Host Nodes; ALL: All
     */
    public String getDefenceScope() {
        return this.DefenceScope;
    }

    /**
     * Set Vulnerability Defense Host Range. MANUAL: Selected Host Nodes; ALL: All
     * @param DefenceScope Vulnerability Defense Host Range. MANUAL: Selected Host Nodes; ALL: All
     */
    public void setDefenceScope(String DefenceScope) {
        this.DefenceScope = DefenceScope;
    }

    /**
     * Get Number of Hosts Defended Against Vulnerabilities 
     * @return DefenceHostCount Number of Hosts Defended Against Vulnerabilities
     */
    public Long getDefenceHostCount() {
        return this.DefenceHostCount;
    }

    /**
     * Set Number of Hosts Defended Against Vulnerabilities
     * @param DefenceHostCount Number of Hosts Defended Against Vulnerabilities
     */
    public void setDefenceHostCount(Long DefenceHostCount) {
        this.DefenceHostCount = DefenceHostCount;
    }

    /**
     * Get Number of Attacks Defended 
     * @return DefendedCount Number of Attacks Defended
     */
    public Long getDefendedCount() {
        return this.DefendedCount;
    }

    /**
     * Set Number of Attacks Defended
     * @param DefendedCount Number of Attacks Defended
     */
    public void setDefendedCount(Long DefendedCount) {
        this.DefendedCount = DefendedCount;
    }

    public EmergencyVulInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EmergencyVulInfo(EmergencyVulInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Tags != null) {
            this.Tags = new String[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new String(source.Tags[i]);
            }
        }
        if (source.CVSSV3Score != null) {
            this.CVSSV3Score = new Float(source.CVSSV3Score);
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.CVEID != null) {
            this.CVEID = new String(source.CVEID);
        }
        if (source.Category != null) {
            this.Category = new String(source.Category);
        }
        if (source.SubmitTime != null) {
            this.SubmitTime = new String(source.SubmitTime);
        }
        if (source.LatestFoundTime != null) {
            this.LatestFoundTime = new String(source.LatestFoundTime);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.PocID != null) {
            this.PocID = new String(source.PocID);
        }
        if (source.DefenceStatus != null) {
            this.DefenceStatus = new String(source.DefenceStatus);
        }
        if (source.DefenceScope != null) {
            this.DefenceScope = new String(source.DefenceScope);
        }
        if (source.DefenceHostCount != null) {
            this.DefenceHostCount = new Long(source.DefenceHostCount);
        }
        if (source.DefendedCount != null) {
            this.DefendedCount = new Long(source.DefendedCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "CVSSV3Score", this.CVSSV3Score);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "CVEID", this.CVEID);
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamSimple(map, prefix + "SubmitTime", this.SubmitTime);
        this.setParamSimple(map, prefix + "LatestFoundTime", this.LatestFoundTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "PocID", this.PocID);
        this.setParamSimple(map, prefix + "DefenceStatus", this.DefenceStatus);
        this.setParamSimple(map, prefix + "DefenceScope", this.DefenceScope);
        this.setParamSimple(map, prefix + "DefenceHostCount", this.DefenceHostCount);
        this.setParamSimple(map, prefix + "DefendedCount", this.DefendedCount);

    }
}

