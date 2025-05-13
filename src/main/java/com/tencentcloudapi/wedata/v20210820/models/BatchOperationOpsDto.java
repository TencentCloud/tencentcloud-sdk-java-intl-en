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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BatchOperationOpsDto extends AbstractModel {

    /**
    * Number of successful batch operations
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("SuccessCount")
    @Expose
    private Long SuccessCount;

    /**
    * Number of failed batch operations
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("FailedCount")
    @Expose
    private Long FailedCount;

    /**
    * Total number of batch operations
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Unique id of the asynchronous operation record.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AsyncActionId")
    @Expose
    private String AsyncActionId;

    /**
     * Get Number of successful batch operations
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return SuccessCount Number of successful batch operations
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getSuccessCount() {
        return this.SuccessCount;
    }

    /**
     * Set Number of successful batch operations
Note: This field may return null, indicating that no valid value can be obtained.
     * @param SuccessCount Number of successful batch operations
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setSuccessCount(Long SuccessCount) {
        this.SuccessCount = SuccessCount;
    }

    /**
     * Get Number of failed batch operations
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return FailedCount Number of failed batch operations
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getFailedCount() {
        return this.FailedCount;
    }

    /**
     * Set Number of failed batch operations
Note: This field may return null, indicating that no valid value can be obtained.
     * @param FailedCount Number of failed batch operations
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setFailedCount(Long FailedCount) {
        this.FailedCount = FailedCount;
    }

    /**
     * Get Total number of batch operations
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TotalCount Total number of batch operations
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number of batch operations
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TotalCount Total number of batch operations
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Unique id of the asynchronous operation record.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AsyncActionId Unique id of the asynchronous operation record.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAsyncActionId() {
        return this.AsyncActionId;
    }

    /**
     * Set Unique id of the asynchronous operation record.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AsyncActionId Unique id of the asynchronous operation record.
Note: This field may return null, indicating that no valid values can be obtained.
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

