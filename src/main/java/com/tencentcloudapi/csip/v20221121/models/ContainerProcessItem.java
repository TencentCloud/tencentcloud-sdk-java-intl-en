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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ContainerProcessItem extends AbstractModel {

    /**
    * Process name
    */
    @SerializedName("ProcessName")
    @Expose
    private String ProcessName;

    /**
    * Host process ID
    */
    @SerializedName("PID")
    @Expose
    private Long PID;

    /**
    * Containerized process ID
    */
    @SerializedName("ContainerPID")
    @Expose
    private Long ContainerPID;

    /**
    * Executable file path of the process
    */
    @SerializedName("ProcessPath")
    @Expose
    private String ProcessPath;

    /**
    * Process running user
    */
    @SerializedName("RunAs")
    @Expose
    private String RunAs;

    /**
    * Process startup time
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
     * Get Process name 
     * @return ProcessName Process name
     */
    public String getProcessName() {
        return this.ProcessName;
    }

    /**
     * Set Process name
     * @param ProcessName Process name
     */
    public void setProcessName(String ProcessName) {
        this.ProcessName = ProcessName;
    }

    /**
     * Get Host process ID 
     * @return PID Host process ID
     */
    public Long getPID() {
        return this.PID;
    }

    /**
     * Set Host process ID
     * @param PID Host process ID
     */
    public void setPID(Long PID) {
        this.PID = PID;
    }

    /**
     * Get Containerized process ID 
     * @return ContainerPID Containerized process ID
     */
    public Long getContainerPID() {
        return this.ContainerPID;
    }

    /**
     * Set Containerized process ID
     * @param ContainerPID Containerized process ID
     */
    public void setContainerPID(Long ContainerPID) {
        this.ContainerPID = ContainerPID;
    }

    /**
     * Get Executable file path of the process 
     * @return ProcessPath Executable file path of the process
     */
    public String getProcessPath() {
        return this.ProcessPath;
    }

    /**
     * Set Executable file path of the process
     * @param ProcessPath Executable file path of the process
     */
    public void setProcessPath(String ProcessPath) {
        this.ProcessPath = ProcessPath;
    }

    /**
     * Get Process running user 
     * @return RunAs Process running user
     */
    public String getRunAs() {
        return this.RunAs;
    }

    /**
     * Set Process running user
     * @param RunAs Process running user
     */
    public void setRunAs(String RunAs) {
        this.RunAs = RunAs;
    }

    /**
     * Get Process startup time 
     * @return StartTime Process startup time
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Process startup time
     * @param StartTime Process startup time
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    public ContainerProcessItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ContainerProcessItem(ContainerProcessItem source) {
        if (source.ProcessName != null) {
            this.ProcessName = new String(source.ProcessName);
        }
        if (source.PID != null) {
            this.PID = new Long(source.PID);
        }
        if (source.ContainerPID != null) {
            this.ContainerPID = new Long(source.ContainerPID);
        }
        if (source.ProcessPath != null) {
            this.ProcessPath = new String(source.ProcessPath);
        }
        if (source.RunAs != null) {
            this.RunAs = new String(source.RunAs);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProcessName", this.ProcessName);
        this.setParamSimple(map, prefix + "PID", this.PID);
        this.setParamSimple(map, prefix + "ContainerPID", this.ContainerPID);
        this.setParamSimple(map, prefix + "ProcessPath", this.ProcessPath);
        this.setParamSimple(map, prefix + "RunAs", this.RunAs);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);

    }
}

