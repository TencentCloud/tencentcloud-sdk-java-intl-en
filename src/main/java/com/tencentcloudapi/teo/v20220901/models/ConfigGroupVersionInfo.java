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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConfigGroupVersionInfo extends AbstractModel {

    /**
    * Version ID.
    */
    @SerializedName("VersionId")
    @Expose
    private String VersionId;

    /**
    * Version No.
    */
    @SerializedName("VersionNumber")
    @Expose
    private String VersionNumber;

    /**
    * Configuraration group ID.
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * Configuration group type. Valid values: 
<li>l7_acceleration: L7 acceleration configuration group. </li>
<li>edge_functions: Edge function configuration group. </li>
    */
    @SerializedName("GroupType")
    @Expose
    private String GroupType;

    /**
    * Version description.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Version status. Valid values: 
<li>creating: Being created.</li>
<li>inactive: Not effective.</li>
<li>active: Effective. </li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Version creation time. The time format follows the ISO 8601 standard and is represented in Coordinated Universal Time (UTC).
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get Version ID. 
     * @return VersionId Version ID.
     */
    public String getVersionId() {
        return this.VersionId;
    }

    /**
     * Set Version ID.
     * @param VersionId Version ID.
     */
    public void setVersionId(String VersionId) {
        this.VersionId = VersionId;
    }

    /**
     * Get Version No. 
     * @return VersionNumber Version No.
     */
    public String getVersionNumber() {
        return this.VersionNumber;
    }

    /**
     * Set Version No.
     * @param VersionNumber Version No.
     */
    public void setVersionNumber(String VersionNumber) {
        this.VersionNumber = VersionNumber;
    }

    /**
     * Get Configuraration group ID. 
     * @return GroupId Configuraration group ID.
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set Configuraration group ID.
     * @param GroupId Configuraration group ID.
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get Configuration group type. Valid values: 
<li>l7_acceleration: L7 acceleration configuration group. </li>
<li>edge_functions: Edge function configuration group. </li> 
     * @return GroupType Configuration group type. Valid values: 
<li>l7_acceleration: L7 acceleration configuration group. </li>
<li>edge_functions: Edge function configuration group. </li>
     */
    public String getGroupType() {
        return this.GroupType;
    }

    /**
     * Set Configuration group type. Valid values: 
<li>l7_acceleration: L7 acceleration configuration group. </li>
<li>edge_functions: Edge function configuration group. </li>
     * @param GroupType Configuration group type. Valid values: 
<li>l7_acceleration: L7 acceleration configuration group. </li>
<li>edge_functions: Edge function configuration group. </li>
     */
    public void setGroupType(String GroupType) {
        this.GroupType = GroupType;
    }

    /**
     * Get Version description. 
     * @return Description Version description.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Version description.
     * @param Description Version description.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Version status. Valid values: 
<li>creating: Being created.</li>
<li>inactive: Not effective.</li>
<li>active: Effective. </li> 
     * @return Status Version status. Valid values: 
<li>creating: Being created.</li>
<li>inactive: Not effective.</li>
<li>active: Effective. </li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Version status. Valid values: 
<li>creating: Being created.</li>
<li>inactive: Not effective.</li>
<li>active: Effective. </li>
     * @param Status Version status. Valid values: 
<li>creating: Being created.</li>
<li>inactive: Not effective.</li>
<li>active: Effective. </li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Version creation time. The time format follows the ISO 8601 standard and is represented in Coordinated Universal Time (UTC). 
     * @return CreateTime Version creation time. The time format follows the ISO 8601 standard and is represented in Coordinated Universal Time (UTC).
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Version creation time. The time format follows the ISO 8601 standard and is represented in Coordinated Universal Time (UTC).
     * @param CreateTime Version creation time. The time format follows the ISO 8601 standard and is represented in Coordinated Universal Time (UTC).
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    public ConfigGroupVersionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConfigGroupVersionInfo(ConfigGroupVersionInfo source) {
        if (source.VersionId != null) {
            this.VersionId = new String(source.VersionId);
        }
        if (source.VersionNumber != null) {
            this.VersionNumber = new String(source.VersionNumber);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.GroupType != null) {
            this.GroupType = new String(source.GroupType);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VersionId", this.VersionId);
        this.setParamSimple(map, prefix + "VersionNumber", this.VersionNumber);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupType", this.GroupType);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

