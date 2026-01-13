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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAsyncRequestInfoRequest extends AbstractModel {

    /**
    * Specifies the ID of the asynchronous request to be queried. When an asynchronous process is involved in the API operation (such as [CreateBackupDBInstance](https://www.tencentcloud.com/document/product/240/46599?from_cn_redirect=1)), the response value of AsyncRequestId is the ID to be filled in for this parameter.
    */
    @SerializedName("AsyncRequestId")
    @Expose
    private String AsyncRequestId;

    /**
     * Get Specifies the ID of the asynchronous request to be queried. When an asynchronous process is involved in the API operation (such as [CreateBackupDBInstance](https://www.tencentcloud.com/document/product/240/46599?from_cn_redirect=1)), the response value of AsyncRequestId is the ID to be filled in for this parameter. 
     * @return AsyncRequestId Specifies the ID of the asynchronous request to be queried. When an asynchronous process is involved in the API operation (such as [CreateBackupDBInstance](https://www.tencentcloud.com/document/product/240/46599?from_cn_redirect=1)), the response value of AsyncRequestId is the ID to be filled in for this parameter.
     */
    public String getAsyncRequestId() {
        return this.AsyncRequestId;
    }

    /**
     * Set Specifies the ID of the asynchronous request to be queried. When an asynchronous process is involved in the API operation (such as [CreateBackupDBInstance](https://www.tencentcloud.com/document/product/240/46599?from_cn_redirect=1)), the response value of AsyncRequestId is the ID to be filled in for this parameter.
     * @param AsyncRequestId Specifies the ID of the asynchronous request to be queried. When an asynchronous process is involved in the API operation (such as [CreateBackupDBInstance](https://www.tencentcloud.com/document/product/240/46599?from_cn_redirect=1)), the response value of AsyncRequestId is the ID to be filled in for this parameter.
     */
    public void setAsyncRequestId(String AsyncRequestId) {
        this.AsyncRequestId = AsyncRequestId;
    }

    public DescribeAsyncRequestInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAsyncRequestInfoRequest(DescribeAsyncRequestInfoRequest source) {
        if (source.AsyncRequestId != null) {
            this.AsyncRequestId = new String(source.AsyncRequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AsyncRequestId", this.AsyncRequestId);

    }
}

