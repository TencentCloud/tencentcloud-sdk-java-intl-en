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
    * Media file unique identifier list, maximum length: 100.
    */
    @SerializedName("FileIds")
    @Expose
    private String [] FileIds;

    /**
    * The accessible duration of the unfrozen temporary media files must be greater than 0, and the unit is "days".
    */
    @SerializedName("RestoreDay")
    @Expose
    private Long RestoreDay;

    /**
    * <b>The VOD [application](https://intl.cloud.tencent.com/document/product/266/14574) ID. For customers who activate VOD service from December 25, 2023, if they want to access resources in a VOD application (whether it's the default application or a newly created one), they must fill in this field with the application ID.</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * The retrieval mode. If the current storage class is ARCHIVE, the valid values for this parameter are as follows:
<li>Expedited: The files are made available in five minutes.</li>
<li>Standard: The files are made available in five hours.</li>
<li>Bulk: The files are made available in 12 hours.</li>
If the current storage class is DEEP ARCHIVE, the valid values for this parameter are as follows:
<li>Standard: The files are made available in 24 hours.</li>
<li>Bulk: The files are made available in 48 hours.</li>
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
     * Get The accessible duration of the unfrozen temporary media files must be greater than 0, and the unit is "days". 
     * @return RestoreDay The accessible duration of the unfrozen temporary media files must be greater than 0, and the unit is "days".
     */
    public Long getRestoreDay() {
        return this.RestoreDay;
    }

    /**
     * Set The accessible duration of the unfrozen temporary media files must be greater than 0, and the unit is "days".
     * @param RestoreDay The accessible duration of the unfrozen temporary media files must be greater than 0, and the unit is "days".
     */
    public void setRestoreDay(Long RestoreDay) {
        this.RestoreDay = RestoreDay;
    }

    /**
     * Get <b>The VOD [application](https://intl.cloud.tencent.com/document/product/266/14574) ID. For customers who activate VOD service from December 25, 2023, if they want to access resources in a VOD application (whether it's the default application or a newly created one), they must fill in this field with the application ID.</b> 
     * @return SubAppId <b>The VOD [application](https://intl.cloud.tencent.com/document/product/266/14574) ID. For customers who activate VOD service from December 25, 2023, if they want to access resources in a VOD application (whether it's the default application or a newly created one), they must fill in this field with the application ID.</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>The VOD [application](https://intl.cloud.tencent.com/document/product/266/14574) ID. For customers who activate VOD service from December 25, 2023, if they want to access resources in a VOD application (whether it's the default application or a newly created one), they must fill in this field with the application ID.</b>
     * @param SubAppId <b>The VOD [application](https://intl.cloud.tencent.com/document/product/266/14574) ID. For customers who activate VOD service from December 25, 2023, if they want to access resources in a VOD application (whether it's the default application or a newly created one), they must fill in this field with the application ID.</b>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get The retrieval mode. If the current storage class is ARCHIVE, the valid values for this parameter are as follows:
<li>Expedited: The files are made available in five minutes.</li>
<li>Standard: The files are made available in five hours.</li>
<li>Bulk: The files are made available in 12 hours.</li>
If the current storage class is DEEP ARCHIVE, the valid values for this parameter are as follows:
<li>Standard: The files are made available in 24 hours.</li>
<li>Bulk: The files are made available in 48 hours.</li> 
     * @return RestoreTier The retrieval mode. If the current storage class is ARCHIVE, the valid values for this parameter are as follows:
<li>Expedited: The files are made available in five minutes.</li>
<li>Standard: The files are made available in five hours.</li>
<li>Bulk: The files are made available in 12 hours.</li>
If the current storage class is DEEP ARCHIVE, the valid values for this parameter are as follows:
<li>Standard: The files are made available in 24 hours.</li>
<li>Bulk: The files are made available in 48 hours.</li>
     */
    public String getRestoreTier() {
        return this.RestoreTier;
    }

    /**
     * Set The retrieval mode. If the current storage class is ARCHIVE, the valid values for this parameter are as follows:
<li>Expedited: The files are made available in five minutes.</li>
<li>Standard: The files are made available in five hours.</li>
<li>Bulk: The files are made available in 12 hours.</li>
If the current storage class is DEEP ARCHIVE, the valid values for this parameter are as follows:
<li>Standard: The files are made available in 24 hours.</li>
<li>Bulk: The files are made available in 48 hours.</li>
     * @param RestoreTier The retrieval mode. If the current storage class is ARCHIVE, the valid values for this parameter are as follows:
<li>Expedited: The files are made available in five minutes.</li>
<li>Standard: The files are made available in five hours.</li>
<li>Bulk: The files are made available in 12 hours.</li>
If the current storage class is DEEP ARCHIVE, the valid values for this parameter are as follows:
<li>Standard: The files are made available in 24 hours.</li>
<li>Bulk: The files are made available in 48 hours.</li>
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

