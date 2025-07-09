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

public class DescribeIPRegionRequest extends AbstractModel {

    /**
    * List of IPs to be queried, supporting IPV4 and IPV6. Up to 100 can be queried.
    */
    @SerializedName("IPs")
    @Expose
    private String [] IPs;

    /**
     * Get List of IPs to be queried, supporting IPV4 and IPV6. Up to 100 can be queried. 
     * @return IPs List of IPs to be queried, supporting IPV4 and IPV6. Up to 100 can be queried.
     */
    public String [] getIPs() {
        return this.IPs;
    }

    /**
     * Set List of IPs to be queried, supporting IPV4 and IPV6. Up to 100 can be queried.
     * @param IPs List of IPs to be queried, supporting IPV4 and IPV6. Up to 100 can be queried.
     */
    public void setIPs(String [] IPs) {
        this.IPs = IPs;
    }

    public DescribeIPRegionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeIPRegionRequest(DescribeIPRegionRequest source) {
        if (source.IPs != null) {
            this.IPs = new String[source.IPs.length];
            for (int i = 0; i < source.IPs.length; i++) {
                this.IPs[i] = new String(source.IPs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "IPs.", this.IPs);

    }
}

