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

public class CreateApplicationRequest extends AbstractModel {

    /**
    * Application name
    */
    @SerializedName("ApplicationName")
    @Expose
    private String ApplicationName;

    /**
    * Logo address
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
    * Android package name
    */
    @SerializedName("AndroidAppKey")
    @Expose
    private String AndroidAppKey;

    /**
    * iOS bundleId
    */
    @SerializedName("IosAppKey")
    @Expose
    private String IosAppKey;

    /**
    * Introduction
    */
    @SerializedName("Intro")
    @Expose
    private String Intro;

    /**
    * Remarks
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Android App download address
    */
    @SerializedName("AndroidAppURL")
    @Expose
    private String AndroidAppURL;

    /**
    * iOS App download address
    */
    @SerializedName("IosAppURL")
    @Expose
    private String IosAppURL;

    /**
    * Team ID
    */
    @SerializedName("TeamId")
    @Expose
    private String TeamId;

    /**
    * Application type. 1: Test; 2: Formal
    */
    @SerializedName("ApplicationType")
    @Expose
    private Long ApplicationType;

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
     * Get Logo address 
     * @return Logo Logo address
     */
    public String getLogo() {
        return this.Logo;
    }

    /**
     * Set Logo address
     * @param Logo Logo address
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
     * Get Android package name 
     * @return AndroidAppKey Android package name
     */
    public String getAndroidAppKey() {
        return this.AndroidAppKey;
    }

    /**
     * Set Android package name
     * @param AndroidAppKey Android package name
     */
    public void setAndroidAppKey(String AndroidAppKey) {
        this.AndroidAppKey = AndroidAppKey;
    }

    /**
     * Get iOS bundleId 
     * @return IosAppKey iOS bundleId
     */
    public String getIosAppKey() {
        return this.IosAppKey;
    }

    /**
     * Set iOS bundleId
     * @param IosAppKey iOS bundleId
     */
    public void setIosAppKey(String IosAppKey) {
        this.IosAppKey = IosAppKey;
    }

    /**
     * Get Introduction 
     * @return Intro Introduction
     */
    public String getIntro() {
        return this.Intro;
    }

    /**
     * Set Introduction
     * @param Intro Introduction
     */
    public void setIntro(String Intro) {
        this.Intro = Intro;
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

    /**
     * Get Android App download address 
     * @return AndroidAppURL Android App download address
     */
    public String getAndroidAppURL() {
        return this.AndroidAppURL;
    }

    /**
     * Set Android App download address
     * @param AndroidAppURL Android App download address
     */
    public void setAndroidAppURL(String AndroidAppURL) {
        this.AndroidAppURL = AndroidAppURL;
    }

    /**
     * Get iOS App download address 
     * @return IosAppURL iOS App download address
     */
    public String getIosAppURL() {
        return this.IosAppURL;
    }

    /**
     * Set iOS App download address
     * @param IosAppURL iOS App download address
     */
    public void setIosAppURL(String IosAppURL) {
        this.IosAppURL = IosAppURL;
    }

    /**
     * Get Team ID 
     * @return TeamId Team ID
     */
    public String getTeamId() {
        return this.TeamId;
    }

    /**
     * Set Team ID
     * @param TeamId Team ID
     */
    public void setTeamId(String TeamId) {
        this.TeamId = TeamId;
    }

    /**
     * Get Application type. 1: Test; 2: Formal 
     * @return ApplicationType Application type. 1: Test; 2: Formal
     */
    public Long getApplicationType() {
        return this.ApplicationType;
    }

    /**
     * Set Application type. 1: Test; 2: Formal
     * @param ApplicationType Application type. 1: Test; 2: Formal
     */
    public void setApplicationType(Long ApplicationType) {
        this.ApplicationType = ApplicationType;
    }

    public CreateApplicationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateApplicationRequest(CreateApplicationRequest source) {
        if (source.ApplicationName != null) {
            this.ApplicationName = new String(source.ApplicationName);
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
        if (source.Intro != null) {
            this.Intro = new String(source.Intro);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.AndroidAppURL != null) {
            this.AndroidAppURL = new String(source.AndroidAppURL);
        }
        if (source.IosAppURL != null) {
            this.IosAppURL = new String(source.IosAppURL);
        }
        if (source.TeamId != null) {
            this.TeamId = new String(source.TeamId);
        }
        if (source.ApplicationType != null) {
            this.ApplicationType = new Long(source.ApplicationType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplicationName", this.ApplicationName);
        this.setParamSimple(map, prefix + "Logo", this.Logo);
        this.setParamSimple(map, prefix + "PlatformId", this.PlatformId);
        this.setParamSimple(map, prefix + "AndroidAppKey", this.AndroidAppKey);
        this.setParamSimple(map, prefix + "IosAppKey", this.IosAppKey);
        this.setParamSimple(map, prefix + "Intro", this.Intro);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "AndroidAppURL", this.AndroidAppURL);
        this.setParamSimple(map, prefix + "IosAppURL", this.IosAppURL);
        this.setParamSimple(map, prefix + "TeamId", this.TeamId);
        this.setParamSimple(map, prefix + "ApplicationType", this.ApplicationType);

    }
}

