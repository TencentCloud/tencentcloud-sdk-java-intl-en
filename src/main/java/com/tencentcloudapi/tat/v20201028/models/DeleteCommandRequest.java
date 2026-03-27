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
package com.tencentcloudapi.tat.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteCommandRequest extends AbstractModel {

    /**
    * Command ID to be deleted. call the [DescribeCommands](https://www.tencentcloud.com/document/api/1340/52681?from_cn_redirect=1) api to query command details.
    */
    @SerializedName("CommandId")
    @Expose
    private String CommandId;

    /**
     * Get Command ID to be deleted. call the [DescribeCommands](https://www.tencentcloud.com/document/api/1340/52681?from_cn_redirect=1) api to query command details. 
     * @return CommandId Command ID to be deleted. call the [DescribeCommands](https://www.tencentcloud.com/document/api/1340/52681?from_cn_redirect=1) api to query command details.
     */
    public String getCommandId() {
        return this.CommandId;
    }

    /**
     * Set Command ID to be deleted. call the [DescribeCommands](https://www.tencentcloud.com/document/api/1340/52681?from_cn_redirect=1) api to query command details.
     * @param CommandId Command ID to be deleted. call the [DescribeCommands](https://www.tencentcloud.com/document/api/1340/52681?from_cn_redirect=1) api to query command details.
     */
    public void setCommandId(String CommandId) {
        this.CommandId = CommandId;
    }

    public DeleteCommandRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteCommandRequest(DeleteCommandRequest source) {
        if (source.CommandId != null) {
            this.CommandId = new String(source.CommandId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CommandId", this.CommandId);

    }
}

