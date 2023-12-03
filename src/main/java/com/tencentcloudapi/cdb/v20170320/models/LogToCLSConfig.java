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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LogToCLSConfig extends AbstractModel {

    /**
    * Enabling status of the feature.
Note: The return value may be null, indicating that no valid data can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * CLS log set ID.
Note: The return value may be null, indicating that no valid data can be obtained.
    */
    @SerializedName("LogSetId")
    @Expose
    private String LogSetId;

    /**
    * Log topic ID.
Note: The return value may be null, indicating that no valid data can be obtained.
    */
    @SerializedName("LogTopicId")
    @Expose
    private String LogTopicId;

    /**
     * Get Enabling status of the feature.
Note: The return value may be null, indicating that no valid data can be obtained. 
     * @return Status Enabling status of the feature.
Note: The return value may be null, indicating that no valid data can be obtained.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Enabling status of the feature.
Note: The return value may be null, indicating that no valid data can be obtained.
     * @param Status Enabling status of the feature.
Note: The return value may be null, indicating that no valid data can be obtained.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get CLS log set ID.
Note: The return value may be null, indicating that no valid data can be obtained. 
     * @return LogSetId CLS log set ID.
Note: The return value may be null, indicating that no valid data can be obtained.
     */
    public String getLogSetId() {
        return this.LogSetId;
    }

    /**
     * Set CLS log set ID.
Note: The return value may be null, indicating that no valid data can be obtained.
     * @param LogSetId CLS log set ID.
Note: The return value may be null, indicating that no valid data can be obtained.
     */
    public void setLogSetId(String LogSetId) {
        this.LogSetId = LogSetId;
    }

    /**
     * Get Log topic ID.
Note: The return value may be null, indicating that no valid data can be obtained. 
     * @return LogTopicId Log topic ID.
Note: The return value may be null, indicating that no valid data can be obtained.
     */
    public String getLogTopicId() {
        return this.LogTopicId;
    }

    /**
     * Set Log topic ID.
Note: The return value may be null, indicating that no valid data can be obtained.
     * @param LogTopicId Log topic ID.
Note: The return value may be null, indicating that no valid data can be obtained.
     */
    public void setLogTopicId(String LogTopicId) {
        this.LogTopicId = LogTopicId;
    }

    public LogToCLSConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LogToCLSConfig(LogToCLSConfig source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
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
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "LogSetId", this.LogSetId);
        this.setParamSimple(map, prefix + "LogTopicId", this.LogTopicId);

    }
}

