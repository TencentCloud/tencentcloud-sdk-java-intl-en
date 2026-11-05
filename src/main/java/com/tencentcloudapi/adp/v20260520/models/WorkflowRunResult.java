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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WorkflowRunResult extends AbstractModel {

    /**
    * Running state. 1: Queuing; 2: running; 3: run successfully; 4: fail to run; 5: canceled
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Error message
    */
    @SerializedName("FailMessage")
    @Expose
    private String FailMessage;

    /**
    * Total number of tokens consumed
    */
    @SerializedName("TotalTokens")
    @Expose
    private Long TotalTokens;

    /**
     * Get Running state. 1: Queuing; 2: running; 3: run successfully; 4: fail to run; 5: canceled 
     * @return Status Running state. 1: Queuing; 2: running; 3: run successfully; 4: fail to run; 5: canceled
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Running state. 1: Queuing; 2: running; 3: run successfully; 4: fail to run; 5: canceled
     * @param Status Running state. 1: Queuing; 2: running; 3: run successfully; 4: fail to run; 5: canceled
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Error message 
     * @return FailMessage Error message
     */
    public String getFailMessage() {
        return this.FailMessage;
    }

    /**
     * Set Error message
     * @param FailMessage Error message
     */
    public void setFailMessage(String FailMessage) {
        this.FailMessage = FailMessage;
    }

    /**
     * Get Total number of tokens consumed 
     * @return TotalTokens Total number of tokens consumed
     */
    public Long getTotalTokens() {
        return this.TotalTokens;
    }

    /**
     * Set Total number of tokens consumed
     * @param TotalTokens Total number of tokens consumed
     */
    public void setTotalTokens(Long TotalTokens) {
        this.TotalTokens = TotalTokens;
    }

    public WorkflowRunResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WorkflowRunResult(WorkflowRunResult source) {
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.FailMessage != null) {
            this.FailMessage = new String(source.FailMessage);
        }
        if (source.TotalTokens != null) {
            this.TotalTokens = new Long(source.TotalTokens);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "FailMessage", this.FailMessage);
        this.setParamSimple(map, prefix + "TotalTokens", this.TotalTokens);

    }
}

