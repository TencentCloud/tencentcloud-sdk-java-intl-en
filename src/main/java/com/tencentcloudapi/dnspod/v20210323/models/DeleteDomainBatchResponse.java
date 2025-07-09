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
package com.tencentcloudapi.dnspod.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteDomainBatchResponse extends AbstractModel {

    /**
    * The task ID.
    */
    @SerializedName("JobId")
    @Expose
    private Long JobId;

    /**
    * The array of task details.
    */
    @SerializedName("DetailList")
    @Expose
    private DeleteDomainBatchDetail [] DetailList;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The task ID. 
     * @return JobId The task ID.
     */
    public Long getJobId() {
        return this.JobId;
    }

    /**
     * Set The task ID.
     * @param JobId The task ID.
     */
    public void setJobId(Long JobId) {
        this.JobId = JobId;
    }

    /**
     * Get The array of task details. 
     * @return DetailList The array of task details.
     */
    public DeleteDomainBatchDetail [] getDetailList() {
        return this.DetailList;
    }

    /**
     * Set The array of task details.
     * @param DetailList The array of task details.
     */
    public void setDetailList(DeleteDomainBatchDetail [] DetailList) {
        this.DetailList = DetailList;
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

    public DeleteDomainBatchResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteDomainBatchResponse(DeleteDomainBatchResponse source) {
        if (source.JobId != null) {
            this.JobId = new Long(source.JobId);
        }
        if (source.DetailList != null) {
            this.DetailList = new DeleteDomainBatchDetail[source.DetailList.length];
            for (int i = 0; i < source.DetailList.length; i++) {
                this.DetailList[i] = new DeleteDomainBatchDetail(source.DetailList[i]);
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
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamArrayObj(map, prefix + "DetailList.", this.DetailList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

