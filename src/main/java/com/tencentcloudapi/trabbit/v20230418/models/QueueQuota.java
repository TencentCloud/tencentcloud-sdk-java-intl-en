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
package com.tencentcloudapi.trabbit.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueueQuota extends AbstractModel {

    /**
    * Specifies the maximum number of queues that can be created.
    */
    @SerializedName("MaxQueue")
    @Expose
    private Long MaxQueue;

    /**
    * Number of queues created.
    */
    @SerializedName("UsedQueue")
    @Expose
    private Long UsedQueue;

    /**
     * Get Specifies the maximum number of queues that can be created. 
     * @return MaxQueue Specifies the maximum number of queues that can be created.
     */
    public Long getMaxQueue() {
        return this.MaxQueue;
    }

    /**
     * Set Specifies the maximum number of queues that can be created.
     * @param MaxQueue Specifies the maximum number of queues that can be created.
     */
    public void setMaxQueue(Long MaxQueue) {
        this.MaxQueue = MaxQueue;
    }

    /**
     * Get Number of queues created. 
     * @return UsedQueue Number of queues created.
     */
    public Long getUsedQueue() {
        return this.UsedQueue;
    }

    /**
     * Set Number of queues created.
     * @param UsedQueue Number of queues created.
     */
    public void setUsedQueue(Long UsedQueue) {
        this.UsedQueue = UsedQueue;
    }

    public QueueQuota() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueueQuota(QueueQuota source) {
        if (source.MaxQueue != null) {
            this.MaxQueue = new Long(source.MaxQueue);
        }
        if (source.UsedQueue != null) {
            this.UsedQueue = new Long(source.UsedQueue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MaxQueue", this.MaxQueue);
        this.setParamSimple(map, prefix + "UsedQueue", this.UsedQueue);

    }
}

