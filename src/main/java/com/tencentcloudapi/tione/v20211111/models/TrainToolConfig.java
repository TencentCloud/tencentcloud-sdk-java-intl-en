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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TrainToolConfig extends AbstractModel {

    /**
    * 
    */
    @SerializedName("EnableHangMonitor")
    @Expose
    private Boolean EnableHangMonitor;

    /**
    * 
    */
    @SerializedName("HangMonitorNodes")
    @Expose
    private String [] HangMonitorNodes;

    /**
    * 
    */
    @SerializedName("LogHangTimeoutInMinute")
    @Expose
    private Long LogHangTimeoutInMinute;

    /**
     * Get  
     * @return EnableHangMonitor 
     */
    public Boolean getEnableHangMonitor() {
        return this.EnableHangMonitor;
    }

    /**
     * Set 
     * @param EnableHangMonitor 
     */
    public void setEnableHangMonitor(Boolean EnableHangMonitor) {
        this.EnableHangMonitor = EnableHangMonitor;
    }

    /**
     * Get  
     * @return HangMonitorNodes 
     */
    public String [] getHangMonitorNodes() {
        return this.HangMonitorNodes;
    }

    /**
     * Set 
     * @param HangMonitorNodes 
     */
    public void setHangMonitorNodes(String [] HangMonitorNodes) {
        this.HangMonitorNodes = HangMonitorNodes;
    }

    /**
     * Get  
     * @return LogHangTimeoutInMinute 
     */
    public Long getLogHangTimeoutInMinute() {
        return this.LogHangTimeoutInMinute;
    }

    /**
     * Set 
     * @param LogHangTimeoutInMinute 
     */
    public void setLogHangTimeoutInMinute(Long LogHangTimeoutInMinute) {
        this.LogHangTimeoutInMinute = LogHangTimeoutInMinute;
    }

    public TrainToolConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TrainToolConfig(TrainToolConfig source) {
        if (source.EnableHangMonitor != null) {
            this.EnableHangMonitor = new Boolean(source.EnableHangMonitor);
        }
        if (source.HangMonitorNodes != null) {
            this.HangMonitorNodes = new String[source.HangMonitorNodes.length];
            for (int i = 0; i < source.HangMonitorNodes.length; i++) {
                this.HangMonitorNodes[i] = new String(source.HangMonitorNodes[i]);
            }
        }
        if (source.LogHangTimeoutInMinute != null) {
            this.LogHangTimeoutInMinute = new Long(source.LogHangTimeoutInMinute);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnableHangMonitor", this.EnableHangMonitor);
        this.setParamArraySimple(map, prefix + "HangMonitorNodes.", this.HangMonitorNodes);
        this.setParamSimple(map, prefix + "LogHangTimeoutInMinute", this.LogHangTimeoutInMinute);

    }
}

