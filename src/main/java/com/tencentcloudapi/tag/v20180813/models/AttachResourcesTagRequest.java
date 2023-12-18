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
package com.tencentcloudapi.tag.v20180813.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AttachResourcesTagRequest extends AbstractModel {

    /**
    * Service short name, which is the third segment of the six-segment resource format. For more information on the format, see https://intl.cloud.tencent.com/document/product/651/89122?from_cn_redirect=1
    */
    @SerializedName("ServiceType")
    @Expose
    private String ServiceType;

    /**
    * Resource ID array, which can contain up to 50 resources
    */
    @SerializedName("ResourceIds")
    @Expose
    private String [] ResourceIds;

    /**
    * The tag key that needs to be bound. For the requirements, refer to: https://intl.cloud.tencent.com/document/product/651/13354?from_cn_redirect=1
    */
    @SerializedName("TagKey")
    @Expose
    private String TagKey;

    /**
    * The tag value that needs to be bound. For the requirements, refer to: https://intl.cloud.tencent.com/document/product/651/13354?from_cn_redirect=1
    */
    @SerializedName("TagValue")
    @Expose
    private String TagValue;

    /**
    * Region of the resource. This parameter can be left blank if region is not involved. The region must correspond to resources specified by ResourceIds.N. Once the region is specified, all resources specified by ResourceIds.N must locate in this region. Example: ap-beijing.
    */
    @SerializedName("ResourceRegion")
    @Expose
    private String ResourceRegion;

    /**
    * Resource prefix (the part before "/" in the last segment in the six-segment resource description), which is optional for COS buckets but required for other Tencent Cloud resources.
    */
    @SerializedName("ResourcePrefix")
    @Expose
    private String ResourcePrefix;

    /**
     * Get Service short name, which is the third segment of the six-segment resource format. For more information on the format, see https://intl.cloud.tencent.com/document/product/651/89122?from_cn_redirect=1 
     * @return ServiceType Service short name, which is the third segment of the six-segment resource format. For more information on the format, see https://intl.cloud.tencent.com/document/product/651/89122?from_cn_redirect=1
     */
    public String getServiceType() {
        return this.ServiceType;
    }

    /**
     * Set Service short name, which is the third segment of the six-segment resource format. For more information on the format, see https://intl.cloud.tencent.com/document/product/651/89122?from_cn_redirect=1
     * @param ServiceType Service short name, which is the third segment of the six-segment resource format. For more information on the format, see https://intl.cloud.tencent.com/document/product/651/89122?from_cn_redirect=1
     */
    public void setServiceType(String ServiceType) {
        this.ServiceType = ServiceType;
    }

    /**
     * Get Resource ID array, which can contain up to 50 resources 
     * @return ResourceIds Resource ID array, which can contain up to 50 resources
     */
    public String [] getResourceIds() {
        return this.ResourceIds;
    }

    /**
     * Set Resource ID array, which can contain up to 50 resources
     * @param ResourceIds Resource ID array, which can contain up to 50 resources
     */
    public void setResourceIds(String [] ResourceIds) {
        this.ResourceIds = ResourceIds;
    }

    /**
     * Get The tag key that needs to be bound. For the requirements, refer to: https://intl.cloud.tencent.com/document/product/651/13354?from_cn_redirect=1 
     * @return TagKey The tag key that needs to be bound. For the requirements, refer to: https://intl.cloud.tencent.com/document/product/651/13354?from_cn_redirect=1
     */
    public String getTagKey() {
        return this.TagKey;
    }

    /**
     * Set The tag key that needs to be bound. For the requirements, refer to: https://intl.cloud.tencent.com/document/product/651/13354?from_cn_redirect=1
     * @param TagKey The tag key that needs to be bound. For the requirements, refer to: https://intl.cloud.tencent.com/document/product/651/13354?from_cn_redirect=1
     */
    public void setTagKey(String TagKey) {
        this.TagKey = TagKey;
    }

    /**
     * Get The tag value that needs to be bound. For the requirements, refer to: https://intl.cloud.tencent.com/document/product/651/13354?from_cn_redirect=1 
     * @return TagValue The tag value that needs to be bound. For the requirements, refer to: https://intl.cloud.tencent.com/document/product/651/13354?from_cn_redirect=1
     */
    public String getTagValue() {
        return this.TagValue;
    }

    /**
     * Set The tag value that needs to be bound. For the requirements, refer to: https://intl.cloud.tencent.com/document/product/651/13354?from_cn_redirect=1
     * @param TagValue The tag value that needs to be bound. For the requirements, refer to: https://intl.cloud.tencent.com/document/product/651/13354?from_cn_redirect=1
     */
    public void setTagValue(String TagValue) {
        this.TagValue = TagValue;
    }

    /**
     * Get Region of the resource. This parameter can be left blank if region is not involved. The region must correspond to resources specified by ResourceIds.N. Once the region is specified, all resources specified by ResourceIds.N must locate in this region. Example: ap-beijing. 
     * @return ResourceRegion Region of the resource. This parameter can be left blank if region is not involved. The region must correspond to resources specified by ResourceIds.N. Once the region is specified, all resources specified by ResourceIds.N must locate in this region. Example: ap-beijing.
     */
    public String getResourceRegion() {
        return this.ResourceRegion;
    }

    /**
     * Set Region of the resource. This parameter can be left blank if region is not involved. The region must correspond to resources specified by ResourceIds.N. Once the region is specified, all resources specified by ResourceIds.N must locate in this region. Example: ap-beijing.
     * @param ResourceRegion Region of the resource. This parameter can be left blank if region is not involved. The region must correspond to resources specified by ResourceIds.N. Once the region is specified, all resources specified by ResourceIds.N must locate in this region. Example: ap-beijing.
     */
    public void setResourceRegion(String ResourceRegion) {
        this.ResourceRegion = ResourceRegion;
    }

    /**
     * Get Resource prefix (the part before "/" in the last segment in the six-segment resource description), which is optional for COS buckets but required for other Tencent Cloud resources. 
     * @return ResourcePrefix Resource prefix (the part before "/" in the last segment in the six-segment resource description), which is optional for COS buckets but required for other Tencent Cloud resources.
     */
    public String getResourcePrefix() {
        return this.ResourcePrefix;
    }

    /**
     * Set Resource prefix (the part before "/" in the last segment in the six-segment resource description), which is optional for COS buckets but required for other Tencent Cloud resources.
     * @param ResourcePrefix Resource prefix (the part before "/" in the last segment in the six-segment resource description), which is optional for COS buckets but required for other Tencent Cloud resources.
     */
    public void setResourcePrefix(String ResourcePrefix) {
        this.ResourcePrefix = ResourcePrefix;
    }

    public AttachResourcesTagRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AttachResourcesTagRequest(AttachResourcesTagRequest source) {
        if (source.ServiceType != null) {
            this.ServiceType = new String(source.ServiceType);
        }
        if (source.ResourceIds != null) {
            this.ResourceIds = new String[source.ResourceIds.length];
            for (int i = 0; i < source.ResourceIds.length; i++) {
                this.ResourceIds[i] = new String(source.ResourceIds[i]);
            }
        }
        if (source.TagKey != null) {
            this.TagKey = new String(source.TagKey);
        }
        if (source.TagValue != null) {
            this.TagValue = new String(source.TagValue);
        }
        if (source.ResourceRegion != null) {
            this.ResourceRegion = new String(source.ResourceRegion);
        }
        if (source.ResourcePrefix != null) {
            this.ResourcePrefix = new String(source.ResourcePrefix);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);
        this.setParamArraySimple(map, prefix + "ResourceIds.", this.ResourceIds);
        this.setParamSimple(map, prefix + "TagKey", this.TagKey);
        this.setParamSimple(map, prefix + "TagValue", this.TagValue);
        this.setParamSimple(map, prefix + "ResourceRegion", this.ResourceRegion);
        this.setParamSimple(map, prefix + "ResourcePrefix", this.ResourcePrefix);

    }
}

