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
package com.tencentcloudapi.cdc.v20201214.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LocalNetInfo extends AbstractModel {

    /**
    * Protocol 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Network id 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Routing information 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
    */
    @SerializedName("BGPRoute")
    @Expose
    private String BGPRoute;

    /**
    * Local IP 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
    */
    @SerializedName("LocalIp")
    @Expose
    private String LocalIp;

    /**
     * Get Protocol 
Note: The returned value of this field may be null, indicating that no valid value is obtained. 
     * @return Protocol Protocol 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Protocol 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     * @param Protocol Protocol 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Network id 
Note: The returned value of this field may be null, indicating that no valid value is obtained. 
     * @return VpcId Network id 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set Network id 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     * @param VpcId Network id 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Routing information 
Note: The returned value of this field may be null, indicating that no valid value is obtained. 
     * @return BGPRoute Routing information 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public String getBGPRoute() {
        return this.BGPRoute;
    }

    /**
     * Set Routing information 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     * @param BGPRoute Routing information 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public void setBGPRoute(String BGPRoute) {
        this.BGPRoute = BGPRoute;
    }

    /**
     * Get Local IP 
Note: The returned value of this field may be null, indicating that no valid value is obtained. 
     * @return LocalIp Local IP 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public String getLocalIp() {
        return this.LocalIp;
    }

    /**
     * Set Local IP 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     * @param LocalIp Local IP 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public void setLocalIp(String LocalIp) {
        this.LocalIp = LocalIp;
    }

    public LocalNetInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LocalNetInfo(LocalNetInfo source) {
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.BGPRoute != null) {
            this.BGPRoute = new String(source.BGPRoute);
        }
        if (source.LocalIp != null) {
            this.LocalIp = new String(source.LocalIp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "BGPRoute", this.BGPRoute);
        this.setParamSimple(map, prefix + "LocalIp", this.LocalIp);

    }
}

