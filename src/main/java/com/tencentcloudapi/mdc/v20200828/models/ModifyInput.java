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

public class ModifyInput extends AbstractModel {

    /**
    * Input Id.
    */
    @SerializedName("InputId")
    @Expose
    private String InputId;

    /**
    * Enter a name.
    */
    @SerializedName("InputName")
    @Expose
    private String InputName;

    /**
    * Input description.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * IPs allowed for push, in CIDR format.
    */
    @SerializedName("AllowIpList")
    @Expose
    private String [] AllowIpList;

    /**
    * Configuration of SRT.
    */
    @SerializedName("SRTSettings")
    @Expose
    private CreateInputSRTSettings SRTSettings;

    /**
    * Configuration message of RTP.
    */
    @SerializedName("RTPSettings")
    @Expose
    private CreateInputRTPSettings RTPSettings;

    /**
    * Input protocol. Options: SRT, RTP, RTMP, RTMP_PULL, RTSP_PULL, RIST.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Input primary/replica switch. Option: [OPEN|CLOSE].
    */
    @SerializedName("FailOver")
    @Expose
    private String FailOver;

    /**
    * Configuration message of RTMP_PULL.
    */
    @SerializedName("RTMPPullSettings")
    @Expose
    private CreateInputRTMPPullSettings RTMPPullSettings;

    /**
    * Configuration message of RTSP_PULL.
    */
    @SerializedName("RTSPPullSettings")
    @Expose
    private CreateInputRTSPPullSettings RTSPPullSettings;

    /**
    * Configuration message of HLS_PULL.
    */
    @SerializedName("HLSPullSettings")
    @Expose
    private CreateInputHLSPullSettings HLSPullSettings;

    /**
    * Configuration message for smooth stream output during delayed playback.
    */
    @SerializedName("ResilientStream")
    @Expose
    private ResilientStreamConf ResilientStream;

    /**
    * ID of the bound input security group. Only one security group can be associated.
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * Availability zone. Optional. input limit: two availability zones. For this API, only the second availability zone participates in resource allocation. It is valid if disaster recovery is enabled or the RTSP_PULL protocol is involved during switching. The address will be reallocated.	
    */
    @SerializedName("Zones")
    @Expose
    private String [] Zones;

    /**
    * Configuration information of RIST.
    */
    @SerializedName("RISTSettings")
    @Expose
    private CreateInputRISTSettings RISTSettings;

    /**
    * Region of the input node.
    */
    @SerializedName("InputRegion")
    @Expose
    private String InputRegion;

    /**
    * Hot/cold backup related
    */
    @SerializedName("FailOverOption")
    @Expose
    private FailOverOption FailOverOption;

    /**
     * Get Input Id. 
     * @return InputId Input Id.
     */
    public String getInputId() {
        return this.InputId;
    }

    /**
     * Set Input Id.
     * @param InputId Input Id.
     */
    public void setInputId(String InputId) {
        this.InputId = InputId;
    }

    /**
     * Get Enter a name. 
     * @return InputName Enter a name.
     */
    public String getInputName() {
        return this.InputName;
    }

    /**
     * Set Enter a name.
     * @param InputName Enter a name.
     */
    public void setInputName(String InputName) {
        this.InputName = InputName;
    }

    /**
     * Get Input description. 
     * @return Description Input description.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Input description.
     * @param Description Input description.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get IPs allowed for push, in CIDR format. 
     * @return AllowIpList IPs allowed for push, in CIDR format.
     */
    public String [] getAllowIpList() {
        return this.AllowIpList;
    }

    /**
     * Set IPs allowed for push, in CIDR format.
     * @param AllowIpList IPs allowed for push, in CIDR format.
     */
    public void setAllowIpList(String [] AllowIpList) {
        this.AllowIpList = AllowIpList;
    }

    /**
     * Get Configuration of SRT. 
     * @return SRTSettings Configuration of SRT.
     */
    public CreateInputSRTSettings getSRTSettings() {
        return this.SRTSettings;
    }

    /**
     * Set Configuration of SRT.
     * @param SRTSettings Configuration of SRT.
     */
    public void setSRTSettings(CreateInputSRTSettings SRTSettings) {
        this.SRTSettings = SRTSettings;
    }

    /**
     * Get Configuration message of RTP. 
     * @return RTPSettings Configuration message of RTP.
     */
    public CreateInputRTPSettings getRTPSettings() {
        return this.RTPSettings;
    }

    /**
     * Set Configuration message of RTP.
     * @param RTPSettings Configuration message of RTP.
     */
    public void setRTPSettings(CreateInputRTPSettings RTPSettings) {
        this.RTPSettings = RTPSettings;
    }

    /**
     * Get Input protocol. Options: SRT, RTP, RTMP, RTMP_PULL, RTSP_PULL, RIST. 
     * @return Protocol Input protocol. Options: SRT, RTP, RTMP, RTMP_PULL, RTSP_PULL, RIST.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Input protocol. Options: SRT, RTP, RTMP, RTMP_PULL, RTSP_PULL, RIST.
     * @param Protocol Input protocol. Options: SRT, RTP, RTMP, RTMP_PULL, RTSP_PULL, RIST.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Input primary/replica switch. Option: [OPEN|CLOSE]. 
     * @return FailOver Input primary/replica switch. Option: [OPEN|CLOSE].
     */
    public String getFailOver() {
        return this.FailOver;
    }

