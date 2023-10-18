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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyHTTPSListenerAttributeRequest extends AbstractModel {

    /**
    * Listener ID
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * Connection ID. This field is required if using a single connection listener.
    */
    @SerializedName("ProxyId")
    @Expose
    private String ProxyId;

    /**
    * New listener name
    */
    @SerializedName("ListenerName")
    @Expose
    private String ListenerName;

    /**
    * Type of the protocol used in the forwarding from connections to origin servers
    */
    @SerializedName("ForwardProtocol")
    @Expose
    private String ForwardProtocol;

    /**
    * New listener server certificate ID
    */
    @SerializedName("CertificateId")
    @Expose
    private String CertificateId;

    /**
    * New listener client certificate ID
    */
    @SerializedName("ClientCertificateId")
    @Expose
    private String ClientCertificateId;

    /**
    * Client certificate ID of the listener after modification, which is a new field.
    */
    @SerializedName("PolyClientCertificateIds")
    @Expose
    private String [] PolyClientCertificateIds;

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
     * Get Connection ID. This field is required if using a single connection listener. 
     * @return ProxyId Connection ID. This field is required if using a single connection listener.
     */
    public String getProxyId() {
        return this.ProxyId;
    }

    /**
     * Set Connection ID. This field is required if using a single connection listener.
     * @param ProxyId Connection ID. This field is required if using a single connection listener.
     */
    public void setProxyId(String ProxyId) {
        this.ProxyId = ProxyId;
    }

    /**
     * Get New listener name 
     * @return ListenerName New listener name
     */
    public String getListenerName() {
        return this.ListenerName;
    }

    /**
     * Set New listener name
     * @param ListenerName New listener name
     */
    public void setListenerName(String ListenerName) {
        this.ListenerName = ListenerName;
    }

    /**
     * Get Type of the protocol used in the forwarding from connections to origin servers 
     * @return ForwardProtocol Type of the protocol used in the forwarding from connections to origin servers
     */
    public String getForwardProtocol() {
        return this.ForwardProtocol;
    }

    /**
     * Set Type of the protocol used in the forwarding from connections to origin servers
     * @param ForwardProtocol Type of the protocol used in the forwarding from connections to origin servers
     */
    public void setForwardProtocol(String ForwardProtocol) {
        this.ForwardProtocol = ForwardProtocol;
    }

    /**
     * Get New listener server certificate ID 
     * @return CertificateId New listener server certificate ID
     */
    public String getCertificateId() {
        return this.CertificateId;
    }

    /**
     * Set New listener server certificate ID
     * @param CertificateId New listener server certificate ID
     */
    public void setCertificateId(String CertificateId) {
        this.CertificateId = CertificateId;
    }

    /**
     * Get New listener client certificate ID 
     * @return ClientCertificateId New listener client certificate ID
     */
    public String getClientCertificateId() {
        return this.ClientCertificateId;
    }

    /**
     * Set New listener client certificate ID
     * @param ClientCertificateId New listener client certificate ID
     */
    public void setClientCertificateId(String ClientCertificateId) {
        this.ClientCertificateId = ClientCertificateId;
    }

    /**
     * Get Client certificate ID of the listener after modification, which is a new field. 
     * @return PolyClientCertificateIds Client certificate ID of the listener after modification, which is a new field.
     */
    public String [] getPolyClientCertificateIds() {
        return this.PolyClientCertificateIds;
    }

    /**
     * Set Client certificate ID of the listener after modification, which is a new field.
     * @param PolyClientCertificateIds Client certificate ID of the listener after modification, which is a new field.
     */
    public void setPolyClientCertificateIds(String [] PolyClientCertificateIds) {
        this.PolyClientCertificateIds = PolyClientCertificateIds;
    }

    public ModifyHTTPSListenerAttributeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyHTTPSListenerAttributeRequest(ModifyHTTPSListenerAttributeRequest source) {
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.ProxyId != null) {
            this.ProxyId = new String(source.ProxyId);
        }
        if (source.ListenerName != null) {
            this.ListenerName = new String(source.ListenerName);
        }
        if (source.ForwardProtocol != null) {
            this.ForwardProtocol = new String(source.ForwardProtocol);
        }
        if (source.CertificateId != null) {
            this.CertificateId = new String(source.CertificateId);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "ProxyId", this.ProxyId);
        this.setParamSimple(map, prefix + "ListenerName", this.ListenerName);
        this.setParamSimple(map, prefix + "ForwardProtocol", this.ForwardProtocol);
        this.setParamSimple(map, prefix + "CertificateId", this.CertificateId);
        this.setParamSimple(map, prefix + "ClientCertificateId", this.ClientCertificateId);
        this.setParamArraySimple(map, prefix + "PolyClientCertificateIds.", this.PolyClientCertificateIds);

    }
}

