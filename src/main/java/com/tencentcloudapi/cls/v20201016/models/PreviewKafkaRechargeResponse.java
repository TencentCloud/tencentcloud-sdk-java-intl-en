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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PreviewKafkaRechargeResponse extends AbstractModel {

    /**
    * Log sample, which is returned when `PreviewType` is set to `2`
    */
    @SerializedName("LogSample")
    @Expose
    private String LogSample;

    /**
    * Log preview result
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LogData")
    @Expose
    private String LogData;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Log sample, which is returned when `PreviewType` is set to `2` 
     * @return LogSample Log sample, which is returned when `PreviewType` is set to `2`
     */
    public String getLogSample() {
        return this.LogSample;
    }

    /**
     * Set Log sample, which is returned when `PreviewType` is set to `2`
     * @param LogSample Log sample, which is returned when `PreviewType` is set to `2`
     */
    public void setLogSample(String LogSample) {
        this.LogSample = LogSample;
    }

    /**
     * Get Log preview result
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LogData Log preview result
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLogData() {
        return this.LogData;
    }

    /**
     * Set Log preview result
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LogData Log preview result
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLogData(String LogData) {
        this.LogData = LogData;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public PreviewKafkaRechargeResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PreviewKafkaRechargeResponse(PreviewKafkaRechargeResponse source) {
        if (source.LogSample != null) {
            this.LogSample = new String(source.LogSample);
        }
        if (source.LogData != null) {
            this.LogData = new String(source.LogData);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LogSample", this.LogSample);
        this.setParamSimple(map, prefix + "LogData", this.LogData);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

