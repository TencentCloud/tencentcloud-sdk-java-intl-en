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

public class VulDefencePluginDetail extends AbstractModel {

    /**
    * ID of the injected process
    */
    @SerializedName("Pid")
    @Expose
    private Long Pid;

    /**
    * Main class name of the injected process
    */
    @SerializedName("MainClass")
    @Expose
    private String MainClass;

    /**
    * Plugin status. 0: injecting; 1: injection successful; 2: plugin timed out, 3: plugin exited; 4: injection failed; 5: logically deleted.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Error log
    */
    @SerializedName("ErrorLog")
    @Expose
    private String ErrorLog;

    /**
    * Injection log
    */
    @SerializedName("InjectLog")
    @Expose
    private String InjectLog;

    /**
     * Get ID of the injected process 
     * @return Pid ID of the injected process
     */
    public Long getPid() {
        return this.Pid;
    }

    /**
     * Set ID of the injected process
     * @param Pid ID of the injected process
     */
    public void setPid(Long Pid) {
        this.Pid = Pid;
    }

    /**
     * Get Main class name of the injected process 
     * @return MainClass Main class name of the injected process
     */
    public String getMainClass() {
        return this.MainClass;
    }

    /**
     * Set Main class name of the injected process
     * @param MainClass Main class name of the injected process
     */
    public void setMainClass(String MainClass) {
        this.MainClass = MainClass;
    }

    /**
     * Get Plugin status. 0: injecting; 1: injection successful; 2: plugin timed out, 3: plugin exited; 4: injection failed; 5: logically deleted. 
     * @return Status Plugin status. 0: injecting; 1: injection successful; 2: plugin timed out, 3: plugin exited; 4: injection failed; 5: logically deleted.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Plugin status. 0: injecting; 1: injection successful; 2: plugin timed out, 3: plugin exited; 4: injection failed; 5: logically deleted.
     * @param Status Plugin status. 0: injecting; 1: injection successful; 2: plugin timed out, 3: plugin exited; 4: injection failed; 5: logically deleted.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Error log 
     * @return ErrorLog Error log
     */
    public String getErrorLog() {
        return this.ErrorLog;
    }

    /**
     * Set Error log
     * @param ErrorLog Error log
     */
    public void setErrorLog(String ErrorLog) {
        this.ErrorLog = ErrorLog;
    }

    /**
     * Get Injection log 
     * @return InjectLog Injection log
     */
    public String getInjectLog() {
        return this.InjectLog;
    }

    /**
     * Set Injection log
     * @param InjectLog Injection log
     */
    public void setInjectLog(String InjectLog) {
        this.InjectLog = InjectLog;
    }

    public VulDefencePluginDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VulDefencePluginDetail(VulDefencePluginDetail source) {
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
        if (source.InjectLog != null) {
            this.InjectLog = new String(source.InjectLog);
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
        this.setParamSimple(map, prefix + "InjectLog", this.InjectLog);

    }
}

