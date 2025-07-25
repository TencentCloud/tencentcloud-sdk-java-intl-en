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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VersionWeight extends AbstractModel {

    /**
    * Function version name
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * Version weight
    */
    @SerializedName("Weight")
    @Expose
    private Float Weight;

    /**
     * Get Function version name 
     * @return Version Function version name
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set Function version name
     * @param Version Function version name
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get Version weight 
     * @return Weight Version weight
     */
    public Float getWeight() {
        return this.Weight;
    }

    /**
     * Set Version weight
     * @param Weight Version weight
     */
    public void setWeight(Float Weight) {
        this.Weight = Weight;
    }

    public VersionWeight() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VersionWeight(VersionWeight source) {
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.Weight != null) {
            this.Weight = new Float(source.Weight);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "Weight", this.Weight);

    }
}

