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

public class DescribeComplianceTaskAssetSummaryRequest extends AbstractModel {

    /**
    * List of asset types
`ASSET_CONTAINER`: Container.
`ASSET_IMAGE`: Image.
`ASSET_HOST`: Server.
`ASSET_K8S`: K8s asset.
    */
    @SerializedName("AssetTypeSet")
    @Expose
    private String [] AssetTypeSet;

    /**
     * Get List of asset types
`ASSET_CONTAINER`: Container.
`ASSET_IMAGE`: Image.
`ASSET_HOST`: Server.
`ASSET_K8S`: K8s asset. 
     * @return AssetTypeSet List of asset types
`ASSET_CONTAINER`: Container.
`ASSET_IMAGE`: Image.
`ASSET_HOST`: Server.
`ASSET_K8S`: K8s asset.
     */
    public String [] getAssetTypeSet() {
        return this.AssetTypeSet;
    }

    /**
     * Set List of asset types
`ASSET_CONTAINER`: Container.
`ASSET_IMAGE`: Image.
`ASSET_HOST`: Server.
`ASSET_K8S`: K8s asset.
     * @param AssetTypeSet List of asset types
`ASSET_CONTAINER`: Container.
`ASSET_IMAGE`: Image.
`ASSET_HOST`: Server.
`ASSET_K8S`: K8s asset.
     */
    public void setAssetTypeSet(String [] AssetTypeSet) {
        this.AssetTypeSet = AssetTypeSet;
    }

    public DescribeComplianceTaskAssetSummaryRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeComplianceTaskAssetSummaryRequest(DescribeComplianceTaskAssetSummaryRequest source) {
        if (source.AssetTypeSet != null) {
            this.AssetTypeSet = new String[source.AssetTypeSet.length];
            for (int i = 0; i < source.AssetTypeSet.length; i++) {
                this.AssetTypeSet[i] = new String(source.AssetTypeSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "AssetTypeSet.", this.AssetTypeSet);

    }
}

