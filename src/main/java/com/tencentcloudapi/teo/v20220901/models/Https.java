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

public class Https extends AbstractModel {

    /**
    * http/2 configuration switch. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li>
    */
    @SerializedName("Http2")
    @Expose
    private String Http2;

    /**
    * OCSP configuration switch. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li>
    */
    @SerializedName("OcspStapling")
    @Expose
    private String OcspStapling;

    /**
    * Tls version settings. Valid values:
<li>TLSv1: TLSv1 version;</li>
<li>TLSv1.1: TLSv1.1 version;</li>
<li>TLSv1.2: TLSv1.2 version;</li>
<li>TLSv1.3: TLSv1.3 version.</li>Consecutive versions must be enabled when modifying.
    */
    @SerializedName("TlsVersion")
    @Expose
    private String [] TlsVersion;

    /**
    * HSTS configuration.
    */
    @SerializedName("Hsts")
    @Expose
    private Hsts Hsts;

    /**
    * Certificate configuration.
    */
    @SerializedName("CertInfo")
    @Expose
    private ServerCertInfo [] CertInfo;

    /**
    * Application type. Valid values:
<li>apply: manage EdgeOne;</li>
<li>none: EdgeOne is not managed.</li>If not specified, the default value is none.
    */
    @SerializedName("ApplyType")
    @Expose
    private String ApplyType;

    /**
    * Cipher suite. Valid values:
<li>loose-v2023: Provides high compatibility with general security, and supports TLS 1.0-1.3 cipher suites;</li>
<li>general-v2023: Provides relatively high compatibility with moderate security, and supports TLS 1.2-1.3 cipher suites;</li>
<li>strict-v2023: Provides high security, disables all cipher suites with security risks, and supports TLS 1.2-1.3 cipher suites.</li>
    */
    @SerializedName("CipherSuite")
    @Expose
    private String CipherSuite;

    /**
     * Get http/2 configuration switch. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li> 
     * @return Http2 http/2 configuration switch. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li>
     */
    public String getHttp2() {
        return this.Http2;
    }

    /**
     * Set http/2 configuration switch. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li>
     * @param Http2 http/2 configuration switch. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li>
     */
    public void setHttp2(String Http2) {
        this.Http2 = Http2;
    }

    /**
     * Get OCSP configuration switch. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li> 
     * @return OcspStapling OCSP configuration switch. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li>
     */
    public String getOcspStapling() {
        return this.OcspStapling;
    }

    /**
     * Set OCSP configuration switch. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li>
     * @param OcspStapling OCSP configuration switch. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li>
     */
    public void setOcspStapling(String OcspStapling) {
        this.OcspStapling = OcspStapling;
    }

    /**
     * Get Tls version settings. Valid values:
<li>TLSv1: TLSv1 version;</li>
<li>TLSv1.1: TLSv1.1 version;</li>
<li>TLSv1.2: TLSv1.2 version;</li>
<li>TLSv1.3: TLSv1.3 version.</li>Consecutive versions must be enabled when modifying. 
     * @return TlsVersion Tls version settings. Valid values:
<li>TLSv1: TLSv1 version;</li>
<li>TLSv1.1: TLSv1.1 version;</li>
<li>TLSv1.2: TLSv1.2 version;</li>
<li>TLSv1.3: TLSv1.3 version.</li>Consecutive versions must be enabled when modifying.
     */
    public String [] getTlsVersion() {
        return this.TlsVersion;
    }

    /**
     * Set Tls version settings. Valid values:
<li>TLSv1: TLSv1 version;</li>
<li>TLSv1.1: TLSv1.1 version;</li>
<li>TLSv1.2: TLSv1.2 version;</li>
<li>TLSv1.3: TLSv1.3 version.</li>Consecutive versions must be enabled when modifying.
     * @param TlsVersion Tls version settings. Valid values:
<li>TLSv1: TLSv1 version;</li>
<li>TLSv1.1: TLSv1.1 version;</li>
<li>TLSv1.2: TLSv1.2 version;</li>
<li>TLSv1.3: TLSv1.3 version.</li>Consecutive versions must be enabled when modifying.
     */
    public void setTlsVersion(String [] TlsVersion) {
        this.TlsVersion = TlsVersion;
    }

    /**
     * Get HSTS configuration. 
     * @return Hsts HSTS configuration.
     */
    public Hsts getHsts() {
        return this.Hsts;
    }

    /**
     * Set HSTS configuration.
     * @param Hsts HSTS configuration.
     */
    public void setHsts(Hsts Hsts) {
        this.Hsts = Hsts;
    }

