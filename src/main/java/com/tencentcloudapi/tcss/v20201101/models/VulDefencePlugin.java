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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VulDefencePlugin extends AbstractModel{

    /**
    * PID of the Java process
    */
    @SerializedName("PID")
    @Expose
    private Long PID;

    /**
    * Main class name of the process
    */
    @SerializedName("MainClass")
    @Expose
    private String MainClass;

    /**
    * Plugin status. Valid values: `INJECTING` (injecting); `SUCCESS` (injected successfully); `FAIL` (injection failed); `TIMEOUT` (plugin timed out); `QUIT` (plugin exited).
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Error log
    */
    @SerializedName("ErrorLog")
    @Expose
    private String ErrorLog;

    /**
     * Get PID of the Java process 
     * @return PID PID of the Java process
     */
    public Long getPID() {
        return this.PID;
    }

    /**
     * Set PID of the Java process
     * @param PID PID of the Java process
     */
    public void setPID(Long PID) {
        this.PID = PID;
    }

    /**
     * Get Main class name of the process 
     * @return MainClass Main class name of the process
     */
    public String getMainClass() {
        return this.MainClass;
    }

    /**
     * Set Main class name of the process
     * @param MainClass Main class name of the process
     */
    public void setMainClass(String MainClass) {
        this.MainClass = MainClass;
    }

    /**
     * Get Plugin status. Valid values: `INJECTING` (injecting); `SUCCESS` (injected successfully); `FAIL` (injection failed); `TIMEOUT` (plugin timed out); `QUIT` (plugin exited). 
     * @return Status Plugin status. Valid values: `INJECTING` (injecting); `SUCCESS` (injected successfully); `FAIL` (injection failed); `TIMEOUT` (plugin timed out); `QUIT` (plugin exited).
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Plugin status. Valid values: `INJECTING` (injecting); `SUCCESS` (injected successfully); `FAIL` (injection failed); `TIMEOUT` (plugin timed out); `QUIT` (plugin exited).
     * @param Status Plugin status. Valid values: `INJECTING` (injecting); `SUCCESS` (injected successfully); `FAIL` (injection failed); `TIMEOUT` (plugin timed out); `QUIT` (plugin exited).
     */
    public void setStatus(String Status) {
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

    public VulDefencePlugin() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VulDefencePlugin(VulDefencePlugin source) {
        if (source.PID != null) {
            this.PID = new Long(source.PID);
        }
        if (source.MainClass != null) {
            this.MainClass = new String(source.MainClass);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ErrorLog != null) {
            this.ErrorLog = new String(source.ErrorLog);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PID", this.PID);
        this.setParamSimple(map, prefix + "MainClass", this.MainClass);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ErrorLog", this.ErrorLog);

    }
}

