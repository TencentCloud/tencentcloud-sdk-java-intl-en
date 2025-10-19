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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClientConnection extends AbstractModel {

    /**
    * IP address of the connected client.
    */
    @SerializedName("IP")
    @Expose
    private String IP;

    /**
    * Number of connections corresponding to the client IP address.
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * Whether it is an internal IP address.
    */
    @SerializedName("InternalService")
    @Expose
    private Boolean InternalService;

    /**
     * Get IP address of the connected client. 
     * @return IP IP address of the connected client.
     */
    public String getIP() {
        return this.IP;
    }

    /**
     * Set IP address of the connected client.
     * @param IP IP address of the connected client.
     */
    public void setIP(String IP) {
        this.IP = IP;
    }

    /**
     * Get Number of connections corresponding to the client IP address. 
     * @return Count Number of connections corresponding to the client IP address.
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set Number of connections corresponding to the client IP address.
     * @param Count Number of connections corresponding to the client IP address.
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get Whether it is an internal IP address. 
     * @return InternalService Whether it is an internal IP address.
     */
    public Boolean getInternalService() {
        return this.InternalService;
    }

    /**
     * Set Whether it is an internal IP address.
     * @param InternalService Whether it is an internal IP address.
     */
    public void setInternalService(Boolean InternalService) {
        this.InternalService = InternalService;
    }

    public ClientConnection() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClientConnection(ClientConnection source) {
        if (source.IP != null) {
            this.IP = new String(source.IP);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.InternalService != null) {
            this.InternalService = new Boolean(source.InternalService);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IP", this.IP);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "InternalService", this.InternalService);

    }
}

