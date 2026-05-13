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
package com.tencentcloudapi.cbs.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApplyDiskBackupRequest extends AbstractModel {

    /**
    * Cloud disk backup point ID. can be queried through the [DescribeDiskBackups](https://www.tencentcloud.com/document/product/362/80278?from_cn_redirect=1) api.
    */
    @SerializedName("DiskBackupId")
    @Expose
    private String DiskBackupId;

    /**
    * Original cloud disk ID of the backup point. can be queried through the [DescribeDisks](https://www.tencentcloud.com/document/product/362/16315?from_cn_redirect=1) api.
    */
    @SerializedName("DiskId")
    @Expose
    private String DiskId;

    /**
    * Specifies whether to enable automatic shutdown before rolling back the CBS backup point. defaults to FALSE, which means no automatic shutdown.
    */
    @SerializedName("AutoStopInstance")
    @Expose
    private Boolean AutoStopInstance;

    /**
    * Whether to automatically start after rolling back the cloud disk backup point, default to FALSE, means do not auto boot. the AutoStartInstance parameter can only be set to true when AutoStopInstance is true.
    */
    @SerializedName("AutoStartInstance")
    @Expose
    private Boolean AutoStartInstance;

    /**
     * Get Cloud disk backup point ID. can be queried through the [DescribeDiskBackups](https://www.tencentcloud.com/document/product/362/80278?from_cn_redirect=1) api. 
     * @return DiskBackupId Cloud disk backup point ID. can be queried through the [DescribeDiskBackups](https://www.tencentcloud.com/document/product/362/80278?from_cn_redirect=1) api.
     */
    public String getDiskBackupId() {
        return this.DiskBackupId;
    }

    /**
     * Set Cloud disk backup point ID. can be queried through the [DescribeDiskBackups](https://www.tencentcloud.com/document/product/362/80278?from_cn_redirect=1) api.
     * @param DiskBackupId Cloud disk backup point ID. can be queried through the [DescribeDiskBackups](https://www.tencentcloud.com/document/product/362/80278?from_cn_redirect=1) api.
     */
    public void setDiskBackupId(String DiskBackupId) {
        this.DiskBackupId = DiskBackupId;
    }

    /**
     * Get Original cloud disk ID of the backup point. can be queried through the [DescribeDisks](https://www.tencentcloud.com/document/product/362/16315?from_cn_redirect=1) api. 
     * @return DiskId Original cloud disk ID of the backup point. can be queried through the [DescribeDisks](https://www.tencentcloud.com/document/product/362/16315?from_cn_redirect=1) api.
     */
    public String getDiskId() {
        return this.DiskId;
    }

    /**
     * Set Original cloud disk ID of the backup point. can be queried through the [DescribeDisks](https://www.tencentcloud.com/document/product/362/16315?from_cn_redirect=1) api.
     * @param DiskId Original cloud disk ID of the backup point. can be queried through the [DescribeDisks](https://www.tencentcloud.com/document/product/362/16315?from_cn_redirect=1) api.
     */
    public void setDiskId(String DiskId) {
        this.DiskId = DiskId;
    }

    /**
     * Get Specifies whether to enable automatic shutdown before rolling back the CBS backup point. defaults to FALSE, which means no automatic shutdown. 
     * @return AutoStopInstance Specifies whether to enable automatic shutdown before rolling back the CBS backup point. defaults to FALSE, which means no automatic shutdown.
     */
    public Boolean getAutoStopInstance() {
        return this.AutoStopInstance;
    }

    /**
     * Set Specifies whether to enable automatic shutdown before rolling back the CBS backup point. defaults to FALSE, which means no automatic shutdown.
     * @param AutoStopInstance Specifies whether to enable automatic shutdown before rolling back the CBS backup point. defaults to FALSE, which means no automatic shutdown.
     */
    public void setAutoStopInstance(Boolean AutoStopInstance) {
        this.AutoStopInstance = AutoStopInstance;
    }

    /**
     * Get Whether to automatically start after rolling back the cloud disk backup point, default to FALSE, means do not auto boot. the AutoStartInstance parameter can only be set to true when AutoStopInstance is true. 
     * @return AutoStartInstance Whether to automatically start after rolling back the cloud disk backup point, default to FALSE, means do not auto boot. the AutoStartInstance parameter can only be set to true when AutoStopInstance is true.
     */
    public Boolean getAutoStartInstance() {
        return this.AutoStartInstance;
    }

    /**
     * Set Whether to automatically start after rolling back the cloud disk backup point, default to FALSE, means do not auto boot. the AutoStartInstance parameter can only be set to true when AutoStopInstance is true.
     * @param AutoStartInstance Whether to automatically start after rolling back the cloud disk backup point, default to FALSE, means do not auto boot. the AutoStartInstance parameter can only be set to true when AutoStopInstance is true.
     */
    public void setAutoStartInstance(Boolean AutoStartInstance) {
        this.AutoStartInstance = AutoStartInstance;
    }

    public ApplyDiskBackupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApplyDiskBackupRequest(ApplyDiskBackupRequest source) {
        if (source.DiskBackupId != null) {
            this.DiskBackupId = new String(source.DiskBackupId);
        }
        if (source.DiskId != null) {
            this.DiskId = new String(source.DiskId);
        }
        if (source.AutoStopInstance != null) {
            this.AutoStopInstance = new Boolean(source.AutoStopInstance);
        }
        if (source.AutoStartInstance != null) {
            this.AutoStartInstance = new Boolean(source.AutoStartInstance);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DiskBackupId", this.DiskBackupId);
        this.setParamSimple(map, prefix + "DiskId", this.DiskId);
        this.setParamSimple(map, prefix + "AutoStopInstance", this.AutoStopInstance);
        this.setParamSimple(map, prefix + "AutoStartInstance", this.AutoStartInstance);

    }
}

