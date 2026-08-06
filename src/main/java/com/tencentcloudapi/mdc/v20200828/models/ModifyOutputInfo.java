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

public class ModifyOutputInfo extends AbstractModel {

    /**
    * The ID of the output to modify.
    */
    @SerializedName("OutputId")
    @Expose
    private String OutputId;

    /**
    * The output name.
    */
    @SerializedName("OutputName")
    @Expose
    private String OutputName;

    /**
    * The description of the output.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * The output protocol. Valid values: SRT, RTP, RTMP.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Output Type: Internet/Tencent CSS/StreamLive
    */
    @SerializedName("OutputType")
    @Expose
    private String OutputType;

    /**
    * Output module types include Pinpoint (single-point output, supporting up to four concurrent outputs) and MultiMesh (multi-output, supporting concurrent outputs exceeding four, currently capable of reaching 200 channels). The default type is Pinpoint output. For a single Flow, only one MultiMesh output can be assigned per region.
    */
    @SerializedName("OutputKind")
    @Expose
    private String OutputKind;

    /**
    * The SRT relay configuration.
    */
    @SerializedName("SRTSettings")
    @Expose
    private CreateOutputSrtSettings SRTSettings;

    /**
    * The RTP relay configuration.
    */
    @SerializedName("RTPSettings")
    @Expose
    private CreateOutputInfoRTPSettings RTPSettings;

    /**
    * The RTMP relay configuration.
    */
    @SerializedName("RTMPSettings")
    @Expose
    private CreateOutputRTMPSettings RTMPSettings;

    /**
    * IP whitelist, in CIDR format, such as 0.0.0.0/0. This is valid when Protocol is RTMP_PULL, and empty means no restriction on client IP.
    */
    @SerializedName("AllowIpList")
    @Expose
    private String [] AllowIpList;

    /**
    * The maximum number of concurrent stream pulls is 4, and the default value is 4.
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
    * Availability Zone
    */
    @SerializedName("Zones")
    @Expose
    private String [] Zones;

    /**
    * Transfer the configuration of RIST.
    */
    @SerializedName("RISTSettings")
    @Expose
    private CreateOutputRistSettings RISTSettings;

    /**
    * For streams containing multiple audio/video tracks, you can specify the tracks that need to be used
    */
    @SerializedName("PidSelector")
    @Expose
    private PidSelector PidSelector;

    /**
    * For streams containing multiple audio/video tracks, you can specify the tracks that need to be used
    */
    @SerializedName("StreamSelector")
    @Expose
    private StreamSelector StreamSelector;

    /**
     * Get The ID of the output to modify. 
     * @return OutputId The ID of the output to modify.
     */
    public String getOutputId() {
        return this.OutputId;
    }

    /**
     * Set The ID of the output to modify.
     * @param OutputId The ID of the output to modify.
     */
    public void setOutputId(String OutputId) {
        this.OutputId = OutputId;
    }

    /**
     * Get The output name. 
     * @return OutputName The output name.
     */
    public String getOutputName() {
        return this.OutputName;
    }

    /**
     * Set The output name.
     * @param OutputName The output name.
     */
    public void setOutputName(String OutputName) {
        this.OutputName = OutputName;
    }

    /**
     * Get The description of the output. 
     * @return Description The description of the output.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set The description of the output.
     * @param Description The description of the output.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get The output protocol. Valid values: SRT, RTP, RTMP. 
     * @return Protocol The output protocol. Valid values: SRT, RTP, RTMP.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set The output protocol. Valid values: SRT, RTP, RTMP.
     * @param Protocol The output protocol. Valid values: SRT, RTP, RTMP.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Output Type: Internet/Tencent CSS/StreamLive 
     * @return OutputType Output Type: Internet/Tencent CSS/StreamLive
     */
    public String getOutputType() {
        return this.OutputType;
    }

    /**
     * Set Output Type: Internet/Tencent CSS/StreamLive
     * @param OutputType Output Type: Internet/Tencent CSS/StreamLive
     */
    public void setOutputType(String OutputType) {
        this.OutputType = OutputType;
    }

    /**
     * Get Output module types include Pinpoint (single-point output, supporting up to four concurrent outputs) and MultiMesh (multi-output, supporting concurrent outputs exceeding four, currently capable of reaching 200 channels). The default type is Pinpoint output. For a single Flow, only one MultiMesh output can be assigned per region. 
     * @return OutputKind Output module types include Pinpoint (single-point output, supporting up to four concurrent outputs) and MultiMesh (multi-output, supporting concurrent outputs exceeding four, currently capable of reaching 200 channels). The default type is Pinpoint output. For a single Flow, only one MultiMesh output can be assigned per region.
     */
    public String getOutputKind() {
        return this.OutputKind;
    }

    /**
     * Set Output module types include Pinpoint (single-point output, supporting up to four concurrent outputs) and MultiMesh (multi-output, supporting concurrent outputs exceeding four, currently capable of reaching 200 channels). The default type is Pinpoint output. For a single Flow, only one MultiMesh output can be assigned per region.
     * @param OutputKind Output module types include Pinpoint (single-point output, supporting up to four concurrent outputs) and MultiMesh (multi-output, supporting concurrent outputs exceeding four, currently capable of reaching 200 channels). The default type is Pinpoint output. For a single Flow, only one MultiMesh output can be assigned per region.
     */
    public void setOutputKind(String OutputKind) {
        this.OutputKind = OutputKind;
    }

    /**
     * Get The SRT relay configuration. 
     * @return SRTSettings The SRT relay configuration.
     */
    public CreateOutputSrtSettings getSRTSettings() {
        return this.SRTSettings;
    }

