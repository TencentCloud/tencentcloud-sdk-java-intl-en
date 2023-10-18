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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSecurityAuditLogDownloadUrlsRequest extends AbstractModel {

    /**
    * Security audit group ID.
    */
    @SerializedName("SecAuditGroupId")
    @Expose
    private String SecAuditGroupId;

    /**
    * Async task Id.
    */
    @SerializedName("AsyncRequestId")
    @Expose
    private Long AsyncRequestId;

    /**
    * Service type. Valid value: `mysql` (TencentDB for MySQL).
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
     * Get Security audit group ID. 
     * @return SecAuditGroupId Security audit group ID.
     */
    public String getSecAuditGroupId() {
        return this.SecAuditGroupId;
    }

    /**
     * Set Security audit group ID.
     * @param SecAuditGroupId Security audit group ID.
     */
    public void setSecAuditGroupId(String SecAuditGroupId) {
        this.SecAuditGroupId = SecAuditGroupId;
    }

    /**
     * Get Async task Id. 
     * @return AsyncRequestId Async task Id.
     */
    public Long getAsyncRequestId() {
        return this.AsyncRequestId;
    }

    /**
     * Set Async task Id.
     * @param AsyncRequestId Async task Id.
     */
    public void setAsyncRequestId(Long AsyncRequestId) {
        this.AsyncRequestId = AsyncRequestId;
    }

    /**
     * Get Service type. Valid value: `mysql` (TencentDB for MySQL). 
     * @return Product Service type. Valid value: `mysql` (TencentDB for MySQL).
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set Service type. Valid value: `mysql` (TencentDB for MySQL).
     * @param Product Service type. Valid value: `mysql` (TencentDB for MySQL).
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    public DescribeSecurityAuditLogDownloadUrlsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSecurityAuditLogDownloadUrlsRequest(DescribeSecurityAuditLogDownloadUrlsRequest source) {
        if (source.SecAuditGroupId != null) {
            this.SecAuditGroupId = new String(source.SecAuditGroupId);
        }
        if (source.AsyncRequestId != null) {
            this.AsyncRequestId = new Long(source.AsyncRequestId);
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SecAuditGroupId", this.SecAuditGroupId);
        this.setParamSimple(map, prefix + "AsyncRequestId", this.AsyncRequestId);
        this.setParamSimple(map, prefix + "Product", this.Product);

    }
}

