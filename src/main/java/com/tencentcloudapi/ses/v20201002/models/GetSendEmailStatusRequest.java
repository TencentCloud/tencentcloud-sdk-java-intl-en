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
package com.tencentcloudapi.ses.v20201002.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetSendEmailStatusRequest extends AbstractModel{

    /**
    * Date sent. This parameter is required. You can only query the sending status for a single date at a time.
    */
    @SerializedName("RequestDate")
    @Expose
    private String RequestDate;

    /**
    * Offset. Default value: `0`.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Maximum number of pulled entries. Maximum value: `100`.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * The `MessageId` field returned by the `SendMail` API.
    */
    @SerializedName("MessageId")
    @Expose
    private String MessageId;

    /**
    * Recipient email address.
    */
    @SerializedName("ToEmailAddress")
    @Expose
    private String ToEmailAddress;

    /**
     * Get Date sent. This parameter is required. You can only query the sending status for a single date at a time. 
     * @return RequestDate Date sent. This parameter is required. You can only query the sending status for a single date at a time.
     */
    public String getRequestDate() {
        return this.RequestDate;
    }

    /**
     * Set Date sent. This parameter is required. You can only query the sending status for a single date at a time.
     * @param RequestDate Date sent. This parameter is required. You can only query the sending status for a single date at a time.
     */
    public void setRequestDate(String RequestDate) {
        this.RequestDate = RequestDate;
    }

    /**
     * Get Offset. Default value: `0`. 
     * @return Offset Offset. Default value: `0`.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. Default value: `0`.
     * @param Offset Offset. Default value: `0`.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Maximum number of pulled entries. Maximum value: `100`. 
     * @return Limit Maximum number of pulled entries. Maximum value: `100`.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Maximum number of pulled entries. Maximum value: `100`.
     * @param Limit Maximum number of pulled entries. Maximum value: `100`.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get The `MessageId` field returned by the `SendMail` API. 
     * @return MessageId The `MessageId` field returned by the `SendMail` API.
     */
    public String getMessageId() {
        return this.MessageId;
    }

    /**
     * Set The `MessageId` field returned by the `SendMail` API.
     * @param MessageId The `MessageId` field returned by the `SendMail` API.
     */
    public void setMessageId(String MessageId) {
        this.MessageId = MessageId;
    }

    /**
     * Get Recipient email address. 
     * @return ToEmailAddress Recipient email address.
     */
    public String getToEmailAddress() {
        return this.ToEmailAddress;
    }

    /**
     * Set Recipient email address.
     * @param ToEmailAddress Recipient email address.
     */
    public void setToEmailAddress(String ToEmailAddress) {
        this.ToEmailAddress = ToEmailAddress;
    }

    public GetSendEmailStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetSendEmailStatusRequest(GetSendEmailStatusRequest source) {
        if (source.RequestDate != null) {
            this.RequestDate = new String(source.RequestDate);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.MessageId != null) {
            this.MessageId = new String(source.MessageId);
        }
        if (source.ToEmailAddress != null) {
            this.ToEmailAddress = new String(source.ToEmailAddress);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RequestDate", this.RequestDate);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "MessageId", this.MessageId);
        this.setParamSimple(map, prefix + "ToEmailAddress", this.ToEmailAddress);

    }
}

