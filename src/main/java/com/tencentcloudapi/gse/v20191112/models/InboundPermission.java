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
package com.tencentcloudapi.gse.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InboundPermission extends AbstractModel {

    /**
    * Start port number. Minimum value: 1025.
    */
    @SerializedName("FromPort")
    @Expose
    private Long FromPort;

    /**
    * IP range. Valid range of the input IPv4 addresses in CIDR format; for example, 0.0.0.0.0/0.
    */
    @SerializedName("IpRange")
    @Expose
    private String IpRange;

    /**
    * Protocol type: TCP or UDP.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * End port number. Maximum value: 60000.
    */
    @SerializedName("ToPort")
    @Expose
    private Long ToPort;

    /**
     * Get Start port number. Minimum value: 1025. 
     * @return FromPort Start port number. Minimum value: 1025.
     */
    public Long getFromPort() {
        return this.FromPort;
    }

    /**
     * Set Start port number. Minimum value: 1025.
     * @param FromPort Start port number. Minimum value: 1025.
     */
    public void setFromPort(Long FromPort) {
        this.FromPort = FromPort;
    }

    /**
     * Get IP range. Valid range of the input IPv4 addresses in CIDR format; for example, 0.0.0.0.0/0. 
     * @return IpRange IP range. Valid range of the input IPv4 addresses in CIDR format; for example, 0.0.0.0.0/0.
     */
    public String getIpRange() {
        return this.IpRange;
    }

    /**
     * Set IP range. Valid range of the input IPv4 addresses in CIDR format; for example, 0.0.0.0.0/0.
     * @param IpRange IP range. Valid range of the input IPv4 addresses in CIDR format; for example, 0.0.0.0.0/0.
     */
    public void setIpRange(String IpRange) {
        this.IpRange = IpRange;
    }

    /**
     * Get Protocol type: TCP or UDP. 
     * @return Protocol Protocol type: TCP or UDP.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Protocol type: TCP or UDP.
     * @param Protocol Protocol type: TCP or UDP.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get End port number. Maximum value: 60000. 
     * @return ToPort End port number. Maximum value: 60000.
     */
    public Long getToPort() {
        return this.ToPort;
    }

    /**
     * Set End port number. Maximum value: 60000.
     * @param ToPort End port number. Maximum value: 60000.
     */
    public void setToPort(Long ToPort) {
        this.ToPort = ToPort;
    }

    public InboundPermission() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InboundPermission(InboundPermission source) {
        if (source.FromPort != null) {
            this.FromPort = new Long(source.FromPort);
        }
        if (source.IpRange != null) {
            this.IpRange = new String(source.IpRange);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.ToPort != null) {
            this.ToPort = new Long(source.ToPort);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FromPort", this.FromPort);
        this.setParamSimple(map, prefix + "IpRange", this.IpRange);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "ToPort", this.ToPort);

    }
}

