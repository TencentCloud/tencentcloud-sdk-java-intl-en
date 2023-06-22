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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeModifyCheckSyncJobResultResponse extends AbstractModel{

    /**
    * Execution status of the check task Valid values: `notStarted` (Not started), `running` (Running), `failed` (Failed), `success` (Successful).
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Number of check steps Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StepCount")
    @Expose
    private Long StepCount;

    /**
    * Current step Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StepCur")
    @Expose
    private Long StepCur;

    /**
    * Overall progress. Value range: 0-100. Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * Step details Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StepInfos")
    @Expose
    private StepInfo [] StepInfos;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Execution status of the check task Valid values: `notStarted` (Not started), `running` (Running), `failed` (Failed), `success` (Successful). 
     * @return Status Execution status of the check task Valid values: `notStarted` (Not started), `running` (Running), `failed` (Failed), `success` (Successful).
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Execution status of the check task Valid values: `notStarted` (Not started), `running` (Running), `failed` (Failed), `success` (Successful).
     * @param Status Execution status of the check task Valid values: `notStarted` (Not started), `running` (Running), `failed` (Failed), `success` (Successful).
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Number of check steps Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StepCount Number of check steps Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getStepCount() {
        return this.StepCount;
    }

    /**
     * Set Number of check steps Note: This field may return null, indicating that no valid values can be obtained.
     * @param StepCount Number of check steps Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStepCount(Long StepCount) {
        this.StepCount = StepCount;
    }

    /**
     * Get Current step Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StepCur Current step Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getStepCur() {
        return this.StepCur;
    }

    /**
     * Set Current step Note: This field may return null, indicating that no valid values can be obtained.
     * @param StepCur Current step Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStepCur(Long StepCur) {
        this.StepCur = StepCur;
    }

    /**
     * Get Overall progress. Value range: 0-100. Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Progress Overall progress. Value range: 0-100. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set Overall progress. Value range: 0-100. Note: This field may return null, indicating that no valid values can be obtained.
     * @param Progress Overall progress. Value range: 0-100. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * Get Step details Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StepInfos Step details Note: This field may return null, indicating that no valid values can be obtained.
     */
    public StepInfo [] getStepInfos() {
        return this.StepInfos;
    }

    /**
     * Set Step details Note: This field may return null, indicating that no valid values can be obtained.
     * @param StepInfos Step details Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStepInfos(StepInfo [] StepInfos) {
        this.StepInfos = StepInfos;
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

    public DescribeModifyCheckSyncJobResultResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeModifyCheckSyncJobResultResponse(DescribeModifyCheckSyncJobResultResponse source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.StepCount != null) {
            this.StepCount = new Long(source.StepCount);
        }
        if (source.StepCur != null) {
            this.StepCur = new Long(source.StepCur);
        }
        if (source.Progress != null) {
            this.Progress = new Long(source.Progress);
        }
        if (source.StepInfos != null) {
            this.StepInfos = new StepInfo[source.StepInfos.length];
            for (int i = 0; i < source.StepInfos.length; i++) {
                this.StepInfos[i] = new StepInfo(source.StepInfos[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StepCount", this.StepCount);
        this.setParamSimple(map, prefix + "StepCur", this.StepCur);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamArrayObj(map, prefix + "StepInfos.", this.StepInfos);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

