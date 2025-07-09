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

public class PostSize extends AbstractModel {

    /**
    * Maximum size of the file uploaded for streaming via a POST request. Values:
`on`: Enable. When enabled, it is set to 32 MB by default.
`off`: Disable

    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Maximum size. Value range: 1 MB to 200 MB.
    */
    @SerializedName("MaxSize")
    @Expose
    private Long MaxSize;

    /**
     * Get Maximum size of the file uploaded for streaming via a POST request. Values:
`on`: Enable. When enabled, it is set to 32 MB by default.
`off`: Disable
 
     * @return Switch Maximum size of the file uploaded for streaming via a POST request. Values:
`on`: Enable. When enabled, it is set to 32 MB by default.
`off`: Disable

     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Maximum size of the file uploaded for streaming via a POST request. Values:
`on`: Enable. When enabled, it is set to 32 MB by default.
`off`: Disable

     * @param Switch Maximum size of the file uploaded for streaming via a POST request. Values:
`on`: Enable. When enabled, it is set to 32 MB by default.
`off`: Disable

     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Maximum size. Value range: 1 MB to 200 MB. 
     * @return MaxSize Maximum size. Value range: 1 MB to 200 MB.
     */
    public Long getMaxSize() {
        return this.MaxSize;
    }

    /**
     * Set Maximum size. Value range: 1 MB to 200 MB.
     * @param MaxSize Maximum size. Value range: 1 MB to 200 MB.
     */
    public void setMaxSize(Long MaxSize) {
        this.MaxSize = MaxSize;
    }

    public PostSize() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PostSize(PostSize source) {
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

