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

public class DescribeInput extends AbstractModel {

    /**
    * Input Id.
    */
    @SerializedName("InputId")
    @Expose
    private String InputId;

    /**
    * Input name.
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
    * Input protocol.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Input the address list.
    */
    @SerializedName("InputAddressList")
    @Expose
    private InputAddress [] InputAddressList;

    /**
    * Input the IP whitelist list.
    */
    @SerializedName("AllowIpList")
    @Expose
    private String [] AllowIpList;

    /**
    * SRT configuration information of the input.
    */
    @SerializedName("SRTSettings")
    @Expose
    private DescribeInputSRTSettings SRTSettings;

    /**
    * Input RTP configuration message.
    */
    @SerializedName("RTPSettings")
    @Expose
    private DescribeInputRTPSettings RTPSettings;

    /**
    * Input region.
    */
    @SerializedName("InputRegion")
    @Expose
    private String InputRegion;

    /**
    * Input RTMP configuration message.
    */
    @SerializedName("RTMPSettings")
    @Expose
    private DescribeInputRTMPSettings RTMPSettings;

    /**
    * Primary/replica switch input.
    */
    @SerializedName("FailOver")
    @Expose
    private String FailOver;

    /**
    * Availability zone configuration. In the current situation with disaster recovery enabled, there can be up to two, corresponding to pipeline 0 and 1 in sequence. Otherwise, there is only one availability zone.
    */
    @SerializedName("Zones")
    @Expose
    private String [] Zones;

    /**
    * Input RTMP_PULL configuration message.
    */
    @SerializedName("RTMPPullSettings")
    @Expose
    private DescribeInputRTMPPullSettings RTMPPullSettings;

    /**
    * Input RTSP_PULL configuration message.
    */
    @SerializedName("RTSPPullSettings")
    @Expose
    private DescribeInputRTSPPullSettings RTSPPullSettings;

    /**
    * Input HLS_PULL configuration message.
    */
    @SerializedName("HLSPullSettings")
    @Expose
    private DescribeInputHLSPullSettings HLSPullSettings;

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
    * Input RIST configuration message.
    */
    @SerializedName("RISTSettings")
    @Expose
    private DescribeInputRISTSettings RISTSettings;

    /**
    * Input URL information related to module settings, including the provided streaming address or the configured third-party source stream URL.
    */
    @SerializedName("StreamUrls")
    @Expose
    private StreamUrlDetail [] StreamUrls;

    /**
    * Disaster recovery configuration item
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
     * Get Input name. 
     * @return InputName Input name.
     */
    public String getInputName() {
        return this.InputName;
    }

    /**
     * Set Input name.
     * @param InputName Input name.
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
     * Get Input protocol. 
     * @return Protocol Input protocol.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Input protocol.
     * @param Protocol Input protocol.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Input the address list. 
     * @return InputAddressList Input the address list.
     */
    public InputAddress [] getInputAddressList() {
        return this.InputAddressList;
    }

    /**
     * Set Input the address list.
     * @param InputAddressList Input the address list.
     */
    public void setInputAddressList(InputAddress [] InputAddressList) {
        this.InputAddressList = InputAddressList;
    }

    /**
     * Get Input the IP whitelist list. 
     * @return AllowIpList Input the IP whitelist list.
     */
    public String [] getAllowIpList() {
        return this.AllowIpList;
    }

    /**
     * Set Input the IP whitelist list.
     * @param AllowIpList Input the IP whitelist list.
     */
    public void setAllowIpList(String [] AllowIpList) {
        this.AllowIpList = AllowIpList;
    }

    /**
     * Get SRT configuration information of the input. 
     * @return SRTSettings SRT configuration information of the input.
     */
    public DescribeInputSRTSettings getSRTSettings() {
        return this.SRTSettings;
    }

    /**
     * Set SRT configuration information of the input.
     * @param SRTSettings SRT configuration information of the input.
     */
    public void setSRTSettings(DescribeInputSRTSettings SRTSettings) {
        this.SRTSettings = SRTSettings;
    }

    /**
     * Get Input RTP configuration message. 
     * @return RTPSettings Input RTP configuration message.
     */
    public DescribeInputRTPSettings getRTPSettings() {
        return this.RTPSettings;
    }

    /**
     * Set Input RTP configuration message.
     * @param RTPSettings Input RTP configuration message.
     */
    public void setRTPSettings(DescribeInputRTPSettings RTPSettings) {
        this.RTPSettings = RTPSettings;
    }

