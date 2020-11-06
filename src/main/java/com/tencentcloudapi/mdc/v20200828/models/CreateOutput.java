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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateOutput extends AbstractModel{

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
    * Output protocol.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Output region.
    */
    @SerializedName("OutputRegion")
    @Expose
    private String OutputRegion;

    /**
    * SRT configuration of output.
    */
    @SerializedName("SRTSettings")
    @Expose
    private CreateOutputSrtSettings SRTSettings;

    /**
    * RTP configuration of output.
    */
    @SerializedName("RTPSettings")
    @Expose
    private CreateInputRTPSettings RTPSettings;

    /**
    * RTMP configuration of output.
    */
    @SerializedName("RTMPSettings")
    @Expose
    private CreateOutputRTMPSettings RTMPSettings;

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
     * Get Output region. 
     * @return OutputRegion Output region.
     */
    public String getOutputRegion() {
        return this.OutputRegion;
    }

    /**
     * Set Output region.
     * @param OutputRegion Output region.
     */
    public void setOutputRegion(String OutputRegion) {
        this.OutputRegion = OutputRegion;
    }

    /**
     * Get SRT configuration of output. 
     * @return SRTSettings SRT configuration of output.
     */
    public CreateOutputSrtSettings getSRTSettings() {
        return this.SRTSettings;
    }

    /**
     * Set SRT configuration of output.
     * @param SRTSettings SRT configuration of output.
     */
    public void setSRTSettings(CreateOutputSrtSettings SRTSettings) {
        this.SRTSettings = SRTSettings;
    }

    /**
     * Get RTP configuration of output. 
     * @return RTPSettings RTP configuration of output.
     */
    public CreateInputRTPSettings getRTPSettings() {
        return this.RTPSettings;
    }

    /**
     * Set RTP configuration of output.
     * @param RTPSettings RTP configuration of output.
     */
    public void setRTPSettings(CreateInputRTPSettings RTPSettings) {
        this.RTPSettings = RTPSettings;
    }

    /**
     * Get RTMP configuration of output. 
     * @return RTMPSettings RTMP configuration of output.
     */
    public CreateOutputRTMPSettings getRTMPSettings() {
        return this.RTMPSettings;
    }

    /**
     * Set RTMP configuration of output.
     * @param RTMPSettings RTMP configuration of output.
     */
    public void setRTMPSettings(CreateOutputRTMPSettings RTMPSettings) {
        this.RTMPSettings = RTMPSettings;
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
        this.setParamObj(map, prefix + "RTPSettings.", this.RTPSettings);
        this.setParamObj(map, prefix + "RTMPSettings.", this.RTMPSettings);

    }
}

