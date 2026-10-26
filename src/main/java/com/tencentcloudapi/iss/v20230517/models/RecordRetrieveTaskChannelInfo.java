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

public class RecordRetrieveTaskChannelInfo extends AbstractModel {

    /**
    * Device ID to which the device channel belongs
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
    * Device channel name
    */
    @SerializedName("ChannelName")
    @Expose
    private String ChannelName;

    /**
    * Task status. 0: Retrieved, 1: Retrieving, 2: Pending retrieval, 3: No archived video recording
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get Device ID to which the device channel belongs 
     * @return DeviceId Device ID to which the device channel belongs
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set Device ID to which the device channel belongs
     * @param DeviceId Device ID to which the device channel belongs
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
     * Get Device channel name 
     * @return ChannelName Device channel name
     */
    public String getChannelName() {
        return this.ChannelName;
    }

    /**
     * Set Device channel name
     * @param ChannelName Device channel name
     */
    public void setChannelName(String ChannelName) {
        this.ChannelName = ChannelName;
    }

    /**
     * Get Task status. 0: Retrieved, 1: Retrieving, 2: Pending retrieval, 3: No archived video recording 
     * @return Status Task status. 0: Retrieved, 1: Retrieving, 2: Pending retrieval, 3: No archived video recording
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Task status. 0: Retrieved, 1: Retrieving, 2: Pending retrieval, 3: No archived video recording
     * @param Status Task status. 0: Retrieved, 1: Retrieving, 2: Pending retrieval, 3: No archived video recording
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public RecordRetrieveTaskChannelInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecordRetrieveTaskChannelInfo(RecordRetrieveTaskChannelInfo source) {
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
        if (source.Status != null) {
            this.Status = new Long(source.Status);
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
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

