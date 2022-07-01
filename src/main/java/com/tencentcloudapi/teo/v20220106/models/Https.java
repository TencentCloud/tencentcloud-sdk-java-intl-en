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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Https extends AbstractModel{

    /**
    * HTTP2 configuration switch
`on`: Enable
`off`: Disable
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Http2")
    @Expose
    private String Http2;

    /**
    * OCSP configuration switch
`on`: Enable
`off`: Disable
It is disabled by default.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("OcspStapling")
    @Expose
    private String OcspStapling;

    /**
    * TLS version settings. Valid values: `TLSv1`, `TLSV1.1`, `TLSV1.2`, and `TLSv1.3`. Only consecutive versions can be enabled at the same time.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("TlsVersion")
    @Expose
    private String [] TlsVersion;

    /**
    * HSTS Configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Hsts")
    @Expose
    private Hsts Hsts;

    /**
     * Get HTTP2 configuration switch
`on`: Enable
`off`: Disable
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return Http2 HTTP2 configuration switch
`on`: Enable
`off`: Disable
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getHttp2() {
        return this.Http2;
    }

    /**
     * Set HTTP2 configuration switch
`on`: Enable
`off`: Disable
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param Http2 HTTP2 configuration switch
`on`: Enable
`off`: Disable
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setHttp2(String Http2) {
        this.Http2 = Http2;
    }

    /**
     * Get OCSP configuration switch
`on`: Enable
`off`: Disable
It is disabled by default.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return OcspStapling OCSP configuration switch
`on`: Enable
`off`: Disable
It is disabled by default.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getOcspStapling() {
        return this.OcspStapling;
    }

    /**
     * Set OCSP configuration switch
`on`: Enable
`off`: Disable
It is disabled by default.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param OcspStapling OCSP configuration switch
`on`: Enable
`off`: Disable
It is disabled by default.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setOcspStapling(String OcspStapling) {
        this.OcspStapling = OcspStapling;
    }

    /**
     * Get TLS version settings. Valid values: `TLSv1`, `TLSV1.1`, `TLSV1.2`, and `TLSv1.3`. Only consecutive versions can be enabled at the same time.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return TlsVersion TLS version settings. Valid values: `TLSv1`, `TLSV1.1`, `TLSV1.2`, and `TLSv1.3`. Only consecutive versions can be enabled at the same time.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String [] getTlsVersion() {
        return this.TlsVersion;
    }

    /**
     * Set TLS version settings. Valid values: `TLSv1`, `TLSV1.1`, `TLSV1.2`, and `TLSv1.3`. Only consecutive versions can be enabled at the same time.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param TlsVersion TLS version settings. Valid values: `TLSv1`, `TLSV1.1`, `TLSV1.2`, and `TLSv1.3`. Only consecutive versions can be enabled at the same time.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setTlsVersion(String [] TlsVersion) {
        this.TlsVersion = TlsVersion;
    }

    /**
     * Get HSTS Configuration
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return Hsts HSTS Configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Hsts getHsts() {
        return this.Hsts;
    }

    /**
     * Set HSTS Configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param Hsts HSTS Configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setHsts(Hsts Hsts) {
        this.Hsts = Hsts;
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Http2", this.Http2);
        this.setParamSimple(map, prefix + "OcspStapling", this.OcspStapling);
        this.setParamArraySimple(map, prefix + "TlsVersion.", this.TlsVersion);
        this.setParamObj(map, prefix + "Hsts.", this.Hsts);

    }
}

