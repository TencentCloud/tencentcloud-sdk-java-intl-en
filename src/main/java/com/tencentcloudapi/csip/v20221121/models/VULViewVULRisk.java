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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VULViewVULRisk extends AbstractModel {

    /**
    * Port
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
    * Affected assets
    */
    @SerializedName("NoHandleCount")
    @Expose
    private Long NoHandleCount;

    /**
    * Risk level
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * Components
    */
    @SerializedName("Component")
    @Expose
    private String Component;

    /**
    * Last detected 
    */
    @SerializedName("RecentTime")
    @Expose
    private String RecentTime;

    /**
    * First detected
    */
    @SerializedName("FirstTime")
    @Expose
    private String FirstTime;

    /**
    * Status of the risk. `0`: Not handled, `1`: Handled; `2`: Ignored
    */
    @SerializedName("AffectAssetCount")
    @Expose
    private Long AffectAssetCount;

    /**
    * Unique ID of the asset
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Asset sub-category
    */
    @SerializedName("From")
    @Expose
    private String From;

    /**
    * Frontend index
    */
    @SerializedName("Index")
    @Expose
    private String Index;

    /**
    * Vulnerability type
    */
    @SerializedName("VULType")
    @Expose
    private String VULType;

    /**
    * Vulnerability name
    */
    @SerializedName("VULName")
    @Expose
    private String VULName;

    /**
    * CVE number
    */
    @SerializedName("CVE")
    @Expose
    private String CVE;

    /**
    * Description
    */
    @SerializedName("Describe")
    @Expose
    private String Describe;

    /**
    * Pay load
    */
    @SerializedName("Payload")
    @Expose
    private String Payload;

    /**
    * Affected components
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * Reference information of the vulnerability
    */
    @SerializedName("References")
    @Expose
    private String References;

    /**
    * Affected version
    */
    @SerializedName("AppVersion")
    @Expose
    private String AppVersion;

    /**
    * Vulnerability URL
    */
    @SerializedName("VULURL")
    @Expose
    private String VULURL;

    /**
    * User name.
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("Nick")
    @Expose
    private String Nick;

    /**
    * User `appid`
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * User `uin`
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * Fix suggestion
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("Fix")
    @Expose
    private String Fix;

    /**
    * Whether it's an emergency vulnerability. Values: `1` (emergency vulnerability); `0` (non-emergency vulnerability
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("EMGCVulType")
    @Expose
    private Long EMGCVulType;

    /**
     * Get Port 
     * @return Port Port
     */
    public String getPort() {
        return this.Port;
    }

    /**
     * Set Port
     * @param Port Port
     */
    public void setPort(String Port) {
        this.Port = Port;
    }

    /**
     * Get Affected assets 
     * @return NoHandleCount Affected assets
     */
    public Long getNoHandleCount() {
        return this.NoHandleCount;
    }

    /**
     * Set Affected assets
     * @param NoHandleCount Affected assets
     */
    public void setNoHandleCount(Long NoHandleCount) {
        this.NoHandleCount = NoHandleCount;
    }

    /**
     * Get Risk level 
     * @return Level Risk level
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set Risk level
     * @param Level Risk level
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get Components 
     * @return Component Components
     */
    public String getComponent() {
        return this.Component;
    }

    /**
     * Set Components
     * @param Component Components
     */
    public void setComponent(String Component) {
        this.Component = Component;
    }

    /**
     * Get Last detected  
     * @return RecentTime Last detected 
     */
    public String getRecentTime() {
        return this.RecentTime;
    }

    /**
     * Set Last detected 
     * @param RecentTime Last detected 
     */
    public void setRecentTime(String RecentTime) {
        this.RecentTime = RecentTime;
    }

    /**
     * Get First detected 
     * @return FirstTime First detected
     */
    public String getFirstTime() {
        return this.FirstTime;
    }

    /**
     * Set First detected
     * @param FirstTime First detected
     */
    public void setFirstTime(String FirstTime) {
        this.FirstTime = FirstTime;
    }

    /**
     * Get Status of the risk. `0`: Not handled, `1`: Handled; `2`: Ignored 
     * @return AffectAssetCount Status of the risk. `0`: Not handled, `1`: Handled; `2`: Ignored
     */
    public Long getAffectAssetCount() {
        return this.AffectAssetCount;
    }

    /**
     * Set Status of the risk. `0`: Not handled, `1`: Handled; `2`: Ignored
     * @param AffectAssetCount Status of the risk. `0`: Not handled, `1`: Handled; `2`: Ignored
     */
    public void setAffectAssetCount(Long AffectAssetCount) {
        this.AffectAssetCount = AffectAssetCount;
    }

    /**
     * Get Unique ID of the asset 
     * @return Id Unique ID of the asset
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Unique ID of the asset
     * @param Id Unique ID of the asset
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Asset sub-category 
     * @return From Asset sub-category
     */
    public String getFrom() {
        return this.From;
    }

    /**
     * Set Asset sub-category
     * @param From Asset sub-category
     */
    public void setFrom(String From) {
        this.From = From;
    }

    /**
     * Get Frontend index 
     * @return Index Frontend index
     */
    public String getIndex() {
        return this.Index;
    }

    /**
     * Set Frontend index
     * @param Index Frontend index
     */
    public void setIndex(String Index) {
        this.Index = Index;
    }

    /**
     * Get Vulnerability type 
     * @return VULType Vulnerability type
     */
    public String getVULType() {
        return this.VULType;
    }

    /**
     * Set Vulnerability type
     * @param VULType Vulnerability type
     */
    public void setVULType(String VULType) {
        this.VULType = VULType;
    }

    /**
     * Get Vulnerability name 
     * @return VULName Vulnerability name
     */
    public String getVULName() {
        return this.VULName;
    }

    /**
     * Set Vulnerability name
     * @param VULName Vulnerability name
     */
    public void setVULName(String VULName) {
        this.VULName = VULName;
    }

    /**
     * Get CVE number 
     * @return CVE CVE number
     */
    public String getCVE() {
        return this.CVE;
    }

    /**
     * Set CVE number
     * @param CVE CVE number
     */
    public void setCVE(String CVE) {
        this.CVE = CVE;
    }

    /**
     * Get Description 
     * @return Describe Description
     */
    public String getDescribe() {
        return this.Describe;
    }

    /**
     * Set Description
     * @param Describe Description
     */
    public void setDescribe(String Describe) {
        this.Describe = Describe;
    }

    /**
     * Get Pay load 
     * @return Payload Pay load
     */
    public String getPayload() {
        return this.Payload;
    }

    /**
     * Set Pay load
     * @param Payload Pay load
     */
    public void setPayload(String Payload) {
        this.Payload = Payload;
    }

    /**
     * Get Affected components 
     * @return AppName Affected components
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set Affected components
     * @param AppName Affected components
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get Reference information of the vulnerability 
     * @return References Reference information of the vulnerability
     */
    public String getReferences() {
        return this.References;
    }

    /**
     * Set Reference information of the vulnerability
     * @param References Reference information of the vulnerability
     */
    public void setReferences(String References) {
        this.References = References;
    }

    /**
     * Get Affected version 
     * @return AppVersion Affected version
     */
    public String getAppVersion() {
        return this.AppVersion;
    }

    /**
     * Set Affected version
     * @param AppVersion Affected version
     */
    public void setAppVersion(String AppVersion) {
        this.AppVersion = AppVersion;
    }

    /**
     * Get Vulnerability URL 
     * @return VULURL Vulnerability URL
     */
    public String getVULURL() {
        return this.VULURL;
    }

    /**
     * Set Vulnerability URL
     * @param VULURL Vulnerability URL
     */
    public void setVULURL(String VULURL) {
        this.VULURL = VULURL;
    }

    /**
     * Get User name.
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return Nick User name.
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getNick() {
        return this.Nick;
    }

    /**
     * Set User name.
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param Nick User name.
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setNick(String Nick) {
        this.Nick = Nick;
    }

    /**
     * Get User `appid` 
     * @return AppId User `appid`
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set User `appid`
     * @param AppId User `appid`
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get User `uin`
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return Uin User `uin`
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set User `uin`
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param Uin User `uin`
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get Fix suggestion
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return Fix Fix suggestion
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getFix() {
        return this.Fix;
    }

    /**
     * Set Fix suggestion
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param Fix Fix suggestion
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setFix(String Fix) {
        this.Fix = Fix;
    }

    /**
     * Get Whether it's an emergency vulnerability. Values: `1` (emergency vulnerability); `0` (non-emergency vulnerability
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return EMGCVulType Whether it's an emergency vulnerability. Values: `1` (emergency vulnerability); `0` (non-emergency vulnerability
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Long getEMGCVulType() {
        return this.EMGCVulType;
    }

    /**
     * Set Whether it's an emergency vulnerability. Values: `1` (emergency vulnerability); `0` (non-emergency vulnerability
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param EMGCVulType Whether it's an emergency vulnerability. Values: `1` (emergency vulnerability); `0` (non-emergency vulnerability
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setEMGCVulType(Long EMGCVulType) {
        this.EMGCVulType = EMGCVulType;
    }

    public VULViewVULRisk() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VULViewVULRisk(VULViewVULRisk source) {
        if (source.Port != null) {
            this.Port = new String(source.Port);
        }
        if (source.NoHandleCount != null) {
            this.NoHandleCount = new Long(source.NoHandleCount);
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.Component != null) {
            this.Component = new String(source.Component);
        }
        if (source.RecentTime != null) {
            this.RecentTime = new String(source.RecentTime);
        }
        if (source.FirstTime != null) {
            this.FirstTime = new String(source.FirstTime);
        }
        if (source.AffectAssetCount != null) {
            this.AffectAssetCount = new Long(source.AffectAssetCount);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.From != null) {
            this.From = new String(source.From);
        }
        if (source.Index != null) {
            this.Index = new String(source.Index);
        }
        if (source.VULType != null) {
            this.VULType = new String(source.VULType);
        }
        if (source.VULName != null) {
            this.VULName = new String(source.VULName);
        }
        if (source.CVE != null) {
            this.CVE = new String(source.CVE);
        }
        if (source.Describe != null) {
            this.Describe = new String(source.Describe);
        }
        if (source.Payload != null) {
            this.Payload = new String(source.Payload);
        }
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.References != null) {
            this.References = new String(source.References);
        }
        if (source.AppVersion != null) {
            this.AppVersion = new String(source.AppVersion);
        }
        if (source.VULURL != null) {
            this.VULURL = new String(source.VULURL);
        }
        if (source.Nick != null) {
            this.Nick = new String(source.Nick);
        }
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.Fix != null) {
            this.Fix = new String(source.Fix);
        }
        if (source.EMGCVulType != null) {
            this.EMGCVulType = new Long(source.EMGCVulType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "NoHandleCount", this.NoHandleCount);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Component", this.Component);
        this.setParamSimple(map, prefix + "RecentTime", this.RecentTime);
        this.setParamSimple(map, prefix + "FirstTime", this.FirstTime);
        this.setParamSimple(map, prefix + "AffectAssetCount", this.AffectAssetCount);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "From", this.From);
        this.setParamSimple(map, prefix + "Index", this.Index);
        this.setParamSimple(map, prefix + "VULType", this.VULType);
        this.setParamSimple(map, prefix + "VULName", this.VULName);
        this.setParamSimple(map, prefix + "CVE", this.CVE);
        this.setParamSimple(map, prefix + "Describe", this.Describe);
        this.setParamSimple(map, prefix + "Payload", this.Payload);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "References", this.References);
        this.setParamSimple(map, prefix + "AppVersion", this.AppVersion);
        this.setParamSimple(map, prefix + "VULURL", this.VULURL);
        this.setParamSimple(map, prefix + "Nick", this.Nick);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "Fix", this.Fix);
        this.setParamSimple(map, prefix + "EMGCVulType", this.EMGCVulType);

    }
}

