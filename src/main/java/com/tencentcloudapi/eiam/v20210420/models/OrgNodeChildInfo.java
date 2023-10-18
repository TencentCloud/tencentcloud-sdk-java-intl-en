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
package com.tencentcloudapi.eiam.v20210420.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OrgNodeChildInfo extends AbstractModel {

    /**
    * Displayed organization node name, which can contain up to 64 characters and is the same as the organization name by default.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * Last modification time of the organization node in ISO 8601 format.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LastModifiedDate")
    @Expose
    private String LastModifiedDate;

    /**
    * External ID of the organization node, which is optional and customizable.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CustomizedOrgNodeId")
    @Expose
    private String CustomizedOrgNodeId;

    /**
    * Parent node ID of the current organization node.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ParentOrgNodeId")
    @Expose
    private String ParentOrgNodeId;

    /**
    * Organization node ID, which is globally unique.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OrgNodeId")
    @Expose
    private String OrgNodeId;

    /**
    * Data source.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DataSource")
    @Expose
    private String DataSource;

    /**
    * Organization node creation time in ISO 8601 format.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreatedDate")
    @Expose
    private String CreatedDate;

    /**
    * Organization node description.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get Displayed organization node name, which can contain up to 64 characters and is the same as the organization name by default.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return DisplayName Displayed organization node name, which can contain up to 64 characters and is the same as the organization name by default.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getDisplayName() {
        return this.DisplayName;
    }

    /**
     * Set Displayed organization node name, which can contain up to 64 characters and is the same as the organization name by default.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param DisplayName Displayed organization node name, which can contain up to 64 characters and is the same as the organization name by default.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    /**
     * Get Last modification time of the organization node in ISO 8601 format.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return LastModifiedDate Last modification time of the organization node in ISO 8601 format.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getLastModifiedDate() {
        return this.LastModifiedDate;
    }

    /**
     * Set Last modification time of the organization node in ISO 8601 format.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param LastModifiedDate Last modification time of the organization node in ISO 8601 format.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setLastModifiedDate(String LastModifiedDate) {
        this.LastModifiedDate = LastModifiedDate;
    }

    /**
     * Get External ID of the organization node, which is optional and customizable.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CustomizedOrgNodeId External ID of the organization node, which is optional and customizable.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getCustomizedOrgNodeId() {
        return this.CustomizedOrgNodeId;
    }

    /**
     * Set External ID of the organization node, which is optional and customizable.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CustomizedOrgNodeId External ID of the organization node, which is optional and customizable.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCustomizedOrgNodeId(String CustomizedOrgNodeId) {
        this.CustomizedOrgNodeId = CustomizedOrgNodeId;
    }

    /**
     * Get Parent node ID of the current organization node.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ParentOrgNodeId Parent node ID of the current organization node.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getParentOrgNodeId() {
        return this.ParentOrgNodeId;
    }

    /**
     * Set Parent node ID of the current organization node.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ParentOrgNodeId Parent node ID of the current organization node.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setParentOrgNodeId(String ParentOrgNodeId) {
        this.ParentOrgNodeId = ParentOrgNodeId;
    }

    /**
     * Get Organization node ID, which is globally unique.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return OrgNodeId Organization node ID, which is globally unique.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getOrgNodeId() {
        return this.OrgNodeId;
    }

    /**
     * Set Organization node ID, which is globally unique.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param OrgNodeId Organization node ID, which is globally unique.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setOrgNodeId(String OrgNodeId) {
        this.OrgNodeId = OrgNodeId;
    }

    /**
     * Get Data source.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return DataSource Data source.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getDataSource() {
        return this.DataSource;
    }

    /**
     * Set Data source.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param DataSource Data source.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDataSource(String DataSource) {
        this.DataSource = DataSource;
    }

    /**
     * Get Organization node creation time in ISO 8601 format.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CreatedDate Organization node creation time in ISO 8601 format.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getCreatedDate() {
        return this.CreatedDate;
    }

    /**
     * Set Organization node creation time in ISO 8601 format.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CreatedDate Organization node creation time in ISO 8601 format.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCreatedDate(String CreatedDate) {
        this.CreatedDate = CreatedDate;
    }

    /**
     * Get Organization node description.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Description Organization node description.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Organization node description.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Description Organization node description.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public OrgNodeChildInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OrgNodeChildInfo(OrgNodeChildInfo source) {
        if (source.DisplayName != null) {
            this.DisplayName = new String(source.DisplayName);
        }
        if (source.LastModifiedDate != null) {
            this.LastModifiedDate = new String(source.LastModifiedDate);
        }
        if (source.CustomizedOrgNodeId != null) {
            this.CustomizedOrgNodeId = new String(source.CustomizedOrgNodeId);
        }
        if (source.ParentOrgNodeId != null) {
            this.ParentOrgNodeId = new String(source.ParentOrgNodeId);
        }
        if (source.OrgNodeId != null) {
            this.OrgNodeId = new String(source.OrgNodeId);
        }
        if (source.DataSource != null) {
            this.DataSource = new String(source.DataSource);
        }
        if (source.CreatedDate != null) {
            this.CreatedDate = new String(source.CreatedDate);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);
        this.setParamSimple(map, prefix + "LastModifiedDate", this.LastModifiedDate);
        this.setParamSimple(map, prefix + "CustomizedOrgNodeId", this.CustomizedOrgNodeId);
        this.setParamSimple(map, prefix + "ParentOrgNodeId", this.ParentOrgNodeId);
        this.setParamSimple(map, prefix + "OrgNodeId", this.OrgNodeId);
        this.setParamSimple(map, prefix + "DataSource", this.DataSource);
        this.setParamSimple(map, prefix + "CreatedDate", this.CreatedDate);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

