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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteCompliancePolicyAssetSetFromWhitelistRequest extends AbstractModel {

    /**
    * List of check item IDs and asset IDs
    */
    @SerializedName("PolicyAssetSetList")
    @Expose
    private CompliancePolicyAssetSetItem [] PolicyAssetSetList;

    /**
     * Get List of check item IDs and asset IDs 
     * @return PolicyAssetSetList List of check item IDs and asset IDs
     */
    public CompliancePolicyAssetSetItem [] getPolicyAssetSetList() {
        return this.PolicyAssetSetList;
    }

    /**
     * Set List of check item IDs and asset IDs
     * @param PolicyAssetSetList List of check item IDs and asset IDs
     */
    public void setPolicyAssetSetList(CompliancePolicyAssetSetItem [] PolicyAssetSetList) {
        this.PolicyAssetSetList = PolicyAssetSetList;
    }

    public DeleteCompliancePolicyAssetSetFromWhitelistRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteCompliancePolicyAssetSetFromWhitelistRequest(DeleteCompliancePolicyAssetSetFromWhitelistRequest source) {
        if (source.PolicyAssetSetList != null) {
            this.PolicyAssetSetList = new CompliancePolicyAssetSetItem[source.PolicyAssetSetList.length];
            for (int i = 0; i < source.PolicyAssetSetList.length; i++) {
                this.PolicyAssetSetList[i] = new CompliancePolicyAssetSetItem(source.PolicyAssetSetList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "PolicyAssetSetList.", this.PolicyAssetSetList);

    }
}

