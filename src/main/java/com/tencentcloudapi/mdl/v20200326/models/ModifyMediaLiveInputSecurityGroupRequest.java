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
package com.tencentcloudapi.mdl.v20200326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyMediaLiveInputSecurityGroupRequest extends AbstractModel{

    /**
    * Input security group ID.
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Input security group name, which can contain 1–32 letters, digits, and underscores and must be unique at the region level.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * List of whitelist entries. Up to 10 entries are allowed.
    */
    @SerializedName("Whitelist")
    @Expose
    private String [] Whitelist;

    /**
     * Get Input security group ID. 
     * @return Id Input security group ID.
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Input security group ID.
     * @param Id Input security group ID.
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Input security group name, which can contain 1–32 letters, digits, and underscores and must be unique at the region level. 
     * @return Name Input security group name, which can contain 1–32 letters, digits, and underscores and must be unique at the region level.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Input security group name, which can contain 1–32 letters, digits, and underscores and must be unique at the region level.
     * @param Name Input security group name, which can contain 1–32 letters, digits, and underscores and must be unique at the region level.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get List of whitelist entries. Up to 10 entries are allowed. 
     * @return Whitelist List of whitelist entries. Up to 10 entries are allowed.
     */
    public String [] getWhitelist() {
        return this.Whitelist;
    }

    /**
     * Set List of whitelist entries. Up to 10 entries are allowed.
     * @param Whitelist List of whitelist entries. Up to 10 entries are allowed.
     */
    public void setWhitelist(String [] Whitelist) {
        this.Whitelist = Whitelist;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "Whitelist.", this.Whitelist);

    }
}

