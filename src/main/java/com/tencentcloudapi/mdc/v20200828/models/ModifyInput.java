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

public class ModifyInput extends AbstractModel {

    /**
    * The input ID.
    */
    @SerializedName("InputId")
    @Expose
    private String InputId;

    /**
    * The input name.
    */
    @SerializedName("InputName")
    @Expose
    private String InputName;

    /**
    * The description of the input.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * The IP addresses (CIDR) allowed to push streams.
    */
    @SerializedName("AllowIpList")
    @Expose
    private String [] AllowIpList;

    /**
    * The SRT configuration information.
    */
    @SerializedName("SRTSettings")
    @Expose
    private CreateInputSRTSettings SRTSettings;

    /**
    * The RTP configuration information.
    */
    @SerializedName("RTPSettings")
    @Expose
    private CreateInputRTPSettings RTPSettings;

    /**
    * The input protocol. Valid values: SRT, RTP, RTMP.
If there is an RTP input, the output must be RTP.
If there is an RTMP input, the output must be SRT or RTMP.
If there is an SRT input, the output must be SRT.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Whether to enable input failover. Valid values: OPEN, CLOSE.
    */
    @SerializedName("FailOver")
    @Expose
    private String FailOver;

    /**
    * 
    */
    @SerializedName("RTMPPullSettings")
    @Expose
    private CreateInputRTMPPullSettings RTMPPullSettings;

    /**
    * 
    */
    @SerializedName("RTSPPullSettings")
    @Expose
    private CreateInputRTSPPullSettings RTSPPullSettings;

    /**
    * 
    */
    @SerializedName("HLSPullSettings")
    @Expose
    private CreateInputHLSPullSettings HLSPullSettings;

    /**
    * 
    */
    @SerializedName("ResilientStream")
    @Expose
    private ResilientStreamConf ResilientStream;

    /**
    * The bound security group IDs. 
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
     * Get The input ID. 
     * @return InputId The input ID.
     */
    public String getInputId() {
        return this.InputId;
    }

    /**
     * Set The input ID.
     * @param InputId The input ID.
     */
    public void setInputId(String InputId) {
        this.InputId = InputId;
    }

    /**
     * Get The input name. 
     * @return InputName The input name.
     */
    public String getInputName() {
        return this.InputName;
    }

    /**
     * Set The input name.
     * @param InputName The input name.
     */
    public void setInputName(String InputName) {
        this.InputName = InputName;
    }

    /**
     * Get The description of the input. 
     * @return Description The description of the input.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set The description of the input.
     * @param Description The description of the input.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get The IP addresses (CIDR) allowed to push streams. 
     * @return AllowIpList The IP addresses (CIDR) allowed to push streams.
     */
    public String [] getAllowIpList() {
        return this.AllowIpList;
    }

    /**
     * Set The IP addresses (CIDR) allowed to push streams.
     * @param AllowIpList The IP addresses (CIDR) allowed to push streams.
     */
    public void setAllowIpList(String [] AllowIpList) {
        this.AllowIpList = AllowIpList;
    }

    /**
     * Get The SRT configuration information. 
     * @return SRTSettings The SRT configuration information.
     */
    public CreateInputSRTSettings getSRTSettings() {
        return this.SRTSettings;
    }

    /**
     * Set The SRT configuration information.
     * @param SRTSettings The SRT configuration information.
     */
    public void setSRTSettings(CreateInputSRTSettings SRTSettings) {
        this.SRTSettings = SRTSettings;
    }

    /**
     * Get The RTP configuration information. 
     * @return RTPSettings The RTP configuration information.
     */
    public CreateInputRTPSettings getRTPSettings() {
        return this.RTPSettings;
    }

    /**
     * Set The RTP configuration information.
     * @param RTPSettings The RTP configuration information.
     */
    public void setRTPSettings(CreateInputRTPSettings RTPSettings) {
        this.RTPSettings = RTPSettings;
    }

    /**
     * Get The input protocol. Valid values: SRT, RTP, RTMP.
If there is an RTP input, the output must be RTP.
If there is an RTMP input, the output must be SRT or RTMP.
If there is an SRT input, the output must be SRT. 
     * @return Protocol The input protocol. Valid values: SRT, RTP, RTMP.
If there is an RTP input, the output must be RTP.
If there is an RTMP input, the output must be SRT or RTMP.
If there is an SRT input, the output must be SRT.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set The input protocol. Valid values: SRT, RTP, RTMP.
If there is an RTP input, the output must be RTP.
If there is an RTMP input, the output must be SRT or RTMP.
If there is an SRT input, the output must be SRT.
     * @param Protocol The input protocol. Valid values: SRT, RTP, RTMP.
If there is an RTP input, the output must be RTP.
If there is an RTMP input, the output must be SRT or RTMP.
If there is an SRT input, the output must be SRT.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Whether to enable input failover. Valid values: OPEN, CLOSE. 
     * @return FailOver Whether to enable input failover. Valid values: OPEN, CLOSE.
     */
    public String getFailOver() {
        return this.FailOver;
    }

