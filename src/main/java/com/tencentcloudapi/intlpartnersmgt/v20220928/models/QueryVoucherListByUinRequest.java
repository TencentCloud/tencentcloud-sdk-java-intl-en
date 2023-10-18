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
package com.tencentcloudapi.intlpartnersmgt.v20220928.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryVoucherListByUinRequest extends AbstractModel {

    /**
    * Customer UIN list
    */
    @SerializedName("ClientUins")
    @Expose
    private Long [] ClientUins;

    /**
    * Voucher status. If this parameter is not passed in, all status will be queried by default. Valid values: `Unused`, `Used`, `Expired`.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get Customer UIN list 
     * @return ClientUins Customer UIN list
     */
    public Long [] getClientUins() {
        return this.ClientUins;
    }

    /**
     * Set Customer UIN list
     * @param ClientUins Customer UIN list
     */
    public void setClientUins(Long [] ClientUins) {
        this.ClientUins = ClientUins;
    }

    /**
     * Get Voucher status. If this parameter is not passed in, all status will be queried by default. Valid values: `Unused`, `Used`, `Expired`. 
     * @return Status Voucher status. If this parameter is not passed in, all status will be queried by default. Valid values: `Unused`, `Used`, `Expired`.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Voucher status. If this parameter is not passed in, all status will be queried by default. Valid values: `Unused`, `Used`, `Expired`.
     * @param Status Voucher status. If this parameter is not passed in, all status will be queried by default. Valid values: `Unused`, `Used`, `Expired`.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public QueryVoucherListByUinRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryVoucherListByUinRequest(QueryVoucherListByUinRequest source) {
        if (source.ClientUins != null) {
            this.ClientUins = new Long[source.ClientUins.length];
            for (int i = 0; i < source.ClientUins.length; i++) {
                this.ClientUins[i] = new Long(source.ClientUins[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ClientUins.", this.ClientUins);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

