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

    }
}

