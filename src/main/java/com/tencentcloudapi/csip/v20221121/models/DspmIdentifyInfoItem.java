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

public class DspmIdentifyInfoItem extends AbstractModel {

    /**
    * Identity id.
    */
    @SerializedName("IdentifyId")
    @Expose
    private String IdentifyId;

    /**
    * Remarks.
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Identity type. 0: undefined; 2: long-term identity; 3: temporary identity
    */
    @SerializedName("IdentifyType")
    @Expose
    private Long IdentifyType;

    /**
    * User associated with the cloud account uin.
    */
    @SerializedName("OwnerUin")
    @Expose
    private DspmUinUser OwnerUin;

    /**
    * Creator account uin user.
    */
    @SerializedName("CreatorUin")
    @Expose
    private DspmUinUser CreatorUin;

    /**
    * Associated assets.
    */
    @SerializedName("AssetCount")
    @Expose
    private Long AssetCount;

    /**
    * Creation time.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Status. 0: inactive; 1: active
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * User information to which it belongs
    */
    @SerializedName("Person")
    @Expose
    private DspmPersonUser Person;

    /**
    * Associate statistical information of data assets.
    */
    @SerializedName("AssetStatistic")
    @Expose
    private DspmIdentifyAssetStatistic AssetStatistic;

    /**
    * Risk statistics
    */
    @SerializedName("RiskCount")
    @Expose
    private DspmRiskCount RiskCount;

    /**
    * Security recommendation. Resolve immediate problem-solving Reinforcement None no abnormality detected
    */
    @SerializedName("SafetyAdvice")
    @Expose
    private String SafetyAdvice;

    /**
    * app id of the account to which the asset belongs
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * Account nickname
    */
    @SerializedName("NickName")
    @Expose
    private String NickName;

    /**
    * Account uin of the asset owner
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
     * Get Identity id. 
     * @return IdentifyId Identity id.
     */
    public String getIdentifyId() {
        return this.IdentifyId;
    }

    /**
     * Set Identity id.
     * @param IdentifyId Identity id.
     */
    public void setIdentifyId(String IdentifyId) {
        this.IdentifyId = IdentifyId;
    }

    /**
     * Get Remarks. 
     * @return Remark Remarks.
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Remarks.
     * @param Remark Remarks.
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Identity type. 0: undefined; 2: long-term identity; 3: temporary identity 
     * @return IdentifyType Identity type. 0: undefined; 2: long-term identity; 3: temporary identity
     */
    public Long getIdentifyType() {
        return this.IdentifyType;
    }

    /**
     * Set Identity type. 0: undefined; 2: long-term identity; 3: temporary identity
     * @param IdentifyType Identity type. 0: undefined; 2: long-term identity; 3: temporary identity
     */
    public void setIdentifyType(Long IdentifyType) {
        this.IdentifyType = IdentifyType;
    }

