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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CancelSparkSessionBatchSQLRequest extends AbstractModel {

    /**
    * The unique identifier of a batch task.
    */
    @SerializedName("BatchId")
    @Expose
    private String BatchId;

    /**
    * User-defined primary key. If it is specified, the value should be used for querying.
    */
    @SerializedName("CustomKey")
    @Expose
    private String CustomKey;

    /**
     * Get The unique identifier of a batch task. 
     * @return BatchId The unique identifier of a batch task.
     */
    public String getBatchId() {
        return this.BatchId;
    }

    /**
     * Set The unique identifier of a batch task.
     * @param BatchId The unique identifier of a batch task.
     */
    public void setBatchId(String BatchId) {
        this.BatchId = BatchId;
    }

    /**
     * Get User-defined primary key. If it is specified, the value should be used for querying. 
     * @return CustomKey User-defined primary key. If it is specified, the value should be used for querying.
     */
    public String getCustomKey() {
        return this.CustomKey;
    }

    /**
     * Set User-defined primary key. If it is specified, the value should be used for querying.
     * @param CustomKey User-defined primary key. If it is specified, the value should be used for querying.
     */
    public void setCustomKey(String CustomKey) {
        this.CustomKey = CustomKey;
    }

    public CancelSparkSessionBatchSQLRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CancelSparkSessionBatchSQLRequest(CancelSparkSessionBatchSQLRequest source) {
        if (source.BatchId != null) {
            this.BatchId = new String(source.BatchId);
        }
        if (source.CustomKey != null) {
            this.CustomKey = new String(source.CustomKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BatchId", this.BatchId);
        this.setParamSimple(map, prefix + "CustomKey", this.CustomKey);

    }
}

