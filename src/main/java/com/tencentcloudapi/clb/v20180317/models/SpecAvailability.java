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

public class SpecAvailability extends AbstractModel {

    /**
    * Specifies the specification type.
<Li>Clb.C2.Medium (standard type)</li><li>clb.c3.small (advanced type 1)</li><li>clb.c3.medium (advanced type 2)</li>.
<li>clb.c4.small (high-strength type 1)</li> <li>clb.c4.medium (high-strength type 2)</li> <li>clb.c4.large (high-strength type 3)</li> <li>clb.c4.xlarge (high-strength type 4)</li> <li>shared (shared type)</li>.

    */
    @SerializedName("SpecType")
    @Expose
    private String SpecType;

    /**
    * Specification availability. resource availability, "Available": Available, "Unavailable": Unavailable.
    */
    @SerializedName("Availability")
    @Expose
    private String Availability;

    /**
     * Get Specifies the specification type.
<Li>Clb.C2.Medium (standard type)</li><li>clb.c3.small (advanced type 1)</li><li>clb.c3.medium (advanced type 2)</li>.
<li>clb.c4.small (high-strength type 1)</li> <li>clb.c4.medium (high-strength type 2)</li> <li>clb.c4.large (high-strength type 3)</li> <li>clb.c4.xlarge (high-strength type 4)</li> <li>shared (shared type)</li>.
 
     * @return SpecType Specifies the specification type.
<Li>Clb.C2.Medium (standard type)</li><li>clb.c3.small (advanced type 1)</li><li>clb.c3.medium (advanced type 2)</li>.
<li>clb.c4.small (high-strength type 1)</li> <li>clb.c4.medium (high-strength type 2)</li> <li>clb.c4.large (high-strength type 3)</li> <li>clb.c4.xlarge (high-strength type 4)</li> <li>shared (shared type)</li>.

     */
    public String getSpecType() {
        return this.SpecType;
    }

    /**
     * Set Specifies the specification type.
<Li>Clb.C2.Medium (standard type)</li><li>clb.c3.small (advanced type 1)</li><li>clb.c3.medium (advanced type 2)</li>.
<li>clb.c4.small (high-strength type 1)</li> <li>clb.c4.medium (high-strength type 2)</li> <li>clb.c4.large (high-strength type 3)</li> <li>clb.c4.xlarge (high-strength type 4)</li> <li>shared (shared type)</li>.

     * @param SpecType Specifies the specification type.
<Li>Clb.C2.Medium (standard type)</li><li>clb.c3.small (advanced type 1)</li><li>clb.c3.medium (advanced type 2)</li>.
<li>clb.c4.small (high-strength type 1)</li> <li>clb.c4.medium (high-strength type 2)</li> <li>clb.c4.large (high-strength type 3)</li> <li>clb.c4.xlarge (high-strength type 4)</li> <li>shared (shared type)</li>.

     */
    public void setSpecType(String SpecType) {
        this.SpecType = SpecType;
    }

    /**
     * Get Specification availability. resource availability, "Available": Available, "Unavailable": Unavailable. 
     * @return Availability Specification availability. resource availability, "Available": Available, "Unavailable": Unavailable.
     */
    public String getAvailability() {
        return this.Availability;
    }

    /**
     * Set Specification availability. resource availability, "Available": Available, "Unavailable": Unavailable.
     * @param Availability Specification availability. resource availability, "Available": Available, "Unavailable": Unavailable.
     */
    public void setAvailability(String Availability) {
        this.Availability = Availability;
    }

    public SpecAvailability() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SpecAvailability(SpecAvailability source) {
        if (source.SpecType != null) {
            this.SpecType = new String(source.SpecType);
        }
        if (source.Availability != null) {
            this.Availability = new String(source.Availability);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SpecType", this.SpecType);
        this.setParamSimple(map, prefix + "Availability", this.Availability);

    }
}

