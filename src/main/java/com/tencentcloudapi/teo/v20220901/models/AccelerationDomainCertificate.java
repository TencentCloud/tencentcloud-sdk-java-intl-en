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

public class AccelerationDomainCertificate extends AbstractModel {

    /**
    * Certificate configuration mode. Values: <li>`disable`: Do not configure the certificate;</li><li>`eofreecert`: Use a free certificate provided by EdgeOne; </li><li>`sslcert`: Configure an SSL certificate.</li>
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * List of server certificates. The relevant certificates are deployed on the entrance side of the EO.
Note: This field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("List")
    @Expose
    private CertificateInfo [] List;

    /**
    * In the edge mutual authentication scenario, this field represents the client's CA certificate, which is deployed inside the EO node and used for EO node authentication of the client certificate.
    */
    @SerializedName("ClientCertInfo")
    @Expose
    private MutualTLS ClientCertInfo;

    /**
    * The certificate carried during EO node origin-pull is used when the origin server enables the mutual authentication handshake to validate the client certificate, ensuring that the request originates from a trusted EO node.
    */
    @SerializedName("UpstreamCertInfo")
    @Expose
    private UpstreamCertInfo UpstreamCertInfo;

    /**
     * Get Certificate configuration mode. Values: <li>`disable`: Do not configure the certificate;</li><li>`eofreecert`: Use a free certificate provided by EdgeOne; </li><li>`sslcert`: Configure an SSL certificate.</li> 
     * @return Mode Certificate configuration mode. Values: <li>`disable`: Do not configure the certificate;</li><li>`eofreecert`: Use a free certificate provided by EdgeOne; </li><li>`sslcert`: Configure an SSL certificate.</li>
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set Certificate configuration mode. Values: <li>`disable`: Do not configure the certificate;</li><li>`eofreecert`: Use a free certificate provided by EdgeOne; </li><li>`sslcert`: Configure an SSL certificate.</li>
     * @param Mode Certificate configuration mode. Values: <li>`disable`: Do not configure the certificate;</li><li>`eofreecert`: Use a free certificate provided by EdgeOne; </li><li>`sslcert`: Configure an SSL certificate.</li>
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get List of server certificates. The relevant certificates are deployed on the entrance side of the EO.
Note: This field may return null, which indicates a failure to obtain a valid value. 
     * @return List List of server certificates. The relevant certificates are deployed on the entrance side of the EO.
Note: This field may return null, which indicates a failure to obtain a valid value.
     */
    public CertificateInfo [] getList() {
        return this.List;
    }

    /**
     * Set List of server certificates. The relevant certificates are deployed on the entrance side of the EO.
Note: This field may return null, which indicates a failure to obtain a valid value.
     * @param List List of server certificates. The relevant certificates are deployed on the entrance side of the EO.
Note: This field may return null, which indicates a failure to obtain a valid value.
     */
    public void setList(CertificateInfo [] List) {
        this.List = List;
    }

    /**
     * Get In the edge mutual authentication scenario, this field represents the client's CA certificate, which is deployed inside the EO node and used for EO node authentication of the client certificate. 
     * @return ClientCertInfo In the edge mutual authentication scenario, this field represents the client's CA certificate, which is deployed inside the EO node and used for EO node authentication of the client certificate.
     */
    public MutualTLS getClientCertInfo() {
        return this.ClientCertInfo;
    }

    /**
     * Set In the edge mutual authentication scenario, this field represents the client's CA certificate, which is deployed inside the EO node and used for EO node authentication of the client certificate.
     * @param ClientCertInfo In the edge mutual authentication scenario, this field represents the client's CA certificate, which is deployed inside the EO node and used for EO node authentication of the client certificate.
     */
    public void setClientCertInfo(MutualTLS ClientCertInfo) {
        this.ClientCertInfo = ClientCertInfo;
    }

    /**
     * Get The certificate carried during EO node origin-pull is used when the origin server enables the mutual authentication handshake to validate the client certificate, ensuring that the request originates from a trusted EO node. 
     * @return UpstreamCertInfo The certificate carried during EO node origin-pull is used when the origin server enables the mutual authentication handshake to validate the client certificate, ensuring that the request originates from a trusted EO node.
     */
    public UpstreamCertInfo getUpstreamCertInfo() {
        return this.UpstreamCertInfo;
    }

    /**
     * Set The certificate carried during EO node origin-pull is used when the origin server enables the mutual authentication handshake to validate the client certificate, ensuring that the request originates from a trusted EO node.
     * @param UpstreamCertInfo The certificate carried during EO node origin-pull is used when the origin server enables the mutual authentication handshake to validate the client certificate, ensuring that the request originates from a trusted EO node.
     */
    public void setUpstreamCertInfo(UpstreamCertInfo UpstreamCertInfo) {
        this.UpstreamCertInfo = UpstreamCertInfo;
    }

    public AccelerationDomainCertificate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AccelerationDomainCertificate(AccelerationDomainCertificate source) {
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.List != null) {
            this.List = new CertificateInfo[source.List.length];
            for (int i = 0; i < source.List.length; i++) {
                this.List[i] = new CertificateInfo(source.List[i]);
            }
        }
        if (source.ClientCertInfo != null) {
            this.ClientCertInfo = new MutualTLS(source.ClientCertInfo);
        }
        if (source.UpstreamCertInfo != null) {
            this.UpstreamCertInfo = new UpstreamCertInfo(source.UpstreamCertInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamArrayObj(map, prefix + "List.", this.List);
        this.setParamObj(map, prefix + "ClientCertInfo.", this.ClientCertInfo);
        this.setParamObj(map, prefix + "UpstreamCertInfo.", this.UpstreamCertInfo);

    }
}