    /**
     * Set Input primary/replica switch. Option: [OPEN|CLOSE].
     * @param FailOver Input primary/replica switch. Option: [OPEN|CLOSE].
     */
    public void setFailOver(String FailOver) {
        this.FailOver = FailOver;
    }

    /**
     * Get Configuration message of RTMP_PULL. 
     * @return RTMPPullSettings Configuration message of RTMP_PULL.
     */
    public CreateInputRTMPPullSettings getRTMPPullSettings() {
        return this.RTMPPullSettings;
    }

    /**
     * Set Configuration message of RTMP_PULL.
     * @param RTMPPullSettings Configuration message of RTMP_PULL.
     */
    public void setRTMPPullSettings(CreateInputRTMPPullSettings RTMPPullSettings) {
        this.RTMPPullSettings = RTMPPullSettings;
    }

    /**
     * Get Configuration message of RTSP_PULL. 
     * @return RTSPPullSettings Configuration message of RTSP_PULL.
     */
    public CreateInputRTSPPullSettings getRTSPPullSettings() {
        return this.RTSPPullSettings;
    }

    /**
     * Set Configuration message of RTSP_PULL.
     * @param RTSPPullSettings Configuration message of RTSP_PULL.
     */
    public void setRTSPPullSettings(CreateInputRTSPPullSettings RTSPPullSettings) {
        this.RTSPPullSettings = RTSPPullSettings;
    }

    /**
     * Get Configuration message of HLS_PULL. 
     * @return HLSPullSettings Configuration message of HLS_PULL.
     */
    public CreateInputHLSPullSettings getHLSPullSettings() {
        return this.HLSPullSettings;
    }

    /**
     * Set Configuration message of HLS_PULL.
     * @param HLSPullSettings Configuration message of HLS_PULL.
     */
    public void setHLSPullSettings(CreateInputHLSPullSettings HLSPullSettings) {
        this.HLSPullSettings = HLSPullSettings;
    }

    /**
     * Get Configuration message for smooth stream output during delayed playback. 
     * @return ResilientStream Configuration message for smooth stream output during delayed playback.
     */
    public ResilientStreamConf getResilientStream() {
        return this.ResilientStream;
    }

    /**
     * Set Configuration message for smooth stream output during delayed playback.
     * @param ResilientStream Configuration message for smooth stream output during delayed playback.
     */
    public void setResilientStream(ResilientStreamConf ResilientStream) {
        this.ResilientStream = ResilientStream;
    }

    /**
     * Get ID of the bound input security group. Only one security group can be associated. 
     * @return SecurityGroupIds ID of the bound input security group. Only one security group can be associated.
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set ID of the bound input security group. Only one security group can be associated.
     * @param SecurityGroupIds ID of the bound input security group. Only one security group can be associated.
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get Availability zone. Optional. input limit: two availability zones. For this API, only the second availability zone participates in resource allocation. It is valid if disaster recovery is enabled or the RTSP_PULL protocol is involved during switching. The address will be reallocated.	 
     * @return Zones Availability zone. Optional. input limit: two availability zones. For this API, only the second availability zone participates in resource allocation. It is valid if disaster recovery is enabled or the RTSP_PULL protocol is involved during switching. The address will be reallocated.	
     */
    public String [] getZones() {
        return this.Zones;
    }

    /**
     * Set Availability zone. Optional. input limit: two availability zones. For this API, only the second availability zone participates in resource allocation. It is valid if disaster recovery is enabled or the RTSP_PULL protocol is involved during switching. The address will be reallocated.	
     * @param Zones Availability zone. Optional. input limit: two availability zones. For this API, only the second availability zone participates in resource allocation. It is valid if disaster recovery is enabled or the RTSP_PULL protocol is involved during switching. The address will be reallocated.	
     */
    public void setZones(String [] Zones) {
        this.Zones = Zones;
    }

    /**
     * Get Configuration information of RIST. 
     * @return RISTSettings Configuration information of RIST.
     */
    public CreateInputRISTSettings getRISTSettings() {
        return this.RISTSettings;
    }

    /**
     * Set Configuration information of RIST.
     * @param RISTSettings Configuration information of RIST.
     */
    public void setRISTSettings(CreateInputRISTSettings RISTSettings) {
        this.RISTSettings = RISTSettings;
    }

    /**
     * Get Region of the input node. 
     * @return InputRegion Region of the input node.
     */
    public String getInputRegion() {
        return this.InputRegion;
    }

    /**
     * Set Region of the input node.
     * @param InputRegion Region of the input node.
     */
    public void setInputRegion(String InputRegion) {
        this.InputRegion = InputRegion;
    }

    /**
     * Get Hot/cold backup related 
     * @return FailOverOption Hot/cold backup related
     */
    public FailOverOption getFailOverOption() {
        return this.FailOverOption;
    }

    /**
     * Set Hot/cold backup related
     * @param FailOverOption Hot/cold backup related
     */
    public void setFailOverOption(FailOverOption FailOverOption) {
        this.FailOverOption = FailOverOption;
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
        this.setParamArraySimple(map, prefix + "Zones.", this.Zones);
        this.setParamObj(map, prefix + "RISTSettings.", this.RISTSettings);
        this.setParamSimple(map, prefix + "InputRegion", this.InputRegion);
        this.setParamObj(map, prefix + "FailOverOption.", this.FailOverOption);

    }
}

