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

public class AssetViewCFGRisk extends AbstractModel {

    /**
    * Unique ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Configuration name
    */
    @SerializedName("CFGName")
    @Expose
    private String CFGName;

    /**
    * Check type
    */
    @SerializedName("CheckType")
    @Expose
    private String CheckType;

    /**
    * Instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Instance name.
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Instance type
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * Affect assets
    */
    @SerializedName("AffectAsset")
    @Expose
    private String AffectAsset;

    /**
    * Risk level. low: low risk. high: high risk. middle: medium risk. info: notification. extreme: critical.
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * First Recognition Time
    */
    @SerializedName("FirstTime")
    @Expose
    private String FirstTime;

    /**
    * Latest Recognition Time
    */
    @SerializedName("RecentTime")
    @Expose
    private String RecentTime;

    /**
    * Source.
    */
    @SerializedName("From")
    @Expose
    private String From;

    /**
    * Status.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Relevant standards
    */
    @SerializedName("CFGSTD")
    @Expose
    private String CFGSTD;

    /**
    * Configuration detail
    */
    @SerializedName("CFGDescribe")
    @Expose
    private String CFGDescribe;

    /**
    * Fixing suggestion
    */
    @SerializedName("CFGFix")
    @Expose
    private String CFGFix;

    /**
    * Help Document Link
    */
    @SerializedName("CFGHelpURL")
    @Expose
    private String CFGHelpURL;

    /**
    * Front-end Usage Index
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
    */
    @SerializedName("Nick")
    @Expose
    private String Nick;

    /**
    * User UIN
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * This field is displayed when the asset type is LBL, to help locate the specific LB.
    */
    @SerializedName("ClbId")
    @Expose
    private String ClbId;

    /**
     * Get Unique ID 
     * @return Id Unique ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Unique ID
     * @param Id Unique ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Configuration name 
     * @return CFGName Configuration name
     */
    public String getCFGName() {
        return this.CFGName;
    }

    /**
     * Set Configuration name
     * @param CFGName Configuration name
     */
    public void setCFGName(String CFGName) {
        this.CFGName = CFGName;
    }

    /**
     * Get Check type 
     * @return CheckType Check type
     */
    public String getCheckType() {
        return this.CheckType;
    }

    /**
     * Set Check type
     * @param CheckType Check type
     */
    public void setCheckType(String CheckType) {
        this.CheckType = CheckType;
    }

    /**
     * Get Instance ID. 
     * @return InstanceId Instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID.
     * @param InstanceId Instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Instance name. 
     * @return InstanceName Instance name.
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance name.
     * @param InstanceName Instance name.
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
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
     * Get Affect assets 
     * @return AffectAsset Affect assets
     */
    public String getAffectAsset() {
        return this.AffectAsset;
    }

    /**
     * Set Affect assets
     * @param AffectAsset Affect assets
     */
    public void setAffectAsset(String AffectAsset) {
        this.AffectAsset = AffectAsset;
    }

