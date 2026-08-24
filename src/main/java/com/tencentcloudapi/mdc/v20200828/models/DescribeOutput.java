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

public class DescribeOutput extends AbstractModel {

    /**
    * Output ID.
    */
    @SerializedName("OutputId")
    @Expose
    private String OutputId;

    /**
    * Output name.
    */
    @SerializedName("OutputName")
    @Expose
    private String OutputName;

    /**
    * Output type.
    */
    @SerializedName("OutputType")
    @Expose
    private String OutputType;

    /**
    * Output description.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Output protocol.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Output destination address information list.
    */
    @SerializedName("OutputAddressList")
    @Expose
    private OutputAddress [] OutputAddressList;

    /**
    * Output region.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OutputRegion")
    @Expose
    private String OutputRegion;

    /**
    * SRT configuration information of output.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SRTSettings")
    @Expose
    private DescribeOutputSRTSettings SRTSettings;

    /**
    * RTP configuration information of output.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RTPSettings")
    @Expose
    private DescribeOutputRTPSettings RTPSettings;

    /**
    * RTMP configuration information of output.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RTMPSettings")
    @Expose
    private DescribeOutputRTMPSettings RTMPSettings;

    /**
    * RTMP pull configuration of the output
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("RTMPPullSettings")
    @Expose
    private DescribeOutputRTMPPullSettings RTMPPullSettings;

    /**
    * CIDR Whitelist List. Effective when Protocol is RTMP_PULL. Empty means no restriction on client IP.
    */
    @SerializedName("AllowIpList")
    @Expose
    private String [] AllowIpList;

    /**
    * The output RTSP streaming configuration information.
    */
    @SerializedName("RTSPPullSettings")
    @Expose
    private DescribeOutputRTSPPullSettings RTSPPullSettings;

    /**
    * Output the HLS streaming configuration information.
    */
    @SerializedName("HLSPullSettings")
    @Expose
    private DescribeOutputHLSPullSettings HLSPullSettings;

    /**
    * The maximum number of concurrent streams is 4, with a default of 4.
    */
    @SerializedName("MaxConcurrent")
    @Expose
    private Long MaxConcurrent;

    /**
    * The bound security group IDs.
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * The available zone currently only supports a maximum of one output.
    */
    @SerializedName("Zones")
    @Expose
    private String [] Zones;

    /**
    * Output RIST configuration information.
    */
    @SerializedName("RISTSettings")
    @Expose
    private DescribeOutputRISTSettings RISTSettings;

    /**
    * For streams containing multiple audio/video tracks, you can specify the tracks that need to be used
    */
    @SerializedName("PidSelector")
    @Expose
    private PidSelector PidSelector;

    /**
    * Output module types, including Pinpoint (single point output, supporting up to four concurrent outputs); MultiMesh (Multi output, supports concurrent outputs greater than four, currently up to 200). The default type is Pinpoint output. For a single Flow, a region can only have a maximum of one MultiMesh output.
    */
    @SerializedName("OutputKind")
    @Expose
    private String OutputKind;

    /**
    * Output module configuration, relevant URLs, including provided streaming addresses or configured output to third-party forwarding addresses
    */
    @SerializedName("StreamUrls")
    @Expose
    private StreamUrlDetail [] StreamUrls;

    /**
    * For streams containing multiple audio/video tracks, you can specify the tracks that need to be used
    */
    @SerializedName("StreamSelector")
    @Expose
    private StreamSelector StreamSelector;

    /**
     * Get Output ID. 
     * @return OutputId Output ID.
     */
    public String getOutputId() {
        return this.OutputId;
    }

    /**
     * Set Output ID.
     * @param OutputId Output ID.
     */
    public void setOutputId(String OutputId) {
        this.OutputId = OutputId;
    }

    /**
     * Get Output name. 
     * @return OutputName Output name.
     */
    public String getOutputName() {
        return this.OutputName;
    }

    /**
     * Set Output name.
     * @param OutputName Output name.
     */
    public void setOutputName(String OutputName) {
        this.OutputName = OutputName;
    }

    /**
     * Get Output type. 
     * @return OutputType Output type.
     */
    public String getOutputType() {
        return this.OutputType;
    }

    /**
     * Set Output type.
     * @param OutputType Output type.
     */
    public void setOutputType(String OutputType) {
        this.OutputType = OutputType;
    }

    /**
     * Get Output description.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Description Output description.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Output description.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Description Output description.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Output protocol. 
     * @return Protocol Output protocol.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Output protocol.
     * @param Protocol Output protocol.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Output destination address information list. 
     * @return OutputAddressList Output destination address information list.
     */
    public OutputAddress [] getOutputAddressList() {
        return this.OutputAddressList;
    }

