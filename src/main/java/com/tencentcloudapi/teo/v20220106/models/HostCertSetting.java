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

public class HostCertSetting extends AbstractModel {

    /**
    * Domain name
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * Server certificate configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("CertInfo")
    @Expose
    private ServerCertInfo [] CertInfo;

    /**
     * Get Domain name
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return Host Domain name
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set Domain name
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param Host Domain name
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get Server certificate configuration
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return CertInfo Server certificate configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public ServerCertInfo [] getCertInfo() {
        return this.CertInfo;
    }

    /**
     * Set Server certificate configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param CertInfo Server certificate configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setCertInfo(ServerCertInfo [] CertInfo) {
        this.CertInfo = CertInfo;
    }

    public HostCertSetting() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HostCertSetting(HostCertSetting source) {
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.CertInfo != null) {
            this.CertInfo = new ServerCertInfo[source.CertInfo.length];
            for (int i = 0; i < source.CertInfo.length; i++) {
                this.CertInfo[i] = new ServerCertInfo(source.CertInfo[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamArrayObj(map, prefix + "CertInfo.", this.CertInfo);

    }
}

