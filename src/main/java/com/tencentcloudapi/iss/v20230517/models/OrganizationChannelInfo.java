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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OrganizationChannelInfo extends AbstractModel {

    /**
    * Device ID of the device channel
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * Device name of the device channel
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * Device channel ID
    */
    @SerializedName("ChannelId")
    @Expose
    private String ChannelId;

    /**
    * Device channel name.
    */
    @SerializedName("ChannelName")
    @Expose
    private String ChannelName;

    /**
    * Whether the channel is in a cloud migration plan. If so, it cannot be added to another cloud migration plan | true: in a cloud migration plan, false: not in a cloud migration plan
    */
    @SerializedName("InPlan")
    @Expose
    private Boolean InPlan;

    /**
     * Get Device ID of the device channel 
     * @return DeviceId Device ID of the device channel
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set Device ID of the device channel
     * @param DeviceId Device ID of the device channel
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get Device name of the device channel 
     * @return DeviceName Device name of the device channel
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set Device name of the device channel
     * @param DeviceName Device name of the device channel
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get Device channel ID 
     * @return ChannelId Device channel ID
     */
    public String getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set Device channel ID
     * @param ChannelId Device channel ID
     */
    public void setChannelId(String ChannelId) {
        this.ChannelId = ChannelId;
    }

    /**
     * Get Device channel name. 
     * @return ChannelName Device channel name.
     */
    public String getChannelName() {
        return this.ChannelName;
    }

    /**
     * Set Device channel name.
     * @param ChannelName Device channel name.
     */
    public void setChannelName(String ChannelName) {
        this.ChannelName = ChannelName;
    }

    /**
     * Get Whether the channel is in a cloud migration plan. If so, it cannot be added to another cloud migration plan | true: in a cloud migration plan, false: not in a cloud migration plan 
     * @return InPlan Whether the channel is in a cloud migration plan. If so, it cannot be added to another cloud migration plan | true: in a cloud migration plan, false: not in a cloud migration plan
     */
    public Boolean getInPlan() {
        return this.InPlan;
    }

    /**
     * Set Whether the channel is in a cloud migration plan. If so, it cannot be added to another cloud migration plan | true: in a cloud migration plan, false: not in a cloud migration plan
     * @param InPlan Whether the channel is in a cloud migration plan. If so, it cannot be added to another cloud migration plan | true: in a cloud migration plan, false: not in a cloud migration plan
     */
    public void setInPlan(Boolean InPlan) {
        this.InPlan = InPlan;
    }

    public OrganizationChannelInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OrganizationChannelInfo(OrganizationChannelInfo source) {
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.ChannelId != null) {
            this.ChannelId = new String(source.ChannelId);
        }
        if (source.ChannelName != null) {
            this.ChannelName = new String(source.ChannelName);
        }
        if (source.InPlan != null) {
            this.InPlan = new Boolean(source.InPlan);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);
        this.setParamSimple(map, prefix + "ChannelName", this.ChannelName);
        this.setParamSimple(map, prefix + "InPlan", this.InPlan);

    }
}

