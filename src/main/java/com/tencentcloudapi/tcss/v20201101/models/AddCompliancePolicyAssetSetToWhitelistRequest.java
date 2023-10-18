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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddCompliancePolicyAssetSetToWhitelistRequest extends AbstractModel {

    /**
    * Check item ID
    */
    @SerializedName("CustomerPolicyItemId")
    @Expose
    private Long CustomerPolicyItemId;

    /**
    * List of IDs of assets to be ignored in the specified check item
    */
    @SerializedName("CustomerAssetItemIdSet")
    @Expose
    private Long [] CustomerAssetItemIdSet;

    /**
     * Get Check item ID 
     * @return CustomerPolicyItemId Check item ID
     */
    public Long getCustomerPolicyItemId() {
        return this.CustomerPolicyItemId;
    }

    /**
     * Set Check item ID
     * @param CustomerPolicyItemId Check item ID
     */
    public void setCustomerPolicyItemId(Long CustomerPolicyItemId) {
        this.CustomerPolicyItemId = CustomerPolicyItemId;
    }

    /**
     * Get List of IDs of assets to be ignored in the specified check item 
     * @return CustomerAssetItemIdSet List of IDs of assets to be ignored in the specified check item
     */
    public Long [] getCustomerAssetItemIdSet() {
        return this.CustomerAssetItemIdSet;
    }

    /**
     * Set List of IDs of assets to be ignored in the specified check item
     * @param CustomerAssetItemIdSet List of IDs of assets to be ignored in the specified check item
     */
    public void setCustomerAssetItemIdSet(Long [] CustomerAssetItemIdSet) {
        this.CustomerAssetItemIdSet = CustomerAssetItemIdSet;
    }

    public AddCompliancePolicyAssetSetToWhitelistRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddCompliancePolicyAssetSetToWhitelistRequest(AddCompliancePolicyAssetSetToWhitelistRequest source) {
        if (source.CustomerPolicyItemId != null) {
            this.CustomerPolicyItemId = new Long(source.CustomerPolicyItemId);
        }
        if (source.CustomerAssetItemIdSet != null) {
            this.CustomerAssetItemIdSet = new Long[source.CustomerAssetItemIdSet.length];
            for (int i = 0; i < source.CustomerAssetItemIdSet.length; i++) {
                this.CustomerAssetItemIdSet[i] = new Long(source.CustomerAssetItemIdSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CustomerPolicyItemId", this.CustomerPolicyItemId);
        this.setParamArraySimple(map, prefix + "CustomerAssetItemIdSet.", this.CustomerAssetItemIdSet);

    }
}

