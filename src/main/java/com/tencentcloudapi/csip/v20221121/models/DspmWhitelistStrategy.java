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

public class DspmWhitelistStrategy extends AbstractModel {

    /**
    * <p>Allowlist policy id</p>
    */
    @SerializedName("WhitelistStrategyId")
    @Expose
    private String WhitelistStrategyId;

    /**
    * <p>Policy type</p>
    */
    @SerializedName("StrategyType")
    @Expose
    private String StrategyType;

    /**
    * <p>Allowlist policy name</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Policy type</p>
    */
    @SerializedName("StrategyCategory")
    @Expose
    private String StrategyCategory;

    /**
    * <p>Policy rule</p>
    */
    @SerializedName("Rule")
    @Expose
    private String Rule;

    /**
    * <p>Remarks.</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>Modification time.</p>
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * <p>Asset id</p>
    */
    @SerializedName("AssetId")
    @Expose
    private String AssetId;

    /**
    * <p>Account</p>
    */
    @SerializedName("Account")
    @Expose
    private String Account;

    /**
    * <p>Host</p>
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * <p>Policy rule content description</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>Allowlist type. risk - risk allowlist; alarm - alarm allowlist.</p>
    */
    @SerializedName("RiskType")
    @Expose
    private String RiskType;

    /**
    * <p>app id of the asset's associated account</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>Account nickname</p>
    */
    @SerializedName("NickName")
    @Expose
    private String NickName;

    /**
    * <p>uin of the associated account of the asset</p>
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * <p>Type of allowlist</p>
    */
    @SerializedName("WhitelistType")
    @Expose
    private String WhitelistType;

    /**
     * Get <p>Allowlist policy id</p> 
     * @return WhitelistStrategyId <p>Allowlist policy id</p>
     */
    public String getWhitelistStrategyId() {
        return this.WhitelistStrategyId;
    }

    /**
     * Set <p>Allowlist policy id</p>
     * @param WhitelistStrategyId <p>Allowlist policy id</p>
     */
    public void setWhitelistStrategyId(String WhitelistStrategyId) {
        this.WhitelistStrategyId = WhitelistStrategyId;
    }

    /**
     * Get <p>Policy type</p> 
     * @return StrategyType <p>Policy type</p>
     */
    public String getStrategyType() {
        return this.StrategyType;
    }

    /**
     * Set <p>Policy type</p>
     * @param StrategyType <p>Policy type</p>
     */
    public void setStrategyType(String StrategyType) {
        this.StrategyType = StrategyType;
    }

    /**
     * Get <p>Allowlist policy name</p> 
     * @return Name <p>Allowlist policy name</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Allowlist policy name</p>
     * @param Name <p>Allowlist policy name</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Policy type</p> 
     * @return StrategyCategory <p>Policy type</p>
     */
    public String getStrategyCategory() {
        return this.StrategyCategory;
    }

    /**
     * Set <p>Policy type</p>
     * @param StrategyCategory <p>Policy type</p>
     */
    public void setStrategyCategory(String StrategyCategory) {
        this.StrategyCategory = StrategyCategory;
    }

    /**
     * Get <p>Policy rule</p> 
     * @return Rule <p>Policy rule</p>
     */
    public String getRule() {
        return this.Rule;
    }

    /**
     * Set <p>Policy rule</p>
     * @param Rule <p>Policy rule</p>
     */
    public void setRule(String Rule) {
        this.Rule = Rule;
    }

    /**
     * Get <p>Remarks.</p> 
     * @return Remark <p>Remarks.</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>Remarks.</p>
     * @param Remark <p>Remarks.</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>Modification time.</p> 
     * @return ModifyTime <p>Modification time.</p>
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set <p>Modification time.</p>
     * @param ModifyTime <p>Modification time.</p>
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get <p>Asset id</p> 
     * @return AssetId <p>Asset id</p>
     */
    public String getAssetId() {
        return this.AssetId;
    }

