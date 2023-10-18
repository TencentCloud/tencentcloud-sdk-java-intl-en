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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAffectedWorkloadListResponse extends AbstractModel {

    /**
    * Number of affected workloads
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * List of affected workloads
    */
    @SerializedName("AffectedWorkloadList")
    @Expose
    private AffectedWorkloadItem [] AffectedWorkloadList;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Number of affected workloads 
     * @return TotalCount Number of affected workloads
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Number of affected workloads
     * @param TotalCount Number of affected workloads
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get List of affected workloads 
     * @return AffectedWorkloadList List of affected workloads
     */
    public AffectedWorkloadItem [] getAffectedWorkloadList() {
        return this.AffectedWorkloadList;
    }

    /**
     * Set List of affected workloads
     * @param AffectedWorkloadList List of affected workloads
     */
    public void setAffectedWorkloadList(AffectedWorkloadItem [] AffectedWorkloadList) {
        this.AffectedWorkloadList = AffectedWorkloadList;
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

    public DescribeAffectedWorkloadListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAffectedWorkloadListResponse(DescribeAffectedWorkloadListResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.AffectedWorkloadList != null) {
            this.AffectedWorkloadList = new AffectedWorkloadItem[source.AffectedWorkloadList.length];
            for (int i = 0; i < source.AffectedWorkloadList.length; i++) {
                this.AffectedWorkloadList[i] = new AffectedWorkloadItem(source.AffectedWorkloadList[i]);
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
        this.setParamArrayObj(map, prefix + "AffectedWorkloadList.", this.AffectedWorkloadList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

