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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Compression extends AbstractModel {

    /**
    * Whether to enable smart compression. Values:
<li>`on`: Enable</li>
<li>`off`: Disable</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Supported compression algorithm list. valid values:.
<Li>Brotli: specifies the brotli algorithm.</li>.
<Li>Gzip: specifies the gzip algorithm.</li>.
    */
    @SerializedName("Algorithms")
    @Expose
    private String [] Algorithms;

    /**
     * Get Whether to enable smart compression. Values:
<li>`on`: Enable</li>
<li>`off`: Disable</li> 
     * @return Switch Whether to enable smart compression. Values:
<li>`on`: Enable</li>
<li>`off`: Disable</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Whether to enable smart compression. Values:
<li>`on`: Enable</li>
<li>`off`: Disable</li>
     * @param Switch Whether to enable smart compression. Values:
<li>`on`: Enable</li>
<li>`off`: Disable</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Supported compression algorithm list. valid values:.
<Li>Brotli: specifies the brotli algorithm.</li>.
<Li>Gzip: specifies the gzip algorithm.</li>. 
     * @return Algorithms Supported compression algorithm list. valid values:.
<Li>Brotli: specifies the brotli algorithm.</li>.
<Li>Gzip: specifies the gzip algorithm.</li>.
     */
    public String [] getAlgorithms() {
        return this.Algorithms;
    }

    /**
     * Set Supported compression algorithm list. valid values:.
<Li>Brotli: specifies the brotli algorithm.</li>.
<Li>Gzip: specifies the gzip algorithm.</li>.
     * @param Algorithms Supported compression algorithm list. valid values:.
<Li>Brotli: specifies the brotli algorithm.</li>.
<Li>Gzip: specifies the gzip algorithm.</li>.
     */
    public void setAlgorithms(String [] Algorithms) {
        this.Algorithms = Algorithms;
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
        if (source.Algorithms != null) {
            this.Algorithms = new String[source.Algorithms.length];
            for (int i = 0; i < source.Algorithms.length; i++) {
                this.Algorithms[i] = new String(source.Algorithms[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamArraySimple(map, prefix + "Algorithms.", this.Algorithms);

    }
}

