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
package com.tencentcloudapi.cdwpg.v20201230.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AccessInfo extends AbstractModel {

    /**
    * Address.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * Protocol.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
     * Get Address.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Address Address.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set Address.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Address Address.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get Protocol.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Protocol Protocol.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Protocol.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Protocol Protocol.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    public AccessInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AccessInfo(AccessInfo source) {
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);

    }
}

