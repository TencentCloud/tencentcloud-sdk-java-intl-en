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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DDoSSpeedLimit extends AbstractModel{

    /**
    * The limit on origin packet rate. Value range: 1 pps - 1000 Gpps. If 0 is passed, the packet rate will not be restricted.
    */
    @SerializedName("PackageLimit")
    @Expose
    private String PackageLimit;

    /**
    * The limit on origin traffic rate. Value range: 1 bps - 10000 Gbps. If 0 is passed, the traffic rate will not be restricted.
    */
    @SerializedName("FluxLimit")
    @Expose
    private String FluxLimit;

    /**
     * Get The limit on origin packet rate. Value range: 1 pps - 1000 Gpps. If 0 is passed, the packet rate will not be restricted. 
     * @return PackageLimit The limit on origin packet rate. Value range: 1 pps - 1000 Gpps. If 0 is passed, the packet rate will not be restricted.
     */
    public String getPackageLimit() {
        return this.PackageLimit;
    }

    /**
     * Set The limit on origin packet rate. Value range: 1 pps - 1000 Gpps. If 0 is passed, the packet rate will not be restricted.
     * @param PackageLimit The limit on origin packet rate. Value range: 1 pps - 1000 Gpps. If 0 is passed, the packet rate will not be restricted.
     */
    public void setPackageLimit(String PackageLimit) {
        this.PackageLimit = PackageLimit;
    }

    /**
     * Get The limit on origin traffic rate. Value range: 1 bps - 10000 Gbps. If 0 is passed, the traffic rate will not be restricted. 
     * @return FluxLimit The limit on origin traffic rate. Value range: 1 bps - 10000 Gbps. If 0 is passed, the traffic rate will not be restricted.
     */
    public String getFluxLimit() {
        return this.FluxLimit;
    }

    /**
     * Set The limit on origin traffic rate. Value range: 1 bps - 10000 Gbps. If 0 is passed, the traffic rate will not be restricted.
     * @param FluxLimit The limit on origin traffic rate. Value range: 1 bps - 10000 Gbps. If 0 is passed, the traffic rate will not be restricted.
     */
    public void setFluxLimit(String FluxLimit) {
        this.FluxLimit = FluxLimit;
    }

    public DDoSSpeedLimit() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DDoSSpeedLimit(DDoSSpeedLimit source) {
        if (source.PackageLimit != null) {
            this.PackageLimit = new String(source.PackageLimit);
        }
        if (source.FluxLimit != null) {
            this.FluxLimit = new String(source.FluxLimit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PackageLimit", this.PackageLimit);
        this.setParamSimple(map, prefix + "FluxLimit", this.FluxLimit);

    }
}

