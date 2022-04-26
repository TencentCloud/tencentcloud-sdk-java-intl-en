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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApplicationInformation extends AbstractModel{

    /**
    * Application ID, which is globally unique.
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * Displayed application name, which can contain up to 64 characters and is the same as the application name by default.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * Application creation time in ISO 8601 format.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreatedDate")
    @Expose
    private String CreatedDate;

    /**
    * Last update time in ISO 8601 format.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LastModifiedDate")
    @Expose
    private String LastModifiedDate;

    /**
    * Application status.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AppStatus")
    @Expose
    private Boolean AppStatus;

    /**
    * Application icon.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Icon")
    @Expose
    private String Icon;

    /**
    * Application type.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApplicationType")
    @Expose
    private String ApplicationType;

    /**
    * Client ID.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ClientId")
    @Expose
    private String ClientId;

    /**
     * Get Application ID, which is globally unique. 
     * @return ApplicationId Application ID, which is globally unique.
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set Application ID, which is globally unique.
     * @param ApplicationId Application ID, which is globally unique.
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get Displayed application name, which can contain up to 64 characters and is the same as the application name by default.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return DisplayName Displayed application name, which can contain up to 64 characters and is the same as the application name by default.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getDisplayName() {
        return this.DisplayName;
    }

    /**
     * Set Displayed application name, which can contain up to 64 characters and is the same as the application name by default.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param DisplayName Displayed application name, which can contain up to 64 characters and is the same as the application name by default.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    /**
     * Get Application creation time in ISO 8601 format.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CreatedDate Application creation time in ISO 8601 format.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getCreatedDate() {
        return this.CreatedDate;
    }

    /**
     * Set Application creation time in ISO 8601 format.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CreatedDate Application creation time in ISO 8601 format.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCreatedDate(String CreatedDate) {
        this.CreatedDate = CreatedDate;
    }

    /**
     * Get Last update time in ISO 8601 format.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return LastModifiedDate Last update time in ISO 8601 format.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getLastModifiedDate() {
        return this.LastModifiedDate;
    }

    /**
     * Set Last update time in ISO 8601 format.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param LastModifiedDate Last update time in ISO 8601 format.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setLastModifiedDate(String LastModifiedDate) {
        this.LastModifiedDate = LastModifiedDate;
    }

    /**
     * Get Application status.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return AppStatus Application status.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getAppStatus() {
        return this.AppStatus;
    }

    /**
     * Set Application status.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param AppStatus Application status.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setAppStatus(Boolean AppStatus) {
        this.AppStatus = AppStatus;
    }

    /**
     * Get Application icon.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Icon Application icon.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getIcon() {
        return this.Icon;
    }

    /**
     * Set Application icon.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Icon Application icon.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setIcon(String Icon) {
        this.Icon = Icon;
    }

    /**
     * Get Application type.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ApplicationType Application type.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getApplicationType() {
        return this.ApplicationType;
    }

    /**
     * Set Application type.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ApplicationType Application type.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setApplicationType(String ApplicationType) {
        this.ApplicationType = ApplicationType;
    }

    /**
     * Get Client ID.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ClientId Client ID.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getClientId() {
        return this.ClientId;
    }

    /**
     * Set Client ID.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ClientId Client ID.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setClientId(String ClientId) {
        this.ClientId = ClientId;
    }

    public ApplicationInformation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApplicationInformation(ApplicationInformation source) {
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.DisplayName != null) {
            this.DisplayName = new String(source.DisplayName);
        }
        if (source.CreatedDate != null) {
            this.CreatedDate = new String(source.CreatedDate);
        }
        if (source.LastModifiedDate != null) {
            this.LastModifiedDate = new String(source.LastModifiedDate);
        }
        if (source.AppStatus != null) {
            this.AppStatus = new Boolean(source.AppStatus);
        }
        if (source.Icon != null) {
            this.Icon = new String(source.Icon);
        }
        if (source.ApplicationType != null) {
            this.ApplicationType = new String(source.ApplicationType);
        }
        if (source.ClientId != null) {
            this.ClientId = new String(source.ClientId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);
        this.setParamSimple(map, prefix + "CreatedDate", this.CreatedDate);
        this.setParamSimple(map, prefix + "LastModifiedDate", this.LastModifiedDate);
        this.setParamSimple(map, prefix + "AppStatus", this.AppStatus);
        this.setParamSimple(map, prefix + "Icon", this.Icon);
        this.setParamSimple(map, prefix + "ApplicationType", this.ApplicationType);
        this.setParamSimple(map, prefix + "ClientId", this.ClientId);

    }
}

