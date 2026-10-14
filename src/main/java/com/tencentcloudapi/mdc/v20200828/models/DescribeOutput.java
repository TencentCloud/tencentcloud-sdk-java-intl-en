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
    * <p>Output Id.</p>
    */
    @SerializedName("OutputId")
    @Expose
    private String OutputId;

    /**
    * <p>Output name.</p>
    */
    @SerializedName("OutputName")
    @Expose
    private String OutputName;

    /**
    * <p>Output type.</p>
    */
    @SerializedName("OutputType")
    @Expose
    private String OutputType;

    /**
    * <p>Output description.</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>Output protocol.</p>
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * <p>List of output egress address information.</p>
    */
    @SerializedName("OutputAddressList")
    @Expose
    private OutputAddress [] OutputAddressList;

    /**
    * <p>Output region.</p>
    */
    @SerializedName("OutputRegion")
    @Expose
    private String OutputRegion;

    /**
    * <p>SRT configuration information of the output.</p>
    */
    @SerializedName("SRTSettings")
    @Expose
    private DescribeOutputSRTSettings SRTSettings;

    /**
    * <p>Output RTP configuration message.</p>
    */
    @SerializedName("RTPSettings")
    @Expose
    private DescribeOutputRTPSettings RTPSettings;

    /**
    * <p>Output RTMP configuration message.</p>
    */
    @SerializedName("RTMPSettings")
    @Expose
    private DescribeOutputRTMPSettings RTMPSettings;

    /**
    * <p>Output RTMP pull configuration message.</p>
    */
    @SerializedName("RTMPPullSettings")
    @Expose
    private DescribeOutputRTMPPullSettings RTMPPullSettings;

    /**
    * <p>CIDR allowlist.<br>Valid when Protocol is RTMP_PULL. If empty, it represents no limit on client IP.</p>
    */
    @SerializedName("AllowIpList")
    @Expose
    private String [] AllowIpList;

    /**
    * <p>Output RTSP pull stream configuration message.</p>
    */
    @SerializedName("RTSPPullSettings")
    @Expose
    private DescribeOutputRTSPPullSettings RTSPPullSettings;

    /**
    * <p>Output HLS pull configuration message.</p>
    */
    @SerializedName("HLSPullSettings")
    @Expose
    private DescribeOutputHLSPullSettings HLSPullSettings;

    /**
    * <p>Maximum number of concurrent stream pulls. Maximum value: 4. Default value: 4.</p>
    */
    @SerializedName("MaxConcurrent")
    @Expose
    private Long MaxConcurrent;

    /**
    * <p>ID of the bound security group.</p>
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * <p>Availability zone. output currently supports a maximum of one.</p>
    */
    @SerializedName("Zones")
    @Expose
    private String [] Zones;

    /**
    * <p>Output RIST configuration message.</p>
    */
    @SerializedName("RISTSettings")
    @Expose
    private DescribeOutputRISTSettings RISTSettings;

    /**
    * <p>For streams with multiple audio/video tracks, you can specify the track to be used</p>
    */
    @SerializedName("PidSelector")
    @Expose
    private PidSelector PidSelector;

    /**
    * <p>Output module type, including Pinpoint (single-point output, supports up to four concurrent outputs); MultiMesh (multiple streams output, supports more than four concurrent outputs, currently up to 200). The default type is Pinpoint output. For one Flow, only one MultiMesh output is allowed in one zone.</p>
    */
    @SerializedName("OutputKind")
    @Expose
    private String OutputKind;

    /**
    * <p>Output module configuration, related URLs, including the provided pull stream address or the configured relay address for output to a third party</p>
    */
    @SerializedName("StreamUrls")
    @Expose
    private StreamUrlDetail [] StreamUrls;

    /**
    * <p>For streams with multiple audio/video tracks, you can specify the track to be used</p>
    */
    @SerializedName("StreamSelector")
    @Expose
    private StreamSelector StreamSelector;

    /**
    * <p>Output status.</p><p>Enumeration values:</p><ul><li>DISABLED</li><li>ENABLED</li></ul>
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
     * Get <p>Output Id.</p> 
     * @return OutputId <p>Output Id.</p>
     */
    public String getOutputId() {
        return this.OutputId;
    }

    /**
     * Set <p>Output Id.</p>
     * @param OutputId <p>Output Id.</p>
     */
    public void setOutputId(String OutputId) {
        this.OutputId = OutputId;
    }

    /**
     * Get <p>Output name.</p> 
     * @return OutputName <p>Output name.</p>
     */
    public String getOutputName() {
        return this.OutputName;
    }

    /**
     * Set <p>Output name.</p>
     * @param OutputName <p>Output name.</p>
     */
    public void setOutputName(String OutputName) {
        this.OutputName = OutputName;
    }

    /**
     * Get <p>Output type.</p> 
     * @return OutputType <p>Output type.</p>
     */
    public String getOutputType() {
        return this.OutputType;
    }

    /**
     * Set <p>Output type.</p>
     * @param OutputType <p>Output type.</p>
     */
    public void setOutputType(String OutputType) {
        this.OutputType = OutputType;
    }

    /**
     * Get <p>Output description.</p> 
     * @return Description <p>Output description.</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Output description.</p>
     * @param Description <p>Output description.</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>Output protocol.</p> 
     * @return Protocol <p>Output protocol.</p>
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set <p>Output protocol.</p>
     * @param Protocol <p>Output protocol.</p>
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get <p>List of output egress address information.</p> 
     * @return OutputAddressList <p>List of output egress address information.</p>
     */
    public OutputAddress [] getOutputAddressList() {
        return this.OutputAddressList;
    }

    /**
     * Set <p>List of output egress address information.</p>
     * @param OutputAddressList <p>List of output egress address information.</p>
     */
    public void setOutputAddressList(OutputAddress [] OutputAddressList) {
        this.OutputAddressList = OutputAddressList;
    }

    /**
     * Get <p>Output region.</p> 
     * @return OutputRegion <p>Output region.</p>
     */
    public String getOutputRegion() {
        return this.OutputRegion;
    }

    /**
     * Set <p>Output region.</p>
     * @param OutputRegion <p>Output region.</p>
     */
    public void setOutputRegion(String OutputRegion) {
        this.OutputRegion = OutputRegion;
    }

    /**
     * Get <p>SRT configuration information of the output.</p> 
     * @return SRTSettings <p>SRT configuration information of the output.</p>
     */
    public DescribeOutputSRTSettings getSRTSettings() {
        return this.SRTSettings;
    }

    /**
     * Set <p>SRT configuration information of the output.</p>
     * @param SRTSettings <p>SRT configuration information of the output.</p>
     */
    public void setSRTSettings(DescribeOutputSRTSettings SRTSettings) {
        this.SRTSettings = SRTSettings;
    }

    /**
     * Get <p>Output RTP configuration message.</p> 
     * @return RTPSettings <p>Output RTP configuration message.</p>
     */
    public DescribeOutputRTPSettings getRTPSettings() {
        return this.RTPSettings;
    }

    /**
     * Set <p>Output RTP configuration message.</p>
     * @param RTPSettings <p>Output RTP configuration message.</p>
     */
    public void setRTPSettings(DescribeOutputRTPSettings RTPSettings) {
        this.RTPSettings = RTPSettings;
    }

    /**
     * Get <p>Output RTMP configuration message.</p> 
     * @return RTMPSettings <p>Output RTMP configuration message.</p>
     */
    public DescribeOutputRTMPSettings getRTMPSettings() {
        return this.RTMPSettings;
    }

    /**
     * Set <p>Output RTMP configuration message.</p>
     * @param RTMPSettings <p>Output RTMP configuration message.</p>
     */
    public void setRTMPSettings(DescribeOutputRTMPSettings RTMPSettings) {
        this.RTMPSettings = RTMPSettings;
    }

    /**
     * Get <p>Output RTMP pull configuration message.</p> 
     * @return RTMPPullSettings <p>Output RTMP pull configuration message.</p>
     */
    public DescribeOutputRTMPPullSettings getRTMPPullSettings() {
        return this.RTMPPullSettings;
    }

    /**
     * Set <p>Output RTMP pull configuration message.</p>
     * @param RTMPPullSettings <p>Output RTMP pull configuration message.</p>
     */
    public void setRTMPPullSettings(DescribeOutputRTMPPullSettings RTMPPullSettings) {
        this.RTMPPullSettings = RTMPPullSettings;
    }

    /**
     * Get <p>CIDR allowlist.<br>Valid when Protocol is RTMP_PULL. If empty, it represents no limit on client IP.</p> 
     * @return AllowIpList <p>CIDR allowlist.<br>Valid when Protocol is RTMP_PULL. If empty, it represents no limit on client IP.</p>
     */
    public String [] getAllowIpList() {
        return this.AllowIpList;
    }

    /**
     * Set <p>CIDR allowlist.<br>Valid when Protocol is RTMP_PULL. If empty, it represents no limit on client IP.</p>
     * @param AllowIpList <p>CIDR allowlist.<br>Valid when Protocol is RTMP_PULL. If empty, it represents no limit on client IP.</p>
     */
    public void setAllowIpList(String [] AllowIpList) {
        this.AllowIpList = AllowIpList;
    }

    /**
     * Get <p>Output RTSP pull stream configuration message.</p> 
     * @return RTSPPullSettings <p>Output RTSP pull stream configuration message.</p>
     */
    public DescribeOutputRTSPPullSettings getRTSPPullSettings() {
        return this.RTSPPullSettings;
    }

    /**
     * Set <p>Output RTSP pull stream configuration message.</p>
     * @param RTSPPullSettings <p>Output RTSP pull stream configuration message.</p>
     */
    public void setRTSPPullSettings(DescribeOutputRTSPPullSettings RTSPPullSettings) {
        this.RTSPPullSettings = RTSPPullSettings;
    }

    /**
     * Get <p>Output HLS pull configuration message.</p> 
     * @return HLSPullSettings <p>Output HLS pull configuration message.</p>
     */
    public DescribeOutputHLSPullSettings getHLSPullSettings() {
        return this.HLSPullSettings;
    }

    /**
     * Set <p>Output HLS pull configuration message.</p>
     * @param HLSPullSettings <p>Output HLS pull configuration message.</p>
     */
    public void setHLSPullSettings(DescribeOutputHLSPullSettings HLSPullSettings) {
        this.HLSPullSettings = HLSPullSettings;
    }

    /**
     * Get <p>Maximum number of concurrent stream pulls. Maximum value: 4. Default value: 4.</p> 
     * @return MaxConcurrent <p>Maximum number of concurrent stream pulls. Maximum value: 4. Default value: 4.</p>
     */
    public Long getMaxConcurrent() {
        return this.MaxConcurrent;
    }

    /**
     * Set <p>Maximum number of concurrent stream pulls. Maximum value: 4. Default value: 4.</p>
     * @param MaxConcurrent <p>Maximum number of concurrent stream pulls. Maximum value: 4. Default value: 4.</p>
     */
    public void setMaxConcurrent(Long MaxConcurrent) {
        this.MaxConcurrent = MaxConcurrent;
    }

    /**
     * Get <p>ID of the bound security group.</p> 
     * @return SecurityGroupIds <p>ID of the bound security group.</p>
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set <p>ID of the bound security group.</p>
     * @param SecurityGroupIds <p>ID of the bound security group.</p>
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get <p>Availability zone. output currently supports a maximum of one.</p> 
     * @return Zones <p>Availability zone. output currently supports a maximum of one.</p>
     */
    public String [] getZones() {
        return this.Zones;
    }

    /**
     * Set <p>Availability zone. output currently supports a maximum of one.</p>
     * @param Zones <p>Availability zone. output currently supports a maximum of one.</p>
     */
    public void setZones(String [] Zones) {
        this.Zones = Zones;
    }

    /**
     * Get <p>Output RIST configuration message.</p> 
     * @return RISTSettings <p>Output RIST configuration message.</p>
     */
    public DescribeOutputRISTSettings getRISTSettings() {
        return this.RISTSettings;
    }

    /**
     * Set <p>Output RIST configuration message.</p>
     * @param RISTSettings <p>Output RIST configuration message.</p>
     */
    public void setRISTSettings(DescribeOutputRISTSettings RISTSettings) {
        this.RISTSettings = RISTSettings;
    }

    /**
     * Get <p>For streams with multiple audio/video tracks, you can specify the track to be used</p> 
     * @return PidSelector <p>For streams with multiple audio/video tracks, you can specify the track to be used</p>
     * @deprecated
     */
    @Deprecated
    public PidSelector getPidSelector() {
        return this.PidSelector;
    }

    /**
     * Set <p>For streams with multiple audio/video tracks, you can specify the track to be used</p>
     * @param PidSelector <p>For streams with multiple audio/video tracks, you can specify the track to be used</p>
     * @deprecated
     */
    @Deprecated
    public void setPidSelector(PidSelector PidSelector) {
        this.PidSelector = PidSelector;
    }

    /**
     * Get <p>Output module type, including Pinpoint (single-point output, supports up to four concurrent outputs); MultiMesh (multiple streams output, supports more than four concurrent outputs, currently up to 200). The default type is Pinpoint output. For one Flow, only one MultiMesh output is allowed in one zone.</p> 
     * @return OutputKind <p>Output module type, including Pinpoint (single-point output, supports up to four concurrent outputs); MultiMesh (multiple streams output, supports more than four concurrent outputs, currently up to 200). The default type is Pinpoint output. For one Flow, only one MultiMesh output is allowed in one zone.</p>
     */
    public String getOutputKind() {
        return this.OutputKind;
    }

    /**
     * Set <p>Output module type, including Pinpoint (single-point output, supports up to four concurrent outputs); MultiMesh (multiple streams output, supports more than four concurrent outputs, currently up to 200). The default type is Pinpoint output. For one Flow, only one MultiMesh output is allowed in one zone.</p>
     * @param OutputKind <p>Output module type, including Pinpoint (single-point output, supports up to four concurrent outputs); MultiMesh (multiple streams output, supports more than four concurrent outputs, currently up to 200). The default type is Pinpoint output. For one Flow, only one MultiMesh output is allowed in one zone.</p>
     */
    public void setOutputKind(String OutputKind) {
        this.OutputKind = OutputKind;
    }

    /**
     * Get <p>Output module configuration, related URLs, including the provided pull stream address or the configured relay address for output to a third party</p> 
     * @return StreamUrls <p>Output module configuration, related URLs, including the provided pull stream address or the configured relay address for output to a third party</p>
     */
    public StreamUrlDetail [] getStreamUrls() {
        return this.StreamUrls;
    }

    /**
     * Set <p>Output module configuration, related URLs, including the provided pull stream address or the configured relay address for output to a third party</p>
     * @param StreamUrls <p>Output module configuration, related URLs, including the provided pull stream address or the configured relay address for output to a third party</p>
     */
    public void setStreamUrls(StreamUrlDetail [] StreamUrls) {
        this.StreamUrls = StreamUrls;
    }

    /**
     * Get <p>For streams with multiple audio/video tracks, you can specify the track to be used</p> 
     * @return StreamSelector <p>For streams with multiple audio/video tracks, you can specify the track to be used</p>
     */
    public StreamSelector getStreamSelector() {
        return this.StreamSelector;
    }

    /**
     * Set <p>For streams with multiple audio/video tracks, you can specify the track to be used</p>
     * @param StreamSelector <p>For streams with multiple audio/video tracks, you can specify the track to be used</p>
     */
    public void setStreamSelector(StreamSelector StreamSelector) {
        this.StreamSelector = StreamSelector;
    }

    /**
     * Get <p>Output status.</p><p>Enumeration values:</p><ul><li>DISABLED</li><li>ENABLED</li></ul> 
     * @return State <p>Output status.</p><p>Enumeration values:</p><ul><li>DISABLED</li><li>ENABLED</li></ul>
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set <p>Output status.</p><p>Enumeration values:</p><ul><li>DISABLED</li><li>ENABLED</li></ul>
     * @param State <p>Output status.</p><p>Enumeration values:</p><ul><li>DISABLED</li><li>ENABLED</li></ul>
     */
    public void setState(String State) {
        this.State = State;
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
        if (source.State != null) {
            this.State = new String(source.State);
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
        this.setParamSimple(map, prefix + "State", this.State);

    }
}

