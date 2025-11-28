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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClearCmqQueueRequest extends AbstractModel {

    /**
    * Queue name, unique under the same account in a single region. queue name is a string of no more than 64 characters, beginning with a letter, the rest may contain letters, digits, and hyphens (-).
    */
    @SerializedName("QueueName")
    @Expose
    private String QueueName;

    /**
     * Get Queue name, unique under the same account in a single region. queue name is a string of no more than 64 characters, beginning with a letter, the rest may contain letters, digits, and hyphens (-). 
     * @return QueueName Queue name, unique under the same account in a single region. queue name is a string of no more than 64 characters, beginning with a letter, the rest may contain letters, digits, and hyphens (-).
     */
    public String getQueueName() {
        return this.QueueName;
    }

    /**
     * Set Queue name, unique under the same account in a single region. queue name is a string of no more than 64 characters, beginning with a letter, the rest may contain letters, digits, and hyphens (-).
     * @param QueueName Queue name, unique under the same account in a single region. queue name is a string of no more than 64 characters, beginning with a letter, the rest may contain letters, digits, and hyphens (-).
     */
    public void setQueueName(String QueueName) {
        this.QueueName = QueueName;
    }

    public ClearCmqQueueRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClearCmqQueueRequest(ClearCmqQueueRequest source) {
        if (source.QueueName != null) {
            this.QueueName = new String(source.QueueName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "QueueName", this.QueueName);

    }
}

