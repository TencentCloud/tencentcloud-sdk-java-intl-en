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

public class HostsCertificate extends AbstractModel {

    /**
    * Domain name.
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * Certificate configuration mode. Valid values:
<li>disable: no certificate configured;</li>
<li>eofreecert: configure EdgeOne free certificate;</li> 
<li>sslcert: configure an SSL certificate;</li>
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * Server certificate configuration.
    */
    @SerializedName("HostCertInfo")
    @Expose
    private HostCertInfo [] HostCertInfo;

    /**
    * Application type. Valid values:
<li>apply: manage EdgeOne;</li>
<li>none: EdgeOne is not managed.</li>If not specified, the default value is none.
    */
    @SerializedName("ApplyType")
    @Expose
    private String ApplyType;

    /**
     * Get Domain name. 
     * @return Host Domain name.
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set Domain name.
     * @param Host Domain name.
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get Certificate configuration mode. Valid values:
<li>disable: no certificate configured;</li>
<li>eofreecert: configure EdgeOne free certificate;</li> 
<li>sslcert: configure an SSL certificate;</li> 
     * @return Mode Certificate configuration mode. Valid values:
<li>disable: no certificate configured;</li>
<li>eofreecert: configure EdgeOne free certificate;</li> 
<li>sslcert: configure an SSL certificate;</li>
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set Certificate configuration mode. Valid values:
<li>disable: no certificate configured;</li>
<li>eofreecert: configure EdgeOne free certificate;</li> 
<li>sslcert: configure an SSL certificate;</li>
     * @param Mode Certificate configuration mode. Valid values:
<li>disable: no certificate configured;</li>
<li>eofreecert: configure EdgeOne free certificate;</li> 
<li>sslcert: configure an SSL certificate;</li>
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get Server certificate configuration. 
     * @return HostCertInfo Server certificate configuration.
     */
    public HostCertInfo [] getHostCertInfo() {
        return this.HostCertInfo;
    }

    /**
     * Set Server certificate configuration.
     * @param HostCertInfo Server certificate configuration.
     */
    public void setHostCertInfo(HostCertInfo [] HostCertInfo) {
        this.HostCertInfo = HostCertInfo;
    }

    /**
     * Get Application type. Valid values:
<li>apply: manage EdgeOne;</li>
<li>none: EdgeOne is not managed.</li>If not specified, the default value is none. 
     * @return ApplyType Application type. Valid values:
<li>apply: manage EdgeOne;</li>
<li>none: EdgeOne is not managed.</li>If not specified, the default value is none.
     * @deprecated
     */
    @Deprecated
    public String getApplyType() {
        return this.ApplyType;
    }

    /**
     * Set Application type. Valid values:
<li>apply: manage EdgeOne;</li>
<li>none: EdgeOne is not managed.</li>If not specified, the default value is none.
     * @param ApplyType Application type. Valid values:
<li>apply: manage EdgeOne;</li>
<li>none: EdgeOne is not managed.</li>If not specified, the default value is none.
     * @deprecated
     */
    @Deprecated
    public void setApplyType(String ApplyType) {
        this.ApplyType = ApplyType;
    }

    public HostsCertificate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HostsCertificate(HostsCertificate source) {
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.HostCertInfo != null) {
            this.HostCertInfo = new HostCertInfo[source.HostCertInfo.length];
            for (int i = 0; i < source.HostCertInfo.length; i++) {
                this.HostCertInfo[i] = new HostCertInfo(source.HostCertInfo[i]);
            }
        }
        if (source.ApplyType != null) {
            this.ApplyType = new String(source.ApplyType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamArrayObj(map, prefix + "HostCertInfo.", this.HostCertInfo);
        this.setParamSimple(map, prefix + "ApplyType", this.ApplyType);

    }
}

