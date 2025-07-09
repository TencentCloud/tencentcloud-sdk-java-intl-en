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

public class AddComplianceAssetPolicySetToWhitelistRequest extends AbstractModel {

    /**
    * List of asset IDs and check item IDs
    */
    @SerializedName("AssetPolicySetList")
    @Expose
    private ComplianceAssetPolicySetItem [] AssetPolicySetList;

    /**
     * Get List of asset IDs and check item IDs 
     * @return AssetPolicySetList List of asset IDs and check item IDs
     */
    public ComplianceAssetPolicySetItem [] getAssetPolicySetList() {
        return this.AssetPolicySetList;
    }

    /**
     * Set List of asset IDs and check item IDs
     * @param AssetPolicySetList List of asset IDs and check item IDs
     */
    public void setAssetPolicySetList(ComplianceAssetPolicySetItem [] AssetPolicySetList) {
        this.AssetPolicySetList = AssetPolicySetList;
    }

    public AddComplianceAssetPolicySetToWhitelistRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddComplianceAssetPolicySetToWhitelistRequest(AddComplianceAssetPolicySetToWhitelistRequest source) {
        if (source.AssetPolicySetList != null) {
            this.AssetPolicySetList = new ComplianceAssetPolicySetItem[source.AssetPolicySetList.length];
            for (int i = 0; i < source.AssetPolicySetList.length; i++) {
                this.AssetPolicySetList[i] = new ComplianceAssetPolicySetItem(source.AssetPolicySetList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "AssetPolicySetList.", this.AssetPolicySetList);

    }
}

