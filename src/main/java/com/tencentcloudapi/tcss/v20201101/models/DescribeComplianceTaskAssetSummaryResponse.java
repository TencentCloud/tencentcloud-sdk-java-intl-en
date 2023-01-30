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

public class DescribeComplianceTaskAssetSummaryResponse extends AbstractModel{

    /**
    * Status

`USER_UNINIT`: Not initialized.
`USER_INITIALIZING`: Initializing.
`USER_NORMAL`: Normal.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * List of aggregated information of each type of asset
    */
    @SerializedName("AssetSummaryList")
    @Expose
    private ComplianceAssetSummary [] AssetSummaryList;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Status

`USER_UNINIT`: Not initialized.
`USER_INITIALIZING`: Initializing.
`USER_NORMAL`: Normal. 
     * @return Status Status

`USER_UNINIT`: Not initialized.
`USER_INITIALIZING`: Initializing.
`USER_NORMAL`: Normal.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Status

`USER_UNINIT`: Not initialized.
`USER_INITIALIZING`: Initializing.
`USER_NORMAL`: Normal.
     * @param Status Status

`USER_UNINIT`: Not initialized.
`USER_INITIALIZING`: Initializing.
`USER_NORMAL`: Normal.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get List of aggregated information of each type of asset 
     * @return AssetSummaryList List of aggregated information of each type of asset
     */
    public ComplianceAssetSummary [] getAssetSummaryList() {
        return this.AssetSummaryList;
    }

    /**
     * Set List of aggregated information of each type of asset
     * @param AssetSummaryList List of aggregated information of each type of asset
     */
    public void setAssetSummaryList(ComplianceAssetSummary [] AssetSummaryList) {
        this.AssetSummaryList = AssetSummaryList;
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

    public DescribeComplianceTaskAssetSummaryResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeComplianceTaskAssetSummaryResponse(DescribeComplianceTaskAssetSummaryResponse source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.AssetSummaryList != null) {
            this.AssetSummaryList = new ComplianceAssetSummary[source.AssetSummaryList.length];
            for (int i = 0; i < source.AssetSummaryList.length; i++) {
                this.AssetSummaryList[i] = new ComplianceAssetSummary(source.AssetSummaryList[i]);
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
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "AssetSummaryList.", this.AssetSummaryList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

