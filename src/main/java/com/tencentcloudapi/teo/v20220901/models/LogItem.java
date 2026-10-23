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

public class LogItem extends AbstractModel {

    /**
    * Log generation time point, using unix millisecond-level timestamp.
    */
    @SerializedName("Timestamp")
    @Expose
    private Long Timestamp;

    /**
    * Specific contents of the log, using JSON String Format.
    */
    @SerializedName("LogJson")
    @Expose
    private String LogJson;

    /**
     * Get Log generation time point, using unix millisecond-level timestamp. 
     * @return Timestamp Log generation time point, using unix millisecond-level timestamp.
     */
    public Long getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set Log generation time point, using unix millisecond-level timestamp.
     * @param Timestamp Log generation time point, using unix millisecond-level timestamp.
     */
    public void setTimestamp(Long Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get Specific contents of the log, using JSON String Format. 
     * @return LogJson Specific contents of the log, using JSON String Format.
     */
    public String getLogJson() {
        return this.LogJson;
    }

    /**
     * Set Specific contents of the log, using JSON String Format.
     * @param LogJson Specific contents of the log, using JSON String Format.
     */
    public void setLogJson(String LogJson) {
        this.LogJson = LogJson;
    }

    public LogItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LogItem(LogItem source) {
        if (source.Timestamp != null) {
            this.Timestamp = new Long(source.Timestamp);
        }
        if (source.LogJson != null) {
            this.LogJson = new String(source.LogJson);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamSimple(map, prefix + "LogJson", this.LogJson);

    }
}

