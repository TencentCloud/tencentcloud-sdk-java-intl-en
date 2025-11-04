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

public class PostMaxSize extends AbstractModel {

    /**
    * Whether to enable POST upload limit (default limit: 32 MB). Valid values: 
<li>`on`: Enable;</li>
<li>`off`: Disable.</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Maximum limit.Takes effect only when Switch is on. Range:1 MB - 800 MB (bytes).
    */
    @SerializedName("MaxSize")
    @Expose
    private Long MaxSize;

    /**
     * Get Whether to enable POST upload limit (default limit: 32 MB). Valid values: 
<li>`on`: Enable;</li>
<li>`off`: Disable.</li> 
     * @return Switch Whether to enable POST upload limit (default limit: 32 MB). Valid values: 
<li>`on`: Enable;</li>
<li>`off`: Disable.</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Whether to enable POST upload limit (default limit: 32 MB). Valid values: 
<li>`on`: Enable;</li>
<li>`off`: Disable.</li>
     * @param Switch Whether to enable POST upload limit (default limit: 32 MB). Valid values: 
<li>`on`: Enable;</li>
<li>`off`: Disable.</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Maximum limit.Takes effect only when Switch is on. Range:1 MB - 800 MB (bytes). 
     * @return MaxSize Maximum limit.Takes effect only when Switch is on. Range:1 MB - 800 MB (bytes).
     */
    public Long getMaxSize() {
        return this.MaxSize;
    }

    /**
     * Set Maximum limit.Takes effect only when Switch is on. Range:1 MB - 800 MB (bytes).
     * @param MaxSize Maximum limit.Takes effect only when Switch is on. Range:1 MB - 800 MB (bytes).
     */
    public void setMaxSize(Long MaxSize) {
        this.MaxSize = MaxSize;
    }

    public PostMaxSize() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PostMaxSize(PostMaxSize source) {
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

