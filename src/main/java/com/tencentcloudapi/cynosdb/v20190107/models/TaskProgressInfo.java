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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskProgressInfo extends AbstractModel {

    /**
    * Current step.
    */
    @SerializedName("CurrentStep")
    @Expose
    private String CurrentStep;

    /**
    * Current progress.
    */
    @SerializedName("CurrentStepProgress")
    @Expose
    private Long CurrentStepProgress;

    /**
    * Estimated Time
    */
    @SerializedName("CurrentStepRemainingTime")
    @Expose
    private String CurrentStepRemainingTime;

    /**
     * Get Current step. 
     * @return CurrentStep Current step.
     */
    public String getCurrentStep() {
        return this.CurrentStep;
    }

    /**
     * Set Current step.
     * @param CurrentStep Current step.
     */
    public void setCurrentStep(String CurrentStep) {
        this.CurrentStep = CurrentStep;
    }

    /**
     * Get Current progress. 
     * @return CurrentStepProgress Current progress.
     */
    public Long getCurrentStepProgress() {
        return this.CurrentStepProgress;
    }

    /**
     * Set Current progress.
     * @param CurrentStepProgress Current progress.
     */
    public void setCurrentStepProgress(Long CurrentStepProgress) {
        this.CurrentStepProgress = CurrentStepProgress;
    }

    /**
     * Get Estimated Time 
     * @return CurrentStepRemainingTime Estimated Time
     */
    public String getCurrentStepRemainingTime() {
        return this.CurrentStepRemainingTime;
    }

    /**
     * Set Estimated Time
     * @param CurrentStepRemainingTime Estimated Time
     */
    public void setCurrentStepRemainingTime(String CurrentStepRemainingTime) {
        this.CurrentStepRemainingTime = CurrentStepRemainingTime;
    }

    public TaskProgressInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskProgressInfo(TaskProgressInfo source) {
        if (source.CurrentStep != null) {
            this.CurrentStep = new String(source.CurrentStep);
        }
        if (source.CurrentStepProgress != null) {
            this.CurrentStepProgress = new Long(source.CurrentStepProgress);
        }
        if (source.CurrentStepRemainingTime != null) {
            this.CurrentStepRemainingTime = new String(source.CurrentStepRemainingTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CurrentStep", this.CurrentStep);
        this.setParamSimple(map, prefix + "CurrentStepProgress", this.CurrentStepProgress);
        this.setParamSimple(map, prefix + "CurrentStepRemainingTime", this.CurrentStepRemainingTime);

    }
}

