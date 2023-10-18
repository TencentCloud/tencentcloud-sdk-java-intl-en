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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyLiveDomainCertBindingsRequest extends AbstractModel {

    /**
    * The playback domains to bind and whether to enable HTTPS for them.
If neither `CloudCertId` nor the public/private key is specified, and a domain is already bound with a certificate, this API will only update the HTTPS configuration of the domain and, if the certificate is a self-owned certificate, upload it to Tencent Cloud.
    */
    @SerializedName("DomainInfos")
    @Expose
    private LiveCertDomainInfo [] DomainInfos;

    /**
    * The SSL certificate ID assigned by Tencent Cloud.
For details, see https://intl.cloud.tencent.com/document/api/400/41665?from_cn_redirect=1
    */
    @SerializedName("CloudCertId")
    @Expose
    private String CloudCertId;

    /**
    * The public key of the certificate.
You can specify either `CloudCertId` or the public/private key. If both are specified, the private and public key parameters will be ignored. If you pass in only the public and private keys, the corresponding certificate will be uploaded to Tencent Cloud SSL Certificate Service, which will generate a `CloudCertId` for the certificate.
    */
    @SerializedName("CertificatePublicKey")
    @Expose
    private String CertificatePublicKey;

    /**
    * The private key of the certificate.
You can specify either `CloudCertId` or the public/private key. If both are specified, the private and public key parameters will be ignored. If you pass in only the public and private keys, the corresponding certificate will be uploaded to Tencent Cloud SSL Certificate Service, which will generate a `CloudCertId` for the certificate.
    */
    @SerializedName("CertificatePrivateKey")
    @Expose
    private String CertificatePrivateKey;

    /**
    * The remarks for the certificate in Tencent Cloud SSL Certificate Service. This parameter will be ignored if `CloudCertId` is specified.
    */
    @SerializedName("CertificateAlias")
    @Expose
    private String CertificateAlias;

    /**
     * Get The playback domains to bind and whether to enable HTTPS for them.
If neither `CloudCertId` nor the public/private key is specified, and a domain is already bound with a certificate, this API will only update the HTTPS configuration of the domain and, if the certificate is a self-owned certificate, upload it to Tencent Cloud. 
     * @return DomainInfos The playback domains to bind and whether to enable HTTPS for them.
If neither `CloudCertId` nor the public/private key is specified, and a domain is already bound with a certificate, this API will only update the HTTPS configuration of the domain and, if the certificate is a self-owned certificate, upload it to Tencent Cloud.
     */
    public LiveCertDomainInfo [] getDomainInfos() {
        return this.DomainInfos;
    }

    /**
     * Set The playback domains to bind and whether to enable HTTPS for them.
If neither `CloudCertId` nor the public/private key is specified, and a domain is already bound with a certificate, this API will only update the HTTPS configuration of the domain and, if the certificate is a self-owned certificate, upload it to Tencent Cloud.
     * @param DomainInfos The playback domains to bind and whether to enable HTTPS for them.
If neither `CloudCertId` nor the public/private key is specified, and a domain is already bound with a certificate, this API will only update the HTTPS configuration of the domain and, if the certificate is a self-owned certificate, upload it to Tencent Cloud.
     */
    public void setDomainInfos(LiveCertDomainInfo [] DomainInfos) {
        this.DomainInfos = DomainInfos;
    }

    /**
     * Get The SSL certificate ID assigned by Tencent Cloud.
For details, see https://intl.cloud.tencent.com/document/api/400/41665?from_cn_redirect=1 
     * @return CloudCertId The SSL certificate ID assigned by Tencent Cloud.
For details, see https://intl.cloud.tencent.com/document/api/400/41665?from_cn_redirect=1
     */
    public String getCloudCertId() {
        return this.CloudCertId;
    }

    /**
     * Set The SSL certificate ID assigned by Tencent Cloud.
For details, see https://intl.cloud.tencent.com/document/api/400/41665?from_cn_redirect=1
     * @param CloudCertId The SSL certificate ID assigned by Tencent Cloud.
For details, see https://intl.cloud.tencent.com/document/api/400/41665?from_cn_redirect=1
     */
    public void setCloudCertId(String CloudCertId) {
        this.CloudCertId = CloudCertId;
    }

    /**
     * Get The public key of the certificate.
You can specify either `CloudCertId` or the public/private key. If both are specified, the private and public key parameters will be ignored. If you pass in only the public and private keys, the corresponding certificate will be uploaded to Tencent Cloud SSL Certificate Service, which will generate a `CloudCertId` for the certificate. 
     * @return CertificatePublicKey The public key of the certificate.
You can specify either `CloudCertId` or the public/private key. If both are specified, the private and public key parameters will be ignored. If you pass in only the public and private keys, the corresponding certificate will be uploaded to Tencent Cloud SSL Certificate Service, which will generate a `CloudCertId` for the certificate.
     */
    public String getCertificatePublicKey() {
        return this.CertificatePublicKey;
    }

    /**
     * Set The public key of the certificate.
You can specify either `CloudCertId` or the public/private key. If both are specified, the private and public key parameters will be ignored. If you pass in only the public and private keys, the corresponding certificate will be uploaded to Tencent Cloud SSL Certificate Service, which will generate a `CloudCertId` for the certificate.
     * @param CertificatePublicKey The public key of the certificate.
You can specify either `CloudCertId` or the public/private key. If both are specified, the private and public key parameters will be ignored. If you pass in only the public and private keys, the corresponding certificate will be uploaded to Tencent Cloud SSL Certificate Service, which will generate a `CloudCertId` for the certificate.
     */
    public void setCertificatePublicKey(String CertificatePublicKey) {
        this.CertificatePublicKey = CertificatePublicKey;
    }

    /**
     * Get The private key of the certificate.
You can specify either `CloudCertId` or the public/private key. If both are specified, the private and public key parameters will be ignored. If you pass in only the public and private keys, the corresponding certificate will be uploaded to Tencent Cloud SSL Certificate Service, which will generate a `CloudCertId` for the certificate. 
     * @return CertificatePrivateKey The private key of the certificate.
You can specify either `CloudCertId` or the public/private key. If both are specified, the private and public key parameters will be ignored. If you pass in only the public and private keys, the corresponding certificate will be uploaded to Tencent Cloud SSL Certificate Service, which will generate a `CloudCertId` for the certificate.
     */
    public String getCertificatePrivateKey() {
        return this.CertificatePrivateKey;
    }

    /**
     * Set The private key of the certificate.
You can specify either `CloudCertId` or the public/private key. If both are specified, the private and public key parameters will be ignored. If you pass in only the public and private keys, the corresponding certificate will be uploaded to Tencent Cloud SSL Certificate Service, which will generate a `CloudCertId` for the certificate.
     * @param CertificatePrivateKey The private key of the certificate.
You can specify either `CloudCertId` or the public/private key. If both are specified, the private and public key parameters will be ignored. If you pass in only the public and private keys, the corresponding certificate will be uploaded to Tencent Cloud SSL Certificate Service, which will generate a `CloudCertId` for the certificate.
     */
    public void setCertificatePrivateKey(String CertificatePrivateKey) {
        this.CertificatePrivateKey = CertificatePrivateKey;
    }

    /**
     * Get The remarks for the certificate in Tencent Cloud SSL Certificate Service. This parameter will be ignored if `CloudCertId` is specified. 
     * @return CertificateAlias The remarks for the certificate in Tencent Cloud SSL Certificate Service. This parameter will be ignored if `CloudCertId` is specified.
     */
    public String getCertificateAlias() {
        return this.CertificateAlias;
    }

    /**
     * Set The remarks for the certificate in Tencent Cloud SSL Certificate Service. This parameter will be ignored if `CloudCertId` is specified.
     * @param CertificateAlias The remarks for the certificate in Tencent Cloud SSL Certificate Service. This parameter will be ignored if `CloudCertId` is specified.
     */
    public void setCertificateAlias(String CertificateAlias) {
        this.CertificateAlias = CertificateAlias;
    }

    public ModifyLiveDomainCertBindingsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyLiveDomainCertBindingsRequest(ModifyLiveDomainCertBindingsRequest source) {
        if (source.DomainInfos != null) {
            this.DomainInfos = new LiveCertDomainInfo[source.DomainInfos.length];
            for (int i = 0; i < source.DomainInfos.length; i++) {
                this.DomainInfos[i] = new LiveCertDomainInfo(source.DomainInfos[i]);
            }
        }
        if (source.CloudCertId != null) {
            this.CloudCertId = new String(source.CloudCertId);
        }
        if (source.CertificatePublicKey != null) {
            this.CertificatePublicKey = new String(source.CertificatePublicKey);
        }
        if (source.CertificatePrivateKey != null) {
            this.CertificatePrivateKey = new String(source.CertificatePrivateKey);
        }
        if (source.CertificateAlias != null) {
            this.CertificateAlias = new String(source.CertificateAlias);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "DomainInfos.", this.DomainInfos);
        this.setParamSimple(map, prefix + "CloudCertId", this.CloudCertId);
        this.setParamSimple(map, prefix + "CertificatePublicKey", this.CertificatePublicKey);
        this.setParamSimple(map, prefix + "CertificatePrivateKey", this.CertificatePrivateKey);
        this.setParamSimple(map, prefix + "CertificateAlias", this.CertificateAlias);

    }
}

