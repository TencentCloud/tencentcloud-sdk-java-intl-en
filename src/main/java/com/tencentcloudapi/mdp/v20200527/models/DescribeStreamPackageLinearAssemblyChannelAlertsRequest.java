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
package com.tencentcloudapi.mdp.v20200527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeStreamPackageLinearAssemblyChannelAlertsRequest extends AbstractModel {

    /**
    * Channel ID.
    */
    @SerializedName("ChannelId")
    @Expose
    private String ChannelId;

    /**
    * Query start time, Unix timestamp, supports queries in the last seven days.
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * Query end time, Unix timestamp, supports queries in the last seven days.
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
     * Get Channel ID. 
     * @return ChannelId Channel ID.
     */
    public String getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set Channel ID.
     * @param ChannelId Channel ID.
     */
    public void setChannelId(String ChannelId) {
        this.ChannelId = ChannelId;
    }

    /**
     * Get Query start time, Unix timestamp, supports queries in the last seven days. 
     * @return StartTime Query start time, Unix timestamp, supports queries in the last seven days.
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Query start time, Unix timestamp, supports queries in the last seven days.
     * @param StartTime Query start time, Unix timestamp, supports queries in the last seven days.
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Query end time, Unix timestamp, supports queries in the last seven days. 
     * @return EndTime Query end time, Unix timestamp, supports queries in the last seven days.
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Query end time, Unix timestamp, supports queries in the last seven days.
     * @param EndTime Query end time, Unix timestamp, supports queries in the last seven days.
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    public DescribeStreamPackageLinearAssemblyChannelAlertsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeStreamPackageLinearAssemblyChannelAlertsRequest(DescribeStreamPackageLinearAssemblyChannelAlertsRequest source) {
        if (source.ChannelId != null) {
            this.ChannelId = new String(source.ChannelId);
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
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}
