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

public class TaskInstanceCountDto extends AbstractModel {

    /**
    * Number of Successful Instances
    */
    @SerializedName("Success")
    @Expose
    private Long Success;

    /**
    * Number of Instances in Execution
    */
    @SerializedName("Running")
    @Expose
    private Long Running;

    /**
    * Number of Instances Waiting
    */
    @SerializedName("Waiting")
    @Expose
    private Long Waiting;

    /**
    * Number of Instances Waiting for Upstream
    */
    @SerializedName("Depend")
    @Expose
    private Long Depend;

    /**
    * Failed Instance Count
    */
    @SerializedName("Failed")
    @Expose
    private Long Failed;

    /**
    * Permanently Terminated Instance Count
    */
    @SerializedName("Stopped")
    @Expose
    private Long Stopped;

    /**
     * Get Number of Successful Instances 
     * @return Success Number of Successful Instances
     */
    public Long getSuccess() {
        return this.Success;
    }

    /**
     * Set Number of Successful Instances
     * @param Success Number of Successful Instances
     */
    public void setSuccess(Long Success) {
        this.Success = Success;
    }

    /**
     * Get Number of Instances in Execution 
     * @return Running Number of Instances in Execution
     */
    public Long getRunning() {
        return this.Running;
    }

    /**
     * Set Number of Instances in Execution
     * @param Running Number of Instances in Execution
     */
    public void setRunning(Long Running) {
        this.Running = Running;
    }

    /**
     * Get Number of Instances Waiting 
     * @return Waiting Number of Instances Waiting
     */
    public Long getWaiting() {
        return this.Waiting;
    }

    /**
     * Set Number of Instances Waiting
     * @param Waiting Number of Instances Waiting
     */
    public void setWaiting(Long Waiting) {
        this.Waiting = Waiting;
    }

    /**
     * Get Number of Instances Waiting for Upstream 
     * @return Depend Number of Instances Waiting for Upstream
     */
    public Long getDepend() {
        return this.Depend;
    }

    /**
     * Set Number of Instances Waiting for Upstream
     * @param Depend Number of Instances Waiting for Upstream
     */
    public void setDepend(Long Depend) {
        this.Depend = Depend;
    }

    /**
     * Get Failed Instance Count 
     * @return Failed Failed Instance Count
     */
    public Long getFailed() {
        return this.Failed;
    }

    /**
     * Set Failed Instance Count
     * @param Failed Failed Instance Count
     */
    public void setFailed(Long Failed) {
        this.Failed = Failed;
    }

    /**
     * Get Permanently Terminated Instance Count 
     * @return Stopped Permanently Terminated Instance Count
     */
    public Long getStopped() {
        return this.Stopped;
    }

    /**
     * Set Permanently Terminated Instance Count
     * @param Stopped Permanently Terminated Instance Count
     */
    public void setStopped(Long Stopped) {
        this.Stopped = Stopped;
    }

    public TaskInstanceCountDto() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskInstanceCountDto(TaskInstanceCountDto source) {
        if (source.Success != null) {
            this.Success = new Long(source.Success);
        }
        if (source.Running != null) {
            this.Running = new Long(source.Running);
        }
        if (source.Waiting != null) {
            this.Waiting = new Long(source.Waiting);
        }
        if (source.Depend != null) {
            this.Depend = new Long(source.Depend);
        }
        if (source.Failed != null) {
            this.Failed = new Long(source.Failed);
        }
        if (source.Stopped != null) {
            this.Stopped = new Long(source.Stopped);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Success", this.Success);
        this.setParamSimple(map, prefix + "Running", this.Running);
        this.setParamSimple(map, prefix + "Waiting", this.Waiting);
        this.setParamSimple(map, prefix + "Depend", this.Depend);
        this.setParamSimple(map, prefix + "Failed", this.Failed);
        this.setParamSimple(map, prefix + "Stopped", this.Stopped);

    }
}

