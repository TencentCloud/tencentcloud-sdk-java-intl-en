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

public class DescribeComplianceAssetPolicyItemListResponse extends AbstractModel{

    /**
    * Total number of check items, which is `0` if the baseline check is not enabled.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * List of check items of an asset
    */
    @SerializedName("AssetPolicyItemList")
    @Expose
    private ComplianceAssetPolicyItem [] AssetPolicyItemList;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Total number of check items, which is `0` if the baseline check is not enabled. 
     * @return TotalCount Total number of check items, which is `0` if the baseline check is not enabled.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number of check items, which is `0` if the baseline check is not enabled.
     * @param TotalCount Total number of check items, which is `0` if the baseline check is not enabled.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get List of check items of an asset 
     * @return AssetPolicyItemList List of check items of an asset
     */
    public ComplianceAssetPolicyItem [] getAssetPolicyItemList() {
        return this.AssetPolicyItemList;
    }

    /**
     * Set List of check items of an asset
     * @param AssetPolicyItemList List of check items of an asset
     */
    public void setAssetPolicyItemList(ComplianceAssetPolicyItem [] AssetPolicyItemList) {
        this.AssetPolicyItemList = AssetPolicyItemList;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeComplianceAssetPolicyItemListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeComplianceAssetPolicyItemListResponse(DescribeComplianceAssetPolicyItemListResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.AssetPolicyItemList != null) {
            this.AssetPolicyItemList = new ComplianceAssetPolicyItem[source.AssetPolicyItemList.length];
            for (int i = 0; i < source.AssetPolicyItemList.length; i++) {
                this.AssetPolicyItemList[i] = new ComplianceAssetPolicyItem(source.AssetPolicyItemList[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "AssetPolicyItemList.", this.AssetPolicyItemList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

