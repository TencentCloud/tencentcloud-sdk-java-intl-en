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

public class GetFlowStatisticByNameRequest extends AbstractModel {

    /**
    * Device name.
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

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
    * Device name list. Used for querying traffic volume across devices. When this field is enabled, DeviceId can be "-1".
    */
    @SerializedName("DeviceList")
    @Expose
    private String [] DeviceList;

    /**
     * Get Device name. 
     * @return DeviceName Device name.
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set Device name.
     * @param DeviceName Device name.
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

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
     * Get Device name list. Used for querying traffic volume across devices. When this field is enabled, DeviceId can be "-1". 
     * @return DeviceList Device name list. Used for querying traffic volume across devices. When this field is enabled, DeviceId can be "-1".
     */
    public String [] getDeviceList() {
        return this.DeviceList;
    }

    /**
     * Set Device name list. Used for querying traffic volume across devices. When this field is enabled, DeviceId can be "-1".
     * @param DeviceList Device name list. Used for querying traffic volume across devices. When this field is enabled, DeviceId can be "-1".
     */
    public void setDeviceList(String [] DeviceList) {
        this.DeviceList = DeviceList;
    }

    public GetFlowStatisticByNameRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetFlowStatisticByNameRequest(GetFlowStatisticByNameRequest source) {
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
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
        if (source.DeviceList != null) {
            this.DeviceList = new String[source.DeviceList.length];
            for (int i = 0; i < source.DeviceList.length; i++) {
                this.DeviceList[i] = new String(source.DeviceList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "TimeGranularity", this.TimeGranularity);
        this.setParamSimple(map, prefix + "AccessRegion", this.AccessRegion);
        this.setParamSimple(map, prefix + "GatewayType", this.GatewayType);
        this.setParamArraySimple(map, prefix + "DeviceList.", this.DeviceList);

    }
}

