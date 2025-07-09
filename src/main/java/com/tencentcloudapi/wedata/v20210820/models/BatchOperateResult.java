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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BatchOperateResult extends AbstractModel {

    /**
    * Number of Batch Operations Succeeded
    */
    @SerializedName("SuccessCount")
    @Expose
    private Long SuccessCount;

    /**
    * Number of Batch Operations Failed
    */
    @SerializedName("FailedCount")
    @Expose
    private Long FailedCount;

    /**
    * Total Number of Batch Operations
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
     * Get Number of Batch Operations Succeeded 
     * @return SuccessCount Number of Batch Operations Succeeded
     */
    public Long getSuccessCount() {
        return this.SuccessCount;
    }

    /**
     * Set Number of Batch Operations Succeeded
     * @param SuccessCount Number of Batch Operations Succeeded
     */
    public void setSuccessCount(Long SuccessCount) {
        this.SuccessCount = SuccessCount;
    }

    /**
     * Get Number of Batch Operations Failed 
     * @return FailedCount Number of Batch Operations Failed
     */
    public Long getFailedCount() {
        return this.FailedCount;
    }

    /**
     * Set Number of Batch Operations Failed
     * @param FailedCount Number of Batch Operations Failed
     */
    public void setFailedCount(Long FailedCount) {
        this.FailedCount = FailedCount;
    }

    /**
     * Get Total Number of Batch Operations 
     * @return TotalCount Total Number of Batch Operations
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total Number of Batch Operations
     * @param TotalCount Total Number of Batch Operations
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    public BatchOperateResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchOperateResult(BatchOperateResult source) {
        if (source.SuccessCount != null) {
            this.SuccessCount = new Long(source.SuccessCount);
        }
        if (source.FailedCount != null) {
            this.FailedCount = new Long(source.FailedCount);
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SuccessCount", this.SuccessCount);
        this.setParamSimple(map, prefix + "FailedCount", this.FailedCount);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);

    }
}

