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

public class AssetViewCFGRisk extends AbstractModel {

    /**
    * The unique ID.
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
    * Instance type
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

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
    * First detected
    */
    @SerializedName("FirstTime")
    @Expose
    private String FirstTime;

    /**
    * Last detected 
    */
    @SerializedName("RecentTime")
    @Expose
    private String RecentTime;

    /**
    * Source of the task
    */
    @SerializedName("From")
    @Expose
    private String From;

    /**
    * Status
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * u200c-
    */
    @SerializedName("CFGSTD")
    @Expose
    private String CFGSTD;

    /**
    * Configuration details.
    */
    @SerializedName("CFGDescribe")
    @Expose
    private String CFGDescribe;

    /**
    * Fix suggestion
    */
    @SerializedName("CFGFix")
    @Expose
    private String CFGFix;

    /**
    * URL of the help documentation
    */
    @SerializedName("CFGHelpURL")
    @Expose
    private String CFGHelpURL;

    /**
    * Data entry key
    */
    @SerializedName("Index")
    @Expose
    private String Index;

    /**
    * User AppId
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
    * User UIN
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
     * Get The unique ID. 
     * @return Id The unique ID.
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set The unique ID.
     * @param Id The unique ID.
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
     * Get Source of the task 
     * @return From Source of the task
     */
    public String getFrom() {
        return this.From;
    }

    /**
     * Set Source of the task
     * @param From Source of the task
     */
    public void setFrom(String From) {
        this.From = From;
    }

    /**
     * Get Status 
     * @return Status Status
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Status
     * @param Status Status
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get u200c- 
     * @return CFGSTD u200c-
     */
    public String getCFGSTD() {
        return this.CFGSTD;
    }

    /**
     * Set u200c-
     * @param CFGSTD u200c-
     */
    public void setCFGSTD(String CFGSTD) {
        this.CFGSTD = CFGSTD;
    }

    /**
     * Get Configuration details. 
     * @return CFGDescribe Configuration details.
     */
    public String getCFGDescribe() {
        return this.CFGDescribe;
    }

    /**
     * Set Configuration details.
     * @param CFGDescribe Configuration details.
     */
    public void setCFGDescribe(String CFGDescribe) {
        this.CFGDescribe = CFGDescribe;
    }

    /**
     * Get Fix suggestion 
     * @return CFGFix Fix suggestion
     */
    public String getCFGFix() {
        return this.CFGFix;
    }

    /**
     * Set Fix suggestion
     * @param CFGFix Fix suggestion
     */
    public void setCFGFix(String CFGFix) {
        this.CFGFix = CFGFix;
    }

    /**
     * Get URL of the help documentation 
     * @return CFGHelpURL URL of the help documentation
     */
    public String getCFGHelpURL() {
        return this.CFGHelpURL;
    }

    /**
     * Set URL of the help documentation
     * @param CFGHelpURL URL of the help documentation
     */
    public void setCFGHelpURL(String CFGHelpURL) {
        this.CFGHelpURL = CFGHelpURL;
    }

    /**
     * Get Data entry key 
     * @return Index Data entry key
     */
    public String getIndex() {
        return this.Index;
    }

    /**
     * Set Data entry key
     * @param Index Data entry key
     */
    public void setIndex(String Index) {
        this.Index = Index;
    }

    /**
     * Get User AppId 
     * @return AppId User AppId
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set User AppId
     * @param AppId User AppId
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
     * Get User UIN
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return Uin User UIN
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set User UIN
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param Uin User UIN
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
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

    }
}

