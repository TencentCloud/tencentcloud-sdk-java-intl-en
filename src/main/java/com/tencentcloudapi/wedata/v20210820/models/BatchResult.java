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

public class BatchResult extends AbstractModel {

    /**
    * Number of Tasks Running
    */
    @SerializedName("Running")
    @Expose
    private Long Running;

    /**
    * Number of Tasks Executed Successfully
    */
    @SerializedName("Success")
    @Expose
    private Long Success;

    /**
    * Number of Tasks Executed Failed
    */
    @SerializedName("Failed")
    @Expose
    private Long Failed;

    /**
    * Total Tasks
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
     * Get Number of Tasks Running 
     * @return Running Number of Tasks Running
     */
    public Long getRunning() {
        return this.Running;
    }

    /**
     * Set Number of Tasks Running
     * @param Running Number of Tasks Running
     */
    public void setRunning(Long Running) {
        this.Running = Running;
    }

    /**
     * Get Number of Tasks Executed Successfully 
     * @return Success Number of Tasks Executed Successfully
     */
    public Long getSuccess() {
        return this.Success;
    }

    /**
     * Set Number of Tasks Executed Successfully
     * @param Success Number of Tasks Executed Successfully
     */
    public void setSuccess(Long Success) {
        this.Success = Success;
    }

    /**
     * Get Number of Tasks Executed Failed 
     * @return Failed Number of Tasks Executed Failed
     */
    public Long getFailed() {
        return this.Failed;
    }

    /**
     * Set Number of Tasks Executed Failed
     * @param Failed Number of Tasks Executed Failed
     */
    public void setFailed(Long Failed) {
        this.Failed = Failed;
    }

    /**
     * Get Total Tasks 
     * @return Total Total Tasks
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set Total Tasks
     * @param Total Total Tasks
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    public BatchResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchResult(BatchResult source) {
        if (source.Running != null) {
            this.Running = new Long(source.Running);
        }
        if (source.Success != null) {
            this.Success = new Long(source.Success);
        }
        if (source.Failed != null) {
            this.Failed = new Long(source.Failed);
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Running", this.Running);
        this.setParamSimple(map, prefix + "Success", this.Success);
        this.setParamSimple(map, prefix + "Failed", this.Failed);
        this.setParamSimple(map, prefix + "Total", this.Total);

    }
}

