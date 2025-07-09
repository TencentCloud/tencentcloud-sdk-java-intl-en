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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyWebHookReceiverRequest extends AbstractModel {

    /**
    * id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Receiver name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * webhook URL
    */
    @SerializedName("Addr")
    @Expose
    private String Addr;

    /**
    * Whether to modify
    */
    @SerializedName("IsModify")
    @Expose
    private Boolean IsModify;

    /**
     * Get id 
     * @return Id id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set id
     * @param Id id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Receiver name 
     * @return Name Receiver name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Receiver name
     * @param Name Receiver name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get webhook URL 
     * @return Addr webhook URL
     */
    public String getAddr() {
        return this.Addr;
    }

    /**
     * Set webhook URL
     * @param Addr webhook URL
     */
    public void setAddr(String Addr) {
        this.Addr = Addr;
    }

    /**
     * Get Whether to modify 
     * @return IsModify Whether to modify
     */
    public Boolean getIsModify() {
        return this.IsModify;
    }

    /**
     * Set Whether to modify
     * @param IsModify Whether to modify
     */
    public void setIsModify(Boolean IsModify) {
        this.IsModify = IsModify;
    }

    public ModifyWebHookReceiverRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyWebHookReceiverRequest(ModifyWebHookReceiverRequest source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Addr != null) {
            this.Addr = new String(source.Addr);
        }
        if (source.IsModify != null) {
            this.IsModify = new Boolean(source.IsModify);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Addr", this.Addr);
        this.setParamSimple(map, prefix + "IsModify", this.IsModify);

    }
}

