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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeZoneDDoSPolicyResponse extends AbstractModel {

    /**
    * User APPID
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * DDoS mitigation configuration
    */
    @SerializedName("ShieldAreas")
    @Expose
    private ShieldArea [] ShieldAreas;

    /**
    * Includes the details of all subdomain names
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Domains")
    @Expose
    private DDoSApplication [] Domains;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get User APPID 
     * @return AppId User APPID
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set User APPID
     * @param AppId User APPID
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get DDoS mitigation configuration 
     * @return ShieldAreas DDoS mitigation configuration
     */
    public ShieldArea [] getShieldAreas() {
        return this.ShieldAreas;
    }

    /**
     * Set DDoS mitigation configuration
     * @param ShieldAreas DDoS mitigation configuration
     */
    public void setShieldAreas(ShieldArea [] ShieldAreas) {
        this.ShieldAreas = ShieldAreas;
    }

    /**
     * Get Includes the details of all subdomain names
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return Domains Includes the details of all subdomain names
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public DDoSApplication [] getDomains() {
        return this.Domains;
    }

    /**
     * Set Includes the details of all subdomain names
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param Domains Includes the details of all subdomain names
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setDomains(DDoSApplication [] Domains) {
        this.Domains = Domains;
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

    public DescribeZoneDDoSPolicyResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeZoneDDoSPolicyResponse(DescribeZoneDDoSPolicyResponse source) {
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.ShieldAreas != null) {
            this.ShieldAreas = new ShieldArea[source.ShieldAreas.length];
            for (int i = 0; i < source.ShieldAreas.length; i++) {
                this.ShieldAreas[i] = new ShieldArea(source.ShieldAreas[i]);
            }
        }
        if (source.Domains != null) {
            this.Domains = new DDoSApplication[source.Domains.length];
            for (int i = 0; i < source.Domains.length; i++) {
                this.Domains[i] = new DDoSApplication(source.Domains[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamArrayObj(map, prefix + "ShieldAreas.", this.ShieldAreas);
        this.setParamArrayObj(map, prefix + "Domains.", this.Domains);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

