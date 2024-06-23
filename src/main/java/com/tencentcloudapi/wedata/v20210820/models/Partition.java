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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Partition extends AbstractModel {

    /**
    * Partition Conversion Strategy
    */
    @SerializedName("Transform")
    @Expose
    private String Transform;

    /**
    * Partition Field Name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Policy Parameter
    */
    @SerializedName("TransformArgs")
    @Expose
    private String [] TransformArgs;

    /**
     * Get Partition Conversion Strategy 
     * @return Transform Partition Conversion Strategy
     */
    public String getTransform() {
        return this.Transform;
    }

    /**
     * Set Partition Conversion Strategy
     * @param Transform Partition Conversion Strategy
     */
    public void setTransform(String Transform) {
        this.Transform = Transform;
    }

    /**
     * Get Partition Field Name 
     * @return Name Partition Field Name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Partition Field Name
     * @param Name Partition Field Name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Policy Parameter 
     * @return TransformArgs Policy Parameter
     */
    public String [] getTransformArgs() {
        return this.TransformArgs;
    }

    /**
     * Set Policy Parameter
     * @param TransformArgs Policy Parameter
     */
    public void setTransformArgs(String [] TransformArgs) {
        this.TransformArgs = TransformArgs;
    }

    public Partition() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Partition(Partition source) {
        if (source.Transform != null) {
            this.Transform = new String(source.Transform);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.TransformArgs != null) {
            this.TransformArgs = new String[source.TransformArgs.length];
            for (int i = 0; i < source.TransformArgs.length; i++) {
                this.TransformArgs[i] = new String(source.TransformArgs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Transform", this.Transform);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "TransformArgs.", this.TransformArgs);

    }
}