    /**
     * Set <p>Asset id</p>
     * @param AssetId <p>Asset id</p>
     */
    public void setAssetId(String AssetId) {
        this.AssetId = AssetId;
    }

    /**
     * Get <p>Account</p> 
     * @return Account <p>Account</p>
     */
    public String getAccount() {
        return this.Account;
    }

    /**
     * Set <p>Account</p>
     * @param Account <p>Account</p>
     */
    public void setAccount(String Account) {
        this.Account = Account;
    }

    /**
     * Get <p>Host</p> 
     * @return Host <p>Host</p>
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set <p>Host</p>
     * @param Host <p>Host</p>
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get <p>Policy rule content description</p> 
     * @return Description <p>Policy rule content description</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Policy rule content description</p>
     * @param Description <p>Policy rule content description</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>Allowlist type. risk - risk allowlist; alarm - alarm allowlist.</p> 
     * @return RiskType <p>Allowlist type. risk - risk allowlist; alarm - alarm allowlist.</p>
     */
    public String getRiskType() {
        return this.RiskType;
    }

    /**
     * Set <p>Allowlist type. risk - risk allowlist; alarm - alarm allowlist.</p>
     * @param RiskType <p>Allowlist type. risk - risk allowlist; alarm - alarm allowlist.</p>
     */
    public void setRiskType(String RiskType) {
        this.RiskType = RiskType;
    }

    /**
     * Get <p>app id of the asset's associated account</p> 
     * @return AppId <p>app id of the asset's associated account</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>app id of the asset's associated account</p>
     * @param AppId <p>app id of the asset's associated account</p>
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>Account nickname</p> 
     * @return NickName <p>Account nickname</p>
     */
    public String getNickName() {
        return this.NickName;
    }

    /**
     * Set <p>Account nickname</p>
     * @param NickName <p>Account nickname</p>
     */
    public void setNickName(String NickName) {
        this.NickName = NickName;
    }

    /**
     * Get <p>uin of the associated account of the asset</p> 
     * @return Uin <p>uin of the associated account of the asset</p>
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set <p>uin of the associated account of the asset</p>
     * @param Uin <p>uin of the associated account of the asset</p>
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get <p>Type of allowlist</p> 
     * @return WhitelistType <p>Type of allowlist</p>
     */
    public String getWhitelistType() {
        return this.WhitelistType;
    }

    /**
     * Set <p>Type of allowlist</p>
     * @param WhitelistType <p>Type of allowlist</p>
     */
    public void setWhitelistType(String WhitelistType) {
        this.WhitelistType = WhitelistType;
    }

    public DspmWhitelistStrategy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspmWhitelistStrategy(DspmWhitelistStrategy source) {
        if (source.WhitelistStrategyId != null) {
            this.WhitelistStrategyId = new String(source.WhitelistStrategyId);
        }
        if (source.StrategyType != null) {
            this.StrategyType = new String(source.StrategyType);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.StrategyCategory != null) {
            this.StrategyCategory = new String(source.StrategyCategory);
        }
        if (source.Rule != null) {
            this.Rule = new String(source.Rule);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.AssetId != null) {
            this.AssetId = new String(source.AssetId);
        }
        if (source.Account != null) {
            this.Account = new String(source.Account);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.RiskType != null) {
            this.RiskType = new String(source.RiskType);
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
        if (source.WhitelistType != null) {
            this.WhitelistType = new String(source.WhitelistType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WhitelistStrategyId", this.WhitelistStrategyId);
        this.setParamSimple(map, prefix + "StrategyType", this.StrategyType);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "StrategyCategory", this.StrategyCategory);
        this.setParamSimple(map, prefix + "Rule", this.Rule);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "AssetId", this.AssetId);
        this.setParamSimple(map, prefix + "Account", this.Account);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "RiskType", this.RiskType);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "NickName", this.NickName);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "WhitelistType", this.WhitelistType);

    }
}

