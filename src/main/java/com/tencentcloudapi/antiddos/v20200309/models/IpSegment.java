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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IpSegment extends AbstractModel {

    /**
    * IP address
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * IP mask. For a 32-bit IP address, enter `0`.
    */
    @SerializedName("Mask")
    @Expose
    private Long Mask;

    /**
     * Get IP address 
     * @return Ip IP address
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set IP address
     * @param Ip IP address
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get IP mask. For a 32-bit IP address, enter `0`. 
     * @return Mask IP mask. For a 32-bit IP address, enter `0`.
     */
    public Long getMask() {
        return this.Mask;
    }

    /**
     * Set IP mask. For a 32-bit IP address, enter `0`.
     * @param Mask IP mask. For a 32-bit IP address, enter `0`.
     */
    public void setMask(Long Mask) {
        this.Mask = Mask;
    }

    public IpSegment() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IpSegment(IpSegment source) {
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Mask != null) {
            this.Mask = new Long(source.Mask);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Mask", this.Mask);

    }
}

