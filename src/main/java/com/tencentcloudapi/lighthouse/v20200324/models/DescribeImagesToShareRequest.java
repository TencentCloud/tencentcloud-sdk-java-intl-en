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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeImagesToShareRequest extends AbstractModel {

    /**
    * List of CVM image IDs, which can be obtained through the ImageId in the returned value of the [DescribeImages](https://www.tencentcloud.comom/document/api/213/15715?from_cn_redirect=1) API.
    */
    @SerializedName("ImageIds")
    @Expose
    private String [] ImageIds;

    /**
    * Offset. The default value is 0. For more information on `Offset`, see the relevant section in API [Introduction](https://www.tencentcloud.comom/document/product/1207/47578?from_cn_redirect=1).
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of returned results. The default value is 20, and the maximum value is 100. For more information on `Limit`, see the relevant section in API [Introduction](https://www.tencentcloud.comom/document/product/1207/47578?from_cn_redirect=1).
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Filter list.
<li>image-id</li>: filter by [CVM image ID].
Type: string.
Required: no.
<li>image-name</li>: filter by [CVM image name].
Type: string.
Required: no.

<li>image-type</li>: filter by [CVM image type].
Type: string.
Required: no.
Valid values:
PRIVATE_IMAGE: private image (image created by the account).
PUBLIC_IMAGE: public image (Tencent Cloud official image).
SHARED_IMAGE: shared image (image shared by other accounts to this account).

The maximum number of Filters per request is 10, and the maximum number of Filter.Values per request is 5.
ImageIds and Filters cannot be specified simultaneously for parameters.
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get List of CVM image IDs, which can be obtained through the ImageId in the returned value of the [DescribeImages](https://www.tencentcloud.comom/document/api/213/15715?from_cn_redirect=1) API. 
     * @return ImageIds List of CVM image IDs, which can be obtained through the ImageId in the returned value of the [DescribeImages](https://www.tencentcloud.comom/document/api/213/15715?from_cn_redirect=1) API.
     */
    public String [] getImageIds() {
        return this.ImageIds;
    }

    /**
     * Set List of CVM image IDs, which can be obtained through the ImageId in the returned value of the [DescribeImages](https://www.tencentcloud.comom/document/api/213/15715?from_cn_redirect=1) API.
     * @param ImageIds List of CVM image IDs, which can be obtained through the ImageId in the returned value of the [DescribeImages](https://www.tencentcloud.comom/document/api/213/15715?from_cn_redirect=1) API.
     */
    public void setImageIds(String [] ImageIds) {
        this.ImageIds = ImageIds;
    }

    /**
     * Get Offset. The default value is 0. For more information on `Offset`, see the relevant section in API [Introduction](https://www.tencentcloud.comom/document/product/1207/47578?from_cn_redirect=1). 
     * @return Offset Offset. The default value is 0. For more information on `Offset`, see the relevant section in API [Introduction](https://www.tencentcloud.comom/document/product/1207/47578?from_cn_redirect=1).
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. The default value is 0. For more information on `Offset`, see the relevant section in API [Introduction](https://www.tencentcloud.comom/document/product/1207/47578?from_cn_redirect=1).
     * @param Offset Offset. The default value is 0. For more information on `Offset`, see the relevant section in API [Introduction](https://www.tencentcloud.comom/document/product/1207/47578?from_cn_redirect=1).
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of returned results. The default value is 20, and the maximum value is 100. For more information on `Limit`, see the relevant section in API [Introduction](https://www.tencentcloud.comom/document/product/1207/47578?from_cn_redirect=1). 
     * @return Limit Number of returned results. The default value is 20, and the maximum value is 100. For more information on `Limit`, see the relevant section in API [Introduction](https://www.tencentcloud.comom/document/product/1207/47578?from_cn_redirect=1).
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returned results. The default value is 20, and the maximum value is 100. For more information on `Limit`, see the relevant section in API [Introduction](https://www.tencentcloud.comom/document/product/1207/47578?from_cn_redirect=1).
     * @param Limit Number of returned results. The default value is 20, and the maximum value is 100. For more information on `Limit`, see the relevant section in API [Introduction](https://www.tencentcloud.comom/document/product/1207/47578?from_cn_redirect=1).
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Filter list.
<li>image-id</li>: filter by [CVM image ID].
Type: string.
Required: no.
<li>image-name</li>: filter by [CVM image name].
Type: string.
Required: no.

<li>image-type</li>: filter by [CVM image type].
Type: string.
Required: no.
Valid values:
PRIVATE_IMAGE: private image (image created by the account).
PUBLIC_IMAGE: public image (Tencent Cloud official image).
SHARED_IMAGE: shared image (image shared by other accounts to this account).

The maximum number of Filters per request is 10, and the maximum number of Filter.Values per request is 5.
ImageIds and Filters cannot be specified simultaneously for parameters. 
     * @return Filters Filter list.
<li>image-id</li>: filter by [CVM image ID].
Type: string.
Required: no.
<li>image-name</li>: filter by [CVM image name].
Type: string.
Required: no.

<li>image-type</li>: filter by [CVM image type].
Type: string.
Required: no.
Valid values:
PRIVATE_IMAGE: private image (image created by the account).
PUBLIC_IMAGE: public image (Tencent Cloud official image).
SHARED_IMAGE: shared image (image shared by other accounts to this account).

The maximum number of Filters per request is 10, and the maximum number of Filter.Values per request is 5.
ImageIds and Filters cannot be specified simultaneously for parameters.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter list.
<li>image-id</li>: filter by [CVM image ID].
Type: string.
Required: no.
<li>image-name</li>: filter by [CVM image name].
Type: string.
Required: no.

<li>image-type</li>: filter by [CVM image type].
Type: string.
Required: no.
Valid values:
PRIVATE_IMAGE: private image (image created by the account).
PUBLIC_IMAGE: public image (Tencent Cloud official image).
SHARED_IMAGE: shared image (image shared by other accounts to this account).

The maximum number of Filters per request is 10, and the maximum number of Filter.Values per request is 5.
ImageIds and Filters cannot be specified simultaneously for parameters.
     * @param Filters Filter list.
<li>image-id</li>: filter by [CVM image ID].
Type: string.
Required: no.
<li>image-name</li>: filter by [CVM image name].
Type: string.
Required: no.

<li>image-type</li>: filter by [CVM image type].
Type: string.
Required: no.
Valid values:
PRIVATE_IMAGE: private image (image created by the account).
PUBLIC_IMAGE: public image (Tencent Cloud official image).
SHARED_IMAGE: shared image (image shared by other accounts to this account).

The maximum number of Filters per request is 10, and the maximum number of Filter.Values per request is 5.
ImageIds and Filters cannot be specified simultaneously for parameters.
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeImagesToShareRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeImagesToShareRequest(DescribeImagesToShareRequest source) {
        if (source.ImageIds != null) {
            this.ImageIds = new String[source.ImageIds.length];
            for (int i = 0; i < source.ImageIds.length; i++) {
                this.ImageIds[i] = new String(source.ImageIds[i]);
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
        this.setParamArraySimple(map, prefix + "ImageIds.", this.ImageIds);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

