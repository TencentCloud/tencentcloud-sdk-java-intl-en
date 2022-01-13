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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AdvanceHttps extends AbstractModel{

    /**
    * Custom TLS data switch
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("CustomTlsStatus")
    @Expose
    private String CustomTlsStatus;

    /**
    * Specifies the TLS version. Valid values: `TLSv1`, `TLSV1.1`, `TLSV1.2`, and `TLSv1.3`. Only consecutive versions can be enabled at the same time.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("TlsVersion")
    @Expose
    private String [] TlsVersion;

    /**
    * Custom encryption suite
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Cipher")
    @Expose
    private String Cipher;

    /**
    * Origin authentication type
`off`: disable authentication
`oneWay`: authenticate the origin 
`twoWay`: two-way authentication
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("VerifyOriginType")
    @Expose
    private String VerifyOriginType;

    /**
    * Information of the origin-pull certificate
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("CertInfo")
    @Expose
    private ServerCert CertInfo;

    /**
    * Information of the origin server certificate
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("OriginCertInfo")
    @Expose
    private ClientCert OriginCertInfo;

    /**
     * Get Custom TLS data switch
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return CustomTlsStatus Custom TLS data switch
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getCustomTlsStatus() {
        return this.CustomTlsStatus;
    }

    /**
     * Set Custom TLS data switch
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param CustomTlsStatus Custom TLS data switch
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setCustomTlsStatus(String CustomTlsStatus) {
        this.CustomTlsStatus = CustomTlsStatus;
    }

    /**
     * Get Specifies the TLS version. Valid values: `TLSv1`, `TLSV1.1`, `TLSV1.2`, and `TLSv1.3`. Only consecutive versions can be enabled at the same time.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return TlsVersion Specifies the TLS version. Valid values: `TLSv1`, `TLSV1.1`, `TLSV1.2`, and `TLSv1.3`. Only consecutive versions can be enabled at the same time.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String [] getTlsVersion() {
        return this.TlsVersion;
    }

    /**
     * Set Specifies the TLS version. Valid values: `TLSv1`, `TLSV1.1`, `TLSV1.2`, and `TLSv1.3`. Only consecutive versions can be enabled at the same time.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param TlsVersion Specifies the TLS version. Valid values: `TLSv1`, `TLSV1.1`, `TLSV1.2`, and `TLSv1.3`. Only consecutive versions can be enabled at the same time.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setTlsVersion(String [] TlsVersion) {
        this.TlsVersion = TlsVersion;
    }

    /**
     * Get Custom encryption suite
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Cipher Custom encryption suite
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getCipher() {
        return this.Cipher;
    }

    /**
     * Set Custom encryption suite
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Cipher Custom encryption suite
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setCipher(String Cipher) {
        this.Cipher = Cipher;
    }

    /**
     * Get Origin authentication type
`off`: disable authentication
`oneWay`: authenticate the origin 
`twoWay`: two-way authentication
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return VerifyOriginType Origin authentication type
`off`: disable authentication
`oneWay`: authenticate the origin 
`twoWay`: two-way authentication
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getVerifyOriginType() {
        return this.VerifyOriginType;
    }

    /**
     * Set Origin authentication type
`off`: disable authentication
`oneWay`: authenticate the origin 
`twoWay`: two-way authentication
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param VerifyOriginType Origin authentication type
`off`: disable authentication
`oneWay`: authenticate the origin 
`twoWay`: two-way authentication
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setVerifyOriginType(String VerifyOriginType) {
        this.VerifyOriginType = VerifyOriginType;
    }

    /**
     * Get Information of the origin-pull certificate
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return CertInfo Information of the origin-pull certificate
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public ServerCert getCertInfo() {
        return this.CertInfo;
    }

    /**
     * Set Information of the origin-pull certificate
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param CertInfo Information of the origin-pull certificate
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setCertInfo(ServerCert CertInfo) {
        this.CertInfo = CertInfo;
    }

    /**
     * Get Information of the origin server certificate
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return OriginCertInfo Information of the origin server certificate
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public ClientCert getOriginCertInfo() {
        return this.OriginCertInfo;
    }

    /**
     * Set Information of the origin server certificate
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param OriginCertInfo Information of the origin server certificate
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setOriginCertInfo(ClientCert OriginCertInfo) {
        this.OriginCertInfo = OriginCertInfo;
    }

    public AdvanceHttps() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AdvanceHttps(AdvanceHttps source) {
        if (source.CustomTlsStatus != null) {
            this.CustomTlsStatus = new String(source.CustomTlsStatus);
        }
        if (source.TlsVersion != null) {
            this.TlsVersion = new String[source.TlsVersion.length];
            for (int i = 0; i < source.TlsVersion.length; i++) {
                this.TlsVersion[i] = new String(source.TlsVersion[i]);
            }
        }
        if (source.Cipher != null) {
            this.Cipher = new String(source.Cipher);
        }
        if (source.VerifyOriginType != null) {
            this.VerifyOriginType = new String(source.VerifyOriginType);
        }
        if (source.CertInfo != null) {
            this.CertInfo = new ServerCert(source.CertInfo);
        }
        if (source.OriginCertInfo != null) {
            this.OriginCertInfo = new ClientCert(source.OriginCertInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CustomTlsStatus", this.CustomTlsStatus);
        this.setParamArraySimple(map, prefix + "TlsVersion.", this.TlsVersion);
        this.setParamSimple(map, prefix + "Cipher", this.Cipher);
        this.setParamSimple(map, prefix + "VerifyOriginType", this.VerifyOriginType);
        this.setParamObj(map, prefix + "CertInfo.", this.CertInfo);
        this.setParamObj(map, prefix + "OriginCertInfo.", this.OriginCertInfo);

    }
}

