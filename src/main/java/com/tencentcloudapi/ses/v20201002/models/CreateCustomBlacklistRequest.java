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

public class CreateCustomBlacklistRequest extends AbstractModel {

    /**
    * Add to blocklist email address.
    */
    @SerializedName("Emails")
    @Expose
    private String [] Emails;

    /**
    * Expiration date.
    */
    @SerializedName("ExpireDate")
    @Expose
    private String ExpireDate;

    /**
     * Get Add to blocklist email address. 
     * @return Emails Add to blocklist email address.
     */
    public String [] getEmails() {
        return this.Emails;
    }

    /**
     * Set Add to blocklist email address.
     * @param Emails Add to blocklist email address.
     */
    public void setEmails(String [] Emails) {
        this.Emails = Emails;
    }

    /**
     * Get Expiration date. 
     * @return ExpireDate Expiration date.
     */
    public String getExpireDate() {
        return this.ExpireDate;
    }

    /**
     * Set Expiration date.
     * @param ExpireDate Expiration date.
     */
    public void setExpireDate(String ExpireDate) {
        this.ExpireDate = ExpireDate;
    }

    public CreateCustomBlacklistRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCustomBlacklistRequest(CreateCustomBlacklistRequest source) {
        if (source.Emails != null) {
            this.Emails = new String[source.Emails.length];
            for (int i = 0; i < source.Emails.length; i++) {
                this.Emails[i] = new String(source.Emails[i]);
            }
        }
        if (source.ExpireDate != null) {
            this.ExpireDate = new String(source.ExpireDate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Emails.", this.Emails);
        this.setParamSimple(map, prefix + "ExpireDate", this.ExpireDate);

    }
}

