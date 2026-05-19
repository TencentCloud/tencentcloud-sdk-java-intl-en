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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyMediaStorageClassRequest extends AbstractModel {

    /**
    * Unique identifier list of media files. Maximum length: 100.
    */
    @SerializedName("FileIds")
    @Expose
    private String [] FileIds;

    /**
    * Target storage type. Valid values:
<li> STANDARD: Standard storage.</li>
<li> STANDARD_IA: Infrequent storage.</li>
<li>ARCHIVE: Archive storage.</li>
<li> DEEP_ARCHIVE: Deep archive storage.</li>
    */
    @SerializedName("StorageClass")
    @Expose
    private String StorageClass;

    /**
    * <b>On-demand [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the app ID when accessing resources in on-demand applications (whether default or newly created).</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * Retrieval mode. When converting the file storage type from archive or deep archive to standard storage, you need to specify the mode for the retrieval (also known as unfreeze) operation. For details, refer to [Data retrieval and retrieval mode](https://www.tencentcloud.com/document/product/266/56196?from_cn_redirect=1#retake).
When the current storage type of a media file is archive storage, the following values are available:
<li>Expedited: Speed mode.</li>
<li>Standard: Standard mode.</li>
<li>Bulk: batch mode.</li>
When the current storage type of the media file is DEEP_ARCHIVE, the following values are available:
<li>Standard: Standard mode.</li>
<li>Bulk: Batch mode.</li>
    */
    @SerializedName("RestoreTier")
    @Expose
    private String RestoreTier;

    /**
     * Get Unique identifier list of media files. Maximum length: 100. 
     * @return FileIds Unique identifier list of media files. Maximum length: 100.
     */
    public String [] getFileIds() {
        return this.FileIds;
    }

    /**
     * Set Unique identifier list of media files. Maximum length: 100.
     * @param FileIds Unique identifier list of media files. Maximum length: 100.
     */
    public void setFileIds(String [] FileIds) {
        this.FileIds = FileIds;
    }

    /**
     * Get Target storage type. Valid values:
<li> STANDARD: Standard storage.</li>
<li> STANDARD_IA: Infrequent storage.</li>
<li>ARCHIVE: Archive storage.</li>
<li> DEEP_ARCHIVE: Deep archive storage.</li> 
     * @return StorageClass Target storage type. Valid values:
<li> STANDARD: Standard storage.</li>
<li> STANDARD_IA: Infrequent storage.</li>
<li>ARCHIVE: Archive storage.</li>
<li> DEEP_ARCHIVE: Deep archive storage.</li>
     */
    public String getStorageClass() {
        return this.StorageClass;
    }

    /**
     * Set Target storage type. Valid values:
<li> STANDARD: Standard storage.</li>
<li> STANDARD_IA: Infrequent storage.</li>
<li>ARCHIVE: Archive storage.</li>
<li> DEEP_ARCHIVE: Deep archive storage.</li>
     * @param StorageClass Target storage type. Valid values:
<li> STANDARD: Standard storage.</li>
<li> STANDARD_IA: Infrequent storage.</li>
<li>ARCHIVE: Archive storage.</li>
<li> DEEP_ARCHIVE: Deep archive storage.</li>
     */
    public void setStorageClass(String StorageClass) {
        this.StorageClass = StorageClass;
    }

    /**
     * Get <b>On-demand [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the app ID when accessing resources in on-demand applications (whether default or newly created).</b> 
     * @return SubAppId <b>On-demand [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the app ID when accessing resources in on-demand applications (whether default or newly created).</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>On-demand [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the app ID when accessing resources in on-demand applications (whether default or newly created).</b>
     * @param SubAppId <b>On-demand [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the app ID when accessing resources in on-demand applications (whether default or newly created).</b>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get Retrieval mode. When converting the file storage type from archive or deep archive to standard storage, you need to specify the mode for the retrieval (also known as unfreeze) operation. For details, refer to [Data retrieval and retrieval mode](https://www.tencentcloud.com/document/product/266/56196?from_cn_redirect=1#retake).
When the current storage type of a media file is archive storage, the following values are available:
<li>Expedited: Speed mode.</li>
<li>Standard: Standard mode.</li>
<li>Bulk: batch mode.</li>
When the current storage type of the media file is DEEP_ARCHIVE, the following values are available:
<li>Standard: Standard mode.</li>
<li>Bulk: Batch mode.</li> 
     * @return RestoreTier Retrieval mode. When converting the file storage type from archive or deep archive to standard storage, you need to specify the mode for the retrieval (also known as unfreeze) operation. For details, refer to [Data retrieval and retrieval mode](https://www.tencentcloud.com/document/product/266/56196?from_cn_redirect=1#retake).
When the current storage type of a media file is archive storage, the following values are available:
<li>Expedited: Speed mode.</li>
<li>Standard: Standard mode.</li>
<li>Bulk: batch mode.</li>
When the current storage type of the media file is DEEP_ARCHIVE, the following values are available:
<li>Standard: Standard mode.</li>
<li>Bulk: Batch mode.</li>
     */
    public String getRestoreTier() {
        return this.RestoreTier;
    }

    /**
     * Set Retrieval mode. When converting the file storage type from archive or deep archive to standard storage, you need to specify the mode for the retrieval (also known as unfreeze) operation. For details, refer to [Data retrieval and retrieval mode](https://www.tencentcloud.com/document/product/266/56196?from_cn_redirect=1#retake).
When the current storage type of a media file is archive storage, the following values are available:
<li>Expedited: Speed mode.</li>
<li>Standard: Standard mode.</li>
<li>Bulk: batch mode.</li>
When the current storage type of the media file is DEEP_ARCHIVE, the following values are available:
<li>Standard: Standard mode.</li>
<li>Bulk: Batch mode.</li>
     * @param RestoreTier Retrieval mode. When converting the file storage type from archive or deep archive to standard storage, you need to specify the mode for the retrieval (also known as unfreeze) operation. For details, refer to [Data retrieval and retrieval mode](https://www.tencentcloud.com/document/product/266/56196?from_cn_redirect=1#retake).
When the current storage type of a media file is archive storage, the following values are available:
<li>Expedited: Speed mode.</li>
<li>Standard: Standard mode.</li>
<li>Bulk: batch mode.</li>
When the current storage type of the media file is DEEP_ARCHIVE, the following values are available:
<li>Standard: Standard mode.</li>
<li>Bulk: Batch mode.</li>
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