    /**
     * Set The SRT relay configuration.
     * @param SRTSettings The SRT relay configuration.
     */
    public void setSRTSettings(CreateOutputSrtSettings SRTSettings) {
        this.SRTSettings = SRTSettings;
    }

    /**
     * Get The RTP relay configuration. 
     * @return RTPSettings The RTP relay configuration.
     */
    public CreateOutputInfoRTPSettings getRTPSettings() {
        return this.RTPSettings;
    }

    /**
     * Set The RTP relay configuration.
     * @param RTPSettings The RTP relay configuration.
     */
    public void setRTPSettings(CreateOutputInfoRTPSettings RTPSettings) {
        this.RTPSettings = RTPSettings;
    }

    /**
     * Get The RTMP relay configuration. 
     * @return RTMPSettings The RTMP relay configuration.
     */
    public CreateOutputRTMPSettings getRTMPSettings() {
        return this.RTMPSettings;
    }

    /**
     * Set The RTMP relay configuration.
     * @param RTMPSettings The RTMP relay configuration.
     */
    public void setRTMPSettings(CreateOutputRTMPSettings RTMPSettings) {
        this.RTMPSettings = RTMPSettings;
    }

    /**
     * Get IP whitelist, in CIDR format, such as 0.0.0.0/0. This is valid when Protocol is RTMP_PULL, and empty means no restriction on client IP. 
     * @return AllowIpList IP whitelist, in CIDR format, such as 0.0.0.0/0. This is valid when Protocol is RTMP_PULL, and empty means no restriction on client IP.
     */
    public String [] getAllowIpList() {
        return this.AllowIpList;
    }

    /**
     * Set IP whitelist, in CIDR format, such as 0.0.0.0/0. This is valid when Protocol is RTMP_PULL, and empty means no restriction on client IP.
     * @param AllowIpList IP whitelist, in CIDR format, such as 0.0.0.0/0. This is valid when Protocol is RTMP_PULL, and empty means no restriction on client IP.
     */
    public void setAllowIpList(String [] AllowIpList) {
        this.AllowIpList = AllowIpList;
    }

    /**
     * Get The maximum number of concurrent stream pulls is 4, and the default value is 4. 
     * @return MaxConcurrent The maximum number of concurrent stream pulls is 4, and the default value is 4.
     */
    public Long getMaxConcurrent() {
        return this.MaxConcurrent;
    }

    /**
     * Set The maximum number of concurrent stream pulls is 4, and the default value is 4.
     * @param MaxConcurrent The maximum number of concurrent stream pulls is 4, and the default value is 4.
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
     * Get Availability Zone 
     * @return Zones Availability Zone
     */
    public String [] getZones() {
        return this.Zones;
    }

    /**
     * Set Availability Zone
     * @param Zones Availability Zone
     */
    public void setZones(String [] Zones) {
        this.Zones = Zones;
    }

    /**
     * Get Transfer the configuration of RIST. 
     * @return RISTSettings Transfer the configuration of RIST.
     */
    public CreateOutputRistSettings getRISTSettings() {
        return this.RISTSettings;
    }

    /**
     * Set Transfer the configuration of RIST.
     * @param RISTSettings Transfer the configuration of RIST.
     */
    public void setRISTSettings(CreateOutputRistSettings RISTSettings) {
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

    public ModifyOutputInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyOutputInfo(ModifyOutputInfo source) {
        if (source.OutputId != null) {
            this.OutputId = new String(source.OutputId);
        }
        if (source.OutputName != null) {
            this.OutputName = new String(source.OutputName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.OutputType != null) {
            this.OutputType = new String(source.OutputType);
        }
        if (source.OutputKind != null) {
            this.OutputKind = new String(source.OutputKind);
        }
        if (source.SRTSettings != null) {
            this.SRTSettings = new CreateOutputSrtSettings(source.SRTSettings);
        }
        if (source.RTPSettings != null) {
            this.RTPSettings = new CreateOutputInfoRTPSettings(source.RTPSettings);
        }
        if (source.RTMPSettings != null) {
            this.RTMPSettings = new CreateOutputRTMPSettings(source.RTMPSettings);
        }
        if (source.AllowIpList != null) {
            this.AllowIpList = new String[source.AllowIpList.length];
            for (int i = 0; i < source.AllowIpList.length; i++) {
                this.AllowIpList[i] = new String(source.AllowIpList[i]);
            }
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
            this.RISTSettings = new CreateOutputRistSettings(source.RISTSettings);
        }
        if (source.PidSelector != null) {
            this.PidSelector = new PidSelector(source.PidSelector);
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
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "OutputType", this.OutputType);
        this.setParamSimple(map, prefix + "OutputKind", this.OutputKind);
        this.setParamObj(map, prefix + "SRTSettings.", this.SRTSettings);
        this.setParamObj(map, prefix + "RTPSettings.", this.RTPSettings);
        this.setParamObj(map, prefix + "RTMPSettings.", this.RTMPSettings);
        this.setParamArraySimple(map, prefix + "AllowIpList.", this.AllowIpList);
        this.setParamSimple(map, prefix + "MaxConcurrent", this.MaxConcurrent);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamArraySimple(map, prefix + "Zones.", this.Zones);
        this.setParamObj(map, prefix + "RISTSettings.", this.RISTSettings);
        this.setParamObj(map, prefix + "PidSelector.", this.PidSelector);
        this.setParamObj(map, prefix + "StreamSelector.", this.StreamSelector);

    }
}

