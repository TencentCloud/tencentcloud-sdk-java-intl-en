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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CosInvokeDetailInfo extends AbstractModel {

    /**
    * Call time.
    */
    @SerializedName("InvokeTimestamp")
    @Expose
    private Long InvokeTimestamp;

    /**
    * Request ID
    */
    @SerializedName("InvokeRequestId")
    @Expose
    private String InvokeRequestId;

    /**
    * Call content
    */
    @SerializedName("InvokeContent")
    @Expose
    private String InvokeContent;

    /**
     * Get Call time. 
     * @return InvokeTimestamp Call time.
     */
    public Long getInvokeTimestamp() {
        return this.InvokeTimestamp;
    }

    /**
     * Set Call time.
     * @param InvokeTimestamp Call time.
     */
    public void setInvokeTimestamp(Long InvokeTimestamp) {
        this.InvokeTimestamp = InvokeTimestamp;
    }

    /**
     * Get Request ID 
     * @return InvokeRequestId Request ID
     */
    public String getInvokeRequestId() {
        return this.InvokeRequestId;
    }

    /**
     * Set Request ID
     * @param InvokeRequestId Request ID
     */
    public void setInvokeRequestId(String InvokeRequestId) {
        this.InvokeRequestId = InvokeRequestId;
    }

    /**
     * Get Call content 
     * @return InvokeContent Call content
     */
    public String getInvokeContent() {
        return this.InvokeContent;
    }

    /**
     * Set Call content
     * @param InvokeContent Call content
     */
    public void setInvokeContent(String InvokeContent) {
        this.InvokeContent = InvokeContent;
    }

    public CosInvokeDetailInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CosInvokeDetailInfo(CosInvokeDetailInfo source) {
        if (source.InvokeTimestamp != null) {
            this.InvokeTimestamp = new Long(source.InvokeTimestamp);
        }
        if (source.InvokeRequestId != null) {
            this.InvokeRequestId = new String(source.InvokeRequestId);
        }
        if (source.InvokeContent != null) {
            this.InvokeContent = new String(source.InvokeContent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InvokeTimestamp", this.InvokeTimestamp);
        this.setParamSimple(map, prefix + "InvokeRequestId", this.InvokeRequestId);
        this.setParamSimple(map, prefix + "InvokeContent", this.InvokeContent);

    }
}

