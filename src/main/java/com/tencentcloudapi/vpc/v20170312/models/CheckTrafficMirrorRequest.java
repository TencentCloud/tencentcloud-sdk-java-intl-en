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

public class CheckTrafficMirrorRequest extends AbstractModel {

    /**
    * Traffic mirroring VPC.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Traffic mirroring instance ID.
    */
    @SerializedName("TrafficMirrorId")
    @Expose
    private String TrafficMirrorId;

    /**
    * Collector IP address list for traffic mirroring.
    */
    @SerializedName("CollectorSources")
    @Expose
    private String [] CollectorSources;

    /**
    * Receiver subnet for traffic mirroring.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * Traffic mirroring collector.
    */
    @SerializedName("CollectorTarget")
    @Expose
    private TrafficMirrorTarget [] CollectorTarget;

    /**
     * Get Traffic mirroring VPC. 
     * @return VpcId Traffic mirroring VPC.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set Traffic mirroring VPC.
     * @param VpcId Traffic mirroring VPC.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Traffic mirroring instance ID. 
     * @return TrafficMirrorId Traffic mirroring instance ID.
     */
    public String getTrafficMirrorId() {
        return this.TrafficMirrorId;
    }

    /**
     * Set Traffic mirroring instance ID.
     * @param TrafficMirrorId Traffic mirroring instance ID.
     */
    public void setTrafficMirrorId(String TrafficMirrorId) {
        this.TrafficMirrorId = TrafficMirrorId;
    }

    /**
     * Get Collector IP address list for traffic mirroring. 
     * @return CollectorSources Collector IP address list for traffic mirroring.
     */
    public String [] getCollectorSources() {
        return this.CollectorSources;
    }

    /**
     * Set Collector IP address list for traffic mirroring.
     * @param CollectorSources Collector IP address list for traffic mirroring.
     */
    public void setCollectorSources(String [] CollectorSources) {
        this.CollectorSources = CollectorSources;
    }

    /**
     * Get Receiver subnet for traffic mirroring. 
     * @return SubnetId Receiver subnet for traffic mirroring.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Receiver subnet for traffic mirroring.
     * @param SubnetId Receiver subnet for traffic mirroring.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Traffic mirroring collector. 
     * @return CollectorTarget Traffic mirroring collector.
     */
    public TrafficMirrorTarget [] getCollectorTarget() {
        return this.CollectorTarget;
    }

    /**
     * Set Traffic mirroring collector.
     * @param CollectorTarget Traffic mirroring collector.
     */
    public void setCollectorTarget(TrafficMirrorTarget [] CollectorTarget) {
        this.CollectorTarget = CollectorTarget;
    }

    public CheckTrafficMirrorRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckTrafficMirrorRequest(CheckTrafficMirrorRequest source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.TrafficMirrorId != null) {
            this.TrafficMirrorId = new String(source.TrafficMirrorId);
        }
        if (source.CollectorSources != null) {
            this.CollectorSources = new String[source.CollectorSources.length];
            for (int i = 0; i < source.CollectorSources.length; i++) {
                this.CollectorSources[i] = new String(source.CollectorSources[i]);
            }
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.CollectorTarget != null) {
            this.CollectorTarget = new TrafficMirrorTarget[source.CollectorTarget.length];
            for (int i = 0; i < source.CollectorTarget.length; i++) {
                this.CollectorTarget[i] = new TrafficMirrorTarget(source.CollectorTarget[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "TrafficMirrorId", this.TrafficMirrorId);
        this.setParamArraySimple(map, prefix + "CollectorSources.", this.CollectorSources);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamArrayObj(map, prefix + "CollectorTarget.", this.CollectorTarget);

    }
}

