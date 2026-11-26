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

public class CreateInferenceDomainRequest extends AbstractModel {

    /**
    * <p>Site ID.</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * <p>Inference service ID.</p>
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * <p>Reasoning service domain name.</p>
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * <p>Inference task request authentication switch.</p><p>Enumeration values:</p><ul><li>Off: Disable authentication;</li><li>On: Enable authentication.</li></ul><p>Default value: On.</p>
    */
    @SerializedName("AuthSwitch")
    @Expose
    private String AuthSwitch;

    /**
     * Get <p>Site ID.</p> 
     * @return ZoneId <p>Site ID.</p>
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>Site ID.</p>
     * @param ZoneId <p>Site ID.</p>
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>Inference service ID.</p> 
     * @return ServiceId <p>Inference service ID.</p>
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set <p>Inference service ID.</p>
     * @param ServiceId <p>Inference service ID.</p>
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get <p>Reasoning service domain name.</p> 
     * @return Domain <p>Reasoning service domain name.</p>
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set <p>Reasoning service domain name.</p>
     * @param Domain <p>Reasoning service domain name.</p>
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get <p>Inference task request authentication switch.</p><p>Enumeration values:</p><ul><li>Off: Disable authentication;</li><li>On: Enable authentication.</li></ul><p>Default value: On.</p> 
     * @return AuthSwitch <p>Inference task request authentication switch.</p><p>Enumeration values:</p><ul><li>Off: Disable authentication;</li><li>On: Enable authentication.</li></ul><p>Default value: On.</p>
     */
    public String getAuthSwitch() {
        return this.AuthSwitch;
    }

    /**
     * Set <p>Inference task request authentication switch.</p><p>Enumeration values:</p><ul><li>Off: Disable authentication;</li><li>On: Enable authentication.</li></ul><p>Default value: On.</p>
     * @param AuthSwitch <p>Inference task request authentication switch.</p><p>Enumeration values:</p><ul><li>Off: Disable authentication;</li><li>On: Enable authentication.</li></ul><p>Default value: On.</p>
     */
    public void setAuthSwitch(String AuthSwitch) {
        this.AuthSwitch = AuthSwitch;
    }

    public CreateInferenceDomainRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateInferenceDomainRequest(CreateInferenceDomainRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.AuthSwitch != null) {
            this.AuthSwitch = new String(source.AuthSwitch);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "AuthSwitch", this.AuthSwitch);

    }
}

