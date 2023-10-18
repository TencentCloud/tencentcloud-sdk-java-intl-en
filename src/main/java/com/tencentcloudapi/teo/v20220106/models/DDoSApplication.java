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

public class DDoSApplication extends AbstractModel {

    /**
    * Second-level domain name
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * Status of the domain name
`init`: NS to be switched
`offline`: Site acceleration not enabled with DNS
`process`: Deployment in progress
`online`: Normal
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Site acceleration switch. `on`: Enable site acceleration; `off`: Disable site acceleration. This field can be used together with `SecurityType`.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("AccelerateType")
    @Expose
    private String AccelerateType;

    /**
    * Security acceleration switch. `on`: Enable site acceleration; `off`: Disable site acceleration. This field can be used together with `AccelerateType`.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("SecurityType")
    @Expose
    private String SecurityType;

    /**
     * Get Second-level domain name
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return Host Second-level domain name
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set Second-level domain name
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param Host Second-level domain name
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get Status of the domain name
`init`: NS to be switched
`offline`: Site acceleration not enabled with DNS
`process`: Deployment in progress
`online`: Normal
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return Status Status of the domain name
`init`: NS to be switched
`offline`: Site acceleration not enabled with DNS
`process`: Deployment in progress
`online`: Normal
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Status of the domain name
`init`: NS to be switched
`offline`: Site acceleration not enabled with DNS
`process`: Deployment in progress
`online`: Normal
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param Status Status of the domain name
`init`: NS to be switched
`offline`: Site acceleration not enabled with DNS
`process`: Deployment in progress
`online`: Normal
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Site acceleration switch. `on`: Enable site acceleration; `off`: Disable site acceleration. This field can be used together with `SecurityType`.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return AccelerateType Site acceleration switch. `on`: Enable site acceleration; `off`: Disable site acceleration. This field can be used together with `SecurityType`.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getAccelerateType() {
        return this.AccelerateType;
    }

    /**
     * Set Site acceleration switch. `on`: Enable site acceleration; `off`: Disable site acceleration. This field can be used together with `SecurityType`.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param AccelerateType Site acceleration switch. `on`: Enable site acceleration; `off`: Disable site acceleration. This field can be used together with `SecurityType`.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setAccelerateType(String AccelerateType) {
        this.AccelerateType = AccelerateType;
    }

    /**
     * Get Security acceleration switch. `on`: Enable site acceleration; `off`: Disable site acceleration. This field can be used together with `AccelerateType`.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return SecurityType Security acceleration switch. `on`: Enable site acceleration; `off`: Disable site acceleration. This field can be used together with `AccelerateType`.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getSecurityType() {
        return this.SecurityType;
    }

    /**
     * Set Security acceleration switch. `on`: Enable site acceleration; `off`: Disable site acceleration. This field can be used together with `AccelerateType`.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param SecurityType Security acceleration switch. `on`: Enable site acceleration; `off`: Disable site acceleration. This field can be used together with `AccelerateType`.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setSecurityType(String SecurityType) {
        this.SecurityType = SecurityType;
    }

    public DDoSApplication() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DDoSApplication(DDoSApplication source) {
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.AccelerateType != null) {
            this.AccelerateType = new String(source.AccelerateType);
        }
        if (source.SecurityType != null) {
            this.SecurityType = new String(source.SecurityType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "AccelerateType", this.AccelerateType);
        this.setParamSimple(map, prefix + "SecurityType", this.SecurityType);

    }
}

