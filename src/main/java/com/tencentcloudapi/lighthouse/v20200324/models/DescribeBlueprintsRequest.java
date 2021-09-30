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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBlueprintsRequest extends AbstractModel{

    /**
    * Image ID list.
    */
    @SerializedName("BlueprintIds")
    @Expose
    private String [] BlueprintIds;

    /**
    * Offset. Default value: 0. For more information on `Offset`, please see the relevant section in [Overview](https://intl.cloud.tencent.com/document/product/1207/47578?from_cn_redirect=1).
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of returned results. Default value: 20. Maximum value: 100. For more information on `Limit`, please see the relevant section in the API [Overview](https://intl.cloud.tencent.com/document/product/1207/47578?from_cn_redirect=1).
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Filter list
<li>blueprint-id</li>Filter by **image ID**.
Type: String
Required: no
<li>blueprint-type</li>Filter by **image type**.
Valid values: `APP_OS`: application image; `PURE_OS`: system image; `PRIVATE`: custom image; `SHARED`: shared image
Type: String
Required: no
<li>platform-type</li>Filter by **image platform type**.
Valid values: `LINUX_UNIX`: Linux or Unix; `WINDOWS`: Windows
Type: String
Required: no
<li>blueprint-name</li>Filter by **image name**.
Type: String
Required: no

Each request can contain up to 10 `Filters` and 5 `Filter.Values`. `BlueprintIds` and `Filters` cannot be specified at the same time.
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get Image ID list. 
     * @return BlueprintIds Image ID list.
     */
    public String [] getBlueprintIds() {
        return this.BlueprintIds;
    }

    /**
     * Set Image ID list.
     * @param BlueprintIds Image ID list.
     */
    public void setBlueprintIds(String [] BlueprintIds) {
        this.BlueprintIds = BlueprintIds;
    }

    /**
     * Get Offset. Default value: 0. For more information on `Offset`, please see the relevant section in [Overview](https://intl.cloud.tencent.com/document/product/1207/47578?from_cn_redirect=1). 
     * @return Offset Offset. Default value: 0. For more information on `Offset`, please see the relevant section in [Overview](https://intl.cloud.tencent.com/document/product/1207/47578?from_cn_redirect=1).
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. Default value: 0. For more information on `Offset`, please see the relevant section in [Overview](https://intl.cloud.tencent.com/document/product/1207/47578?from_cn_redirect=1).
     * @param Offset Offset. Default value: 0. For more information on `Offset`, please see the relevant section in [Overview](https://intl.cloud.tencent.com/document/product/1207/47578?from_cn_redirect=1).
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of returned results. Default value: 20. Maximum value: 100. For more information on `Limit`, please see the relevant section in the API [Overview](https://intl.cloud.tencent.com/document/product/1207/47578?from_cn_redirect=1). 
     * @return Limit Number of returned results. Default value: 20. Maximum value: 100. For more information on `Limit`, please see the relevant section in the API [Overview](https://intl.cloud.tencent.com/document/product/1207/47578?from_cn_redirect=1).
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returned results. Default value: 20. Maximum value: 100. For more information on `Limit`, please see the relevant section in the API [Overview](https://intl.cloud.tencent.com/document/product/1207/47578?from_cn_redirect=1).
     * @param Limit Number of returned results. Default value: 20. Maximum value: 100. For more information on `Limit`, please see the relevant section in the API [Overview](https://intl.cloud.tencent.com/document/product/1207/47578?from_cn_redirect=1).
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Filter list
<li>blueprint-id</li>Filter by **image ID**.
Type: String
Required: no
<li>blueprint-type</li>Filter by **image type**.
Valid values: `APP_OS`: application image; `PURE_OS`: system image; `PRIVATE`: custom image; `SHARED`: shared image
Type: String
Required: no
<li>platform-type</li>Filter by **image platform type**.
Valid values: `LINUX_UNIX`: Linux or Unix; `WINDOWS`: Windows
Type: String
Required: no
<li>blueprint-name</li>Filter by **image name**.
Type: String
Required: no

Each request can contain up to 10 `Filters` and 5 `Filter.Values`. `BlueprintIds` and `Filters` cannot be specified at the same time. 
     * @return Filters Filter list
<li>blueprint-id</li>Filter by **image ID**.
Type: String
Required: no
<li>blueprint-type</li>Filter by **image type**.
Valid values: `APP_OS`: application image; `PURE_OS`: system image; `PRIVATE`: custom image; `SHARED`: shared image
Type: String
Required: no
<li>platform-type</li>Filter by **image platform type**.
Valid values: `LINUX_UNIX`: Linux or Unix; `WINDOWS`: Windows
Type: String
Required: no
<li>blueprint-name</li>Filter by **image name**.
Type: String
Required: no

Each request can contain up to 10 `Filters` and 5 `Filter.Values`. `BlueprintIds` and `Filters` cannot be specified at the same time.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter list
<li>blueprint-id</li>Filter by **image ID**.
Type: String
Required: no
<li>blueprint-type</li>Filter by **image type**.
Valid values: `APP_OS`: application image; `PURE_OS`: system image; `PRIVATE`: custom image; `SHARED`: shared image
Type: String
Required: no
<li>platform-type</li>Filter by **image platform type**.
Valid values: `LINUX_UNIX`: Linux or Unix; `WINDOWS`: Windows
Type: String
Required: no
<li>blueprint-name</li>Filter by **image name**.
Type: String
Required: no

Each request can contain up to 10 `Filters` and 5 `Filter.Values`. `BlueprintIds` and `Filters` cannot be specified at the same time.
     * @param Filters Filter list
<li>blueprint-id</li>Filter by **image ID**.
Type: String
Required: no
<li>blueprint-type</li>Filter by **image type**.
Valid values: `APP_OS`: application image; `PURE_OS`: system image; `PRIVATE`: custom image; `SHARED`: shared image
Type: String
Required: no
<li>platform-type</li>Filter by **image platform type**.
Valid values: `LINUX_UNIX`: Linux or Unix; `WINDOWS`: Windows
Type: String
Required: no
<li>blueprint-name</li>Filter by **image name**.
Type: String
Required: no

Each request can contain up to 10 `Filters` and 5 `Filter.Values`. `BlueprintIds` and `Filters` cannot be specified at the same time.
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeBlueprintsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBlueprintsRequest(DescribeBlueprintsRequest source) {
        if (source.BlueprintIds != null) {
            this.BlueprintIds = new String[source.BlueprintIds.length];
            for (int i = 0; i < source.BlueprintIds.length; i++) {
                this.BlueprintIds[i] = new String(source.BlueprintIds[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "BlueprintIds.", this.BlueprintIds);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

