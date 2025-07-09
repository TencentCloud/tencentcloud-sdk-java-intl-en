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

public class DescribeGrafanaChannelsResponse extends AbstractModel {

    /**
    * Array of alert channels
    */
    @SerializedName("NotificationChannelSet")
    @Expose
    private GrafanaChannel [] NotificationChannelSet;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Array of alert channels 
     * @return NotificationChannelSet Array of alert channels
     */
    public GrafanaChannel [] getNotificationChannelSet() {
        return this.NotificationChannelSet;
    }

    /**
     * Set Array of alert channels
     * @param NotificationChannelSet Array of alert channels
     */
    public void setNotificationChannelSet(GrafanaChannel [] NotificationChannelSet) {
        this.NotificationChannelSet = NotificationChannelSet;
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

    public DescribeGrafanaChannelsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeGrafanaChannelsResponse(DescribeGrafanaChannelsResponse source) {
        if (source.NotificationChannelSet != null) {
            this.NotificationChannelSet = new GrafanaChannel[source.NotificationChannelSet.length];
            for (int i = 0; i < source.NotificationChannelSet.length; i++) {
                this.NotificationChannelSet[i] = new GrafanaChannel(source.NotificationChannelSet[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "NotificationChannelSet.", this.NotificationChannelSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

