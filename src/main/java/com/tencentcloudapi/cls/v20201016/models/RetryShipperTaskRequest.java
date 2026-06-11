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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RetryShipperTaskRequest extends AbstractModel {

    /**
    * Shipping Rule Id.

-Obtain the ShipperId by [obtaining the shipping task list](https://www.tencentcloud.com/document/product/614/58745?from_cn_redirect=1).
    */
    @SerializedName("ShipperId")
    @Expose
    private String ShipperId;

    /**
    * Delivery task Id.

-Obtain the TaskId by searching the shipping task list (https://www.tencentcloud.com/document/product/614/58745?from_cn_redirect=1).
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
     * Get Shipping Rule Id.

-Obtain the ShipperId by [obtaining the shipping task list](https://www.tencentcloud.com/document/product/614/58745?from_cn_redirect=1). 
     * @return ShipperId Shipping Rule Id.

-Obtain the ShipperId by [obtaining the shipping task list](https://www.tencentcloud.com/document/product/614/58745?from_cn_redirect=1).
     */
    public String getShipperId() {
        return this.ShipperId;
    }

    /**
     * Set Shipping Rule Id.

-Obtain the ShipperId by [obtaining the shipping task list](https://www.tencentcloud.com/document/product/614/58745?from_cn_redirect=1).
     * @param ShipperId Shipping Rule Id.

-Obtain the ShipperId by [obtaining the shipping task list](https://www.tencentcloud.com/document/product/614/58745?from_cn_redirect=1).
     */
    public void setShipperId(String ShipperId) {
        this.ShipperId = ShipperId;
    }

    /**
     * Get Delivery task Id.

-Obtain the TaskId by searching the shipping task list (https://www.tencentcloud.com/document/product/614/58745?from_cn_redirect=1). 
     * @return TaskId Delivery task Id.

-Obtain the TaskId by searching the shipping task list (https://www.tencentcloud.com/document/product/614/58745?from_cn_redirect=1).
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Delivery task Id.

-Obtain the TaskId by searching the shipping task list (https://www.tencentcloud.com/document/product/614/58745?from_cn_redirect=1).
     * @param TaskId Delivery task Id.

-Obtain the TaskId by searching the shipping task list (https://www.tencentcloud.com/document/product/614/58745?from_cn_redirect=1).
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    public RetryShipperTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RetryShipperTaskRequest(RetryShipperTaskRequest source) {
        if (source.ShipperId != null) {
            this.ShipperId = new String(source.ShipperId);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ShipperId", this.ShipperId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);

    }
}

