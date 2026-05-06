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

public class CloudNativeAPIGatewayBalancedService extends AbstractModel {

    /**
    * Service ID, required as an input parameter
    */
    @SerializedName("ServiceID")
    @Expose
    private String ServiceID;

    /**
    * Service name, as an input parameter, meaningless
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * Upstream name, meaningless as an input parameter
    */
    @SerializedName("UpstreamName")
    @Expose
    private String UpstreamName;

    /**
    * Percentage, 10 means 10%, range 0-100
    */
    @SerializedName("Percent")
    @Expose
    private Float Percent;

    /**
     * Get Service ID, required as an input parameter 
     * @return ServiceID Service ID, required as an input parameter
     */
    public String getServiceID() {
        return this.ServiceID;
    }

    /**
     * Set Service ID, required as an input parameter
     * @param ServiceID Service ID, required as an input parameter
     */
    public void setServiceID(String ServiceID) {
        this.ServiceID = ServiceID;
    }

    /**
     * Get Service name, as an input parameter, meaningless 
     * @return ServiceName Service name, as an input parameter, meaningless
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set Service name, as an input parameter, meaningless
     * @param ServiceName Service name, as an input parameter, meaningless
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get Upstream name, meaningless as an input parameter 
     * @return UpstreamName Upstream name, meaningless as an input parameter
     */
    public String getUpstreamName() {
        return this.UpstreamName;
    }

    /**
     * Set Upstream name, meaningless as an input parameter
     * @param UpstreamName Upstream name, meaningless as an input parameter
     */
    public void setUpstreamName(String UpstreamName) {
        this.UpstreamName = UpstreamName;
    }

    /**
     * Get Percentage, 10 means 10%, range 0-100 
     * @return Percent Percentage, 10 means 10%, range 0-100
     */
    public Float getPercent() {
        return this.Percent;
    }

    /**
     * Set Percentage, 10 means 10%, range 0-100
     * @param Percent Percentage, 10 means 10%, range 0-100
     */
    public void setPercent(Float Percent) {
        this.Percent = Percent;
    }

    public CloudNativeAPIGatewayBalancedService() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudNativeAPIGatewayBalancedService(CloudNativeAPIGatewayBalancedService source) {
        if (source.ServiceID != null) {
            this.ServiceID = new String(source.ServiceID);
        }
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.UpstreamName != null) {
            this.UpstreamName = new String(source.UpstreamName);
        }
        if (source.Percent != null) {
            this.Percent = new Float(source.Percent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceID", this.ServiceID);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "UpstreamName", this.UpstreamName);
        this.setParamSimple(map, prefix + "Percent", this.Percent);

    }
}

