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

public class ModifyDspmAssetAccountPrivilegesRequest extends AbstractModel {

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
    * Permission information
    */
    @SerializedName("Privilege")
    @Expose
    private DspmDbAccountPrivilege Privilege;

    /**
    * Host address
    */
    @SerializedName("Host")
    @Expose
    private String Host;

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
     * Get Permission information 
     * @return Privilege Permission information
     */
    public DspmDbAccountPrivilege getPrivilege() {
        return this.Privilege;
    }

    /**
     * Set Permission information
     * @param Privilege Permission information
     */
    public void setPrivilege(DspmDbAccountPrivilege Privilege) {
        this.Privilege = Privilege;
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

    public ModifyDspmAssetAccountPrivilegesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDspmAssetAccountPrivilegesRequest(ModifyDspmAssetAccountPrivilegesRequest source) {
        if (source.AssetId != null) {
            this.AssetId = new String(source.AssetId);
        }
        if (source.Account != null) {
            this.Account = new String(source.Account);
        }
        if (source.Privilege != null) {
            this.Privilege = new DspmDbAccountPrivilege(source.Privilege);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
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
        this.setParamObj(map, prefix + "Privilege.", this.Privilege);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "RiskId", this.RiskId);

    }
}

