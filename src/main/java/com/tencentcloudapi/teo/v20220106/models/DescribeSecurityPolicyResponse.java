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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSecurityPolicyResponse extends AbstractModel {

    /**
    * User ID
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * Top-level domain name
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Second-level domain name
    */
    @SerializedName("Entity")
    @Expose
    private String Entity;

    /**
    * Security configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Config")
    @Expose
    private SecurityConfig Config;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get User ID 
     * @return AppId User ID
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set User ID
     * @param AppId User ID
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get Top-level domain name 
     * @return ZoneId Top-level domain name
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Top-level domain name
     * @param ZoneId Top-level domain name
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Second-level domain name 
     * @return Entity Second-level domain name
     */
    public String getEntity() {
        return this.Entity;
    }

    /**
     * Set Second-level domain name
     * @param Entity Second-level domain name
     */
    public void setEntity(String Entity) {
        this.Entity = Entity;
    }

    /**
     * Get Security configuration
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return Config Security configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public SecurityConfig getConfig() {
        return this.Config;
    }

    /**
     * Set Security configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param Config Security configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setConfig(SecurityConfig Config) {
        this.Config = Config;
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

    public DescribeSecurityPolicyResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSecurityPolicyResponse(DescribeSecurityPolicyResponse source) {
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Entity != null) {
            this.Entity = new String(source.Entity);
        }
        if (source.Config != null) {
            this.Config = new SecurityConfig(source.Config);
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
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Entity", this.Entity);
        this.setParamObj(map, prefix + "Config.", this.Config);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

