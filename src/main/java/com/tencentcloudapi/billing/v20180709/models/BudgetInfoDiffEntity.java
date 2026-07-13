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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BudgetInfoDiffEntity extends AbstractModel {

    /**
    * Modify properties
    */
    @SerializedName("Property")
    @Expose
    private String Property;

    /**
    * Content before modification.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Before")
    @Expose
    private String Before;

    /**
    * Content after modification.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("After")
    @Expose
    private String After;

    /**
     * Get Modify properties 
     * @return Property Modify properties
     */
    public String getProperty() {
        return this.Property;
    }

    /**
     * Set Modify properties
     * @param Property Modify properties
     */
    public void setProperty(String Property) {
        this.Property = Property;
    }

    /**
     * Get Content before modification.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Before Content before modification.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getBefore() {
        return this.Before;
    }

    /**
     * Set Content before modification.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Before Content before modification.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBefore(String Before) {
        this.Before = Before;
    }

    /**
     * Get Content after modification.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return After Content after modification.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAfter() {
        return this.After;
    }

    /**
     * Set Content after modification.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param After Content after modification.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAfter(String After) {
        this.After = After;
    }

    public BudgetInfoDiffEntity() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BudgetInfoDiffEntity(BudgetInfoDiffEntity source) {
        if (source.Property != null) {
            this.Property = new String(source.Property);
        }
        if (source.Before != null) {
            this.Before = new String(source.Before);
        }
        if (source.After != null) {
            this.After = new String(source.After);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Property", this.Property);
        this.setParamSimple(map, prefix + "Before", this.Before);
        this.setParamSimple(map, prefix + "After", this.After);

    }
}

