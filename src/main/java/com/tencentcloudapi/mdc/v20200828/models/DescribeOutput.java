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
    * CIDR allowlist
This parameter is valid if `Protocol` is set to `RTMP_PULL`. If this parameter is left empty, there is no restriction on clients’ IP addresses.
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("AllowIpList")
    @Expose
    private String [] AllowIpList;

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
     * Get CIDR allowlist
This parameter is valid if `Protocol` is set to `RTMP_PULL`. If this parameter is left empty, there is no restriction on clients’ IP addresses.
Note: This field may return `null`, indicating that no valid value was found. 
     * @return AllowIpList CIDR allowlist
This parameter is valid if `Protocol` is set to `RTMP_PULL`. If this parameter is left empty, there is no restriction on clients’ IP addresses.
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String [] getAllowIpList() {
        return this.AllowIpList;
    }

    /**
     * Set CIDR allowlist
This parameter is valid if `Protocol` is set to `RTMP_PULL`. If this parameter is left empty, there is no restriction on clients’ IP addresses.
Note: This field may return `null`, indicating that no valid value was found.
     * @param AllowIpList CIDR allowlist
This parameter is valid if `Protocol` is set to `RTMP_PULL`. If this parameter is left empty, there is no restriction on clients’ IP addresses.
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setAllowIpList(String [] AllowIpList) {
        this.AllowIpList = AllowIpList;
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

    }
}

