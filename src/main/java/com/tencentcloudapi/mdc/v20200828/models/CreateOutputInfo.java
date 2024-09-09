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

public class CreateOutputInfo extends AbstractModel {

    /**
    * The output name.
    */
    @SerializedName("OutputName")
    @Expose
    private String OutputName;

    /**
    * Description of the output.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * The output protocol. Valid values: SRT, RTP, RTMP, RTMP_PULL.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * The output region.
    */
    @SerializedName("OutputRegion")
    @Expose
    private String OutputRegion;

    /**
    * The SRT configuration.
    */
    @SerializedName("SRTSettings")
    @Expose
    private CreateOutputSrtSettings SRTSettings;

    /**
    * The RTMP configuration.
    */
    @SerializedName("RTMPSettings")
    @Expose
    private CreateOutputRTMPSettings RTMPSettings;

    /**
    * The RTP configuration.
    */
    @SerializedName("RTPSettings")
    @Expose
    private CreateOutputInfoRTPSettings RTPSettings;

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
    * Availability zone: output supports at most one availability zone as input.
    */
    @SerializedName("Zones")
    @Expose
    private String [] Zones;

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
     * Get Description of the output. 
     * @return Description Description of the output.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Description of the output.
     * @param Description Description of the output.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get The output protocol. Valid values: SRT, RTP, RTMP, RTMP_PULL. 
     * @return Protocol The output protocol. Valid values: SRT, RTP, RTMP, RTMP_PULL.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set The output protocol. Valid values: SRT, RTP, RTMP, RTMP_PULL.
     * @param Protocol The output protocol. Valid values: SRT, RTP, RTMP, RTMP_PULL.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get The output region. 
     * @return OutputRegion The output region.
     */
    public String getOutputRegion() {
        return this.OutputRegion;
    }

    /**
     * Set The output region.
     * @param OutputRegion The output region.
     */
    public void setOutputRegion(String OutputRegion) {
        this.OutputRegion = OutputRegion;
    }

    /**
     * Get The SRT configuration. 
     * @return SRTSettings The SRT configuration.
     */
    public CreateOutputSrtSettings getSRTSettings() {
        return this.SRTSettings;
    }

    /**
     * Set The SRT configuration.
     * @param SRTSettings The SRT configuration.
     */
    public void setSRTSettings(CreateOutputSrtSettings SRTSettings) {
        this.SRTSettings = SRTSettings;
    }

    /**
     * Get The RTMP configuration. 
     * @return RTMPSettings The RTMP configuration.
     */
    public CreateOutputRTMPSettings getRTMPSettings() {
        return this.RTMPSettings;
    }

    /**
     * Set The RTMP configuration.
     * @param RTMPSettings The RTMP configuration.
     */
    public void setRTMPSettings(CreateOutputRTMPSettings RTMPSettings) {
        this.RTMPSettings = RTMPSettings;
    }

    /**
     * Get The RTP configuration. 
     * @return RTPSettings The RTP configuration.
     */
    public CreateOutputInfoRTPSettings getRTPSettings() {
        return this.RTPSettings;
    }

    /**
     * Set The RTP configuration.
     * @param RTPSettings The RTP configuration.
     */
    public void setRTPSettings(CreateOutputInfoRTPSettings RTPSettings) {
        this.RTPSettings = RTPSettings;
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
     * Get Availability zone: output supports at most one availability zone as input. 
     * @return Zones Availability zone: output supports at most one availability zone as input.
     */
    public String [] getZones() {
        return this.Zones;
    }

    /**
     * Set Availability zone: output supports at most one availability zone as input.
     * @param Zones Availability zone: output supports at most one availability zone as input.
     */
    public void setZones(String [] Zones) {
        this.Zones = Zones;
    }

    public CreateOutputInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateOutputInfo(CreateOutputInfo source) {
        if (source.OutputName != null) {
            this.OutputName = new String(source.OutputName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.OutputRegion != null) {
            this.OutputRegion = new String(source.OutputRegion);
        }
        if (source.SRTSettings != null) {
            this.SRTSettings = new CreateOutputSrtSettings(source.SRTSettings);
        }
        if (source.RTMPSettings != null) {
            this.RTMPSettings = new CreateOutputRTMPSettings(source.RTMPSettings);
        }
        if (source.RTPSettings != null) {
            this.RTPSettings = new CreateOutputInfoRTPSettings(source.RTPSettings);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OutputName", this.OutputName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "OutputRegion", this.OutputRegion);
        this.setParamObj(map, prefix + "SRTSettings.", this.SRTSettings);
        this.setParamObj(map, prefix + "RTMPSettings.", this.RTMPSettings);
        this.setParamObj(map, prefix + "RTPSettings.", this.RTPSettings);
        this.setParamArraySimple(map, prefix + "AllowIpList.", this.AllowIpList);
        this.setParamSimple(map, prefix + "MaxConcurrent", this.MaxConcurrent);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamArraySimple(map, prefix + "Zones.", this.Zones);

    }
}

