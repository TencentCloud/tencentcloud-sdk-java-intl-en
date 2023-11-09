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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyHostsCertificateRequest extends AbstractModel {

    /**
    * ID of the site.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Domain names that you need to modify the certificate configuration
    */
    @SerializedName("Hosts")
    @Expose
    private String [] Hosts;

    /**
    * Certificate configuration mode. Values:
<li>`disable`: (Default) Do not configure the certificate</li>
<li>`eofreecert`: Use a free certificate provided by EdgeOne</li>
<li>`sslcert`: Configure an SSL certificate.</li>
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * ID of the SSL certificate. It takes effect when `mode=sslcert`. To check the certificate ID, go to the [SSL Certificate](https://console.cloud.tencent.com/certoview) console.
    */
    @SerializedName("ServerCertInfo")
    @Expose
    private ServerCertInfo [] ServerCertInfo;

    /**
    * Whether the certificate is managed by EdgeOne. Values:
<li>`none`: Not managed by EdgeOne</li>
<li>`apply`: Managed by EdgeOne</li>
Default value: `none`.
    */
    @SerializedName("ApplyType")
    @Expose
    private String ApplyType;

    /**
     * Get ID of the site. 
     * @return ZoneId ID of the site.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set ID of the site.
     * @param ZoneId ID of the site.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Domain names that you need to modify the certificate configuration 
     * @return Hosts Domain names that you need to modify the certificate configuration
     */
    public String [] getHosts() {
        return this.Hosts;
    }

    /**
     * Set Domain names that you need to modify the certificate configuration
     * @param Hosts Domain names that you need to modify the certificate configuration
     */
    public void setHosts(String [] Hosts) {
        this.Hosts = Hosts;
    }

    /**
     * Get Certificate configuration mode. Values:
<li>`disable`: (Default) Do not configure the certificate</li>
<li>`eofreecert`: Use a free certificate provided by EdgeOne</li>
<li>`sslcert`: Configure an SSL certificate.</li> 
     * @return Mode Certificate configuration mode. Values:
<li>`disable`: (Default) Do not configure the certificate</li>
<li>`eofreecert`: Use a free certificate provided by EdgeOne</li>
<li>`sslcert`: Configure an SSL certificate.</li>
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set Certificate configuration mode. Values:
<li>`disable`: (Default) Do not configure the certificate</li>
<li>`eofreecert`: Use a free certificate provided by EdgeOne</li>
<li>`sslcert`: Configure an SSL certificate.</li>
     * @param Mode Certificate configuration mode. Values:
<li>`disable`: (Default) Do not configure the certificate</li>
<li>`eofreecert`: Use a free certificate provided by EdgeOne</li>
<li>`sslcert`: Configure an SSL certificate.</li>
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get ID of the SSL certificate. It takes effect when `mode=sslcert`. To check the certificate ID, go to the [SSL Certificate](https://console.cloud.tencent.com/certoview) console. 
     * @return ServerCertInfo ID of the SSL certificate. It takes effect when `mode=sslcert`. To check the certificate ID, go to the [SSL Certificate](https://console.cloud.tencent.com/certoview) console.
     */
    public ServerCertInfo [] getServerCertInfo() {
        return this.ServerCertInfo;
    }

    /**
     * Set ID of the SSL certificate. It takes effect when `mode=sslcert`. To check the certificate ID, go to the [SSL Certificate](https://console.cloud.tencent.com/certoview) console.
     * @param ServerCertInfo ID of the SSL certificate. It takes effect when `mode=sslcert`. To check the certificate ID, go to the [SSL Certificate](https://console.cloud.tencent.com/certoview) console.
     */
    public void setServerCertInfo(ServerCertInfo [] ServerCertInfo) {
        this.ServerCertInfo = ServerCertInfo;
    }

    /**
     * Get Whether the certificate is managed by EdgeOne. Values:
<li>`none`: Not managed by EdgeOne</li>
<li>`apply`: Managed by EdgeOne</li>
Default value: `none`. 
     * @return ApplyType Whether the certificate is managed by EdgeOne. Values:
<li>`none`: Not managed by EdgeOne</li>
<li>`apply`: Managed by EdgeOne</li>
Default value: `none`.
     * @deprecated
     */
    @Deprecated
    public String getApplyType() {
        return this.ApplyType;
    }

    /**
     * Set Whether the certificate is managed by EdgeOne. Values:
<li>`none`: Not managed by EdgeOne</li>
<li>`apply`: Managed by EdgeOne</li>
Default value: `none`.
     * @param ApplyType Whether the certificate is managed by EdgeOne. Values:
<li>`none`: Not managed by EdgeOne</li>
<li>`apply`: Managed by EdgeOne</li>
Default value: `none`.
     * @deprecated
     */
    @Deprecated
    public void setApplyType(String ApplyType) {
        this.ApplyType = ApplyType;
    }

    public ModifyHostsCertificateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyHostsCertificateRequest(ModifyHostsCertificateRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Hosts != null) {
            this.Hosts = new String[source.Hosts.length];
            for (int i = 0; i < source.Hosts.length; i++) {
                this.Hosts[i] = new String(source.Hosts[i]);
            }
        }
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.ServerCertInfo != null) {
            this.ServerCertInfo = new ServerCertInfo[source.ServerCertInfo.length];
            for (int i = 0; i < source.ServerCertInfo.length; i++) {
                this.ServerCertInfo[i] = new ServerCertInfo(source.ServerCertInfo[i]);
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
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamArraySimple(map, prefix + "Hosts.", this.Hosts);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamArrayObj(map, prefix + "ServerCertInfo.", this.ServerCertInfo);
        this.setParamSimple(map, prefix + "ApplyType", this.ApplyType);

    }
}

