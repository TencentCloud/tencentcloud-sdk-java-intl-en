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

public class VulInfo extends AbstractModel {

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
    * Vulnerability Subtype
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * First detection time
    */
    @SerializedName("FoundTime")
    @Expose
    private String FoundTime;

    /**
    * Last discovery time
    */
    @SerializedName("LatestFoundTime")
    @Expose
    private String LatestFoundTime;

    /**
    * Vulnerability ID
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * Number of affected local images
    */
    @SerializedName("LocalImageCount")
    @Expose
    private Long LocalImageCount;

    /**
    * Affected Container Count
    */
    @SerializedName("ContainerCount")
    @Expose
    private Long ContainerCount;

    /**
    * Affected Repository Image Count
    */
    @SerializedName("RegistryImageCount")
    @Expose
    private Long RegistryImageCount;

    /**
    * Vulnerability Poc ID
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
    * Number of hosts with application protection enabled for the vulnerability.
    */
    @SerializedName("RaspOpenNodeCount")
    @Expose
    private Long RaspOpenNodeCount;

    /**
    * Number of hosts with application protection disabled for the vulnerability.
    */
    @SerializedName("RaspClosedNodeCount")
    @Expose
    private Long RaspClosedNodeCount;

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
     * Get Vulnerability Subtype 
     * @return Category Vulnerability Subtype
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set Vulnerability Subtype
     * @param Category Vulnerability Subtype
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * Get First detection time 
     * @return FoundTime First detection time
     */
    public String getFoundTime() {
        return this.FoundTime;
    }

    /**
     * Set First detection time
     * @param FoundTime First detection time
     */
    public void setFoundTime(String FoundTime) {
        this.FoundTime = FoundTime;
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
     * Get Number of affected local images 
     * @return LocalImageCount Number of affected local images
     */
    public Long getLocalImageCount() {
        return this.LocalImageCount;
    }

    /**
     * Set Number of affected local images
     * @param LocalImageCount Number of affected local images
     */
    public void setLocalImageCount(Long LocalImageCount) {
        this.LocalImageCount = LocalImageCount;
    }

    /**
     * Get Affected Container Count 
     * @return ContainerCount Affected Container Count
     */
    public Long getContainerCount() {
        return this.ContainerCount;
    }

    /**
     * Set Affected Container Count
     * @param ContainerCount Affected Container Count
     */
    public void setContainerCount(Long ContainerCount) {
        this.ContainerCount = ContainerCount;
    }

    /**
     * Get Affected Repository Image Count 
     * @return RegistryImageCount Affected Repository Image Count
     */
    public Long getRegistryImageCount() {
        return this.RegistryImageCount;
    }

    /**
     * Set Affected Repository Image Count
     * @param RegistryImageCount Affected Repository Image Count
     */
    public void setRegistryImageCount(Long RegistryImageCount) {
        this.RegistryImageCount = RegistryImageCount;
    }

    /**
     * Get Vulnerability Poc ID 
     * @return PocID Vulnerability Poc ID
     */
    public String getPocID() {
        return this.PocID;
    }

    /**
     * Set Vulnerability Poc ID
     * @param PocID Vulnerability Poc ID
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

    /**
     * Get Number of hosts with application protection enabled for the vulnerability. 
     * @return RaspOpenNodeCount Number of hosts with application protection enabled for the vulnerability.
     */
    public Long getRaspOpenNodeCount() {
        return this.RaspOpenNodeCount;
    }

    /**
     * Set Number of hosts with application protection enabled for the vulnerability.
     * @param RaspOpenNodeCount Number of hosts with application protection enabled for the vulnerability.
     */
    public void setRaspOpenNodeCount(Long RaspOpenNodeCount) {
        this.RaspOpenNodeCount = RaspOpenNodeCount;
    }

    /**
     * Get Number of hosts with application protection disabled for the vulnerability. 
     * @return RaspClosedNodeCount Number of hosts with application protection disabled for the vulnerability.
     */
    public Long getRaspClosedNodeCount() {
        return this.RaspClosedNodeCount;
    }

    /**
     * Set Number of hosts with application protection disabled for the vulnerability.
     * @param RaspClosedNodeCount Number of hosts with application protection disabled for the vulnerability.
     */
    public void setRaspClosedNodeCount(Long RaspClosedNodeCount) {
        this.RaspClosedNodeCount = RaspClosedNodeCount;
    }

    public VulInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VulInfo(VulInfo source) {
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
        if (source.FoundTime != null) {
            this.FoundTime = new String(source.FoundTime);
        }
        if (source.LatestFoundTime != null) {
            this.LatestFoundTime = new String(source.LatestFoundTime);
        }
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.LocalImageCount != null) {
            this.LocalImageCount = new Long(source.LocalImageCount);
        }
        if (source.ContainerCount != null) {
            this.ContainerCount = new Long(source.ContainerCount);
        }
        if (source.RegistryImageCount != null) {
            this.RegistryImageCount = new Long(source.RegistryImageCount);
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
        if (source.RaspOpenNodeCount != null) {
            this.RaspOpenNodeCount = new Long(source.RaspOpenNodeCount);
        }
        if (source.RaspClosedNodeCount != null) {
            this.RaspClosedNodeCount = new Long(source.RaspClosedNodeCount);
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
        this.setParamSimple(map, prefix + "FoundTime", this.FoundTime);
        this.setParamSimple(map, prefix + "LatestFoundTime", this.LatestFoundTime);
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "LocalImageCount", this.LocalImageCount);
        this.setParamSimple(map, prefix + "ContainerCount", this.ContainerCount);
        this.setParamSimple(map, prefix + "RegistryImageCount", this.RegistryImageCount);
        this.setParamSimple(map, prefix + "PocID", this.PocID);
        this.setParamSimple(map, prefix + "DefenceStatus", this.DefenceStatus);
        this.setParamSimple(map, prefix + "DefenceScope", this.DefenceScope);
        this.setParamSimple(map, prefix + "DefenceHostCount", this.DefenceHostCount);
        this.setParamSimple(map, prefix + "DefendedCount", this.DefendedCount);
        this.setParamSimple(map, prefix + "RaspOpenNodeCount", this.RaspOpenNodeCount);
        this.setParamSimple(map, prefix + "RaspClosedNodeCount", this.RaspClosedNodeCount);

    }
}

