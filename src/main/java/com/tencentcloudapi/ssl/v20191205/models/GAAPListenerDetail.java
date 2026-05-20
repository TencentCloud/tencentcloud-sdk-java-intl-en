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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GAAPListenerDetail extends AbstractModel {

    /**
    * Listener status
    */
    @SerializedName("ListenerStatus")
    @Expose
    private String ListenerStatus;

    /**
    * listener ID
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * listener name
    */
    @SerializedName("ListenerName")
    @Expose
    private String ListenerName;

    /**
    * Mismatched domain name list
    */
    @SerializedName("NoMatchDomains")
    @Expose
    private String [] NoMatchDomains;

    /**
    * Certificate list associated with CVM instances	
    */
    @SerializedName("CertIdList")
    @Expose
    private String [] CertIdList;

    /**
    * Listener protocol
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
     * Get Listener status 
     * @return ListenerStatus Listener status
     */
    public String getListenerStatus() {
        return this.ListenerStatus;
    }

    /**
     * Set Listener status
     * @param ListenerStatus Listener status
     */
    public void setListenerStatus(String ListenerStatus) {
        this.ListenerStatus = ListenerStatus;
    }

    /**
     * Get listener ID 
     * @return ListenerId listener ID
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set listener ID
     * @param ListenerId listener ID
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get listener name 
     * @return ListenerName listener name
     */
    public String getListenerName() {
        return this.ListenerName;
    }

    /**
     * Set listener name
     * @param ListenerName listener name
     */
    public void setListenerName(String ListenerName) {
        this.ListenerName = ListenerName;
    }

    /**
     * Get Mismatched domain name list 
     * @return NoMatchDomains Mismatched domain name list
     */
    public String [] getNoMatchDomains() {
        return this.NoMatchDomains;
    }

    /**
     * Set Mismatched domain name list
     * @param NoMatchDomains Mismatched domain name list
     */
    public void setNoMatchDomains(String [] NoMatchDomains) {
        this.NoMatchDomains = NoMatchDomains;
    }

    /**
     * Get Certificate list associated with CVM instances	 
     * @return CertIdList Certificate list associated with CVM instances	
     */
    public String [] getCertIdList() {
        return this.CertIdList;
    }

    /**
     * Set Certificate list associated with CVM instances	
     * @param CertIdList Certificate list associated with CVM instances	
     */
    public void setCertIdList(String [] CertIdList) {
        this.CertIdList = CertIdList;
    }

    /**
     * Get Listener protocol 
     * @return Protocol Listener protocol
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Listener protocol
     * @param Protocol Listener protocol
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    public GAAPListenerDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GAAPListenerDetail(GAAPListenerDetail source) {
        if (source.ListenerStatus != null) {
            this.ListenerStatus = new String(source.ListenerStatus);
        }
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.ListenerName != null) {
            this.ListenerName = new String(source.ListenerName);
        }
        if (source.NoMatchDomains != null) {
            this.NoMatchDomains = new String[source.NoMatchDomains.length];
            for (int i = 0; i < source.NoMatchDomains.length; i++) {
                this.NoMatchDomains[i] = new String(source.NoMatchDomains[i]);
            }
        }
        if (source.CertIdList != null) {
            this.CertIdList = new String[source.CertIdList.length];
            for (int i = 0; i < source.CertIdList.length; i++) {
                this.CertIdList[i] = new String(source.CertIdList[i]);
            }
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ListenerStatus", this.ListenerStatus);
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "ListenerName", this.ListenerName);
        this.setParamArraySimple(map, prefix + "NoMatchDomains.", this.NoMatchDomains);
        this.setParamArraySimple(map, prefix + "CertIdList.", this.CertIdList);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);

    }
}

