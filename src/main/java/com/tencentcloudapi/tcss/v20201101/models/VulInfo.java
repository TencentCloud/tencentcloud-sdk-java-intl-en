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
    * Vulnerability tag
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * CVSS V3 score
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CVSSV3Score")
    @Expose
    private Float CVSSV3Score;

    /**
    * Risk level
Note: This field may return null, indicating that no valid values can be obtained.
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
    * Vulnerability sub-category
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * First discovery time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FoundTime")
    @Expose
    private String FoundTime;

    /**
    * Last discovery time
Note: This field may return null, indicating that no valid values can be obtained.
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
    * Number of affected containers
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ContainerCount")
    @Expose
    private Long ContainerCount;

    /**
    * Number of affected repository images
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RegistryImageCount")
    @Expose
    private Long RegistryImageCount;

    /**
    * POC ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PocID")
    @Expose
    private String PocID;

    /**
    * Defense status. Valid values: `NO_DEFENDED`, `DEFENDED`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DefenceStatus")
    @Expose
    private String DefenceStatus;

    /**
    * Scope of servers with exploit prevention enabled. Valid values: `MANUAL` (specified servers); `ALL` (all servers).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DefenceScope")
    @Expose
    private String DefenceScope;

    /**
    * Number of servers with exploit prevention enabled
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DefenceHostCount")
    @Expose
    private Long DefenceHostCount;

    /**
    * Number of attacks defended against
Note: This field may return null, indicating that no valid values can be obtained.
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
     * Get Vulnerability tag
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Tags Vulnerability tag
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set Vulnerability tag
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Tags Vulnerability tag
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get CVSS V3 score
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CVSSV3Score CVSS V3 score
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Float getCVSSV3Score() {
        return this.CVSSV3Score;
    }

    /**
     * Set CVSS V3 score
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CVSSV3Score CVSS V3 score
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCVSSV3Score(Float CVSSV3Score) {
        this.CVSSV3Score = CVSSV3Score;
    }

    /**
     * Get Risk level
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Level Risk level
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set Risk level
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Level Risk level
Note: This field may return null, indicating that no valid values can be obtained.
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
     * Get Vulnerability sub-category
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Category Vulnerability sub-category
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set Vulnerability sub-category
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Category Vulnerability sub-category
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * Get First discovery time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FoundTime First discovery time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFoundTime() {
        return this.FoundTime;
    }

    /**
     * Set First discovery time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FoundTime First discovery time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFoundTime(String FoundTime) {
        this.FoundTime = FoundTime;
    }

    /**
     * Get Last discovery time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LatestFoundTime Last discovery time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLatestFoundTime() {
        return this.LatestFoundTime;
    }

    /**
     * Set Last discovery time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LatestFoundTime Last discovery time
Note: This field may return null, indicating that no valid values can be obtained.
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
     * Get Number of affected containers
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ContainerCount Number of affected containers
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getContainerCount() {
        return this.ContainerCount;
    }

    /**
     * Set Number of affected containers
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ContainerCount Number of affected containers
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setContainerCount(Long ContainerCount) {
        this.ContainerCount = ContainerCount;
    }

    /**
     * Get Number of affected repository images
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RegistryImageCount Number of affected repository images
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRegistryImageCount() {
        return this.RegistryImageCount;
    }

    /**
     * Set Number of affected repository images
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RegistryImageCount Number of affected repository images
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRegistryImageCount(Long RegistryImageCount) {
        this.RegistryImageCount = RegistryImageCount;
    }

    /**
     * Get POC ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PocID POC ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPocID() {
        return this.PocID;
    }

    /**
     * Set POC ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PocID POC ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPocID(String PocID) {
        this.PocID = PocID;
    }

    /**
     * Get Defense status. Valid values: `NO_DEFENDED`, `DEFENDED`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DefenceStatus Defense status. Valid values: `NO_DEFENDED`, `DEFENDED`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDefenceStatus() {
        return this.DefenceStatus;
    }

    /**
     * Set Defense status. Valid values: `NO_DEFENDED`, `DEFENDED`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DefenceStatus Defense status. Valid values: `NO_DEFENDED`, `DEFENDED`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDefenceStatus(String DefenceStatus) {
        this.DefenceStatus = DefenceStatus;
    }

    /**
     * Get Scope of servers with exploit prevention enabled. Valid values: `MANUAL` (specified servers); `ALL` (all servers).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DefenceScope Scope of servers with exploit prevention enabled. Valid values: `MANUAL` (specified servers); `ALL` (all servers).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDefenceScope() {
        return this.DefenceScope;
    }

    /**
     * Set Scope of servers with exploit prevention enabled. Valid values: `MANUAL` (specified servers); `ALL` (all servers).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DefenceScope Scope of servers with exploit prevention enabled. Valid values: `MANUAL` (specified servers); `ALL` (all servers).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDefenceScope(String DefenceScope) {
        this.DefenceScope = DefenceScope;
    }

    /**
     * Get Number of servers with exploit prevention enabled
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DefenceHostCount Number of servers with exploit prevention enabled
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getDefenceHostCount() {
        return this.DefenceHostCount;
    }

    /**
     * Set Number of servers with exploit prevention enabled
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DefenceHostCount Number of servers with exploit prevention enabled
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDefenceHostCount(Long DefenceHostCount) {
        this.DefenceHostCount = DefenceHostCount;
    }

    /**
     * Get Number of attacks defended against
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DefendedCount Number of attacks defended against
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getDefendedCount() {
        return this.DefendedCount;
    }

    /**
     * Set Number of attacks defended against
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DefendedCount Number of attacks defended against
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDefendedCount(Long DefendedCount) {
        this.DefendedCount = DefendedCount;
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

    }
}

