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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RenameInstanceRequest extends AbstractModel {

    /**
    * Instance ID. Format: cmgo-p8vnipr5. Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/MongoDB#/) and copy the instance ID from the instance list.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Custom instance name. It can contain any character, with a length from 1 to 128 characters.
    */
    @SerializedName("NewName")
    @Expose
    private String NewName;

    /**
     * Get Instance ID. Format: cmgo-p8vnipr5. Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/MongoDB#/) and copy the instance ID from the instance list. 
     * @return InstanceId Instance ID. Format: cmgo-p8vnipr5. Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/MongoDB#/) and copy the instance ID from the instance list.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID. Format: cmgo-p8vnipr5. Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/MongoDB#/) and copy the instance ID from the instance list.
     * @param InstanceId Instance ID. Format: cmgo-p8vnipr5. Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/MongoDB#/) and copy the instance ID from the instance list.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Custom instance name. It can contain any character, with a length from 1 to 128 characters. 
     * @return NewName Custom instance name. It can contain any character, with a length from 1 to 128 characters.
     */
    public String getNewName() {
        return this.NewName;
    }

    /**
     * Set Custom instance name. It can contain any character, with a length from 1 to 128 characters.
     * @param NewName Custom instance name. It can contain any character, with a length from 1 to 128 characters.
     */
    public void setNewName(String NewName) {
        this.NewName = NewName;
    }

    public RenameInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RenameInstanceRequest(RenameInstanceRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.NewName != null) {
            this.NewName = new String(source.NewName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "NewName", this.NewName);

    }
}

