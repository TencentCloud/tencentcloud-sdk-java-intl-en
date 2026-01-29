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

public class CFGViewCFGRisk extends AbstractModel {

    /**
    * Impact assets.
    */
    @SerializedName("NoHandleCount")
    @Expose
    private Long NoHandleCount;

    /**
    * Risk level: low - low risk, high - high risk, middle - medium risk, info - note, extreme - critical.
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * Latest Recognition Time
    */
    @SerializedName("RecentTime")
    @Expose
    private String RecentTime;

    /**
    * First Recognition Time
    */
    @SerializedName("FirstTime")
    @Expose
    private String FirstTime;

    /**
    * Status. 0-Unprocessed; 1-Disposed; 2-Ignored.
    */
    @SerializedName("AffectAssetCount")
    @Expose
    private Long AffectAssetCount;

    /**
    * Unique ID of Asset
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Asset Subtype
    */
    @SerializedName("From")
    @Expose
    private String From;

    /**
    * Front-end Index
    */
    @SerializedName("Index")
    @Expose
    private String Index;

    /**
    * User appid.
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * User Nickname
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Nick")
    @Expose
    private String Nick;

    /**
    * User UIN
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * Configuration name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CFGName")
    @Expose
    private String CFGName;

    /**
    * Check type.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CheckType")
    @Expose
    private String CheckType;

    /**
    * -
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CFGSTD")
    @Expose
    private String CFGSTD;

    /**
    * Description
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CFGDescribe")
    @Expose
    private String CFGDescribe;

    /**
    * Fixing suggestion
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CFGFix")
    @Expose
    private String CFGFix;

    /**
    * Help documentation.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CFGHelpURL")
    @Expose
    private String CFGHelpURL;

    /**
     * Get Impact assets. 
     * @return NoHandleCount Impact assets.
     */
    public Long getNoHandleCount() {
        return this.NoHandleCount;
    }

    /**
     * Set Impact assets.
     * @param NoHandleCount Impact assets.
     */
    public void setNoHandleCount(Long NoHandleCount) {
        this.NoHandleCount = NoHandleCount;
    }

    /**
     * Get Risk level: low - low risk, high - high risk, middle - medium risk, info - note, extreme - critical. 
     * @return Level Risk level: low - low risk, high - high risk, middle - medium risk, info - note, extreme - critical.
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set Risk level: low - low risk, high - high risk, middle - medium risk, info - note, extreme - critical.
     * @param Level Risk level: low - low risk, high - high risk, middle - medium risk, info - note, extreme - critical.
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get Latest Recognition Time 
     * @return RecentTime Latest Recognition Time
     */
    public String getRecentTime() {
        return this.RecentTime;
    }

    /**
     * Set Latest Recognition Time
     * @param RecentTime Latest Recognition Time
     */
    public void setRecentTime(String RecentTime) {
        this.RecentTime = RecentTime;
    }

    /**
     * Get First Recognition Time 
     * @return FirstTime First Recognition Time
     */
    public String getFirstTime() {
        return this.FirstTime;
    }

    /**
     * Set First Recognition Time
     * @param FirstTime First Recognition Time
     */
    public void setFirstTime(String FirstTime) {
        this.FirstTime = FirstTime;
    }

    /**
     * Get Status. 0-Unprocessed; 1-Disposed; 2-Ignored. 
     * @return AffectAssetCount Status. 0-Unprocessed; 1-Disposed; 2-Ignored.
     */
    public Long getAffectAssetCount() {
        return this.AffectAssetCount;
    }

    /**
     * Set Status. 0-Unprocessed; 1-Disposed; 2-Ignored.
     * @param AffectAssetCount Status. 0-Unprocessed; 1-Disposed; 2-Ignored.
     */
    public void setAffectAssetCount(Long AffectAssetCount) {
        this.AffectAssetCount = AffectAssetCount;
    }

    /**
     * Get Unique ID of Asset 
     * @return Id Unique ID of Asset
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Unique ID of Asset
     * @param Id Unique ID of Asset
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Asset Subtype 
     * @return From Asset Subtype
     */
    public String getFrom() {
        return this.From;
    }

