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

public class UpdateTrafficMirrorAllFilterRequest extends AbstractModel {

    /**
    * Traffic mirroring instance ID.
    */
    @SerializedName("TrafficMirrorId")
    @Expose
    private String TrafficMirrorId;

    /**
    * Traffic mirroring collection direction.
    */
    @SerializedName("Direction")
    @Expose
    private String Direction;

    /**
    * Traffic mirroring collection object.
    */
    @SerializedName("CollectorSrcs")
    @Expose
    private String [] CollectorSrcs;

    /**
    * NAT gateway instance to be filtered by traffic mirroring.
    */
    @SerializedName("NatId")
    @Expose
    private String NatId;

    /**
    * Five tuple rule to be filtered by traffic mirroring.
    */
    @SerializedName("CollectorNormalFilters")
    @Expose
    private TrafficMirrorFilter [] CollectorNormalFilters;

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
     * Get Traffic mirroring collection direction. 
     * @return Direction Traffic mirroring collection direction.
     */
    public String getDirection() {
        return this.Direction;
    }

    /**
     * Set Traffic mirroring collection direction.
     * @param Direction Traffic mirroring collection direction.
     */
    public void setDirection(String Direction) {
        this.Direction = Direction;
    }

    /**
     * Get Traffic mirroring collection object. 
     * @return CollectorSrcs Traffic mirroring collection object.
     */
    public String [] getCollectorSrcs() {
        return this.CollectorSrcs;
    }

    /**
     * Set Traffic mirroring collection object.
     * @param CollectorSrcs Traffic mirroring collection object.
     */
    public void setCollectorSrcs(String [] CollectorSrcs) {
        this.CollectorSrcs = CollectorSrcs;
    }

    /**
     * Get NAT gateway instance to be filtered by traffic mirroring. 
     * @return NatId NAT gateway instance to be filtered by traffic mirroring.
     */
    public String getNatId() {
        return this.NatId;
    }

    /**
     * Set NAT gateway instance to be filtered by traffic mirroring.
     * @param NatId NAT gateway instance to be filtered by traffic mirroring.
     */
    public void setNatId(String NatId) {
        this.NatId = NatId;
    }

    /**
     * Get Five tuple rule to be filtered by traffic mirroring. 
     * @return CollectorNormalFilters Five tuple rule to be filtered by traffic mirroring.
     */
    public TrafficMirrorFilter [] getCollectorNormalFilters() {
        return this.CollectorNormalFilters;
    }

    /**
     * Set Five tuple rule to be filtered by traffic mirroring.
     * @param CollectorNormalFilters Five tuple rule to be filtered by traffic mirroring.
     */
    public void setCollectorNormalFilters(TrafficMirrorFilter [] CollectorNormalFilters) {
        this.CollectorNormalFilters = CollectorNormalFilters;
    }

    public UpdateTrafficMirrorAllFilterRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateTrafficMirrorAllFilterRequest(UpdateTrafficMirrorAllFilterRequest source) {
        if (source.TrafficMirrorId != null) {
            this.TrafficMirrorId = new String(source.TrafficMirrorId);
        }
        if (source.Direction != null) {
            this.Direction = new String(source.Direction);
        }
        if (source.CollectorSrcs != null) {
            this.CollectorSrcs = new String[source.CollectorSrcs.length];
            for (int i = 0; i < source.CollectorSrcs.length; i++) {
                this.CollectorSrcs[i] = new String(source.CollectorSrcs[i]);
            }
        }
        if (source.NatId != null) {
            this.NatId = new String(source.NatId);
        }
        if (source.CollectorNormalFilters != null) {
            this.CollectorNormalFilters = new TrafficMirrorFilter[source.CollectorNormalFilters.length];
            for (int i = 0; i < source.CollectorNormalFilters.length; i++) {
                this.CollectorNormalFilters[i] = new TrafficMirrorFilter(source.CollectorNormalFilters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TrafficMirrorId", this.TrafficMirrorId);
        this.setParamSimple(map, prefix + "Direction", this.Direction);
        this.setParamArraySimple(map, prefix + "CollectorSrcs.", this.CollectorSrcs);
        this.setParamSimple(map, prefix + "NatId", this.NatId);
        this.setParamArrayObj(map, prefix + "CollectorNormalFilters.", this.CollectorNormalFilters);

    }
}

