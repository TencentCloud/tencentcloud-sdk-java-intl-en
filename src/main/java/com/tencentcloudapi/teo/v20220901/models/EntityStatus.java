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

public class EntityStatus extends AbstractModel {

    /**
    * Instance name. Currently, only subdomains are available.
    */
    @SerializedName("Entity")
    @Expose
    private String Entity;

    /**
    * Instance configuration issuance status. Valid values:
<li>online: Configuration in effect;</li><li>fail: Configuration failure;</li><li>process: Configuration is being deployed.</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Prompt for instance configuration distribution.
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
     * Get Instance name. Currently, only subdomains are available. 
     * @return Entity Instance name. Currently, only subdomains are available.
     */
    public String getEntity() {
        return this.Entity;
    }

    /**
     * Set Instance name. Currently, only subdomains are available.
     * @param Entity Instance name. Currently, only subdomains are available.
     */
    public void setEntity(String Entity) {
        this.Entity = Entity;
    }

    /**
     * Get Instance configuration issuance status. Valid values:
<li>online: Configuration in effect;</li><li>fail: Configuration failure;</li><li>process: Configuration is being deployed.</li> 
     * @return Status Instance configuration issuance status. Valid values:
<li>online: Configuration in effect;</li><li>fail: Configuration failure;</li><li>process: Configuration is being deployed.</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Instance configuration issuance status. Valid values:
<li>online: Configuration in effect;</li><li>fail: Configuration failure;</li><li>process: Configuration is being deployed.</li>
     * @param Status Instance configuration issuance status. Valid values:
<li>online: Configuration in effect;</li><li>fail: Configuration failure;</li><li>process: Configuration is being deployed.</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Prompt for instance configuration distribution. 
     * @return Message Prompt for instance configuration distribution.
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set Prompt for instance configuration distribution.
     * @param Message Prompt for instance configuration distribution.
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    public EntityStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EntityStatus(EntityStatus source) {
        if (source.Entity != null) {
            this.Entity = new String(source.Entity);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Entity", this.Entity);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Message", this.Message);

    }
}

