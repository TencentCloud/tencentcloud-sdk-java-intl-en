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
package com.tencentcloudapi.eiam.v20210420.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeUserInfoResponse extends AbstractModel {

    /**
    * Username.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * User status. Valid values: NORMAL: normal; FREEZE: frozen; LOCKED: locked; NOT_ENABLED: disabled.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Nickname
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * User remarks.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * List of IDs of the user's user groups.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UserGroupIds")
    @Expose
    private String [] UserGroupIds;

    /**
    * User ID, which can contain up to 64 characters.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * User's email address.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * User's mobile number.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Phone")
    @Expose
    private String Phone;

    /**
    * Unique ID of the user's primary organization.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OrgNodeId")
    @Expose
    private String OrgNodeId;

    /**
    * Data source
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DataSource")
    @Expose
    private String DataSource;

    /**
    * User expiration time in ISO 8601 format.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExpirationTime")
    @Expose
    private String ExpirationTime;

    /**
    * User activation time in ISO 8601 format.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ActivationTime")
    @Expose
    private String ActivationTime;

    /**
    * Whether the password of the current user needs to be reset. `false` indicates no.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PwdNeedReset")
    @Expose
    private Boolean PwdNeedReset;

    /**
    * List of IDs of the user's secondary organizations.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SecondaryOrgNodeIdList")
    @Expose
    private String [] SecondaryOrgNodeIdList;

    /**
    * Whether the user is an admin. Valid values: 0: no; 1: yes.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AdminFlag")
    @Expose
    private Long AdminFlag;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Username.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return UserName Username.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set Username.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param UserName Username.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get User status. Valid values: NORMAL: normal; FREEZE: frozen; LOCKED: locked; NOT_ENABLED: disabled.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Status User status. Valid values: NORMAL: normal; FREEZE: frozen; LOCKED: locked; NOT_ENABLED: disabled.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set User status. Valid values: NORMAL: normal; FREEZE: frozen; LOCKED: locked; NOT_ENABLED: disabled.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Status User status. Valid values: NORMAL: normal; FREEZE: frozen; LOCKED: locked; NOT_ENABLED: disabled.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Nickname
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return DisplayName Nickname
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getDisplayName() {
        return this.DisplayName;
    }

    /**
     * Set Nickname
Note: this field may return null, indicating that no valid values can be obtained.
     * @param DisplayName Nickname
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    /**
     * Get User remarks.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Description User remarks.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set User remarks.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Description User remarks.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get List of IDs of the user's user groups.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return UserGroupIds List of IDs of the user's user groups.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String [] getUserGroupIds() {
        return this.UserGroupIds;
    }

    /**
     * Set List of IDs of the user's user groups.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param UserGroupIds List of IDs of the user's user groups.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setUserGroupIds(String [] UserGroupIds) {
        this.UserGroupIds = UserGroupIds;
    }

    /**
     * Get User ID, which can contain up to 64 characters.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return UserId User ID, which can contain up to 64 characters.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set User ID, which can contain up to 64 characters.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param UserId User ID, which can contain up to 64 characters.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get User's email address.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Email User's email address.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set User's email address.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Email User's email address.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * Get User's mobile number.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Phone User's mobile number.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getPhone() {
        return this.Phone;
    }

    /**
     * Set User's mobile number.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Phone User's mobile number.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    /**
     * Get Unique ID of the user's primary organization.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return OrgNodeId Unique ID of the user's primary organization.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getOrgNodeId() {
        return this.OrgNodeId;
    }

    /**
     * Set Unique ID of the user's primary organization.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param OrgNodeId Unique ID of the user's primary organization.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setOrgNodeId(String OrgNodeId) {
        this.OrgNodeId = OrgNodeId;
    }

    /**
     * Get Data source
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return DataSource Data source
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getDataSource() {
        return this.DataSource;
    }

    /**
     * Set Data source
Note: this field may return null, indicating that no valid values can be obtained.
     * @param DataSource Data source
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDataSource(String DataSource) {
        this.DataSource = DataSource;
    }

    /**
     * Get User expiration time in ISO 8601 format.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ExpirationTime User expiration time in ISO 8601 format.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getExpirationTime() {
        return this.ExpirationTime;
    }

    /**
     * Set User expiration time in ISO 8601 format.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ExpirationTime User expiration time in ISO 8601 format.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setExpirationTime(String ExpirationTime) {
        this.ExpirationTime = ExpirationTime;
    }

    /**
     * Get User activation time in ISO 8601 format.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ActivationTime User activation time in ISO 8601 format.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getActivationTime() {
        return this.ActivationTime;
    }

    /**
     * Set User activation time in ISO 8601 format.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ActivationTime User activation time in ISO 8601 format.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setActivationTime(String ActivationTime) {
        this.ActivationTime = ActivationTime;
    }

    /**
     * Get Whether the password of the current user needs to be reset. `false` indicates no.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return PwdNeedReset Whether the password of the current user needs to be reset. `false` indicates no.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getPwdNeedReset() {
        return this.PwdNeedReset;
    }

    /**
     * Set Whether the password of the current user needs to be reset. `false` indicates no.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param PwdNeedReset Whether the password of the current user needs to be reset. `false` indicates no.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setPwdNeedReset(Boolean PwdNeedReset) {
        this.PwdNeedReset = PwdNeedReset;
    }

    /**
     * Get List of IDs of the user's secondary organizations.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return SecondaryOrgNodeIdList List of IDs of the user's secondary organizations.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String [] getSecondaryOrgNodeIdList() {
        return this.SecondaryOrgNodeIdList;
    }

    /**
     * Set List of IDs of the user's secondary organizations.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param SecondaryOrgNodeIdList List of IDs of the user's secondary organizations.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setSecondaryOrgNodeIdList(String [] SecondaryOrgNodeIdList) {
        this.SecondaryOrgNodeIdList = SecondaryOrgNodeIdList;
    }

    /**
     * Get Whether the user is an admin. Valid values: 0: no; 1: yes.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return AdminFlag Whether the user is an admin. Valid values: 0: no; 1: yes.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getAdminFlag() {
        return this.AdminFlag;
    }

    /**
     * Set Whether the user is an admin. Valid values: 0: no; 1: yes.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param AdminFlag Whether the user is an admin. Valid values: 0: no; 1: yes.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setAdminFlag(Long AdminFlag) {
        this.AdminFlag = AdminFlag;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeUserInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUserInfoResponse(DescribeUserInfoResponse source) {
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.DisplayName != null) {
            this.DisplayName = new String(source.DisplayName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.UserGroupIds != null) {
            this.UserGroupIds = new String[source.UserGroupIds.length];
            for (int i = 0; i < source.UserGroupIds.length; i++) {
                this.UserGroupIds[i] = new String(source.UserGroupIds[i]);
            }
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.Email != null) {
            this.Email = new String(source.Email);
        }
        if (source.Phone != null) {
            this.Phone = new String(source.Phone);
        }
        if (source.OrgNodeId != null) {
            this.OrgNodeId = new String(source.OrgNodeId);
        }
        if (source.DataSource != null) {
            this.DataSource = new String(source.DataSource);
        }
        if (source.ExpirationTime != null) {
            this.ExpirationTime = new String(source.ExpirationTime);
        }
        if (source.ActivationTime != null) {
            this.ActivationTime = new String(source.ActivationTime);
        }
        if (source.PwdNeedReset != null) {
            this.PwdNeedReset = new Boolean(source.PwdNeedReset);
        }
        if (source.SecondaryOrgNodeIdList != null) {
            this.SecondaryOrgNodeIdList = new String[source.SecondaryOrgNodeIdList.length];
            for (int i = 0; i < source.SecondaryOrgNodeIdList.length; i++) {
                this.SecondaryOrgNodeIdList[i] = new String(source.SecondaryOrgNodeIdList[i]);
            }
        }
        if (source.AdminFlag != null) {
            this.AdminFlag = new Long(source.AdminFlag);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArraySimple(map, prefix + "UserGroupIds.", this.UserGroupIds);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "Phone", this.Phone);
        this.setParamSimple(map, prefix + "OrgNodeId", this.OrgNodeId);
        this.setParamSimple(map, prefix + "DataSource", this.DataSource);
        this.setParamSimple(map, prefix + "ExpirationTime", this.ExpirationTime);
        this.setParamSimple(map, prefix + "ActivationTime", this.ActivationTime);
        this.setParamSimple(map, prefix + "PwdNeedReset", this.PwdNeedReset);
        this.setParamArraySimple(map, prefix + "SecondaryOrgNodeIdList.", this.SecondaryOrgNodeIdList);
        this.setParamSimple(map, prefix + "AdminFlag", this.AdminFlag);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

