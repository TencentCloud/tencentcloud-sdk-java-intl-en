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
package com.tencentcloudapi.tcsas.v20250106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyApplicationRequest extends AbstractModel {

    /**
    * Application ID
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * Application name
    */
    @SerializedName("ApplicationName")
    @Expose
    private String ApplicationName;

    /**
    * Application introduction
    */
    @SerializedName("Intro")
    @Expose
    private String Intro;

    /**
    * Icon
    */
    @SerializedName("Logo")
    @Expose
    private String Logo;

    /**
    * Platform ID
    */
    @SerializedName("PlatformId")
    @Expose
    private String PlatformId;

    /**
    * Android app package name
    */
    @SerializedName("AndroidAppKey")
    @Expose
    private String AndroidAppKey;

    /**
    * iOS App bundleId
    */
    @SerializedName("IosAppKey")
    @Expose
    private String IosAppKey;

    /**
    * Remarks
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get Application ID 
     * @return ApplicationId Application ID
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set Application ID
     * @param ApplicationId Application ID
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get Application name 
     * @return ApplicationName Application name
     */
    public String getApplicationName() {
        return this.ApplicationName;
    }

    /**
     * Set Application name
     * @param ApplicationName Application name
     */
    public void setApplicationName(String ApplicationName) {
        this.ApplicationName = ApplicationName;
    }

    /**
     * Get Application introduction 
     * @return Intro Application introduction
     */
    public String getIntro() {
        return this.Intro;
    }

    /**
     * Set Application introduction
     * @param Intro Application introduction
     */
    public void setIntro(String Intro) {
        this.Intro = Intro;
    }

    /**
     * Get Icon 
     * @return Logo Icon
     */
    public String getLogo() {
        return this.Logo;
    }

    /**
     * Set Icon
     * @param Logo Icon
     */
    public void setLogo(String Logo) {
        this.Logo = Logo;
    }

    /**
     * Get Platform ID 
     * @return PlatformId Platform ID
     */
    public String getPlatformId() {
        return this.PlatformId;
    }

    /**
     * Set Platform ID
     * @param PlatformId Platform ID
     */
    public void setPlatformId(String PlatformId) {
        this.PlatformId = PlatformId;
    }

    /**
     * Get Android app package name 
     * @return AndroidAppKey Android app package name
     */
    public String getAndroidAppKey() {
        return this.AndroidAppKey;
    }

    /**
     * Set Android app package name
     * @param AndroidAppKey Android app package name
     */
    public void setAndroidAppKey(String AndroidAppKey) {
        this.AndroidAppKey = AndroidAppKey;
    }

    /**
     * Get iOS App bundleId 
     * @return IosAppKey iOS App bundleId
     */
    public String getIosAppKey() {
        return this.IosAppKey;
    }

    /**
     * Set iOS App bundleId
     * @param IosAppKey iOS App bundleId
     */
    public void setIosAppKey(String IosAppKey) {
        this.IosAppKey = IosAppKey;
    }

    /**
     * Get Remarks 
     * @return Remark Remarks
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Remarks
     * @param Remark Remarks
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
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
        if (source.ApplicationName != null) {
            this.ApplicationName = new String(source.ApplicationName);
        }
        if (source.Intro != null) {
            this.Intro = new String(source.Intro);
        }
        if (source.Logo != null) {
            this.Logo = new String(source.Logo);
        }
        if (source.PlatformId != null) {
            this.PlatformId = new String(source.PlatformId);
        }
        if (source.AndroidAppKey != null) {
            this.AndroidAppKey = new String(source.AndroidAppKey);
        }
        if (source.IosAppKey != null) {
            this.IosAppKey = new String(source.IosAppKey);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "ApplicationName", this.ApplicationName);
        this.setParamSimple(map, prefix + "Intro", this.Intro);
        this.setParamSimple(map, prefix + "Logo", this.Logo);
        this.setParamSimple(map, prefix + "PlatformId", this.PlatformId);
        this.setParamSimple(map, prefix + "AndroidAppKey", this.AndroidAppKey);
        this.setParamSimple(map, prefix + "IosAppKey", this.IosAppKey);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

