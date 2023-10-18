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
package com.tencentcloudapi.ses.v20201002.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CycleEmailParam extends AbstractModel {

    /**
    * Start time of the task
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * Task recurrence in hours
    */
    @SerializedName("IntervalTime")
    @Expose
    private Long IntervalTime;

    /**
    * Specifies whether to end the cycle. This parameter is used to update the task. Valid values: 0: No; 1: Yes.
    */
    @SerializedName("TermCycle")
    @Expose
    private Long TermCycle;

    /**
     * Get Start time of the task 
     * @return BeginTime Start time of the task
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set Start time of the task
     * @param BeginTime Start time of the task
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get Task recurrence in hours 
     * @return IntervalTime Task recurrence in hours
     */
    public Long getIntervalTime() {
        return this.IntervalTime;
    }

    /**
     * Set Task recurrence in hours
     * @param IntervalTime Task recurrence in hours
     */
    public void setIntervalTime(Long IntervalTime) {
        this.IntervalTime = IntervalTime;
    }

    /**
     * Get Specifies whether to end the cycle. This parameter is used to update the task. Valid values: 0: No; 1: Yes. 
     * @return TermCycle Specifies whether to end the cycle. This parameter is used to update the task. Valid values: 0: No; 1: Yes.
     */
    public Long getTermCycle() {
        return this.TermCycle;
    }

    /**
     * Set Specifies whether to end the cycle. This parameter is used to update the task. Valid values: 0: No; 1: Yes.
     * @param TermCycle Specifies whether to end the cycle. This parameter is used to update the task. Valid values: 0: No; 1: Yes.
     */
    public void setTermCycle(Long TermCycle) {
        this.TermCycle = TermCycle;
    }

    public CycleEmailParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CycleEmailParam(CycleEmailParam source) {
        if (source.BeginTime != null) {
            this.BeginTime = new String(source.BeginTime);
        }
        if (source.IntervalTime != null) {
            this.IntervalTime = new Long(source.IntervalTime);
        }
        if (source.TermCycle != null) {
            this.TermCycle = new Long(source.TermCycle);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "IntervalTime", this.IntervalTime);
        this.setParamSimple(map, prefix + "TermCycle", this.TermCycle);

    }
}

