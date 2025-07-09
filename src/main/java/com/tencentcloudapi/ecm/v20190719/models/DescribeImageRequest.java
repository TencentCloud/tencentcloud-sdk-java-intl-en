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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeImageRequest extends AbstractModel {

    /**
    * Filter. Each request can contain up to 10 `Filters`. The detailed filters are as follows:
image-id - String - Required: no - (Filter) Filter by image ID.
image-type - String - Required: no - (Filter) Filter by image type. Valid values:
PRIVATE_IMAGE: private image created by the current account 
PUBLIC_IMAGE: public image created by Tencent Cloud
instance-type -String - Required: no - (Filter) Filter supported images by model.
image-name - String - Required: no - (Filter) Fuzzy match by image name. You can provide only one value.
image-os - String - Required: no - (Filter) Fuzzy match by image system name. You can provide only one value.
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Offset. Default value: 0. For more information on `Offset`, see the relevant section of the API overview.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of returned results. Default value: 20. Maximum value: 100. For more information on `Limit`, see the relevant section of the API overview.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get Filter. Each request can contain up to 10 `Filters`. The detailed filters are as follows:
image-id - String - Required: no - (Filter) Filter by image ID.
image-type - String - Required: no - (Filter) Filter by image type. Valid values:
PRIVATE_IMAGE: private image created by the current account 
PUBLIC_IMAGE: public image created by Tencent Cloud
instance-type -String - Required: no - (Filter) Filter supported images by model.
image-name - String - Required: no - (Filter) Fuzzy match by image name. You can provide only one value.
image-os - String - Required: no - (Filter) Fuzzy match by image system name. You can provide only one value. 
     * @return Filters Filter. Each request can contain up to 10 `Filters`. The detailed filters are as follows:
image-id - String - Required: no - (Filter) Filter by image ID.
image-type - String - Required: no - (Filter) Filter by image type. Valid values:
PRIVATE_IMAGE: private image created by the current account 
PUBLIC_IMAGE: public image created by Tencent Cloud
instance-type -String - Required: no - (Filter) Filter supported images by model.
image-name - String - Required: no - (Filter) Fuzzy match by image name. You can provide only one value.
image-os - String - Required: no - (Filter) Fuzzy match by image system name. You can provide only one value.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter. Each request can contain up to 10 `Filters`. The detailed filters are as follows:
image-id - String - Required: no - (Filter) Filter by image ID.
image-type - String - Required: no - (Filter) Filter by image type. Valid values:
PRIVATE_IMAGE: private image created by the current account 
PUBLIC_IMAGE: public image created by Tencent Cloud
instance-type -String - Required: no - (Filter) Filter supported images by model.
image-name - String - Required: no - (Filter) Fuzzy match by image name. You can provide only one value.
image-os - String - Required: no - (Filter) Fuzzy match by image system name. You can provide only one value.
     * @param Filters Filter. Each request can contain up to 10 `Filters`. The detailed filters are as follows:
image-id - String - Required: no - (Filter) Filter by image ID.
image-type - String - Required: no - (Filter) Filter by image type. Valid values:
PRIVATE_IMAGE: private image created by the current account 
PUBLIC_IMAGE: public image created by Tencent Cloud
instance-type -String - Required: no - (Filter) Filter supported images by model.
image-name - String - Required: no - (Filter) Fuzzy match by image name. You can provide only one value.
image-os - String - Required: no - (Filter) Fuzzy match by image system name. You can provide only one value.
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Offset. Default value: 0. For more information on `Offset`, see the relevant section of the API overview. 
     * @return Offset Offset. Default value: 0. For more information on `Offset`, see the relevant section of the API overview.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. Default value: 0. For more information on `Offset`, see the relevant section of the API overview.
     * @param Offset Offset. Default value: 0. For more information on `Offset`, see the relevant section of the API overview.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of returned results. Default value: 20. Maximum value: 100. For more information on `Limit`, see the relevant section of the API overview. 
     * @return Limit Number of returned results. Default value: 20. Maximum value: 100. For more information on `Limit`, see the relevant section of the API overview.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returned results. Default value: 20. Maximum value: 100. For more information on `Limit`, see the relevant section of the API overview.
     * @param Limit Number of returned results. Default value: 20. Maximum value: 100. For more information on `Limit`, see the relevant section of the API overview.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeImageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeImageRequest(DescribeImageRequest source) {
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

