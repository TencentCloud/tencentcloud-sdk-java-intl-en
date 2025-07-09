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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClassifyLabel extends AbstractModel {

    /**
    * Label name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Label description.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Label value range.
    */
    @SerializedName("Values")
    @Expose
    private String [] Values;

    /**
     * Get Label name. 
     * @return Name Label name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Label name.
     * @param Name Label name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Label description. 
     * @return Description Label description.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Label description.
     * @param Description Label description.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Label value range. 
     * @return Values Label value range.
     */
    public String [] getValues() {
        return this.Values;
    }

    /**
     * Set Label value range.
     * @param Values Label value range.
     */
    public void setValues(String [] Values) {
        this.Values = Values;
    }

    public ClassifyLabel() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClassifyLabel(ClassifyLabel source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Values != null) {
            this.Values = new String[source.Values.length];
            for (int i = 0; i < source.Values.length; i++) {
                this.Values[i] = new String(source.Values[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArraySimple(map, prefix + "Values.", this.Values);

    }
}

