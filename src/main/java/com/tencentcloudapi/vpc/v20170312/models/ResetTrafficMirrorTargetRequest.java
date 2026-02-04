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

public class ResetTrafficMirrorTargetRequest extends AbstractModel {

    /**
    * Traffic mirroring instance ID.
    */
    @SerializedName("TrafficMirrorId")
    @Expose
    private String TrafficMirrorId;

    /**
    * Traffic mirroring receiving destination information.
    */
    @SerializedName("CollectorTarget")
    @Expose
    private TrafficMirrorTarget CollectorTarget;

    /**
    * Subnet of the sender of the traffic mirroring collection traffic of the public IP address type.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

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
     * Get Traffic mirroring receiving destination information. 
     * @return CollectorTarget Traffic mirroring receiving destination information.
     */
    public TrafficMirrorTarget getCollectorTarget() {
        return this.CollectorTarget;
    }

    /**
     * Set Traffic mirroring receiving destination information.
     * @param CollectorTarget Traffic mirroring receiving destination information.
     */
    public void setCollectorTarget(TrafficMirrorTarget CollectorTarget) {
        this.CollectorTarget = CollectorTarget;
    }

    /**
     * Get Subnet of the sender of the traffic mirroring collection traffic of the public IP address type. 
     * @return SubnetId Subnet of the sender of the traffic mirroring collection traffic of the public IP address type.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Subnet of the sender of the traffic mirroring collection traffic of the public IP address type.
     * @param SubnetId Subnet of the sender of the traffic mirroring collection traffic of the public IP address type.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    public ResetTrafficMirrorTargetRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResetTrafficMirrorTargetRequest(ResetTrafficMirrorTargetRequest source) {
        if (source.TrafficMirrorId != null) {
            this.TrafficMirrorId = new String(source.TrafficMirrorId);
        }
        if (source.CollectorTarget != null) {
            this.CollectorTarget = new TrafficMirrorTarget(source.CollectorTarget);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TrafficMirrorId", this.TrafficMirrorId);
        this.setParamObj(map, prefix + "CollectorTarget.", this.CollectorTarget);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);

    }
}

