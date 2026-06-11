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

public class RaspLicensePlugin extends AbstractModel {

    /**
    * java Process pid
    */
    @SerializedName("PID")
    @Expose
    private Long PID;

    /**
    * Java Main Class
    */
    @SerializedName("MainClass")
    @Expose
    private String MainClass;

    /**
    * 0: Injecting, 1: Injection successful, 2: Plugin timed out, 3: Plug-in exit, 4: Injection failure
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Error details
    */
    @SerializedName("ErrorLog")
    @Expose
    private String ErrorLog;

    /**
    * Failure reason of injection
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
    * Injection duration
    */
    @SerializedName("InjectTime")
    @Expose
    private String InjectTime;

    /**
     * Get java Process pid 
     * @return PID java Process pid
     */
    public Long getPID() {
        return this.PID;
    }

    /**
     * Set java Process pid
     * @param PID java Process pid
     */
    public void setPID(Long PID) {
        this.PID = PID;
    }

    /**
     * Get Java Main Class 
     * @return MainClass Java Main Class
     */
    public String getMainClass() {
        return this.MainClass;
    }

    /**
     * Set Java Main Class
     * @param MainClass Java Main Class
     */
    public void setMainClass(String MainClass) {
        this.MainClass = MainClass;
    }

    /**
     * Get 0: Injecting, 1: Injection successful, 2: Plugin timed out, 3: Plug-in exit, 4: Injection failure 
     * @return Status 0: Injecting, 1: Injection successful, 2: Plugin timed out, 3: Plug-in exit, 4: Injection failure
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 0: Injecting, 1: Injection successful, 2: Plugin timed out, 3: Plug-in exit, 4: Injection failure
     * @param Status 0: Injecting, 1: Injection successful, 2: Plugin timed out, 3: Plug-in exit, 4: Injection failure
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Error details 
     * @return ErrorLog Error details
     */
    public String getErrorLog() {
        return this.ErrorLog;
    }

    /**
     * Set Error details
     * @param ErrorLog Error details
     */
    public void setErrorLog(String ErrorLog) {
        this.ErrorLog = ErrorLog;
    }

    /**
     * Get Failure reason of injection 
     * @return Reason Failure reason of injection
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set Failure reason of injection
     * @param Reason Failure reason of injection
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    /**
     * Get Injection duration 
     * @return InjectTime Injection duration
     */
    public String getInjectTime() {
        return this.InjectTime;
    }

    /**
     * Set Injection duration
     * @param InjectTime Injection duration
     */
    public void setInjectTime(String InjectTime) {
        this.InjectTime = InjectTime;
    }

    public RaspLicensePlugin() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RaspLicensePlugin(RaspLicensePlugin source) {
        if (source.PID != null) {
            this.PID = new Long(source.PID);
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
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
        if (source.InjectTime != null) {
            this.InjectTime = new String(source.InjectTime);
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
        this.setParamSimple(map, prefix + "Reason", this.Reason);
        this.setParamSimple(map, prefix + "InjectTime", this.InjectTime);

    }
}