    /**
     * Get Risk level. low: low risk. high: high risk. middle: medium risk. info: notification. extreme: critical. 
     * @return Level Risk level. low: low risk. high: high risk. middle: medium risk. info: notification. extreme: critical.
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set Risk level. low: low risk. high: high risk. middle: medium risk. info: notification. extreme: critical.
     * @param Level Risk level. low: low risk. high: high risk. middle: medium risk. info: notification. extreme: critical.
     */
    public void setLevel(String Level) {
        this.Level = Level;
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
     * Get Source. 
     * @return From Source.
     */
    public String getFrom() {
        return this.From;
    }

    /**
     * Set Source.
     * @param From Source.
     */
    public void setFrom(String From) {
        this.From = From;
    }

    /**
     * Get Status. 
     * @return Status Status.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Status.
     * @param Status Status.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Relevant standards 
     * @return CFGSTD Relevant standards
     */
    public String getCFGSTD() {
        return this.CFGSTD;
    }

    /**
     * Set Relevant standards
     * @param CFGSTD Relevant standards
     */
    public void setCFGSTD(String CFGSTD) {
        this.CFGSTD = CFGSTD;
    }

    /**
     * Get Configuration detail 
     * @return CFGDescribe Configuration detail
     */
    public String getCFGDescribe() {
        return this.CFGDescribe;
    }

    /**
     * Set Configuration detail
     * @param CFGDescribe Configuration detail
     */
    public void setCFGDescribe(String CFGDescribe) {
        this.CFGDescribe = CFGDescribe;
    }

    /**
     * Get Fixing suggestion 
     * @return CFGFix Fixing suggestion
     */
    public String getCFGFix() {
        return this.CFGFix;
    }

    /**
     * Set Fixing suggestion
     * @param CFGFix Fixing suggestion
     */
    public void setCFGFix(String CFGFix) {
        this.CFGFix = CFGFix;
    }

    /**
     * Get Help Document Link 
     * @return CFGHelpURL Help Document Link
     */
    public String getCFGHelpURL() {
        return this.CFGHelpURL;
    }

    /**
     * Set Help Document Link
     * @param CFGHelpURL Help Document Link
     */
    public void setCFGHelpURL(String CFGHelpURL) {
        this.CFGHelpURL = CFGHelpURL;
    }

    /**
     * Get Front-end Usage Index 
     * @return Index Front-end Usage Index
     */
    public String getIndex() {
        return this.Index;
    }

    /**
     * Set Front-end Usage Index
     * @param Index Front-end Usage Index
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
     * @return Nick User Nickname
     */
    public String getNick() {
        return this.Nick;
    }

    /**
     * Set User Nickname
     * @param Nick User Nickname
     */
    public void setNick(String Nick) {
        this.Nick = Nick;
    }

    /**
     * Get User UIN 
     * @return Uin User UIN
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set User UIN
     * @param Uin User UIN
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get This field is displayed when the asset type is LBL, to help locate the specific LB. 
     * @return ClbId This field is displayed when the asset type is LBL, to help locate the specific LB.
     */
    public String getClbId() {
        return this.ClbId;
    }

    /**
     * Set This field is displayed when the asset type is LBL, to help locate the specific LB.
     * @param ClbId This field is displayed when the asset type is LBL, to help locate the specific LB.
     */
    public void setClbId(String ClbId) {
        this.ClbId = ClbId;
    }

    public AssetViewCFGRisk() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetViewCFGRisk(AssetViewCFGRisk source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.CFGName != null) {
            this.CFGName = new String(source.CFGName);
        }
        if (source.CheckType != null) {
            this.CheckType = new String(source.CheckType);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.AffectAsset != null) {
            this.AffectAsset = new String(source.AffectAsset);
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.FirstTime != null) {
            this.FirstTime = new String(source.FirstTime);
        }
        if (source.RecentTime != null) {
            this.RecentTime = new String(source.RecentTime);
        }
        if (source.From != null) {
            this.From = new String(source.From);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
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
        if (source.ClbId != null) {
            this.ClbId = new String(source.ClbId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "CFGName", this.CFGName);
        this.setParamSimple(map, prefix + "CheckType", this.CheckType);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "AffectAsset", this.AffectAsset);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "FirstTime", this.FirstTime);
        this.setParamSimple(map, prefix + "RecentTime", this.RecentTime);
        this.setParamSimple(map, prefix + "From", this.From);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CFGSTD", this.CFGSTD);
        this.setParamSimple(map, prefix + "CFGDescribe", this.CFGDescribe);
        this.setParamSimple(map, prefix + "CFGFix", this.CFGFix);
        this.setParamSimple(map, prefix + "CFGHelpURL", this.CFGHelpURL);
        this.setParamSimple(map, prefix + "Index", this.Index);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Nick", this.Nick);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "ClbId", this.ClbId);

    }
}

