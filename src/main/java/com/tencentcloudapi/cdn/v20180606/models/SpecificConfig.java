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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SpecificConfig extends AbstractModel{

    /**
    * Specific configuration for domain name inside mainland China.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Mainland")
    @Expose
    private MainlandConfig Mainland;

    /**
    * Specific configuration for domain name outside mainland China.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Overseas")
    @Expose
    private OverseaConfig Overseas;

    /**
     * Get Specific configuration for domain name inside mainland China.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Mainland Specific configuration for domain name inside mainland China.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public MainlandConfig getMainland() {
        return this.Mainland;
    }

    /**
     * Set Specific configuration for domain name inside mainland China.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Mainland Specific configuration for domain name inside mainland China.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMainland(MainlandConfig Mainland) {
        this.Mainland = Mainland;
    }

    /**
     * Get Specific configuration for domain name outside mainland China.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Overseas Specific configuration for domain name outside mainland China.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public OverseaConfig getOverseas() {
        return this.Overseas;
    }

    /**
     * Set Specific configuration for domain name outside mainland China.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Overseas Specific configuration for domain name outside mainland China.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setOverseas(OverseaConfig Overseas) {
        this.Overseas = Overseas;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Mainland.", this.Mainland);
        this.setParamObj(map, prefix + "Overseas.", this.Overseas);

    }
}

