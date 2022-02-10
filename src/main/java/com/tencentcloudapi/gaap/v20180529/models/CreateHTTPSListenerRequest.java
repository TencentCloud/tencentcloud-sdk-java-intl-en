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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateHTTPSListenerRequest extends AbstractModel{

    /**
    * Listener name
    */
    @SerializedName("ListenerName")
    @Expose
    private String ListenerName;

    /**
    * Listener port, which is based on the listeners of same transport layer protocol (TCP or UDP). The port must be unique.
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * Server certificate ID
    */
    @SerializedName("CertificateId")
    @Expose
    private String CertificateId;

    /**
    * Protocol types of the forwarding from acceleration connection to origin server: HTTP | HTTPS
    */
    @SerializedName("ForwardProtocol")
    @Expose
    private String ForwardProtocol;

    /**
    * Connection ID, which cannot be set together with `GroupId` at the same time. A listener will be created for the corresponding connection.
    */
    @SerializedName("ProxyId")
    @Expose
    private String ProxyId;

    /**
    * Authentication type, where:
0: one-way authentication;
1: mutual authentication.
The one-way authentication is used by default.
    */
    @SerializedName("AuthType")
    @Expose
    private Long AuthType;

    /**
    * Client CA certificate ID, which is required only when the mutual authentication is adopted.
    */
    @SerializedName("ClientCertificateId")
    @Expose
    private String ClientCertificateId;

    /**
    * IDs of multiple new client CA certificates. This field or the `ClientCertificateId` field is required for mutual authentication only.
    */
    @SerializedName("PolyClientCertificateIds")
    @Expose
    private String [] PolyClientCertificateIds;

    /**
    * Connection group ID, which cannot be set together with `ProxyId` at the same time. A listener will be created for the corresponding connection group.
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * Specifies whether to enable HTTP3. Valid values:
`0`: disable HTTP3;
`1`: enable HTTP3.
Note: If HTTP3 is enabled for a connection, the listener will use the port that is originally accessed to UDP, and a UDP listener with the same port cannot be created.
After the connection is created, you cannot change your HTTP3 setting.
    */
    @SerializedName("Http3Supported")
    @Expose
    private Long Http3Supported;

    /**
     * Get Listener name 
     * @return ListenerName Listener name
     */
    public String getListenerName() {
        return this.ListenerName;
    }

    /**
     * Set Listener name
     * @param ListenerName Listener name
     */
    public void setListenerName(String ListenerName) {
        this.ListenerName = ListenerName;
    }

    /**
     * Get Listener port, which is based on the listeners of same transport layer protocol (TCP or UDP). The port must be unique. 
     * @return Port Listener port, which is based on the listeners of same transport layer protocol (TCP or UDP). The port must be unique.
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set Listener port, which is based on the listeners of same transport layer protocol (TCP or UDP). The port must be unique.
     * @param Port Listener port, which is based on the listeners of same transport layer protocol (TCP or UDP). The port must be unique.
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get Server certificate ID 
     * @return CertificateId Server certificate ID
     */
    public String getCertificateId() {
        return this.CertificateId;
    }

    /**
     * Set Server certificate ID
     * @param CertificateId Server certificate ID
     */
    public void setCertificateId(String CertificateId) {
        this.CertificateId = CertificateId;
    }

    /**
     * Get Protocol types of the forwarding from acceleration connection to origin server: HTTP | HTTPS 
     * @return ForwardProtocol Protocol types of the forwarding from acceleration connection to origin server: HTTP | HTTPS
     */
    public String getForwardProtocol() {
        return this.ForwardProtocol;
    }

    /**
     * Set Protocol types of the forwarding from acceleration connection to origin server: HTTP | HTTPS
     * @param ForwardProtocol Protocol types of the forwarding from acceleration connection to origin server: HTTP | HTTPS
     */
    public void setForwardProtocol(String ForwardProtocol) {
        this.ForwardProtocol = ForwardProtocol;
    }

    /**
     * Get Connection ID, which cannot be set together with `GroupId` at the same time. A listener will be created for the corresponding connection. 
     * @return ProxyId Connection ID, which cannot be set together with `GroupId` at the same time. A listener will be created for the corresponding connection.
     */
    public String getProxyId() {
        return this.ProxyId;
    }

    /**
     * Set Connection ID, which cannot be set together with `GroupId` at the same time. A listener will be created for the corresponding connection.
     * @param ProxyId Connection ID, which cannot be set together with `GroupId` at the same time. A listener will be created for the corresponding connection.
     */
    public void setProxyId(String ProxyId) {
        this.ProxyId = ProxyId;
    }

    /**
     * Get Authentication type, where:
0: one-way authentication;
1: mutual authentication.
The one-way authentication is used by default. 
     * @return AuthType Authentication type, where:
0: one-way authentication;
1: mutual authentication.
The one-way authentication is used by default.
     */
    public Long getAuthType() {
        return this.AuthType;
    }

    /**
     * Set Authentication type, where:
0: one-way authentication;
1: mutual authentication.
The one-way authentication is used by default.
     * @param AuthType Authentication type, where:
0: one-way authentication;
1: mutual authentication.
The one-way authentication is used by default.
     */
    public void setAuthType(Long AuthType) {
        this.AuthType = AuthType;
    }

    /**
     * Get Client CA certificate ID, which is required only when the mutual authentication is adopted. 
     * @return ClientCertificateId Client CA certificate ID, which is required only when the mutual authentication is adopted.
     */
    public String getClientCertificateId() {
        return this.ClientCertificateId;
    }

    /**
     * Set Client CA certificate ID, which is required only when the mutual authentication is adopted.
     * @param ClientCertificateId Client CA certificate ID, which is required only when the mutual authentication is adopted.
     */
    public void setClientCertificateId(String ClientCertificateId) {
        this.ClientCertificateId = ClientCertificateId;
    }

    /**
     * Get IDs of multiple new client CA certificates. This field or the `ClientCertificateId` field is required for mutual authentication only. 
     * @return PolyClientCertificateIds IDs of multiple new client CA certificates. This field or the `ClientCertificateId` field is required for mutual authentication only.
     */
    public String [] getPolyClientCertificateIds() {
        return this.PolyClientCertificateIds;
    }

    /**
     * Set IDs of multiple new client CA certificates. This field or the `ClientCertificateId` field is required for mutual authentication only.
     * @param PolyClientCertificateIds IDs of multiple new client CA certificates. This field or the `ClientCertificateId` field is required for mutual authentication only.
     */
    public void setPolyClientCertificateIds(String [] PolyClientCertificateIds) {
        this.PolyClientCertificateIds = PolyClientCertificateIds;
    }

    /**
     * Get Connection group ID, which cannot be set together with `ProxyId` at the same time. A listener will be created for the corresponding connection group. 
     * @return GroupId Connection group ID, which cannot be set together with `ProxyId` at the same time. A listener will be created for the corresponding connection group.
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set Connection group ID, which cannot be set together with `ProxyId` at the same time. A listener will be created for the corresponding connection group.
     * @param GroupId Connection group ID, which cannot be set together with `ProxyId` at the same time. A listener will be created for the corresponding connection group.
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get Specifies whether to enable HTTP3. Valid values:
`0`: disable HTTP3;
`1`: enable HTTP3.
Note: If HTTP3 is enabled for a connection, the listener will use the port that is originally accessed to UDP, and a UDP listener with the same port cannot be created.
After the connection is created, you cannot change your HTTP3 setting. 
     * @return Http3Supported Specifies whether to enable HTTP3. Valid values:
`0`: disable HTTP3;
`1`: enable HTTP3.
Note: If HTTP3 is enabled for a connection, the listener will use the port that is originally accessed to UDP, and a UDP listener with the same port cannot be created.
After the connection is created, you cannot change your HTTP3 setting.
     */
    public Long getHttp3Supported() {
        return this.Http3Supported;
    }

    /**
     * Set Specifies whether to enable HTTP3. Valid values:
`0`: disable HTTP3;
`1`: enable HTTP3.
Note: If HTTP3 is enabled for a connection, the listener will use the port that is originally accessed to UDP, and a UDP listener with the same port cannot be created.
After the connection is created, you cannot change your HTTP3 setting.
     * @param Http3Supported Specifies whether to enable HTTP3. Valid values:
`0`: disable HTTP3;
`1`: enable HTTP3.
Note: If HTTP3 is enabled for a connection, the listener will use the port that is originally accessed to UDP, and a UDP listener with the same port cannot be created.
After the connection is created, you cannot change your HTTP3 setting.
     */
    public void setHttp3Supported(Long Http3Supported) {
        this.Http3Supported = Http3Supported;
    }

    public CreateHTTPSListenerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateHTTPSListenerRequest(CreateHTTPSListenerRequest source) {
        if (source.ListenerName != null) {
            this.ListenerName = new String(source.ListenerName);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.CertificateId != null) {
            this.CertificateId = new String(source.CertificateId);
        }
        if (source.ForwardProtocol != null) {
            this.ForwardProtocol = new String(source.ForwardProtocol);
        }
        if (source.ProxyId != null) {
            this.ProxyId = new String(source.ProxyId);
        }
        if (source.AuthType != null) {
            this.AuthType = new Long(source.AuthType);
        }
        if (source.ClientCertificateId != null) {
            this.ClientCertificateId = new String(source.ClientCertificateId);
        }
        if (source.PolyClientCertificateIds != null) {
            this.PolyClientCertificateIds = new String[source.PolyClientCertificateIds.length];
            for (int i = 0; i < source.PolyClientCertificateIds.length; i++) {
                this.PolyClientCertificateIds[i] = new String(source.PolyClientCertificateIds[i]);
            }
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.Http3Supported != null) {
            this.Http3Supported = new Long(source.Http3Supported);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ListenerName", this.ListenerName);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "CertificateId", this.CertificateId);
        this.setParamSimple(map, prefix + "ForwardProtocol", this.ForwardProtocol);
        this.setParamSimple(map, prefix + "ProxyId", this.ProxyId);
        this.setParamSimple(map, prefix + "AuthType", this.AuthType);
        this.setParamSimple(map, prefix + "ClientCertificateId", this.ClientCertificateId);
        this.setParamArraySimple(map, prefix + "PolyClientCertificateIds.", this.PolyClientCertificateIds);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "Http3Supported", this.Http3Supported);

    }
}

