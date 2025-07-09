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

public class FileTamperRuleInfo extends AbstractModel {

    /**
    * Rule name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Rule Type. 0: System Rule; 1: User Rule
    */
    @SerializedName("RuleCategory")
    @Expose
    private Long RuleCategory;

    /**
    * Number of affected hosts
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HostCount")
    @Expose
    private Long HostCount;

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
    * Rule ID, which is set to 0 for system rules
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Whether global 0: no; 1: yes
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
    * Number of write entries for the sub-rule
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WriteRuleCount")
    @Expose
    private Long WriteRuleCount;

    /**
    * Number of read entries for the sub-rule
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ReadRuleCount")
    @Expose
    private Long ReadRuleCount;

    /**
    * Number of read and write entries for the sub-rule
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ReadWriteRuleCount")
    @Expose
    private Long ReadWriteRuleCount;

    /**
    * Monitoring behavior
<li>read: read file</li>
<li>write: modify file</li>
<li>read-write: read and modify file</li>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FileAction")
    @Expose
    private String FileAction;

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
     * Get Rule Type. 0: System Rule; 1: User Rule 
     * @return RuleCategory Rule Type. 0: System Rule; 1: User Rule
     */
    public Long getRuleCategory() {
        return this.RuleCategory;
    }

    /**
     * Set Rule Type. 0: System Rule; 1: User Rule
     * @param RuleCategory Rule Type. 0: System Rule; 1: User Rule
     */
    public void setRuleCategory(Long RuleCategory) {
        this.RuleCategory = RuleCategory;
    }

    /**
     * Get Number of affected hosts
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HostCount Number of affected hosts
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getHostCount() {
        return this.HostCount;
    }

    /**
     * Set Number of affected hosts
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HostCount Number of affected hosts
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHostCount(Long HostCount) {
        this.HostCount = HostCount;
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
     * Get Rule ID, which is set to 0 for system rules 
     * @return Id Rule ID, which is set to 0 for system rules
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Rule ID, which is set to 0 for system rules
     * @param Id Rule ID, which is set to 0 for system rules
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Whether global 0: no; 1: yes 
     * @return IsGlobal Whether global 0: no; 1: yes
     */
    public Long getIsGlobal() {
        return this.IsGlobal;
    }

    /**
     * Set Whether global 0: no; 1: yes
     * @param IsGlobal Whether global 0: no; 1: yes
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
     * Get Number of write entries for the sub-rule
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return WriteRuleCount Number of write entries for the sub-rule
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getWriteRuleCount() {
        return this.WriteRuleCount;
    }

    /**
     * Set Number of write entries for the sub-rule
Note: This field may return null, indicating that no valid values can be obtained.
     * @param WriteRuleCount Number of write entries for the sub-rule
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWriteRuleCount(Long WriteRuleCount) {
        this.WriteRuleCount = WriteRuleCount;
    }

    /**
     * Get Number of read entries for the sub-rule
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ReadRuleCount Number of read entries for the sub-rule
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getReadRuleCount() {
        return this.ReadRuleCount;
    }

    /**
     * Set Number of read entries for the sub-rule
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ReadRuleCount Number of read entries for the sub-rule
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setReadRuleCount(Long ReadRuleCount) {
        this.ReadRuleCount = ReadRuleCount;
    }

    /**
     * Get Number of read and write entries for the sub-rule
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ReadWriteRuleCount Number of read and write entries for the sub-rule
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getReadWriteRuleCount() {
        return this.ReadWriteRuleCount;
    }

    /**
     * Set Number of read and write entries for the sub-rule
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ReadWriteRuleCount Number of read and write entries for the sub-rule
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setReadWriteRuleCount(Long ReadWriteRuleCount) {
        this.ReadWriteRuleCount = ReadWriteRuleCount;
    }

    /**
     * Get Monitoring behavior
<li>read: read file</li>
<li>write: modify file</li>
<li>read-write: read and modify file</li>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FileAction Monitoring behavior
<li>read: read file</li>
<li>write: modify file</li>
<li>read-write: read and modify file</li>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFileAction() {
        return this.FileAction;
    }

    /**
     * Set Monitoring behavior
<li>read: read file</li>
<li>write: modify file</li>
<li>read-write: read and modify file</li>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FileAction Monitoring behavior
<li>read: read file</li>
<li>write: modify file</li>
<li>read-write: read and modify file</li>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFileAction(String FileAction) {
        this.FileAction = FileAction;
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

    public FileTamperRuleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FileTamperRuleInfo(FileTamperRuleInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.RuleCategory != null) {
            this.RuleCategory = new Long(source.RuleCategory);
        }
        if (source.HostCount != null) {
            this.HostCount = new Long(source.HostCount);
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
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.IsGlobal != null) {
            this.IsGlobal = new Long(source.IsGlobal);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.WriteRuleCount != null) {
            this.WriteRuleCount = new Long(source.WriteRuleCount);
        }
        if (source.ReadRuleCount != null) {
            this.ReadRuleCount = new Long(source.ReadRuleCount);
        }
        if (source.ReadWriteRuleCount != null) {
            this.ReadWriteRuleCount = new Long(source.ReadWriteRuleCount);
        }
        if (source.FileAction != null) {
            this.FileAction = new String(source.FileAction);
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
        this.setParamSimple(map, prefix + "RuleCategory", this.RuleCategory);
        this.setParamSimple(map, prefix + "HostCount", this.HostCount);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "IsGlobal", this.IsGlobal);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "WriteRuleCount", this.WriteRuleCount);
        this.setParamSimple(map, prefix + "ReadRuleCount", this.ReadRuleCount);
        this.setParamSimple(map, prefix + "ReadWriteRuleCount", this.ReadWriteRuleCount);
        this.setParamSimple(map, prefix + "FileAction", this.FileAction);
        this.setParamSimple(map, prefix + "AddWhiteType", this.AddWhiteType);

    }
}

