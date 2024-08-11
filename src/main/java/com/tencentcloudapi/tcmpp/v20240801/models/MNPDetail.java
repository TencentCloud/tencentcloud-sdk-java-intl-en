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
package com.tencentcloudapi.tcmpp.v20240801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MNPDetail extends AbstractModel {

    /**
    * Mini program type 
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MNPType")
    @Expose
    private String MNPType;

    /**
    * Mini program ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MNPId")
    @Expose
    private String MNPId;

    /**
    * Mini program name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MNPName")
    @Expose
    private String MNPName;

    /**
    * Mini program icon
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MNPIcon")
    @Expose
    private String MNPIcon;

    /**
    * Mini program introduction
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MNPIntro")
    @Expose
    private String MNPIntro;

    /**
    * Mini program description
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MNPDesc")
    @Expose
    private String MNPDesc;

    /**
    * Creator account
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateUser")
    @Expose
    private String CreateUser;

    /**
    * Creation time, timestamp
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * Online Status 0 Not Online, 1 Online
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OnlineStatus")
    @Expose
    private Long OnlineStatus;

    /**
    * Application information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Applications")
    @Expose
    private ApplicationSimpleInfo [] Applications;

    /**
    * Mini program tag
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * Mini program status 1-Released 2-Removed
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get Mini program type 
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MNPType Mini program type 
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMNPType() {
        return this.MNPType;
    }

    /**
     * Set Mini program type 
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MNPType Mini program type 
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMNPType(String MNPType) {
        this.MNPType = MNPType;
    }

    /**
     * Get Mini program ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MNPId Mini program ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMNPId() {
        return this.MNPId;
    }

    /**
     * Set Mini program ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MNPId Mini program ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMNPId(String MNPId) {
        this.MNPId = MNPId;
    }

    /**
     * Get Mini program name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MNPName Mini program name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMNPName() {
        return this.MNPName;
    }

    /**
     * Set Mini program name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MNPName Mini program name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMNPName(String MNPName) {
        this.MNPName = MNPName;
    }

    /**
     * Get Mini program icon
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MNPIcon Mini program icon
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMNPIcon() {
        return this.MNPIcon;
    }

    /**
     * Set Mini program icon
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MNPIcon Mini program icon
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMNPIcon(String MNPIcon) {
        this.MNPIcon = MNPIcon;
    }

    /**
     * Get Mini program introduction
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MNPIntro Mini program introduction
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMNPIntro() {
        return this.MNPIntro;
    }

    /**
     * Set Mini program introduction
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MNPIntro Mini program introduction
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMNPIntro(String MNPIntro) {
        this.MNPIntro = MNPIntro;
    }

    /**
     * Get Mini program description
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MNPDesc Mini program description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMNPDesc() {
        return this.MNPDesc;
    }

    /**
     * Set Mini program description
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MNPDesc Mini program description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMNPDesc(String MNPDesc) {
        this.MNPDesc = MNPDesc;
    }

    /**
     * Get Creator account
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreateUser Creator account
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreateUser() {
        return this.CreateUser;
    }

    /**
     * Set Creator account
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreateUser Creator account
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateUser(String CreateUser) {
        this.CreateUser = CreateUser;
    }

    /**
     * Get Creation time, timestamp
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreateTime Creation time, timestamp
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time, timestamp
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreateTime Creation time, timestamp
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Online Status 0 Not Online, 1 Online
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OnlineStatus Online Status 0 Not Online, 1 Online
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getOnlineStatus() {
        return this.OnlineStatus;
    }

    /**
     * Set Online Status 0 Not Online, 1 Online
Note: This field may return null, indicating that no valid values can be obtained.
     * @param OnlineStatus Online Status 0 Not Online, 1 Online
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOnlineStatus(Long OnlineStatus) {
        this.OnlineStatus = OnlineStatus;
    }

    /**
     * Get Application information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Applications Application information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ApplicationSimpleInfo [] getApplications() {
        return this.Applications;
    }

    /**
     * Set Application information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Applications Application information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setApplications(ApplicationSimpleInfo [] Applications) {
        this.Applications = Applications;
    }

    /**
     * Get Mini program tag
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Tags Mini program tag
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set Mini program tag
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Tags Mini program tag
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Mini program status 1-Released 2-Removed
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Status Mini program status 1-Released 2-Removed
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Mini program status 1-Released 2-Removed
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Status Mini program status 1-Released 2-Removed
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public MNPDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MNPDetail(MNPDetail source) {
        if (source.MNPType != null) {
            this.MNPType = new String(source.MNPType);
        }
        if (source.MNPId != null) {
            this.MNPId = new String(source.MNPId);
        }
        if (source.MNPName != null) {
            this.MNPName = new String(source.MNPName);
        }
        if (source.MNPIcon != null) {
            this.MNPIcon = new String(source.MNPIcon);
        }
        if (source.MNPIntro != null) {
            this.MNPIntro = new String(source.MNPIntro);
        }
        if (source.MNPDesc != null) {
            this.MNPDesc = new String(source.MNPDesc);
        }
        if (source.CreateUser != null) {
            this.CreateUser = new String(source.CreateUser);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.OnlineStatus != null) {
            this.OnlineStatus = new Long(source.OnlineStatus);
        }
        if (source.Applications != null) {
            this.Applications = new ApplicationSimpleInfo[source.Applications.length];
            for (int i = 0; i < source.Applications.length; i++) {
                this.Applications[i] = new ApplicationSimpleInfo(source.Applications[i]);
            }
        }
        if (source.Tags != null) {
            this.Tags = new String[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new String(source.Tags[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MNPType", this.MNPType);
        this.setParamSimple(map, prefix + "MNPId", this.MNPId);
        this.setParamSimple(map, prefix + "MNPName", this.MNPName);
        this.setParamSimple(map, prefix + "MNPIcon", this.MNPIcon);
        this.setParamSimple(map, prefix + "MNPIntro", this.MNPIntro);
        this.setParamSimple(map, prefix + "MNPDesc", this.MNPDesc);
        this.setParamSimple(map, prefix + "CreateUser", this.CreateUser);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "OnlineStatus", this.OnlineStatus);
        this.setParamArrayObj(map, prefix + "Applications.", this.Applications);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

