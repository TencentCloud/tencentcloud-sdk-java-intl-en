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

public class GetStatisticDataByNameRequest extends AbstractModel {

    /**
    * <p>Device name. If no device is specified, you can pass "-1"</p>
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * <p>Start time of statistics, unit: s</p>
    */
    @SerializedName("BeginTime")
    @Expose
    private Long BeginTime;

    /**
    * <p>Statistics end time, unit: s</p>
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * <p>Time granularity</p><p>Enumeration values:</p><ul><li>1: hourly statistics</li><li>2: daily statistics</li><li>3: per minute</li><li>4: every 5 minutes</li></ul>
    */
    @SerializedName("TimeGranularity")
    @Expose
    private Long TimeGranularity;

    /**
    * <p>Access region. Value range: ['MC','AP','EU','AM'] MC=Chinese mainland AP=Asia Pacific EU=Europe AM=Americas. If not specified, it represents all regions.</p>
    */
    @SerializedName("AccessRegion")
    @Expose
    private String AccessRegion;

    /**
    * <p>Gateway type. 0: public cloud gateway; 1: private gateway. Defaults to 0 if not passed.</p>
    */
    @SerializedName("GatewayType")
    @Expose
    private Long GatewayType;

    /**
    * <p>Device name list, up to 10 devices. Used when downloading traffic for multiple devices. At this point, DeviceName can be set to "-1"</p>
    */
    @SerializedName("DeviceList")
    @Expose
    private String [] DeviceList;

    /**
    * <p>Device group ID. Do not pass it if no group is specified. Used when downloading data by group</p>
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * <p>Application ID. If not specified, leave it blank. Used when downloading data by application</p>
    */
    @SerializedName("MpApplicationId")
    @Expose
    private String MpApplicationId;

