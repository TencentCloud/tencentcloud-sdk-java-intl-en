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

public class TrafficMirrorTargetResourceInfo extends AbstractModel {

    /**
    * Resource ID belonging to the receiving target.
    */
    @SerializedName("TargetId")
    @Expose
    private String TargetId;

    /**
    * Resource name belonging to the receiving target.
    */
    @SerializedName("TargetName")
    @Expose
    private String TargetName;

    /**
     * Get Resource ID belonging to the receiving target. 
     * @return TargetId Resource ID belonging to the receiving target.
     */
    public String getTargetId() {
        return this.TargetId;
    }

    /**
     * Set Resource ID belonging to the receiving target.
     * @param TargetId Resource ID belonging to the receiving target.
     */
    public void setTargetId(String TargetId) {
        this.TargetId = TargetId;
    }

    /**
     * Get Resource name belonging to the receiving target. 
     * @return TargetName Resource name belonging to the receiving target.
     */
    public String getTargetName() {
        return this.TargetName;
    }

    /**
     * Set Resource name belonging to the receiving target.
     * @param TargetName Resource name belonging to the receiving target.
     */
    public void setTargetName(String TargetName) {
        this.TargetName = TargetName;
    }

    public TrafficMirrorTargetResourceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TrafficMirrorTargetResourceInfo(TrafficMirrorTargetResourceInfo source) {
        if (source.TargetId != null) {
            this.TargetId = new String(source.TargetId);
        }
        if (source.TargetName != null) {
            this.TargetName = new String(source.TargetName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TargetId", this.TargetId);
        this.setParamSimple(map, prefix + "TargetName", this.TargetName);

    }
}

