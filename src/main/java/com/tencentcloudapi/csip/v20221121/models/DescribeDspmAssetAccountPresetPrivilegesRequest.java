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

public class DescribeDspmAssetAccountPresetPrivilegesRequest extends AbstractModel {

    /**
    * Asset ID
    */
    @SerializedName("AssetId")
    @Expose
    private String AssetId;

    /**
    * Account
    */
    @SerializedName("Account")
    @Expose
    private String Account;

    /**
    * Address.
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * Filter.
    */
    @SerializedName("Filter")
    @Expose
    private Filter Filter;

    /**
     * Get Asset ID 
     * @return AssetId Asset ID
     */
    public String getAssetId() {
        return this.AssetId;
    }

    /**
     * Set Asset ID
     * @param AssetId Asset ID
     */
    public void setAssetId(String AssetId) {
        this.AssetId = AssetId;
    }

    /**
     * Get Account 
     * @return Account Account
     */
    public String getAccount() {
        return this.Account;
    }

    /**
     * Set Account
     * @param Account Account
     */
    public void setAccount(String Account) {
        this.Account = Account;
    }

    /**
     * Get Address. 
     * @return Host Address.
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set Address.
     * @param Host Address.
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get Filter. 
     * @return Filter Filter.
     */
    public Filter getFilter() {
        return this.Filter;
    }

    /**
     * Set Filter.
     * @param Filter Filter.
     */
    public void setFilter(Filter Filter) {
        this.Filter = Filter;
    }

    public DescribeDspmAssetAccountPresetPrivilegesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDspmAssetAccountPresetPrivilegesRequest(DescribeDspmAssetAccountPresetPrivilegesRequest source) {
        if (source.AssetId != null) {
            this.AssetId = new String(source.AssetId);
        }
        if (source.Account != null) {
            this.Account = new String(source.Account);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.Filter != null) {
            this.Filter = new Filter(source.Filter);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AssetId", this.AssetId);
        this.setParamSimple(map, prefix + "Account", this.Account);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamObj(map, prefix + "Filter.", this.Filter);

    }
}