    /**
     * Get <p>Device name. If no device is specified, you can pass "-1"</p> 
     * @return DeviceName <p>Device name. If no device is specified, you can pass "-1"</p>
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set <p>Device name. If no device is specified, you can pass "-1"</p>
     * @param DeviceName <p>Device name. If no device is specified, you can pass "-1"</p>
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get <p>Start time of statistics, unit: s</p> 
     * @return BeginTime <p>Start time of statistics, unit: s</p>
     */
    public Long getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set <p>Start time of statistics, unit: s</p>
     * @param BeginTime <p>Start time of statistics, unit: s</p>
     */
    public void setBeginTime(Long BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get <p>Statistics end time, unit: s</p> 
     * @return EndTime <p>Statistics end time, unit: s</p>
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>Statistics end time, unit: s</p>
     * @param EndTime <p>Statistics end time, unit: s</p>
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>Time granularity</p><p>Enumeration values:</p><ul><li>1: hourly statistics</li><li>2: daily statistics</li><li>3: per minute</li><li>4: every 5 minutes</li></ul> 
     * @return TimeGranularity <p>Time granularity</p><p>Enumeration values:</p><ul><li>1: hourly statistics</li><li>2: daily statistics</li><li>3: per minute</li><li>4: every 5 minutes</li></ul>
     */
    public Long getTimeGranularity() {
        return this.TimeGranularity;
    }

    /**
     * Set <p>Time granularity</p><p>Enumeration values:</p><ul><li>1: hourly statistics</li><li>2: daily statistics</li><li>3: per minute</li><li>4: every 5 minutes</li></ul>
     * @param TimeGranularity <p>Time granularity</p><p>Enumeration values:</p><ul><li>1: hourly statistics</li><li>2: daily statistics</li><li>3: per minute</li><li>4: every 5 minutes</li></ul>
     */
    public void setTimeGranularity(Long TimeGranularity) {
        this.TimeGranularity = TimeGranularity;
    }

    /**
     * Get <p>Access region. Value range: ['MC','AP','EU','AM'] MC=Chinese mainland AP=Asia Pacific EU=Europe AM=Americas. If not specified, it represents all regions.</p> 
     * @return AccessRegion <p>Access region. Value range: ['MC','AP','EU','AM'] MC=Chinese mainland AP=Asia Pacific EU=Europe AM=Americas. If not specified, it represents all regions.</p>
     */
    public String getAccessRegion() {
        return this.AccessRegion;
    }

    /**
     * Set <p>Access region. Value range: ['MC','AP','EU','AM'] MC=Chinese mainland AP=Asia Pacific EU=Europe AM=Americas. If not specified, it represents all regions.</p>
     * @param AccessRegion <p>Access region. Value range: ['MC','AP','EU','AM'] MC=Chinese mainland AP=Asia Pacific EU=Europe AM=Americas. If not specified, it represents all regions.</p>
     */
    public void setAccessRegion(String AccessRegion) {
        this.AccessRegion = AccessRegion;
    }

    /**
     * Get <p>Gateway type. 0: public cloud gateway; 1: private gateway. Defaults to 0 if not passed.</p> 
     * @return GatewayType <p>Gateway type. 0: public cloud gateway; 1: private gateway. Defaults to 0 if not passed.</p>
     */
    public Long getGatewayType() {
        return this.GatewayType;
    }

    /**
     * Set <p>Gateway type. 0: public cloud gateway; 1: private gateway. Defaults to 0 if not passed.</p>
     * @param GatewayType <p>Gateway type. 0: public cloud gateway; 1: private gateway. Defaults to 0 if not passed.</p>
     */
    public void setGatewayType(Long GatewayType) {
        this.GatewayType = GatewayType;
    }

    /**
     * Get <p>Device name list, up to 10 devices. Used when downloading traffic for multiple devices. At this point, DeviceName can be set to "-1"</p> 
     * @return DeviceList <p>Device name list, up to 10 devices. Used when downloading traffic for multiple devices. At this point, DeviceName can be set to "-1"</p>
     */
    public String [] getDeviceList() {
        return this.DeviceList;
    }

    /**
     * Set <p>Device name list, up to 10 devices. Used when downloading traffic for multiple devices. At this point, DeviceName can be set to "-1"</p>
     * @param DeviceList <p>Device name list, up to 10 devices. Used when downloading traffic for multiple devices. At this point, DeviceName can be set to "-1"</p>
     */
    public void setDeviceList(String [] DeviceList) {
        this.DeviceList = DeviceList;
    }

    /**
     * Get <p>Device group ID. Do not pass it if no group is specified. Used when downloading data by group</p> 
     * @return GroupId <p>Device group ID. Do not pass it if no group is specified. Used when downloading data by group</p>
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set <p>Device group ID. Do not pass it if no group is specified. Used when downloading data by group</p>
     * @param GroupId <p>Device group ID. Do not pass it if no group is specified. Used when downloading data by group</p>
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get <p>Application ID. If not specified, leave it blank. Used when downloading data by application</p> 
     * @return MpApplicationId <p>Application ID. If not specified, leave it blank. Used when downloading data by application</p>
     */
    public String getMpApplicationId() {
        return this.MpApplicationId;
    }

    /**
     * Set <p>Application ID. If not specified, leave it blank. Used when downloading data by application</p>
     * @param MpApplicationId <p>Application ID. If not specified, leave it blank. Used when downloading data by application</p>
     */
    public void setMpApplicationId(String MpApplicationId) {
        this.MpApplicationId = MpApplicationId;
    }

    public GetStatisticDataByNameRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetStatisticDataByNameRequest(GetStatisticDataByNameRequest source) {
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
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
        if (source.MpApplicationId != null) {
            this.MpApplicationId = new String(source.MpApplicationId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "TimeGranularity", this.TimeGranularity);
        this.setParamSimple(map, prefix + "AccessRegion", this.AccessRegion);
        this.setParamSimple(map, prefix + "GatewayType", this.GatewayType);
        this.setParamArraySimple(map, prefix + "DeviceList.", this.DeviceList);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "MpApplicationId", this.MpApplicationId);

    }
}

