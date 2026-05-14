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

public class GetFlowStatisticByRegionRequest extends AbstractModel {

    /**
    * Search start time
    */
    @SerializedName("BeginTime")
    @Expose
    private Long BeginTime;

    /**
    * end time
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * Traffic type (1: uplink traffic, 2: downstream traffic, 3: sum of upstream and downstream)
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Time granularity (1: hourly statistics, 2: daily statistics)
    */
    @SerializedName("TimeGranularity")
    @Expose
    private Long TimeGranularity;

    /**
    * Gateway type. 0: public cloud gateway; 1: private gateway.
    */
    @SerializedName("GatewayType")
    @Expose
    private Long GatewayType;

    /**
    * Access region. Value ranges from 'MC' to 'AM'. MC=Chinese mainland AP=Asia Pacific EU=Europe AM=Americas. Leave it blank to represent all regions.
    */
    @SerializedName("AccessRegion")
    @Expose
    private String AccessRegion;

    /**
     * Get Search start time 
     * @return BeginTime Search start time
     */
    public Long getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set Search start time
     * @param BeginTime Search start time
     */
    public void setBeginTime(Long BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get end time 
     * @return EndTime end time
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set end time
     * @param EndTime end time
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Traffic type (1: uplink traffic, 2: downstream traffic, 3: sum of upstream and downstream) 
     * @return Type Traffic type (1: uplink traffic, 2: downstream traffic, 3: sum of upstream and downstream)
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Traffic type (1: uplink traffic, 2: downstream traffic, 3: sum of upstream and downstream)
     * @param Type Traffic type (1: uplink traffic, 2: downstream traffic, 3: sum of upstream and downstream)
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Time granularity (1: hourly statistics, 2: daily statistics) 
     * @return TimeGranularity Time granularity (1: hourly statistics, 2: daily statistics)
     */
    public Long getTimeGranularity() {
        return this.TimeGranularity;
    }

    /**
     * Set Time granularity (1: hourly statistics, 2: daily statistics)
     * @param TimeGranularity Time granularity (1: hourly statistics, 2: daily statistics)
     */
    public void setTimeGranularity(Long TimeGranularity) {
        this.TimeGranularity = TimeGranularity;
    }

    /**
     * Get Gateway type. 0: public cloud gateway; 1: private gateway. 
     * @return GatewayType Gateway type. 0: public cloud gateway; 1: private gateway.
     */
    public Long getGatewayType() {
        return this.GatewayType;
    }

    /**
     * Set Gateway type. 0: public cloud gateway; 1: private gateway.
     * @param GatewayType Gateway type. 0: public cloud gateway; 1: private gateway.
     */
    public void setGatewayType(Long GatewayType) {
        this.GatewayType = GatewayType;
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

    public GetFlowStatisticByRegionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetFlowStatisticByRegionRequest(GetFlowStatisticByRegionRequest source) {
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
        if (source.GatewayType != null) {
            this.GatewayType = new Long(source.GatewayType);
        }
        if (source.AccessRegion != null) {
            this.AccessRegion = new String(source.AccessRegion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "TimeGranularity", this.TimeGranularity);
        this.setParamSimple(map, prefix + "GatewayType", this.GatewayType);
        this.setParamSimple(map, prefix + "AccessRegion", this.AccessRegion);

    }
}

