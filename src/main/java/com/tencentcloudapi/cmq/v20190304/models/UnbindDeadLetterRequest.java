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
package com.tencentcloudapi.cmq.v20190304.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UnbindDeadLetterRequest extends AbstractModel {

    /**
    * Source queue name of dead letter policy. Calling this API will clear the dead letter queue policy of this queue.
    */
    @SerializedName("QueueName")
    @Expose
    private String QueueName;

    /**
     * Get Source queue name of dead letter policy. Calling this API will clear the dead letter queue policy of this queue. 
     * @return QueueName Source queue name of dead letter policy. Calling this API will clear the dead letter queue policy of this queue.
     */
    public String getQueueName() {
        return this.QueueName;
    }

    /**
     * Set Source queue name of dead letter policy. Calling this API will clear the dead letter queue policy of this queue.
     * @param QueueName Source queue name of dead letter policy. Calling this API will clear the dead letter queue policy of this queue.
     */
    public void setQueueName(String QueueName) {
        this.QueueName = QueueName;
    }

    public UnbindDeadLetterRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UnbindDeadLetterRequest(UnbindDeadLetterRequest source) {
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

