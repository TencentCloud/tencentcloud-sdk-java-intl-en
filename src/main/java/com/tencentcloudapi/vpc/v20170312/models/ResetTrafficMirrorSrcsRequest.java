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

public class ResetTrafficMirrorSrcsRequest extends AbstractModel {

    /**
    * Traffic mirroring instance ID.
    */
    @SerializedName("TrafficMirrorId")
    @Expose
    private String TrafficMirrorId;

    /**
    * Traffic mirroring collection object.
    */
    @SerializedName("CollectorSrcs")
    @Expose
    private String [] CollectorSrcs;

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

    public ResetTrafficMirrorSrcsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResetTrafficMirrorSrcsRequest(ResetTrafficMirrorSrcsRequest source) {
        if (source.TrafficMirrorId != null) {
            this.TrafficMirrorId = new String(source.TrafficMirrorId);
        }
        if (source.CollectorSrcs != null) {
            this.CollectorSrcs = new String[source.CollectorSrcs.length];
            for (int i = 0; i < source.CollectorSrcs.length; i++) {
                this.CollectorSrcs[i] = new String(source.CollectorSrcs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TrafficMirrorId", this.TrafficMirrorId);
        this.setParamArraySimple(map, prefix + "CollectorSrcs.", this.CollectorSrcs);

    }
}

