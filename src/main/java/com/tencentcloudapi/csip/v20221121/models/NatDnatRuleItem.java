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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NatDnatRuleItem extends AbstractModel {

    /**
    * <p>IP protocol</p>
    */
    @SerializedName("IpProtocol")
    @Expose
    private String IpProtocol;

    /**
    * <p>Public IP address.</p>
    */
    @SerializedName("PublicIpAddress")
    @Expose
    private String PublicIpAddress;

    /**
    * <p>Public network port</p>
    */
    @SerializedName("PublicPort")
    @Expose
    private Long PublicPort;

    /**
    * <p>Private IP address.</p>
    */
    @SerializedName("PrivateIpAddress")
    @Expose
    private String PrivateIpAddress;

    /**
    * <p>Private network port</p>
    */
    @SerializedName("PrivatePort")
    @Expose
    private Long PrivatePort;

    /**
    * <p>Description.</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get <p>IP protocol</p> 
     * @return IpProtocol <p>IP protocol</p>
     */
    public String getIpProtocol() {
        return this.IpProtocol;
    }

    /**
     * Set <p>IP protocol</p>
     * @param IpProtocol <p>IP protocol</p>
     */
    public void setIpProtocol(String IpProtocol) {
        this.IpProtocol = IpProtocol;
    }

    /**
     * Get <p>Public IP address.</p> 
     * @return PublicIpAddress <p>Public IP address.</p>
     */
    public String getPublicIpAddress() {
        return this.PublicIpAddress;
    }

    /**
     * Set <p>Public IP address.</p>
     * @param PublicIpAddress <p>Public IP address.</p>
     */
    public void setPublicIpAddress(String PublicIpAddress) {
        this.PublicIpAddress = PublicIpAddress;
    }

    /**
     * Get <p>Public network port</p> 
     * @return PublicPort <p>Public network port</p>
     */
    public Long getPublicPort() {
        return this.PublicPort;
    }

    /**
     * Set <p>Public network port</p>
     * @param PublicPort <p>Public network port</p>
     */
    public void setPublicPort(Long PublicPort) {
        this.PublicPort = PublicPort;
    }

    /**
     * Get <p>Private IP address.</p> 
     * @return PrivateIpAddress <p>Private IP address.</p>
     */
    public String getPrivateIpAddress() {
        return this.PrivateIpAddress;
    }

    /**
     * Set <p>Private IP address.</p>
     * @param PrivateIpAddress <p>Private IP address.</p>
     */
    public void setPrivateIpAddress(String PrivateIpAddress) {
        this.PrivateIpAddress = PrivateIpAddress;
    }

    /**
     * Get <p>Private network port</p> 
     * @return PrivatePort <p>Private network port</p>
     */
    public Long getPrivatePort() {
        return this.PrivatePort;
    }

    /**
     * Set <p>Private network port</p>
     * @param PrivatePort <p>Private network port</p>
     */
    public void setPrivatePort(Long PrivatePort) {
        this.PrivatePort = PrivatePort;
    }

    /**
     * Get <p>Description.</p> 
     * @return Description <p>Description.</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Description.</p>
     * @param Description <p>Description.</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public NatDnatRuleItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NatDnatRuleItem(NatDnatRuleItem source) {
        if (source.IpProtocol != null) {
            this.IpProtocol = new String(source.IpProtocol);
        }
        if (source.PublicIpAddress != null) {
            this.PublicIpAddress = new String(source.PublicIpAddress);
        }
        if (source.PublicPort != null) {
            this.PublicPort = new Long(source.PublicPort);
        }
        if (source.PrivateIpAddress != null) {
            this.PrivateIpAddress = new String(source.PrivateIpAddress);
        }
        if (source.PrivatePort != null) {
            this.PrivatePort = new Long(source.PrivatePort);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IpProtocol", this.IpProtocol);
        this.setParamSimple(map, prefix + "PublicIpAddress", this.PublicIpAddress);
        this.setParamSimple(map, prefix + "PublicPort", this.PublicPort);
        this.setParamSimple(map, prefix + "PrivateIpAddress", this.PrivateIpAddress);
        this.setParamSimple(map, prefix + "PrivatePort", this.PrivatePort);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

