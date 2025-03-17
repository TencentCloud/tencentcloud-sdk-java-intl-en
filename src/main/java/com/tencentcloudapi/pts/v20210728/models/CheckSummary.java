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
package com.tencentcloudapi.pts.v20210728.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CheckSummary extends AbstractModel {

    /**
    * Checkpoint name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Step name of the checkpoint.
    */
    @SerializedName("Step")
    @Expose
    private String Step;

    /**
    * Number of successful checks.
    */
    @SerializedName("SuccessCount")
    @Expose
    private Long SuccessCount;

    /**
    * Number of failed checks.
    */
    @SerializedName("FailCount")
    @Expose
    private Long FailCount;

    /**
    * Error ratio.
    */
    @SerializedName("ErrorRate")
    @Expose
    private Float ErrorRate;

    /**
     * Get Checkpoint name. 
     * @return Name Checkpoint name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Checkpoint name.
     * @param Name Checkpoint name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Step name of the checkpoint. 
     * @return Step Step name of the checkpoint.
     */
    public String getStep() {
        return this.Step;
    }

    /**
     * Set Step name of the checkpoint.
     * @param Step Step name of the checkpoint.
     */
    public void setStep(String Step) {
        this.Step = Step;
    }

    /**
     * Get Number of successful checks. 
     * @return SuccessCount Number of successful checks.
     */
    public Long getSuccessCount() {
        return this.SuccessCount;
    }

    /**
     * Set Number of successful checks.
     * @param SuccessCount Number of successful checks.
     */
    public void setSuccessCount(Long SuccessCount) {
        this.SuccessCount = SuccessCount;
    }

    /**
     * Get Number of failed checks. 
     * @return FailCount Number of failed checks.
     */
    public Long getFailCount() {
        return this.FailCount;
    }

    /**
     * Set Number of failed checks.
     * @param FailCount Number of failed checks.
     */
    public void setFailCount(Long FailCount) {
        this.FailCount = FailCount;
    }

    /**
     * Get Error ratio. 
     * @return ErrorRate Error ratio.
     */
    public Float getErrorRate() {
        return this.ErrorRate;
    }

    /**
     * Set Error ratio.
     * @param ErrorRate Error ratio.
     */
    public void setErrorRate(Float ErrorRate) {
        this.ErrorRate = ErrorRate;
    }

    public CheckSummary() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckSummary(CheckSummary source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Step != null) {
            this.Step = new String(source.Step);
        }
        if (source.SuccessCount != null) {
            this.SuccessCount = new Long(source.SuccessCount);
        }
        if (source.FailCount != null) {
            this.FailCount = new Long(source.FailCount);
        }
        if (source.ErrorRate != null) {
            this.ErrorRate = new Float(source.ErrorRate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Step", this.Step);
        this.setParamSimple(map, prefix + "SuccessCount", this.SuccessCount);
        this.setParamSimple(map, prefix + "FailCount", this.FailCount);
        this.setParamSimple(map, prefix + "ErrorRate", this.ErrorRate);

    }
}

