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

public class ControlDevicePTZRequest extends AbstractModel {

    /**
    * Channel ID (obtain from the channel query API DescribeDeviceChannel)
    */
    @SerializedName("ChannelId")
    @Expose
    private String ChannelId;

    /**
    * Command type (up, down, left, right).
Upper left: leftup, upper right: rightup, lower left: leftdown, lower right: rightdown
Zoom in: zoom in, zoom out: zoom out
Focus far: focusfar, focus near: focusnear
Iris in: enlarge aperture, iris out: shrink aperture)
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Command description (speed range: 1-8)
    */
    @SerializedName("Speed")
    @Expose
    private Long Speed;

    /**
     * Get Channel ID (obtain from the channel query API DescribeDeviceChannel) 
     * @return ChannelId Channel ID (obtain from the channel query API DescribeDeviceChannel)
     */
    public String getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set Channel ID (obtain from the channel query API DescribeDeviceChannel)
     * @param ChannelId Channel ID (obtain from the channel query API DescribeDeviceChannel)
     */
    public void setChannelId(String ChannelId) {
        this.ChannelId = ChannelId;
    }

    /**
     * Get Command type (up, down, left, right).
Upper left: leftup, upper right: rightup, lower left: leftdown, lower right: rightdown
Zoom in: zoom in, zoom out: zoom out
Focus far: focusfar, focus near: focusnear
Iris in: enlarge aperture, iris out: shrink aperture) 
     * @return Type Command type (up, down, left, right).
Upper left: leftup, upper right: rightup, lower left: leftdown, lower right: rightdown
Zoom in: zoom in, zoom out: zoom out
Focus far: focusfar, focus near: focusnear
Iris in: enlarge aperture, iris out: shrink aperture)
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Command type (up, down, left, right).
Upper left: leftup, upper right: rightup, lower left: leftdown, lower right: rightdown
Zoom in: zoom in, zoom out: zoom out
Focus far: focusfar, focus near: focusnear
Iris in: enlarge aperture, iris out: shrink aperture)
     * @param Type Command type (up, down, left, right).
Upper left: leftup, upper right: rightup, lower left: leftdown, lower right: rightdown
Zoom in: zoom in, zoom out: zoom out
Focus far: focusfar, focus near: focusnear
Iris in: enlarge aperture, iris out: shrink aperture)
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Command description (speed range: 1-8) 
     * @return Speed Command description (speed range: 1-8)
     */
    public Long getSpeed() {
        return this.Speed;
    }

    /**
     * Set Command description (speed range: 1-8)
     * @param Speed Command description (speed range: 1-8)
     */
    public void setSpeed(Long Speed) {
        this.Speed = Speed;
    }

    public ControlDevicePTZRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ControlDevicePTZRequest(ControlDevicePTZRequest source) {
        if (source.ChannelId != null) {
            this.ChannelId = new String(source.ChannelId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Speed != null) {
            this.Speed = new Long(source.Speed);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Speed", this.Speed);

    }
}

