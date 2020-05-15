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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTaskResultRequest extends AbstractModel{

    /**
    * Async task ID. Either TaskId or DealName must be entered.
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * Billing order No. Either TaskId or DealName must be entered.
    */
    @SerializedName("DealName")
    @Expose
    private String DealName;

    /**
     * Get Async task ID. Either TaskId or DealName must be entered. 
     * @return TaskId Async task ID. Either TaskId or DealName must be entered.
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Async task ID. Either TaskId or DealName must be entered.
     * @param TaskId Async task ID. Either TaskId or DealName must be entered.
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Billing order No. Either TaskId or DealName must be entered. 
     * @return DealName Billing order No. Either TaskId or DealName must be entered.
     */
    public String getDealName() {
        return this.DealName;
    }

    /**
     * Set Billing order No. Either TaskId or DealName must be entered.
     * @param DealName Billing order No. Either TaskId or DealName must be entered.
     */
    public void setDealName(String DealName) {
        this.DealName = DealName;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "DealName", this.DealName);

    }
}

