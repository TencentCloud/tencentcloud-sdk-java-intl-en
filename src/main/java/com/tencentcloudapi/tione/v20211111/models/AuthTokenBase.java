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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AuthTokenBase extends AbstractModel {

    /**
    * Token value.
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * Token alias.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Token description.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Token creation time.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Token status.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get Token value. 
     * @return Value Token value.
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set Token value.
     * @param Value Token value.
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get Token alias. 
     * @return Name Token alias.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Token alias.
     * @param Name Token alias.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Token description. 
     * @return Description Token description.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Token description.
     * @param Description Token description.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Token creation time. 
     * @return CreateTime Token creation time.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Token creation time.
     * @param CreateTime Token creation time.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Token status. 
     * @return Status Token status.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Token status.
     * @param Status Token status.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public AuthTokenBase() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AuthTokenBase(AuthTokenBase source) {
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

