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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CheckStepInfo extends AbstractModel {

    /**
    * Task start time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StartAt")
    @Expose
    private String StartAt;

    /**
    * Task end time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EndAt")
    @Expose
    private String EndAt;

    /**
    * Task step information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Progress")
    @Expose
    private ProcessProgress Progress;

    /**
     * Get Task start time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StartAt Task start time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStartAt() {
        return this.StartAt;
    }

    /**
     * Set Task start time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StartAt Task start time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStartAt(String StartAt) {
        this.StartAt = StartAt;
    }

    /**
     * Get Task end time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EndAt Task end time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEndAt() {
        return this.EndAt;
    }

    /**
     * Set Task end time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EndAt Task end time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEndAt(String EndAt) {
        this.EndAt = EndAt;
    }

    /**
     * Get Task step information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Progress Task step information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ProcessProgress getProgress() {
        return this.Progress;
    }

    /**
     * Set Task step information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Progress Task step information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProgress(ProcessProgress Progress) {
        this.Progress = Progress;
    }

    public CheckStepInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckStepInfo(CheckStepInfo source) {
        if (source.StartAt != null) {
            this.StartAt = new String(source.StartAt);
        }
        if (source.EndAt != null) {
            this.EndAt = new String(source.EndAt);
        }
        if (source.Progress != null) {
            this.Progress = new ProcessProgress(source.Progress);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartAt", this.StartAt);
        this.setParamSimple(map, prefix + "EndAt", this.EndAt);
        this.setParamObj(map, prefix + "Progress.", this.Progress);

    }
}

