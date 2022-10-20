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

public class DDoSAllowBlockRule extends AbstractModel{

    /**
    * The client IP, which can be a single IP, IP range, or subnet range, such as "1.1.1.1", "1.1.1.2-1.1.1.3", and "1.2.1.0/24-1.2.2.0/24".
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * The type. Values:
<li>`block`: Blocklist</li><li>`allow`: Allowlist</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * The 10-digit timestamp, such as `1199116800`. The current time will be used if this field is not specified.
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
     * Get The client IP, which can be a single IP, IP range, or subnet range, such as "1.1.1.1", "1.1.1.2-1.1.1.3", and "1.2.1.0/24-1.2.2.0/24". 
     * @return Ip The client IP, which can be a single IP, IP range, or subnet range, such as "1.1.1.1", "1.1.1.2-1.1.1.3", and "1.2.1.0/24-1.2.2.0/24".
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set The client IP, which can be a single IP, IP range, or subnet range, such as "1.1.1.1", "1.1.1.2-1.1.1.3", and "1.2.1.0/24-1.2.2.0/24".
     * @param Ip The client IP, which can be a single IP, IP range, or subnet range, such as "1.1.1.1", "1.1.1.2-1.1.1.3", and "1.2.1.0/24-1.2.2.0/24".
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get The type. Values:
<li>`block`: Blocklist</li><li>`allow`: Allowlist</li> 
     * @return Type The type. Values:
<li>`block`: Blocklist</li><li>`allow`: Allowlist</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set The type. Values:
<li>`block`: Blocklist</li><li>`allow`: Allowlist</li>
     * @param Type The type. Values:
<li>`block`: Blocklist</li><li>`allow`: Allowlist</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get The 10-digit timestamp, such as `1199116800`. The current time will be used if this field is not specified. 
     * @return UpdateTime The 10-digit timestamp, such as `1199116800`. The current time will be used if this field is not specified.
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set The 10-digit timestamp, such as `1199116800`. The current time will be used if this field is not specified.
     * @param UpdateTime The 10-digit timestamp, such as `1199116800`. The current time will be used if this field is not specified.
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public DDoSAllowBlockRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DDoSAllowBlockRule(DDoSAllowBlockRule source) {
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

