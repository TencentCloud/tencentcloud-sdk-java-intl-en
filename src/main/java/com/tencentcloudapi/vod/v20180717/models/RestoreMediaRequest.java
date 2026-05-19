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

public class RestoreMediaRequest extends AbstractModel {

    /**
    * Unique identifier list of media files. Maximum length: 100.
    */
    @SerializedName("FileIds")
    @Expose
    private String [] FileIds;

    /**
    * Accessible duration of thawed temporary media files must be greater than 0. Unit: day.
    */
    @SerializedName("RestoreDay")
    @Expose
    private Long RestoreDay;

    /**
    * <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. Customers who activate VOD services after December 25, 2023 must fill this field with the application ID when accessing resources in on-demand applications (whether default or newly created).</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * Thawing mode. When the current storage type of a media file is archive storage, it takes the following values:
<li>Speed mode: Expedited. The unfreeze task will be completed in 5 minutes.</li>
<li>Standard mode: Standard. The unfreeze task will be completed in 5 hours.</li>
<li>Batch mode: Bulk. The unfreeze task will be completed in 12 hours.</li>
When the file storage type of the media file is DEEP_ARCHIVE, the following values are available:
<li>Standard mode: Standard. The unfreeze task will be completed in 24 hours.</li>
<li>Batch mode: Bulk. The unfreeze task will be completed after 48 hours.</li>
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
     * Get Accessible duration of thawed temporary media files must be greater than 0. Unit: day. 
     * @return RestoreDay Accessible duration of thawed temporary media files must be greater than 0. Unit: day.
     */
    public Long getRestoreDay() {
        return this.RestoreDay;
    }

    /**
     * Set Accessible duration of thawed temporary media files must be greater than 0. Unit: day.
     * @param RestoreDay Accessible duration of thawed temporary media files must be greater than 0. Unit: day.
     */
    public void setRestoreDay(Long RestoreDay) {
        this.RestoreDay = RestoreDay;
    }

    /**
     * Get <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. Customers who activate VOD services after December 25, 2023 must fill this field with the application ID when accessing resources in on-demand applications (whether default or newly created).</b> 
     * @return SubAppId <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. Customers who activate VOD services after December 25, 2023 must fill this field with the application ID when accessing resources in on-demand applications (whether default or newly created).</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. Customers who activate VOD services after December 25, 2023 must fill this field with the application ID when accessing resources in on-demand applications (whether default or newly created).</b>
     * @param SubAppId <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. Customers who activate VOD services after December 25, 2023 must fill this field with the application ID when accessing resources in on-demand applications (whether default or newly created).</b>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get Thawing mode. When the current storage type of a media file is archive storage, it takes the following values:
<li>Speed mode: Expedited. The unfreeze task will be completed in 5 minutes.</li>
<li>Standard mode: Standard. The unfreeze task will be completed in 5 hours.</li>
<li>Batch mode: Bulk. The unfreeze task will be completed in 12 hours.</li>
When the file storage type of the media file is DEEP_ARCHIVE, the following values are available:
<li>Standard mode: Standard. The unfreeze task will be completed in 24 hours.</li>
<li>Batch mode: Bulk. The unfreeze task will be completed after 48 hours.</li> 
     * @return RestoreTier Thawing mode. When the current storage type of a media file is archive storage, it takes the following values:
<li>Speed mode: Expedited. The unfreeze task will be completed in 5 minutes.</li>
<li>Standard mode: Standard. The unfreeze task will be completed in 5 hours.</li>
<li>Batch mode: Bulk. The unfreeze task will be completed in 12 hours.</li>
When the file storage type of the media file is DEEP_ARCHIVE, the following values are available:
<li>Standard mode: Standard. The unfreeze task will be completed in 24 hours.</li>
<li>Batch mode: Bulk. The unfreeze task will be completed after 48 hours.</li>
     */
    public String getRestoreTier() {
        return this.RestoreTier;
    }

    /**
     * Set Thawing mode. When the current storage type of a media file is archive storage, it takes the following values:
<li>Speed mode: Expedited. The unfreeze task will be completed in 5 minutes.</li>
<li>Standard mode: Standard. The unfreeze task will be completed in 5 hours.</li>
<li>Batch mode: Bulk. The unfreeze task will be completed in 12 hours.</li>
When the file storage type of the media file is DEEP_ARCHIVE, the following values are available:
<li>Standard mode: Standard. The unfreeze task will be completed in 24 hours.</li>
<li>Batch mode: Bulk. The unfreeze task will be completed after 48 hours.</li>
     * @param RestoreTier Thawing mode. When the current storage type of a media file is archive storage, it takes the following values:
<li>Speed mode: Expedited. The unfreeze task will be completed in 5 minutes.</li>
<li>Standard mode: Standard. The unfreeze task will be completed in 5 hours.</li>
<li>Batch mode: Bulk. The unfreeze task will be completed in 12 hours.</li>
When the file storage type of the media file is DEEP_ARCHIVE, the following values are available:
<li>Standard mode: Standard. The unfreeze task will be completed in 24 hours.</li>
<li>Batch mode: Bulk. The unfreeze task will be completed after 48 hours.</li>
     */
    public void setRestoreTier(String RestoreTier) {
        this.RestoreTier = RestoreTier;
    }

    public RestoreMediaRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RestoreMediaRequest(RestoreMediaRequest source) {
        if (source.FileIds != null) {
            this.FileIds = new String[source.FileIds.length];
            for (int i = 0; i < source.FileIds.length; i++) {
                this.FileIds[i] = new String(source.FileIds[i]);
            }
        }
        if (source.RestoreDay != null) {
            this.RestoreDay = new Long(source.RestoreDay);
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
        this.setParamSimple(map, prefix + "RestoreDay", this.RestoreDay);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "RestoreTier", this.RestoreTier);

    }
}

