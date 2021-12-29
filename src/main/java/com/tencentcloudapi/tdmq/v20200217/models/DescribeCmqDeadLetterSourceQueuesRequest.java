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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCmqDeadLetterSourceQueuesRequest extends AbstractModel{

    /**
    * Dead letter queue name
    */
    @SerializedName("DeadLetterQueueName")
    @Expose
    private String DeadLetterQueueName;

    /**
    * Starting position of the list of topics to be returned on the current page in case of paginated return. If a value is entered, `limit` is required. If this parameter is left empty, 0 will be used by default.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Number of topics to be returned per page in case of paginated return. If this parameter is not passed in, 20 will be used by default. Maximum value: 50.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Filter by `SourceQueueName`
    */
    @SerializedName("SourceQueueName")
    @Expose
    private String SourceQueueName;

    /**
     * Get Dead letter queue name 
     * @return DeadLetterQueueName Dead letter queue name
     */
    public String getDeadLetterQueueName() {
        return this.DeadLetterQueueName;
    }

    /**
     * Set Dead letter queue name
     * @param DeadLetterQueueName Dead letter queue name
     */
    public void setDeadLetterQueueName(String DeadLetterQueueName) {
        this.DeadLetterQueueName = DeadLetterQueueName;
    }

    /**
     * Get Starting position of the list of topics to be returned on the current page in case of paginated return. If a value is entered, `limit` is required. If this parameter is left empty, 0 will be used by default. 
     * @return Limit Starting position of the list of topics to be returned on the current page in case of paginated return. If a value is entered, `limit` is required. If this parameter is left empty, 0 will be used by default.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Starting position of the list of topics to be returned on the current page in case of paginated return. If a value is entered, `limit` is required. If this parameter is left empty, 0 will be used by default.
     * @param Limit Starting position of the list of topics to be returned on the current page in case of paginated return. If a value is entered, `limit` is required. If this parameter is left empty, 0 will be used by default.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Number of topics to be returned per page in case of paginated return. If this parameter is not passed in, 20 will be used by default. Maximum value: 50. 
     * @return Offset Number of topics to be returned per page in case of paginated return. If this parameter is not passed in, 20 will be used by default. Maximum value: 50.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Number of topics to be returned per page in case of paginated return. If this parameter is not passed in, 20 will be used by default. Maximum value: 50.
     * @param Offset Number of topics to be returned per page in case of paginated return. If this parameter is not passed in, 20 will be used by default. Maximum value: 50.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Filter by `SourceQueueName` 
     * @return SourceQueueName Filter by `SourceQueueName`
     */
    public String getSourceQueueName() {
        return this.SourceQueueName;
    }

    /**
     * Set Filter by `SourceQueueName`
     * @param SourceQueueName Filter by `SourceQueueName`
     */
    public void setSourceQueueName(String SourceQueueName) {
        this.SourceQueueName = SourceQueueName;
    }

    public DescribeCmqDeadLetterSourceQueuesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCmqDeadLetterSourceQueuesRequest(DescribeCmqDeadLetterSourceQueuesRequest source) {
        if (source.DeadLetterQueueName != null) {
            this.DeadLetterQueueName = new String(source.DeadLetterQueueName);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.SourceQueueName != null) {
            this.SourceQueueName = new String(source.SourceQueueName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeadLetterQueueName", this.DeadLetterQueueName);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "SourceQueueName", this.SourceQueueName);

    }
}