    /**
     * Set Output destination address information list.
     * @param OutputAddressList Output destination address information list.
     */
    public void setOutputAddressList(OutputAddress [] OutputAddressList) {
        this.OutputAddressList = OutputAddressList;
    }

    /**
     * Get Output region.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return OutputRegion Output region.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getOutputRegion() {
        return this.OutputRegion;
    }

    /**
     * Set Output region.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param OutputRegion Output region.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setOutputRegion(String OutputRegion) {
        this.OutputRegion = OutputRegion;
    }

    /**
     * Get SRT configuration information of output.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return SRTSettings SRT configuration information of output.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public DescribeOutputSRTSettings getSRTSettings() {
        return this.SRTSettings;
    }

    /**
     * Set SRT configuration information of output.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param SRTSettings SRT configuration information of output.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setSRTSettings(DescribeOutputSRTSettings SRTSettings) {
        this.SRTSettings = SRTSettings;
    }

    /**
     * Get RTP configuration information of output.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return RTPSettings RTP configuration information of output.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public DescribeOutputRTPSettings getRTPSettings() {
        return this.RTPSettings;
    }

    /**
     * Set RTP configuration information of output.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param RTPSettings RTP configuration information of output.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setRTPSettings(DescribeOutputRTPSettings RTPSettings) {
        this.RTPSettings = RTPSettings;
    }

    /**
     * Get RTMP configuration information of output.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return RTMPSettings RTMP configuration information of output.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public DescribeOutputRTMPSettings getRTMPSettings() {
        return this.RTMPSettings;
    }

    /**
     * Set RTMP configuration information of output.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param RTMPSettings RTMP configuration information of output.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setRTMPSettings(DescribeOutputRTMPSettings RTMPSettings) {
        this.RTMPSettings = RTMPSettings;
    }

    /**
     * Get RTMP pull configuration of the output
Note: This field may return `null`, indicating that no valid value was found. 
     * @return RTMPPullSettings RTMP pull configuration of the output
Note: This field may return `null`, indicating that no valid value was found.
     */
    public DescribeOutputRTMPPullSettings getRTMPPullSettings() {
        return this.RTMPPullSettings;
    }

    /**
     * Set RTMP pull configuration of the output
Note: This field may return `null`, indicating that no valid value was found.
     * @param RTMPPullSettings RTMP pull configuration of the output
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setRTMPPullSettings(DescribeOutputRTMPPullSettings RTMPPullSettings) {
        this.RTMPPullSettings = RTMPPullSettings;
    }

    /**
     * Get CIDR Whitelist List. Effective when Protocol is RTMP_PULL. Empty means no restriction on client IP. 
     * @return AllowIpList CIDR Whitelist List. Effective when Protocol is RTMP_PULL. Empty means no restriction on client IP.
     */
    public String [] getAllowIpList() {
        return this.AllowIpList;
    }

    /**
     * Set CIDR Whitelist List. Effective when Protocol is RTMP_PULL. Empty means no restriction on client IP.
     * @param AllowIpList CIDR Whitelist List. Effective when Protocol is RTMP_PULL. Empty means no restriction on client IP.
     */
    public void setAllowIpList(String [] AllowIpList) {
        this.AllowIpList = AllowIpList;
    }

    /**
     * Get The output RTSP streaming configuration information. 
     * @return RTSPPullSettings The output RTSP streaming configuration information.
     */
    public DescribeOutputRTSPPullSettings getRTSPPullSettings() {
        return this.RTSPPullSettings;
    }

    /**
     * Set The output RTSP streaming configuration information.
     * @param RTSPPullSettings The output RTSP streaming configuration information.
     */
    public void setRTSPPullSettings(DescribeOutputRTSPPullSettings RTSPPullSettings) {
        this.RTSPPullSettings = RTSPPullSettings;
    }

    /**
     * Get Output the HLS streaming configuration information. 
     * @return HLSPullSettings Output the HLS streaming configuration information.
     */
    public DescribeOutputHLSPullSettings getHLSPullSettings() {
        return this.HLSPullSettings;
    }

    /**
     * Set Output the HLS streaming configuration information.
     * @param HLSPullSettings Output the HLS streaming configuration information.
     */
    public void setHLSPullSettings(DescribeOutputHLSPullSettings HLSPullSettings) {
        this.HLSPullSettings = HLSPullSettings;
    }