    /**
     * Get User associated with the cloud account uin. 
     * @return OwnerUin User associated with the cloud account uin.
     */
    public DspmUinUser getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set User associated with the cloud account uin.
     * @param OwnerUin User associated with the cloud account uin.
     */
    public void setOwnerUin(DspmUinUser OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get Creator account uin user. 
     * @return CreatorUin Creator account uin user.
     */
    public DspmUinUser getCreatorUin() {
        return this.CreatorUin;
    }

    /**
     * Set Creator account uin user.
     * @param CreatorUin Creator account uin user.
     */
    public void setCreatorUin(DspmUinUser CreatorUin) {
        this.CreatorUin = CreatorUin;
    }

    /**
     * Get Associated assets. 
     * @return AssetCount Associated assets.
     */
    public Long getAssetCount() {
        return this.AssetCount;
    }

    /**
     * Set Associated assets.
     * @param AssetCount Associated assets.
     */
    public void setAssetCount(Long AssetCount) {
        this.AssetCount = AssetCount;
    }

    /**
     * Get Creation time. 
     * @return CreateTime Creation time.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time.
     * @param CreateTime Creation time.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Status. 0: inactive; 1: active 
     * @return Status Status. 0: inactive; 1: active
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Status. 0: inactive; 1: active
     * @param Status Status. 0: inactive; 1: active
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get User information to which it belongs 
     * @return Person User information to which it belongs
     */
    public DspmPersonUser getPerson() {
        return this.Person;
    }

    /**
     * Set User information to which it belongs
     * @param Person User information to which it belongs
     */
    public void setPerson(DspmPersonUser Person) {
        this.Person = Person;
    }

    /**
     * Get Associate statistical information of data assets. 
     * @return AssetStatistic Associate statistical information of data assets.
     */
    public DspmIdentifyAssetStatistic getAssetStatistic() {
        return this.AssetStatistic;
    }

    /**
     * Set Associate statistical information of data assets.
     * @param AssetStatistic Associate statistical information of data assets.
     */
    public void setAssetStatistic(DspmIdentifyAssetStatistic AssetStatistic) {
        this.AssetStatistic = AssetStatistic;
    }

    /**
     * Get Risk statistics 
     * @return RiskCount Risk statistics
     */
    public DspmRiskCount getRiskCount() {
        return this.RiskCount;
    }

    /**
     * Set Risk statistics
     * @param RiskCount Risk statistics
     */
    public void setRiskCount(DspmRiskCount RiskCount) {
        this.RiskCount = RiskCount;
    }

    /**
     * Get Security recommendation. Resolve immediate problem-solving Reinforcement None no abnormality detected 
     * @return SafetyAdvice Security recommendation. Resolve immediate problem-solving Reinforcement None no abnormality detected
     */
    public String getSafetyAdvice() {
        return this.SafetyAdvice;
    }

    /**
     * Set Security recommendation. Resolve immediate problem-solving Reinforcement None no abnormality detected
     * @param SafetyAdvice Security recommendation. Resolve immediate problem-solving Reinforcement None no abnormality detected
     */
    public void setSafetyAdvice(String SafetyAdvice) {
        this.SafetyAdvice = SafetyAdvice;
    }

    /**
     * Get app id of the account to which the asset belongs 
     * @return AppId app id of the account to which the asset belongs
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set app id of the account to which the asset belongs
     * @param AppId app id of the account to which the asset belongs
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get Account nickname 
     * @return NickName Account nickname
     */
    public String getNickName() {
        return this.NickName;
    }

    /**
     * Set Account nickname
     * @param NickName Account nickname
     */
    public void setNickName(String NickName) {
        this.NickName = NickName;
    }

    /**
     * Get Account uin of the asset owner 
     * @return Uin Account uin of the asset owner
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set Account uin of the asset owner
     * @param Uin Account uin of the asset owner
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    public DspmIdentifyInfoItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspmIdentifyInfoItem(DspmIdentifyInfoItem source) {
        if (source.IdentifyId != null) {
            this.IdentifyId = new String(source.IdentifyId);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.IdentifyType != null) {
            this.IdentifyType = new Long(source.IdentifyType);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new DspmUinUser(source.OwnerUin);
        }
        if (source.CreatorUin != null) {
            this.CreatorUin = new DspmUinUser(source.CreatorUin);
        }
        if (source.AssetCount != null) {
            this.AssetCount = new Long(source.AssetCount);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Person != null) {
            this.Person = new DspmPersonUser(source.Person);
        }
        if (source.AssetStatistic != null) {
            this.AssetStatistic = new DspmIdentifyAssetStatistic(source.AssetStatistic);
        }
        if (source.RiskCount != null) {
            this.RiskCount = new DspmRiskCount(source.RiskCount);
        }
        if (source.SafetyAdvice != null) {
            this.SafetyAdvice = new String(source.SafetyAdvice);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.NickName != null) {
            this.NickName = new String(source.NickName);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IdentifyId", this.IdentifyId);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "IdentifyType", this.IdentifyType);
        this.setParamObj(map, prefix + "OwnerUin.", this.OwnerUin);
        this.setParamObj(map, prefix + "CreatorUin.", this.CreatorUin);
        this.setParamSimple(map, prefix + "AssetCount", this.AssetCount);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamObj(map, prefix + "Person.", this.Person);
        this.setParamObj(map, prefix + "AssetStatistic.", this.AssetStatistic);
        this.setParamObj(map, prefix + "RiskCount.", this.RiskCount);
        this.setParamSimple(map, prefix + "SafetyAdvice", this.SafetyAdvice);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "NickName", this.NickName);
        this.setParamSimple(map, prefix + "Uin", this.Uin);

    }
}

