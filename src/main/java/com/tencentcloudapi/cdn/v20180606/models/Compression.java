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

public class Compression extends AbstractModel {

    /**
    * Whether to enable smart compression. Values:
`on`: Enable
`off`: Disable
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Compression rules array
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("CompressionRules")
    @Expose
    private CompressionRule [] CompressionRules;

    /**
     * Get Whether to enable smart compression. Values:
`on`: Enable
`off`: Disable 
     * @return Switch Whether to enable smart compression. Values:
`on`: Enable
`off`: Disable
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Whether to enable smart compression. Values:
`on`: Enable
`off`: Disable
     * @param Switch Whether to enable smart compression. Values:
`on`: Enable
`off`: Disable
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Compression rules array
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return CompressionRules Compression rules array
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public CompressionRule [] getCompressionRules() {
        return this.CompressionRules;
    }

    /**
     * Set Compression rules array
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param CompressionRules Compression rules array
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setCompressionRules(CompressionRule [] CompressionRules) {
        this.CompressionRules = CompressionRules;
    }

    public Compression() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Compression(Compression source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.CompressionRules != null) {
            this.CompressionRules = new CompressionRule[source.CompressionRules.length];
            for (int i = 0; i < source.CompressionRules.length; i++) {
                this.CompressionRules[i] = new CompressionRule(source.CompressionRules[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamArrayObj(map, prefix + "CompressionRules.", this.CompressionRules);

    }
}

