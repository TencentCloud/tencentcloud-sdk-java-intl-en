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
package com.tencentcloudapi.tcaplusdb.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApplyResult extends AbstractModel {

    /**
    * Application ID
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * Application type
    */
    @SerializedName("ApplicationType")
    @Expose
    private Long ApplicationType;

    /**
    * Status. Valid values: `0` (pending approval), `1` (application approved and task submitted), `2` (rejected)
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
    */
    @SerializedName("ApplicationStatus")
    @Expose
    private Long ApplicationStatus;

    /**
    * ID of the submitted task
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Error information
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
    */
    @SerializedName("Error")
    @Expose
    private ErrorInfo Error;

    /**
     * Get Application ID 
     * @return ApplicationId Application ID
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set Application ID
     * @param ApplicationId Application ID
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get Application type 
     * @return ApplicationType Application type
     */
    public Long getApplicationType() {
        return this.ApplicationType;
    }

    /**
     * Set Application type
     * @param ApplicationType Application type
     */
    public void setApplicationType(Long ApplicationType) {
        this.ApplicationType = ApplicationType;
    }

    /**
     * Get Status. Valid values: `0` (pending approval), `1` (application approved and task submitted), `2` (rejected)
Note: `null` may be returned for this field, indicating that no valid values can be obtained. 
     * @return ApplicationStatus Status. Valid values: `0` (pending approval), `1` (application approved and task submitted), `2` (rejected)
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public Long getApplicationStatus() {
        return this.ApplicationStatus;
    }

    /**
     * Set Status. Valid values: `0` (pending approval), `1` (application approved and task submitted), `2` (rejected)
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     * @param ApplicationStatus Status. Valid values: `0` (pending approval), `1` (application approved and task submitted), `2` (rejected)
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public void setApplicationStatus(Long ApplicationStatus) {
        this.ApplicationStatus = ApplicationStatus;
    }

    /**
     * Get ID of the submitted task
Note: `null` may be returned for this field, indicating that no valid values can be obtained. 
     * @return TaskId ID of the submitted task
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set ID of the submitted task
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     * @param TaskId ID of the submitted task
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Error information
Note: `null` may be returned for this field, indicating that no valid values can be obtained. 
     * @return Error Error information
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public ErrorInfo getError() {
        return this.Error;
    }

    /**
     * Set Error information
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     * @param Error Error information
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public void setError(ErrorInfo Error) {
        this.Error = Error;
    }

    public ApplyResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApplyResult(ApplyResult source) {
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.ApplicationType != null) {
            this.ApplicationType = new Long(source.ApplicationType);
        }
        if (source.ApplicationStatus != null) {
            this.ApplicationStatus = new Long(source.ApplicationStatus);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Error != null) {
            this.Error = new ErrorInfo(source.Error);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "ApplicationType", this.ApplicationType);
        this.setParamSimple(map, prefix + "ApplicationStatus", this.ApplicationStatus);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamObj(map, prefix + "Error.", this.Error);

    }
}

