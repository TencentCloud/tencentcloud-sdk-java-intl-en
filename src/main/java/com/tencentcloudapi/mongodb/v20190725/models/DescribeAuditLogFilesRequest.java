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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAuditLogFilesRequest extends AbstractModel {

    /**
    * Instance ID, in the format of cmgo-xfts****. It is the same as the instance ID displayed on the TencentDB console page.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Page size. Default value: 20; value ranges from 1 to 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Pagination offset.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Audit log file name. This API filters related audit log files based on this parameter.
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
     * Get Instance ID, in the format of cmgo-xfts****. It is the same as the instance ID displayed on the TencentDB console page. 
     * @return InstanceId Instance ID, in the format of cmgo-xfts****. It is the same as the instance ID displayed on the TencentDB console page.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID, in the format of cmgo-xfts****. It is the same as the instance ID displayed on the TencentDB console page.
     * @param InstanceId Instance ID, in the format of cmgo-xfts****. It is the same as the instance ID displayed on the TencentDB console page.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Page size. Default value: 20; value ranges from 1 to 100. 
     * @return Limit Page size. Default value: 20; value ranges from 1 to 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Page size. Default value: 20; value ranges from 1 to 100.
     * @param Limit Page size. Default value: 20; value ranges from 1 to 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Pagination offset. 
     * @return Offset Pagination offset.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination offset.
     * @param Offset Pagination offset.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Audit log file name. This API filters related audit log files based on this parameter. 
     * @return FileName Audit log file name. This API filters related audit log files based on this parameter.
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set Audit log file name. This API filters related audit log files based on this parameter.
     * @param FileName Audit log file name. This API filters related audit log files based on this parameter.
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    public DescribeAuditLogFilesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAuditLogFilesRequest(DescribeAuditLogFilesRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "FileName", this.FileName);

    }
}

