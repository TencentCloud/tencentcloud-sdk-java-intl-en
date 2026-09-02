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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ComplianceStandardRuleCount extends AbstractModel {

    /**
    * <p>Standard ID</p>
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * <p>Specification name</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Number of associated check items</p>
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
     * Get <p>Standard ID</p> 
     * @return ID <p>Standard ID</p>
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set <p>Standard ID</p>
     * @param ID <p>Standard ID</p>
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get <p>Specification name</p> 
     * @return Name <p>Specification name</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Specification name</p>
     * @param Name <p>Specification name</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Number of associated check items</p> 
     * @return Count <p>Number of associated check items</p>
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set <p>Number of associated check items</p>
     * @param Count <p>Number of associated check items</p>
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    public ComplianceStandardRuleCount() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComplianceStandardRuleCount(ComplianceStandardRuleCount source) {
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Count", this.Count);

    }
}

