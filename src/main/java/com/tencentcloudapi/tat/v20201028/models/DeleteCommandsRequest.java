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

public class DeleteCommandsRequest extends AbstractModel {

    /**
    * Command ID to be deleted. call the [DescribeCommands](https://www.tencentcloud.comom/document/api/1340/52681?from_cn_redirect=1) api to query command details.
    */
    @SerializedName("CommandIds")
    @Expose
    private String [] CommandIds;

    /**
     * Get Command ID to be deleted. call the [DescribeCommands](https://www.tencentcloud.comom/document/api/1340/52681?from_cn_redirect=1) api to query command details. 
     * @return CommandIds Command ID to be deleted. call the [DescribeCommands](https://www.tencentcloud.comom/document/api/1340/52681?from_cn_redirect=1) api to query command details.
     */
    public String [] getCommandIds() {
        return this.CommandIds;
    }

    /**
     * Set Command ID to be deleted. call the [DescribeCommands](https://www.tencentcloud.comom/document/api/1340/52681?from_cn_redirect=1) api to query command details.
     * @param CommandIds Command ID to be deleted. call the [DescribeCommands](https://www.tencentcloud.comom/document/api/1340/52681?from_cn_redirect=1) api to query command details.
     */
    public void setCommandIds(String [] CommandIds) {
        this.CommandIds = CommandIds;
    }

    public DeleteCommandsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteCommandsRequest(DeleteCommandsRequest source) {
        if (source.CommandIds != null) {
            this.CommandIds = new String[source.CommandIds.length];
            for (int i = 0; i < source.CommandIds.length; i++) {
                this.CommandIds[i] = new String(source.CommandIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "CommandIds.", this.CommandIds);

    }
}

