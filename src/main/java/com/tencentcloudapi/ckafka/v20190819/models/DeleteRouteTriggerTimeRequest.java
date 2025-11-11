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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteRouteTriggerTimeRequest extends AbstractModel {

    /**
    * ckafka cluster instance Id. obtain through the API [DescribeInstances](https://www.tencentcloud.comom/document/product/597/40835?from_cn_redirect=1).
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Modifies the scheduled time for deleting routes.
    */
    @SerializedName("DelayTime")
    @Expose
    private String DelayTime;

    /**
     * Get ckafka cluster instance Id. obtain through the API [DescribeInstances](https://www.tencentcloud.comom/document/product/597/40835?from_cn_redirect=1). 
     * @return InstanceId ckafka cluster instance Id. obtain through the API [DescribeInstances](https://www.tencentcloud.comom/document/product/597/40835?from_cn_redirect=1).
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set ckafka cluster instance Id. obtain through the API [DescribeInstances](https://www.tencentcloud.comom/document/product/597/40835?from_cn_redirect=1).
     * @param InstanceId ckafka cluster instance Id. obtain through the API [DescribeInstances](https://www.tencentcloud.comom/document/product/597/40835?from_cn_redirect=1).
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Modifies the scheduled time for deleting routes. 
     * @return DelayTime Modifies the scheduled time for deleting routes.
     */
    public String getDelayTime() {
        return this.DelayTime;
    }

    /**
     * Set Modifies the scheduled time for deleting routes.
     * @param DelayTime Modifies the scheduled time for deleting routes.
     */
    public void setDelayTime(String DelayTime) {
        this.DelayTime = DelayTime;
    }

    public DeleteRouteTriggerTimeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteRouteTriggerTimeRequest(DeleteRouteTriggerTimeRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.DelayTime != null) {
            this.DelayTime = new String(source.DelayTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "DelayTime", this.DelayTime);

    }
}

