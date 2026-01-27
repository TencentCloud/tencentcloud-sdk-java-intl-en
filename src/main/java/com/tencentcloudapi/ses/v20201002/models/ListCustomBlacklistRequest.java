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

public class ListCustomBlacklistRequest extends AbstractModel {

    /**
    * Offset, int, starts from 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number limit, int, no more than 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Filter the state of the blocklist. valid values: 0 (expired), 1 (active), 2 (all).
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Email address in blocklist.
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
     * Get Offset, int, starts from 0. 
     * @return Offset Offset, int, starts from 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset, int, starts from 0.
     * @param Offset Offset, int, starts from 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number limit, int, no more than 100. 
     * @return Limit Number limit, int, no more than 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number limit, int, no more than 100.
     * @param Limit Number limit, int, no more than 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Filter the state of the blocklist. valid values: 0 (expired), 1 (active), 2 (all). 
     * @return Status Filter the state of the blocklist. valid values: 0 (expired), 1 (active), 2 (all).
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Filter the state of the blocklist. valid values: 0 (expired), 1 (active), 2 (all).
     * @param Status Filter the state of the blocklist. valid values: 0 (expired), 1 (active), 2 (all).
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Email address in blocklist. 
     * @return Email Email address in blocklist.
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set Email address in blocklist.
     * @param Email Email address in blocklist.
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    public ListCustomBlacklistRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListCustomBlacklistRequest(ListCustomBlacklistRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Email != null) {
            this.Email = new String(source.Email);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Email", this.Email);

    }
}

