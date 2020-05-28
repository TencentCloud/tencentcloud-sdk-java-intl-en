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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListTriggersResponse extends AbstractModel{

    /**
    * Total number of triggers
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Trigger list
    */
    @SerializedName("Triggers")
    @Expose
    private TriggerInfo [] Triggers;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Total number of triggers 
     * @return TotalCount Total number of triggers
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number of triggers
     * @param TotalCount Total number of triggers
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Trigger list 
     * @return Triggers Trigger list
     */
    public TriggerInfo [] getTriggers() {
        return this.Triggers;
    }

    /**
     * Set Trigger list
     * @param Triggers Trigger list
     */
    public void setTriggers(TriggerInfo [] Triggers) {
        this.Triggers = Triggers;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "Triggers.", this.Triggers);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

