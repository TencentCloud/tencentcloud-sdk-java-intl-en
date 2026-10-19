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

public class CosInvokeLog extends AbstractModel {

    /**
    * Call timestamp
    */
    @SerializedName("InvokeTimestamp")
    @Expose
    private Long InvokeTimestamp;

    /**
    * Request ID
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
    * Request content in base64 json structure
    */
    @SerializedName("RequestContent")
    @Expose
    private String RequestContent;

    /**
     * Get Call timestamp 
     * @return InvokeTimestamp Call timestamp
     */
    public Long getInvokeTimestamp() {
        return this.InvokeTimestamp;
    }

    /**
     * Set Call timestamp
     * @param InvokeTimestamp Call timestamp
     */
    public void setInvokeTimestamp(Long InvokeTimestamp) {
        this.InvokeTimestamp = InvokeTimestamp;
    }

    /**
     * Get Request ID 
     * @return RequestId Request ID
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set Request ID
     * @param RequestId Request ID
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Get Request content in base64 json structure 
     * @return RequestContent Request content in base64 json structure
     */
    public String getRequestContent() {
        return this.RequestContent;
    }

    /**
     * Set Request content in base64 json structure
     * @param RequestContent Request content in base64 json structure
     */
    public void setRequestContent(String RequestContent) {
        this.RequestContent = RequestContent;
    }

    public CosInvokeLog() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CosInvokeLog(CosInvokeLog source) {
        if (source.InvokeTimestamp != null) {
            this.InvokeTimestamp = new Long(source.InvokeTimestamp);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
        if (source.RequestContent != null) {
            this.RequestContent = new String(source.RequestContent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InvokeTimestamp", this.InvokeTimestamp);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);
        this.setParamSimple(map, prefix + "RequestContent", this.RequestContent);

    }
}