    /**
     * Get Input region. 
     * @return InputRegion Input region.
     */
    public String getInputRegion() {
        return this.InputRegion;
    }

    /**
     * Set Input region.
     * @param InputRegion Input region.
     */
    public void setInputRegion(String InputRegion) {
        this.InputRegion = InputRegion;
    }

    /**
     * Get Input RTMP configuration message. 
     * @return RTMPSettings Input RTMP configuration message.
     */
    public DescribeInputRTMPSettings getRTMPSettings() {
        return this.RTMPSettings;
    }

    /**
     * Set Input RTMP configuration message.
     * @param RTMPSettings Input RTMP configuration message.
     */
    public void setRTMPSettings(DescribeInputRTMPSettings RTMPSettings) {
        this.RTMPSettings = RTMPSettings;
    }

    /**
     * Get Primary/replica switch input. 
     * @return FailOver Primary/replica switch input.
     */
    public String getFailOver() {
        return this.FailOver;
    }

    /**
     * Set Primary/replica switch input.
     * @param FailOver Primary/replica switch input.
     */
    public void setFailOver(String FailOver) {
        this.FailOver = FailOver;
    }

    /**
     * Get Availability zone configuration. In the current situation with disaster recovery enabled, there can be up to two, corresponding to pipeline 0 and 1 in sequence. Otherwise, there is only one availability zone. 
     * @return Zones Availability zone configuration. In the current situation with disaster recovery enabled, there can be up to two, corresponding to pipeline 0 and 1 in sequence. Otherwise, there is only one availability zone.
     */
    public String [] getZones() {
        return this.Zones;
    }

    /**
     * Set Availability zone configuration. In the current situation with disaster recovery enabled, there can be up to two, corresponding to pipeline 0 and 1 in sequence. Otherwise, there is only one availability zone.
     * @param Zones Availability zone configuration. In the current situation with disaster recovery enabled, there can be up to two, corresponding to pipeline 0 and 1 in sequence. Otherwise, there is only one availability zone.
     */
    public void setZones(String [] Zones) {
        this.Zones = Zones;
    }

    /**
     * Get Input RTMP_PULL configuration message. 
     * @return RTMPPullSettings Input RTMP_PULL configuration message.
     */
    public DescribeInputRTMPPullSettings getRTMPPullSettings() {
        return this.RTMPPullSettings;
    }

    /**
     * Set Input RTMP_PULL configuration message.
     * @param RTMPPullSettings Input RTMP_PULL configuration message.
     */
    public void setRTMPPullSettings(DescribeInputRTMPPullSettings RTMPPullSettings) {
        this.RTMPPullSettings = RTMPPullSettings;
    }

    /**
     * Get Input RTSP_PULL configuration message. 
     * @return RTSPPullSettings Input RTSP_PULL configuration message.
     */
    public DescribeInputRTSPPullSettings getRTSPPullSettings() {
        return this.RTSPPullSettings;
    }

    /**
     * Set Input RTSP_PULL configuration message.
     * @param RTSPPullSettings Input RTSP_PULL configuration message.
     */
    public void setRTSPPullSettings(DescribeInputRTSPPullSettings RTSPPullSettings) {
        this.RTSPPullSettings = RTSPPullSettings;
    }

    /**
     * Get Input HLS_PULL configuration message. 
     * @return HLSPullSettings Input HLS_PULL configuration message.
     */
    public DescribeInputHLSPullSettings getHLSPullSettings() {
        return this.HLSPullSettings;
    }

