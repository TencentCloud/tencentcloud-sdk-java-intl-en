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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class JavaMemShellPluginInfo extends AbstractModel {

    /**
    * Injection Process PID
    */
    @SerializedName("Pid")
    @Expose
    private Long Pid;

    /**
    * Injection Process Main Class
    */
    @SerializedName("MainClass")
    @Expose
    private String MainClass;

    /**
    * Injection Status. 0: Injecting; 1: Injection Succeeded; 2: Plugin Timeout; 3: Plugin Exits; 4: Injection Failed; 5: Soft-delete
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Error logs
    */
    @SerializedName("ErrorLog")
    @Expose
    private String ErrorLog;

    /**
     * Get Injection Process PID 
     * @return Pid Injection Process PID
     */
    public Long getPid() {
        return this.Pid;
    }

    /**
     * Set Injection Process PID
     * @param Pid Injection Process PID
     */
    public void setPid(Long Pid) {
        this.Pid = Pid;
    }

    /**
     * Get Injection Process Main Class 
     * @return MainClass Injection Process Main Class
     */
    public String getMainClass() {
        return this.MainClass;
    }

    /**
     * Set Injection Process Main Class
     * @param MainClass Injection Process Main Class
     */
    public void setMainClass(String MainClass) {
        this.MainClass = MainClass;
    }

    /**
     * Get Injection Status. 0: Injecting; 1: Injection Succeeded; 2: Plugin Timeout; 3: Plugin Exits; 4: Injection Failed; 5: Soft-delete 
     * @return Status Injection Status. 0: Injecting; 1: Injection Succeeded; 2: Plugin Timeout; 3: Plugin Exits; 4: Injection Failed; 5: Soft-delete
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Injection Status. 0: Injecting; 1: Injection Succeeded; 2: Plugin Timeout; 3: Plugin Exits; 4: Injection Failed; 5: Soft-delete
     * @param Status Injection Status. 0: Injecting; 1: Injection Succeeded; 2: Plugin Timeout; 3: Plugin Exits; 4: Injection Failed; 5: Soft-delete
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Error logs 
     * @return ErrorLog Error logs
     */
    public String getErrorLog() {
        return this.ErrorLog;
    }

    /**
     * Set Error logs
     * @param ErrorLog Error logs
     */
    public void setErrorLog(String ErrorLog) {
        this.ErrorLog = ErrorLog;
    }

    public JavaMemShellPluginInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public JavaMemShellPluginInfo(JavaMemShellPluginInfo source) {
        if (source.Pid != null) {
            this.Pid = new Long(source.Pid);
        }
        if (source.MainClass != null) {
            this.MainClass = new String(source.MainClass);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.ErrorLog != null) {
            this.ErrorLog = new String(source.ErrorLog);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Pid", this.Pid);
        this.setParamSimple(map, prefix + "MainClass", this.MainClass);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ErrorLog", this.ErrorLog);

    }
}

