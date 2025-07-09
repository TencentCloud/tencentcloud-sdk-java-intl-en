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

public class IPRegionInfo extends AbstractModel {

    /**
    * IP address, IPV4 or IPV6.
    */
    @SerializedName("IP")
    @Expose
    private String IP;

    /**
    * Whether the IP belongs to an EdgeOne node. Valid values:
<li>yes: This IP belongs to an EdgeOne node;</li>
<li>no: This IP does not belong to an EdgeOne node.</li>
    */
    @SerializedName("IsEdgeOneIP")
    @Expose
    private String IsEdgeOneIP;

    /**
     * Get IP address, IPV4 or IPV6. 
     * @return IP IP address, IPV4 or IPV6.
     */
    public String getIP() {
        return this.IP;
    }

    /**
     * Set IP address, IPV4 or IPV6.
     * @param IP IP address, IPV4 or IPV6.
     */
    public void setIP(String IP) {
        this.IP = IP;
    }

    /**
     * Get Whether the IP belongs to an EdgeOne node. Valid values:
<li>yes: This IP belongs to an EdgeOne node;</li>
<li>no: This IP does not belong to an EdgeOne node.</li> 
     * @return IsEdgeOneIP Whether the IP belongs to an EdgeOne node. Valid values:
<li>yes: This IP belongs to an EdgeOne node;</li>
<li>no: This IP does not belong to an EdgeOne node.</li>
     */
    public String getIsEdgeOneIP() {
        return this.IsEdgeOneIP;
    }

    /**
     * Set Whether the IP belongs to an EdgeOne node. Valid values:
<li>yes: This IP belongs to an EdgeOne node;</li>
<li>no: This IP does not belong to an EdgeOne node.</li>
     * @param IsEdgeOneIP Whether the IP belongs to an EdgeOne node. Valid values:
<li>yes: This IP belongs to an EdgeOne node;</li>
<li>no: This IP does not belong to an EdgeOne node.</li>
     */
    public void setIsEdgeOneIP(String IsEdgeOneIP) {
        this.IsEdgeOneIP = IsEdgeOneIP;
    }

    public IPRegionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IPRegionInfo(IPRegionInfo source) {
        if (source.IP != null) {
            this.IP = new String(source.IP);
        }
        if (source.IsEdgeOneIP != null) {
            this.IsEdgeOneIP = new String(source.IsEdgeOneIP);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IP", this.IP);
        this.setParamSimple(map, prefix + "IsEdgeOneIP", this.IsEdgeOneIP);

    }
}

