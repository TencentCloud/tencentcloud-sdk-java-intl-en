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

public class UpdateCustomBlackListRequest extends AbstractModel {

    /**
    * Blocklist id that needs to change.
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * After modification email address.
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * Expiration time. if left empty, it indicates permanent validity.
    */
    @SerializedName("ExpireDate")
    @Expose
    private String ExpireDate;

    /**
     * Get Blocklist id that needs to change. 
     * @return Id Blocklist id that needs to change.
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Blocklist id that needs to change.
     * @param Id Blocklist id that needs to change.
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get After modification email address. 
     * @return Email After modification email address.
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set After modification email address.
     * @param Email After modification email address.
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * Get Expiration time. if left empty, it indicates permanent validity. 
     * @return ExpireDate Expiration time. if left empty, it indicates permanent validity.
     */
    public String getExpireDate() {
        return this.ExpireDate;
    }

    /**
     * Set Expiration time. if left empty, it indicates permanent validity.
     * @param ExpireDate Expiration time. if left empty, it indicates permanent validity.
     */
    public void setExpireDate(String ExpireDate) {
        this.ExpireDate = ExpireDate;
    }

    public UpdateCustomBlackListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateCustomBlackListRequest(UpdateCustomBlackListRequest source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Email != null) {
            this.Email = new String(source.Email);
        }
        if (source.ExpireDate != null) {
            this.ExpireDate = new String(source.ExpireDate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "ExpireDate", this.ExpireDate);

    }
}

