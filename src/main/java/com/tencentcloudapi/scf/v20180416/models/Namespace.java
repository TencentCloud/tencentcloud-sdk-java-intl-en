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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Namespace extends AbstractModel{

    /**
    * Creation time of the namespace
    */
    @SerializedName("ModTime")
    @Expose
    private String ModTime;

    /**
    * Modification time of the namespace
    */
    @SerializedName("AddTime")
    @Expose
    private String AddTime;

    /**
    * Namespace description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Namespace name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * The default value is default. TCB indicates that the namespace is developed and created through the mini-program cloud.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get Creation time of the namespace 
     * @return ModTime Creation time of the namespace
     */
    public String getModTime() {
        return this.ModTime;
    }

    /**
     * Set Creation time of the namespace
     * @param ModTime Creation time of the namespace
     */
    public void setModTime(String ModTime) {
        this.ModTime = ModTime;
    }

    /**
     * Get Modification time of the namespace 
     * @return AddTime Modification time of the namespace
     */
    public String getAddTime() {
        return this.AddTime;
    }

    /**
     * Set Modification time of the namespace
     * @param AddTime Modification time of the namespace
     */
    public void setAddTime(String AddTime) {
        this.AddTime = AddTime;
    }

    /**
     * Get Namespace description 
     * @return Description Namespace description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Namespace description
     * @param Description Namespace description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Namespace name 
     * @return Name Namespace name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Namespace name
     * @param Name Namespace name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get The default value is default. TCB indicates that the namespace is developed and created through the mini-program cloud. 
     * @return Type The default value is default. TCB indicates that the namespace is developed and created through the mini-program cloud.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set The default value is default. TCB indicates that the namespace is developed and created through the mini-program cloud.
     * @param Type The default value is default. TCB indicates that the namespace is developed and created through the mini-program cloud.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public Namespace() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Namespace(Namespace source) {
        if (source.ModTime != null) {
            this.ModTime = new String(source.ModTime);
        }
        if (source.AddTime != null) {
            this.AddTime = new String(source.AddTime);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModTime", this.ModTime);
        this.setParamSimple(map, prefix + "AddTime", this.AddTime);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

