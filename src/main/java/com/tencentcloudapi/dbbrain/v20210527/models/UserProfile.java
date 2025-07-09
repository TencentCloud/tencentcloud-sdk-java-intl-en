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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserProfile extends AbstractModel {

    /**
    * Configured ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProfileId")
    @Expose
    private String ProfileId;

    /**
    * Configuration type. Valid values: `dbScan_mail_configuration` (email configuration of the database inspection report), `scheduler_mail_configuration` (email configuration of the scheduled task report).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProfileType")
    @Expose
    private String ProfileType;

    /**
    * Configuration level. Valid values: `User` (user-level), `Instance` (instance-level). For database inspection emails, it should be `User`. For scheduled task emails, it should be `Instance`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProfileLevel")
    @Expose
    private String ProfileLevel;

    /**
    * Configuration name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProfileName")
    @Expose
    private String ProfileName;

    /**
    * Configuration details.
    */
    @SerializedName("ProfileInfo")
    @Expose
    private ProfileInfo ProfileInfo;

    /**
     * Get Configured ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProfileId Configured ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProfileId() {
        return this.ProfileId;
    }

    /**
     * Set Configured ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProfileId Configured ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProfileId(String ProfileId) {
        this.ProfileId = ProfileId;
    }

    /**
     * Get Configuration type. Valid values: `dbScan_mail_configuration` (email configuration of the database inspection report), `scheduler_mail_configuration` (email configuration of the scheduled task report).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProfileType Configuration type. Valid values: `dbScan_mail_configuration` (email configuration of the database inspection report), `scheduler_mail_configuration` (email configuration of the scheduled task report).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProfileType() {
        return this.ProfileType;
    }

    /**
     * Set Configuration type. Valid values: `dbScan_mail_configuration` (email configuration of the database inspection report), `scheduler_mail_configuration` (email configuration of the scheduled task report).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProfileType Configuration type. Valid values: `dbScan_mail_configuration` (email configuration of the database inspection report), `scheduler_mail_configuration` (email configuration of the scheduled task report).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProfileType(String ProfileType) {
        this.ProfileType = ProfileType;
    }

    /**
     * Get Configuration level. Valid values: `User` (user-level), `Instance` (instance-level). For database inspection emails, it should be `User`. For scheduled task emails, it should be `Instance`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProfileLevel Configuration level. Valid values: `User` (user-level), `Instance` (instance-level). For database inspection emails, it should be `User`. For scheduled task emails, it should be `Instance`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProfileLevel() {
        return this.ProfileLevel;
    }

    /**
     * Set Configuration level. Valid values: `User` (user-level), `Instance` (instance-level). For database inspection emails, it should be `User`. For scheduled task emails, it should be `Instance`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProfileLevel Configuration level. Valid values: `User` (user-level), `Instance` (instance-level). For database inspection emails, it should be `User`. For scheduled task emails, it should be `Instance`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProfileLevel(String ProfileLevel) {
        this.ProfileLevel = ProfileLevel;
    }

    /**
     * Get Configuration name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProfileName Configuration name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProfileName() {
        return this.ProfileName;
    }

    /**
     * Set Configuration name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProfileName Configuration name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProfileName(String ProfileName) {
        this.ProfileName = ProfileName;
    }

    /**
     * Get Configuration details. 
     * @return ProfileInfo Configuration details.
     */
    public ProfileInfo getProfileInfo() {
        return this.ProfileInfo;
    }

    /**
     * Set Configuration details.
     * @param ProfileInfo Configuration details.
     */
    public void setProfileInfo(ProfileInfo ProfileInfo) {
        this.ProfileInfo = ProfileInfo;
    }

    public UserProfile() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserProfile(UserProfile source) {
        if (source.ProfileId != null) {
            this.ProfileId = new String(source.ProfileId);
        }
        if (source.ProfileType != null) {
            this.ProfileType = new String(source.ProfileType);
        }
        if (source.ProfileLevel != null) {
            this.ProfileLevel = new String(source.ProfileLevel);
        }
        if (source.ProfileName != null) {
            this.ProfileName = new String(source.ProfileName);
        }
        if (source.ProfileInfo != null) {
            this.ProfileInfo = new ProfileInfo(source.ProfileInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProfileId", this.ProfileId);
        this.setParamSimple(map, prefix + "ProfileType", this.ProfileType);
        this.setParamSimple(map, prefix + "ProfileLevel", this.ProfileLevel);
        this.setParamSimple(map, prefix + "ProfileName", this.ProfileName);
        this.setParamObj(map, prefix + "ProfileInfo.", this.ProfileInfo);

    }
}

