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
    * 
    */
    @SerializedName("CustomTlsStatus")
    @Expose
    private String CustomTlsStatus;

    /**
    * 
    */
    @SerializedName("TlsVersion")
    @Expose
    private String [] TlsVersion;

    /**
    * 
    */
    @SerializedName("Cipher")
    @Expose
    private String Cipher;

    /**
    * 
    */
    @SerializedName("VerifyOriginType")
    @Expose
    private String VerifyOriginType;

    /**
    * 
    */
    @SerializedName("CertInfo")
    @Expose
    private ServerCert CertInfo;

    /**
    * 
    */
    @SerializedName("OriginCertInfo")
    @Expose
    private ClientCert OriginCertInfo;

    /**
     * Get  
     * @return CustomTlsStatus 
     */
    public String getCustomTlsStatus() {
        return this.CustomTlsStatus;
    }

    /**
     * Set 
     * @param CustomTlsStatus 
     */
    public void setCustomTlsStatus(String CustomTlsStatus) {
        this.CustomTlsStatus = CustomTlsStatus;
    }

    /**
     * Get  
     * @return TlsVersion 
     */
    public String [] getTlsVersion() {
        return this.TlsVersion;
    }

    /**
     * Set 
     * @param TlsVersion 
     */
    public void setTlsVersion(String [] TlsVersion) {
        this.TlsVersion = TlsVersion;
    }

    /**
     * Get  
     * @return Cipher 
     */
    public String getCipher() {
        return this.Cipher;
    }

    /**
     * Set 
     * @param Cipher 
     */
    public void setCipher(String Cipher) {
        this.Cipher = Cipher;
    }

    /**
     * Get  
     * @return VerifyOriginType 
     */
    public String getVerifyOriginType() {
        return this.VerifyOriginType;
    }

    /**
     * Set 
     * @param VerifyOriginType 
     */
    public void setVerifyOriginType(String VerifyOriginType) {
        this.VerifyOriginType = VerifyOriginType;
    }

    /**
     * Get  
     * @return CertInfo 
     */
    public ServerCert getCertInfo() {
        return this.CertInfo;
    }

    /**
     * Set 
     * @param CertInfo 
     */
    public void setCertInfo(ServerCert CertInfo) {
        this.CertInfo = CertInfo;
    }

    /**
     * Get  
     * @return OriginCertInfo 
     */
    public ClientCert getOriginCertInfo() {
        return this.OriginCertInfo;
    }

    /**
     * Set 
     * @param OriginCertInfo 
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

