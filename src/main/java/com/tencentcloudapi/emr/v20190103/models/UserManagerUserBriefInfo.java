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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserManagerUserBriefInfo extends AbstractModel {

    /**
    * <p>Username.</p>
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * <p>Group to which the user belongs.</p>
    */
    @SerializedName("UserGroup")
    @Expose
    private String UserGroup;

    /**
    * <p>Manager indicates an administrator, and NormalUser indicates a regular user.</p>
    */
    @SerializedName("UserType")
    @Expose
    private String UserType;

    /**
    * <p>User creation time.</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>Whether to download the keytab file of the corresponding user. This is only meaningful for clusters with Kerberos enabled.</p>
    */
    @SerializedName("SupportDownLoadKeyTab")
    @Expose
    private Boolean SupportDownLoadKeyTab;

    /**
    * <p>Download URL of the keytab file.</p>
    */
    @SerializedName("DownLoadKeyTabUrl")
    @Expose
    private String DownLoadKeyTabUrl;

    /**
    * <p>User group.</p>
    */
    @SerializedName("Groups")
    @Expose
    private String [] Groups;

    /**
    * <p>Customer UIN.</p>
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * <p>User status.</p>
    */
    @SerializedName("State")
    @Expose
    private Long State;

    /**
    * <p>Whether to display the password update time.</p>
    */
    @SerializedName("DisplayPasswdUpdateTime")
    @Expose
    private Boolean DisplayPasswdUpdateTime;

    /**
    * <p>Latest password update time.</p>
    */
    @SerializedName("PasswdUpdateTime")
    @Expose
    private String PasswdUpdateTime;

    /**
    * <p>Number of days used.</p><p>Unit: days.</p>
    */
    @SerializedName("PasswdUsedDay")
    @Expose
    private Long PasswdUsedDay;

    /**
    * <p>Number of hours used.</p><p>Unit: hours.</p>
    */
    @SerializedName("PasswdUsedHour")
    @Expose
    private Long PasswdUsedHour;

    /**
     * Get <p>Username.</p> 
     * @return UserName <p>Username.</p>
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set <p>Username.</p>
     * @param UserName <p>Username.</p>
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get <p>Group to which the user belongs.</p> 
     * @return UserGroup <p>Group to which the user belongs.</p>
     */
    public String getUserGroup() {
        return this.UserGroup;
    }

    /**
     * Set <p>Group to which the user belongs.</p>
     * @param UserGroup <p>Group to which the user belongs.</p>
     */
    public void setUserGroup(String UserGroup) {
        this.UserGroup = UserGroup;
    }

    /**
     * Get <p>Manager indicates an administrator, and NormalUser indicates a regular user.</p> 
     * @return UserType <p>Manager indicates an administrator, and NormalUser indicates a regular user.</p>
     */
    public String getUserType() {
        return this.UserType;
    }

    /**
     * Set <p>Manager indicates an administrator, and NormalUser indicates a regular user.</p>
     * @param UserType <p>Manager indicates an administrator, and NormalUser indicates a regular user.</p>
     */
    public void setUserType(String UserType) {
        this.UserType = UserType;
    }

    /**
     * Get <p>User creation time.</p> 
     * @return CreateTime <p>User creation time.</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>User creation time.</p>
     * @param CreateTime <p>User creation time.</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>Whether to download the keytab file of the corresponding user. This is only meaningful for clusters with Kerberos enabled.</p> 
     * @return SupportDownLoadKeyTab <p>Whether to download the keytab file of the corresponding user. This is only meaningful for clusters with Kerberos enabled.</p>
     */
    public Boolean getSupportDownLoadKeyTab() {
        return this.SupportDownLoadKeyTab;
    }

    /**
     * Set <p>Whether to download the keytab file of the corresponding user. This is only meaningful for clusters with Kerberos enabled.</p>
     * @param SupportDownLoadKeyTab <p>Whether to download the keytab file of the corresponding user. This is only meaningful for clusters with Kerberos enabled.</p>
     */
    public void setSupportDownLoadKeyTab(Boolean SupportDownLoadKeyTab) {
        this.SupportDownLoadKeyTab = SupportDownLoadKeyTab;
    }

    /**
     * Get <p>Download URL of the keytab file.</p> 
     * @return DownLoadKeyTabUrl <p>Download URL of the keytab file.</p>
     */
    public String getDownLoadKeyTabUrl() {
        return this.DownLoadKeyTabUrl;
    }

    /**
     * Set <p>Download URL of the keytab file.</p>
     * @param DownLoadKeyTabUrl <p>Download URL of the keytab file.</p>
     */
    public void setDownLoadKeyTabUrl(String DownLoadKeyTabUrl) {
        this.DownLoadKeyTabUrl = DownLoadKeyTabUrl;
    }

    /**
     * Get <p>User group.</p> 
     * @return Groups <p>User group.</p>
     */
    public String [] getGroups() {
        return this.Groups;
    }

    /**
     * Set <p>User group.</p>
     * @param Groups <p>User group.</p>
     */
    public void setGroups(String [] Groups) {
        this.Groups = Groups;
    }

    /**
     * Get <p>Customer UIN.</p> 
     * @return Uin <p>Customer UIN.</p>
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set <p>Customer UIN.</p>
     * @param Uin <p>Customer UIN.</p>
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get <p>User status.</p> 
     * @return State <p>User status.</p>
     */
    public Long getState() {
        return this.State;
    }

    /**
     * Set <p>User status.</p>
     * @param State <p>User status.</p>
     */
    public void setState(Long State) {
        this.State = State;
    }

    /**
     * Get <p>Whether to display the password update time.</p> 
     * @return DisplayPasswdUpdateTime <p>Whether to display the password update time.</p>
     */
    public Boolean getDisplayPasswdUpdateTime() {
        return this.DisplayPasswdUpdateTime;
    }

    /**
     * Set <p>Whether to display the password update time.</p>
     * @param DisplayPasswdUpdateTime <p>Whether to display the password update time.</p>
     */
    public void setDisplayPasswdUpdateTime(Boolean DisplayPasswdUpdateTime) {
        this.DisplayPasswdUpdateTime = DisplayPasswdUpdateTime;
    }

    /**
     * Get <p>Latest password update time.</p> 
     * @return PasswdUpdateTime <p>Latest password update time.</p>
     */
    public String getPasswdUpdateTime() {
        return this.PasswdUpdateTime;
    }

    /**
     * Set <p>Latest password update time.</p>
     * @param PasswdUpdateTime <p>Latest password update time.</p>
     */
    public void setPasswdUpdateTime(String PasswdUpdateTime) {
        this.PasswdUpdateTime = PasswdUpdateTime;
    }

    /**
     * Get <p>Number of days used.</p><p>Unit: days.</p> 
     * @return PasswdUsedDay <p>Number of days used.</p><p>Unit: days.</p>
     */
    public Long getPasswdUsedDay() {
        return this.PasswdUsedDay;
    }

    /**
     * Set <p>Number of days used.</p><p>Unit: days.</p>
     * @param PasswdUsedDay <p>Number of days used.</p><p>Unit: days.</p>
     */
    public void setPasswdUsedDay(Long PasswdUsedDay) {
        this.PasswdUsedDay = PasswdUsedDay;
    }

    /**
     * Get <p>Number of hours used.</p><p>Unit: hours.</p> 
     * @return PasswdUsedHour <p>Number of hours used.</p><p>Unit: hours.</p>
     */
    public Long getPasswdUsedHour() {
        return this.PasswdUsedHour;
    }

    /**
     * Set <p>Number of hours used.</p><p>Unit: hours.</p>
     * @param PasswdUsedHour <p>Number of hours used.</p><p>Unit: hours.</p>
     */
    public void setPasswdUsedHour(Long PasswdUsedHour) {
        this.PasswdUsedHour = PasswdUsedHour;
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
        if (source.Groups != null) {
            this.Groups = new String[source.Groups.length];
            for (int i = 0; i < source.Groups.length; i++) {
                this.Groups[i] = new String(source.Groups[i]);
            }
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.State != null) {
            this.State = new Long(source.State);
        }
        if (source.DisplayPasswdUpdateTime != null) {
            this.DisplayPasswdUpdateTime = new Boolean(source.DisplayPasswdUpdateTime);
        }
        if (source.PasswdUpdateTime != null) {
            this.PasswdUpdateTime = new String(source.PasswdUpdateTime);
        }
        if (source.PasswdUsedDay != null) {
            this.PasswdUsedDay = new Long(source.PasswdUsedDay);
        }
        if (source.PasswdUsedHour != null) {
            this.PasswdUsedHour = new Long(source.PasswdUsedHour);
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
        this.setParamArraySimple(map, prefix + "Groups.", this.Groups);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "DisplayPasswdUpdateTime", this.DisplayPasswdUpdateTime);
        this.setParamSimple(map, prefix + "PasswdUpdateTime", this.PasswdUpdateTime);
        this.setParamSimple(map, prefix + "PasswdUsedDay", this.PasswdUsedDay);
        this.setParamSimple(map, prefix + "PasswdUsedHour", this.PasswdUsedHour);

    }
}

