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

public class WorkflowTrigger extends AbstractModel{

    /**
    * The trigger type. Valid values:
<li>`CosFileUpload`: Tencent Cloud COS trigger.</li>
<li>`AwsS3FileUpload`: AWS S3 trigger. Currently, this type is only supported for transcoding tasks and schemes (not supported for workflows).</li>


    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * This parameter is required and valid when `Type` is `CosFileUpload`, indicating the COS trigger rule.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CosFileUploadTrigger")
    @Expose
    private CosFileUploadTrigger CosFileUploadTrigger;

    /**
    * The AWS S3 trigger. This parameter is valid and required if `Type` is `AwsS3FileUpload`.

Note: Currently, the key for the AWS S3 bucket, the trigger SQS queue, and the callback SQS queue must be the same.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AwsS3FileUploadTrigger")
    @Expose
    private AwsS3FileUploadTrigger AwsS3FileUploadTrigger;

    /**
     * Get The trigger type. Valid values:
<li>`CosFileUpload`: Tencent Cloud COS trigger.</li>
<li>`AwsS3FileUpload`: AWS S3 trigger. Currently, this type is only supported for transcoding tasks and schemes (not supported for workflows).</li>

 
     * @return Type The trigger type. Valid values:
<li>`CosFileUpload`: Tencent Cloud COS trigger.</li>
<li>`AwsS3FileUpload`: AWS S3 trigger. Currently, this type is only supported for transcoding tasks and schemes (not supported for workflows).</li>


     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set The trigger type. Valid values:
<li>`CosFileUpload`: Tencent Cloud COS trigger.</li>
<li>`AwsS3FileUpload`: AWS S3 trigger. Currently, this type is only supported for transcoding tasks and schemes (not supported for workflows).</li>


     * @param Type The trigger type. Valid values:
<li>`CosFileUpload`: Tencent Cloud COS trigger.</li>
<li>`AwsS3FileUpload`: AWS S3 trigger. Currently, this type is only supported for transcoding tasks and schemes (not supported for workflows).</li>


     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get This parameter is required and valid when `Type` is `CosFileUpload`, indicating the COS trigger rule.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CosFileUploadTrigger This parameter is required and valid when `Type` is `CosFileUpload`, indicating the COS trigger rule.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public CosFileUploadTrigger getCosFileUploadTrigger() {
        return this.CosFileUploadTrigger;
    }

    /**
     * Set This parameter is required and valid when `Type` is `CosFileUpload`, indicating the COS trigger rule.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CosFileUploadTrigger This parameter is required and valid when `Type` is `CosFileUpload`, indicating the COS trigger rule.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCosFileUploadTrigger(CosFileUploadTrigger CosFileUploadTrigger) {
        this.CosFileUploadTrigger = CosFileUploadTrigger;
    }

    /**
     * Get The AWS S3 trigger. This parameter is valid and required if `Type` is `AwsS3FileUpload`.

Note: Currently, the key for the AWS S3 bucket, the trigger SQS queue, and the callback SQS queue must be the same.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AwsS3FileUploadTrigger The AWS S3 trigger. This parameter is valid and required if `Type` is `AwsS3FileUpload`.

Note: Currently, the key for the AWS S3 bucket, the trigger SQS queue, and the callback SQS queue must be the same.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public AwsS3FileUploadTrigger getAwsS3FileUploadTrigger() {
        return this.AwsS3FileUploadTrigger;
    }

    /**
     * Set The AWS S3 trigger. This parameter is valid and required if `Type` is `AwsS3FileUpload`.

Note: Currently, the key for the AWS S3 bucket, the trigger SQS queue, and the callback SQS queue must be the same.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AwsS3FileUploadTrigger The AWS S3 trigger. This parameter is valid and required if `Type` is `AwsS3FileUpload`.

Note: Currently, the key for the AWS S3 bucket, the trigger SQS queue, and the callback SQS queue must be the same.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAwsS3FileUploadTrigger(AwsS3FileUploadTrigger AwsS3FileUploadTrigger) {
        this.AwsS3FileUploadTrigger = AwsS3FileUploadTrigger;
    }

    public WorkflowTrigger() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WorkflowTrigger(WorkflowTrigger source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.CosFileUploadTrigger != null) {
            this.CosFileUploadTrigger = new CosFileUploadTrigger(source.CosFileUploadTrigger);
        }
        if (source.AwsS3FileUploadTrigger != null) {
            this.AwsS3FileUploadTrigger = new AwsS3FileUploadTrigger(source.AwsS3FileUploadTrigger);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "CosFileUploadTrigger.", this.CosFileUploadTrigger);
        this.setParamObj(map, prefix + "AwsS3FileUploadTrigger.", this.AwsS3FileUploadTrigger);

    }
}

