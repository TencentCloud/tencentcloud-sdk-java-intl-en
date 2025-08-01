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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SpecificConfig extends AbstractModel {

    /**
    * Specific configuration for domain name inside mainland China.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Mainland")
    @Expose
    private MainlandConfig Mainland;

    /**
    * Specific configuration for domain name outside mainland China.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Overseas")
    @Expose
    private OverseaConfig Overseas;

    /**
     * Get Specific configuration for domain name inside mainland China.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return Mainland Specific configuration for domain name inside mainland China.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public MainlandConfig getMainland() {
        return this.Mainland;
    }

    /**
     * Set Specific configuration for domain name inside mainland China.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param Mainland Specific configuration for domain name inside mainland China.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setMainland(MainlandConfig Mainland) {
        this.Mainland = Mainland;
    }

    /**
     * Get Specific configuration for domain name outside mainland China.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return Overseas Specific configuration for domain name outside mainland China.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public OverseaConfig getOverseas() {
        return this.Overseas;
    }

    /**
     * Set Specific configuration for domain name outside mainland China.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param Overseas Specific configuration for domain name outside mainland China.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setOverseas(OverseaConfig Overseas) {
        this.Overseas = Overseas;
    }

    public SpecificConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SpecificConfig(SpecificConfig source) {
        if (source.Mainland != null) {
            this.Mainland = new MainlandConfig(source.Mainland);
        }
        if (source.Overseas != null) {
            this.Overseas = new OverseaConfig(source.Overseas);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Mainland.", this.Mainland);
        this.setParamObj(map, prefix + "Overseas.", this.Overseas);

    }
}

