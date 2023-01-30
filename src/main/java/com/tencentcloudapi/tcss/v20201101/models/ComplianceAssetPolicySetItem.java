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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ComplianceAssetPolicySetItem extends AbstractModel{

    /**
    * Asset ID
    */
    @SerializedName("CustomerAssetItemId")
    @Expose
    private Long CustomerAssetItemId;

    /**
    * List of IDs of check items to be ignored in the specified asset. If it is empty, it indicates all.
    */
    @SerializedName("CustomerPolicyItemIdSet")
    @Expose
    private Long [] CustomerPolicyItemIdSet;

    /**
     * Get Asset ID 
     * @return CustomerAssetItemId Asset ID
     */
    public Long getCustomerAssetItemId() {
        return this.CustomerAssetItemId;
    }

    /**
     * Set Asset ID
     * @param CustomerAssetItemId Asset ID
     */
    public void setCustomerAssetItemId(Long CustomerAssetItemId) {
        this.CustomerAssetItemId = CustomerAssetItemId;
    }

    /**
     * Get List of IDs of check items to be ignored in the specified asset. If it is empty, it indicates all. 
     * @return CustomerPolicyItemIdSet List of IDs of check items to be ignored in the specified asset. If it is empty, it indicates all.
     */
    public Long [] getCustomerPolicyItemIdSet() {
        return this.CustomerPolicyItemIdSet;
    }

    /**
     * Set List of IDs of check items to be ignored in the specified asset. If it is empty, it indicates all.
     * @param CustomerPolicyItemIdSet List of IDs of check items to be ignored in the specified asset. If it is empty, it indicates all.
     */
    public void setCustomerPolicyItemIdSet(Long [] CustomerPolicyItemIdSet) {
        this.CustomerPolicyItemIdSet = CustomerPolicyItemIdSet;
    }

    public ComplianceAssetPolicySetItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComplianceAssetPolicySetItem(ComplianceAssetPolicySetItem source) {
        if (source.CustomerAssetItemId != null) {
            this.CustomerAssetItemId = new Long(source.CustomerAssetItemId);
        }
        if (source.CustomerPolicyItemIdSet != null) {
            this.CustomerPolicyItemIdSet = new Long[source.CustomerPolicyItemIdSet.length];
            for (int i = 0; i < source.CustomerPolicyItemIdSet.length; i++) {
                this.CustomerPolicyItemIdSet[i] = new Long(source.CustomerPolicyItemIdSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CustomerAssetItemId", this.CustomerAssetItemId);
        this.setParamArraySimple(map, prefix + "CustomerPolicyItemIdSet.", this.CustomerPolicyItemIdSet);

    }
}

