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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IPDefendStatus extends AbstractModel {

    /**
    * IP address
    */
    @SerializedName("IP")
    @Expose
    private String IP;

    /**
    * Protection status. 1: enabled; -1: incorrect address; others: disabled
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get IP address 
     * @return IP IP address
     */
    public String getIP() {
        return this.IP;
    }

    /**
     * Set IP address
     * @param IP IP address
     */
    public void setIP(String IP) {
        this.IP = IP;
    }

    /**
     * Get Protection status. 1: enabled; -1: incorrect address; others: disabled 
     * @return Status Protection status. 1: enabled; -1: incorrect address; others: disabled
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Protection status. 1: enabled; -1: incorrect address; others: disabled
     * @param Status Protection status. 1: enabled; -1: incorrect address; others: disabled
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public IPDefendStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IPDefendStatus(IPDefendStatus source) {
        if (source.IP != null) {
            this.IP = new String(source.IP);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IP", this.IP);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

