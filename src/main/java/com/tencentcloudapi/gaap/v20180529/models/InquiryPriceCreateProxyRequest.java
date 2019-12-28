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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InquiryPriceCreateProxyRequest extends AbstractModel{

    /**
    * Acceleration region name.
    */
    @SerializedName("AccessRegion")
    @Expose
    private String AccessRegion;

    /**
    * Connection bandwidth cap. Unit: Mbps.
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
    * Origin server region name. It’s an old parameter, please switch to RealServerRegion.
    */
    @SerializedName("DestRegion")
    @Expose
    private String DestRegion;

    /**
    * Upper limit of connection concurrence, which indicates a number of simultaneous online connections. Unit: 10,000 connections. It’s an old parameter, please switch to Concurrent.
    */
    @SerializedName("Concurrency")
    @Expose
    private Long Concurrency;

    /**
    * Origin server region name; It’s a new parameter.
    */
    @SerializedName("RealServerRegion")
    @Expose
    private String RealServerRegion;

    /**
    * Upper limit of connection concurrence, which indicates a number of simultaneous online connections. Unit: 10,000 connections. It’s a new parameter.
    */
    @SerializedName("Concurrent")
    @Expose
    private Long Concurrent;

    /**
     * Get Acceleration region name. 
     * @return AccessRegion Acceleration region name.
     */
    public String getAccessRegion() {
        return this.AccessRegion;
    }

    /**
     * Set Acceleration region name.
     * @param AccessRegion Acceleration region name.
     */
    public void setAccessRegion(String AccessRegion) {
        this.AccessRegion = AccessRegion;
    }

    /**
     * Get Connection bandwidth cap. Unit: Mbps. 
     * @return Bandwidth Connection bandwidth cap. Unit: Mbps.
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set Connection bandwidth cap. Unit: Mbps.
     * @param Bandwidth Connection bandwidth cap. Unit: Mbps.
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get Origin server region name. It’s an old parameter, please switch to RealServerRegion. 
     * @return DestRegion Origin server region name. It’s an old parameter, please switch to RealServerRegion.
     */
    public String getDestRegion() {
        return this.DestRegion;
    }

    /**
     * Set Origin server region name. It’s an old parameter, please switch to RealServerRegion.
     * @param DestRegion Origin server region name. It’s an old parameter, please switch to RealServerRegion.
     */
    public void setDestRegion(String DestRegion) {
        this.DestRegion = DestRegion;
    }

    /**
     * Get Upper limit of connection concurrence, which indicates a number of simultaneous online connections. Unit: 10,000 connections. It’s an old parameter, please switch to Concurrent. 
     * @return Concurrency Upper limit of connection concurrence, which indicates a number of simultaneous online connections. Unit: 10,000 connections. It’s an old parameter, please switch to Concurrent.
     */
    public Long getConcurrency() {
        return this.Concurrency;
    }

    /**
     * Set Upper limit of connection concurrence, which indicates a number of simultaneous online connections. Unit: 10,000 connections. It’s an old parameter, please switch to Concurrent.
     * @param Concurrency Upper limit of connection concurrence, which indicates a number of simultaneous online connections. Unit: 10,000 connections. It’s an old parameter, please switch to Concurrent.
     */
    public void setConcurrency(Long Concurrency) {
        this.Concurrency = Concurrency;
    }

    /**
     * Get Origin server region name; It’s a new parameter. 
     * @return RealServerRegion Origin server region name; It’s a new parameter.
     */
    public String getRealServerRegion() {
        return this.RealServerRegion;
    }

    /**
     * Set Origin server region name; It’s a new parameter.
     * @param RealServerRegion Origin server region name; It’s a new parameter.
     */
    public void setRealServerRegion(String RealServerRegion) {
        this.RealServerRegion = RealServerRegion;
    }

    /**
     * Get Upper limit of connection concurrence, which indicates a number of simultaneous online connections. Unit: 10,000 connections. It’s a new parameter. 
     * @return Concurrent Upper limit of connection concurrence, which indicates a number of simultaneous online connections. Unit: 10,000 connections. It’s a new parameter.
     */
    public Long getConcurrent() {
        return this.Concurrent;
    }

    /**
     * Set Upper limit of connection concurrence, which indicates a number of simultaneous online connections. Unit: 10,000 connections. It’s a new parameter.
     * @param Concurrent Upper limit of connection concurrence, which indicates a number of simultaneous online connections. Unit: 10,000 connections. It’s a new parameter.
     */
    public void setConcurrent(Long Concurrent) {
        this.Concurrent = Concurrent;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccessRegion", this.AccessRegion);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);
        this.setParamSimple(map, prefix + "DestRegion", this.DestRegion);
        this.setParamSimple(map, prefix + "Concurrency", this.Concurrency);
        this.setParamSimple(map, prefix + "RealServerRegion", this.RealServerRegion);
        this.setParamSimple(map, prefix + "Concurrent", this.Concurrent);

    }
}