    /**
     * Set Whether to enable input failover. Valid values: OPEN, CLOSE.
     * @param FailOver Whether to enable input failover. Valid values: OPEN, CLOSE.
     */
    public void setFailOver(String FailOver) {
        this.FailOver = FailOver;
    }

    /**
     * Get  
     * @return RTMPPullSettings 
     */
    public CreateInputRTMPPullSettings getRTMPPullSettings() {
        return this.RTMPPullSettings;
    }

    /**
     * Set 
     * @param RTMPPullSettings 
     */
    public void setRTMPPullSettings(CreateInputRTMPPullSettings RTMPPullSettings) {
        this.RTMPPullSettings = RTMPPullSettings;
    }

    /**
     * Get  
     * @return RTSPPullSettings 
     */
    public CreateInputRTSPPullSettings getRTSPPullSettings() {
        return this.RTSPPullSettings;
    }

    /**
     * Set 
     * @param RTSPPullSettings 
     */
    public void setRTSPPullSettings(CreateInputRTSPPullSettings RTSPPullSettings) {
        this.RTSPPullSettings = RTSPPullSettings;
    }

    /**
     * Get  
     * @return HLSPullSettings 
     */
    public CreateInputHLSPullSettings getHLSPullSettings() {
        return this.HLSPullSettings;
    }

    /**
     * Set 
     * @param HLSPullSettings 
     */
    public void setHLSPullSettings(CreateInputHLSPullSettings HLSPullSettings) {
        this.HLSPullSettings = HLSPullSettings;
    }

    /**
     * Get  
     * @return ResilientStream 
     */
    public ResilientStreamConf getResilientStream() {
        return this.ResilientStream;
    }

    /**
     * Set 
     * @param ResilientStream 
     */
    public void setResilientStream(ResilientStreamConf ResilientStream) {
        this.ResilientStream = ResilientStream;
    }

    /**
     * Get The bound security group IDs.  
     * @return SecurityGroupIds The bound security group IDs. 
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set The bound security group IDs. 
     * @param SecurityGroupIds The bound security group IDs. 
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    public ModifyInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyInput(ModifyInput source) {
        if (source.InputId != null) {
            this.InputId = new String(source.InputId);
        }
        if (source.InputName != null) {
            this.InputName = new String(source.InputName);
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
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.FailOver != null) {
            this.FailOver = new String(source.FailOver);
        }
        if (source.RTMPPullSettings != null) {
            this.RTMPPullSettings = new CreateInputRTMPPullSettings(source.RTMPPullSettings);
        }
        if (source.RTSPPullSettings != null) {
            this.RTSPPullSettings = new CreateInputRTSPPullSettings(source.RTSPPullSettings);
        }
        if (source.HLSPullSettings != null) {
            this.HLSPullSettings = new CreateInputHLSPullSettings(source.HLSPullSettings);
        }
        if (source.ResilientStream != null) {
            this.ResilientStream = new ResilientStreamConf(source.ResilientStream);
        }
        if (source.SecurityGroupIds != null) {
            this.SecurityGroupIds = new String[source.SecurityGroupIds.length];
            for (int i = 0; i < source.SecurityGroupIds.length; i++) {
                this.SecurityGroupIds[i] = new String(source.SecurityGroupIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InputId", this.InputId);
        this.setParamSimple(map, prefix + "InputName", this.InputName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArraySimple(map, prefix + "AllowIpList.", this.AllowIpList);
        this.setParamObj(map, prefix + "SRTSettings.", this.SRTSettings);
        this.setParamObj(map, prefix + "RTPSettings.", this.RTPSettings);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "FailOver", this.FailOver);
        this.setParamObj(map, prefix + "RTMPPullSettings.", this.RTMPPullSettings);
        this.setParamObj(map, prefix + "RTSPPullSettings.", this.RTSPPullSettings);
        this.setParamObj(map, prefix + "HLSPullSettings.", this.HLSPullSettings);
        this.setParamObj(map, prefix + "ResilientStream.", this.ResilientStream);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);

    }
}

