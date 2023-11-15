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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WebsiteRisk extends AbstractModel {

    /**
    * Affected assets
    */
    @SerializedName("AffectAsset")
    @Expose
    private String AffectAsset;

    /**
    * Risk level
    */
    @SerializedName("Level")
    @Expose
    private String Level;

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
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Unique ID of the asset
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Frontend index
    */
    @SerializedName("Index")
    @Expose
    private String Index;

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Instance name
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * User `appid`
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * User name.
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("Nick")
    @Expose
    private String Nick;

    /**
    * User `uin`
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * URL of the risk
    */
    @SerializedName("URL")
    @Expose
    private String URL;

    /**
    * URL of the risk file
    */
    @SerializedName("URLPath")
    @Expose
    private String URLPath;

    /**
    * Instance type
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * Check type.
    */
    @SerializedName("DetectEngine")
    @Expose
    private String DetectEngine;

    /**
    * Result description.
    */
    @SerializedName("ResultDescribe")
    @Expose
    private String ResultDescribe;

    /**
    * Source URL
    */
    @SerializedName("SourceURL")
    @Expose
    private String SourceURL;

    /**
    * Source file URL
    */
    @SerializedName("SourceURLPath")
    @Expose
    private String SourceURLPath;

    /**
     * Get Affected assets 
     * @return AffectAsset Affected assets
     */
    public String getAffectAsset() {
        return this.AffectAsset;
    }

    /**
     * Set Affected assets
     * @param AffectAsset Affected assets
     */
    public void setAffectAsset(String AffectAsset) {
        this.AffectAsset = AffectAsset;
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
     * @return Status Status of the risk. `0`: Not handled, `1`: Handled; `2`: Ignored
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Status of the risk. `0`: Not handled, `1`: Handled; `2`: Ignored
     * @param Status Status of the risk. `0`: Not handled, `1`: Handled; `2`: Ignored
     */
    public void setStatus(Long Status) {
        this.Status = Status;
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
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Instance name 
     * @return InstanceName Instance name
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance name
     * @param InstanceName Instance name
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
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
     * Get URL of the risk 
     * @return URL URL of the risk
     */
    public String getURL() {
        return this.URL;
    }

    /**
     * Set URL of the risk
     * @param URL URL of the risk
     */
    public void setURL(String URL) {
        this.URL = URL;
    }

    /**
     * Get URL of the risk file 
     * @return URLPath URL of the risk file
     */
    public String getURLPath() {
        return this.URLPath;
    }

    /**
     * Set URL of the risk file
     * @param URLPath URL of the risk file
     */
    public void setURLPath(String URLPath) {
        this.URLPath = URLPath;
    }

    /**
     * Get Instance type 
     * @return InstanceType Instance type
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Instance type
     * @param InstanceType Instance type
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get Check type. 
     * @return DetectEngine Check type.
     */
    public String getDetectEngine() {
        return this.DetectEngine;
    }

    /**
     * Set Check type.
     * @param DetectEngine Check type.
     */
    public void setDetectEngine(String DetectEngine) {
        this.DetectEngine = DetectEngine;
    }

    /**
     * Get Result description. 
     * @return ResultDescribe Result description.
     */
    public String getResultDescribe() {
        return this.ResultDescribe;
    }

    /**
     * Set Result description.
     * @param ResultDescribe Result description.
     */
    public void setResultDescribe(String ResultDescribe) {
        this.ResultDescribe = ResultDescribe;
    }

    /**
     * Get Source URL 
     * @return SourceURL Source URL
     */
    public String getSourceURL() {
        return this.SourceURL;
    }

    /**
     * Set Source URL
     * @param SourceURL Source URL
     */
    public void setSourceURL(String SourceURL) {
        this.SourceURL = SourceURL;
    }

    /**
     * Get Source file URL 
     * @return SourceURLPath Source file URL
     */
    public String getSourceURLPath() {
        return this.SourceURLPath;
    }

    /**
     * Set Source file URL
     * @param SourceURLPath Source file URL
     */
    public void setSourceURLPath(String SourceURLPath) {
        this.SourceURLPath = SourceURLPath;
    }

    public WebsiteRisk() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WebsiteRisk(WebsiteRisk source) {
        if (source.AffectAsset != null) {
            this.AffectAsset = new String(source.AffectAsset);
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.RecentTime != null) {
            this.RecentTime = new String(source.RecentTime);
        }
        if (source.FirstTime != null) {
            this.FirstTime = new String(source.FirstTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Index != null) {
            this.Index = new String(source.Index);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.Nick != null) {
            this.Nick = new String(source.Nick);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.URL != null) {
            this.URL = new String(source.URL);
        }
        if (source.URLPath != null) {
            this.URLPath = new String(source.URLPath);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.DetectEngine != null) {
            this.DetectEngine = new String(source.DetectEngine);
        }
        if (source.ResultDescribe != null) {
            this.ResultDescribe = new String(source.ResultDescribe);
        }
        if (source.SourceURL != null) {
            this.SourceURL = new String(source.SourceURL);
        }
        if (source.SourceURLPath != null) {
            this.SourceURLPath = new String(source.SourceURLPath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AffectAsset", this.AffectAsset);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "RecentTime", this.RecentTime);
        this.setParamSimple(map, prefix + "FirstTime", this.FirstTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Index", this.Index);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Nick", this.Nick);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "URL", this.URL);
        this.setParamSimple(map, prefix + "URLPath", this.URLPath);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "DetectEngine", this.DetectEngine);
        this.setParamSimple(map, prefix + "ResultDescribe", this.ResultDescribe);
        this.setParamSimple(map, prefix + "SourceURL", this.SourceURL);
        this.setParamSimple(map, prefix + "SourceURLPath", this.SourceURLPath);

    }
}

