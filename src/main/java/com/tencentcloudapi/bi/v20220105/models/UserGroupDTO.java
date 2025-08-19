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
package com.tencentcloudapi.bi.v20220105.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserGroupDTO extends AbstractModel {

    /**
    * id
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * User group name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * Parent node ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ParentId")
    @Expose
    private Long ParentId;

    /**
    * Whether it is default.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsDefault")
    @Expose
    private Long IsDefault;

    /**
    * Administrator user ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AdminUserId")
    @Expose
    private String AdminUserId;

    /**
    * Description.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Location.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Location")
    @Expose
    private Long Location;

    /**
     * Get id
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Id id
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set id
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Id id
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get User group name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return GroupName User group name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set User group name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param GroupName User group name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get Parent node ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ParentId Parent node ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getParentId() {
        return this.ParentId;
    }

    /**
     * Set Parent node ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ParentId Parent node ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setParentId(Long ParentId) {
        this.ParentId = ParentId;
    }

    /**
     * Get Whether it is default.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsDefault Whether it is default.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getIsDefault() {
        return this.IsDefault;
    }

    /**
     * Set Whether it is default.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsDefault Whether it is default.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsDefault(Long IsDefault) {
        this.IsDefault = IsDefault;
    }

    /**
     * Get Administrator user ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AdminUserId Administrator user ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAdminUserId() {
        return this.AdminUserId;
    }

    /**
     * Set Administrator user ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AdminUserId Administrator user ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAdminUserId(String AdminUserId) {
        this.AdminUserId = AdminUserId;
    }

    /**
     * Get Description.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Description Description.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Description.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Description Description.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Location.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Location Location.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getLocation() {
        return this.Location;
    }

    /**
     * Set Location.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Location Location.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLocation(Long Location) {
        this.Location = Location;
    }

    public UserGroupDTO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserGroupDTO(UserGroupDTO source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.ParentId != null) {
            this.ParentId = new Long(source.ParentId);
        }
        if (source.IsDefault != null) {
            this.IsDefault = new Long(source.IsDefault);
        }
        if (source.AdminUserId != null) {
            this.AdminUserId = new String(source.AdminUserId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Location != null) {
            this.Location = new Long(source.Location);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "ParentId", this.ParentId);
        this.setParamSimple(map, prefix + "IsDefault", this.IsDefault);
        this.setParamSimple(map, prefix + "AdminUserId", this.AdminUserId);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Location", this.Location);

    }
}