    /**
     * Set Input HLS_PULL configuration message.
     * @param HLSPullSettings Input HLS_PULL configuration message.
     */
    public void setHLSPullSettings(DescribeInputHLSPullSettings HLSPullSettings) {
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
     * Get Input RIST configuration message. 
     * @return RISTSettings Input RIST configuration message.
     */
    public DescribeInputRISTSettings getRISTSettings() {
        return this.RISTSettings;
    }

    /**
     * Set Input RIST configuration message.
     * @param RISTSettings Input RIST configuration message.
     */
    public void setRISTSettings(DescribeInputRISTSettings RISTSettings) {
        this.RISTSettings = RISTSettings;
    }

    /**
     * Get Input URL information related to module settings, including the provided streaming address or the configured third-party source stream URL. 
     * @return StreamUrls Input URL information related to module settings, including the provided streaming address or the configured third-party source stream URL.
     */
    public StreamUrlDetail [] getStreamUrls() {
        return this.StreamUrls;
    }

    /**
     * Set Input URL information related to module settings, including the provided streaming address or the configured third-party source stream URL.
     * @param StreamUrls Input URL information related to module settings, including the provided streaming address or the configured third-party source stream URL.
     */
    public void setStreamUrls(StreamUrlDetail [] StreamUrls) {
        this.StreamUrls = StreamUrls;
    }

    /**
     * Get Disaster recovery configuration item 
     * @return FailOverOption Disaster recovery configuration item
     */
    public FailOverOption getFailOverOption() {
        return this.FailOverOption;
    }

    /**
     * Set Disaster recovery configuration item
     * @param FailOverOption Disaster recovery configuration item
     */
    public void setFailOverOption(FailOverOption FailOverOption) {
        this.FailOverOption = FailOverOption;
    }

    public DescribeInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInput(DescribeInput source) {
        if (source.InputId != null) {
            this.InputId = new String(source.InputId);
        }
        if (source.InputName != null) {
            this.InputName = new String(source.InputName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.InputAddressList != null) {
            this.InputAddressList = new InputAddress[source.InputAddressList.length];
            for (int i = 0; i < source.InputAddressList.length; i++) {
                this.InputAddressList[i] = new InputAddress(source.InputAddressList[i]);
            }
        }
        if (source.AllowIpList != null) {
            this.AllowIpList = new String[source.AllowIpList.length];
            for (int i = 0; i < source.AllowIpList.length; i++) {
                this.AllowIpList[i] = new String(source.AllowIpList[i]);
            }
        }
        if (source.SRTSettings != null) {
            this.SRTSettings = new DescribeInputSRTSettings(source.SRTSettings);
        }
        if (source.RTPSettings != null) {
            this.RTPSettings = new DescribeInputRTPSettings(source.RTPSettings);
        }
        if (source.InputRegion != null) {
            this.InputRegion = new String(source.InputRegion);
        }
        if (source.RTMPSettings != null) {
            this.RTMPSettings = new DescribeInputRTMPSettings(source.RTMPSettings);
        }
        if (source.FailOver != null) {
            this.FailOver = new String(source.FailOver);
        }
        if (source.Zones != null) {
            this.Zones = new String[source.Zones.length];
            for (int i = 0; i < source.Zones.length; i++) {
                this.Zones[i] = new String(source.Zones[i]);
            }
        }
        if (source.RTMPPullSettings != null) {
            this.RTMPPullSettings = new DescribeInputRTMPPullSettings(source.RTMPPullSettings);
        }
        if (source.RTSPPullSettings != null) {
            this.RTSPPullSettings = new DescribeInputRTSPPullSettings(source.RTSPPullSettings);
        }
        if (source.HLSPullSettings != null) {
            this.HLSPullSettings = new DescribeInputHLSPullSettings(source.HLSPullSettings);
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
        if (source.RISTSettings != null) {
            this.RISTSettings = new DescribeInputRISTSettings(source.RISTSettings);
        }
        if (source.StreamUrls != null) {
            this.StreamUrls = new StreamUrlDetail[source.StreamUrls.length];
            for (int i = 0; i < source.StreamUrls.length; i++) {
                this.StreamUrls[i] = new StreamUrlDetail(source.StreamUrls[i]);
            }
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
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamArrayObj(map, prefix + "InputAddressList.", this.InputAddressList);
        this.setParamArraySimple(map, prefix + "AllowIpList.", this.AllowIpList);
        this.setParamObj(map, prefix + "SRTSettings.", this.SRTSettings);
        this.setParamObj(map, prefix + "RTPSettings.", this.RTPSettings);
        this.setParamSimple(map, prefix + "InputRegion", this.InputRegion);
        this.setParamObj(map, prefix + "RTMPSettings.", this.RTMPSettings);
        this.setParamSimple(map, prefix + "FailOver", this.FailOver);
        this.setParamArraySimple(map, prefix + "Zones.", this.Zones);
        this.setParamObj(map, prefix + "RTMPPullSettings.", this.RTMPPullSettings);
        this.setParamObj(map, prefix + "RTSPPullSettings.", this.RTSPPullSettings);
        this.setParamObj(map, prefix + "HLSPullSettings.", this.HLSPullSettings);
        this.setParamObj(map, prefix + "ResilientStream.", this.ResilientStream);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamObj(map, prefix + "RISTSettings.", this.RISTSettings);
        this.setParamArrayObj(map, prefix + "StreamUrls.", this.StreamUrls);
        this.setParamObj(map, prefix + "FailOverOption.", this.FailOverOption);

    }
}

