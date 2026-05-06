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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCloudNativeAPIGatewayInfoByIpRequest extends AbstractModel {

    /**
    * Public ip address of the cloud-native gateway
    */
    @SerializedName("PublicNetworkIP")
    @Expose
    private String PublicNetworkIP;

    /**
     * Get Public ip address of the cloud-native gateway 
     * @return PublicNetworkIP Public ip address of the cloud-native gateway
     */
    public String getPublicNetworkIP() {
        return this.PublicNetworkIP;
    }

    /**
     * Set Public ip address of the cloud-native gateway
     * @param PublicNetworkIP Public ip address of the cloud-native gateway
     */
    public void setPublicNetworkIP(String PublicNetworkIP) {
        this.PublicNetworkIP = PublicNetworkIP;
    }

    public DescribeCloudNativeAPIGatewayInfoByIpRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCloudNativeAPIGatewayInfoByIpRequest(DescribeCloudNativeAPIGatewayInfoByIpRequest source) {
        if (source.PublicNetworkIP != null) {
            this.PublicNetworkIP = new String(source.PublicNetworkIP);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PublicNetworkIP", this.PublicNetworkIP);

    }
}

