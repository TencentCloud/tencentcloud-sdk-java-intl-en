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

public class RecordCountInfo extends AbstractModel{

    /**
    * The subdomain count.
    */
    @SerializedName("SubdomainCount")
    @Expose
    private Long SubdomainCount;

    /**
    * The count of records returned in the list.
    */
    @SerializedName("ListCount")
    @Expose
    private Long ListCount;

    /**
    * The total record count.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
     * Get The subdomain count. 
     * @return SubdomainCount The subdomain count.
     */
    public Long getSubdomainCount() {
        return this.SubdomainCount;
    }

    /**
     * Set The subdomain count.
     * @param SubdomainCount The subdomain count.
     */
    public void setSubdomainCount(Long SubdomainCount) {
        this.SubdomainCount = SubdomainCount;
    }

    /**
     * Get The count of records returned in the list. 
     * @return ListCount The count of records returned in the list.
     */
    public Long getListCount() {
        return this.ListCount;
    }

    /**
     * Set The count of records returned in the list.
     * @param ListCount The count of records returned in the list.
     */
    public void setListCount(Long ListCount) {
        this.ListCount = ListCount;
    }

    /**
     * Get The total record count. 
     * @return TotalCount The total record count.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set The total record count.
     * @param TotalCount The total record count.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    public RecordCountInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecordCountInfo(RecordCountInfo source) {
        if (source.SubdomainCount != null) {
            this.SubdomainCount = new Long(source.SubdomainCount);
        }
        if (source.ListCount != null) {
            this.ListCount = new Long(source.ListCount);
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubdomainCount", this.SubdomainCount);
        this.setParamSimple(map, prefix + "ListCount", this.ListCount);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);

    }
}

