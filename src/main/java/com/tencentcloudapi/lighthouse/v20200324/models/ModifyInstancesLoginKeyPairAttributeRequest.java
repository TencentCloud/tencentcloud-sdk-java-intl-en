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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyInstancesLoginKeyPairAttributeRequest extends AbstractModel {

    /**
    * Instance ID list. Each request can contain up to 100 instances at a time.
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * Whether to allow login with the default key pair. Valid values: YES: yes; NO: no.
    */
    @SerializedName("PermitLogin")
    @Expose
    private String PermitLogin;

    /**
     * Get Instance ID list. Each request can contain up to 100 instances at a time. 
     * @return InstanceIds Instance ID list. Each request can contain up to 100 instances at a time.
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set Instance ID list. Each request can contain up to 100 instances at a time.
     * @param InstanceIds Instance ID list. Each request can contain up to 100 instances at a time.
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get Whether to allow login with the default key pair. Valid values: YES: yes; NO: no. 
     * @return PermitLogin Whether to allow login with the default key pair. Valid values: YES: yes; NO: no.
     */
    public String getPermitLogin() {
        return this.PermitLogin;
    }

    /**
     * Set Whether to allow login with the default key pair. Valid values: YES: yes; NO: no.
     * @param PermitLogin Whether to allow login with the default key pair. Valid values: YES: yes; NO: no.
     */
    public void setPermitLogin(String PermitLogin) {
        this.PermitLogin = PermitLogin;
    }

    public ModifyInstancesLoginKeyPairAttributeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyInstancesLoginKeyPairAttributeRequest(ModifyInstancesLoginKeyPairAttributeRequest source) {
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.PermitLogin != null) {
            this.PermitLogin = new String(source.PermitLogin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "PermitLogin", this.PermitLogin);

    }
}

