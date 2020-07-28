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

public class AccessConfiguration extends AbstractModel{

    /**
    * Acceleration region.
    */
    @SerializedName("AccessRegion")
    @Expose
    private String AccessRegion;

    /**
    * Connection bandwidth upper limit in Mbps.
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
    * Concurrent connection upper limit in 10,000 connections, which indicates the allowed number of concurrently online connections.
    */
    @SerializedName("Concurrent")
    @Expose
    private Long Concurrent;

    /**
     * Get Acceleration region. 
     * @return AccessRegion Acceleration region.
     */
    public String getAccessRegion() {
        return this.AccessRegion;
    }

    /**
     * Set Acceleration region.
     * @param AccessRegion Acceleration region.
     */
    public void setAccessRegion(String AccessRegion) {
        this.AccessRegion = AccessRegion;
    }

    /**
     * Get Connection bandwidth upper limit in Mbps. 
     * @return Bandwidth Connection bandwidth upper limit in Mbps.
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set Connection bandwidth upper limit in Mbps.
     * @param Bandwidth Connection bandwidth upper limit in Mbps.
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get Concurrent connection upper limit in 10,000 connections, which indicates the allowed number of concurrently online connections. 
     * @return Concurrent Concurrent connection upper limit in 10,000 connections, which indicates the allowed number of concurrently online connections.
     */
    public Long getConcurrent() {
        return this.Concurrent;
    }

    /**
     * Set Concurrent connection upper limit in 10,000 connections, which indicates the allowed number of concurrently online connections.
     * @param Concurrent Concurrent connection upper limit in 10,000 connections, which indicates the allowed number of concurrently online connections.
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
        this.setParamSimple(map, prefix + "Concurrent", this.Concurrent);

    }
}

