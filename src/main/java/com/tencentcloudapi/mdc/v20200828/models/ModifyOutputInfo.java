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
    * Id of the Output to be modified.
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
    * Output description.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Output relay protocol. Supports SRT, RTP, RTMP, RTMP_PULL, RTSP_PULL, and RIST.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Output type: Internet/TencentCSS/StreamLive
    */
    @SerializedName("OutputType")
    @Expose
    private String OutputType;

    /**
    * Output module type, including Pinpoint (single-point output, supports up to four concurrent outputs); MultiMesh (multiple outputs, supports more than four concurrent outputs, currently up to 200). The default type is Pinpoint output. For a single Flow, only one MultiMesh output is allowed in one zone.
    */
    @SerializedName("OutputKind")
    @Expose
    private String OutputKind;

    /**
    * Configuration of the relayed SRT.
    */
    @SerializedName("SRTSettings")
    @Expose
    private CreateOutputSrtSettings SRTSettings;

    /**
    * Configuration of the relayed RTP.
    */
    @SerializedName("RTPSettings")
    @Expose
    private CreateOutputInfoRTPSettings RTPSettings;

    /**
    * Configuration for relaying RTMP.
    */
    @SerializedName("RTMPSettings")
    @Expose
    private CreateOutputRTMPSettings RTMPSettings;

    /**
    * IP whitelist list in CIDR format, for example, 0.0.0.0/0.
Valid when Protocol is RTMP_PULL. If empty, it represents no limit on client IP.
    */
    @SerializedName("AllowIpList")
    @Expose
    private String [] AllowIpList;

    /**
    * Maximum number of concurrent stream pulls. Maximum value: 4. Default value: 4.
    */
    @SerializedName("MaxConcurrent")
    @Expose
    private Long MaxConcurrent;

    /**
    * ID of the bound security group. Only one security group can be associated.	
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * AZ.
    */
    @SerializedName("Zones")
    @Expose
    private String [] Zones;

    /**
    * Relay RIST configuration.
    */
    @SerializedName("RISTSettings")
    @Expose
    private CreateOutputRistSettings RISTSettings;

    /**
    * For streams with multiple audio/video tracks, you can specify the track to be used.
    */
    @SerializedName("PidSelector")
    @Expose
    private PidSelector PidSelector;

    /**
    * For streams with multiple audio/video tracks, you can specify the track to be used.
    */
    @SerializedName("StreamSelector")
    @Expose
    private StreamSelector StreamSelector;

    /**
     * Get Id of the Output to be modified. 
     * @return OutputId Id of the Output to be modified.
     */
    public String getOutputId() {
        return this.OutputId;
    }

    /**
     * Set Id of the Output to be modified.
     * @param OutputId Id of the Output to be modified.
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
     * Get Output description. 
     * @return Description Output description.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Output description.
     * @param Description Output description.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Output relay protocol. Supports SRT, RTP, RTMP, RTMP_PULL, RTSP_PULL, and RIST. 
     * @return Protocol Output relay protocol. Supports SRT, RTP, RTMP, RTMP_PULL, RTSP_PULL, and RIST.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Output relay protocol. Supports SRT, RTP, RTMP, RTMP_PULL, RTSP_PULL, and RIST.
     * @param Protocol Output relay protocol. Supports SRT, RTP, RTMP, RTMP_PULL, RTSP_PULL, and RIST.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Output type: Internet/TencentCSS/StreamLive 
     * @return OutputType Output type: Internet/TencentCSS/StreamLive
     */
    public String getOutputType() {
        return this.OutputType;
    }

    /**
     * Set Output type: Internet/TencentCSS/StreamLive
     * @param OutputType Output type: Internet/TencentCSS/StreamLive
     */
    public void setOutputType(String OutputType) {
        this.OutputType = OutputType;
    }

    /**
     * Get Output module type, including Pinpoint (single-point output, supports up to four concurrent outputs); MultiMesh (multiple outputs, supports more than four concurrent outputs, currently up to 200). The default type is Pinpoint output. For a single Flow, only one MultiMesh output is allowed in one zone. 
     * @return OutputKind Output module type, including Pinpoint (single-point output, supports up to four concurrent outputs); MultiMesh (multiple outputs, supports more than four concurrent outputs, currently up to 200). The default type is Pinpoint output. For a single Flow, only one MultiMesh output is allowed in one zone.
     */
    public String getOutputKind() {
        return this.OutputKind;
    }

    /**
     * Set Output module type, including Pinpoint (single-point output, supports up to four concurrent outputs); MultiMesh (multiple outputs, supports more than four concurrent outputs, currently up to 200). The default type is Pinpoint output. For a single Flow, only one MultiMesh output is allowed in one zone.
     * @param OutputKind Output module type, including Pinpoint (single-point output, supports up to four concurrent outputs); MultiMesh (multiple outputs, supports more than four concurrent outputs, currently up to 200). The default type is Pinpoint output. For a single Flow, only one MultiMesh output is allowed in one zone.
     */
    public void setOutputKind(String OutputKind) {
        this.OutputKind = OutputKind;
    }

    /**
     * Get Configuration of the relayed SRT. 
     * @return SRTSettings Configuration of the relayed SRT.
     */
    public CreateOutputSrtSettings getSRTSettings() {
        return this.SRTSettings;
    }

    /**
     * Set Configuration of the relayed SRT.
     * @param SRTSettings Configuration of the relayed SRT.
     */
    public void setSRTSettings(CreateOutputSrtSettings SRTSettings) {
        this.SRTSettings = SRTSettings;
    }

    /**
     * Get Configuration of the relayed RTP. 
     * @return RTPSettings Configuration of the relayed RTP.
     */
    public CreateOutputInfoRTPSettings getRTPSettings() {
        return this.RTPSettings;
    }

    /**
     * Set Configuration of the relayed RTP.
     * @param RTPSettings Configuration of the relayed RTP.
     */
    public void setRTPSettings(CreateOutputInfoRTPSettings RTPSettings) {
        this.RTPSettings = RTPSettings;
    }

    /**
     * Get Configuration for relaying RTMP. 
     * @return RTMPSettings Configuration for relaying RTMP.
     */
    public CreateOutputRTMPSettings getRTMPSettings() {
        return this.RTMPSettings;
    }

    /**
     * Set Configuration for relaying RTMP.
     * @param RTMPSettings Configuration for relaying RTMP.
     */
    public void setRTMPSettings(CreateOutputRTMPSettings RTMPSettings) {
        this.RTMPSettings = RTMPSettings;
    }

    /**
     * Get IP whitelist list in CIDR format, for example, 0.0.0.0/0.
Valid when Protocol is RTMP_PULL. If empty, it represents no limit on client IP. 
     * @return AllowIpList IP whitelist list in CIDR format, for example, 0.0.0.0/0.
Valid when Protocol is RTMP_PULL. If empty, it represents no limit on client IP.
     */
    public String [] getAllowIpList() {
        return this.AllowIpList;
    }

    /**
     * Set IP whitelist list in CIDR format, for example, 0.0.0.0/0.
Valid when Protocol is RTMP_PULL. If empty, it represents no limit on client IP.
     * @param AllowIpList IP whitelist list in CIDR format, for example, 0.0.0.0/0.
Valid when Protocol is RTMP_PULL. If empty, it represents no limit on client IP.
     */
    public void setAllowIpList(String [] AllowIpList) {
        this.AllowIpList = AllowIpList;
    }

    /**
     * Get Maximum number of concurrent stream pulls. Maximum value: 4. Default value: 4. 
     * @return MaxConcurrent Maximum number of concurrent stream pulls. Maximum value: 4. Default value: 4.
     */
    public Long getMaxConcurrent() {
        return this.MaxConcurrent;
    }

    /**
     * Set Maximum number of concurrent stream pulls. Maximum value: 4. Default value: 4.
     * @param MaxConcurrent Maximum number of concurrent stream pulls. Maximum value: 4. Default value: 4.
     */
    public void setMaxConcurrent(Long MaxConcurrent) {
        this.MaxConcurrent = MaxConcurrent;
    }

    /**
     * Get ID of the bound security group. Only one security group can be associated.	 
     * @return SecurityGroupIds ID of the bound security group. Only one security group can be associated.	
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set ID of the bound security group. Only one security group can be associated.	
     * @param SecurityGroupIds ID of the bound security group. Only one security group can be associated.	
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get AZ. 
     * @return Zones AZ.
     */
    public String [] getZones() {
        return this.Zones;
    }

    /**
     * Set AZ.
     * @param Zones AZ.
     */
    public void setZones(String [] Zones) {
        this.Zones = Zones;
    }

    /**
     * Get Relay RIST configuration. 
     * @return RISTSettings Relay RIST configuration.
     */
    public CreateOutputRistSettings getRISTSettings() {
        return this.RISTSettings;
    }

    /**
     * Set Relay RIST configuration.
     * @param RISTSettings Relay RIST configuration.
     */
    public void setRISTSettings(CreateOutputRistSettings RISTSettings) {
        this.RISTSettings = RISTSettings;
    }

    /**
     * Get For streams with multiple audio/video tracks, you can specify the track to be used. 
     * @return PidSelector For streams with multiple audio/video tracks, you can specify the track to be used.
     * @deprecated
     */
    @Deprecated
    public PidSelector getPidSelector() {
        return this.PidSelector;
    }

    /**
     * Set For streams with multiple audio/video tracks, you can specify the track to be used.
     * @param PidSelector For streams with multiple audio/video tracks, you can specify the track to be used.
     * @deprecated
     */
    @Deprecated
    public void setPidSelector(PidSelector PidSelector) {
        this.PidSelector = PidSelector;
    }

    /**
     * Get For streams with multiple audio/video tracks, you can specify the track to be used. 
     * @return StreamSelector For streams with multiple audio/video tracks, you can specify the track to be used.
     */
    public StreamSelector getStreamSelector() {
        return this.StreamSelector;
    }

    /**
     * Set For streams with multiple audio/video tracks, you can specify the track to be used.
     * @param StreamSelector For streams with multiple audio/video tracks, you can specify the track to be used.
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

