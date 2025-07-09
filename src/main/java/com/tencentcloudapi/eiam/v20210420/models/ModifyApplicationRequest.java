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

public class ModifyApplicationRequest extends AbstractModel {

    /**
    * Application ID, which is globally unique.
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * Security level.
    */
    @SerializedName("SecureLevel")
    @Expose
    private String SecureLevel;

    /**
    * Displayed application name, which can contain up to 32 characters and is the same as the application name by default.
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * Application status. Valid values: true: enabled; false: disabled.
    */
    @SerializedName("AppStatus")
    @Expose
    private Boolean AppStatus;

    /**
    * Access address of the application icon image.
    */
    @SerializedName("IconUrl")
    @Expose
    private String IconUrl;

    /**
    * Description, which can contain up to 128 characters.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

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
     * Get Security level. 
     * @return SecureLevel Security level.
     */
    public String getSecureLevel() {
        return this.SecureLevel;
    }

    /**
     * Set Security level.
     * @param SecureLevel Security level.
     */
    public void setSecureLevel(String SecureLevel) {
        this.SecureLevel = SecureLevel;
    }

    /**
     * Get Displayed application name, which can contain up to 32 characters and is the same as the application name by default. 
     * @return DisplayName Displayed application name, which can contain up to 32 characters and is the same as the application name by default.
     */
    public String getDisplayName() {
        return this.DisplayName;
    }

    /**
     * Set Displayed application name, which can contain up to 32 characters and is the same as the application name by default.
     * @param DisplayName Displayed application name, which can contain up to 32 characters and is the same as the application name by default.
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    /**
     * Get Application status. Valid values: true: enabled; false: disabled. 
     * @return AppStatus Application status. Valid values: true: enabled; false: disabled.
     */
    public Boolean getAppStatus() {
        return this.AppStatus;
    }

    /**
     * Set Application status. Valid values: true: enabled; false: disabled.
     * @param AppStatus Application status. Valid values: true: enabled; false: disabled.
     */
    public void setAppStatus(Boolean AppStatus) {
        this.AppStatus = AppStatus;
    }

    /**
     * Get Access address of the application icon image. 
     * @return IconUrl Access address of the application icon image.
     */
    public String getIconUrl() {
        return this.IconUrl;
    }

    /**
     * Set Access address of the application icon image.
     * @param IconUrl Access address of the application icon image.
     */
    public void setIconUrl(String IconUrl) {
        this.IconUrl = IconUrl;
    }

    /**
     * Get Description, which can contain up to 128 characters. 
     * @return Description Description, which can contain up to 128 characters.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Description, which can contain up to 128 characters.
     * @param Description Description, which can contain up to 128 characters.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public ModifyApplicationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyApplicationRequest(ModifyApplicationRequest source) {
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.SecureLevel != null) {
            this.SecureLevel = new String(source.SecureLevel);
        }
        if (source.DisplayName != null) {
            this.DisplayName = new String(source.DisplayName);
        }
        if (source.AppStatus != null) {
            this.AppStatus = new Boolean(source.AppStatus);
        }
        if (source.IconUrl != null) {
            this.IconUrl = new String(source.IconUrl);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "SecureLevel", this.SecureLevel);
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);
        this.setParamSimple(map, prefix + "AppStatus", this.AppStatus);
        this.setParamSimple(map, prefix + "IconUrl", this.IconUrl);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

