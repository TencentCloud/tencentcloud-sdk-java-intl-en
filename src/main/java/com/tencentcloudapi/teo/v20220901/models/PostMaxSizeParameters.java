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

public class PostMaxSizeParameters extends AbstractModel {

    /**
    * Whether to enable post request file upload limit, in bytes (default limit: 32 * 2<sup>20</sup> bytes). valid values: <li>`on`: enable limit;</li><li>`off`: disable limit.</li>.
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Maximum size of the file uploaded for streaming via a post request, in bytes. value range: 1 * 2<sup>20</sup> bytes to 500 * 2<sup>20</sup> bytes.
    */
    @SerializedName("MaxSize")
    @Expose
    private Long MaxSize;

    /**
     * Get Whether to enable post request file upload limit, in bytes (default limit: 32 * 2<sup>20</sup> bytes). valid values: <li>`on`: enable limit;</li><li>`off`: disable limit.</li>. 
     * @return Switch Whether to enable post request file upload limit, in bytes (default limit: 32 * 2<sup>20</sup> bytes). valid values: <li>`on`: enable limit;</li><li>`off`: disable limit.</li>.
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Whether to enable post request file upload limit, in bytes (default limit: 32 * 2<sup>20</sup> bytes). valid values: <li>`on`: enable limit;</li><li>`off`: disable limit.</li>.
     * @param Switch Whether to enable post request file upload limit, in bytes (default limit: 32 * 2<sup>20</sup> bytes). valid values: <li>`on`: enable limit;</li><li>`off`: disable limit.</li>.
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Maximum size of the file uploaded for streaming via a post request, in bytes. value range: 1 * 2<sup>20</sup> bytes to 500 * 2<sup>20</sup> bytes. 
     * @return MaxSize Maximum size of the file uploaded for streaming via a post request, in bytes. value range: 1 * 2<sup>20</sup> bytes to 500 * 2<sup>20</sup> bytes.
     */
    public Long getMaxSize() {
        return this.MaxSize;
    }

    /**
     * Set Maximum size of the file uploaded for streaming via a post request, in bytes. value range: 1 * 2<sup>20</sup> bytes to 500 * 2<sup>20</sup> bytes.
     * @param MaxSize Maximum size of the file uploaded for streaming via a post request, in bytes. value range: 1 * 2<sup>20</sup> bytes to 500 * 2<sup>20</sup> bytes.
     */
    public void setMaxSize(Long MaxSize) {
        this.MaxSize = MaxSize;
    }

    public PostMaxSizeParameters() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PostMaxSizeParameters(PostMaxSizeParameters source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.MaxSize != null) {
            this.MaxSize = new Long(source.MaxSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "MaxSize", this.MaxSize);

    }
}

