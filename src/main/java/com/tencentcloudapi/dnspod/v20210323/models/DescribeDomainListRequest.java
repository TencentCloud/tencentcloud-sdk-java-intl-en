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
package com.tencentcloudapi.dnspod.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDomainListRequest extends AbstractModel{

    /**
    * The domain group type. Valid values: `ALL` (default), `MINE`, `SHARE`, `ISMARK`, `PAUSE`, `VIP`, `RECENT`, `SHARE_OUT`, and `FREE`.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Record offset starting from `0`. Default value: `0`.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of domains to be obtained. For example, `20` indicates to obtain 20 domains. Default value: `3000`.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Group ID, which can be passed in to get all domains in the specified group
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * Keyword for searching for a domain
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
     * Get The domain group type. Valid values: `ALL` (default), `MINE`, `SHARE`, `ISMARK`, `PAUSE`, `VIP`, `RECENT`, `SHARE_OUT`, and `FREE`. 
     * @return Type The domain group type. Valid values: `ALL` (default), `MINE`, `SHARE`, `ISMARK`, `PAUSE`, `VIP`, `RECENT`, `SHARE_OUT`, and `FREE`.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set The domain group type. Valid values: `ALL` (default), `MINE`, `SHARE`, `ISMARK`, `PAUSE`, `VIP`, `RECENT`, `SHARE_OUT`, and `FREE`.
     * @param Type The domain group type. Valid values: `ALL` (default), `MINE`, `SHARE`, `ISMARK`, `PAUSE`, `VIP`, `RECENT`, `SHARE_OUT`, and `FREE`.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Record offset starting from `0`. Default value: `0`. 
     * @return Offset Record offset starting from `0`. Default value: `0`.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Record offset starting from `0`. Default value: `0`.
     * @param Offset Record offset starting from `0`. Default value: `0`.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of domains to be obtained. For example, `20` indicates to obtain 20 domains. Default value: `3000`. 
     * @return Limit Number of domains to be obtained. For example, `20` indicates to obtain 20 domains. Default value: `3000`.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of domains to be obtained. For example, `20` indicates to obtain 20 domains. Default value: `3000`.
     * @param Limit Number of domains to be obtained. For example, `20` indicates to obtain 20 domains. Default value: `3000`.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Group ID, which can be passed in to get all domains in the specified group 
     * @return GroupId Group ID, which can be passed in to get all domains in the specified group
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set Group ID, which can be passed in to get all domains in the specified group
     * @param GroupId Group ID, which can be passed in to get all domains in the specified group
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get Keyword for searching for a domain 
     * @return Keyword Keyword for searching for a domain
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set Keyword for searching for a domain
     * @param Keyword Keyword for searching for a domain
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    public DescribeDomainListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDomainListRequest(DescribeDomainListRequest source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.GroupId != null) {
            this.GroupId = new Long(source.GroupId);
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);

    }
}

