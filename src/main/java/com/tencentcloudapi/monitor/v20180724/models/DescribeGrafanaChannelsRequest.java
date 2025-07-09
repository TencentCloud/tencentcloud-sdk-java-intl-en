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

public class DescribeGrafanaChannelsRequest extends AbstractModel {

    /**
    * TCMG instance ID, such as “grafana-12345678”.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Offset.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of items to be queried
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Alert channel name, such as “test”.
    */
    @SerializedName("ChannelName")
    @Expose
    private String ChannelName;

    /**
    * Alert channel ID, such as “nchannel-abcd1234”.
    */
    @SerializedName("ChannelIds")
    @Expose
    private String [] ChannelIds;

    /**
    * Alert channel status
    */
    @SerializedName("ChannelState")
    @Expose
    private Long ChannelState;

    /**
     * Get TCMG instance ID, such as “grafana-12345678”. 
     * @return InstanceId TCMG instance ID, such as “grafana-12345678”.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set TCMG instance ID, such as “grafana-12345678”.
     * @param InstanceId TCMG instance ID, such as “grafana-12345678”.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Offset. 
     * @return Offset Offset.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset.
     * @param Offset Offset.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of items to be queried 
     * @return Limit Number of items to be queried
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of items to be queried
     * @param Limit Number of items to be queried
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Alert channel name, such as “test”. 
     * @return ChannelName Alert channel name, such as “test”.
     */
    public String getChannelName() {
        return this.ChannelName;
    }

    /**
     * Set Alert channel name, such as “test”.
     * @param ChannelName Alert channel name, such as “test”.
     */
    public void setChannelName(String ChannelName) {
        this.ChannelName = ChannelName;
    }

    /**
     * Get Alert channel ID, such as “nchannel-abcd1234”. 
     * @return ChannelIds Alert channel ID, such as “nchannel-abcd1234”.
     */
    public String [] getChannelIds() {
        return this.ChannelIds;
    }

    /**
     * Set Alert channel ID, such as “nchannel-abcd1234”.
     * @param ChannelIds Alert channel ID, such as “nchannel-abcd1234”.
     */
    public void setChannelIds(String [] ChannelIds) {
        this.ChannelIds = ChannelIds;
    }

    /**
     * Get Alert channel status 
     * @return ChannelState Alert channel status
     */
    public Long getChannelState() {
        return this.ChannelState;
    }

    /**
     * Set Alert channel status
     * @param ChannelState Alert channel status
     */
    public void setChannelState(Long ChannelState) {
        this.ChannelState = ChannelState;
    }

    public DescribeGrafanaChannelsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeGrafanaChannelsRequest(DescribeGrafanaChannelsRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.ChannelName != null) {
            this.ChannelName = new String(source.ChannelName);
        }
        if (source.ChannelIds != null) {
            this.ChannelIds = new String[source.ChannelIds.length];
            for (int i = 0; i < source.ChannelIds.length; i++) {
                this.ChannelIds[i] = new String(source.ChannelIds[i]);
            }
        }
        if (source.ChannelState != null) {
            this.ChannelState = new Long(source.ChannelState);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "ChannelName", this.ChannelName);
        this.setParamArraySimple(map, prefix + "ChannelIds.", this.ChannelIds);
        this.setParamSimple(map, prefix + "ChannelState", this.ChannelState);

    }
}

