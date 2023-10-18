/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.mdl.v20200326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateStreamLiveInputRequest extends AbstractModel {

    /**
    * Input name, which can contain 1-32 case-sensitive letters, digits, and underscores and must be unique at the region level
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Input type
Valid values: `RTMP_PUSH`, `RTP_PUSH`, `UDP_PUSH`, `RTMP_PULL`, `HLS_PULL`, `MP4_PULL`
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * ID of the input security group to attach
You can attach only one security group to an input.
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * Input settings. For the type `RTMP_PUSH`, `RTMP_PULL`, `HLS_PULL`, or `MP4_PULL`, 1 or 2 inputs of the corresponding type can be configured.
    */
    @SerializedName("InputSettings")
    @Expose
    private InputSettingInfo [] InputSettings;

    /**
     * Get Input name, which can contain 1-32 case-sensitive letters, digits, and underscores and must be unique at the region level 
     * @return Name Input name, which can contain 1-32 case-sensitive letters, digits, and underscores and must be unique at the region level
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Input name, which can contain 1-32 case-sensitive letters, digits, and underscores and must be unique at the region level
     * @param Name Input name, which can contain 1-32 case-sensitive letters, digits, and underscores and must be unique at the region level
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Input type
Valid values: `RTMP_PUSH`, `RTP_PUSH`, `UDP_PUSH`, `RTMP_PULL`, `HLS_PULL`, `MP4_PULL` 
     * @return Type Input type
Valid values: `RTMP_PUSH`, `RTP_PUSH`, `UDP_PUSH`, `RTMP_PULL`, `HLS_PULL`, `MP4_PULL`
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Input type
Valid values: `RTMP_PUSH`, `RTP_PUSH`, `UDP_PUSH`, `RTMP_PULL`, `HLS_PULL`, `MP4_PULL`
     * @param Type Input type
Valid values: `RTMP_PUSH`, `RTP_PUSH`, `UDP_PUSH`, `RTMP_PULL`, `HLS_PULL`, `MP4_PULL`
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get ID of the input security group to attach
You can attach only one security group to an input. 
     * @return SecurityGroupIds ID of the input security group to attach
You can attach only one security group to an input.
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set ID of the input security group to attach
You can attach only one security group to an input.
     * @param SecurityGroupIds ID of the input security group to attach
You can attach only one security group to an input.
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get Input settings. For the type `RTMP_PUSH`, `RTMP_PULL`, `HLS_PULL`, or `MP4_PULL`, 1 or 2 inputs of the corresponding type can be configured. 
     * @return InputSettings Input settings. For the type `RTMP_PUSH`, `RTMP_PULL`, `HLS_PULL`, or `MP4_PULL`, 1 or 2 inputs of the corresponding type can be configured.
     */
    public InputSettingInfo [] getInputSettings() {
        return this.InputSettings;
    }

    /**
     * Set Input settings. For the type `RTMP_PUSH`, `RTMP_PULL`, `HLS_PULL`, or `MP4_PULL`, 1 or 2 inputs of the corresponding type can be configured.
     * @param InputSettings Input settings. For the type `RTMP_PUSH`, `RTMP_PULL`, `HLS_PULL`, or `MP4_PULL`, 1 or 2 inputs of the corresponding type can be configured.
     */
    public void setInputSettings(InputSettingInfo [] InputSettings) {
        this.InputSettings = InputSettings;
    }

    public CreateStreamLiveInputRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateStreamLiveInputRequest(CreateStreamLiveInputRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.SecurityGroupIds != null) {
            this.SecurityGroupIds = new String[source.SecurityGroupIds.length];
            for (int i = 0; i < source.SecurityGroupIds.length; i++) {
                this.SecurityGroupIds[i] = new String(source.SecurityGroupIds[i]);
            }
        }
        if (source.InputSettings != null) {
            this.InputSettings = new InputSettingInfo[source.InputSettings.length];
            for (int i = 0; i < source.InputSettings.length; i++) {
                this.InputSettings[i] = new InputSettingInfo(source.InputSettings[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamArrayObj(map, prefix + "InputSettings.", this.InputSettings);

    }
}

