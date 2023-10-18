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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateRocketMQClusterRequest extends AbstractModel {

    /**
    * Cluster name, which can contain 3–64 letters, digits, hyphens, and underscores
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Cluster description (up to 128 characters)
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get Cluster name, which can contain 3–64 letters, digits, hyphens, and underscores 
     * @return Name Cluster name, which can contain 3–64 letters, digits, hyphens, and underscores
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Cluster name, which can contain 3–64 letters, digits, hyphens, and underscores
     * @param Name Cluster name, which can contain 3–64 letters, digits, hyphens, and underscores
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Cluster description (up to 128 characters) 
     * @return Remark Cluster description (up to 128 characters)
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Cluster description (up to 128 characters)
     * @param Remark Cluster description (up to 128 characters)
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public CreateRocketMQClusterRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateRocketMQClusterRequest(CreateRocketMQClusterRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

