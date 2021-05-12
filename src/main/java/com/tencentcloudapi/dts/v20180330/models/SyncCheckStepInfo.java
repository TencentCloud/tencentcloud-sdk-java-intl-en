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

public class SyncCheckStepInfo extends AbstractModel{

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
    * Code of the step execution result
    */
    @SerializedName("StepCode")
    @Expose
    private Long StepCode;

    /**
    * Message about the step execution result
    */
    @SerializedName("StepMessage")
    @Expose
    private String StepMessage;

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
     * Get Code of the step execution result 
     * @return StepCode Code of the step execution result
     */
    public Long getStepCode() {
        return this.StepCode;
    }

    /**
     * Set Code of the step execution result
     * @param StepCode Code of the step execution result
     */
    public void setStepCode(Long StepCode) {
        this.StepCode = StepCode;
    }

    /**
     * Get Message about the step execution result 
     * @return StepMessage Message about the step execution result
     */
    public String getStepMessage() {
        return this.StepMessage;
    }

    /**
     * Set Message about the step execution result
     * @param StepMessage Message about the step execution result
     */
    public void setStepMessage(String StepMessage) {
        this.StepMessage = StepMessage;
    }

    public SyncCheckStepInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SyncCheckStepInfo(SyncCheckStepInfo source) {
        if (source.StepNo != null) {
            this.StepNo = new Long(source.StepNo);
        }
        if (source.StepName != null) {
            this.StepName = new String(source.StepName);
        }
        if (source.StepCode != null) {
            this.StepCode = new Long(source.StepCode);
        }
        if (source.StepMessage != null) {
            this.StepMessage = new String(source.StepMessage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StepNo", this.StepNo);
        this.setParamSimple(map, prefix + "StepName", this.StepName);
        this.setParamSimple(map, prefix + "StepCode", this.StepCode);
        this.setParamSimple(map, prefix + "StepMessage", this.StepMessage);

    }
}

