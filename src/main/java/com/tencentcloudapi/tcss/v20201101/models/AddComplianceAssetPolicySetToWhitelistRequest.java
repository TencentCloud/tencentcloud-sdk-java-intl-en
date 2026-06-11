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
    * Type of assets to be scanned. <li>ASSET_CONTAINER: Docker container.</li> <li>ASSET_IMAGE: Docker image.</li> <li>ASSET_HOST: Docker host.</li> <li>ASSET_K8S: Kubernetes.</li> <li>ASSET_CONTAINERD: containerd host.</li> <li>ASSET_CONTAINERD_CONTAINER: containerd container.</li>
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

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

    /**
     * Get Type of assets to be scanned. <li>ASSET_CONTAINER: Docker container.</li> <li>ASSET_IMAGE: Docker image.</li> <li>ASSET_HOST: Docker host.</li> <li>ASSET_K8S: Kubernetes.</li> <li>ASSET_CONTAINERD: containerd host.</li> <li>ASSET_CONTAINERD_CONTAINER: containerd container.</li> 
     * @return AssetType Type of assets to be scanned. <li>ASSET_CONTAINER: Docker container.</li> <li>ASSET_IMAGE: Docker image.</li> <li>ASSET_HOST: Docker host.</li> <li>ASSET_K8S: Kubernetes.</li> <li>ASSET_CONTAINERD: containerd host.</li> <li>ASSET_CONTAINERD_CONTAINER: containerd container.</li>
     */
    public String getAssetType() {
        return this.AssetType;
    }

    /**
     * Set Type of assets to be scanned. <li>ASSET_CONTAINER: Docker container.</li> <li>ASSET_IMAGE: Docker image.</li> <li>ASSET_HOST: Docker host.</li> <li>ASSET_K8S: Kubernetes.</li> <li>ASSET_CONTAINERD: containerd host.</li> <li>ASSET_CONTAINERD_CONTAINER: containerd container.</li>
     * @param AssetType Type of assets to be scanned. <li>ASSET_CONTAINER: Docker container.</li> <li>ASSET_IMAGE: Docker image.</li> <li>ASSET_HOST: Docker host.</li> <li>ASSET_K8S: Kubernetes.</li> <li>ASSET_CONTAINERD: containerd host.</li> <li>ASSET_CONTAINERD_CONTAINER: containerd container.</li>
     */
    public void setAssetType(String AssetType) {
        this.AssetType = AssetType;
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
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "AssetPolicySetList.", this.AssetPolicySetList);
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);

    }
}

