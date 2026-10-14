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
package com.tencentcloudapi.mdc.v20200828.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateInput extends AbstractModel {

    /**
    * Enter a name. It can contain uppercase letters, lowercase letters, digits, and underscores. Length: [1, 32].
    */
    @SerializedName("InputName")
    @Expose
    private String InputName;

    /**
    * Input protocol. Selectable: [SRT|RTP|RTMP|RTMP_PULL|RTSP_PULL|RIST].
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Enter description. Length: [0, 255].
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Input IP allowlist in CIDR format.
    */
    @SerializedName("AllowIpList")
    @Expose
    private String [] AllowIpList;

    /**
    * SRT configuration information of the input.
    */
    @SerializedName("SRTSettings")
    @Expose
    private CreateInputSRTSettings SRTSettings;

    /**
    * Input RTP configuration message.
    */
    @SerializedName("RTPSettings")
    @Expose
    private CreateInputRTPSettings RTPSettings;

    /**
    * Primary/replica switch input. Selectable values: `OPEN` and `CLOSE`. Default value: `CLOSE`.
    */
    @SerializedName("FailOver")
    @Expose
    private String FailOver;

    /**
    * Input RTMP_PULL configuration message.
    */
    @SerializedName("RTMPPullSettings")
    @Expose
    private CreateInputRTMPPullSettings RTMPPullSettings;

    /**
    * Input RTSP_PULL configuration message.
    */
    @SerializedName("RTSPPullSettings")
    @Expose
    private CreateInputRTSPPullSettings RTSPPullSettings;

    /**
    * Input HLS_PULL configuration message.
    */
    @SerializedName("HLSPullSettings")
    @Expose
    private CreateInputHLSPullSettings HLSPullSettings;

    /**
    * Configuration message for smooth streaming during delayed broadcasting.
    */
    @SerializedName("ResilientStream")
    @Expose
    private ResilientStreamConf ResilientStream;

    /**
    * Bound input security group ID.
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * Availability zone. This parameter is optional. If disaster recovery is enabled, two different availability zones must be input. Otherwise, only one availability zone can be input.
    */
    @SerializedName("Zones")
    @Expose
    private String [] Zones;

    /**
    * Input RIST configuration message.
    */
    @SerializedName("RISTSettings")
    @Expose
    private CreateInputRISTSettings RISTSettings;

    /**
    * Region of the input node
    */
    @SerializedName("InputRegion")
    @Expose
    private String InputRegion;

    /**
    * Hot/cold backup
    */
    @SerializedName("FailOverOption")
    @Expose
    private FailOverOption FailOverOption;

    /**
     * Get Enter a name. It can contain uppercase letters, lowercase letters, digits, and underscores. Length: [1, 32]. 
     * @return InputName Enter a name. It can contain uppercase letters, lowercase letters, digits, and underscores. Length: [1, 32].
     */
    public String getInputName() {
        return this.InputName;
    }

    /**
     * Set Enter a name. It can contain uppercase letters, lowercase letters, digits, and underscores. Length: [1, 32].
     * @param InputName Enter a name. It can contain uppercase letters, lowercase letters, digits, and underscores. Length: [1, 32].
     */
    public void setInputName(String InputName) {
        this.InputName = InputName;
    }

    /**
     * Get Input protocol. Selectable: [SRT|RTP|RTMP|RTMP_PULL|RTSP_PULL|RIST]. 
     * @return Protocol Input protocol. Selectable: [SRT|RTP|RTMP|RTMP_PULL|RTSP_PULL|RIST].
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Input protocol. Selectable: [SRT|RTP|RTMP|RTMP_PULL|RTSP_PULL|RIST].
     * @param Protocol Input protocol. Selectable: [SRT|RTP|RTMP|RTMP_PULL|RTSP_PULL|RIST].
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Enter description. Length: [0, 255]. 
     * @return Description Enter description. Length: [0, 255].
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Enter description. Length: [0, 255].
     * @param Description Enter description. Length: [0, 255].
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Input IP allowlist in CIDR format. 
     * @return AllowIpList Input IP allowlist in CIDR format.
     */
    public String [] getAllowIpList() {
        return this.AllowIpList;
    }

    /**
     * Set Input IP allowlist in CIDR format.
     * @param AllowIpList Input IP allowlist in CIDR format.
     */
    public void setAllowIpList(String [] AllowIpList) {
        this.AllowIpList = AllowIpList;
    }

    /**
     * Get SRT configuration information of the input. 
     * @return SRTSettings SRT configuration information of the input.
     */
    public CreateInputSRTSettings getSRTSettings() {
        return this.SRTSettings;
    }

    /**
     * Set SRT configuration information of the input.
     * @param SRTSettings SRT configuration information of the input.
     */
    public void setSRTSettings(CreateInputSRTSettings SRTSettings) {
        this.SRTSettings = SRTSettings;
    }

    /**
     * Get Input RTP configuration message. 
     * @return RTPSettings Input RTP configuration message.
     */
    public CreateInputRTPSettings getRTPSettings() {
        return this.RTPSettings;
    }

    /**
     * Set Input RTP configuration message.
     * @param RTPSettings Input RTP configuration message.
     */
    public void setRTPSettings(CreateInputRTPSettings RTPSettings) {
        this.RTPSettings = RTPSettings;
    }

    /**
     * Get Primary/replica switch input. Selectable values: `OPEN` and `CLOSE`. Default value: `CLOSE`. 
     * @return FailOver Primary/replica switch input. Selectable values: `OPEN` and `CLOSE`. Default value: `CLOSE`.
     */
    public String getFailOver() {
        return this.FailOver;
    }

    /**
     * Set Primary/replica switch input. Selectable values: `OPEN` and `CLOSE`. Default value: `CLOSE`.
     * @param FailOver Primary/replica switch input. Selectable values: `OPEN` and `CLOSE`. Default value: `CLOSE`.
     */
    public void setFailOver(String FailOver) {
        this.FailOver = FailOver;
    }

    /**
     * Get Input RTMP_PULL configuration message. 
     * @return RTMPPullSettings Input RTMP_PULL configuration message.
     */
    public CreateInputRTMPPullSettings getRTMPPullSettings() {
        return this.RTMPPullSettings;
    }

    /**
     * Set Input RTMP_PULL configuration message.
     * @param RTMPPullSettings Input RTMP_PULL configuration message.
     */
    public void setRTMPPullSettings(CreateInputRTMPPullSettings RTMPPullSettings) {
        this.RTMPPullSettings = RTMPPullSettings;
    }

    /**
     * Get Input RTSP_PULL configuration message. 
     * @return RTSPPullSettings Input RTSP_PULL configuration message.
     */
    public CreateInputRTSPPullSettings getRTSPPullSettings() {
        return this.RTSPPullSettings;
    }

    /**
     * Set Input RTSP_PULL configuration message.
     * @param RTSPPullSettings Input RTSP_PULL configuration message.
     */
    public void setRTSPPullSettings(CreateInputRTSPPullSettings RTSPPullSettings) {
        this.RTSPPullSettings = RTSPPullSettings;
    }

    /**
     * Get Input HLS_PULL configuration message. 
     * @return HLSPullSettings Input HLS_PULL configuration message.
     */
    public CreateInputHLSPullSettings getHLSPullSettings() {
        return this.HLSPullSettings;
    }

    /**
     * Set Input HLS_PULL configuration message.
     * @param HLSPullSettings Input HLS_PULL configuration message.
     */
    public void setHLSPullSettings(CreateInputHLSPullSettings HLSPullSettings) {
        this.HLSPullSettings = HLSPullSettings;
    }

    /**
     * Get Configuration message for smooth streaming during delayed broadcasting. 
     * @return ResilientStream Configuration message for smooth streaming during delayed broadcasting.
     */
    public ResilientStreamConf getResilientStream() {
        return this.ResilientStream;
    }

    /**
     * Set Configuration message for smooth streaming during delayed broadcasting.
     * @param ResilientStream Configuration message for smooth streaming during delayed broadcasting.
     */
    public void setResilientStream(ResilientStreamConf ResilientStream) {
        this.ResilientStream = ResilientStream;
    }

    /**
     * Get Bound input security group ID. 
     * @return SecurityGroupIds Bound input security group ID.
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set Bound input security group ID.
     * @param SecurityGroupIds Bound input security group ID.
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get Availability zone. This parameter is optional. If disaster recovery is enabled, two different availability zones must be input. Otherwise, only one availability zone can be input. 
     * @return Zones Availability zone. This parameter is optional. If disaster recovery is enabled, two different availability zones must be input. Otherwise, only one availability zone can be input.
     */
    public String [] getZones() {
        return this.Zones;
    }

    /**
     * Set Availability zone. This parameter is optional. If disaster recovery is enabled, two different availability zones must be input. Otherwise, only one availability zone can be input.
     * @param Zones Availability zone. This parameter is optional. If disaster recovery is enabled, two different availability zones must be input. Otherwise, only one availability zone can be input.
     */
    public void setZones(String [] Zones) {
        this.Zones = Zones;
    }

    /**
     * Get Input RIST configuration message. 
     * @return RISTSettings Input RIST configuration message.
     */
    public CreateInputRISTSettings getRISTSettings() {
        return this.RISTSettings;
    }

    /**
     * Set Input RIST configuration message.
     * @param RISTSettings Input RIST configuration message.
     */
    public void setRISTSettings(CreateInputRISTSettings RISTSettings) {
        this.RISTSettings = RISTSettings;
    }

    /**
     * Get Region of the input node 
     * @return InputRegion Region of the input node
     */
    public String getInputRegion() {
        return this.InputRegion;
    }

    /**
     * Set Region of the input node
     * @param InputRegion Region of the input node
     */
    public void setInputRegion(String InputRegion) {
        this.InputRegion = InputRegion;
    }

    /**
     * Get Hot/cold backup 
     * @return FailOverOption Hot/cold backup
     */
    public FailOverOption getFailOverOption() {
        return this.FailOverOption;
    }

    /**
     * Set Hot/cold backup
     * @param FailOverOption Hot/cold backup
     */
    public void setFailOverOption(FailOverOption FailOverOption) {
        this.FailOverOption = FailOverOption;
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
        if (source.Zones != null) {
            this.Zones = new String[source.Zones.length];
            for (int i = 0; i < source.Zones.length; i++) {
                this.Zones[i] = new String(source.Zones[i]);
            }
        }
        if (source.RISTSettings != null) {
            this.RISTSettings = new CreateInputRISTSettings(source.RISTSettings);
        }
        if (source.InputRegion != null) {
            this.InputRegion = new String(source.InputRegion);
        }
        if (source.FailOverOption != null) {
            this.FailOverOption = new FailOverOption(source.FailOverOption);
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
        this.setParamObj(map, prefix + "RTMPPullSettings.", this.RTMPPullSettings);
        this.setParamObj(map, prefix + "RTSPPullSettings.", this.RTSPPullSettings);
        this.setParamObj(map, prefix + "HLSPullSettings.", this.HLSPullSettings);
        this.setParamObj(map, prefix + "ResilientStream.", this.ResilientStream);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamArraySimple(map, prefix + "Zones.", this.Zones);
        this.setParamObj(map, prefix + "RISTSettings.", this.RISTSettings);
        this.setParamSimple(map, prefix + "InputRegion", this.InputRegion);
        this.setParamObj(map, prefix + "FailOverOption.", this.FailOverOption);

    }
}

