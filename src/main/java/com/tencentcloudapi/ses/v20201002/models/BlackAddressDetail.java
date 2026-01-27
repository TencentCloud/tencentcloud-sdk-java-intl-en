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
package com.tencentcloudapi.ses.v20201002.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BlackAddressDetail extends AbstractModel {

    /**
    * Blocklist address id.
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Email address.
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * Creation time.


    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Expiration time
    */
    @SerializedName("ExpireDate")
    @Expose
    private String ExpireDate;

    /**
    * Blocklist status. valid values: 0 (expired), 1 (active).
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get Blocklist address id. 
     * @return Id Blocklist address id.
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Blocklist address id.
     * @param Id Blocklist address id.
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Email address. 
     * @return Email Email address.
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set Email address.
     * @param Email Email address.
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * Get Creation time.

 
     * @return CreateTime Creation time.


     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time.


     * @param CreateTime Creation time.


     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Expiration time 
     * @return ExpireDate Expiration time
     */
    public String getExpireDate() {
        return this.ExpireDate;
    }

    /**
     * Set Expiration time
     * @param ExpireDate Expiration time
     */
    public void setExpireDate(String ExpireDate) {
        this.ExpireDate = ExpireDate;
    }

    /**
     * Get Blocklist status. valid values: 0 (expired), 1 (active). 
     * @return Status Blocklist status. valid values: 0 (expired), 1 (active).
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Blocklist status. valid values: 0 (expired), 1 (active).
     * @param Status Blocklist status. valid values: 0 (expired), 1 (active).
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public BlackAddressDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BlackAddressDetail(BlackAddressDetail source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Email != null) {
            this.Email = new String(source.Email);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ExpireDate != null) {
            this.ExpireDate = new String(source.ExpireDate);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ExpireDate", this.ExpireDate);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