    /**
     * Get Certificate configuration. 
     * @return CertInfo Certificate configuration.
     */
    public ServerCertInfo [] getCertInfo() {
        return this.CertInfo;
    }

    /**
     * Set Certificate configuration.
     * @param CertInfo Certificate configuration.
     */
    public void setCertInfo(ServerCertInfo [] CertInfo) {
        this.CertInfo = CertInfo;
    }

    /**
     * Get Application type. Valid values:
<li>apply: manage EdgeOne;</li>
<li>none: EdgeOne is not managed.</li>If not specified, the default value is none. 
     * @return ApplyType Application type. Valid values:
<li>apply: manage EdgeOne;</li>
<li>none: EdgeOne is not managed.</li>If not specified, the default value is none.
     */
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
     */
    public void setApplyType(String ApplyType) {
        this.ApplyType = ApplyType;
    }

    /**
     * Get Cipher suite. Valid values:
<li>loose-v2023: Provides high compatibility with general security, and supports TLS 1.0-1.3 cipher suites;</li>
<li>general-v2023: Provides relatively high compatibility with moderate security, and supports TLS 1.2-1.3 cipher suites;</li>
<li>strict-v2023: Provides high security, disables all cipher suites with security risks, and supports TLS 1.2-1.3 cipher suites.</li> 
     * @return CipherSuite Cipher suite. Valid values:
<li>loose-v2023: Provides high compatibility with general security, and supports TLS 1.0-1.3 cipher suites;</li>
<li>general-v2023: Provides relatively high compatibility with moderate security, and supports TLS 1.2-1.3 cipher suites;</li>
<li>strict-v2023: Provides high security, disables all cipher suites with security risks, and supports TLS 1.2-1.3 cipher suites.</li>
     */
    public String getCipherSuite() {
        return this.CipherSuite;
    }

    /**
     * Set Cipher suite. Valid values:
<li>loose-v2023: Provides high compatibility with general security, and supports TLS 1.0-1.3 cipher suites;</li>
<li>general-v2023: Provides relatively high compatibility with moderate security, and supports TLS 1.2-1.3 cipher suites;</li>
<li>strict-v2023: Provides high security, disables all cipher suites with security risks, and supports TLS 1.2-1.3 cipher suites.</li>
     * @param CipherSuite Cipher suite. Valid values:
<li>loose-v2023: Provides high compatibility with general security, and supports TLS 1.0-1.3 cipher suites;</li>
<li>general-v2023: Provides relatively high compatibility with moderate security, and supports TLS 1.2-1.3 cipher suites;</li>
<li>strict-v2023: Provides high security, disables all cipher suites with security risks, and supports TLS 1.2-1.3 cipher suites.</li>
     */
    public void setCipherSuite(String CipherSuite) {
        this.CipherSuite = CipherSuite;
    }

    public Https() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Https(Https source) {
        if (source.Http2 != null) {
            this.Http2 = new String(source.Http2);
        }
        if (source.OcspStapling != null) {
            this.OcspStapling = new String(source.OcspStapling);
        }
        if (source.TlsVersion != null) {
            this.TlsVersion = new String[source.TlsVersion.length];
            for (int i = 0; i < source.TlsVersion.length; i++) {
                this.TlsVersion[i] = new String(source.TlsVersion[i]);
            }
        }
        if (source.Hsts != null) {
            this.Hsts = new Hsts(source.Hsts);
        }
        if (source.CertInfo != null) {
            this.CertInfo = new ServerCertInfo[source.CertInfo.length];
            for (int i = 0; i < source.CertInfo.length; i++) {
                this.CertInfo[i] = new ServerCertInfo(source.CertInfo[i]);
            }
        }
        if (source.ApplyType != null) {
            this.ApplyType = new String(source.ApplyType);
        }
        if (source.CipherSuite != null) {
            this.CipherSuite = new String(source.CipherSuite);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Http2", this.Http2);
        this.setParamSimple(map, prefix + "OcspStapling", this.OcspStapling);
        this.setParamArraySimple(map, prefix + "TlsVersion.", this.TlsVersion);
        this.setParamObj(map, prefix + "Hsts.", this.Hsts);
        this.setParamArrayObj(map, prefix + "CertInfo.", this.CertInfo);
        this.setParamSimple(map, prefix + "ApplyType", this.ApplyType);
        this.setParamSimple(map, prefix + "CipherSuite", this.CipherSuite);

    }
}

