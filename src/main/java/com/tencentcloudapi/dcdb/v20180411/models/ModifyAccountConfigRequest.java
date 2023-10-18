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
package com.tencentcloudapi.dcdb.v20180411.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAccountConfigRequest extends AbstractModel {

    /**
    * Instance ID in the format of  `tdsqlshard-kpkvq5oj`, which is the same as the one displayed in the TencentDB console.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Account name
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * Account domain name
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * Configuration list. Each element in the list is a pair of `Config` and `Value`.
    */
    @SerializedName("Configs")
    @Expose
    private ConfigValue [] Configs;

    /**
     * Get Instance ID in the format of  `tdsqlshard-kpkvq5oj`, which is the same as the one displayed in the TencentDB console. 
     * @return InstanceId Instance ID in the format of  `tdsqlshard-kpkvq5oj`, which is the same as the one displayed in the TencentDB console.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID in the format of  `tdsqlshard-kpkvq5oj`, which is the same as the one displayed in the TencentDB console.
     * @param InstanceId Instance ID in the format of  `tdsqlshard-kpkvq5oj`, which is the same as the one displayed in the TencentDB console.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Account name 
     * @return UserName Account name
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set Account name
     * @param UserName Account name
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get Account domain name 
     * @return Host Account domain name
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set Account domain name
     * @param Host Account domain name
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get Configuration list. Each element in the list is a pair of `Config` and `Value`. 
     * @return Configs Configuration list. Each element in the list is a pair of `Config` and `Value`.
     */
    public ConfigValue [] getConfigs() {
        return this.Configs;
    }

    /**
     * Set Configuration list. Each element in the list is a pair of `Config` and `Value`.
     * @param Configs Configuration list. Each element in the list is a pair of `Config` and `Value`.
     */
    public void setConfigs(ConfigValue [] Configs) {
        this.Configs = Configs;
    }

    public ModifyAccountConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAccountConfigRequest(ModifyAccountConfigRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.Configs != null) {
            this.Configs = new ConfigValue[source.Configs.length];
            for (int i = 0; i < source.Configs.length; i++) {
                this.Configs[i] = new ConfigValue(source.Configs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamArrayObj(map, prefix + "Configs.", this.Configs);

    }
}

