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
package com.tencentcloudapi.mdc.v20200828.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateInput extends AbstractModel {

    /**
    * Input name, which can contain 1 to 32 letters, digits, and underscores.
    */
    @SerializedName("InputName")
    @Expose
    private String InputName;

    /**
    * Input protocol. Valid values: `SRT`, `RTP`, `RTMP`
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Input description. Length: [0, 255].
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Allowlist of input IPs in CIDR format.
    */
    @SerializedName("AllowIpList")
    @Expose
    private String [] AllowIpList;

    /**
    * SRT configuration information of input.
    */
    @SerializedName("SRTSettings")
    @Expose
    private CreateInputSRTSettings SRTSettings;

    /**
    * RTP configuration information of input.
    */
    @SerializedName("RTPSettings")
    @Expose
    private CreateInputRTPSettings RTPSettings;

    /**
    * Input failover. Valid values: `OPEN`, `CLOSE` (default)
    */
    @SerializedName("FailOver")
    @Expose
    private String FailOver;

    /**
     * Get Input name, which can contain 1 to 32 letters, digits, and underscores. 
     * @return InputName Input name, which can contain 1 to 32 letters, digits, and underscores.
     */
    public String getInputName() {
        return this.InputName;
    }

    /**
     * Set Input name, which can contain 1 to 32 letters, digits, and underscores.
     * @param InputName Input name, which can contain 1 to 32 letters, digits, and underscores.
     */
    public void setInputName(String InputName) {
        this.InputName = InputName;
    }

    /**
     * Get Input protocol. Valid values: `SRT`, `RTP`, `RTMP` 
     * @return Protocol Input protocol. Valid values: `SRT`, `RTP`, `RTMP`
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Input protocol. Valid values: `SRT`, `RTP`, `RTMP`
     * @param Protocol Input protocol. Valid values: `SRT`, `RTP`, `RTMP`
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Input description. Length: [0, 255]. 
     * @return Description Input description. Length: [0, 255].
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Input description. Length: [0, 255].
     * @param Description Input description. Length: [0, 255].
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Allowlist of input IPs in CIDR format. 
     * @return AllowIpList Allowlist of input IPs in CIDR format.
     */
    public String [] getAllowIpList() {
        return this.AllowIpList;
    }

    /**
     * Set Allowlist of input IPs in CIDR format.
     * @param AllowIpList Allowlist of input IPs in CIDR format.
     */
    public void setAllowIpList(String [] AllowIpList) {
        this.AllowIpList = AllowIpList;
    }

    /**
     * Get SRT configuration information of input. 
     * @return SRTSettings SRT configuration information of input.
     */
    public CreateInputSRTSettings getSRTSettings() {
        return this.SRTSettings;
    }

    /**
     * Set SRT configuration information of input.
     * @param SRTSettings SRT configuration information of input.
     */
    public void setSRTSettings(CreateInputSRTSettings SRTSettings) {
        this.SRTSettings = SRTSettings;
    }

    /**
     * Get RTP configuration information of input. 
     * @return RTPSettings RTP configuration information of input.
     */
    public CreateInputRTPSettings getRTPSettings() {
        return this.RTPSettings;
    }

    /**
     * Set RTP configuration information of input.
     * @param RTPSettings RTP configuration information of input.
     */
    public void setRTPSettings(CreateInputRTPSettings RTPSettings) {
        this.RTPSettings = RTPSettings;
    }

    /**
     * Get Input failover. Valid values: `OPEN`, `CLOSE` (default) 
     * @return FailOver Input failover. Valid values: `OPEN`, `CLOSE` (default)
     */
    public String getFailOver() {
        return this.FailOver;
    }

    /**
     * Set Input failover. Valid values: `OPEN`, `CLOSE` (default)
     * @param FailOver Input failover. Valid values: `OPEN`, `CLOSE` (default)
     */
    public void setFailOver(String FailOver) {
        this.FailOver = FailOver;
    }

    public CreateInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateInput(CreateInput source) {
        if (source.InputName != null) {
            this.InputName = new String(source.InputName);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.AllowIpList != null) {
            this.AllowIpList = new String[source.AllowIpList.length];
            for (int i = 0; i < source.AllowIpList.length; i++) {
                this.AllowIpList[i] = new String(source.AllowIpList[i]);
            }
        }
        if (source.SRTSettings != null) {
            this.SRTSettings = new CreateInputSRTSettings(source.SRTSettings);
        }
        if (source.RTPSettings != null) {
            this.RTPSettings = new CreateInputRTPSettings(source.RTPSettings);
        }
        if (source.FailOver != null) {
            this.FailOver = new String(source.FailOver);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InputName", this.InputName);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArraySimple(map, prefix + "AllowIpList.", this.AllowIpList);
        this.setParamObj(map, prefix + "SRTSettings.", this.SRTSettings);
        this.setParamObj(map, prefix + "RTPSettings.", this.RTPSettings);
        this.setParamSimple(map, prefix + "FailOver", this.FailOver);

    }
}

