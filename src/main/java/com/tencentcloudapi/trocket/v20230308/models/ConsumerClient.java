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
package com.tencentcloudapi.trocket.v20230308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConsumerClient extends AbstractModel {

    /**
    * Client ID
    */
    @SerializedName("ClientId")
    @Expose
    private String ClientId;

    /**
    * Client address.
    */
    @SerializedName("ClientAddr")
    @Expose
    private String ClientAddr;

    /**
    * Client SDK language
    */
    @SerializedName("Language")
    @Expose
    private String Language;

    /**
    * Client SDK version
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * Client consumption heap

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ConsumerLag")
    @Expose
    private Long ConsumerLag;

    /**
    * Consumer client type. valid values:.

-Specifies the grpc protocol.
-remoting protocol.
-http protocol.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ChannelProtocol")
    @Expose
    private String ChannelProtocol;

    /**
     * Get Client ID 
     * @return ClientId Client ID
     */
    public String getClientId() {
        return this.ClientId;
    }

    /**
     * Set Client ID
     * @param ClientId Client ID
     */
    public void setClientId(String ClientId) {
        this.ClientId = ClientId;
    }

    /**
     * Get Client address. 
     * @return ClientAddr Client address.
     */
    public String getClientAddr() {
        return this.ClientAddr;
    }

    /**
     * Set Client address.
     * @param ClientAddr Client address.
     */
    public void setClientAddr(String ClientAddr) {
        this.ClientAddr = ClientAddr;
    }

    /**
     * Get Client SDK language 
     * @return Language Client SDK language
     */
    public String getLanguage() {
        return this.Language;
    }

    /**
     * Set Client SDK language
     * @param Language Client SDK language
     */
    public void setLanguage(String Language) {
        this.Language = Language;
    }

    /**
     * Get Client SDK version 
     * @return Version Client SDK version
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set Client SDK version
     * @param Version Client SDK version
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get Client consumption heap

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ConsumerLag Client consumption heap

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getConsumerLag() {
        return this.ConsumerLag;
    }

    /**
     * Set Client consumption heap

Note: This field may return null, indicating that no valid values can be obtained.
     * @param ConsumerLag Client consumption heap

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setConsumerLag(Long ConsumerLag) {
        this.ConsumerLag = ConsumerLag;
    }

    /**
     * Get Consumer client type. valid values:.

-Specifies the grpc protocol.
-remoting protocol.
-http protocol.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ChannelProtocol Consumer client type. valid values:.

-Specifies the grpc protocol.
-remoting protocol.
-http protocol.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getChannelProtocol() {
        return this.ChannelProtocol;
    }

    /**
     * Set Consumer client type. valid values:.

-Specifies the grpc protocol.
-remoting protocol.
-http protocol.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ChannelProtocol Consumer client type. valid values:.

-Specifies the grpc protocol.
-remoting protocol.
-http protocol.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setChannelProtocol(String ChannelProtocol) {
        this.ChannelProtocol = ChannelProtocol;
    }

    public ConsumerClient() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConsumerClient(ConsumerClient source) {
        if (source.ClientId != null) {
            this.ClientId = new String(source.ClientId);
        }
        if (source.ClientAddr != null) {
            this.ClientAddr = new String(source.ClientAddr);
        }
        if (source.Language != null) {
            this.Language = new String(source.Language);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.ConsumerLag != null) {
            this.ConsumerLag = new Long(source.ConsumerLag);
        }
        if (source.ChannelProtocol != null) {
            this.ChannelProtocol = new String(source.ChannelProtocol);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClientId", this.ClientId);
        this.setParamSimple(map, prefix + "ClientAddr", this.ClientAddr);
        this.setParamSimple(map, prefix + "Language", this.Language);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "ConsumerLag", this.ConsumerLag);
        this.setParamSimple(map, prefix + "ChannelProtocol", this.ChannelProtocol);

    }
}

