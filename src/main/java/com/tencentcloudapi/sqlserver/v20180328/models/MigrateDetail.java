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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MigrateDetail extends AbstractModel {

    /**
    * Name of current step
    */
    @SerializedName("StepName")
    @Expose
    private String StepName;

    /**
    * Progress of current step in %
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
     * Get Name of current step 
     * @return StepName Name of current step
     */
    public String getStepName() {
        return this.StepName;
    }

    /**
     * Set Name of current step
     * @param StepName Name of current step
     */
    public void setStepName(String StepName) {
        this.StepName = StepName;
    }

    /**
     * Get Progress of current step in % 
     * @return Progress Progress of current step in %
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set Progress of current step in %
     * @param Progress Progress of current step in %
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    public MigrateDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MigrateDetail(MigrateDetail source) {
        if (source.StepName != null) {
            this.StepName = new String(source.StepName);
        }
        if (source.Progress != null) {
            this.Progress = new Long(source.Progress);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StepName", this.StepName);
        this.setParamSimple(map, prefix + "Progress", this.Progress);

    }
}

