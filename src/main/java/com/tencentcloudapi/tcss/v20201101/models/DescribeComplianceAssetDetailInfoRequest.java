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

public class DescribeComplianceAssetDetailInfoRequest extends AbstractModel {

    /**
    * Customer asset ID
    */
    @SerializedName("CustomerAssetId")
    @Expose
    private Long CustomerAssetId;

    /**
    * Asset type. <li>ASSET_CONTAINER: Docker container.</li> <li>ASSET_IMAGE: Docker image.</li> <li>ASSET_HOST: Docker host.</li> <li>ASSET_K8S: Kubernetes.</li> <li>ASSET_CONTAINERD: Containerd host.</li> <li>ASSET_CONTAINERD_CONTAINER: Containerd container.</li>
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
     * Get Customer asset ID 
     * @return CustomerAssetId Customer asset ID
     */
    public Long getCustomerAssetId() {
        return this.CustomerAssetId;
    }

    /**
     * Set Customer asset ID
     * @param CustomerAssetId Customer asset ID
     */
    public void setCustomerAssetId(Long CustomerAssetId) {
        this.CustomerAssetId = CustomerAssetId;
    }

    /**
     * Get Asset type. <li>ASSET_CONTAINER: Docker container.</li> <li>ASSET_IMAGE: Docker image.</li> <li>ASSET_HOST: Docker host.</li> <li>ASSET_K8S: Kubernetes.</li> <li>ASSET_CONTAINERD: Containerd host.</li> <li>ASSET_CONTAINERD_CONTAINER: Containerd container.</li> 
     * @return AssetType Asset type. <li>ASSET_CONTAINER: Docker container.</li> <li>ASSET_IMAGE: Docker image.</li> <li>ASSET_HOST: Docker host.</li> <li>ASSET_K8S: Kubernetes.</li> <li>ASSET_CONTAINERD: Containerd host.</li> <li>ASSET_CONTAINERD_CONTAINER: Containerd container.</li>
     */
    public String getAssetType() {
        return this.AssetType;
    }

    /**
     * Set Asset type. <li>ASSET_CONTAINER: Docker container.</li> <li>ASSET_IMAGE: Docker image.</li> <li>ASSET_HOST: Docker host.</li> <li>ASSET_K8S: Kubernetes.</li> <li>ASSET_CONTAINERD: Containerd host.</li> <li>ASSET_CONTAINERD_CONTAINER: Containerd container.</li>
     * @param AssetType Asset type. <li>ASSET_CONTAINER: Docker container.</li> <li>ASSET_IMAGE: Docker image.</li> <li>ASSET_HOST: Docker host.</li> <li>ASSET_K8S: Kubernetes.</li> <li>ASSET_CONTAINERD: Containerd host.</li> <li>ASSET_CONTAINERD_CONTAINER: Containerd container.</li>
     */
    public void setAssetType(String AssetType) {
        this.AssetType = AssetType;
    }

    public DescribeComplianceAssetDetailInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeComplianceAssetDetailInfoRequest(DescribeComplianceAssetDetailInfoRequest source) {
        if (source.CustomerAssetId != null) {
            this.CustomerAssetId = new Long(source.CustomerAssetId);
        }
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CustomerAssetId", this.CustomerAssetId);
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);

    }
}

