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

public class DescribeDeviceChannelData extends AbstractModel {

    /**
    * Device ID
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * Channel ID
    */
    @SerializedName("ChannelId")
    @Expose
    private String ChannelId;

    /**
    * Channel encoding
    */
    @SerializedName("ChannelCode")
    @Expose
    private String ChannelCode;

    /**
    * Channel name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Stream status (0: not transmitted, 1: in transit)
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Whether Ptz is controllable (0: no, 1: yes)
    */
    @SerializedName("PTZType")
    @Expose
    private Long PTZType;

    /**
    * Channel manufacturer
    */
    @SerializedName("Manufacturer")
    @Expose
    private String Manufacturer;

    /**
    * Channel supports resolution (resolution list separated by '/', National Standard Protocol example (6/3), custom example (12800960/640480))
    */
    @SerializedName("Resolution")
    @Expose
    private String Resolution;

    /**
    * Channel offline status (0: offline, 1: online)
    */
    @SerializedName("State")
    @Expose
    private Long State;

    /**
    * Region
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
     * Get Device ID 
     * @return DeviceId Device ID
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set Device ID
     * @param DeviceId Device ID
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get Channel ID 
     * @return ChannelId Channel ID
     */
    public String getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set Channel ID
     * @param ChannelId Channel ID
     */
    public void setChannelId(String ChannelId) {
        this.ChannelId = ChannelId;
    }

    /**
     * Get Channel encoding 
     * @return ChannelCode Channel encoding
     */
    public String getChannelCode() {
        return this.ChannelCode;
    }

    /**
     * Set Channel encoding
     * @param ChannelCode Channel encoding
     */
    public void setChannelCode(String ChannelCode) {
        this.ChannelCode = ChannelCode;
    }

    /**
     * Get Channel name 
     * @return Name Channel name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Channel name
     * @param Name Channel name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Stream status (0: not transmitted, 1: in transit) 
     * @return Status Stream status (0: not transmitted, 1: in transit)
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Stream status (0: not transmitted, 1: in transit)
     * @param Status Stream status (0: not transmitted, 1: in transit)
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Whether Ptz is controllable (0: no, 1: yes) 
     * @return PTZType Whether Ptz is controllable (0: no, 1: yes)
     */
    public Long getPTZType() {
        return this.PTZType;
    }

    /**
     * Set Whether Ptz is controllable (0: no, 1: yes)
     * @param PTZType Whether Ptz is controllable (0: no, 1: yes)
     */
    public void setPTZType(Long PTZType) {
        this.PTZType = PTZType;
    }

    /**
     * Get Channel manufacturer 
     * @return Manufacturer Channel manufacturer
     */
    public String getManufacturer() {
        return this.Manufacturer;
    }

    /**
     * Set Channel manufacturer
     * @param Manufacturer Channel manufacturer
     */
    public void setManufacturer(String Manufacturer) {
        this.Manufacturer = Manufacturer;
    }

    /**
     * Get Channel supports resolution (resolution list separated by '/', National Standard Protocol example (6/3), custom example (12800960/640480)) 
     * @return Resolution Channel supports resolution (resolution list separated by '/', National Standard Protocol example (6/3), custom example (12800960/640480))
     */
    public String getResolution() {
        return this.Resolution;
    }

    /**
     * Set Channel supports resolution (resolution list separated by '/', National Standard Protocol example (6/3), custom example (12800960/640480))
     * @param Resolution Channel supports resolution (resolution list separated by '/', National Standard Protocol example (6/3), custom example (12800960/640480))
     */
    public void setResolution(String Resolution) {
        this.Resolution = Resolution;
    }

    /**
     * Get Channel offline status (0: offline, 1: online) 
     * @return State Channel offline status (0: offline, 1: online)
     */
    public Long getState() {
        return this.State;
    }

    /**
     * Set Channel offline status (0: offline, 1: online)
     * @param State Channel offline status (0: offline, 1: online)
     */
    public void setState(Long State) {
        this.State = State;
    }

    /**
     * Get Region 
     * @return Region Region
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region
     * @param Region Region
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    public DescribeDeviceChannelData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDeviceChannelData(DescribeDeviceChannelData source) {
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
        if (source.ChannelId != null) {
            this.ChannelId = new String(source.ChannelId);
        }
        if (source.ChannelCode != null) {
            this.ChannelCode = new String(source.ChannelCode);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.PTZType != null) {
            this.PTZType = new Long(source.PTZType);
        }
        if (source.Manufacturer != null) {
            this.Manufacturer = new String(source.Manufacturer);
        }
        if (source.Resolution != null) {
            this.Resolution = new String(source.Resolution);
        }
        if (source.State != null) {
            this.State = new Long(source.State);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);
        this.setParamSimple(map, prefix + "ChannelCode", this.ChannelCode);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "PTZType", this.PTZType);
        this.setParamSimple(map, prefix + "Manufacturer", this.Manufacturer);
        this.setParamSimple(map, prefix + "Resolution", this.Resolution);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "Region", this.Region);

    }
}

