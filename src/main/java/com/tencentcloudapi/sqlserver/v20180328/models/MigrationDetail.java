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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MigrationDetail extends AbstractModel{

    /**
    * Total number of steps
    */
    @SerializedName("StepAll")
    @Expose
    private Long StepAll;

    /**
    * Current step
    */
    @SerializedName("StepNow")
    @Expose
    private Long StepNow;

    /**
    * Overall progress. For example, “30” means 30%.
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * Step information. ‘null’ means the migration has not started
Note: this field may return ‘null’, indicating that no valid values can be obtained.
    */
    @SerializedName("StepInfo")
    @Expose
    private MigrationStep [] StepInfo;

    /**
     * Get Total number of steps 
     * @return StepAll Total number of steps
     */
    public Long getStepAll() {
        return this.StepAll;
    }

    /**
     * Set Total number of steps
     * @param StepAll Total number of steps
     */
    public void setStepAll(Long StepAll) {
        this.StepAll = StepAll;
    }

    /**
     * Get Current step 
     * @return StepNow Current step
     */
    public Long getStepNow() {
        return this.StepNow;
    }

    /**
     * Set Current step
     * @param StepNow Current step
     */
    public void setStepNow(Long StepNow) {
        this.StepNow = StepNow;
    }

    /**
     * Get Overall progress. For example, “30” means 30%. 
     * @return Progress Overall progress. For example, “30” means 30%.
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set Overall progress. For example, “30” means 30%.
     * @param Progress Overall progress. For example, “30” means 30%.
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * Get Step information. ‘null’ means the migration has not started
Note: this field may return ‘null’, indicating that no valid values can be obtained. 
     * @return StepInfo Step information. ‘null’ means the migration has not started
Note: this field may return ‘null’, indicating that no valid values can be obtained.
     */
    public MigrationStep [] getStepInfo() {
        return this.StepInfo;
    }

    /**
     * Set Step information. ‘null’ means the migration has not started
Note: this field may return ‘null’, indicating that no valid values can be obtained.
     * @param StepInfo Step information. ‘null’ means the migration has not started
Note: this field may return ‘null’, indicating that no valid values can be obtained.
     */
    public void setStepInfo(MigrationStep [] StepInfo) {
        this.StepInfo = StepInfo;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StepAll", this.StepAll);
        this.setParamSimple(map, prefix + "StepNow", this.StepNow);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamArrayObj(map, prefix + "StepInfo.", this.StepInfo);

    }
}

