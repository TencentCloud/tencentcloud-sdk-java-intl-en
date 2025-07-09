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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BaselineBasicInfo extends AbstractModel {

    /**
    * Baseline name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Baseline ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BaselineId")
    @Expose
    private Long BaselineId;

    /**
    * Parent ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ParentId")
    @Expose
    private Long ParentId;

    /**
     * Get Baseline name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Name Baseline name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Baseline name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Name Baseline name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Baseline ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BaselineId Baseline ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getBaselineId() {
        return this.BaselineId;
    }

    /**
     * Set Baseline ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BaselineId Baseline ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBaselineId(Long BaselineId) {
        this.BaselineId = BaselineId;
    }

    /**
     * Get Parent ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ParentId Parent ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getParentId() {
        return this.ParentId;
    }

    /**
     * Set Parent ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ParentId Parent ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setParentId(Long ParentId) {
        this.ParentId = ParentId;
    }

    public BaselineBasicInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaselineBasicInfo(BaselineBasicInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.BaselineId != null) {
            this.BaselineId = new Long(source.BaselineId);
        }
        if (source.ParentId != null) {
            this.ParentId = new Long(source.ParentId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "BaselineId", this.BaselineId);
        this.setParamSimple(map, prefix + "ParentId", this.ParentId);

    }
}

