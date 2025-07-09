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
package com.tencentcloudapi.tdid.v20210519.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TransactionArg extends AbstractModel {

    /**
    * The credential ID.
    */
    @SerializedName("InvokerTDid")
    @Expose
    private String InvokerTDid;

    /**
     * Get The credential ID. 
     * @return InvokerTDid The credential ID.
     */
    public String getInvokerTDid() {
        return this.InvokerTDid;
    }

    /**
     * Set The credential ID.
     * @param InvokerTDid The credential ID.
     */
    public void setInvokerTDid(String InvokerTDid) {
        this.InvokerTDid = InvokerTDid;
    }

    public TransactionArg() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TransactionArg(TransactionArg source) {
        if (source.InvokerTDid != null) {
            this.InvokerTDid = new String(source.InvokerTDid);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InvokerTDid", this.InvokerTDid);

    }
}

