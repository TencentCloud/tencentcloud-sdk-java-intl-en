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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClbListener extends AbstractModel {

    /**
    * The listener ID.
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * The listener name.
    */
    @SerializedName("ListenerName")
    @Expose
    private String ListenerName;

    /**
    * Whether to enable SNI. Valid values: `1` (enable) and `0` (disable).
    */
    @SerializedName("SniSwitch")
    @Expose
    private Long SniSwitch;

    /**
    * The listener protocol type. Valid values: `HTTPS` and `TCP_SSL`.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Data of certificate bound to the listener.
    */
    @SerializedName("Certificate")
    @Expose
    private Certificate Certificate;

    /**
    * List of listener rules.
    */
    @SerializedName("Rules")
    @Expose
    private ClbListenerRule [] Rules;

    /**
    * Domain list not matched.
    */
    @SerializedName("NoMatchDomains")
    @Expose
    private String [] NoMatchDomains;

    /**
     * Get The listener ID. 
     * @return ListenerId The listener ID.
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set The listener ID.
     * @param ListenerId The listener ID.
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get The listener name. 
     * @return ListenerName The listener name.
     */
    public String getListenerName() {
        return this.ListenerName;
    }

    /**
     * Set The listener name.
     * @param ListenerName The listener name.
     */
    public void setListenerName(String ListenerName) {
        this.ListenerName = ListenerName;
    }

    /**
     * Get Whether to enable SNI. Valid values: `1` (enable) and `0` (disable). 
     * @return SniSwitch Whether to enable SNI. Valid values: `1` (enable) and `0` (disable).
     */
    public Long getSniSwitch() {
        return this.SniSwitch;
    }

    /**
     * Set Whether to enable SNI. Valid values: `1` (enable) and `0` (disable).
     * @param SniSwitch Whether to enable SNI. Valid values: `1` (enable) and `0` (disable).
     */
    public void setSniSwitch(Long SniSwitch) {
        this.SniSwitch = SniSwitch;
    }

    /**
     * Get The listener protocol type. Valid values: `HTTPS` and `TCP_SSL`. 
     * @return Protocol The listener protocol type. Valid values: `HTTPS` and `TCP_SSL`.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set The listener protocol type. Valid values: `HTTPS` and `TCP_SSL`.
     * @param Protocol The listener protocol type. Valid values: `HTTPS` and `TCP_SSL`.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Data of certificate bound to the listener. 
     * @return Certificate Data of certificate bound to the listener.
     */
    public Certificate getCertificate() {
        return this.Certificate;
    }

    /**
     * Set Data of certificate bound to the listener.
     * @param Certificate Data of certificate bound to the listener.
     */
    public void setCertificate(Certificate Certificate) {
        this.Certificate = Certificate;
    }

    /**
     * Get List of listener rules. 
     * @return Rules List of listener rules.
     */
    public ClbListenerRule [] getRules() {
        return this.Rules;
    }

    /**
     * Set List of listener rules.
     * @param Rules List of listener rules.
     */
    public void setRules(ClbListenerRule [] Rules) {
        this.Rules = Rules;
    }

    /**
     * Get Domain list not matched. 
     * @return NoMatchDomains Domain list not matched.
     */
    public String [] getNoMatchDomains() {
        return this.NoMatchDomains;
    }

    /**
     * Set Domain list not matched.
     * @param NoMatchDomains Domain list not matched.
     */
    public void setNoMatchDomains(String [] NoMatchDomains) {
        this.NoMatchDomains = NoMatchDomains;
    }

    public ClbListener() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClbListener(ClbListener source) {
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.ListenerName != null) {
            this.ListenerName = new String(source.ListenerName);
        }
        if (source.SniSwitch != null) {
            this.SniSwitch = new Long(source.SniSwitch);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Certificate != null) {
            this.Certificate = new Certificate(source.Certificate);
        }
        if (source.Rules != null) {
            this.Rules = new ClbListenerRule[source.Rules.length];
            for (int i = 0; i < source.Rules.length; i++) {
                this.Rules[i] = new ClbListenerRule(source.Rules[i]);
            }
        }
        if (source.NoMatchDomains != null) {
            this.NoMatchDomains = new String[source.NoMatchDomains.length];
            for (int i = 0; i < source.NoMatchDomains.length; i++) {
                this.NoMatchDomains[i] = new String(source.NoMatchDomains[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "ListenerName", this.ListenerName);
        this.setParamSimple(map, prefix + "SniSwitch", this.SniSwitch);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamObj(map, prefix + "Certificate.", this.Certificate);
        this.setParamArrayObj(map, prefix + "Rules.", this.Rules);
        this.setParamArraySimple(map, prefix + "NoMatchDomains.", this.NoMatchDomains);

    }
}

