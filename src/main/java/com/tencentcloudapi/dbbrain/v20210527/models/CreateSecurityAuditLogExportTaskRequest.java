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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSecurityAuditLogExportTaskRequest extends AbstractModel {

    /**
    * Security audit group ID.
    */
    @SerializedName("SecAuditGroupId")
    @Expose
    private String SecAuditGroupId;

    /**
    * Exported log start time, such as 2020-12-28 00:00:00.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Exported log end time, such as 2020-12-28 01:00:00.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Service type. Valid value: `mysql` (TencentDB for MySQL).
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * List of log risk levels. Valid values: `0` (no risk), `1` (low risk), `2` (medium risk), `3` (high risk).
    */
    @SerializedName("DangerLevels")
    @Expose
    private Long [] DangerLevels;

    /**
     * Get Security audit group ID. 
     * @return SecAuditGroupId Security audit group ID.
     */
    public String getSecAuditGroupId() {
        return this.SecAuditGroupId;
    }

    /**
     * Set Security audit group ID.
     * @param SecAuditGroupId Security audit group ID.
     */
    public void setSecAuditGroupId(String SecAuditGroupId) {
        this.SecAuditGroupId = SecAuditGroupId;
    }

    /**
     * Get Exported log start time, such as 2020-12-28 00:00:00. 
     * @return StartTime Exported log start time, such as 2020-12-28 00:00:00.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Exported log start time, such as 2020-12-28 00:00:00.
     * @param StartTime Exported log start time, such as 2020-12-28 00:00:00.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Exported log end time, such as 2020-12-28 01:00:00. 
     * @return EndTime Exported log end time, such as 2020-12-28 01:00:00.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Exported log end time, such as 2020-12-28 01:00:00.
     * @param EndTime Exported log end time, such as 2020-12-28 01:00:00.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Service type. Valid value: `mysql` (TencentDB for MySQL). 
     * @return Product Service type. Valid value: `mysql` (TencentDB for MySQL).
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set Service type. Valid value: `mysql` (TencentDB for MySQL).
     * @param Product Service type. Valid value: `mysql` (TencentDB for MySQL).
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get List of log risk levels. Valid values: `0` (no risk), `1` (low risk), `2` (medium risk), `3` (high risk). 
     * @return DangerLevels List of log risk levels. Valid values: `0` (no risk), `1` (low risk), `2` (medium risk), `3` (high risk).
     */
    public Long [] getDangerLevels() {
        return this.DangerLevels;
    }

    /**
     * Set List of log risk levels. Valid values: `0` (no risk), `1` (low risk), `2` (medium risk), `3` (high risk).
     * @param DangerLevels List of log risk levels. Valid values: `0` (no risk), `1` (low risk), `2` (medium risk), `3` (high risk).
     */
    public void setDangerLevels(Long [] DangerLevels) {
        this.DangerLevels = DangerLevels;
    }

    public CreateSecurityAuditLogExportTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSecurityAuditLogExportTaskRequest(CreateSecurityAuditLogExportTaskRequest source) {
        if (source.SecAuditGroupId != null) {
            this.SecAuditGroupId = new String(source.SecAuditGroupId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.DangerLevels != null) {
            this.DangerLevels = new Long[source.DangerLevels.length];
            for (int i = 0; i < source.DangerLevels.length; i++) {
                this.DangerLevels[i] = new Long(source.DangerLevels[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SecAuditGroupId", this.SecAuditGroupId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamArraySimple(map, prefix + "DangerLevels.", this.DangerLevels);

    }
}

