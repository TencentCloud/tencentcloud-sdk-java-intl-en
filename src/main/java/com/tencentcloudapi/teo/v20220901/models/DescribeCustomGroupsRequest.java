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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCustomGroupsRequest extends AbstractModel {

    /**
    * <p>Site ID.</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * <p>List of custom group types. If not specified, all types are queried.</p>
    */
    @SerializedName("GroupTypes")
    @Expose
    private String [] GroupTypes;

    /**
    * <p>Number limit of paginated query.</p><p>Valid range: [1, 100]</p><p>Default value: 10</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>Offset of paginated query.</p><p>Default value: 0</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get <p>Site ID.</p> 
     * @return ZoneId <p>Site ID.</p>
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>Site ID.</p>
     * @param ZoneId <p>Site ID.</p>
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>List of custom group types. If not specified, all types are queried.</p> 
     * @return GroupTypes <p>List of custom group types. If not specified, all types are queried.</p>
     */
    public String [] getGroupTypes() {
        return this.GroupTypes;
    }

    /**
     * Set <p>List of custom group types. If not specified, all types are queried.</p>
     * @param GroupTypes <p>List of custom group types. If not specified, all types are queried.</p>
     */
    public void setGroupTypes(String [] GroupTypes) {
        this.GroupTypes = GroupTypes;
    }

    /**
     * Get <p>Number limit of paginated query.</p><p>Valid range: [1, 100]</p><p>Default value: 10</p> 
     * @return Limit <p>Number limit of paginated query.</p><p>Valid range: [1, 100]</p><p>Default value: 10</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>Number limit of paginated query.</p><p>Valid range: [1, 100]</p><p>Default value: 10</p>
     * @param Limit <p>Number limit of paginated query.</p><p>Valid range: [1, 100]</p><p>Default value: 10</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>Offset of paginated query.</p><p>Default value: 0</p> 
     * @return Offset <p>Offset of paginated query.</p><p>Default value: 0</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>Offset of paginated query.</p><p>Default value: 0</p>
     * @param Offset <p>Offset of paginated query.</p><p>Default value: 0</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeCustomGroupsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCustomGroupsRequest(DescribeCustomGroupsRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.GroupTypes != null) {
            this.GroupTypes = new String[source.GroupTypes.length];
            for (int i = 0; i < source.GroupTypes.length; i++) {
                this.GroupTypes[i] = new String(source.GroupTypes[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamArraySimple(map, prefix + "GroupTypes.", this.GroupTypes);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

