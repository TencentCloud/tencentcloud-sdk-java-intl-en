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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetWsTokenRequest extends AbstractModel {

    /**
    * Access type, 5 - API visitor .
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Application AppKey</br>
How to Obtain It:</br>
1. After the application is released, obtain it at [Release Management] - [Call Information] - [API Management] on the application page.</br>
2. See the second item in https://cloud.tencent.com/document/product/1759/109469.
    */
    @SerializedName("BotAppKey")
    @Expose
    private String BotAppKey;

    /**
    * Visitor ID (external input, recommended to be unique, identifies the user currently accessing the session). Length Limit: string(64).
    */
    @SerializedName("VisitorBizId")
    @Expose
    private String VisitorBizId;

    /**
    * Knowledge label, used for search filter in the knowledge base. This field is about to be deactivated. Please use the custom_variables field in the dialogue endpoint API to replace this field.
    */
    @SerializedName("VisitorLabels")
    @Expose
    private GetWsTokenReq_Label [] VisitorLabels;

    /**
     * Get Access type, 5 - API visitor . 
     * @return Type Access type, 5 - API visitor .
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Access type, 5 - API visitor .
     * @param Type Access type, 5 - API visitor .
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Application AppKey</br>
How to Obtain It:</br>
1. After the application is released, obtain it at [Release Management] - [Call Information] - [API Management] on the application page.</br>
2. See the second item in https://cloud.tencent.com/document/product/1759/109469. 
     * @return BotAppKey Application AppKey</br>
How to Obtain It:</br>
1. After the application is released, obtain it at [Release Management] - [Call Information] - [API Management] on the application page.</br>
2. See the second item in https://cloud.tencent.com/document/product/1759/109469.
     */
    public String getBotAppKey() {
        return this.BotAppKey;
    }

    /**
     * Set Application AppKey</br>
How to Obtain It:</br>
1. After the application is released, obtain it at [Release Management] - [Call Information] - [API Management] on the application page.</br>
2. See the second item in https://cloud.tencent.com/document/product/1759/109469.
     * @param BotAppKey Application AppKey</br>
How to Obtain It:</br>
1. After the application is released, obtain it at [Release Management] - [Call Information] - [API Management] on the application page.</br>
2. See the second item in https://cloud.tencent.com/document/product/1759/109469.
     */
    public void setBotAppKey(String BotAppKey) {
        this.BotAppKey = BotAppKey;
    }

    /**
     * Get Visitor ID (external input, recommended to be unique, identifies the user currently accessing the session). Length Limit: string(64). 
     * @return VisitorBizId Visitor ID (external input, recommended to be unique, identifies the user currently accessing the session). Length Limit: string(64).
     */
    public String getVisitorBizId() {
        return this.VisitorBizId;
    }

    /**
     * Set Visitor ID (external input, recommended to be unique, identifies the user currently accessing the session). Length Limit: string(64).
     * @param VisitorBizId Visitor ID (external input, recommended to be unique, identifies the user currently accessing the session). Length Limit: string(64).
     */
    public void setVisitorBizId(String VisitorBizId) {
        this.VisitorBizId = VisitorBizId;
    }

    /**
     * Get Knowledge label, used for search filter in the knowledge base. This field is about to be deactivated. Please use the custom_variables field in the dialogue endpoint API to replace this field. 
     * @return VisitorLabels Knowledge label, used for search filter in the knowledge base. This field is about to be deactivated. Please use the custom_variables field in the dialogue endpoint API to replace this field.
     */
    public GetWsTokenReq_Label [] getVisitorLabels() {
        return this.VisitorLabels;
    }

    /**
     * Set Knowledge label, used for search filter in the knowledge base. This field is about to be deactivated. Please use the custom_variables field in the dialogue endpoint API to replace this field.
     * @param VisitorLabels Knowledge label, used for search filter in the knowledge base. This field is about to be deactivated. Please use the custom_variables field in the dialogue endpoint API to replace this field.
     */
    public void setVisitorLabels(GetWsTokenReq_Label [] VisitorLabels) {
        this.VisitorLabels = VisitorLabels;
    }

    public GetWsTokenRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetWsTokenRequest(GetWsTokenRequest source) {
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.BotAppKey != null) {
            this.BotAppKey = new String(source.BotAppKey);
        }
        if (source.VisitorBizId != null) {
            this.VisitorBizId = new String(source.VisitorBizId);
        }
        if (source.VisitorLabels != null) {
            this.VisitorLabels = new GetWsTokenReq_Label[source.VisitorLabels.length];
            for (int i = 0; i < source.VisitorLabels.length; i++) {
                this.VisitorLabels[i] = new GetWsTokenReq_Label(source.VisitorLabels[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "BotAppKey", this.BotAppKey);
        this.setParamSimple(map, prefix + "VisitorBizId", this.VisitorBizId);
        this.setParamArrayObj(map, prefix + "VisitorLabels.", this.VisitorLabels);

    }
}

