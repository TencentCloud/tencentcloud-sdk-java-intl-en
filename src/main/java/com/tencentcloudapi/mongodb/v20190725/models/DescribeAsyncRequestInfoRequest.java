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
    * Async task ID, which is returned by APIs related to async tasks, such as `CreateBackupDBInstance`.
    */
    @SerializedName("AsyncRequestId")
    @Expose
    private String AsyncRequestId;

    /**
     * Get Async task ID, which is returned by APIs related to async tasks, such as `CreateBackupDBInstance`. 
     * @return AsyncRequestId Async task ID, which is returned by APIs related to async tasks, such as `CreateBackupDBInstance`.
     */
    public String getAsyncRequestId() {
        return this.AsyncRequestId;
    }

    /**
     * Set Async task ID, which is returned by APIs related to async tasks, such as `CreateBackupDBInstance`.
     * @param AsyncRequestId Async task ID, which is returned by APIs related to async tasks, such as `CreateBackupDBInstance`.
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

