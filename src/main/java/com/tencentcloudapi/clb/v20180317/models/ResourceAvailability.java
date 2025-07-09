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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourceAvailability extends AbstractModel {

    /**
    * Specific ISP resource information. Values: `CMCC`, `CUCC`, `CTCC`, `BGP`.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Whether the resource is available. Values: `Available`, `Unavailable`
    */
    @SerializedName("Availability")
    @Expose
    private String Availability;

    /**
     * Get Specific ISP resource information. Values: `CMCC`, `CUCC`, `CTCC`, `BGP`. 
     * @return Type Specific ISP resource information. Values: `CMCC`, `CUCC`, `CTCC`, `BGP`.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Specific ISP resource information. Values: `CMCC`, `CUCC`, `CTCC`, `BGP`.
     * @param Type Specific ISP resource information. Values: `CMCC`, `CUCC`, `CTCC`, `BGP`.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Whether the resource is available. Values: `Available`, `Unavailable` 
     * @return Availability Whether the resource is available. Values: `Available`, `Unavailable`
     */
    public String getAvailability() {
        return this.Availability;
    }

    /**
     * Set Whether the resource is available. Values: `Available`, `Unavailable`
     * @param Availability Whether the resource is available. Values: `Available`, `Unavailable`
     */
    public void setAvailability(String Availability) {
        this.Availability = Availability;
    }

    public ResourceAvailability() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceAvailability(ResourceAvailability source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Availability != null) {
            this.Availability = new String(source.Availability);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Availability", this.Availability);

    }
}

