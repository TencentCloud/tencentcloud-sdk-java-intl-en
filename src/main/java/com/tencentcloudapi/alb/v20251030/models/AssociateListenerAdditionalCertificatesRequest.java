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
package com.tencentcloudapi.alb.v20251030.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AssociateListenerAdditionalCertificatesRequest extends AbstractModel {

    /**
    * List of extended certificate IDs.
    */
    @SerializedName("CertificateIds")
    @Expose
    private String [] CertificateIds;

    /**
    * Listener ID, in the format of lst- followed by 8 alphanumeric characters.
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * CLB instance ID. The format is alb- followed by 8 alphanumeric characters.
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * Client token, used to ensure the idempotency of requests. Generate a parameter value from your client to ensure the uniqueness of the value for different requests. ClientToken supports only ASCII characters.
If not specified, the system automatically uses the RequestId of the API request as the ClientToken ID. The RequestId of each API request may not be the same.
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
    * Whether to only precheck this request. Parameter Value:
true: send a check request. It will not add extension certs for HTTPS and QUIC listeners. Check items include whether required parameters are filled in, request format, and service limits. If the check fails, return the corresponding error. If the check passes, return the error code DryRunOperation.
false (default value): Send a normal request, return HTTP 2xx status code after check, and directly perform the operation.
    */
    @SerializedName("DryRun")
    @Expose
    private String DryRun;

    /**
     * Get List of extended certificate IDs. 
     * @return CertificateIds List of extended certificate IDs.
     */
    public String [] getCertificateIds() {
        return this.CertificateIds;
    }

    /**
     * Set List of extended certificate IDs.
     * @param CertificateIds List of extended certificate IDs.
     */
    public void setCertificateIds(String [] CertificateIds) {
        this.CertificateIds = CertificateIds;
    }

    /**
     * Get Listener ID, in the format of lst- followed by 8 alphanumeric characters. 
     * @return ListenerId Listener ID, in the format of lst- followed by 8 alphanumeric characters.
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set Listener ID, in the format of lst- followed by 8 alphanumeric characters.
     * @param ListenerId Listener ID, in the format of lst- followed by 8 alphanumeric characters.
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get CLB instance ID. The format is alb- followed by 8 alphanumeric characters. 
     * @return LoadBalancerId CLB instance ID. The format is alb- followed by 8 alphanumeric characters.
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set CLB instance ID. The format is alb- followed by 8 alphanumeric characters.
     * @param LoadBalancerId CLB instance ID. The format is alb- followed by 8 alphanumeric characters.
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get Client token, used to ensure the idempotency of requests. Generate a parameter value from your client to ensure the uniqueness of the value for different requests. ClientToken supports only ASCII characters.
If not specified, the system automatically uses the RequestId of the API request as the ClientToken ID. The RequestId of each API request may not be the same. 
     * @return ClientToken Client token, used to ensure the idempotency of requests. Generate a parameter value from your client to ensure the uniqueness of the value for different requests. ClientToken supports only ASCII characters.
If not specified, the system automatically uses the RequestId of the API request as the ClientToken ID. The RequestId of each API request may not be the same.
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set Client token, used to ensure the idempotency of requests. Generate a parameter value from your client to ensure the uniqueness of the value for different requests. ClientToken supports only ASCII characters.
If not specified, the system automatically uses the RequestId of the API request as the ClientToken ID. The RequestId of each API request may not be the same.
     * @param ClientToken Client token, used to ensure the idempotency of requests. Generate a parameter value from your client to ensure the uniqueness of the value for different requests. ClientToken supports only ASCII characters.
If not specified, the system automatically uses the RequestId of the API request as the ClientToken ID. The RequestId of each API request may not be the same.
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    /**
     * Get Whether to only precheck this request. Parameter Value:
true: send a check request. It will not add extension certs for HTTPS and QUIC listeners. Check items include whether required parameters are filled in, request format, and service limits. If the check fails, return the corresponding error. If the check passes, return the error code DryRunOperation.
false (default value): Send a normal request, return HTTP 2xx status code after check, and directly perform the operation. 
     * @return DryRun Whether to only precheck this request. Parameter Value:
true: send a check request. It will not add extension certs for HTTPS and QUIC listeners. Check items include whether required parameters are filled in, request format, and service limits. If the check fails, return the corresponding error. If the check passes, return the error code DryRunOperation.
false (default value): Send a normal request, return HTTP 2xx status code after check, and directly perform the operation.
     */
    public String getDryRun() {
        return this.DryRun;
    }

    /**
     * Set Whether to only precheck this request. Parameter Value:
true: send a check request. It will not add extension certs for HTTPS and QUIC listeners. Check items include whether required parameters are filled in, request format, and service limits. If the check fails, return the corresponding error. If the check passes, return the error code DryRunOperation.
false (default value): Send a normal request, return HTTP 2xx status code after check, and directly perform the operation.
     * @param DryRun Whether to only precheck this request. Parameter Value:
true: send a check request. It will not add extension certs for HTTPS and QUIC listeners. Check items include whether required parameters are filled in, request format, and service limits. If the check fails, return the corresponding error. If the check passes, return the error code DryRunOperation.
false (default value): Send a normal request, return HTTP 2xx status code after check, and directly perform the operation.
     */
    public void setDryRun(String DryRun) {
        this.DryRun = DryRun;
    }

    public AssociateListenerAdditionalCertificatesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssociateListenerAdditionalCertificatesRequest(AssociateListenerAdditionalCertificatesRequest source) {
        if (source.CertificateIds != null) {
            this.CertificateIds = new String[source.CertificateIds.length];
            for (int i = 0; i < source.CertificateIds.length; i++) {
                this.CertificateIds[i] = new String(source.CertificateIds[i]);
            }
        }
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.ClientToken != null) {
            this.ClientToken = new String(source.ClientToken);
        }
        if (source.DryRun != null) {
            this.DryRun = new String(source.DryRun);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "CertificateIds.", this.CertificateIds);
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);
        this.setParamSimple(map, prefix + "DryRun", this.DryRun);

    }
}

