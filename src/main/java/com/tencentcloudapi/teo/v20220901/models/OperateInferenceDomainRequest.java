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

public class OperateInferenceDomainRequest extends AbstractModel {

    /**
    * <p>Zone ID.</p>
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
    * <p>Operation type.</p><p>Enumeration values:</p><ul><li>Resume: Enable domain;</li><li>Stop: Deactivate domain;</li><li>Delete: Delete domain name.</li></ul>
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
     * Get <p>Zone ID.</p> 
     * @return ZoneId <p>Zone ID.</p>
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>Zone ID.</p>
     * @param ZoneId <p>Zone ID.</p>
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
     * Get <p>Operation type.</p><p>Enumeration values:</p><ul><li>Resume: Enable domain;</li><li>Stop: Deactivate domain;</li><li>Delete: Delete domain name.</li></ul> 
     * @return Operation <p>Operation type.</p><p>Enumeration values:</p><ul><li>Resume: Enable domain;</li><li>Stop: Deactivate domain;</li><li>Delete: Delete domain name.</li></ul>
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set <p>Operation type.</p><p>Enumeration values:</p><ul><li>Resume: Enable domain;</li><li>Stop: Deactivate domain;</li><li>Delete: Delete domain name.</li></ul>
     * @param Operation <p>Operation type.</p><p>Enumeration values:</p><ul><li>Resume: Enable domain;</li><li>Stop: Deactivate domain;</li><li>Delete: Delete domain name.</li></ul>
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    public OperateInferenceDomainRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OperateInferenceDomainRequest(OperateInferenceDomainRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Operation != null) {
            this.Operation = new String(source.Operation);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Operation", this.Operation);

    }
}