    /**
     * Get The maximum number of concurrent streams is 4, with a default of 4. 
     * @return MaxConcurrent The maximum number of concurrent streams is 4, with a default of 4.
     */
    public Long getMaxConcurrent() {
        return this.MaxConcurrent;
    }

    /**
     * Set The maximum number of concurrent streams is 4, with a default of 4.
     * @param MaxConcurrent The maximum number of concurrent streams is 4, with a default of 4.
     */
    public void setMaxConcurrent(Long MaxConcurrent) {
        this.MaxConcurrent = MaxConcurrent;
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

    /**
     * Get The available zone currently only supports a maximum of one output. 
     * @return Zones The available zone currently only supports a maximum of one output.
     */
    public String [] getZones() {
        return this.Zones;
    }

    /**
     * Set The available zone currently only supports a maximum of one output.
     * @param Zones The available zone currently only supports a maximum of one output.
     */
    public void setZones(String [] Zones) {
        this.Zones = Zones;
    }

    /**
     * Get Output RIST configuration information. 
     * @return RISTSettings Output RIST configuration information.
     */
    public DescribeOutputRISTSettings getRISTSettings() {
        return this.RISTSettings;
    }

    /**
     * Set Output RIST configuration information.
     * @param RISTSettings Output RIST configuration information.
     */
    public void setRISTSettings(DescribeOutputRISTSettings RISTSettings) {
        this.RISTSettings = RISTSettings;
    }

    /**
     * Get For streams containing multiple audio/video tracks, you can specify the tracks that need to be used 
     * @return PidSelector For streams containing multiple audio/video tracks, you can specify the tracks that need to be used
     * @deprecated
     */
    @Deprecated
    public PidSelector getPidSelector() {
        return this.PidSelector;
    }

    /**
     * Set For streams containing multiple audio/video tracks, you can specify the tracks that need to be used
     * @param PidSelector For streams containing multiple audio/video tracks, you can specify the tracks that need to be used
     * @deprecated
     */
    @Deprecated
    public void setPidSelector(PidSelector PidSelector) {
        this.PidSelector = PidSelector;
    }

    /**
     * Get Output module types, including Pinpoint (single point output, supporting up to four concurrent outputs); MultiMesh (Multi output, supports concurrent outputs greater than four, currently up to 200). The default type is Pinpoint output. For a single Flow, a region can only have a maximum of one MultiMesh output. 
     * @return OutputKind Output module types, including Pinpoint (single point output, supporting up to four concurrent outputs); MultiMesh (Multi output, supports concurrent outputs greater than four, currently up to 200). The default type is Pinpoint output. For a single Flow, a region can only have a maximum of one MultiMesh output.
     */
    public String getOutputKind() {
        return this.OutputKind;
    }

    /**
     * Set Output module types, including Pinpoint (single point output, supporting up to four concurrent outputs); MultiMesh (Multi output, supports concurrent outputs greater than four, currently up to 200). The default type is Pinpoint output. For a single Flow, a region can only have a maximum of one MultiMesh output.
     * @param OutputKind Output module types, including Pinpoint (single point output, supporting up to four concurrent outputs); MultiMesh (Multi output, supports concurrent outputs greater than four, currently up to 200). The default type is Pinpoint output. For a single Flow, a region can only have a maximum of one MultiMesh output.
     */
    public void setOutputKind(String OutputKind) {
        this.OutputKind = OutputKind;
    }

    /**
     * Get Output module configuration, relevant URLs, including provided streaming addresses or configured output to third-party forwarding addresses 
     * @return StreamUrls Output module configuration, relevant URLs, including provided streaming addresses or configured output to third-party forwarding addresses
     */
    public StreamUrlDetail [] getStreamUrls() {
        return this.StreamUrls;
    }

    /**
     * Set Output module configuration, relevant URLs, including provided streaming addresses or configured output to third-party forwarding addresses
     * @param StreamUrls Output module configuration, relevant URLs, including provided streaming addresses or configured output to third-party forwarding addresses
     */
    public void setStreamUrls(StreamUrlDetail [] StreamUrls) {
        this.StreamUrls = StreamUrls;
    }

    /**
     * Get For streams containing multiple audio/video tracks, you can specify the tracks that need to be used 
     * @return StreamSelector For streams containing multiple audio/video tracks, you can specify the tracks that need to be used
     */
    public StreamSelector getStreamSelector() {
        return this.StreamSelector;
    }

    /**
     * Set For streams containing multiple audio/video tracks, you can specify the tracks that need to be used
     * @param StreamSelector For streams containing multiple audio/video tracks, you can specify the tracks that need to be used
     */
    public void setStreamSelector(StreamSelector StreamSelector) {
        this.StreamSelector = StreamSelector;
    }

    public DescribeOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeOutput(DescribeOutput source) {
        if (source.OutputId != null) {
            this.OutputId = new String(source.OutputId);
        }
        if (source.OutputName != null) {
            this.OutputName = new String(source.OutputName);
        }
        if (source.OutputType != null) {
            this.OutputType = new String(source.OutputType);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.OutputAddressList != null) {
            this.OutputAddressList = new OutputAddress[source.OutputAddressList.length];
            for (int i = 0; i < source.OutputAddressList.length; i++) {
                this.OutputAddressList[i] = new OutputAddress(source.OutputAddressList[i]);
            }
        }
        if (source.OutputRegion != null) {
            this.OutputRegion = new String(source.OutputRegion);
        }
        if (source.SRTSettings != null) {
            this.SRTSettings = new DescribeOutputSRTSettings(source.SRTSettings);
        }
        if (source.RTPSettings != null) {
            this.RTPSettings = new DescribeOutputRTPSettings(source.RTPSettings);
        }
        if (source.RTMPSettings != null) {
            this.RTMPSettings = new DescribeOutputRTMPSettings(source.RTMPSettings);
        }
        if (source.RTMPPullSettings != null) {
            this.RTMPPullSettings = new DescribeOutputRTMPPullSettings(source.RTMPPullSettings);
        }
        if (source.AllowIpList != null) {
            this.AllowIpList = new String[source.AllowIpList.length];
            for (int i = 0; i < source.AllowIpList.length; i++) {
                this.AllowIpList[i] = new String(source.AllowIpList[i]);
            }
        }
        if (source.RTSPPullSettings != null) {
            this.RTSPPullSettings = new DescribeOutputRTSPPullSettings(source.RTSPPullSettings);
        }
        if (source.HLSPullSettings != null) {
            this.HLSPullSettings = new DescribeOutputHLSPullSettings(source.HLSPullSettings);
        }
        if (source.MaxConcurrent != null) {
            this.MaxConcurrent = new Long(source.MaxConcurrent);
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
            this.RISTSettings = new DescribeOutputRISTSettings(source.RISTSettings);
        }
        if (source.PidSelector != null) {
            this.PidSelector = new PidSelector(source.PidSelector);
        }
        if (source.OutputKind != null) {
            this.OutputKind = new String(source.OutputKind);
        }
        if (source.StreamUrls != null) {
            this.StreamUrls = new StreamUrlDetail[source.StreamUrls.length];
            for (int i = 0; i < source.StreamUrls.length; i++) {
                this.StreamUrls[i] = new StreamUrlDetail(source.StreamUrls[i]);
            }
        }
        if (source.StreamSelector != null) {
            this.StreamSelector = new StreamSelector(source.StreamSelector);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OutputId", this.OutputId);
        this.setParamSimple(map, prefix + "OutputName", this.OutputName);
        this.setParamSimple(map, prefix + "OutputType", this.OutputType);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamArrayObj(map, prefix + "OutputAddressList.", this.OutputAddressList);
        this.setParamSimple(map, prefix + "OutputRegion", this.OutputRegion);
        this.setParamObj(map, prefix + "SRTSettings.", this.SRTSettings);
        this.setParamObj(map, prefix + "RTPSettings.", this.RTPSettings);
        this.setParamObj(map, prefix + "RTMPSettings.", this.RTMPSettings);
        this.setParamObj(map, prefix + "RTMPPullSettings.", this.RTMPPullSettings);
        this.setParamArraySimple(map, prefix + "AllowIpList.", this.AllowIpList);
        this.setParamObj(map, prefix + "RTSPPullSettings.", this.RTSPPullSettings);
        this.setParamObj(map, prefix + "HLSPullSettings.", this.HLSPullSettings);
        this.setParamSimple(map, prefix + "MaxConcurrent", this.MaxConcurrent);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamArraySimple(map, prefix + "Zones.", this.Zones);
        this.setParamObj(map, prefix + "RISTSettings.", this.RISTSettings);
        this.setParamObj(map, prefix + "PidSelector.", this.PidSelector);
        this.setParamSimple(map, prefix + "OutputKind", this.OutputKind);
        this.setParamArrayObj(map, prefix + "StreamUrls.", this.StreamUrls);
        this.setParamObj(map, prefix + "StreamSelector.", this.StreamSelector);

    }
}

