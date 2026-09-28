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
package com.tencentcloudapi.alb.v20251030.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AccessLogConfig extends AbstractModel {

    /**
    * Log set ID of Cloud Log Service (CLS) for CLB
    */
    @SerializedName("LogSetId")
    @Expose
    private String LogSetId;

    /**
    * Log topic ID of Cloud Log Service (CLS) for CLB
    */
    @SerializedName("LogTopicId")
    @Expose
    private String LogTopicId;

    /**
     * Get Log set ID of Cloud Log Service (CLS) for CLB 
     * @return LogSetId Log set ID of Cloud Log Service (CLS) for CLB
     */
    public String getLogSetId() {
        return this.LogSetId;
    }

    /**
     * Set Log set ID of Cloud Log Service (CLS) for CLB
     * @param LogSetId Log set ID of Cloud Log Service (CLS) for CLB
     */
    public void setLogSetId(String LogSetId) {
        this.LogSetId = LogSetId;
    }

    /**
     * Get Log topic ID of Cloud Log Service (CLS) for CLB 
     * @return LogTopicId Log topic ID of Cloud Log Service (CLS) for CLB
     */
    public String getLogTopicId() {
        return this.LogTopicId;
    }

    /**
     * Set Log topic ID of Cloud Log Service (CLS) for CLB
     * @param LogTopicId Log topic ID of Cloud Log Service (CLS) for CLB
     */
    public void setLogTopicId(String LogTopicId) {
        this.LogTopicId = LogTopicId;
    }

    public AccessLogConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AccessLogConfig(AccessLogConfig source) {
        if (source.LogSetId != null) {
            this.LogSetId = new String(source.LogSetId);
        }
        if (source.LogTopicId != null) {
            this.LogTopicId = new String(source.LogTopicId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LogSetId", this.LogSetId);
        this.setParamSimple(map, prefix + "LogTopicId", this.LogTopicId);

    }
}

