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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTagRetentionExecutionResponse extends AbstractModel {

    /**
    * List of tag retention execution records
    */
    @SerializedName("RetentionExecutionList")
    @Expose
    private RetentionExecution [] RetentionExecutionList;

    /**
    * Total number of tag retention execution records
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get List of tag retention execution records 
     * @return RetentionExecutionList List of tag retention execution records
     */
    public RetentionExecution [] getRetentionExecutionList() {
        return this.RetentionExecutionList;
    }

    /**
     * Set List of tag retention execution records
     * @param RetentionExecutionList List of tag retention execution records
     */
    public void setRetentionExecutionList(RetentionExecution [] RetentionExecutionList) {
        this.RetentionExecutionList = RetentionExecutionList;
    }

    /**
     * Get Total number of tag retention execution records 
     * @return TotalCount Total number of tag retention execution records
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number of tag retention execution records
     * @param TotalCount Total number of tag retention execution records
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     * @param RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeTagRetentionExecutionResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTagRetentionExecutionResponse(DescribeTagRetentionExecutionResponse source) {
        if (source.RetentionExecutionList != null) {
            this.RetentionExecutionList = new RetentionExecution[source.RetentionExecutionList.length];
            for (int i = 0; i < source.RetentionExecutionList.length; i++) {
                this.RetentionExecutionList[i] = new RetentionExecution(source.RetentionExecutionList[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "RetentionExecutionList.", this.RetentionExecutionList);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

