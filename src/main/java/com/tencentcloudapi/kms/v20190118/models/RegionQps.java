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
package com.tencentcloudapi.kms.v20190118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RegionQps extends AbstractModel {

    /**
    * <p>Region.</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>qps size</p>
    */
    @SerializedName("Qps")
    @Expose
    private Long Qps;

    /**
     * Get <p>Region.</p> 
     * @return Region <p>Region.</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>Region.</p>
     * @param Region <p>Region.</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>qps size</p> 
     * @return Qps <p>qps size</p>
     */
    public Long getQps() {
        return this.Qps;
    }

    /**
     * Set <p>qps size</p>
     * @param Qps <p>qps size</p>
     */
    public void setQps(Long Qps) {
        this.Qps = Qps;
    }

    public RegionQps() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RegionQps(RegionQps source) {
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Qps != null) {
            this.Qps = new Long(source.Qps);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Qps", this.Qps);

    }
}

