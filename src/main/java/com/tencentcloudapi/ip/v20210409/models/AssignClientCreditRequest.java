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
package com.tencentcloudapi.ip.v20210409.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AssignClientCreditRequest extends AbstractModel{

    /**
    * Specific value of the credit allocated to the customer
    */
    @SerializedName("QuotaNum")
    @Expose
    private Float QuotaNum;

    /**
    * Customer UIN
    */
    @SerializedName("ClientUin")
    @Expose
    private Long ClientUin;

    /**
     * Get Specific value of the credit allocated to the customer 
     * @return QuotaNum Specific value of the credit allocated to the customer
     */
    public Float getQuotaNum() {
        return this.QuotaNum;
    }

    /**
     * Set Specific value of the credit allocated to the customer
     * @param QuotaNum Specific value of the credit allocated to the customer
     */
    public void setQuotaNum(Float QuotaNum) {
        this.QuotaNum = QuotaNum;
    }

    /**
     * Get Customer UIN 
     * @return ClientUin Customer UIN
     */
    public Long getClientUin() {
        return this.ClientUin;
    }

    /**
     * Set Customer UIN
     * @param ClientUin Customer UIN
     */
    public void setClientUin(Long ClientUin) {
        this.ClientUin = ClientUin;
    }

    public AssignClientCreditRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssignClientCreditRequest(AssignClientCreditRequest source) {
        if (source.QuotaNum != null) {
            this.QuotaNum = new Float(source.QuotaNum);
        }
        if (source.ClientUin != null) {
            this.ClientUin = new Long(source.ClientUin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "QuotaNum", this.QuotaNum);
        this.setParamSimple(map, prefix + "ClientUin", this.ClientUin);

    }
}

