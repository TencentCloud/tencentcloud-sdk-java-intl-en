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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyServiceAccountPasswordRequest extends AbstractModel {

    /**
    * Instance ID.
    */
    @SerializedName("RegistryId")
    @Expose
    private String RegistryId;

    /**
    * Service level account name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Whether to randomly generate a password.
    */
    @SerializedName("Random")
    @Expose
    private Boolean Random;

    /**
    * Service level account password, 8 to 20 characters, contains at least one uppercase letter, one lowercase letter, and one number.
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
     * Get Instance ID. 
     * @return RegistryId Instance ID.
     */
    public String getRegistryId() {
        return this.RegistryId;
    }

    /**
     * Set Instance ID.
     * @param RegistryId Instance ID.
     */
    public void setRegistryId(String RegistryId) {
        this.RegistryId = RegistryId;
    }

    /**
     * Get Service level account name. 
     * @return Name Service level account name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Service level account name.
     * @param Name Service level account name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Whether to randomly generate a password. 
     * @return Random Whether to randomly generate a password.
     */
    public Boolean getRandom() {
        return this.Random;
    }

    /**
     * Set Whether to randomly generate a password.
     * @param Random Whether to randomly generate a password.
     */
    public void setRandom(Boolean Random) {
        this.Random = Random;
    }

    /**
     * Get Service level account password, 8 to 20 characters, contains at least one uppercase letter, one lowercase letter, and one number. 
     * @return Password Service level account password, 8 to 20 characters, contains at least one uppercase letter, one lowercase letter, and one number.
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set Service level account password, 8 to 20 characters, contains at least one uppercase letter, one lowercase letter, and one number.
     * @param Password Service level account password, 8 to 20 characters, contains at least one uppercase letter, one lowercase letter, and one number.
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    public ModifyServiceAccountPasswordRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyServiceAccountPasswordRequest(ModifyServiceAccountPasswordRequest source) {
        if (source.RegistryId != null) {
            this.RegistryId = new String(source.RegistryId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Random != null) {
            this.Random = new Boolean(source.Random);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegistryId", this.RegistryId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Random", this.Random);
        this.setParamSimple(map, prefix + "Password", this.Password);

    }
}

