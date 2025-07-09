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

public class CreateComplianceTaskRequest extends AbstractModel {

    /**
    * List of asset types to be scanned
`ASSET_CONTAINER`: Container.
`ASSET_IMAGE`: Image.
`ASSET_HOST`: Server.
`ASSET_K8S`: K8s asset.
A valid value must be entered for the `AssetTypeSet`, `PolicySetId`, or `PeriodTaskId` parameter.
    */
    @SerializedName("AssetTypeSet")
    @Expose
    private String [] AssetTypeSet;

    /**
    * Policy set ID
    */
    @SerializedName("PolicySetId")
    @Expose
    private Long PolicySetId;

    /**
    * Scheduled task ID
    */
    @SerializedName("PeriodTaskId")
    @Expose
    private Long PeriodTaskId;

    /**
     * Get List of asset types to be scanned
`ASSET_CONTAINER`: Container.
`ASSET_IMAGE`: Image.
`ASSET_HOST`: Server.
`ASSET_K8S`: K8s asset.
A valid value must be entered for the `AssetTypeSet`, `PolicySetId`, or `PeriodTaskId` parameter. 
     * @return AssetTypeSet List of asset types to be scanned
`ASSET_CONTAINER`: Container.
`ASSET_IMAGE`: Image.
`ASSET_HOST`: Server.
`ASSET_K8S`: K8s asset.
A valid value must be entered for the `AssetTypeSet`, `PolicySetId`, or `PeriodTaskId` parameter.
     */
    public String [] getAssetTypeSet() {
        return this.AssetTypeSet;
    }

    /**
     * Set List of asset types to be scanned
`ASSET_CONTAINER`: Container.
`ASSET_IMAGE`: Image.
`ASSET_HOST`: Server.
`ASSET_K8S`: K8s asset.
A valid value must be entered for the `AssetTypeSet`, `PolicySetId`, or `PeriodTaskId` parameter.
     * @param AssetTypeSet List of asset types to be scanned
`ASSET_CONTAINER`: Container.
`ASSET_IMAGE`: Image.
`ASSET_HOST`: Server.
`ASSET_K8S`: K8s asset.
A valid value must be entered for the `AssetTypeSet`, `PolicySetId`, or `PeriodTaskId` parameter.
     */
    public void setAssetTypeSet(String [] AssetTypeSet) {
        this.AssetTypeSet = AssetTypeSet;
    }

    /**
     * Get Policy set ID 
     * @return PolicySetId Policy set ID
     */
    public Long getPolicySetId() {
        return this.PolicySetId;
    }

    /**
     * Set Policy set ID
     * @param PolicySetId Policy set ID
     */
    public void setPolicySetId(Long PolicySetId) {
        this.PolicySetId = PolicySetId;
    }

    /**
     * Get Scheduled task ID 
     * @return PeriodTaskId Scheduled task ID
     */
    public Long getPeriodTaskId() {
        return this.PeriodTaskId;
    }

    /**
     * Set Scheduled task ID
     * @param PeriodTaskId Scheduled task ID
     */
    public void setPeriodTaskId(Long PeriodTaskId) {
        this.PeriodTaskId = PeriodTaskId;
    }

    public CreateComplianceTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateComplianceTaskRequest(CreateComplianceTaskRequest source) {
        if (source.AssetTypeSet != null) {
            this.AssetTypeSet = new String[source.AssetTypeSet.length];
            for (int i = 0; i < source.AssetTypeSet.length; i++) {
                this.AssetTypeSet[i] = new String(source.AssetTypeSet[i]);
            }
        }
        if (source.PolicySetId != null) {
            this.PolicySetId = new Long(source.PolicySetId);
        }
        if (source.PeriodTaskId != null) {
            this.PeriodTaskId = new Long(source.PeriodTaskId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "AssetTypeSet.", this.AssetTypeSet);
        this.setParamSimple(map, prefix + "PolicySetId", this.PolicySetId);
        this.setParamSimple(map, prefix + "PeriodTaskId", this.PeriodTaskId);

    }
}

