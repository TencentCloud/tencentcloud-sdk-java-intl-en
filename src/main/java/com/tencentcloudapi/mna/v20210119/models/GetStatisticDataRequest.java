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
package com.tencentcloudapi.mna.v20210119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetStatisticDataRequest extends AbstractModel {

    /**
    * Device ID. If not specified, pass "-1".
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * Start time of statistics (seconds).
    */
    @SerializedName("BeginTime")
    @Expose
    private Long BeginTime;

    /**
    * Statistics end time (s).
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * Aggregation granularity:
Hourly statistics
2: Daily statistics
    */
    @SerializedName("TimeGranularity")
    @Expose
    private Long TimeGranularity;

    /**
    * Access region. Value ranges from 'MC' to 'AM'. MC=Chinese mainland AP=Asia Pacific EU=Europe AM=Americas. Leave it blank to represent all regions.
    */
    @SerializedName("AccessRegion")
    @Expose
    private String AccessRegion;

    /**
    * Gateway type. 0: public cloud gateway; 1: private gateway. Default is 0 if not specified.
    */
    @SerializedName("GatewayType")
    @Expose
    private Long GatewayType;

    /**
    * Device ID list. Up to 10 devices. Used when downloading total traffic of multiple devices. At this point, DeviceId can be "-1".
    */
    @SerializedName("DeviceList")
    @Expose
    private String [] DeviceList;

    /**
    * Device group ID. If not specified, do not pass it. Used when downloading data by grouping.
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
     * Get Device ID. If not specified, pass "-1". 
     * @return DeviceId Device ID. If not specified, pass "-1".
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set Device ID. If not specified, pass "-1".
     * @param DeviceId Device ID. If not specified, pass "-1".
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get Start time of statistics (seconds). 
     * @return BeginTime Start time of statistics (seconds).
     */
    public Long getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set Start time of statistics (seconds).
     * @param BeginTime Start time of statistics (seconds).
     */
    public void setBeginTime(Long BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get Statistics end time (s). 
     * @return EndTime Statistics end time (s).
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Statistics end time (s).
     * @param EndTime Statistics end time (s).
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Aggregation granularity:
Hourly statistics
2: Daily statistics 
     * @return TimeGranularity Aggregation granularity:
Hourly statistics
2: Daily statistics
     */
    public Long getTimeGranularity() {
        return this.TimeGranularity;
    }

    /**
     * Set Aggregation granularity:
Hourly statistics
2: Daily statistics
     * @param TimeGranularity Aggregation granularity:
Hourly statistics
2: Daily statistics
     */
    public void setTimeGranularity(Long TimeGranularity) {
        this.TimeGranularity = TimeGranularity;
    }

    /**
     * Get Access region. Value ranges from 'MC' to 'AM'. MC=Chinese mainland AP=Asia Pacific EU=Europe AM=Americas. Leave it blank to represent all regions. 
     * @return AccessRegion Access region. Value ranges from 'MC' to 'AM'. MC=Chinese mainland AP=Asia Pacific EU=Europe AM=Americas. Leave it blank to represent all regions.
     */
    public String getAccessRegion() {
        return this.AccessRegion;
    }

    /**
     * Set Access region. Value ranges from 'MC' to 'AM'. MC=Chinese mainland AP=Asia Pacific EU=Europe AM=Americas. Leave it blank to represent all regions.
     * @param AccessRegion Access region. Value ranges from 'MC' to 'AM'. MC=Chinese mainland AP=Asia Pacific EU=Europe AM=Americas. Leave it blank to represent all regions.
     */
    public void setAccessRegion(String AccessRegion) {
        this.AccessRegion = AccessRegion;
    }

    /**
     * Get Gateway type. 0: public cloud gateway; 1: private gateway. Default is 0 if not specified. 
     * @return GatewayType Gateway type. 0: public cloud gateway; 1: private gateway. Default is 0 if not specified.
     */
    public Long getGatewayType() {
        return this.GatewayType;
    }

    /**
     * Set Gateway type. 0: public cloud gateway; 1: private gateway. Default is 0 if not specified.
     * @param GatewayType Gateway type. 0: public cloud gateway; 1: private gateway. Default is 0 if not specified.
     */
    public void setGatewayType(Long GatewayType) {
        this.GatewayType = GatewayType;
    }

    /**
     * Get Device ID list. Up to 10 devices. Used when downloading total traffic of multiple devices. At this point, DeviceId can be "-1". 
     * @return DeviceList Device ID list. Up to 10 devices. Used when downloading total traffic of multiple devices. At this point, DeviceId can be "-1".
     */
    public String [] getDeviceList() {
        return this.DeviceList;
    }

    /**
     * Set Device ID list. Up to 10 devices. Used when downloading total traffic of multiple devices. At this point, DeviceId can be "-1".
     * @param DeviceList Device ID list. Up to 10 devices. Used when downloading total traffic of multiple devices. At this point, DeviceId can be "-1".
     */
    public void setDeviceList(String [] DeviceList) {
        this.DeviceList = DeviceList;
    }

    /**
     * Get Device group ID. If not specified, do not pass it. Used when downloading data by grouping. 
     * @return GroupId Device group ID. If not specified, do not pass it. Used when downloading data by grouping.
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set Device group ID. If not specified, do not pass it. Used when downloading data by grouping.
     * @param GroupId Device group ID. If not specified, do not pass it. Used when downloading data by grouping.
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    public GetStatisticDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetStatisticDataRequest(GetStatisticDataRequest source) {
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
        if (source.BeginTime != null) {
            this.BeginTime = new Long(source.BeginTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.TimeGranularity != null) {
            this.TimeGranularity = new Long(source.TimeGranularity);
        }
        if (source.AccessRegion != null) {
            this.AccessRegion = new String(source.AccessRegion);
        }
        if (source.GatewayType != null) {
            this.GatewayType = new Long(source.GatewayType);
        }
        if (source.DeviceList != null) {
            this.DeviceList = new String[source.DeviceList.length];
            for (int i = 0; i < source.DeviceList.length; i++) {
                this.DeviceList[i] = new String(source.DeviceList[i]);
            }
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "TimeGranularity", this.TimeGranularity);
        this.setParamSimple(map, prefix + "AccessRegion", this.AccessRegion);
        this.setParamSimple(map, prefix + "GatewayType", this.GatewayType);
        this.setParamArraySimple(map, prefix + "DeviceList.", this.DeviceList);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);

    }
}

