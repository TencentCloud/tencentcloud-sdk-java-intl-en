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
package com.tencentcloudapi.mqtt.v20240516.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyUserRequest extends AbstractModel {

    /**
    * Instance ID, obtained from the [DescribeInstanceList](https://www.tencentcloud.com/document/api/1778/111029?from_cn_redirect=1) api or console.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Username.
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * Specifies the remark with length not exceeding 128 characters.
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get Instance ID, obtained from the [DescribeInstanceList](https://www.tencentcloud.com/document/api/1778/111029?from_cn_redirect=1) api or console. 
     * @return InstanceId Instance ID, obtained from the [DescribeInstanceList](https://www.tencentcloud.com/document/api/1778/111029?from_cn_redirect=1) api or console.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID, obtained from the [DescribeInstanceList](https://www.tencentcloud.com/document/api/1778/111029?from_cn_redirect=1) api or console.
     * @param InstanceId Instance ID, obtained from the [DescribeInstanceList](https://www.tencentcloud.com/document/api/1778/111029?from_cn_redirect=1) api or console.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Username. 
     * @return Username Username.
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set Username.
     * @param Username Username.
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * Get Specifies the remark with length not exceeding 128 characters. 
     * @return Remark Specifies the remark with length not exceeding 128 characters.
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Specifies the remark with length not exceeding 128 characters.
     * @param Remark Specifies the remark with length not exceeding 128 characters.
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public ModifyUserRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyUserRequest(ModifyUserRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Username != null) {
            this.Username = new String(source.Username);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Username", this.Username);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

