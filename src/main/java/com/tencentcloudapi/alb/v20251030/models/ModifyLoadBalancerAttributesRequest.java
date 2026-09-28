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

public class ModifyLoadBalancerAttributesRequest extends AbstractModel {

    /**
    * CLB instance ID. The format is alb- followed by 8 alphanumeric characters.
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * Client Token, used to ensure request idempotency.

Generate a parameter value from your client to underwrite the uniqueness of the value for different requests. ClientToken supports only ASCII characters.

> If not specified, the system automatically uses the **RequestId** of the API request as the **ClientToken** ID. The **RequestId** of each API request may not be the same.
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
    * Deletion protection configuration
    */
    @SerializedName("DeletionProtection")
    @Expose
    private DeletionProtectionConfig DeletionProtection;

    /**
    * Whether to only precheck this request. Parameter Value:

- **true**: Send a check request without modifying the properties of the application CLB instance. Check items include whether required parameters are filled in, request format, and service limits. If the check fails, return the corresponding error. If the check passes, return the error code `DryRunOperation`.

- **false** (default value): Send a normal request, return `HTTP_2xx` status code after check, and directly perform the operation.
    */
    @SerializedName("DryRun")
    @Expose
    private Boolean DryRun;

    /**
    * Application CLB instance name. It contains 1-80 characters, including Chinese characters, letters, digits, dashes (-), forward slashes (/), half-width periods (.), and underscores (_).
    */
    @SerializedName("LoadBalancerName")
    @Expose
    private String LoadBalancerName;

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
     * Get Client Token, used to ensure request idempotency.

Generate a parameter value from your client to underwrite the uniqueness of the value for different requests. ClientToken supports only ASCII characters.

> If not specified, the system automatically uses the **RequestId** of the API request as the **ClientToken** ID. The **RequestId** of each API request may not be the same. 
     * @return ClientToken Client Token, used to ensure request idempotency.

Generate a parameter value from your client to underwrite the uniqueness of the value for different requests. ClientToken supports only ASCII characters.

> If not specified, the system automatically uses the **RequestId** of the API request as the **ClientToken** ID. The **RequestId** of each API request may not be the same.
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set Client Token, used to ensure request idempotency.

Generate a parameter value from your client to underwrite the uniqueness of the value for different requests. ClientToken supports only ASCII characters.

> If not specified, the system automatically uses the **RequestId** of the API request as the **ClientToken** ID. The **RequestId** of each API request may not be the same.
     * @param ClientToken Client Token, used to ensure request idempotency.

Generate a parameter value from your client to underwrite the uniqueness of the value for different requests. ClientToken supports only ASCII characters.

> If not specified, the system automatically uses the **RequestId** of the API request as the **ClientToken** ID. The **RequestId** of each API request may not be the same.
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    /**
     * Get Deletion protection configuration 
     * @return DeletionProtection Deletion protection configuration
     */
    public DeletionProtectionConfig getDeletionProtection() {
        return this.DeletionProtection;
    }

    /**
     * Set Deletion protection configuration
     * @param DeletionProtection Deletion protection configuration
     */
    public void setDeletionProtection(DeletionProtectionConfig DeletionProtection) {
        this.DeletionProtection = DeletionProtection;
    }

    /**
     * Get Whether to only precheck this request. Parameter Value:

- **true**: Send a check request without modifying the properties of the application CLB instance. Check items include whether required parameters are filled in, request format, and service limits. If the check fails, return the corresponding error. If the check passes, return the error code `DryRunOperation`.

- **false** (default value): Send a normal request, return `HTTP_2xx` status code after check, and directly perform the operation. 
     * @return DryRun Whether to only precheck this request. Parameter Value:

- **true**: Send a check request without modifying the properties of the application CLB instance. Check items include whether required parameters are filled in, request format, and service limits. If the check fails, return the corresponding error. If the check passes, return the error code `DryRunOperation`.

- **false** (default value): Send a normal request, return `HTTP_2xx` status code after check, and directly perform the operation.
     */
    public Boolean getDryRun() {
        return this.DryRun;
    }

    /**
     * Set Whether to only precheck this request. Parameter Value:

- **true**: Send a check request without modifying the properties of the application CLB instance. Check items include whether required parameters are filled in, request format, and service limits. If the check fails, return the corresponding error. If the check passes, return the error code `DryRunOperation`.

- **false** (default value): Send a normal request, return `HTTP_2xx` status code after check, and directly perform the operation.
     * @param DryRun Whether to only precheck this request. Parameter Value:

- **true**: Send a check request without modifying the properties of the application CLB instance. Check items include whether required parameters are filled in, request format, and service limits. If the check fails, return the corresponding error. If the check passes, return the error code `DryRunOperation`.

- **false** (default value): Send a normal request, return `HTTP_2xx` status code after check, and directly perform the operation.
     */
    public void setDryRun(Boolean DryRun) {
        this.DryRun = DryRun;
    }

    /**
     * Get Application CLB instance name. It contains 1-80 characters, including Chinese characters, letters, digits, dashes (-), forward slashes (/), half-width periods (.), and underscores (_). 
     * @return LoadBalancerName Application CLB instance name. It contains 1-80 characters, including Chinese characters, letters, digits, dashes (-), forward slashes (/), half-width periods (.), and underscores (_).
     */
    public String getLoadBalancerName() {
        return this.LoadBalancerName;
    }

    /**
     * Set Application CLB instance name. It contains 1-80 characters, including Chinese characters, letters, digits, dashes (-), forward slashes (/), half-width periods (.), and underscores (_).
     * @param LoadBalancerName Application CLB instance name. It contains 1-80 characters, including Chinese characters, letters, digits, dashes (-), forward slashes (/), half-width periods (.), and underscores (_).
     */
    public void setLoadBalancerName(String LoadBalancerName) {
        this.LoadBalancerName = LoadBalancerName;
    }

    public ModifyLoadBalancerAttributesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyLoadBalancerAttributesRequest(ModifyLoadBalancerAttributesRequest source) {
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.ClientToken != null) {
            this.ClientToken = new String(source.ClientToken);
        }
        if (source.DeletionProtection != null) {
            this.DeletionProtection = new DeletionProtectionConfig(source.DeletionProtection);
        }
        if (source.DryRun != null) {
            this.DryRun = new Boolean(source.DryRun);
        }
        if (source.LoadBalancerName != null) {
            this.LoadBalancerName = new String(source.LoadBalancerName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);
        this.setParamObj(map, prefix + "DeletionProtection.", this.DeletionProtection);
        this.setParamSimple(map, prefix + "DryRun", this.DryRun);
        this.setParamSimple(map, prefix + "LoadBalancerName", this.LoadBalancerName);

    }
}

