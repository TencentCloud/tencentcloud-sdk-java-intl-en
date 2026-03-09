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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BatchOperationOpsDto extends AbstractModel {

    /**
    * Number of batch operations succeeded.
    */
    @SerializedName("SuccessCount")
    @Expose
    private Long SuccessCount;

    /**
    * Number of batch operations failed.
    */
    @SerializedName("FailedCount")
    @Expose
    private Long FailedCount;

    /**
    * Total number of batch operations.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Unique id of the async operation record.
    */
    @SerializedName("AsyncActionId")
    @Expose
    private String AsyncActionId;

    /**
     * Get Number of batch operations succeeded. 
     * @return SuccessCount Number of batch operations succeeded.
     */
    public Long getSuccessCount() {
        return this.SuccessCount;
    }

    /**
     * Set Number of batch operations succeeded.
     * @param SuccessCount Number of batch operations succeeded.
     */
    public void setSuccessCount(Long SuccessCount) {
        this.SuccessCount = SuccessCount;
    }

    /**
     * Get Number of batch operations failed. 
     * @return FailedCount Number of batch operations failed.
     */
    public Long getFailedCount() {
        return this.FailedCount;
    }

    /**
     * Set Number of batch operations failed.
     * @param FailedCount Number of batch operations failed.
     */
    public void setFailedCount(Long FailedCount) {
        this.FailedCount = FailedCount;
    }

    /**
     * Get Total number of batch operations. 
     * @return TotalCount Total number of batch operations.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number of batch operations.
     * @param TotalCount Total number of batch operations.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Unique id of the async operation record. 
     * @return AsyncActionId Unique id of the async operation record.
     */
    public String getAsyncActionId() {
        return this.AsyncActionId;
    }

    /**
     * Set Unique id of the async operation record.
     * @param AsyncActionId Unique id of the async operation record.
     */
    public void setAsyncActionId(String AsyncActionId) {
        this.AsyncActionId = AsyncActionId;
    }

    public BatchOperationOpsDto() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchOperationOpsDto(BatchOperationOpsDto source) {
        if (source.SuccessCount != null) {
            this.SuccessCount = new Long(source.SuccessCount);
        }
        if (source.FailedCount != null) {
            this.FailedCount = new Long(source.FailedCount);
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.AsyncActionId != null) {
            this.AsyncActionId = new String(source.AsyncActionId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SuccessCount", this.SuccessCount);
        this.setParamSimple(map, prefix + "FailedCount", this.FailedCount);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "AsyncActionId", this.AsyncActionId);

    }
}

