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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NetDetectIpState extends AbstractModel{

    /**
    * The destination IPv4 address of network detection.
    */
    @SerializedName("DetectDestinationIp")
    @Expose
    private String DetectDestinationIp;

    /**
    * The detection result.
0: successful;
-1: no packet loss occurred during routing;
-2: packet loss occurred when outbound traffic is blocked by the ACL;
-3: packet loss occurred when inbound traffic is blocked by the ACL;
-4: other errors.
    */
    @SerializedName("State")
    @Expose
    private Long State;

    /**
    * The latency. Unit: ms.
    */
    @SerializedName("Delay")
    @Expose
    private Long Delay;

    /**
    * The packet loss rate.
    */
    @SerializedName("PacketLossRate")
    @Expose
    private Long PacketLossRate;

    /**
     * Get The destination IPv4 address of network detection. 
     * @return DetectDestinationIp The destination IPv4 address of network detection.
     */
    public String getDetectDestinationIp() {
        return this.DetectDestinationIp;
    }

    /**
     * Set The destination IPv4 address of network detection.
     * @param DetectDestinationIp The destination IPv4 address of network detection.
     */
    public void setDetectDestinationIp(String DetectDestinationIp) {
        this.DetectDestinationIp = DetectDestinationIp;
    }

    /**
     * Get The detection result.
0: successful;
-1: no packet loss occurred during routing;
-2: packet loss occurred when outbound traffic is blocked by the ACL;
-3: packet loss occurred when inbound traffic is blocked by the ACL;
-4: other errors. 
     * @return State The detection result.
0: successful;
-1: no packet loss occurred during routing;
-2: packet loss occurred when outbound traffic is blocked by the ACL;
-3: packet loss occurred when inbound traffic is blocked by the ACL;
-4: other errors.
     */
    public Long getState() {
        return this.State;
    }

    /**
     * Set The detection result.
0: successful;
-1: no packet loss occurred during routing;
-2: packet loss occurred when outbound traffic is blocked by the ACL;
-3: packet loss occurred when inbound traffic is blocked by the ACL;
-4: other errors.
     * @param State The detection result.
0: successful;
-1: no packet loss occurred during routing;
-2: packet loss occurred when outbound traffic is blocked by the ACL;
-3: packet loss occurred when inbound traffic is blocked by the ACL;
-4: other errors.
     */
    public void setState(Long State) {
        this.State = State;
    }

    /**
     * Get The latency. Unit: ms. 
     * @return Delay The latency. Unit: ms.
     */
    public Long getDelay() {
        return this.Delay;
    }

    /**
     * Set The latency. Unit: ms.
     * @param Delay The latency. Unit: ms.
     */
    public void setDelay(Long Delay) {
        this.Delay = Delay;
    }

    /**
     * Get The packet loss rate. 
     * @return PacketLossRate The packet loss rate.
     */
    public Long getPacketLossRate() {
        return this.PacketLossRate;
    }

    /**
     * Set The packet loss rate.
     * @param PacketLossRate The packet loss rate.
     */
    public void setPacketLossRate(Long PacketLossRate) {
        this.PacketLossRate = PacketLossRate;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DetectDestinationIp", this.DetectDestinationIp);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "Delay", this.Delay);
        this.setParamSimple(map, prefix + "PacketLossRate", this.PacketLossRate);

    }
}

