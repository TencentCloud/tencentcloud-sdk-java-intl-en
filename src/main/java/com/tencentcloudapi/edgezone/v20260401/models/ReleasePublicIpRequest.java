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
package com.tencentcloudapi.edgezone.v20260401.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReleasePublicIpRequest extends AbstractModel {

    /**
    * Public network instance ID (route publishing mode is STATIC)
    */
    @SerializedName("NetworkInstanceId")
    @Expose
    private String NetworkInstanceId;

    /**
    * Ip type to be released, enumeration value: ipv4, ipv6
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * List of Ip addresses to be released
    */
    @SerializedName("IpList")
    @Expose
    private String [] IpList;

    /**
     * Get Public network instance ID (route publishing mode is STATIC) 
     * @return NetworkInstanceId Public network instance ID (route publishing mode is STATIC)
     */
    public String getNetworkInstanceId() {
        return this.NetworkInstanceId;
    }

    /**
     * Set Public network instance ID (route publishing mode is STATIC)
     * @param NetworkInstanceId Public network instance ID (route publishing mode is STATIC)
     */
    public void setNetworkInstanceId(String NetworkInstanceId) {
        this.NetworkInstanceId = NetworkInstanceId;
    }

    /**
     * Get Ip type to be released, enumeration value: ipv4, ipv6 
     * @return Type Ip type to be released, enumeration value: ipv4, ipv6
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Ip type to be released, enumeration value: ipv4, ipv6
     * @param Type Ip type to be released, enumeration value: ipv4, ipv6
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get List of Ip addresses to be released 
     * @return IpList List of Ip addresses to be released
     */
    public String [] getIpList() {
        return this.IpList;
    }

    /**
     * Set List of Ip addresses to be released
     * @param IpList List of Ip addresses to be released
     */
    public void setIpList(String [] IpList) {
        this.IpList = IpList;
    }

    public ReleasePublicIpRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReleasePublicIpRequest(ReleasePublicIpRequest source) {
        if (source.NetworkInstanceId != null) {
            this.NetworkInstanceId = new String(source.NetworkInstanceId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.IpList != null) {
            this.IpList = new String[source.IpList.length];
            for (int i = 0; i < source.IpList.length; i++) {
                this.IpList[i] = new String(source.IpList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NetworkInstanceId", this.NetworkInstanceId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArraySimple(map, prefix + "IpList.", this.IpList);

    }
}

