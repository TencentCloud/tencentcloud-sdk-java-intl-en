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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyInstancePasswordPolicyRequest extends AbstractModel {

    /**
    * <p>Instance ID. Log in to the <a href="https://console.cloud.tencent.com/redis">Redis console</a> and copy it from the instance list.</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Password complexity policy control object for instances, including verification metrics for password length and minimum number of various types of characters (letters/digits/special symbols).</p>
    */
    @SerializedName("PasswordPolicy")
    @Expose
    private PasswordPolicy PasswordPolicy;

    /**
     * Get <p>Instance ID. Log in to the <a href="https://console.cloud.tencent.com/redis">Redis console</a> and copy it from the instance list.</p> 
     * @return InstanceId <p>Instance ID. Log in to the <a href="https://console.cloud.tencent.com/redis">Redis console</a> and copy it from the instance list.</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Instance ID. Log in to the <a href="https://console.cloud.tencent.com/redis">Redis console</a> and copy it from the instance list.</p>
     * @param InstanceId <p>Instance ID. Log in to the <a href="https://console.cloud.tencent.com/redis">Redis console</a> and copy it from the instance list.</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Password complexity policy control object for instances, including verification metrics for password length and minimum number of various types of characters (letters/digits/special symbols).</p> 
     * @return PasswordPolicy <p>Password complexity policy control object for instances, including verification metrics for password length and minimum number of various types of characters (letters/digits/special symbols).</p>
     */
    public PasswordPolicy getPasswordPolicy() {
        return this.PasswordPolicy;
    }

    /**
     * Set <p>Password complexity policy control object for instances, including verification metrics for password length and minimum number of various types of characters (letters/digits/special symbols).</p>
     * @param PasswordPolicy <p>Password complexity policy control object for instances, including verification metrics for password length and minimum number of various types of characters (letters/digits/special symbols).</p>
     */
    public void setPasswordPolicy(PasswordPolicy PasswordPolicy) {
        this.PasswordPolicy = PasswordPolicy;
    }

    public ModifyInstancePasswordPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyInstancePasswordPolicyRequest(ModifyInstancePasswordPolicyRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.PasswordPolicy != null) {
            this.PasswordPolicy = new PasswordPolicy(source.PasswordPolicy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamObj(map, prefix + "PasswordPolicy.", this.PasswordPolicy);

    }
}

