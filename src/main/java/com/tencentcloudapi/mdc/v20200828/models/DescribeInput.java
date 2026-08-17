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
    * Input ID.
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
Note: this field may return null, indicating that no valid values can be obtained.
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
    * Input address list.
    */
    @SerializedName("InputAddressList")
    @Expose
    private InputAddress [] InputAddressList;

    /**
    * Input IP allowlist.
    */
    @SerializedName("AllowIpList")
    @Expose
    private String [] AllowIpList;

    /**
    * SRT configuration information of input.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SRTSettings")
    @Expose
    private DescribeInputSRTSettings SRTSettings;

    /**
    * RTP configuration information of input.
Note: this field may return null, indicating that no valid values can be obtained.
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
    * RTMP configuration information of an input
    */
    @SerializedName("RTMPSettings")
    @Expose
    private DescribeInputRTMPSettings RTMPSettings;

    /**
    * Input failover
Note: this field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("FailOver")
    @Expose
    private String FailOver;

    /**
    * Available Zone Configuration: Under disaster recovery conditions, up to two are supported, corresponding to pipeline 0 and 1 in order. Otherwise, only one available zone is allowed.
    */
    @SerializedName("Zones")
    @Expose
    private String [] Zones;

    /**
    * The input RTMP_PULL configuration information.
    */
    @SerializedName("RTMPPullSettings")
    @Expose
    private DescribeInputRTMPPullSettings RTMPPullSettings;

    /**
    * The RTSP_PULL configuration information entered.
    */
    @SerializedName("RTSPPullSettings")
    @Expose
    private DescribeInputRTSPPullSettings RTSPPullSettings;

    /**
    * The input HLS-PULL configuration information.
    */
    @SerializedName("HLSPullSettings")
    @Expose
    private DescribeInputHLSPullSettings HLSPullSettings;

    /**
    * Extended smooth streaming configuration information.
    */
    @SerializedName("ResilientStream")
    @Expose
    private ResilientStreamConf ResilientStream;

    /**
    * The bound security group ID.
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * The input RIST configuration information.
    */
    @SerializedName("RISTSettings")
    @Expose
    private DescribeInputRISTSettings RISTSettings;

    /**
    * Enter URL information related to module configuration, including the provided streaming address or the configured third-party source address
    */
    @SerializedName("StreamUrls")
    @Expose
    private StreamUrlDetail [] StreamUrls;

    /**
    * Disaster recovery configuration items
    */
    @SerializedName("FailOverOption")
    @Expose
    private FailOverOption FailOverOption;

    /**
     * Get Input ID. 
     * @return InputId Input ID.
     */
    public String getInputId() {
        return this.InputId;
    }

    /**
     * Set Input ID.
     * @param InputId Input ID.
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
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Description Input description.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Input description.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Description Input description.
Note: this field may return null, indicating that no valid values can be obtained.
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
     * Get Input address list. 
     * @return InputAddressList Input address list.
     */
    public InputAddress [] getInputAddressList() {
        return this.InputAddressList;
    }

    /**
     * Set Input address list.
     * @param InputAddressList Input address list.
     */
    public void setInputAddressList(InputAddress [] InputAddressList) {
        this.InputAddressList = InputAddressList;
    }

    /**
     * Get Input IP allowlist. 
     * @return AllowIpList Input IP allowlist.
     */
    public String [] getAllowIpList() {
        return this.AllowIpList;
    }

    /**
     * Set Input IP allowlist.
     * @param AllowIpList Input IP allowlist.
     */
    public void setAllowIpList(String [] AllowIpList) {
        this.AllowIpList = AllowIpList;
    }

    /**
     * Get SRT configuration information of input.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return SRTSettings SRT configuration information of input.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public DescribeInputSRTSettings getSRTSettings() {
        return this.SRTSettings;
    }

    /**
     * Set SRT configuration information of input.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param SRTSettings SRT configuration information of input.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setSRTSettings(DescribeInputSRTSettings SRTSettings) {
        this.SRTSettings = SRTSettings;
    }

    /**
     * Get RTP configuration information of input.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return RTPSettings RTP configuration information of input.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public DescribeInputRTPSettings getRTPSettings() {
        return this.RTPSettings;
    }

    /**
     * Set RTP configuration information of input.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param RTPSettings RTP configuration information of input.
Note: this field may return null, indicating that no valid values can be obtained.
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
     * Get RTMP configuration information of an input 
     * @return RTMPSettings RTMP configuration information of an input
     */
    public DescribeInputRTMPSettings getRTMPSettings() {
        return this.RTMPSettings;
    }

    /**
     * Set RTMP configuration information of an input
     * @param RTMPSettings RTMP configuration information of an input
     */
    public void setRTMPSettings(DescribeInputRTMPSettings RTMPSettings) {
        this.RTMPSettings = RTMPSettings;
    }

    /**
     * Get Input failover
Note: this field may return `null`, indicating that no valid value was found. 
     * @return FailOver Input failover
Note: this field may return `null`, indicating that no valid value was found.
     */
    public String getFailOver() {
        return this.FailOver;
    }

    /**
     * Set Input failover
Note: this field may return `null`, indicating that no valid value was found.
     * @param FailOver Input failover
Note: this field may return `null`, indicating that no valid value was found.
     */
    public void setFailOver(String FailOver) {
        this.FailOver = FailOver;
    }

    /**
     * Get Available Zone Configuration: Under disaster recovery conditions, up to two are supported, corresponding to pipeline 0 and 1 in order. Otherwise, only one available zone is allowed. 
     * @return Zones Available Zone Configuration: Under disaster recovery conditions, up to two are supported, corresponding to pipeline 0 and 1 in order. Otherwise, only one available zone is allowed.
     */
    public String [] getZones() {
        return this.Zones;
    }

    /**
     * Set Available Zone Configuration: Under disaster recovery conditions, up to two are supported, corresponding to pipeline 0 and 1 in order. Otherwise, only one available zone is allowed.
     * @param Zones Available Zone Configuration: Under disaster recovery conditions, up to two are supported, corresponding to pipeline 0 and 1 in order. Otherwise, only one available zone is allowed.
     */
    public void setZones(String [] Zones) {
        this.Zones = Zones;
    }

    /**
     * Get The input RTMP_PULL configuration information. 
     * @return RTMPPullSettings The input RTMP_PULL configuration information.
     */
    public DescribeInputRTMPPullSettings getRTMPPullSettings() {
        return this.RTMPPullSettings;
    }

    /**
     * Set The input RTMP_PULL configuration information.
     * @param RTMPPullSettings The input RTMP_PULL configuration information.
     */
    public void setRTMPPullSettings(DescribeInputRTMPPullSettings RTMPPullSettings) {
        this.RTMPPullSettings = RTMPPullSettings;
    }

    /**
     * Get The RTSP_PULL configuration information entered. 
     * @return RTSPPullSettings The RTSP_PULL configuration information entered.
     */
    public DescribeInputRTSPPullSettings getRTSPPullSettings() {
        return this.RTSPPullSettings;
    }

    /**
     * Set The RTSP_PULL configuration information entered.
     * @param RTSPPullSettings The RTSP_PULL configuration information entered.
     */
    public void setRTSPPullSettings(DescribeInputRTSPPullSettings RTSPPullSettings) {
        this.RTSPPullSettings = RTSPPullSettings;
    }

    /**
     * Get The input HLS-PULL configuration information. 
     * @return HLSPullSettings The input HLS-PULL configuration information.
     */
    public DescribeInputHLSPullSettings getHLSPullSettings() {
        return this.HLSPullSettings;
    }

    /**
     * Set The input HLS-PULL configuration information.
     * @param HLSPullSettings The input HLS-PULL configuration information.
     */
    public void setHLSPullSettings(DescribeInputHLSPullSettings HLSPullSettings) {
        this.HLSPullSettings = HLSPullSettings;
    }

    /**
     * Get Extended smooth streaming configuration information. 
     * @return ResilientStream Extended smooth streaming configuration information.
     */
    public ResilientStreamConf getResilientStream() {
        return this.ResilientStream;
    }

    /**
     * Set Extended smooth streaming configuration information.
     * @param ResilientStream Extended smooth streaming configuration information.
     */
    public void setResilientStream(ResilientStreamConf ResilientStream) {
        this.ResilientStream = ResilientStream;
    }

    /**
     * Get The bound security group ID. 
     * @return SecurityGroupIds The bound security group ID.
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set The bound security group ID.
     * @param SecurityGroupIds The bound security group ID.
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get The input RIST configuration information. 
     * @return RISTSettings The input RIST configuration information.
     */
    public DescribeInputRISTSettings getRISTSettings() {
        return this.RISTSettings;
    }

    /**
     * Set The input RIST configuration information.
     * @param RISTSettings The input RIST configuration information.
     */
    public void setRISTSettings(DescribeInputRISTSettings RISTSettings) {
        this.RISTSettings = RISTSettings;
    }

    /**
     * Get Enter URL information related to module configuration, including the provided streaming address or the configured third-party source address 
     * @return StreamUrls Enter URL information related to module configuration, including the provided streaming address or the configured third-party source address
     */
    public StreamUrlDetail [] getStreamUrls() {
        return this.StreamUrls;
    }

    /**
     * Set Enter URL information related to module configuration, including the provided streaming address or the configured third-party source address
     * @param StreamUrls Enter URL information related to module configuration, including the provided streaming address or the configured third-party source address
     */
    public void setStreamUrls(StreamUrlDetail [] StreamUrls) {
        this.StreamUrls = StreamUrls;
    }

    /**
     * Get Disaster recovery configuration items 
     * @return FailOverOption Disaster recovery configuration items
     */
    public FailOverOption getFailOverOption() {
        return this.FailOverOption;
    }

    /**
     * Set Disaster recovery configuration items
     * @param FailOverOption Disaster recovery configuration items
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

