/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SpecAvailability extends AbstractModel{

    /**
    * Specification type
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SpecType")
    @Expose
    private String SpecType;

    /**
    * Specification availability
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Availability")
    @Expose
    private String Availability;

    /**
     * Get Specification type
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SpecType Specification type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSpecType() {
        return this.SpecType;
    }

    /**
     * Set Specification type
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SpecType Specification type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSpecType(String SpecType) {
        this.SpecType = SpecType;
    }

    /**
     * Get Specification availability
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Availability Specification availability
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAvailability() {
        return this.Availability;
    }

    /**
     * Set Specification availability
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Availability Specification availability
Note: This field may return null, indicating that no valid values can be obtained.
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

