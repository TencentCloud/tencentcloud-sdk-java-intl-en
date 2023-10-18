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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserManagerUserBriefInfo extends AbstractModel {

    /**
    * Username
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * The group to which the user belongs
    */
    @SerializedName("UserGroup")
    @Expose
    private String UserGroup;

    /**
    * `Manager` represents an admin, and `NormalUser` represents a general user.
    */
    @SerializedName("UserType")
    @Expose
    private String UserType;

    /**
    * Account creation time
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Whether the corresponding Keytab file of the user is available for download. This parameter applies only to a Kerberos-enabled cluster.
    */
    @SerializedName("SupportDownLoadKeyTab")
    @Expose
    private Boolean SupportDownLoadKeyTab;

    /**
    * Download link of the Keytab file
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DownLoadKeyTabUrl")
    @Expose
    private String DownLoadKeyTabUrl;

    /**
     * Get Username 
     * @return UserName Username
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set Username
     * @param UserName Username
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get The group to which the user belongs 
     * @return UserGroup The group to which the user belongs
     */
    public String getUserGroup() {
        return this.UserGroup;
    }

    /**
     * Set The group to which the user belongs
     * @param UserGroup The group to which the user belongs
     */
    public void setUserGroup(String UserGroup) {
        this.UserGroup = UserGroup;
    }

    /**
     * Get `Manager` represents an admin, and `NormalUser` represents a general user. 
     * @return UserType `Manager` represents an admin, and `NormalUser` represents a general user.
     */
    public String getUserType() {
        return this.UserType;
    }

    /**
     * Set `Manager` represents an admin, and `NormalUser` represents a general user.
     * @param UserType `Manager` represents an admin, and `NormalUser` represents a general user.
     */
    public void setUserType(String UserType) {
        this.UserType = UserType;
    }

    /**
     * Get Account creation time
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return CreateTime Account creation time
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Account creation time
Note: This field may return null, indicating that no valid value can be obtained.
     * @param CreateTime Account creation time
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Whether the corresponding Keytab file of the user is available for download. This parameter applies only to a Kerberos-enabled cluster. 
     * @return SupportDownLoadKeyTab Whether the corresponding Keytab file of the user is available for download. This parameter applies only to a Kerberos-enabled cluster.
     */
    public Boolean getSupportDownLoadKeyTab() {
        return this.SupportDownLoadKeyTab;
    }

    /**
     * Set Whether the corresponding Keytab file of the user is available for download. This parameter applies only to a Kerberos-enabled cluster.
     * @param SupportDownLoadKeyTab Whether the corresponding Keytab file of the user is available for download. This parameter applies only to a Kerberos-enabled cluster.
     */
    public void setSupportDownLoadKeyTab(Boolean SupportDownLoadKeyTab) {
        this.SupportDownLoadKeyTab = SupportDownLoadKeyTab;
    }

    /**
     * Get Download link of the Keytab file
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return DownLoadKeyTabUrl Download link of the Keytab file
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getDownLoadKeyTabUrl() {
        return this.DownLoadKeyTabUrl;
    }

    /**
     * Set Download link of the Keytab file
Note: This field may return null, indicating that no valid value can be obtained.
     * @param DownLoadKeyTabUrl Download link of the Keytab file
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDownLoadKeyTabUrl(String DownLoadKeyTabUrl) {
        this.DownLoadKeyTabUrl = DownLoadKeyTabUrl;
    }

    public UserManagerUserBriefInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserManagerUserBriefInfo(UserManagerUserBriefInfo source) {
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.UserGroup != null) {
            this.UserGroup = new String(source.UserGroup);
        }
        if (source.UserType != null) {
            this.UserType = new String(source.UserType);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.SupportDownLoadKeyTab != null) {
            this.SupportDownLoadKeyTab = new Boolean(source.SupportDownLoadKeyTab);
        }
        if (source.DownLoadKeyTabUrl != null) {
            this.DownLoadKeyTabUrl = new String(source.DownLoadKeyTabUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "UserGroup", this.UserGroup);
        this.setParamSimple(map, prefix + "UserType", this.UserType);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "SupportDownLoadKeyTab", this.SupportDownLoadKeyTab);
        this.setParamSimple(map, prefix + "DownLoadKeyTabUrl", this.DownLoadKeyTabUrl);

    }
}

