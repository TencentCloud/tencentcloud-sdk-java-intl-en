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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePolicyConditionListResponseDeprecatingInfo extends AbstractModel{

    /**
    * Whether to hide
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Hidden")
    @Expose
    private Boolean Hidden;

    /**
    * Names of new views
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NewViewNames")
    @Expose
    private String [] NewViewNames;

    /**
    * Description
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get Whether to hide
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Hidden Whether to hide
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getHidden() {
        return this.Hidden;
    }

    /**
     * Set Whether to hide
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Hidden Whether to hide
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHidden(Boolean Hidden) {
        this.Hidden = Hidden;
    }

    /**
     * Get Names of new views
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return NewViewNames Names of new views
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getNewViewNames() {
        return this.NewViewNames;
    }

    /**
     * Set Names of new views
Note: This field may return null, indicating that no valid values can be obtained.
     * @param NewViewNames Names of new views
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNewViewNames(String [] NewViewNames) {
        this.NewViewNames = NewViewNames;
    }

    /**
     * Get Description
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Description Description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Description
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Description Description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public DescribePolicyConditionListResponseDeprecatingInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePolicyConditionListResponseDeprecatingInfo(DescribePolicyConditionListResponseDeprecatingInfo source) {
        if (source.Hidden != null) {
            this.Hidden = new Boolean(source.Hidden);
        }
        if (source.NewViewNames != null) {
            this.NewViewNames = new String[source.NewViewNames.length];
            for (int i = 0; i < source.NewViewNames.length; i++) {
                this.NewViewNames[i] = new String(source.NewViewNames[i]);
            }
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Hidden", this.Hidden);
        this.setParamArraySimple(map, prefix + "NewViewNames.", this.NewViewNames);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

