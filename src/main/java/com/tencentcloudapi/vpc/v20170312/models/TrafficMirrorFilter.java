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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TrafficMirrorFilter extends AbstractModel {

    /**
    * Source network segment of the filter rule.
    */
    @SerializedName("SrcNet")
    @Expose
    private String SrcNet;

    /**
    * Destination network segment of the filter rule.
    */
    @SerializedName("DstNet")
    @Expose
    private String DstNet;

    /**
    * Protocol of the filter rule.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Source port of the filter rule. Default value: 1–65535.
    */
    @SerializedName("SrcPort")
    @Expose
    private String SrcPort;

    /**
    * Destination port of the filter rule. Default value: 1–65535.
    */
    @SerializedName("DstPort")
    @Expose
    private String DstPort;

    /**
     * Get Source network segment of the filter rule. 
     * @return SrcNet Source network segment of the filter rule.
     */
    public String getSrcNet() {
        return this.SrcNet;
    }

    /**
     * Set Source network segment of the filter rule.
     * @param SrcNet Source network segment of the filter rule.
     */
    public void setSrcNet(String SrcNet) {
        this.SrcNet = SrcNet;
    }

    /**
     * Get Destination network segment of the filter rule. 
     * @return DstNet Destination network segment of the filter rule.
     */
    public String getDstNet() {
        return this.DstNet;
    }

    /**
     * Set Destination network segment of the filter rule.
     * @param DstNet Destination network segment of the filter rule.
     */
    public void setDstNet(String DstNet) {
        this.DstNet = DstNet;
    }

    /**
     * Get Protocol of the filter rule. 
     * @return Protocol Protocol of the filter rule.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Protocol of the filter rule.
     * @param Protocol Protocol of the filter rule.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Source port of the filter rule. Default value: 1–65535. 
     * @return SrcPort Source port of the filter rule. Default value: 1–65535.
     */
    public String getSrcPort() {
        return this.SrcPort;
    }

    /**
     * Set Source port of the filter rule. Default value: 1–65535.
     * @param SrcPort Source port of the filter rule. Default value: 1–65535.
     */
    public void setSrcPort(String SrcPort) {
        this.SrcPort = SrcPort;
    }

    /**
     * Get Destination port of the filter rule. Default value: 1–65535. 
     * @return DstPort Destination port of the filter rule. Default value: 1–65535.
     */
    public String getDstPort() {
        return this.DstPort;
    }

    /**
     * Set Destination port of the filter rule. Default value: 1–65535.
     * @param DstPort Destination port of the filter rule. Default value: 1–65535.
     */
    public void setDstPort(String DstPort) {
        this.DstPort = DstPort;
    }

    public TrafficMirrorFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TrafficMirrorFilter(TrafficMirrorFilter source) {
        if (source.SrcNet != null) {
            this.SrcNet = new String(source.SrcNet);
        }
        if (source.DstNet != null) {
            this.DstNet = new String(source.DstNet);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.SrcPort != null) {
            this.SrcPort = new String(source.SrcPort);
        }
        if (source.DstPort != null) {
            this.DstPort = new String(source.DstPort);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SrcNet", this.SrcNet);
        this.setParamSimple(map, prefix + "DstNet", this.DstNet);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "SrcPort", this.SrcPort);
        this.setParamSimple(map, prefix + "DstPort", this.DstPort);

    }
}

