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
    * Specification type.<li>clb.c2.medium: Standard</li><li>clb.c3.small: Advanced 1</li><li>clb.c3.medium: Advanced 2</li><li>clb.c4.small: Super Large 1</li><li>clb.c4.medium: Super Large 2</li><li>clb.c4.large: Super Large 3</li><li>clb.c4.xlarge: Super Large 4</li><li>shared: Shared</li>Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SpecType")
    @Expose
    private String SpecType;

    /**
    * Specification availability. It indicates the resource availability. Valid values: Available, Unavailable.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Availability")
    @Expose
    private String Availability;

    /**
     * Get Specification type.<li>clb.c2.medium: Standard</li><li>clb.c3.small: Advanced 1</li><li>clb.c3.medium: Advanced 2</li><li>clb.c4.small: Super Large 1</li><li>clb.c4.medium: Super Large 2</li><li>clb.c4.large: Super Large 3</li><li>clb.c4.xlarge: Super Large 4</li><li>shared: Shared</li>Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SpecType Specification type.<li>clb.c2.medium: Standard</li><li>clb.c3.small: Advanced 1</li><li>clb.c3.medium: Advanced 2</li><li>clb.c4.small: Super Large 1</li><li>clb.c4.medium: Super Large 2</li><li>clb.c4.large: Super Large 3</li><li>clb.c4.xlarge: Super Large 4</li><li>shared: Shared</li>Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSpecType() {
        return this.SpecType;
    }

    /**
     * Set Specification type.<li>clb.c2.medium: Standard</li><li>clb.c3.small: Advanced 1</li><li>clb.c3.medium: Advanced 2</li><li>clb.c4.small: Super Large 1</li><li>clb.c4.medium: Super Large 2</li><li>clb.c4.large: Super Large 3</li><li>clb.c4.xlarge: Super Large 4</li><li>shared: Shared</li>Note: This field may return null, indicating that no valid values can be obtained.
     * @param SpecType Specification type.<li>clb.c2.medium: Standard</li><li>clb.c3.small: Advanced 1</li><li>clb.c3.medium: Advanced 2</li><li>clb.c4.small: Super Large 1</li><li>clb.c4.medium: Super Large 2</li><li>clb.c4.large: Super Large 3</li><li>clb.c4.xlarge: Super Large 4</li><li>shared: Shared</li>Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSpecType(String SpecType) {
        this.SpecType = SpecType;
    }

    /**
     * Get Specification availability. It indicates the resource availability. Valid values: Available, Unavailable.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Availability Specification availability. It indicates the resource availability. Valid values: Available, Unavailable.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAvailability() {
        return this.Availability;
    }

    /**
     * Set Specification availability. It indicates the resource availability. Valid values: Available, Unavailable.Note: This field may return null, indicating that no valid values can be obtained.
     * @param Availability Specification availability. It indicates the resource availability. Valid values: Available, Unavailable.Note: This field may return null, indicating that no valid values can be obtained.
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

