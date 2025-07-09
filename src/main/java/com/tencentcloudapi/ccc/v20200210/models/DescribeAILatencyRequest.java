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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAILatencyRequest extends AbstractModel {

    /**
    * App ID (required), which can be viewed at https://console.cloud.tencent.com/ccc.
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * Session ID.
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * Search start time.	
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 1737350008
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
     * Get App ID (required), which can be viewed at https://console.cloud.tencent.com/ccc. 
     * @return SdkAppId App ID (required), which can be viewed at https://console.cloud.tencent.com/ccc.
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set App ID (required), which can be viewed at https://console.cloud.tencent.com/ccc.
     * @param SdkAppId App ID (required), which can be viewed at https://console.cloud.tencent.com/ccc.
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get Session ID. 
     * @return SessionId Session ID.
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set Session ID.
     * @param SessionId Session ID.
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get Search start time.	 
     * @return StartTime Search start time.	
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Search start time.	
     * @param StartTime Search start time.	
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 1737350008 
     * @return EndTime 1737350008
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 1737350008
     * @param EndTime 1737350008
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    public DescribeAILatencyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAILatencyRequest(DescribeAILatencyRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

