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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TcrInstanceToken extends AbstractModel {

    /**
    * Token ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Token description
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * ID of the instance of the token
    */
    @SerializedName("RegistryId")
    @Expose
    private String RegistryId;

    /**
    * Token status
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * Token creation time
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * Token expiration timestamp
    */
    @SerializedName("ExpiredAt")
    @Expose
    private Long ExpiredAt;

    /**
     * Get Token ID 
     * @return Id Token ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Token ID
     * @param Id Token ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Token description 
     * @return Desc Token description
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set Token description
     * @param Desc Token description
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get ID of the instance of the token 
     * @return RegistryId ID of the instance of the token
     */
    public String getRegistryId() {
        return this.RegistryId;
    }

    /**
     * Set ID of the instance of the token
     * @param RegistryId ID of the instance of the token
     */
    public void setRegistryId(String RegistryId) {
        this.RegistryId = RegistryId;
    }

    /**
     * Get Token status 
     * @return Enabled Token status
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set Token status
     * @param Enabled Token status
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get Token creation time 
     * @return CreatedAt Token creation time
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set Token creation time
     * @param CreatedAt Token creation time
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get Token expiration timestamp 
     * @return ExpiredAt Token expiration timestamp
     */
    public Long getExpiredAt() {
        return this.ExpiredAt;
    }

    /**
     * Set Token expiration timestamp
     * @param ExpiredAt Token expiration timestamp
     */
    public void setExpiredAt(Long ExpiredAt) {
        this.ExpiredAt = ExpiredAt;
    }

    public TcrInstanceToken() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TcrInstanceToken(TcrInstanceToken source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
        if (source.RegistryId != null) {
            this.RegistryId = new String(source.RegistryId);
        }
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.ExpiredAt != null) {
            this.ExpiredAt = new Long(source.ExpiredAt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamSimple(map, prefix + "RegistryId", this.RegistryId);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "ExpiredAt", this.ExpiredAt);

    }
}

