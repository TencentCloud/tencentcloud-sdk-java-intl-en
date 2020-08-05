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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyMediaLiveInputRequest extends AbstractModel{

    /**
    * Media input ID.
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Media input name, which can contain 1-32 letters, digits, and underscores and must be unique at the region level.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * List of IDs of bound security groups.
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * Input settings information.
One or two sets of settings need to be configured for RTMP_PUSH/RTMP_PULL/HLS_PULL/MP4_PULL.
This parameter can be left empty for RTP_PUSH and UDP_PUSH.
Note: if it is left empty or the array is empty, the original `InputSettings` value will be used.
    */
    @SerializedName("InputSettings")
    @Expose
    private InputSettingInfo [] InputSettings;

    /**
     * Get Media input ID. 
     * @return Id Media input ID.
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Media input ID.
     * @param Id Media input ID.
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Media input name, which can contain 1-32 letters, digits, and underscores and must be unique at the region level. 
     * @return Name Media input name, which can contain 1-32 letters, digits, and underscores and must be unique at the region level.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Media input name, which can contain 1-32 letters, digits, and underscores and must be unique at the region level.
     * @param Name Media input name, which can contain 1-32 letters, digits, and underscores and must be unique at the region level.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get List of IDs of bound security groups. 
     * @return SecurityGroupIds List of IDs of bound security groups.
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set List of IDs of bound security groups.
     * @param SecurityGroupIds List of IDs of bound security groups.
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get Input settings information.
One or two sets of settings need to be configured for RTMP_PUSH/RTMP_PULL/HLS_PULL/MP4_PULL.
This parameter can be left empty for RTP_PUSH and UDP_PUSH.
Note: if it is left empty or the array is empty, the original `InputSettings` value will be used. 
     * @return InputSettings Input settings information.
One or two sets of settings need to be configured for RTMP_PUSH/RTMP_PULL/HLS_PULL/MP4_PULL.
This parameter can be left empty for RTP_PUSH and UDP_PUSH.
Note: if it is left empty or the array is empty, the original `InputSettings` value will be used.
     */
    public InputSettingInfo [] getInputSettings() {
        return this.InputSettings;
    }

    /**
     * Set Input settings information.
One or two sets of settings need to be configured for RTMP_PUSH/RTMP_PULL/HLS_PULL/MP4_PULL.
This parameter can be left empty for RTP_PUSH and UDP_PUSH.
Note: if it is left empty or the array is empty, the original `InputSettings` value will be used.
     * @param InputSettings Input settings information.
One or two sets of settings need to be configured for RTMP_PUSH/RTMP_PULL/HLS_PULL/MP4_PULL.
This parameter can be left empty for RTP_PUSH and UDP_PUSH.
Note: if it is left empty or the array is empty, the original `InputSettings` value will be used.
     */
    public void setInputSettings(InputSettingInfo [] InputSettings) {
        this.InputSettings = InputSettings;
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

