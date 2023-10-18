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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WebAttackEvent extends AbstractModel {

    /**
    * Client IP
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ClientIp")
    @Expose
    private String ClientIp;

    /**
    * Attack URL
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AttackUrl")
    @Expose
    private String AttackUrl;

    /**
    * Attack time in seconds
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AttackTime")
    @Expose
    private Long AttackTime;

    /**
     * Get Client IP
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ClientIp Client IP
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getClientIp() {
        return this.ClientIp;
    }

    /**
     * Set Client IP
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ClientIp Client IP
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setClientIp(String ClientIp) {
        this.ClientIp = ClientIp;
    }

    /**
     * Get Attack URL
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AttackUrl Attack URL
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAttackUrl() {
        return this.AttackUrl;
    }

    /**
     * Set Attack URL
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AttackUrl Attack URL
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAttackUrl(String AttackUrl) {
        this.AttackUrl = AttackUrl;
    }

    /**
     * Get Attack time in seconds
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AttackTime Attack time in seconds
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getAttackTime() {
        return this.AttackTime;
    }

    /**
     * Set Attack time in seconds
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AttackTime Attack time in seconds
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAttackTime(Long AttackTime) {
        this.AttackTime = AttackTime;
    }

    public WebAttackEvent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WebAttackEvent(WebAttackEvent source) {
        if (source.ClientIp != null) {
            this.ClientIp = new String(source.ClientIp);
        }
        if (source.AttackUrl != null) {
            this.AttackUrl = new String(source.AttackUrl);
        }
        if (source.AttackTime != null) {
            this.AttackTime = new Long(source.AttackTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClientIp", this.ClientIp);
        this.setParamSimple(map, prefix + "AttackUrl", this.AttackUrl);
        this.setParamSimple(map, prefix + "AttackTime", this.AttackTime);

    }
}

