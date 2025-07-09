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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ManagementCommand extends AbstractModel {

    /**
    * Agent installation command
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Install")
    @Expose
    private String Install;

    /**
    * Agent restart command
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Restart")
    @Expose
    private String Restart;

    /**
    * Agent stop command
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Stop")
    @Expose
    private String Stop;

    /**
    * Agent status detection command
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StatusCheck")
    @Expose
    private String StatusCheck;

    /**
    * Agent log detection command
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LogCheck")
    @Expose
    private String LogCheck;

    /**
     * Get Agent installation command
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Install Agent installation command
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInstall() {
        return this.Install;
    }

    /**
     * Set Agent installation command
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Install Agent installation command
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstall(String Install) {
        this.Install = Install;
    }

    /**
     * Get Agent restart command
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Restart Agent restart command
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRestart() {
        return this.Restart;
    }

    /**
     * Set Agent restart command
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Restart Agent restart command
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRestart(String Restart) {
        this.Restart = Restart;
    }

    /**
     * Get Agent stop command
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Stop Agent stop command
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStop() {
        return this.Stop;
    }

    /**
     * Set Agent stop command
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Stop Agent stop command
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStop(String Stop) {
        this.Stop = Stop;
    }

    /**
     * Get Agent status detection command
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StatusCheck Agent status detection command
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStatusCheck() {
        return this.StatusCheck;
    }

    /**
     * Set Agent status detection command
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StatusCheck Agent status detection command
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatusCheck(String StatusCheck) {
        this.StatusCheck = StatusCheck;
    }

    /**
     * Get Agent log detection command
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LogCheck Agent log detection command
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLogCheck() {
        return this.LogCheck;
    }

    /**
     * Set Agent log detection command
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LogCheck Agent log detection command
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLogCheck(String LogCheck) {
        this.LogCheck = LogCheck;
    }

    public ManagementCommand() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ManagementCommand(ManagementCommand source) {
        if (source.Install != null) {
            this.Install = new String(source.Install);
        }
        if (source.Restart != null) {
            this.Restart = new String(source.Restart);
        }
        if (source.Stop != null) {
            this.Stop = new String(source.Stop);
        }
        if (source.StatusCheck != null) {
            this.StatusCheck = new String(source.StatusCheck);
        }
        if (source.LogCheck != null) {
            this.LogCheck = new String(source.LogCheck);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Install", this.Install);
        this.setParamSimple(map, prefix + "Restart", this.Restart);
        this.setParamSimple(map, prefix + "Stop", this.Stop);
        this.setParamSimple(map, prefix + "StatusCheck", this.StatusCheck);
        this.setParamSimple(map, prefix + "LogCheck", this.LogCheck);

    }
}

