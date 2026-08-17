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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ContainerDiagnoseResultItem extends AbstractModel {

    /**
    * 
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * 
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 
    */
    @SerializedName("SeverityLevel")
    @Expose
    private String SeverityLevel;

    /**
    * 
    */
    @SerializedName("DateTimeSet")
    @Expose
    private String [] DateTimeSet;

    /**
    * 
    */
    @SerializedName("TimestampSet")
    @Expose
    private Float [] TimestampSet;

    /**
     * Get  
     * @return Category 
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set 
     * @param Category 
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * Get  
     * @return Type 
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 
     * @param Type 
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get  
     * @return SeverityLevel 
     */
    public String getSeverityLevel() {
        return this.SeverityLevel;
    }

    /**
     * Set 
     * @param SeverityLevel 
     */
    public void setSeverityLevel(String SeverityLevel) {
        this.SeverityLevel = SeverityLevel;
    }

    /**
     * Get  
     * @return DateTimeSet 
     */
    public String [] getDateTimeSet() {
        return this.DateTimeSet;
    }

    /**
     * Set 
     * @param DateTimeSet 
     */
    public void setDateTimeSet(String [] DateTimeSet) {
        this.DateTimeSet = DateTimeSet;
    }

    /**
     * Get  
     * @return TimestampSet 
     */
    public Float [] getTimestampSet() {
        return this.TimestampSet;
    }

    /**
     * Set 
     * @param TimestampSet 
     */
    public void setTimestampSet(Float [] TimestampSet) {
        this.TimestampSet = TimestampSet;
    }

    public ContainerDiagnoseResultItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ContainerDiagnoseResultItem(ContainerDiagnoseResultItem source) {
        if (source.Category != null) {
            this.Category = new String(source.Category);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.SeverityLevel != null) {
            this.SeverityLevel = new String(source.SeverityLevel);
        }
        if (source.DateTimeSet != null) {
            this.DateTimeSet = new String[source.DateTimeSet.length];
            for (int i = 0; i < source.DateTimeSet.length; i++) {
                this.DateTimeSet[i] = new String(source.DateTimeSet[i]);
            }
        }
        if (source.TimestampSet != null) {
            this.TimestampSet = new Float[source.TimestampSet.length];
            for (int i = 0; i < source.TimestampSet.length; i++) {
                this.TimestampSet[i] = new Float(source.TimestampSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "SeverityLevel", this.SeverityLevel);
        this.setParamArraySimple(map, prefix + "DateTimeSet.", this.DateTimeSet);
        this.setParamArraySimple(map, prefix + "TimestampSet.", this.TimestampSet);

    }
}

