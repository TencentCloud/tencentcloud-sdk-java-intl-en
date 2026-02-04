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

public class TrafficMirrorTarget extends AbstractModel {

    /**
    * Receiving IP address for traffic mirroring.
    */
    @SerializedName("TargetIps")
    @Expose
    private String [] TargetIps;

    /**
    * Receiving IP address group for traffic mirroring. Load balancing rule. Valid values: ENI/FIVE_TUPLE_FLOW (VPC) and FIVE_TUPLE_FLOW (public IP address).
    */
    @SerializedName("AlgHash")
    @Expose
    private String AlgHash;

    /**
    * Receiving endpoint for traffic mirroring (public IP address).
    */
    @SerializedName("TargetEndPoints")
    @Expose
    private String [] TargetEndPoints;

    /**
    * Receiving type for traffic mirroring. Valid values: IP, ENI, and CLB.
    */
    @SerializedName("TargetType")
    @Expose
    private String TargetType;

    /**
     * Get Receiving IP address for traffic mirroring. 
     * @return TargetIps Receiving IP address for traffic mirroring.
     */
    public String [] getTargetIps() {
        return this.TargetIps;
    }

    /**
     * Set Receiving IP address for traffic mirroring.
     * @param TargetIps Receiving IP address for traffic mirroring.
     */
    public void setTargetIps(String [] TargetIps) {
        this.TargetIps = TargetIps;
    }

    /**
     * Get Receiving IP address group for traffic mirroring. Load balancing rule. Valid values: ENI/FIVE_TUPLE_FLOW (VPC) and FIVE_TUPLE_FLOW (public IP address). 
     * @return AlgHash Receiving IP address group for traffic mirroring. Load balancing rule. Valid values: ENI/FIVE_TUPLE_FLOW (VPC) and FIVE_TUPLE_FLOW (public IP address).
     */
    public String getAlgHash() {
        return this.AlgHash;
    }

    /**
     * Set Receiving IP address group for traffic mirroring. Load balancing rule. Valid values: ENI/FIVE_TUPLE_FLOW (VPC) and FIVE_TUPLE_FLOW (public IP address).
     * @param AlgHash Receiving IP address group for traffic mirroring. Load balancing rule. Valid values: ENI/FIVE_TUPLE_FLOW (VPC) and FIVE_TUPLE_FLOW (public IP address).
     */
    public void setAlgHash(String AlgHash) {
        this.AlgHash = AlgHash;
    }

    /**
     * Get Receiving endpoint for traffic mirroring (public IP address). 
     * @return TargetEndPoints Receiving endpoint for traffic mirroring (public IP address).
     */
    public String [] getTargetEndPoints() {
        return this.TargetEndPoints;
    }

    /**
     * Set Receiving endpoint for traffic mirroring (public IP address).
     * @param TargetEndPoints Receiving endpoint for traffic mirroring (public IP address).
     */
    public void setTargetEndPoints(String [] TargetEndPoints) {
        this.TargetEndPoints = TargetEndPoints;
    }

    /**
     * Get Receiving type for traffic mirroring. Valid values: IP, ENI, and CLB. 
     * @return TargetType Receiving type for traffic mirroring. Valid values: IP, ENI, and CLB.
     */
    public String getTargetType() {
        return this.TargetType;
    }

    /**
     * Set Receiving type for traffic mirroring. Valid values: IP, ENI, and CLB.
     * @param TargetType Receiving type for traffic mirroring. Valid values: IP, ENI, and CLB.
     */
    public void setTargetType(String TargetType) {
        this.TargetType = TargetType;
    }

    public TrafficMirrorTarget() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TrafficMirrorTarget(TrafficMirrorTarget source) {
        if (source.TargetIps != null) {
            this.TargetIps = new String[source.TargetIps.length];
            for (int i = 0; i < source.TargetIps.length; i++) {
                this.TargetIps[i] = new String(source.TargetIps[i]);
            }
        }
        if (source.AlgHash != null) {
            this.AlgHash = new String(source.AlgHash);
        }
        if (source.TargetEndPoints != null) {
            this.TargetEndPoints = new String[source.TargetEndPoints.length];
            for (int i = 0; i < source.TargetEndPoints.length; i++) {
                this.TargetEndPoints[i] = new String(source.TargetEndPoints[i]);
            }
        }
        if (source.TargetType != null) {
            this.TargetType = new String(source.TargetType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "TargetIps.", this.TargetIps);
        this.setParamSimple(map, prefix + "AlgHash", this.AlgHash);
        this.setParamArraySimple(map, prefix + "TargetEndPoints.", this.TargetEndPoints);
        this.setParamSimple(map, prefix + "TargetType", this.TargetType);

    }
}

