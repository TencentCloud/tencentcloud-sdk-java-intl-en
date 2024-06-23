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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MakePlanTaskOpsDto extends AbstractModel {

    /**
    * Basic task informationNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TaskBaseInfo")
    @Expose
    private TaskOpsDto TaskBaseInfo;

    /**
    * Supplemental instances already generated for this task
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("InstanceCount")
    @Expose
    private Long InstanceCount;

    /**
    * Supplementary Task Instance Completion Percentage
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CompletePercent")
    @Expose
    private Long CompletePercent;

    /**
    * Supplementary Task Instance Success Percentage
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("SuccessPercent")
    @Expose
    private Long SuccessPercent;

    /**
    * Estimated Total Number of Instances Generated, as generation is asynchronous, -1 indicates instances are not fully generated yet
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("InstanceTotalCount")
    @Expose
    private Long InstanceTotalCount;

    /**
     * Get Basic task informationNote: This field may return null, indicating that no valid value can be obtained. 
     * @return TaskBaseInfo Basic task informationNote: This field may return null, indicating that no valid value can be obtained.
     */
    public TaskOpsDto getTaskBaseInfo() {
        return this.TaskBaseInfo;
    }

    /**
     * Set Basic task informationNote: This field may return null, indicating that no valid value can be obtained.
     * @param TaskBaseInfo Basic task informationNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTaskBaseInfo(TaskOpsDto TaskBaseInfo) {
        this.TaskBaseInfo = TaskBaseInfo;
    }

    /**
     * Get Supplemental instances already generated for this task
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return InstanceCount Supplemental instances already generated for this task
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getInstanceCount() {
        return this.InstanceCount;
    }

    /**
     * Set Supplemental instances already generated for this task
Note: This field may return null, indicating that no valid value can be obtained.
     * @param InstanceCount Supplemental instances already generated for this task
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setInstanceCount(Long InstanceCount) {
        this.InstanceCount = InstanceCount;
    }

    /**
     * Get Supplementary Task Instance Completion Percentage
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return CompletePercent Supplementary Task Instance Completion Percentage
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getCompletePercent() {
        return this.CompletePercent;
    }

    /**
     * Set Supplementary Task Instance Completion Percentage
Note: This field may return null, indicating that no valid value can be obtained.
     * @param CompletePercent Supplementary Task Instance Completion Percentage
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCompletePercent(Long CompletePercent) {
        this.CompletePercent = CompletePercent;
    }

    /**
     * Get Supplementary Task Instance Success Percentage
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return SuccessPercent Supplementary Task Instance Success Percentage
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getSuccessPercent() {
        return this.SuccessPercent;
    }

    /**
     * Set Supplementary Task Instance Success Percentage
Note: This field may return null, indicating that no valid value can be obtained.
     * @param SuccessPercent Supplementary Task Instance Success Percentage
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setSuccessPercent(Long SuccessPercent) {
        this.SuccessPercent = SuccessPercent;
    }

    /**
     * Get Estimated Total Number of Instances Generated, as generation is asynchronous, -1 indicates instances are not fully generated yet
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return InstanceTotalCount Estimated Total Number of Instances Generated, as generation is asynchronous, -1 indicates instances are not fully generated yet
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getInstanceTotalCount() {
        return this.InstanceTotalCount;
    }

    /**
     * Set Estimated Total Number of Instances Generated, as generation is asynchronous, -1 indicates instances are not fully generated yet
Note: This field may return null, indicating that no valid value can be obtained.
     * @param InstanceTotalCount Estimated Total Number of Instances Generated, as generation is asynchronous, -1 indicates instances are not fully generated yet
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setInstanceTotalCount(Long InstanceTotalCount) {
        this.InstanceTotalCount = InstanceTotalCount;
    }

    public MakePlanTaskOpsDto() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MakePlanTaskOpsDto(MakePlanTaskOpsDto source) {
        if (source.TaskBaseInfo != null) {
            this.TaskBaseInfo = new TaskOpsDto(source.TaskBaseInfo);
        }
        if (source.InstanceCount != null) {
            this.InstanceCount = new Long(source.InstanceCount);
        }
        if (source.CompletePercent != null) {
            this.CompletePercent = new Long(source.CompletePercent);
        }
        if (source.SuccessPercent != null) {
            this.SuccessPercent = new Long(source.SuccessPercent);
        }
        if (source.InstanceTotalCount != null) {
            this.InstanceTotalCount = new Long(source.InstanceTotalCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "TaskBaseInfo.", this.TaskBaseInfo);
        this.setParamSimple(map, prefix + "InstanceCount", this.InstanceCount);
        this.setParamSimple(map, prefix + "CompletePercent", this.CompletePercent);
        this.setParamSimple(map, prefix + "SuccessPercent", this.SuccessPercent);
        this.setParamSimple(map, prefix + "InstanceTotalCount", this.InstanceTotalCount);

    }
}

