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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FileTamperRuleDetail extends AbstractModel {

    /**
    * Rule name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Update time
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * Creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Status. 0: Enabled; 1: Disabled
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Rule
    */
    @SerializedName("Rule")
    @Expose
    private FileTamperRule [] Rule;

    /**
    * Effective Host UUID. Empty means all hosts, and returned number of entries can be controlled through parameters.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Uuids")
    @Expose
    private String [] Uuids;

    /**
    * Rule ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Global Rule or Not (No by Default). 0: No; 1: Yes
    */
    @SerializedName("IsGlobal")
    @Expose
    private Long IsGlobal;

    /**
    * Risk Level. 0: None; 1: High-Risk; 2: Medium-Risk; 3: Low-Risk
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * Total Number of Effective Hosts
    */
    @SerializedName("UuidTotalCount")
    @Expose
    private Long UuidTotalCount;

    /**
    * Allowlisted processing type
<li>cur: add the current items to the allowlist</li>
<li>all: add all items that meet the conditions to the allowlist</li>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AddWhiteType")
    @Expose
    private String AddWhiteType;

    /**
     * Get Rule name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Name Rule name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Rule name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Name Rule name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Update time 
     * @return ModifyTime Update time
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set Update time
     * @param ModifyTime Update time
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get Creation time 
     * @return CreateTime Creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time
     * @param CreateTime Creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Status. 0: Enabled; 1: Disabled 
     * @return Status Status. 0: Enabled; 1: Disabled
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Status. 0: Enabled; 1: Disabled
     * @param Status Status. 0: Enabled; 1: Disabled
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Rule 
     * @return Rule Rule
     */
    public FileTamperRule [] getRule() {
        return this.Rule;
    }

    /**
     * Set Rule
     * @param Rule Rule
     */
    public void setRule(FileTamperRule [] Rule) {
        this.Rule = Rule;
    }

    /**
     * Get Effective Host UUID. Empty means all hosts, and returned number of entries can be controlled through parameters.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Uuids Effective Host UUID. Empty means all hosts, and returned number of entries can be controlled through parameters.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getUuids() {
        return this.Uuids;
    }

    /**
     * Set Effective Host UUID. Empty means all hosts, and returned number of entries can be controlled through parameters.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Uuids Effective Host UUID. Empty means all hosts, and returned number of entries can be controlled through parameters.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUuids(String [] Uuids) {
        this.Uuids = Uuids;
    }

    /**
     * Get Rule ID 
     * @return Id Rule ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Rule ID
     * @param Id Rule ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Global Rule or Not (No by Default). 0: No; 1: Yes 
     * @return IsGlobal Global Rule or Not (No by Default). 0: No; 1: Yes
     */
    public Long getIsGlobal() {
        return this.IsGlobal;
    }

    /**
     * Set Global Rule or Not (No by Default). 0: No; 1: Yes
     * @param IsGlobal Global Rule or Not (No by Default). 0: No; 1: Yes
     */
    public void setIsGlobal(Long IsGlobal) {
        this.IsGlobal = IsGlobal;
    }

    /**
     * Get Risk Level. 0: None; 1: High-Risk; 2: Medium-Risk; 3: Low-Risk 
     * @return Level Risk Level. 0: None; 1: High-Risk; 2: Medium-Risk; 3: Low-Risk
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set Risk Level. 0: None; 1: High-Risk; 2: Medium-Risk; 3: Low-Risk
     * @param Level Risk Level. 0: None; 1: High-Risk; 2: Medium-Risk; 3: Low-Risk
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get Total Number of Effective Hosts 
     * @return UuidTotalCount Total Number of Effective Hosts
     */
    public Long getUuidTotalCount() {
        return this.UuidTotalCount;
    }

    /**
     * Set Total Number of Effective Hosts
     * @param UuidTotalCount Total Number of Effective Hosts
     */
    public void setUuidTotalCount(Long UuidTotalCount) {
        this.UuidTotalCount = UuidTotalCount;
    }

    /**
     * Get Allowlisted processing type
<li>cur: add the current items to the allowlist</li>
<li>all: add all items that meet the conditions to the allowlist</li>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AddWhiteType Allowlisted processing type
<li>cur: add the current items to the allowlist</li>
<li>all: add all items that meet the conditions to the allowlist</li>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAddWhiteType() {
        return this.AddWhiteType;
    }

    /**
     * Set Allowlisted processing type
<li>cur: add the current items to the allowlist</li>
<li>all: add all items that meet the conditions to the allowlist</li>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AddWhiteType Allowlisted processing type
<li>cur: add the current items to the allowlist</li>
<li>all: add all items that meet the conditions to the allowlist</li>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAddWhiteType(String AddWhiteType) {
        this.AddWhiteType = AddWhiteType;
    }

    public FileTamperRuleDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FileTamperRuleDetail(FileTamperRuleDetail source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Rule != null) {
            this.Rule = new FileTamperRule[source.Rule.length];
            for (int i = 0; i < source.Rule.length; i++) {
                this.Rule[i] = new FileTamperRule(source.Rule[i]);
            }
        }
        if (source.Uuids != null) {
            this.Uuids = new String[source.Uuids.length];
            for (int i = 0; i < source.Uuids.length; i++) {
                this.Uuids[i] = new String(source.Uuids[i]);
            }
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.IsGlobal != null) {
            this.IsGlobal = new Long(source.IsGlobal);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.UuidTotalCount != null) {
            this.UuidTotalCount = new Long(source.UuidTotalCount);
        }
        if (source.AddWhiteType != null) {
            this.AddWhiteType = new String(source.AddWhiteType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "Rule.", this.Rule);
        this.setParamArraySimple(map, prefix + "Uuids.", this.Uuids);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "IsGlobal", this.IsGlobal);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "UuidTotalCount", this.UuidTotalCount);
        this.setParamSimple(map, prefix + "AddWhiteType", this.AddWhiteType);

    }
}

