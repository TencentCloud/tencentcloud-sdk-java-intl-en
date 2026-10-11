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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RedisInstance extends AbstractModel {

    /**
    * Redis instance ID.
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Instance IP address.
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * Instance port.
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
     * Get Redis instance ID. 
     * @return Id Redis instance ID.
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Redis instance ID.
     * @param Id Redis instance ID.
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Instance IP address. 
     * @return Host Instance IP address.
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set Instance IP address.
     * @param Host Instance IP address.
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get Instance port. 
     * @return Port Instance port.
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set Instance port.
     * @param Port Instance port.
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    public RedisInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RedisInstance(RedisInstance source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "Port", this.Port);

    }
}

