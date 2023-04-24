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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSchedulesRequest extends AbstractModel{

    /**
    * The IDs of the schemes to query. Array length limit: 100.
    */
    @SerializedName("ScheduleIds")
    @Expose
    private Long [] ScheduleIds;

    /**
    * The trigger type. Valid values:
<li>`CosFileUpload`: The scheme is triggered when a file is uploaded to Tencent Cloud Object Storage (COS).</li>
<li>`AwsS3FileUpload`: The scheme is triggered when a file is uploaded to AWS S3.</li>
If you do not specify this parameter or leave it empty, all schemes will be returned regardless of the trigger type.
    */
    @SerializedName("TriggerType")
    @Expose
    private String TriggerType;

    /**
    * The scheme status. Valid values:
<li>`Enabled`</li>
<li>`Disabled`</li>
If you do not specify this parameter, all schemes will be returned regardless of the status.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * The pagination offset. Default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * The maximum number of records to return. Default value: 10. Maximum value: 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get The IDs of the schemes to query. Array length limit: 100. 
     * @return ScheduleIds The IDs of the schemes to query. Array length limit: 100.
     */
    public Long [] getScheduleIds() {
        return this.ScheduleIds;
    }

    /**
     * Set The IDs of the schemes to query. Array length limit: 100.
     * @param ScheduleIds The IDs of the schemes to query. Array length limit: 100.
     */
    public void setScheduleIds(Long [] ScheduleIds) {
        this.ScheduleIds = ScheduleIds;
    }

    /**
     * Get The trigger type. Valid values:
<li>`CosFileUpload`: The scheme is triggered when a file is uploaded to Tencent Cloud Object Storage (COS).</li>
<li>`AwsS3FileUpload`: The scheme is triggered when a file is uploaded to AWS S3.</li>
If you do not specify this parameter or leave it empty, all schemes will be returned regardless of the trigger type. 
     * @return TriggerType The trigger type. Valid values:
<li>`CosFileUpload`: The scheme is triggered when a file is uploaded to Tencent Cloud Object Storage (COS).</li>
<li>`AwsS3FileUpload`: The scheme is triggered when a file is uploaded to AWS S3.</li>
If you do not specify this parameter or leave it empty, all schemes will be returned regardless of the trigger type.
     */
    public String getTriggerType() {
        return this.TriggerType;
    }

    /**
     * Set The trigger type. Valid values:
<li>`CosFileUpload`: The scheme is triggered when a file is uploaded to Tencent Cloud Object Storage (COS).</li>
<li>`AwsS3FileUpload`: The scheme is triggered when a file is uploaded to AWS S3.</li>
If you do not specify this parameter or leave it empty, all schemes will be returned regardless of the trigger type.
     * @param TriggerType The trigger type. Valid values:
<li>`CosFileUpload`: The scheme is triggered when a file is uploaded to Tencent Cloud Object Storage (COS).</li>
<li>`AwsS3FileUpload`: The scheme is triggered when a file is uploaded to AWS S3.</li>
If you do not specify this parameter or leave it empty, all schemes will be returned regardless of the trigger type.
     */
    public void setTriggerType(String TriggerType) {
        this.TriggerType = TriggerType;
    }

    /**
     * Get The scheme status. Valid values:
<li>`Enabled`</li>
<li>`Disabled`</li>
If you do not specify this parameter, all schemes will be returned regardless of the status. 
     * @return Status The scheme status. Valid values:
<li>`Enabled`</li>
<li>`Disabled`</li>
If you do not specify this parameter, all schemes will be returned regardless of the status.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set The scheme status. Valid values:
<li>`Enabled`</li>
<li>`Disabled`</li>
If you do not specify this parameter, all schemes will be returned regardless of the status.
     * @param Status The scheme status. Valid values:
<li>`Enabled`</li>
<li>`Disabled`</li>
If you do not specify this parameter, all schemes will be returned regardless of the status.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get The pagination offset. Default value: 0. 
     * @return Offset The pagination offset. Default value: 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set The pagination offset. Default value: 0.
     * @param Offset The pagination offset. Default value: 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get The maximum number of records to return. Default value: 10. Maximum value: 100. 
     * @return Limit The maximum number of records to return. Default value: 10. Maximum value: 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set The maximum number of records to return. Default value: 10. Maximum value: 100.
     * @param Limit The maximum number of records to return. Default value: 10. Maximum value: 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeSchedulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSchedulesRequest(DescribeSchedulesRequest source) {
        if (source.ScheduleIds != null) {
            this.ScheduleIds = new Long[source.ScheduleIds.length];
            for (int i = 0; i < source.ScheduleIds.length; i++) {
                this.ScheduleIds[i] = new Long(source.ScheduleIds[i]);
            }
        }
        if (source.TriggerType != null) {
            this.TriggerType = new String(source.TriggerType);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
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
        this.setParamArraySimple(map, prefix + "ScheduleIds.", this.ScheduleIds);
        this.setParamSimple(map, prefix + "TriggerType", this.TriggerType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

