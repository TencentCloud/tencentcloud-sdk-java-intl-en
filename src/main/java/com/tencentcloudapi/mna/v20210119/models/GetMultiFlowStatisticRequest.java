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

public class GetMultiFlowStatisticRequest extends AbstractModel {

    /**
    * Device id list, up to 10 devices at a time
    */
    @SerializedName("DeviceIds")
    @Expose
    private String [] DeviceIds;

    /**
    * 1659514436
    */
    @SerializedName("BeginTime")
    @Expose
    private Long BeginTime;

    /**
    * 1659515000
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * Statistics traffic type (1: uplink traffic, 2: downstream traffic, 3: sum of upstream and downstream)
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Statistical time granularity (1: hourly statistics, 2: daily statistics).
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
     * Get Device id list, up to 10 devices at a time 
     * @return DeviceIds Device id list, up to 10 devices at a time
     */
    public String [] getDeviceIds() {
        return this.DeviceIds;
    }

    /**
     * Set Device id list, up to 10 devices at a time
     * @param DeviceIds Device id list, up to 10 devices at a time
     */
    public void setDeviceIds(String [] DeviceIds) {
        this.DeviceIds = DeviceIds;
    }

    /**
     * Get 1659514436 
     * @return BeginTime 1659514436
     */
    public Long getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set 1659514436
     * @param BeginTime 1659514436
     */
    public void setBeginTime(Long BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get 1659515000 
     * @return EndTime 1659515000
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 1659515000
     * @param EndTime 1659515000
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Statistics traffic type (1: uplink traffic, 2: downstream traffic, 3: sum of upstream and downstream) 
     * @return Type Statistics traffic type (1: uplink traffic, 2: downstream traffic, 3: sum of upstream and downstream)
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Statistics traffic type (1: uplink traffic, 2: downstream traffic, 3: sum of upstream and downstream)
     * @param Type Statistics traffic type (1: uplink traffic, 2: downstream traffic, 3: sum of upstream and downstream)
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Statistical time granularity (1: hourly statistics, 2: daily statistics). 
     * @return TimeGranularity Statistical time granularity (1: hourly statistics, 2: daily statistics).
     */
    public Long getTimeGranularity() {
        return this.TimeGranularity;
    }

    /**
     * Set Statistical time granularity (1: hourly statistics, 2: daily statistics).
     * @param TimeGranularity Statistical time granularity (1: hourly statistics, 2: daily statistics).
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

    public GetMultiFlowStatisticRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetMultiFlowStatisticRequest(GetMultiFlowStatisticRequest source) {
        if (source.DeviceIds != null) {
            this.DeviceIds = new String[source.DeviceIds.length];
            for (int i = 0; i < source.DeviceIds.length; i++) {
                this.DeviceIds[i] = new String(source.DeviceIds[i]);
            }
        }
        if (source.BeginTime != null) {
            this.BeginTime = new Long(source.BeginTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DeviceIds.", this.DeviceIds);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "TimeGranularity", this.TimeGranularity);
        this.setParamSimple(map, prefix + "AccessRegion", this.AccessRegion);
        this.setParamSimple(map, prefix + "GatewayType", this.GatewayType);

    }
}

