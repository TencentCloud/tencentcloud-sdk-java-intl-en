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
package com.tencentcloudapi.cmq.v20190304.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeadLetterSource extends AbstractModel {

    /**
    * QueueId
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("QueueId")
    @Expose
    private String QueueId;

    /**
    * QueueName
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("QueueName")
    @Expose
    private String QueueName;

    /**
     * Get QueueId
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return QueueId QueueId
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getQueueId() {
        return this.QueueId;
    }

    /**
     * Set QueueId
Note: this field may return null, indicating that no valid values can be obtained.
     * @param QueueId QueueId
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setQueueId(String QueueId) {
        this.QueueId = QueueId;
    }

    /**
     * Get QueueName
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return QueueName QueueName
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getQueueName() {
        return this.QueueName;
    }

    /**
     * Set QueueName
Note: this field may return null, indicating that no valid values can be obtained.
     * @param QueueName QueueName
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setQueueName(String QueueName) {
        this.QueueName = QueueName;
    }

    public DeadLetterSource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeadLetterSource(DeadLetterSource source) {
        if (source.QueueId != null) {
            this.QueueId = new String(source.QueueId);
        }
        if (source.QueueName != null) {
            this.QueueName = new String(source.QueueName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "QueueId", this.QueueId);
        this.setParamSimple(map, prefix + "QueueName", this.QueueName);

    }
}

