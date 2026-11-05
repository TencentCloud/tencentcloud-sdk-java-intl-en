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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NodeRunLog extends AbstractModel {

    /**
    * <p>Logs of node.</p>
    */
    @SerializedName("Log")
    @Expose
    private String Log;

    /**
    * <p>URLs of the complete content of logs of node (has a value only when the Log content exceeds the limit)</p>
    */
    @SerializedName("LogRef")
    @Expose
    private String LogRef;

    /**
     * Get <p>Logs of node.</p> 
     * @return Log <p>Logs of node.</p>
     */
    public String getLog() {
        return this.Log;
    }

    /**
     * Set <p>Logs of node.</p>
     * @param Log <p>Logs of node.</p>
     */
    public void setLog(String Log) {
        this.Log = Log;
    }

    /**
     * Get <p>URLs of the complete content of logs of node (has a value only when the Log content exceeds the limit)</p> 
     * @return LogRef <p>URLs of the complete content of logs of node (has a value only when the Log content exceeds the limit)</p>
     */
    public String getLogRef() {
        return this.LogRef;
    }

    /**
     * Set <p>URLs of the complete content of logs of node (has a value only when the Log content exceeds the limit)</p>
     * @param LogRef <p>URLs of the complete content of logs of node (has a value only when the Log content exceeds the limit)</p>
     */
    public void setLogRef(String LogRef) {
        this.LogRef = LogRef;
    }

    public NodeRunLog() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NodeRunLog(NodeRunLog source) {
        if (source.Log != null) {
            this.Log = new String(source.Log);
        }
        if (source.LogRef != null) {
            this.LogRef = new String(source.LogRef);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Log", this.Log);
        this.setParamSimple(map, prefix + "LogRef", this.LogRef);

    }
}

