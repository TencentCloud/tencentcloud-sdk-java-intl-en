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

public class DescribeSessionDetailRequest extends AbstractModel {

    /**
    * App ID (required). can be used to view https://console.cloud.tencent.com/ccc.
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * Specifies the session id of the call.
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * Start timestamp. Unix second-level timestamp. supports up to nearly 180 days.
    */
    @SerializedName("StartTimestamp")
    @Expose
    private Long StartTimestamp;

    /**
    * End timestamp, Unix second-level timestamp. the interval range between end time and start time is less than 90 days.
    */
    @SerializedName("EndTimestamp")
    @Expose
    private Long EndTimestamp;

    /**
     * Get App ID (required). can be used to view https://console.cloud.tencent.com/ccc. 
     * @return SdkAppId App ID (required). can be used to view https://console.cloud.tencent.com/ccc.
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set App ID (required). can be used to view https://console.cloud.tencent.com/ccc.
     * @param SdkAppId App ID (required). can be used to view https://console.cloud.tencent.com/ccc.
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get Specifies the session id of the call. 
     * @return SessionId Specifies the session id of the call.
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set Specifies the session id of the call.
     * @param SessionId Specifies the session id of the call.
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get Start timestamp. Unix second-level timestamp. supports up to nearly 180 days. 
     * @return StartTimestamp Start timestamp. Unix second-level timestamp. supports up to nearly 180 days.
     */
    public Long getStartTimestamp() {
        return this.StartTimestamp;
    }

    /**
     * Set Start timestamp. Unix second-level timestamp. supports up to nearly 180 days.
     * @param StartTimestamp Start timestamp. Unix second-level timestamp. supports up to nearly 180 days.
     */
    public void setStartTimestamp(Long StartTimestamp) {
        this.StartTimestamp = StartTimestamp;
    }

    /**
     * Get End timestamp, Unix second-level timestamp. the interval range between end time and start time is less than 90 days. 
     * @return EndTimestamp End timestamp, Unix second-level timestamp. the interval range between end time and start time is less than 90 days.
     */
    public Long getEndTimestamp() {
        return this.EndTimestamp;
    }

    /**
     * Set End timestamp, Unix second-level timestamp. the interval range between end time and start time is less than 90 days.
     * @param EndTimestamp End timestamp, Unix second-level timestamp. the interval range between end time and start time is less than 90 days.
     */
    public void setEndTimestamp(Long EndTimestamp) {
        this.EndTimestamp = EndTimestamp;
    }

    public DescribeSessionDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSessionDetailRequest(DescribeSessionDetailRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.StartTimestamp != null) {
            this.StartTimestamp = new Long(source.StartTimestamp);
        }
        if (source.EndTimestamp != null) {
            this.EndTimestamp = new Long(source.EndTimestamp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "StartTimestamp", this.StartTimestamp);
        this.setParamSimple(map, prefix + "EndTimestamp", this.EndTimestamp);

    }
}

