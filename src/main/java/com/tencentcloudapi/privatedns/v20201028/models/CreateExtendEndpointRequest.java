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
package com.tencentcloudapi.privatedns.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateExtendEndpointRequest extends AbstractModel {

    /**
    * Outbound endpoint name.
    */
    @SerializedName("EndpointName")
    @Expose
    private String EndpointName;

    /**
    * The region of the outbound endpoint must be consistent with the region of the forwarding target VIP.
    */
    @SerializedName("EndpointRegion")
    @Expose
    private String EndpointRegion;

    /**
    * Forwarding target.
    */
    @SerializedName("ForwardIp")
    @Expose
    private ForwardIp ForwardIp;

    /**
     * Get Outbound endpoint name. 
     * @return EndpointName Outbound endpoint name.
     */
    public String getEndpointName() {
        return this.EndpointName;
    }

    /**
     * Set Outbound endpoint name.
     * @param EndpointName Outbound endpoint name.
     */
    public void setEndpointName(String EndpointName) {
        this.EndpointName = EndpointName;
    }

    /**
     * Get The region of the outbound endpoint must be consistent with the region of the forwarding target VIP. 
     * @return EndpointRegion The region of the outbound endpoint must be consistent with the region of the forwarding target VIP.
     */
    public String getEndpointRegion() {
        return this.EndpointRegion;
    }

    /**
     * Set The region of the outbound endpoint must be consistent with the region of the forwarding target VIP.
     * @param EndpointRegion The region of the outbound endpoint must be consistent with the region of the forwarding target VIP.
     */
    public void setEndpointRegion(String EndpointRegion) {
        this.EndpointRegion = EndpointRegion;
    }

    /**
     * Get Forwarding target. 
     * @return ForwardIp Forwarding target.
     */
    public ForwardIp getForwardIp() {
        return this.ForwardIp;
    }

    /**
     * Set Forwarding target.
     * @param ForwardIp Forwarding target.
     */
    public void setForwardIp(ForwardIp ForwardIp) {
        this.ForwardIp = ForwardIp;
    }

    public CreateExtendEndpointRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateExtendEndpointRequest(CreateExtendEndpointRequest source) {
        if (source.EndpointName != null) {
            this.EndpointName = new String(source.EndpointName);
        }
        if (source.EndpointRegion != null) {
            this.EndpointRegion = new String(source.EndpointRegion);
        }
        if (source.ForwardIp != null) {
            this.ForwardIp = new ForwardIp(source.ForwardIp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EndpointName", this.EndpointName);
        this.setParamSimple(map, prefix + "EndpointRegion", this.EndpointRegion);
        this.setParamObj(map, prefix + "ForwardIp.", this.ForwardIp);

    }
}

