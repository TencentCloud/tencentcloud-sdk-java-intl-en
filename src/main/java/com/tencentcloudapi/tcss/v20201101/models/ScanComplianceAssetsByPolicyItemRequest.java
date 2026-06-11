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

public class ScanComplianceAssetsByPolicyItemRequest extends AbstractModel {

    /**
    * ID of the specified check item
    */
    @SerializedName("CustomerPolicyItemId")
    @Expose
    private Long CustomerPolicyItemId;

    /**
    * List of IDs of customer assets to be scanned again
    */
    @SerializedName("CustomerAssetIdSet")
    @Expose
    private Long [] CustomerAssetIdSet;

    /**
    * Type of assets to be scanned. <li>ASSET_CONTAINER: Docker container.</li> <li>ASSET_IMAGE: Docker image.</li> <li>ASSET_HOST: Docker host.</li> <li>ASSET_K8S: Kubernetes.</li> <li>ASSET_CONTAINERD: containerd host.</li> <li>ASSET_CONTAINERD_CONTAINER: containerd container.</li>
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
     * Get ID of the specified check item 
     * @return CustomerPolicyItemId ID of the specified check item
     */
    public Long getCustomerPolicyItemId() {
        return this.CustomerPolicyItemId;
    }

    /**
     * Set ID of the specified check item
     * @param CustomerPolicyItemId ID of the specified check item
     */
    public void setCustomerPolicyItemId(Long CustomerPolicyItemId) {
        this.CustomerPolicyItemId = CustomerPolicyItemId;
    }

    /**
     * Get List of IDs of customer assets to be scanned again 
     * @return CustomerAssetIdSet List of IDs of customer assets to be scanned again
     */
    public Long [] getCustomerAssetIdSet() {
        return this.CustomerAssetIdSet;
    }

    /**
     * Set List of IDs of customer assets to be scanned again
     * @param CustomerAssetIdSet List of IDs of customer assets to be scanned again
     */
    public void setCustomerAssetIdSet(Long [] CustomerAssetIdSet) {
        this.CustomerAssetIdSet = CustomerAssetIdSet;
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

    public ScanComplianceAssetsByPolicyItemRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScanComplianceAssetsByPolicyItemRequest(ScanComplianceAssetsByPolicyItemRequest source) {
        if (source.CustomerPolicyItemId != null) {
            this.CustomerPolicyItemId = new Long(source.CustomerPolicyItemId);
        }
        if (source.CustomerAssetIdSet != null) {
            this.CustomerAssetIdSet = new Long[source.CustomerAssetIdSet.length];
            for (int i = 0; i < source.CustomerAssetIdSet.length; i++) {
                this.CustomerAssetIdSet[i] = new Long(source.CustomerAssetIdSet[i]);
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
        this.setParamSimple(map, prefix + "CustomerPolicyItemId", this.CustomerPolicyItemId);
        this.setParamArraySimple(map, prefix + "CustomerAssetIdSet.", this.CustomerAssetIdSet);
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);

    }
}

