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

public class ModifyOutput extends AbstractModel{

    /**
    * ID of the output to be modified.
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
    * Output push protocol. Valid values: SRT|RTMP.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Configuration of SRT push.
    */
    @SerializedName("SRTSettings")
    @Expose
    private CreateOutputSrtSettings SRTSettings;

    /**
    * Configuration of RTP push.
    */
    @SerializedName("RTPSettings")
    @Expose
    private CreateOutputRTPSettings RTPSettings;

    /**
    * Configuration of RTMP push.
    */
    @SerializedName("RTMPSettings")
    @Expose
    private CreateOutputRTMPSettings RTMPSettings;

    /**
     * Get ID of the output to be modified. 
     * @return OutputId ID of the output to be modified.
     */
    public String getOutputId() {
        return this.OutputId;
    }

    /**
     * Set ID of the output to be modified.
     * @param OutputId ID of the output to be modified.
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
     * Get Output push protocol. Valid values: SRT|RTMP. 
     * @return Protocol Output push protocol. Valid values: SRT|RTMP.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Output push protocol. Valid values: SRT|RTMP.
     * @param Protocol Output push protocol. Valid values: SRT|RTMP.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Configuration of SRT push. 
     * @return SRTSettings Configuration of SRT push.
     */
    public CreateOutputSrtSettings getSRTSettings() {
        return this.SRTSettings;
    }

    /**
     * Set Configuration of SRT push.
     * @param SRTSettings Configuration of SRT push.
     */
    public void setSRTSettings(CreateOutputSrtSettings SRTSettings) {
        this.SRTSettings = SRTSettings;
    }

    /**
     * Get Configuration of RTP push. 
     * @return RTPSettings Configuration of RTP push.
     */
    public CreateOutputRTPSettings getRTPSettings() {
        return this.RTPSettings;
    }

    /**
     * Set Configuration of RTP push.
     * @param RTPSettings Configuration of RTP push.
     */
    public void setRTPSettings(CreateOutputRTPSettings RTPSettings) {
        this.RTPSettings = RTPSettings;
    }

    /**
     * Get Configuration of RTMP push. 
     * @return RTMPSettings Configuration of RTMP push.
     */
    public CreateOutputRTMPSettings getRTMPSettings() {
        return this.RTMPSettings;
    }

    /**
     * Set Configuration of RTMP push.
     * @param RTMPSettings Configuration of RTMP push.
     */
    public void setRTMPSettings(CreateOutputRTMPSettings RTMPSettings) {
        this.RTMPSettings = RTMPSettings;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OutputId", this.OutputId);
        this.setParamSimple(map, prefix + "OutputName", this.OutputName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamObj(map, prefix + "SRTSettings.", this.SRTSettings);
        this.setParamObj(map, prefix + "RTPSettings.", this.RTPSettings);
        this.setParamObj(map, prefix + "RTMPSettings.", this.RTMPSettings);

    }
}

