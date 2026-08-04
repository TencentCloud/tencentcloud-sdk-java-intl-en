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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InferenceServiceDeploymentLogInfo extends AbstractModel {

    /**
    * Message content of log messages.
    */
    @SerializedName("LogMessage")
    @Expose
    private String LogMessage;

    /**
    * Log generation time.
    */
    @SerializedName("Timestamp")
    @Expose
    private String Timestamp;

    /**
     * Get Message content of log messages. 
     * @return LogMessage Message content of log messages.
     */
    public String getLogMessage() {
        return this.LogMessage;
    }

    /**
     * Set Message content of log messages.
     * @param LogMessage Message content of log messages.
     */
    public void setLogMessage(String LogMessage) {
        this.LogMessage = LogMessage;
    }

    /**
     * Get Log generation time. 
     * @return Timestamp Log generation time.
     */
    public String getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set Log generation time.
     * @param Timestamp Log generation time.
     */
    public void setTimestamp(String Timestamp) {
        this.Timestamp = Timestamp;
    }

    public InferenceServiceDeploymentLogInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InferenceServiceDeploymentLogInfo(InferenceServiceDeploymentLogInfo source) {
        if (source.LogMessage != null) {
            this.LogMessage = new String(source.LogMessage);
        }
        if (source.Timestamp != null) {
            this.Timestamp = new String(source.Timestamp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LogMessage", this.LogMessage);
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);

    }
}

