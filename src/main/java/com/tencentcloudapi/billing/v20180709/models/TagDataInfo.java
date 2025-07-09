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

public class TagDataInfo extends AbstractModel {

    /**
    * Cost allocation tag key.
    */
    @SerializedName("TagKey")
    @Expose
    private String TagKey;

    /**
    * Tag type. Valid values: `0` (general tags), `1` (cost allocation tags).
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Time to set the cost allocation tag. It will not be returned if `Status` is `0`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get Cost allocation tag key. 
     * @return TagKey Cost allocation tag key.
     */
    public String getTagKey() {
        return this.TagKey;
    }

    /**
     * Set Cost allocation tag key.
     * @param TagKey Cost allocation tag key.
     */
    public void setTagKey(String TagKey) {
        this.TagKey = TagKey;
    }

    /**
     * Get Tag type. Valid values: `0` (general tags), `1` (cost allocation tags). 
     * @return Status Tag type. Valid values: `0` (general tags), `1` (cost allocation tags).
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Tag type. Valid values: `0` (general tags), `1` (cost allocation tags).
     * @param Status Tag type. Valid values: `0` (general tags), `1` (cost allocation tags).
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Time to set the cost allocation tag. It will not be returned if `Status` is `0`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UpdateTime Time to set the cost allocation tag. It will not be returned if `Status` is `0`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Time to set the cost allocation tag. It will not be returned if `Status` is `0`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UpdateTime Time to set the cost allocation tag. It will not be returned if `Status` is `0`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public TagDataInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TagDataInfo(TagDataInfo source) {
        if (source.TagKey != null) {
            this.TagKey = new String(source.TagKey);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TagKey", this.TagKey);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

