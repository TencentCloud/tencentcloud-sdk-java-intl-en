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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeClusterAuthenticationOptionsResponse extends AbstractModel {

    /**
    * ServiceAccount authentication configuration
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ServiceAccounts")
    @Expose
    private ServiceAccountAuthenticationOptions ServiceAccounts;

    /**
    * Result of the last modification. Values: `Updating`, `Success`, `Failed` or `TimeOut`.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("LatestOperationState")
    @Expose
    private String LatestOperationState;

    /**
    * OIDC authentication configurations
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("OIDCConfig")
    @Expose
    private OIDCConfigAuthenticationOptions OIDCConfig;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get ServiceAccount authentication configuration
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return ServiceAccounts ServiceAccount authentication configuration
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public ServiceAccountAuthenticationOptions getServiceAccounts() {
        return this.ServiceAccounts;
    }

    /**
     * Set ServiceAccount authentication configuration
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param ServiceAccounts ServiceAccount authentication configuration
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setServiceAccounts(ServiceAccountAuthenticationOptions ServiceAccounts) {
        this.ServiceAccounts = ServiceAccounts;
    }

    /**
     * Get Result of the last modification. Values: `Updating`, `Success`, `Failed` or `TimeOut`.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return LatestOperationState Result of the last modification. Values: `Updating`, `Success`, `Failed` or `TimeOut`.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getLatestOperationState() {
        return this.LatestOperationState;
    }

    /**
     * Set Result of the last modification. Values: `Updating`, `Success`, `Failed` or `TimeOut`.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param LatestOperationState Result of the last modification. Values: `Updating`, `Success`, `Failed` or `TimeOut`.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setLatestOperationState(String LatestOperationState) {
        this.LatestOperationState = LatestOperationState;
    }

    /**
     * Get OIDC authentication configurations
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return OIDCConfig OIDC authentication configurations
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public OIDCConfigAuthenticationOptions getOIDCConfig() {
        return this.OIDCConfig;
    }

    /**
     * Set OIDC authentication configurations
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param OIDCConfig OIDC authentication configurations
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setOIDCConfig(OIDCConfigAuthenticationOptions OIDCConfig) {
        this.OIDCConfig = OIDCConfig;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeClusterAuthenticationOptionsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeClusterAuthenticationOptionsResponse(DescribeClusterAuthenticationOptionsResponse source) {
        if (source.ServiceAccounts != null) {
            this.ServiceAccounts = new ServiceAccountAuthenticationOptions(source.ServiceAccounts);
        }
        if (source.LatestOperationState != null) {
            this.LatestOperationState = new String(source.LatestOperationState);
        }
        if (source.OIDCConfig != null) {
            this.OIDCConfig = new OIDCConfigAuthenticationOptions(source.OIDCConfig);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ServiceAccounts.", this.ServiceAccounts);
        this.setParamSimple(map, prefix + "LatestOperationState", this.LatestOperationState);
        this.setParamObj(map, prefix + "OIDCConfig.", this.OIDCConfig);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

