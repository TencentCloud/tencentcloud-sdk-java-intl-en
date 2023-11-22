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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyMediaStorageClassRequest extends AbstractModel {

    /**
    * Media file unique identifier list, maximum length: 100.
    */
    @SerializedName("FileIds")
    @Expose
    private String [] FileIds;

    /**
    * The target storage class. Valid values:
<li>STANDARD</li>
<li>STANDARD_IA</li>
<li>ARCHIVE</li>
<li>DEEP_ARCHIVE</li>
    */
    @SerializedName("StorageClass")
    @Expose
    private String StorageClass;

    /**
    * <b>The VOD [subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) ID. If you need to access a resource in a subapplication, set this parameter to the subapplication ID; otherwise, leave it empty.</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * The retrieval mode. When switching files from DEEP ARCHIVE or ARCHIVE to STANDARD, you need to specify the retrieval mode. For details, see [Data retrieval and retrieval mode](https://intl.cloud.tencent.com/document/product/266/43051#data-retrieval-and-retrieval-mode.3Ca-id.3D.22retake.22.3E.3C.2Fa.3E).
If the current storage class is ARCHIVE, the valid values for this parameter are as follows:
<li>Expedited</li>
<li>Standard</li>
<li>Bulk</li>
If the current storage class is DEEP ARCHIVE, the valid values for this parameter are as follows:
<li>Standard</li>
<li>Bulk</li>
    */
    @SerializedName("RestoreTier")
    @Expose
    private String RestoreTier;

    /**
     * Get Media file unique identifier list, maximum length: 100. 
     * @return FileIds Media file unique identifier list, maximum length: 100.
     */
    public String [] getFileIds() {
        return this.FileIds;
    }

    /**
     * Set Media file unique identifier list, maximum length: 100.
     * @param FileIds Media file unique identifier list, maximum length: 100.
     */
    public void setFileIds(String [] FileIds) {
        this.FileIds = FileIds;
    }

    /**
     * Get The target storage class. Valid values:
<li>STANDARD</li>
<li>STANDARD_IA</li>
<li>ARCHIVE</li>
<li>DEEP_ARCHIVE</li> 
     * @return StorageClass The target storage class. Valid values:
<li>STANDARD</li>
<li>STANDARD_IA</li>
<li>ARCHIVE</li>
<li>DEEP_ARCHIVE</li>
     */
    public String getStorageClass() {
        return this.StorageClass;
    }

    /**
     * Set The target storage class. Valid values:
<li>STANDARD</li>
<li>STANDARD_IA</li>
<li>ARCHIVE</li>
<li>DEEP_ARCHIVE</li>
     * @param StorageClass The target storage class. Valid values:
<li>STANDARD</li>
<li>STANDARD_IA</li>
<li>ARCHIVE</li>
<li>DEEP_ARCHIVE</li>
     */
    public void setStorageClass(String StorageClass) {
        this.StorageClass = StorageClass;
    }

    /**
     * Get <b>The VOD [subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) ID. If you need to access a resource in a subapplication, set this parameter to the subapplication ID; otherwise, leave it empty.</b> 
     * @return SubAppId <b>The VOD [subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) ID. If you need to access a resource in a subapplication, set this parameter to the subapplication ID; otherwise, leave it empty.</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>The VOD [subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) ID. If you need to access a resource in a subapplication, set this parameter to the subapplication ID; otherwise, leave it empty.</b>
     * @param SubAppId <b>The VOD [subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) ID. If you need to access a resource in a subapplication, set this parameter to the subapplication ID; otherwise, leave it empty.</b>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get The retrieval mode. When switching files from DEEP ARCHIVE or ARCHIVE to STANDARD, you need to specify the retrieval mode. For details, see [Data retrieval and retrieval mode](https://intl.cloud.tencent.com/document/product/266/43051#data-retrieval-and-retrieval-mode.3Ca-id.3D.22retake.22.3E.3C.2Fa.3E).
If the current storage class is ARCHIVE, the valid values for this parameter are as follows:
<li>Expedited</li>
<li>Standard</li>
<li>Bulk</li>
If the current storage class is DEEP ARCHIVE, the valid values for this parameter are as follows:
<li>Standard</li>
<li>Bulk</li> 
     * @return RestoreTier The retrieval mode. When switching files from DEEP ARCHIVE or ARCHIVE to STANDARD, you need to specify the retrieval mode. For details, see [Data retrieval and retrieval mode](https://intl.cloud.tencent.com/document/product/266/43051#data-retrieval-and-retrieval-mode.3Ca-id.3D.22retake.22.3E.3C.2Fa.3E).
If the current storage class is ARCHIVE, the valid values for this parameter are as follows:
<li>Expedited</li>
<li>Standard</li>
<li>Bulk</li>
If the current storage class is DEEP ARCHIVE, the valid values for this parameter are as follows:
<li>Standard</li>
<li>Bulk</li>
     */
    public String getRestoreTier() {
        return this.RestoreTier;
    }

    /**
     * Set The retrieval mode. When switching files from DEEP ARCHIVE or ARCHIVE to STANDARD, you need to specify the retrieval mode. For details, see [Data retrieval and retrieval mode](https://intl.cloud.tencent.com/document/product/266/43051#data-retrieval-and-retrieval-mode.3Ca-id.3D.22retake.22.3E.3C.2Fa.3E).
If the current storage class is ARCHIVE, the valid values for this parameter are as follows:
<li>Expedited</li>
<li>Standard</li>
<li>Bulk</li>
If the current storage class is DEEP ARCHIVE, the valid values for this parameter are as follows:
<li>Standard</li>
<li>Bulk</li>
     * @param RestoreTier The retrieval mode. When switching files from DEEP ARCHIVE or ARCHIVE to STANDARD, you need to specify the retrieval mode. For details, see [Data retrieval and retrieval mode](https://intl.cloud.tencent.com/document/product/266/43051#data-retrieval-and-retrieval-mode.3Ca-id.3D.22retake.22.3E.3C.2Fa.3E).
If the current storage class is ARCHIVE, the valid values for this parameter are as follows:
<li>Expedited</li>
<li>Standard</li>
<li>Bulk</li>
If the current storage class is DEEP ARCHIVE, the valid values for this parameter are as follows:
<li>Standard</li>
<li>Bulk</li>
     */
    public void setRestoreTier(String RestoreTier) {
        this.RestoreTier = RestoreTier;
    }

    public ModifyMediaStorageClassRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyMediaStorageClassRequest(ModifyMediaStorageClassRequest source) {
        if (source.FileIds != null) {
            this.FileIds = new String[source.FileIds.length];
            for (int i = 0; i < source.FileIds.length; i++) {
                this.FileIds[i] = new String(source.FileIds[i]);
            }
        }
        if (source.StorageClass != null) {
            this.StorageClass = new String(source.StorageClass);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.RestoreTier != null) {
            this.RestoreTier = new String(source.RestoreTier);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "FileIds.", this.FileIds);
        this.setParamSimple(map, prefix + "StorageClass", this.StorageClass);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "RestoreTier", this.RestoreTier);

    }
}

