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

public class HTTPSListener extends AbstractModel{

    /**
    * Listener ID
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * Listener name
    */
    @SerializedName("ListenerName")
    @Expose
    private String ListenerName;

    /**
    * Listener port
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * Listener protocol. The value is `HTTP`.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Listener status:
0: running;
1: creating;
2: terminating;
3: adjusting origin server;
4: modifying configuration.
    */
    @SerializedName("ListenerStatus")
    @Expose
    private Long ListenerStatus;

    /**
    * Server SSL certificate ID of the listener
    */
    @SerializedName("CertificateId")
    @Expose
    private String CertificateId;

    /**
    * Protocol used in the forwarding from connections to origin servers
    */
    @SerializedName("ForwardProtocol")
    @Expose
    private String ForwardProtocol;

    /**
    * Listener creation time; using UNIX timestamp.
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * Server SSL certificate alias
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CertificateAlias")
    @Expose
    private String CertificateAlias;

    /**
    * Client CA certificate ID of the listener
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ClientCertificateId")
    @Expose
    private String ClientCertificateId;

    /**
    * Listener authentication method:
0: one-way authentication;
1: mutual authentication.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AuthType")
    @Expose
    private Long AuthType;

    /**
    * Client CA certificate alias
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ClientCertificateAlias")
    @Expose
    private String ClientCertificateAlias;

    /**
    * Alias information of multiple client CA certificates.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PolyClientCertificateAliasInfo")
    @Expose
    private CertificateAliasInfo [] PolyClientCertificateAliasInfo;

    /**
     * Get Listener ID 
     * @return ListenerId Listener ID
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set Listener ID
     * @param ListenerId Listener ID
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

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
     * Get Listener port 
     * @return Port Listener port
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set Listener port
     * @param Port Listener port
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get Listener protocol. The value is `HTTP`. 
     * @return Protocol Listener protocol. The value is `HTTP`.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Listener protocol. The value is `HTTP`.
     * @param Protocol Listener protocol. The value is `HTTP`.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Listener status:
0: running;
1: creating;
2: terminating;
3: adjusting origin server;
4: modifying configuration. 
     * @return ListenerStatus Listener status:
0: running;
1: creating;
2: terminating;
3: adjusting origin server;
4: modifying configuration.
     */
    public Long getListenerStatus() {
        return this.ListenerStatus;
    }

    /**
     * Set Listener status:
0: running;
1: creating;
2: terminating;
3: adjusting origin server;
4: modifying configuration.
     * @param ListenerStatus Listener status:
0: running;
1: creating;
2: terminating;
3: adjusting origin server;
4: modifying configuration.
     */
    public void setListenerStatus(Long ListenerStatus) {
        this.ListenerStatus = ListenerStatus;
    }

    /**
     * Get Server SSL certificate ID of the listener 
     * @return CertificateId Server SSL certificate ID of the listener
     */
    public String getCertificateId() {
        return this.CertificateId;
    }

    /**
     * Set Server SSL certificate ID of the listener
     * @param CertificateId Server SSL certificate ID of the listener
     */
    public void setCertificateId(String CertificateId) {
        this.CertificateId = CertificateId;
    }

    /**
     * Get Protocol used in the forwarding from connections to origin servers 
     * @return ForwardProtocol Protocol used in the forwarding from connections to origin servers
     */
    public String getForwardProtocol() {
        return this.ForwardProtocol;
    }

    /**
     * Set Protocol used in the forwarding from connections to origin servers
     * @param ForwardProtocol Protocol used in the forwarding from connections to origin servers
     */
    public void setForwardProtocol(String ForwardProtocol) {
        this.ForwardProtocol = ForwardProtocol;
    }

    /**
     * Get Listener creation time; using UNIX timestamp. 
     * @return CreateTime Listener creation time; using UNIX timestamp.
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Listener creation time; using UNIX timestamp.
     * @param CreateTime Listener creation time; using UNIX timestamp.
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Server SSL certificate alias
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CertificateAlias Server SSL certificate alias
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCertificateAlias() {
        return this.CertificateAlias;
    }

    /**
     * Set Server SSL certificate alias
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CertificateAlias Server SSL certificate alias
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCertificateAlias(String CertificateAlias) {
        this.CertificateAlias = CertificateAlias;
    }

    /**
     * Get Client CA certificate ID of the listener
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ClientCertificateId Client CA certificate ID of the listener
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getClientCertificateId() {
        return this.ClientCertificateId;
    }

    /**
     * Set Client CA certificate ID of the listener
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ClientCertificateId Client CA certificate ID of the listener
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setClientCertificateId(String ClientCertificateId) {
        this.ClientCertificateId = ClientCertificateId;
    }

    /**
     * Get Listener authentication method:
0: one-way authentication;
1: mutual authentication.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AuthType Listener authentication method:
0: one-way authentication;
1: mutual authentication.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getAuthType() {
        return this.AuthType;
    }

    /**
     * Set Listener authentication method:
0: one-way authentication;
1: mutual authentication.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AuthType Listener authentication method:
0: one-way authentication;
1: mutual authentication.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAuthType(Long AuthType) {
        this.AuthType = AuthType;
    }

    /**
     * Get Client CA certificate alias
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ClientCertificateAlias Client CA certificate alias
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getClientCertificateAlias() {
        return this.ClientCertificateAlias;
    }

    /**
     * Set Client CA certificate alias
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ClientCertificateAlias Client CA certificate alias
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setClientCertificateAlias(String ClientCertificateAlias) {
        this.ClientCertificateAlias = ClientCertificateAlias;
    }

    /**
     * Get Alias information of multiple client CA certificates.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PolyClientCertificateAliasInfo Alias information of multiple client CA certificates.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public CertificateAliasInfo [] getPolyClientCertificateAliasInfo() {
        return this.PolyClientCertificateAliasInfo;
    }

    /**
     * Set Alias information of multiple client CA certificates.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PolyClientCertificateAliasInfo Alias information of multiple client CA certificates.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPolyClientCertificateAliasInfo(CertificateAliasInfo [] PolyClientCertificateAliasInfo) {
        this.PolyClientCertificateAliasInfo = PolyClientCertificateAliasInfo;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "ListenerName", this.ListenerName);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "ListenerStatus", this.ListenerStatus);
        this.setParamSimple(map, prefix + "CertificateId", this.CertificateId);
        this.setParamSimple(map, prefix + "ForwardProtocol", this.ForwardProtocol);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "CertificateAlias", this.CertificateAlias);
        this.setParamSimple(map, prefix + "ClientCertificateId", this.ClientCertificateId);
        this.setParamSimple(map, prefix + "AuthType", this.AuthType);
        this.setParamSimple(map, prefix + "ClientCertificateAlias", this.ClientCertificateAlias);
        this.setParamArrayObj(map, prefix + "PolyClientCertificateAliasInfo.", this.PolyClientCertificateAliasInfo);

    }
}

