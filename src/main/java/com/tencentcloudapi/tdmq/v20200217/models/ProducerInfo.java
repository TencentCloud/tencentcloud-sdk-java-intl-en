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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProducerInfo extends AbstractModel {

    /**
    * Client ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ClientId")
    @Expose
    private String ClientId;

    /**
    * Client IP.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ClientIp")
    @Expose
    private String ClientIp;

    /**
    * Specifies the client language.
JAVA((byte) 0),
    CPP((byte) 1),
    DOTNET((byte) 2),
    PYTHON((byte) 3),
    DELPHI((byte) 4),
    ERLANG((byte) 5),
    RUBY((byte) 6),
    OTHER((byte) 7),
    HTTP((byte) 8),
    GO((byte) 9),
    PHP((byte) 10),
    OMS((byte) 11);
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Language")
    @Expose
    private String Language;

    /**
    * Client version.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * Last production time.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LastUpdateTimestamp")
    @Expose
    private Long LastUpdateTimestamp;

    /**
     * Get Client ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ClientId Client ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getClientId() {
        return this.ClientId;
    }

    /**
     * Set Client ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ClientId Client ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setClientId(String ClientId) {
        this.ClientId = ClientId;
    }

    /**
     * Get Client IP.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ClientIp Client IP.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getClientIp() {
        return this.ClientIp;
    }

    /**
     * Set Client IP.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ClientIp Client IP.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setClientIp(String ClientIp) {
        this.ClientIp = ClientIp;
    }

    /**
     * Get Specifies the client language.
JAVA((byte) 0),
    CPP((byte) 1),
    DOTNET((byte) 2),
    PYTHON((byte) 3),
    DELPHI((byte) 4),
    ERLANG((byte) 5),
    RUBY((byte) 6),
    OTHER((byte) 7),
    HTTP((byte) 8),
    GO((byte) 9),
    PHP((byte) 10),
    OMS((byte) 11);
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Language Specifies the client language.
JAVA((byte) 0),
    CPP((byte) 1),
    DOTNET((byte) 2),
    PYTHON((byte) 3),
    DELPHI((byte) 4),
    ERLANG((byte) 5),
    RUBY((byte) 6),
    OTHER((byte) 7),
    HTTP((byte) 8),
    GO((byte) 9),
    PHP((byte) 10),
    OMS((byte) 11);
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLanguage() {
        return this.Language;
    }

    /**
     * Set Specifies the client language.
JAVA((byte) 0),
    CPP((byte) 1),
    DOTNET((byte) 2),
    PYTHON((byte) 3),
    DELPHI((byte) 4),
    ERLANG((byte) 5),
    RUBY((byte) 6),
    OTHER((byte) 7),
    HTTP((byte) 8),
    GO((byte) 9),
    PHP((byte) 10),
    OMS((byte) 11);
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Language Specifies the client language.
JAVA((byte) 0),
    CPP((byte) 1),
    DOTNET((byte) 2),
    PYTHON((byte) 3),
    DELPHI((byte) 4),
    ERLANG((byte) 5),
    RUBY((byte) 6),
    OTHER((byte) 7),
    HTTP((byte) 8),
    GO((byte) 9),
    PHP((byte) 10),
    OMS((byte) 11);
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLanguage(String Language) {
        this.Language = Language;
    }

    /**
     * Get Client version.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Version Client version.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set Client version.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Version Client version.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get Last production time.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LastUpdateTimestamp Last production time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getLastUpdateTimestamp() {
        return this.LastUpdateTimestamp;
    }

    /**
     * Set Last production time.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LastUpdateTimestamp Last production time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLastUpdateTimestamp(Long LastUpdateTimestamp) {
        this.LastUpdateTimestamp = LastUpdateTimestamp;
    }

    public ProducerInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProducerInfo(ProducerInfo source) {
        if (source.ClientId != null) {
            this.ClientId = new String(source.ClientId);
        }
        if (source.ClientIp != null) {
            this.ClientIp = new String(source.ClientIp);
        }
        if (source.Language != null) {
            this.Language = new String(source.Language);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.LastUpdateTimestamp != null) {
            this.LastUpdateTimestamp = new Long(source.LastUpdateTimestamp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClientId", this.ClientId);
        this.setParamSimple(map, prefix + "ClientIp", this.ClientIp);
        this.setParamSimple(map, prefix + "Language", this.Language);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "LastUpdateTimestamp", this.LastUpdateTimestamp);

    }
}

