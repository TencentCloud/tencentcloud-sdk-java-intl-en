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
package com.tencentcloudapi.dts.v20180330.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SyncStepDetailInfo extends AbstractModel{

    /**
    * Step number
    */
    @SerializedName("StepNo")
    @Expose
    private Long StepNo;

    /**
    * Step name
    */
    @SerializedName("StepName")
    @Expose
    private String StepName;

    /**
    * Whether it can be stopped
    */
    @SerializedName("CanStop")
    @Expose
    private Long CanStop;

    /**
    * Step ID
    */
    @SerializedName("StepId")
    @Expose
    private Long StepId;

    /**
     * Get Step number 
     * @return StepNo Step number
     */
    public Long getStepNo() {
        return this.StepNo;
    }

    /**
     * Set Step number
     * @param StepNo Step number
     */
    public void setStepNo(Long StepNo) {
        this.StepNo = StepNo;
    }

    /**
     * Get Step name 
     * @return StepName Step name
     */
    public String getStepName() {
        return this.StepName;
    }

    /**
     * Set Step name
     * @param StepName Step name
     */
    public void setStepName(String StepName) {
        this.StepName = StepName;
    }

    /**
     * Get Whether it can be stopped 
     * @return CanStop Whether it can be stopped
     */
    public Long getCanStop() {
        return this.CanStop;
    }

    /**
     * Set Whether it can be stopped
     * @param CanStop Whether it can be stopped
     */
    public void setCanStop(Long CanStop) {
        this.CanStop = CanStop;
    }

    /**
     * Get Step ID 
     * @return StepId Step ID
     */
    public Long getStepId() {
        return this.StepId;
    }

    /**
     * Set Step ID
     * @param StepId Step ID
     */
    public void setStepId(Long StepId) {
        this.StepId = StepId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StepNo", this.StepNo);
        this.setParamSimple(map, prefix + "StepName", this.StepName);
        this.setParamSimple(map, prefix + "CanStop", this.CanStop);
        this.setParamSimple(map, prefix + "StepId", this.StepId);

    }
}

