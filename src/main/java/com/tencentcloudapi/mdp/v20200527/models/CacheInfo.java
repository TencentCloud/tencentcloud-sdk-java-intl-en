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
package com.tencentcloudapi.mdp.v20200527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CacheInfo extends AbstractModel {

    /**
    * List of timeout parameter configuration
Note: this field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("Info")
    @Expose
    private CacheInfoInfo [] Info;

    /**
     * Get List of timeout parameter configuration
Note: this field may return `null`, indicating that no valid value was found. 
     * @return Info List of timeout parameter configuration
Note: this field may return `null`, indicating that no valid value was found.
     */
    public CacheInfoInfo [] getInfo() {
        return this.Info;
    }

    /**
     * Set List of timeout parameter configuration
Note: this field may return `null`, indicating that no valid value was found.
     * @param Info List of timeout parameter configuration
Note: this field may return `null`, indicating that no valid value was found.
     */
    public void setInfo(CacheInfoInfo [] Info) {
        this.Info = Info;
    }

    public CacheInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CacheInfo(CacheInfo source) {
        if (source.Info != null) {
            this.Info = new CacheInfoInfo[source.Info.length];
            for (int i = 0; i < source.Info.length; i++) {
                this.Info[i] = new CacheInfoInfo(source.Info[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Info.", this.Info);

    }
}

