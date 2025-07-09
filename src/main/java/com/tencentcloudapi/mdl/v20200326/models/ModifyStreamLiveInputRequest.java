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
package com.tencentcloudapi.mdl.v20200326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyStreamLiveInputRequest extends AbstractModel {

    /**
    * Input ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Input name, which can contain 1-32 case-sensitive letters, digits, and underscores and must be unique at the region level
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * List of the IDs of the security groups to attach
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * Input settings. 
For the type:
`RTMP_PUSH`, `RTMP_PULL`, `HLS_PULL`,`RTSP_PULL`,`SRT_PULL` or `MP4_PULL`, 1 or 2 inputs of the corresponding type can be configured.
For the type:
`SRT_PUSH`, 0 or 2 inputs of the corresponding type can be configured.
This parameter can be left empty for RTP_PUSH and UDP_PUSH inputs.

Note: If this parameter is not specified or empty, the original input settings will be used.
    */
    @SerializedName("InputSettings")
    @Expose
    private InputSettingInfo [] InputSettings;

    /**
     * Get Input ID 
     * @return Id Input ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Input ID
     * @param Id Input ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

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
     * Get List of the IDs of the security groups to attach 
     * @return SecurityGroupIds List of the IDs of the security groups to attach
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set List of the IDs of the security groups to attach
     * @param SecurityGroupIds List of the IDs of the security groups to attach
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get Input settings. 
For the type:
`RTMP_PUSH`, `RTMP_PULL`, `HLS_PULL`,`RTSP_PULL`,`SRT_PULL` or `MP4_PULL`, 1 or 2 inputs of the corresponding type can be configured.
For the type:
`SRT_PUSH`, 0 or 2 inputs of the corresponding type can be configured.
This parameter can be left empty for RTP_PUSH and UDP_PUSH inputs.

Note: If this parameter is not specified or empty, the original input settings will be used. 
     * @return InputSettings Input settings. 
For the type:
`RTMP_PUSH`, `RTMP_PULL`, `HLS_PULL`,`RTSP_PULL`,`SRT_PULL` or `MP4_PULL`, 1 or 2 inputs of the corresponding type can be configured.
For the type:
`SRT_PUSH`, 0 or 2 inputs of the corresponding type can be configured.
This parameter can be left empty for RTP_PUSH and UDP_PUSH inputs.

Note: If this parameter is not specified or empty, the original input settings will be used.
     */
    public InputSettingInfo [] getInputSettings() {
        return this.InputSettings;
    }

    /**
     * Set Input settings. 
For the type:
`RTMP_PUSH`, `RTMP_PULL`, `HLS_PULL`,`RTSP_PULL`,`SRT_PULL` or `MP4_PULL`, 1 or 2 inputs of the corresponding type can be configured.
For the type:
`SRT_PUSH`, 0 or 2 inputs of the corresponding type can be configured.
This parameter can be left empty for RTP_PUSH and UDP_PUSH inputs.

Note: If this parameter is not specified or empty, the original input settings will be used.
     * @param InputSettings Input settings. 
For the type:
`RTMP_PUSH`, `RTMP_PULL`, `HLS_PULL`,`RTSP_PULL`,`SRT_PULL` or `MP4_PULL`, 1 or 2 inputs of the corresponding type can be configured.
For the type:
`SRT_PUSH`, 0 or 2 inputs of the corresponding type can be configured.
This parameter can be left empty for RTP_PUSH and UDP_PUSH inputs.

Note: If this parameter is not specified or empty, the original input settings will be used.
     */
    public void setInputSettings(InputSettingInfo [] InputSettings) {
        this.InputSettings = InputSettings;
    }

    public ModifyStreamLiveInputRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyStreamLiveInputRequest(ModifyStreamLiveInputRequest source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
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
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamArrayObj(map, prefix + "InputSettings.", this.InputSettings);

    }
}

