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

public class CreateDspmWhitelistStrategyRequest extends AbstractModel {

    /**
    * <p>Policy type</p>
    */
    @SerializedName("StrategyType")
    @Expose
    private String StrategyType;

    /**
    * <p>Group account member id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>Allowlist</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Policy</p>
    */
    @SerializedName("Rule")
    @Expose
    private String Rule;

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
    * <p>Risk id</p>
    */
    @SerializedName("RiskId")
    @Expose
    private String RiskId;

    /**
    * <p>Remarks.</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>Whitelist type</p><p>Enumeration values:</p><ul><li>static_risk: allowlist rules for static configuration scan</li><li>audit: audit allowlist rules</li><li>ueba: allowlist rules related to UEBA</li></ul>
    */
    @SerializedName("WhitelistType")
    @Expose
    private String WhitelistType;

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
     * Get <p>Group account member id</p> 
     * @return MemberId <p>Group account member id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>Group account member id</p>
     * @param MemberId <p>Group account member id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>Allowlist</p> 
     * @return Name <p>Allowlist</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Allowlist</p>
     * @param Name <p>Allowlist</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Policy</p> 
     * @return Rule <p>Policy</p>
     */
    public String getRule() {
        return this.Rule;
    }

    /**
     * Set <p>Policy</p>
     * @param Rule <p>Policy</p>
     */
    public void setRule(String Rule) {
        this.Rule = Rule;
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
     * Get <p>Risk id</p> 
     * @return RiskId <p>Risk id</p>
     */
    public String getRiskId() {
        return this.RiskId;
    }

    /**
     * Set <p>Risk id</p>
     * @param RiskId <p>Risk id</p>
     */
    public void setRiskId(String RiskId) {
        this.RiskId = RiskId;
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
     * Get <p>Whitelist type</p><p>Enumeration values:</p><ul><li>static_risk: allowlist rules for static configuration scan</li><li>audit: audit allowlist rules</li><li>ueba: allowlist rules related to UEBA</li></ul> 
     * @return WhitelistType <p>Whitelist type</p><p>Enumeration values:</p><ul><li>static_risk: allowlist rules for static configuration scan</li><li>audit: audit allowlist rules</li><li>ueba: allowlist rules related to UEBA</li></ul>
     */
    public String getWhitelistType() {
        return this.WhitelistType;
    }

    /**
     * Set <p>Whitelist type</p><p>Enumeration values:</p><ul><li>static_risk: allowlist rules for static configuration scan</li><li>audit: audit allowlist rules</li><li>ueba: allowlist rules related to UEBA</li></ul>
     * @param WhitelistType <p>Whitelist type</p><p>Enumeration values:</p><ul><li>static_risk: allowlist rules for static configuration scan</li><li>audit: audit allowlist rules</li><li>ueba: allowlist rules related to UEBA</li></ul>
     */
    public void setWhitelistType(String WhitelistType) {
        this.WhitelistType = WhitelistType;
    }

    public CreateDspmWhitelistStrategyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDspmWhitelistStrategyRequest(CreateDspmWhitelistStrategyRequest source) {
        if (source.StrategyType != null) {
            this.StrategyType = new String(source.StrategyType);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Rule != null) {
            this.Rule = new String(source.Rule);
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
        if (source.RiskId != null) {
            this.RiskId = new String(source.RiskId);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.WhitelistType != null) {
            this.WhitelistType = new String(source.WhitelistType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StrategyType", this.StrategyType);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Rule", this.Rule);
        this.setParamSimple(map, prefix + "AssetId", this.AssetId);
        this.setParamSimple(map, prefix + "Account", this.Account);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "RiskId", this.RiskId);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "WhitelistType", this.WhitelistType);

    }
}

