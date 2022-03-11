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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PublicIPAddressInfo extends AbstractModel{

    /**
    * Billing mode.
    */
    @SerializedName("ChargeMode")
    @Expose
    private String ChargeMode;

    /**
    * Public IP of the instance.
    */
    @SerializedName("PublicIPAddress")
    @Expose
    private String PublicIPAddress;

    /**
    * Public IP ISP of the instance.
    */
    @SerializedName("ISP")
    @Expose
    private ISP ISP;

    /**
    * Outbound bandwidth cap of the instance in Mbps.
    */
    @SerializedName("MaxBandwidthOut")
    @Expose
    private Long MaxBandwidthOut;

    /**
    * Inbound bandwidth cap of the instance in Mbps.
    */
    @SerializedName("MaxBandwidthIn")
    @Expose
    private Long MaxBandwidthIn;

    /**
     * Get Billing mode. 
     * @return ChargeMode Billing mode.
     */
    public String getChargeMode() {
        return this.ChargeMode;
    }

    /**
     * Set Billing mode.
     * @param ChargeMode Billing mode.
     */
    public void setChargeMode(String ChargeMode) {
        this.ChargeMode = ChargeMode;
    }

    /**
     * Get Public IP of the instance. 
     * @return PublicIPAddress Public IP of the instance.
     */
    public String getPublicIPAddress() {
        return this.PublicIPAddress;
    }

    /**
     * Set Public IP of the instance.
     * @param PublicIPAddress Public IP of the instance.
     */
    public void setPublicIPAddress(String PublicIPAddress) {
        this.PublicIPAddress = PublicIPAddress;
    }

    /**
     * Get Public IP ISP of the instance. 
     * @return ISP Public IP ISP of the instance.
     */
    public ISP getISP() {
        return this.ISP;
    }

    /**
     * Set Public IP ISP of the instance.
     * @param ISP Public IP ISP of the instance.
     */
    public void setISP(ISP ISP) {
        this.ISP = ISP;
    }

    /**
     * Get Outbound bandwidth cap of the instance in Mbps. 
     * @return MaxBandwidthOut Outbound bandwidth cap of the instance in Mbps.
     */
    public Long getMaxBandwidthOut() {
        return this.MaxBandwidthOut;
    }

    /**
     * Set Outbound bandwidth cap of the instance in Mbps.
     * @param MaxBandwidthOut Outbound bandwidth cap of the instance in Mbps.
     */
    public void setMaxBandwidthOut(Long MaxBandwidthOut) {
        this.MaxBandwidthOut = MaxBandwidthOut;
    }

    /**
     * Get Inbound bandwidth cap of the instance in Mbps. 
     * @return MaxBandwidthIn Inbound bandwidth cap of the instance in Mbps.
     */
    public Long getMaxBandwidthIn() {
        return this.MaxBandwidthIn;
    }

    /**
     * Set Inbound bandwidth cap of the instance in Mbps.
     * @param MaxBandwidthIn Inbound bandwidth cap of the instance in Mbps.
     */
    public void setMaxBandwidthIn(Long MaxBandwidthIn) {
        this.MaxBandwidthIn = MaxBandwidthIn;
    }

    public PublicIPAddressInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PublicIPAddressInfo(PublicIPAddressInfo source) {
        if (source.ChargeMode != null) {
            this.ChargeMode = new String(source.ChargeMode);
        }
        if (source.PublicIPAddress != null) {
            this.PublicIPAddress = new String(source.PublicIPAddress);
        }
        if (source.ISP != null) {
            this.ISP = new ISP(source.ISP);
        }
        if (source.MaxBandwidthOut != null) {
            this.MaxBandwidthOut = new Long(source.MaxBandwidthOut);
        }
        if (source.MaxBandwidthIn != null) {
            this.MaxBandwidthIn = new Long(source.MaxBandwidthIn);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChargeMode", this.ChargeMode);
        this.setParamSimple(map, prefix + "PublicIPAddress", this.PublicIPAddress);
        this.setParamObj(map, prefix + "ISP.", this.ISP);
        this.setParamSimple(map, prefix + "MaxBandwidthOut", this.MaxBandwidthOut);
        this.setParamSimple(map, prefix + "MaxBandwidthIn", this.MaxBandwidthIn);

    }
}

