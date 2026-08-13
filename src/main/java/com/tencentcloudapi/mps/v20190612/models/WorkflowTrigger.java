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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WorkflowTrigger extends AbstractModel {

    /**
    * The trigger type. Valid values:
<li>`CosFileUpload`: Tencent Cloud COS trigger.</li>
<li>`AwsS3FileUpload`: AWS S3 trigger. Currently, this type is only supported for transcoding tasks and schemes (not supported for workflows).</li>


    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Required and valid when Type is CosFileUpload. This is a COS trigger rule.
    */
    @SerializedName("CosFileUploadTrigger")
    @Expose
    private CosFileUploadTrigger CosFileUploadTrigger;

    /**
    * Required and valid when Type is AwsS3FileUpload. This is the AWS S3 trigger rule.

Note: Currently, the keys for AWS S3, the corresponding trigger queue SQS, and the callback queue SQS should be the same.
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
     * Get Required and valid when Type is CosFileUpload. This is a COS trigger rule. 
     * @return CosFileUploadTrigger Required and valid when Type is CosFileUpload. This is a COS trigger rule.
     */
    public CosFileUploadTrigger getCosFileUploadTrigger() {
        return this.CosFileUploadTrigger;
    }

    /**
     * Set Required and valid when Type is CosFileUpload. This is a COS trigger rule.
     * @param CosFileUploadTrigger Required and valid when Type is CosFileUpload. This is a COS trigger rule.
     */
    public void setCosFileUploadTrigger(CosFileUploadTrigger CosFileUploadTrigger) {
        this.CosFileUploadTrigger = CosFileUploadTrigger;
    }

    /**
     * Get Required and valid when Type is AwsS3FileUpload. This is the AWS S3 trigger rule.

Note: Currently, the keys for AWS S3, the corresponding trigger queue SQS, and the callback queue SQS should be the same. 
     * @return AwsS3FileUploadTrigger Required and valid when Type is AwsS3FileUpload. This is the AWS S3 trigger rule.

Note: Currently, the keys for AWS S3, the corresponding trigger queue SQS, and the callback queue SQS should be the same.
     */
    public AwsS3FileUploadTrigger getAwsS3FileUploadTrigger() {
        return this.AwsS3FileUploadTrigger;
    }

    /**
     * Set Required and valid when Type is AwsS3FileUpload. This is the AWS S3 trigger rule.

Note: Currently, the keys for AWS S3, the corresponding trigger queue SQS, and the callback queue SQS should be the same.
     * @param AwsS3FileUploadTrigger Required and valid when Type is AwsS3FileUpload. This is the AWS S3 trigger rule.

Note: Currently, the keys for AWS S3, the corresponding trigger queue SQS, and the callback queue SQS should be the same.
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

