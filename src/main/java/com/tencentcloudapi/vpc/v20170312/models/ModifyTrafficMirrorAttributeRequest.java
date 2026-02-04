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

public class ModifyTrafficMirrorAttributeRequest extends AbstractModel {

    /**
    * Traffic mirroring instance ID.
    */
    @SerializedName("TrafficMirrorId")
    @Expose
    private String TrafficMirrorId;

    /**
    * Traffic mirroring instance name.
    */
    @SerializedName("TrafficMirrorName")
    @Expose
    private String TrafficMirrorName;

    /**
    * Traffic mirroring instance description information.
    */
    @SerializedName("TrafficMirrorDescription")
    @Expose
    private String TrafficMirrorDescription;

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
     * Get Traffic mirroring instance name. 
     * @return TrafficMirrorName Traffic mirroring instance name.
     */
    public String getTrafficMirrorName() {
        return this.TrafficMirrorName;
    }

    /**
     * Set Traffic mirroring instance name.
     * @param TrafficMirrorName Traffic mirroring instance name.
     */
    public void setTrafficMirrorName(String TrafficMirrorName) {
        this.TrafficMirrorName = TrafficMirrorName;
    }

    /**
     * Get Traffic mirroring instance description information. 
     * @return TrafficMirrorDescription Traffic mirroring instance description information.
     */
    public String getTrafficMirrorDescription() {
        return this.TrafficMirrorDescription;
    }

    /**
     * Set Traffic mirroring instance description information.
     * @param TrafficMirrorDescription Traffic mirroring instance description information.
     */
    public void setTrafficMirrorDescription(String TrafficMirrorDescription) {
        this.TrafficMirrorDescription = TrafficMirrorDescription;
    }

    public ModifyTrafficMirrorAttributeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyTrafficMirrorAttributeRequest(ModifyTrafficMirrorAttributeRequest source) {
        if (source.TrafficMirrorId != null) {
            this.TrafficMirrorId = new String(source.TrafficMirrorId);
        }
        if (source.TrafficMirrorName != null) {
            this.TrafficMirrorName = new String(source.TrafficMirrorName);
        }
        if (source.TrafficMirrorDescription != null) {
            this.TrafficMirrorDescription = new String(source.TrafficMirrorDescription);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TrafficMirrorId", this.TrafficMirrorId);
        this.setParamSimple(map, prefix + "TrafficMirrorName", this.TrafficMirrorName);
        this.setParamSimple(map, prefix + "TrafficMirrorDescription", this.TrafficMirrorDescription);

    }
}

