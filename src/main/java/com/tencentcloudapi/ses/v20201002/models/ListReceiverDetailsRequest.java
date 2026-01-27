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

public class ListReceiverDetailsRequest extends AbstractModel {

    /**
    * Recipient list ID. specifies the value returned during API creation of a recipient list via the CreateReceiver api.
    */
    @SerializedName("ReceiverId")
    @Expose
    private Long ReceiverId;

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
    * Recipient address. length: 0-50. example: xxx@te.com. fuzzy query is supported.
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * Find start time.
    */
    @SerializedName("CreateTimeBegin")
    @Expose
    private String CreateTimeBegin;

    /**
    * Search end time.
    */
    @SerializedName("CreateTimeEnd")
    @Expose
    private String CreateTimeEnd;

    /**
    * 1: valid; 2: invalid.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get Recipient list ID. specifies the value returned during API creation of a recipient list via the CreateReceiver api. 
     * @return ReceiverId Recipient list ID. specifies the value returned during API creation of a recipient list via the CreateReceiver api.
     */
    public Long getReceiverId() {
        return this.ReceiverId;
    }

    /**
     * Set Recipient list ID. specifies the value returned during API creation of a recipient list via the CreateReceiver api.
     * @param ReceiverId Recipient list ID. specifies the value returned during API creation of a recipient list via the CreateReceiver api.
     */
    public void setReceiverId(Long ReceiverId) {
        this.ReceiverId = ReceiverId;
    }

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
     * Get Recipient address. length: 0-50. example: xxx@te.com. fuzzy query is supported. 
     * @return Email Recipient address. length: 0-50. example: xxx@te.com. fuzzy query is supported.
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set Recipient address. length: 0-50. example: xxx@te.com. fuzzy query is supported.
     * @param Email Recipient address. length: 0-50. example: xxx@te.com. fuzzy query is supported.
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * Get Find start time. 
     * @return CreateTimeBegin Find start time.
     */
    public String getCreateTimeBegin() {
        return this.CreateTimeBegin;
    }

    /**
     * Set Find start time.
     * @param CreateTimeBegin Find start time.
     */
    public void setCreateTimeBegin(String CreateTimeBegin) {
        this.CreateTimeBegin = CreateTimeBegin;
    }

    /**
     * Get Search end time. 
     * @return CreateTimeEnd Search end time.
     */
    public String getCreateTimeEnd() {
        return this.CreateTimeEnd;
    }

    /**
     * Set Search end time.
     * @param CreateTimeEnd Search end time.
     */
    public void setCreateTimeEnd(String CreateTimeEnd) {
        this.CreateTimeEnd = CreateTimeEnd;
    }

    /**
     * Get 1: valid; 2: invalid. 
     * @return Status 1: valid; 2: invalid.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 1: valid; 2: invalid.
     * @param Status 1: valid; 2: invalid.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public ListReceiverDetailsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListReceiverDetailsRequest(ListReceiverDetailsRequest source) {
        if (source.ReceiverId != null) {
            this.ReceiverId = new Long(source.ReceiverId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Email != null) {
            this.Email = new String(source.Email);
        }
        if (source.CreateTimeBegin != null) {
            this.CreateTimeBegin = new String(source.CreateTimeBegin);
        }
        if (source.CreateTimeEnd != null) {
            this.CreateTimeEnd = new String(source.CreateTimeEnd);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReceiverId", this.ReceiverId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "CreateTimeBegin", this.CreateTimeBegin);
        this.setParamSimple(map, prefix + "CreateTimeEnd", this.CreateTimeEnd);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

