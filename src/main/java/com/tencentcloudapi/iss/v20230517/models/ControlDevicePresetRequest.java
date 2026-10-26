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

public class ControlDevicePresetRequest extends AbstractModel {

    /**
    * Channel ID (obtain from the channel query API DescribeDeviceChannel)
    */
    @SerializedName("ChannelId")
    @Expose
    private String ChannelId;

    /**
    * Command (goto: preset position call;
Set: preset position settings
del: Delete preset position)
    */
    @SerializedName("Cmd")
    @Expose
    private String Cmd;

    /**
    * Preset position index (supports only index positions 1-10; an error is reported if exceeded)
    */
    @SerializedName("Index")
    @Expose
    private Long Index;

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
     * Get Command (goto: preset position call;
Set: preset position settings
del: Delete preset position) 
     * @return Cmd Command (goto: preset position call;
Set: preset position settings
del: Delete preset position)
     */
    public String getCmd() {
        return this.Cmd;
    }

    /**
     * Set Command (goto: preset position call;
Set: preset position settings
del: Delete preset position)
     * @param Cmd Command (goto: preset position call;
Set: preset position settings
del: Delete preset position)
     */
    public void setCmd(String Cmd) {
        this.Cmd = Cmd;
    }

    /**
     * Get Preset position index (supports only index positions 1-10; an error is reported if exceeded) 
     * @return Index Preset position index (supports only index positions 1-10; an error is reported if exceeded)
     */
    public Long getIndex() {
        return this.Index;
    }

    /**
     * Set Preset position index (supports only index positions 1-10; an error is reported if exceeded)
     * @param Index Preset position index (supports only index positions 1-10; an error is reported if exceeded)
     */
    public void setIndex(Long Index) {
        this.Index = Index;
    }

    public ControlDevicePresetRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ControlDevicePresetRequest(ControlDevicePresetRequest source) {
        if (source.ChannelId != null) {
            this.ChannelId = new String(source.ChannelId);
        }
        if (source.Cmd != null) {
            this.Cmd = new String(source.Cmd);
        }
        if (source.Index != null) {
            this.Index = new Long(source.Index);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);
        this.setParamSimple(map, prefix + "Cmd", this.Cmd);
        this.setParamSimple(map, prefix + "Index", this.Index);

    }
}

