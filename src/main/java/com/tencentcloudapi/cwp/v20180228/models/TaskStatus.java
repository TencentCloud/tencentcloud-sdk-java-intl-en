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

public class TaskStatus extends AbstractModel {

    /**
    * Scanning (including initializing)
    */
    @SerializedName("Scanning")
    @Expose
    private String Scanning;

    /**
    * Scan terminated (including terminating)
    */
    @SerializedName("Ok")
    @Expose
    private String Ok;

    /**
    * Scan failed
    */
    @SerializedName("Fail")
    @Expose
    private String Fail;

    /**
    * Scan failed, with specific reason displayed: scan timeout, low client version, or client offline
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Stop")
    @Expose
    private String Stop;

    /**
     * Get Scanning (including initializing) 
     * @return Scanning Scanning (including initializing)
     */
    public String getScanning() {
        return this.Scanning;
    }

    /**
     * Set Scanning (including initializing)
     * @param Scanning Scanning (including initializing)
     */
    public void setScanning(String Scanning) {
        this.Scanning = Scanning;
    }

    /**
     * Get Scan terminated (including terminating) 
     * @return Ok Scan terminated (including terminating)
     */
    public String getOk() {
        return this.Ok;
    }

    /**
     * Set Scan terminated (including terminating)
     * @param Ok Scan terminated (including terminating)
     */
    public void setOk(String Ok) {
        this.Ok = Ok;
    }

    /**
     * Get Scan failed 
     * @return Fail Scan failed
     */
    public String getFail() {
        return this.Fail;
    }

    /**
     * Set Scan failed
     * @param Fail Scan failed
     */
    public void setFail(String Fail) {
        this.Fail = Fail;
    }

    /**
     * Get Scan failed, with specific reason displayed: scan timeout, low client version, or client offline
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Stop Scan failed, with specific reason displayed: scan timeout, low client version, or client offline
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStop() {
        return this.Stop;
    }

    /**
     * Set Scan failed, with specific reason displayed: scan timeout, low client version, or client offline
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Stop Scan failed, with specific reason displayed: scan timeout, low client version, or client offline
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStop(String Stop) {
        this.Stop = Stop;
    }

    public TaskStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskStatus(TaskStatus source) {
        if (source.Scanning != null) {
            this.Scanning = new String(source.Scanning);
        }
        if (source.Ok != null) {
            this.Ok = new String(source.Ok);
        }
        if (source.Fail != null) {
            this.Fail = new String(source.Fail);
        }
        if (source.Stop != null) {
            this.Stop = new String(source.Stop);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Scanning", this.Scanning);
        this.setParamSimple(map, prefix + "Ok", this.Ok);
        this.setParamSimple(map, prefix + "Fail", this.Fail);
        this.setParamSimple(map, prefix + "Stop", this.Stop);

    }
}

