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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ServiceWafStatus extends AbstractModel {

    /**
    * Service name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Service ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Service type
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Whether WAF protection is enabled for the service
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get Service name 
     * @return Name Service name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Service name
     * @param Name Service name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Service ID 
     * @return Id Service ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Service ID
     * @param Id Service ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Service type 
     * @return Type Service type
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Service type
     * @param Type Service type
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Whether WAF protection is enabled for the service 
     * @return Status Whether WAF protection is enabled for the service
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Whether WAF protection is enabled for the service
     * @param Status Whether WAF protection is enabled for the service
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public ServiceWafStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServiceWafStatus(ServiceWafStatus source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

