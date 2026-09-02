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

public class ModifyDspmAssetAccountRequest extends AbstractModel {

    /**
    * Instance ID.
    */
    @SerializedName("AssetId")
    @Expose
    private String AssetId;

    /**
    * Account name.
    */
    @SerializedName("Account")
    @Expose
    private String Account;

    /**
    * Group Account Member ID
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * Host address
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * Account type.
    */
    @SerializedName("AccountType")
    @Expose
    private Long AccountType;

    /**
    * Remarks
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Risk id
    */
    @SerializedName("RiskId")
    @Expose
    private String RiskId;

    /**
     * Get Instance ID. 
     * @return AssetId Instance ID.
     */
    public String getAssetId() {
        return this.AssetId;
    }

    /**
     * Set Instance ID.
     * @param AssetId Instance ID.
     */
    public void setAssetId(String AssetId) {
        this.AssetId = AssetId;
    }

    /**
     * Get Account name. 
     * @return Account Account name.
     */
    public String getAccount() {
        return this.Account;
    }

    /**
     * Set Account name.
     * @param Account Account name.
     */
    public void setAccount(String Account) {
        this.Account = Account;
    }

    /**
     * Get Group Account Member ID 
     * @return MemberId Group Account Member ID
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set Group Account Member ID
     * @param MemberId Group Account Member ID
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get Host address 
     * @return Host Host address
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set Host address
     * @param Host Host address
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get Account type. 
     * @return AccountType Account type.
     */
    public Long getAccountType() {
        return this.AccountType;
    }

    /**
     * Set Account type.
     * @param AccountType Account type.
     */
    public void setAccountType(Long AccountType) {
        this.AccountType = AccountType;
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
     * Get Risk id 
     * @return RiskId Risk id
     */
    public String getRiskId() {
        return this.RiskId;
    }

    /**
     * Set Risk id
     * @param RiskId Risk id
     */
    public void setRiskId(String RiskId) {
        this.RiskId = RiskId;
    }

    public ModifyDspmAssetAccountRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDspmAssetAccountRequest(ModifyDspmAssetAccountRequest source) {
        if (source.AssetId != null) {
            this.AssetId = new String(source.AssetId);
        }
        if (source.Account != null) {
            this.Account = new String(source.Account);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.AccountType != null) {
            this.AccountType = new Long(source.AccountType);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.RiskId != null) {
            this.RiskId = new String(source.RiskId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AssetId", this.AssetId);
        this.setParamSimple(map, prefix + "Account", this.Account);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "AccountType", this.AccountType);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "RiskId", this.RiskId);

    }
}

