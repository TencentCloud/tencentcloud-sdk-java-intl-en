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
package com.tencentcloudapi.yunjing.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AccountStatistics extends AbstractModel {

    /**
    * Username.
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * Number of servers.
    */
    @SerializedName("MachineNum")
    @Expose
    private Long MachineNum;

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
     * Get Number of servers. 
     * @return MachineNum Number of servers.
     */
    public Long getMachineNum() {
        return this.MachineNum;
    }

    /**
     * Set Number of servers.
     * @param MachineNum Number of servers.
     */
    public void setMachineNum(Long MachineNum) {
        this.MachineNum = MachineNum;
    }

    public AccountStatistics() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AccountStatistics(AccountStatistics source) {
        if (source.Username != null) {
            this.Username = new String(source.Username);
        }
        if (source.MachineNum != null) {
            this.MachineNum = new Long(source.MachineNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Username", this.Username);
        this.setParamSimple(map, prefix + "MachineNum", this.MachineNum);

    }
}

