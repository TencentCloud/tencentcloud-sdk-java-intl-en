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

public class AssociateBandwidthPackageWithLoadBalancerRequest extends AbstractModel {

    /**
    * Bandwidth package ID.
    */
    @SerializedName("BandwidthPackageId")
    @Expose
    private String BandwidthPackageId;

    /**
    * CLB instance ID. The format is alb- followed by 8 alphanumeric characters.
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * Client Token, used for ensuring the idempotency of requests.

Generate a parameter value from your client to underwrite the uniqueness of the value for different requests. ClientToken supports only ASCII characters.

> If not specified, the system automatically uses the **RequestId** of the API request as the **ClientToken** ID. The **RequestId** of each API request may not be the same.
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
    * Whether to only precheck this request. Values:
- **true**: Send a check request without binding the Bandwidth Package to the load balancing instance. Check items include whether required parameters are filled in, request format, and service limits. If the check fails, return the corresponding error. If the check passes, return the error code `DryRunOperation`.
- **false** (default value): Send a normal request. After the check is passed, return an HTTP 2xx status code and directly perform the operation.
    */
    @SerializedName("DryRun")
    @Expose
    private Boolean DryRun;

    /**
     * Get Bandwidth package ID. 
     * @return BandwidthPackageId Bandwidth package ID.
     */
    public String getBandwidthPackageId() {
        return this.BandwidthPackageId;
    }

    /**
     * Set Bandwidth package ID.
     * @param BandwidthPackageId Bandwidth package ID.
     */
    public void setBandwidthPackageId(String BandwidthPackageId) {
        this.BandwidthPackageId = BandwidthPackageId;
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
     * Get Client Token, used for ensuring the idempotency of requests.

Generate a parameter value from your client to underwrite the uniqueness of the value for different requests. ClientToken supports only ASCII characters.

> If not specified, the system automatically uses the **RequestId** of the API request as the **ClientToken** ID. The **RequestId** of each API request may not be the same. 
     * @return ClientToken Client Token, used for ensuring the idempotency of requests.

Generate a parameter value from your client to underwrite the uniqueness of the value for different requests. ClientToken supports only ASCII characters.

> If not specified, the system automatically uses the **RequestId** of the API request as the **ClientToken** ID. The **RequestId** of each API request may not be the same.
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set Client Token, used for ensuring the idempotency of requests.

Generate a parameter value from your client to underwrite the uniqueness of the value for different requests. ClientToken supports only ASCII characters.

> If not specified, the system automatically uses the **RequestId** of the API request as the **ClientToken** ID. The **RequestId** of each API request may not be the same.
     * @param ClientToken Client Token, used for ensuring the idempotency of requests.

Generate a parameter value from your client to underwrite the uniqueness of the value for different requests. ClientToken supports only ASCII characters.

> If not specified, the system automatically uses the **RequestId** of the API request as the **ClientToken** ID. The **RequestId** of each API request may not be the same.
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    /**
     * Get Whether to only precheck this request. Values:
- **true**: Send a check request without binding the Bandwidth Package to the load balancing instance. Check items include whether required parameters are filled in, request format, and service limits. If the check fails, return the corresponding error. If the check passes, return the error code `DryRunOperation`.
- **false** (default value): Send a normal request. After the check is passed, return an HTTP 2xx status code and directly perform the operation. 
     * @return DryRun Whether to only precheck this request. Values:
- **true**: Send a check request without binding the Bandwidth Package to the load balancing instance. Check items include whether required parameters are filled in, request format, and service limits. If the check fails, return the corresponding error. If the check passes, return the error code `DryRunOperation`.
- **false** (default value): Send a normal request. After the check is passed, return an HTTP 2xx status code and directly perform the operation.
     */
    public Boolean getDryRun() {
        return this.DryRun;
    }

    /**
     * Set Whether to only precheck this request. Values:
- **true**: Send a check request without binding the Bandwidth Package to the load balancing instance. Check items include whether required parameters are filled in, request format, and service limits. If the check fails, return the corresponding error. If the check passes, return the error code `DryRunOperation`.
- **false** (default value): Send a normal request. After the check is passed, return an HTTP 2xx status code and directly perform the operation.
     * @param DryRun Whether to only precheck this request. Values:
- **true**: Send a check request without binding the Bandwidth Package to the load balancing instance. Check items include whether required parameters are filled in, request format, and service limits. If the check fails, return the corresponding error. If the check passes, return the error code `DryRunOperation`.
- **false** (default value): Send a normal request. After the check is passed, return an HTTP 2xx status code and directly perform the operation.
     */
    public void setDryRun(Boolean DryRun) {
        this.DryRun = DryRun;
    }

    public AssociateBandwidthPackageWithLoadBalancerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssociateBandwidthPackageWithLoadBalancerRequest(AssociateBandwidthPackageWithLoadBalancerRequest source) {
        if (source.BandwidthPackageId != null) {
            this.BandwidthPackageId = new String(source.BandwidthPackageId);
        }
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.ClientToken != null) {
            this.ClientToken = new String(source.ClientToken);
        }
        if (source.DryRun != null) {
            this.DryRun = new Boolean(source.DryRun);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BandwidthPackageId", this.BandwidthPackageId);
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);
        this.setParamSimple(map, prefix + "DryRun", this.DryRun);

    }
}