    /**
     * Set Asset Subtype
     * @param From Asset Subtype
     */
    public void setFrom(String From) {
        this.From = From;
    }

    /**
     * Get Front-end Index 
     * @return Index Front-end Index
     */
    public String getIndex() {
        return this.Index;
    }

    /**
     * Set Front-end Index
     * @param Index Front-end Index
     */
    public void setIndex(String Index) {
        this.Index = Index;
    }

    /**
     * Get User appid. 
     * @return AppId User appid.
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set User appid.
     * @param AppId User appid.
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get User Nickname
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Nick User Nickname
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getNick() {
        return this.Nick;
    }

    /**
     * Set User Nickname
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Nick User Nickname
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNick(String Nick) {
        this.Nick = Nick;
    }

    /**
     * Get User UIN
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Uin User UIN
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set User UIN
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Uin User UIN
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get Configuration name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CFGName Configuration name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCFGName() {
        return this.CFGName;
    }

    /**
     * Set Configuration name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CFGName Configuration name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCFGName(String CFGName) {
        this.CFGName = CFGName;
    }

    /**
     * Get Check type.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CheckType Check type.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCheckType() {
        return this.CheckType;
    }

    /**
     * Set Check type.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CheckType Check type.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCheckType(String CheckType) {
        this.CheckType = CheckType;
    }

    /**
     * Get -
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CFGSTD -
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCFGSTD() {
        return this.CFGSTD;
    }

    /**
     * Set -
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CFGSTD -
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCFGSTD(String CFGSTD) {
        this.CFGSTD = CFGSTD;
    }

    /**
     * Get Description
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CFGDescribe Description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCFGDescribe() {
        return this.CFGDescribe;
    }

    /**
     * Set Description
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CFGDescribe Description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCFGDescribe(String CFGDescribe) {
        this.CFGDescribe = CFGDescribe;
    }

    /**
     * Get Fixing suggestion
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CFGFix Fixing suggestion
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCFGFix() {
        return this.CFGFix;
    }

    /**
     * Set Fixing suggestion
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CFGFix Fixing suggestion
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCFGFix(String CFGFix) {
        this.CFGFix = CFGFix;
    }

    /**
     * Get Help documentation.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CFGHelpURL Help documentation.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCFGHelpURL() {
        return this.CFGHelpURL;
    }

    /**
     * Set Help documentation.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CFGHelpURL Help documentation.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCFGHelpURL(String CFGHelpURL) {
        this.CFGHelpURL = CFGHelpURL;
    }

    public CFGViewCFGRisk() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CFGViewCFGRisk(CFGViewCFGRisk source) {
        if (source.NoHandleCount != null) {
            this.NoHandleCount = new Long(source.NoHandleCount);
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
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.Nick != null) {
            this.Nick = new String(source.Nick);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.CFGName != null) {
            this.CFGName = new String(source.CFGName);
        }
        if (source.CheckType != null) {
            this.CheckType = new String(source.CheckType);
        }
        if (source.CFGSTD != null) {
            this.CFGSTD = new String(source.CFGSTD);
        }
        if (source.CFGDescribe != null) {
            this.CFGDescribe = new String(source.CFGDescribe);
        }
        if (source.CFGFix != null) {
            this.CFGFix = new String(source.CFGFix);
        }
        if (source.CFGHelpURL != null) {
            this.CFGHelpURL = new String(source.CFGHelpURL);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NoHandleCount", this.NoHandleCount);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "RecentTime", this.RecentTime);
        this.setParamSimple(map, prefix + "FirstTime", this.FirstTime);
        this.setParamSimple(map, prefix + "AffectAssetCount", this.AffectAssetCount);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "From", this.From);
        this.setParamSimple(map, prefix + "Index", this.Index);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Nick", this.Nick);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "CFGName", this.CFGName);
        this.setParamSimple(map, prefix + "CheckType", this.CheckType);
        this.setParamSimple(map, prefix + "CFGSTD", this.CFGSTD);
        this.setParamSimple(map, prefix + "CFGDescribe", this.CFGDescribe);
        this.setParamSimple(map, prefix + "CFGFix", this.CFGFix);
        this.setParamSimple(map, prefix + "CFGHelpURL", this.CFGHelpURL);

    }
}

